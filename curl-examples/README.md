WCI Terminology Service in 5 minutes: Curl Tutorial
===================================================

This tutorial shows how to use raw cURL commands to access content from the WCI Terminology API.
All the operations described here perform a GET request.

[Curl Tutorial Training Video](https://youtu.be/SWVRyo9Zjio)

Prerequisites
-------------
* curl must be installed ([Download cURL](https://curl.haxx.se/dlwiz/))
* jq must be installed ([Download jq](https://stedolan.github.io/jq/download/))

An $API_URL environment variable must be set before starting as the sample curl calls below as they expect it.

When using an API_URL that points to an instance that requires authentication
(such as https://termserver.westcoastinformatics.com), the login call must first be used to obtain an access token.

If running against a local server with authentication disabled, use "guest" as the access token value
and skip the login call.  See [Login](#login) for more details regarding reference deployments.

Sample cURL Calls
-----------------

The following examples can be types into the command line of any terminal that has cURL and jq installed.

- [Login](#login)
- [Get terminologies](#get-terminologies)
- [Get concept by code](#get-concept-by-code)
- [Get concept relationships by code](#get-concept-relationships-by-code)
- [Find concepts by search term (use paging to get only first 5 results)](#find-concepts-by-search-term)
- [Find concepts by search term and expression](#find-concepts-by-search-term-and-expression)
- [Get concept subtree](#get-concept-subtree)


### Login 

Depending on the environment, it will be important to configure a login token for subsequent calls.

For testing against "https://termserver.westcoastinformatics.com", request a 30-day token from info@westcoastinformatics.com and set the "token" variable to that value.

```
token=<value provided by info@westcoastinformatics.com>
```

For testing against "https://snomed.westcoastinformatics.com", set the "token" variable to the value "guest".

```
token=guest
```

For testing against a local install that is using embedded username/password auth, 
use the API to login.  For examploe,

```
cat > /tmp/data.txt << EOF
{ "grant_type": "username_password", "username": "$username", "password": "$password"}
EOF
token=`curl -X POST "$API_URL/auth/token" -d "@/tmp/data.txt" -H "Content-type: application/json" | jq '.access_token' | sed 's/"//g'`
```

NOTE: if $token is null at this point, authentication was not successful.

See sample payload data from this call in [`samples/login.txt`](samples/login.txt)

[Back to Top](#wci-terminology-service-in-5-minutes-curl-tutorial)

### Get terminologies

Return all loaded terminologies currently hosted by the API.

```
curl -H "Authorization: Bearer $token" "$API_URL/terminology" | jq '.'
```

See sample payload data from this call in [`samples/get-terminologies.txt`](samples/get-terminologies.txt)

[Back to Top](#wci-terminology-service-in-5-minutes-curl-tutorial)

### Get concept by code

Look up concept information for a given terminology and code.

```
curl -H "Authorization: Bearer $token" "$API_URL/terminology/concept/SNOMEDCT_US/80891009" | jq '.'
```

See sample payload data from this call in [`samples/get-concept-by-code.txt`](samples/get-concept-by-code.txt)

[Back to Top](#wci-terminology-service-in-5-minutes-curl-tutorial)

### Get concept relationships by code

Get concept relationships for a terminology and code. In this environment, relationships
are represented bidirectionally, so this call will get relationships pointing "from"
this concept as well as (inversed) relationships pointing "to" this concept.

```
curl -H "Authorization: Bearer $token" "$API_URL/terminology/concept/SNOMEDCT_US/80891009/relationships" | jq '.'
```

See sample payload data from this call in [`samples/get-concept-by-code-summary.txt`](samples/get-concept-by-code-more.txt)

[Back to Top](#wci-terminology-service-in-5-minutes-curl-tutorial)

### Find concepts by search term

Find concepts matching a search term within a specified terminology. This 
example uses paging to get only the first 5 results and a resolver that
gets only minimum amount of data.

```
curl -H "Authorization: Bearer $token" "$API_URL/terminology/concept/SNOMEDCT_US?query=melanoma&limit=5&resolver=MIN" | jq '.'
```

See sample payload data from this call in [`samples/find-concepts-by-search-term.txt`](samples/find-concepts-by-search-term.txt)

[Back to Top](#wci-terminology-service-in-5-minutes-curl-tutorial)

### Find concepts by search term and expression

Find concepts matching a search term within a specified terminology and constrain
the search results by an expression. This example uses paging to get only the first 
5 results and a resolver that gets only minimum amount of data.

NOTE: the expression we are using is <<363346000 (descendants-or-self of the "Malignant
neoplastic disease" concept in SNOMED).  To work properly, the expression value has to
be url encoded (See https://www.urlencoder.org/ for an online URL encoder):

```
curl -H "Authorization: Bearer $token" "$API_URL/terminology/concept/SNOMEDCT_US?query=melanoma&expression=%3C%3C363346000&limit=5&resolver=MIN" | jq '.'
```

See sample payload data from this call in [`samples/find-concepts-by-search-term-expr.txt`](samples/find-concepts-by-search-term-expr.txt)

[Back to Top](#wci-terminology-service-in-5-minutes-curl-tutorial)

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

[Back to Top](#wci-terminology-service-in-5-minutes-curl-tutorial)
