<a name="top" />

WCI Terminology Service in 5 minutes: Curl Tutorial
===================================================

This tutorial shows how to use raw cURL commands to access content from the WCI Terminology API.

Prerequisites
* curl must be installled ([Download cURL](https://curl.haxx.se/dlwiz/))
* jq must be installed ([Download jq](https://stedolan.github.io/jq/download/))

The Browser as a terminology server
------------------------------------

The base API url for the WCI Terminology Service is: 

`export API_URL=https://wci.terminology.tools`

Run this command before the sample curl calls below as they expect $API_URL to be set.

All the operations described here perform a GET request.

The full documentation of the WCI Terminology Service can be found here: https://wci-wiki.atlassian.net/wiki/spaces/TSV2/overview


Sample cURL Calls
-----------------

The following examples can be types into the command line of any terminal that has cURL and jq installed.  NOTE: the login step must be performed before the other calls will
work.

- [Login with UTS Account](#login-uts)
- [Get terminologies](#get-terminologies)
- [Get concept by code](#get-concept-by-code)
- [Get concept relationships by code](#get-concept-relationships)
- [Find concepts by search term (use paging to get only first 5 results)](#find-concepts)
- [Get concept subtree](#get-subtree)

<a name="login-uts"/>

### Login with UTS Account

Logs in to the API using a UTS account username and password, acquire a token.

```
cat > /tmp/data.txt << EOF
{ "grant_type": "username_password", "username": "$username", "password": "$password"}
EOF
token=`curl -X POST "$API_URL/auth/token" -d "@/tmp/data.txt" -H "Content-type: application/json" | jq '.access_token' | sed 's/"//g'`
```

See sample payload data from this call in [`samples/login.txt`](samples/login.txt)

[Back to Top](#top)

<a name="get-terminologies"/>

### Get terminologies

Return all loaded terminologies currently hosted by the API.

```
curl -H "Authorization: Bearer $token" "$API_URL/terminology" | jq '.'
```

See sample payload data from this call in [`samples/get-terminologies.txt`](samples/get-terminologies.txt)

[Back to Top](#top)

<a name="get-concept-by-code"/>

### Get concept by code

Look up concept information for a given terminology and code.

```
curl -H "Authorization: Bearer $token" "$API_URL/terminology/concept/SNOMEDCT_US/80891009" | jq '.'
```

See sample payload data from this call in [`samples/get-concept-by-code.txt`](samples/get-concept-by-code.txt)

[Back to Top](#top)

<a name="get-concept-relationships"/>

### Get concept relationships by code

Get concept relationships for a terminology and code. In this environment, relationships
are represented bidirectionally, so this call will get relationships pointing "from"
this concept as well as (inversed) relationships pointing "to" this concept.

```
curl -H "Authorization: Bearer $token" "$API_URL/terminology/concept/SNOMEDCT_US/80891009/relationships" | jq '.'
```

See sample payload data from this call in [`samples/get-concept-by-code-summary.txt`](samples/get-concept-by-code-more.txt)

[Back to Top](#top)

<a name="find-concepts"/>

### Find concepts by search term

Find concepts matching a search term within a specified terminology. This 
example uses paging to get only the first 5 results and a resolver that
gets only minimum amount of data.

```
curl -H "Authorization: Bearer $token" "$API_URL/terminology/concept/SNOMEDCT_US?query=melanoma&limit=5&resolver=MIN" | jq '.'
```

See sample payload data from this call in [`samples/find-concepts-by-search-term.txt`](samples/find-concepts-by-search-term.txt)

[Back to Top](#top)

<a name="get-subtree"/>

### Get concept subtree

Get a subtree for a concept code to a maximum level of depth (default = 0).
This is a way to see all of the concepts underneath a particular node.
Be careful using this with large terminologies because when huge numbers of
concepts are involved, performance can be slow and response payloads can be very
large.

```
curl -H "Authorization: Bearer $token" "$API_URL/terminology/concept/ICD10CM/M01/subtree?maxLevel=3" | jq '.'
```

See sample payload data from this call in [`samples/get-subtree.txt`](samples/get-subtree.txt)

[Back to Top](#top)

