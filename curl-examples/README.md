<a name="top" />

WCI Terminology Service in 5 minutes: Curl Tutorial
===================================================

This tutorial shows how to use raw cURL commands to access content from the WCI Terminology Service.

Prerequisites
* curl must be installled ([Download cURL](https://curl.haxx.se/dlwiz/))
* jq must be installed ([Download jq](https://stedolan.github.io/jq/download/))

The Browser as a terminology server
------------------------------------

The base API url for the WCI Terminology Service is: 

`export API_URL=https://wci.terminology.tools

Run this command before the sample curl calls below as they expect $API_URL to be set.

All the operations described here perform a GET request.

The full documentation of the WCI Terminology Service can be found here: https://wci-wiki.atlassian.net/wiki/spaces/TSV2/overview


Sample cURL Calls
-----------------

The following examples can be types into the command line of any terminal that has cURL and jq installed.

- [Get terminologies](#get-terminologies)
- [Get concept by code (minimum information)](#get-concept-by-code)
- [Get concept by code (more information)](#get-concept-by-code-summary)
- [Find concepts by search term (use paging to get only first 5 results)](#find-concepts)

<a name="get-terminologies"/>

### Get terminologies

Return all loaded terminologies currently hosted by the API.

```
curl "$API_URL/metadata/terminologies" | jq '.'
```

See sample payload data from this call in [`samples/get-terminologies.txt`](samples/get-terminologies.txt)

[Back to Top](#top)

<a name="get-concept-by-code"/>

### Get concept by code (minimal information)

Return minimal concept information for a given terminology and code.

```
curl "$API_URL/concept/SNOMEDCT_US/2092003?resolver=MINIMAL" | jq '.'
```

See sample payload data from this call in [`samples/get-concept-by-code-minimum.txt`](samples/get-concept-by-code-minimum.txt)

[Back to Top](#top)

<a name="get-concept-summary"/>

### Get concept by code (more information)

Return more concept information for a given terminology and code, use ATOM as the
resolver parameter.

```
curl "$API_URL/concept/SNOMEDCT_US/2092003?resolver=ATOM" | jq '.'
```

See sample payload data from this call in [`samples/get-concept-by-code-summary.txt`](samples/get-concept-by-code-more.txt)

[Back to Top](#top)

<a name="find-concepts"/>

### Find concepts by search term

Find concepts matching a search term within a specified terminology. This 
example uses paging to get only the first 5 results.

```
curl "$API_URL/concept/SNOMEDCT_US?query=melanoma&limit=5" | jq '.'
```

See sample payload data from this call in [`samples/find-concepts-by-search-term.txt`](samples/find-concepts-by-search-term.txt)

[Back to Top](#top)

