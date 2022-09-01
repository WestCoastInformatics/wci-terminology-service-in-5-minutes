#!/bin/bash
#
# Script to call WCI Terminology Service to perform a concept code lookup.
# NOTE: the token might be optional for endpoints without authentication.
#
while [[ "$#" -gt 0 ]]; do case $1 in
  --token) token="$2"; shift;;
  --level) level="$2"; shift;;
  *) arr=( "${arr[@]}" "$1" );;
esac; shift; done

if [ ${#arr[@]} -ne 2 ]; then
  echo "Usage: $0 <terminology> <code> [--token token] [--level level]"
  echo "  e.g. $0 SNOMEDCT_US 80891009 --token \$token --level 2"
  echo "  e.g. $0 ICD10CM A01 --token \$token --level 3"
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
echo "level = $level"
echo ""

if [[ -z $level ]]; then
    level=0;
fi

# GET call
echo "  Get concept for $terminology $code:"
curl -v -w "\n%{http_code}" -G "$url/terminology/concept/$terminology/$code/subtree" --data-urlencode "maxLevel=$level" -H "Authorization: Bearer $token"  2> /dev/null > /tmp/x.$$

if [ $? -ne 0 ]; then
  cat /tmp/x.$$
  echo "ERROR: GET call failed"
  exit 1
fi

# check status
status=`tail -1 /tmp/x.$$`
if [ $status -ne 200 ]; then
  cat /tmp/x.$$ | sed 's/^/    /'
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
