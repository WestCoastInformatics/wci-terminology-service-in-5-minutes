<a name="top"/>

WCI Terminology Service in 5 minutes: bash Tutorial
===================================================

This tutorial shows how to use bash scripts to access NCI Thesaurus content from the EVSRESTAPI.

Prerequisites
* bash must be installed
* curl must be installed ([Download cURL](https://curl.haxx.se/dlwiz/))
* jq must be installed ([Download jq](https://stedolan.github.io/jq/download/))


Test Scripts
------------
- [get-terminologies.sh](#get-terminologies-sh)
- [get-concept.sh](#get-concept-sh)
- [find-concepts.sh](#find-concepts-sh)

The following examples can be typed into the command line of any terminal that has bash, cURL and jq installed.  Run each script with no parameters for examples of how to call each one.

<a name="get-terminologies-sh"/>

### get-terminologies.sh

Return all loaded terminologies currently hosted by the API:

```
TBD
```

[Back to Top](#top)

<a name="get-concept-sh"/>

### get-concept.sh

Return concept information for a given terminology and code.  The "resolver" parameter
can be used to specify the amount of information you want back.  Try with "CODING" and
"ATOM"

```
TBD
```

[Back to Top](#top)

<a name="find-concepts-sh"/>

### find-concepts.sh

Used to perform text searches to find matching concepts. In its simplest form the
script will perform a simple "contains" text search for concepts within the specified
terminology.  Use the --include parameter to control how much information to get back,
use the --type to change the nature of the search, and use --fromRecord and --pageSize
to control which records to return. 

```
TBD
```

[Back to Top](#top)

