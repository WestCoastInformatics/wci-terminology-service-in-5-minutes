#!/bin/bash
#
# Script to call WCI terminology service to perform term searches to find concept codes.
#
while [[ "$#" -gt 0 ]]; do case $1 in
  --resolver) resolver="$2"; shift;;
  --offset) offset="$2"; shift;;
  --limit) limit="$2"; shift;;
  *) arr=( "${arr[@]}" "$1" );;
esac; shift; done

if [ ${#arr[@]} -ne 2 ]; then
  echo "Usage: $0 <terminology> <query> [--resolver <resolver>] "
  echo "          [--offset #] [--limit #]"
  echo "  e.g. $0 SNOMEDCT_US "'"'"malignant melanoma"'"'
  echo "  e.g. $0 SNOMEDCT_US "'"'"malignant melanoma"'"'" --limit 5"
  echo "  e.g. $0 SNOMEDCT_US "'"'"malignant melanoma"'"'" --resolver ATOM"
  exit 1
fi

terminology=${arr[0]}
query=${arr[1]}

# import URL into environment from config
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null 2>&1 && pwd )"
. $DIR/url.env

echo "-----------------------------------------------------"
echo "Starting ...$(/bin/date)"
echo "-----------------------------------------------------"
echo "url = $url"
echo "terminology = $terminology"
echo "query = $query"
echo "resolver = $resolver"
echo ""

# Default resolver
if [[ -z $resolver ]]; then
  resolver=MINIMAL
fi
if [[ -z $offset ]]; then
  offset=0
fi
if [[ -z $limit ]]; then
  limit=10
fi
# GET call
echo "  Find concept for $terminology $query:"
curl -v -w "\n%{http_code}" -G "$url/concept/$terminology" --data-urlencode "query=$query" --data-urlencode "offset=$offset" --data-urlencode "limit=$limit" --data-urlencode "resolver=$resolver" --data-urlencode "type=$type" 2> /dev/null > /tmp/x.$$
if [ $? -ne 0 ]; then
  echo "ERROR: GET $url/concept/$terminology?query=$query failed"
  exit 1
fi

# check status
status=`tail -1 /tmp/x.$$`
if [ $status -ne 200 ]; then
  perl -pe 's/200$//' /tmp/x.$$ | jq '.' | sed 's/^/    /'
  echo "ERROR: GET $url/concept/$terminology?query=$query returned $status, expected 200"
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
