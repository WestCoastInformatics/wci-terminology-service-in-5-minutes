 EVSRESTAPI in 5 minutes: CURL Tutorial
======================================

This tutorial shows how to use raw cURL commands to access NCI Thesaurus content from the EVSRESTAPI.

If you don' have CURL in your system check the official [cURL site](https://curl.haxx.se/dlwiz/) or use any alternative.

The responses from the web service are in [JSON](http://www.json.org/) format, that you can save into a file and explore. For these examples, we use in line [python](https://www.python.org/) scripts to parse and extract meaningful information from the response.

The Browser as a terminology server
------------------------------------

The base url for the EVSRESTAPI is:

<http://ncias-d2174-c.nci.nih.gov:8080/api/v1/>

This is the base URL, all the content calls we will perform will construct adding more values after that

All the operations described here will perform a GET request.

The full documentation of the REST API can be consulted in the Sawgger documentation at http://ncias-d2174-c.nci.nih.gov:8080/swagger-ui.html

Sample cURL Calls
-----------------

The following examples can be types into the command line of any terminal that has cURL and python configured. It should work by without requiring any installation in Unix/Linx/BSD and Apple OS X systems.

### Searching for a term

Searching by term for "melanoma":

```
curl --silent "http://ncias-d2174-c.nci.nih.gov:8080/api/v1/search?term=melanoma&format=clean" | python -c "import json,sys;obj=json.load(sys.stdin);print obj['total'];"
```

This command will obtain a json response from the server, parse it, and display the number of concepts that match with our search query.

**Output**: `1456`

Same API call, but now we display the first match code and name:

```
curl --silent "http://ncias-d2174-c.nci.nih.gov:8080/api/v1/search?term=melanoma&format=clean" | python -c "import json,sys;obj=json.load(sys.stdin);print obj['hits'][0]['Code'],obj['hits'][0]['Label'];"
```

**Output**: `C3224 Melanoma`

### Get a concept by code

Get concept for code C3224:

```
curl --silent "http://ncias-d2174-c.nci.nih.gov:8080/api/v1/concept/C3224" | python -c "import json,sys;obj=json.load(sys.stdin);print obj['Code'],obj['Label'];"
```

This command will obtain a json response from the server, parse it, and display the "Code" and "Label" fields.

**Output**: `C3224 Melanoma`


### Get children of a concept by code

Find child concepts for code C3224:

```
curl --silent "http://ncias-d2174-c.nci.nih.gov:8080/api/v1/concept/C3224/allChildNodes" | python -c "import json,sys;obj=json.load(sys.stdin);print len(obj)"
```

This command will obtain a json response from the server, parse it, and print the number of child concepts.

**Output**: `207`

### Next Steps

```
### Get path to root for code

curl --silent "http://ncias-d2174-c.nci.nih.gov:8080/api/v1/concept/C3224/pathInHierarchy"

curl --silent "http://ncias-d2174-c.nci.nih.gov:8080/api/v1/concept/C3224/pathToRoot"

curl --silent "http://ncias-d2174-c.nci.nih.gov:8080/api/v1/concept/C3224/pathToParent/C2991"
curl --silent "http://ncias-d2174-c.nci.nih.gov:8080/api/v1/concept/C2991/pathToParent/C3262"

curl --silent "http://ncias-d2174-c.nci.nih.gov:8080/api/v1/documentation/associationsList"

### Get relationships for a code
### Get details for a list of concepts
### Get a list of concepts from comma-separated list of ids
### Get root nodes
### Get metadata assocations, properties, roles

