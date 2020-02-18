#!/bin/bash
#
# Script to call WCI Terminology Service to perform a concept code lookup.
#
while [[ "$#" -gt 0 ]]; do case $1 in
  --resolver) resolver="$2"; shift;;
  *) arr=( "${arr[@]}" "$1" );;
esac; shift; done

if [ ${#arr[@]} -ne 2 ]; then
  echo "Usage: $0 <terminology> <code>[,<code>] [--resolver <resolver>]"
  echo "  e.g. $0 SNOMEDCT_US 2092003"
  echo "  e.g. $0 SNOMEDCT_US 2092003 --resolver ATOM"
  exit 1
fi

terminology=${arr[0]}
code=${arr[1]}

# import URL into environment from config
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null 2>&1 && pwd )"
. $DIR/url.env

echo "-----------------------------------------------------"
echo "Starting ...$(/bin/date)"
echo "-----------------------------------------------------"
echo "url = $url"
echo "terminology = $terminology"
echo "code = $code"
echo "resolver = $resolver"
echo ""

# Default resolver
if [ "x$resolver" == "x" ]; then
  resolver=ATOM
fi

# GET call
echo "  Get role for $terminology $code:"
curl -v -w "\n%{http_code}" -G "$url/concept/$terminology/$code" --data-urlencode "resolver=$resolver" 2> /dev/null > /tmp/x.$$

if [ $? -ne 0 ]; then
  cat /tmp/x.$$
  echo "ERROR: GET call failed"
  exit 1
fi

# check status
status=`tail -1 /tmp/x.$$`
if [ $status -ne 200 ]; then
  perl -pe 's/200$//' /tmp/x.$$ | jq '.' | sed 's/^/    /'
  echo "ERROR: GET returned $status, expected 200"
  exit 1
fi

# write output
echo ""
perl -pe 's/200$//' /tmp/x.$$ | jq '.' | sed 's/^/    /'
echo ""

# ---------------------------------------------------------
# Cleanup
#
/bin/rm -f /tmp/x.$$

echo "-----------------------------------------------------"
echo "Finished ...`/bin/date`"
echo "-----------------------------------------------------"
