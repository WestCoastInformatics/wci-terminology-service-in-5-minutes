EVSRESTAPI CT in 5 minutes: bash Tutorial
=========================================

This tutorial shows how to use bash scripts to access NCI Thesaurus content from the EVSRESTAPI.

Prerequisites
* curl must be installled ([cURL site](https://curl.haxx.se/dlwiz/))
* python must be installed ([python](https://www.python.org/))


Test Scripts
------------

The following examples can be typed into the command line of any terminal that has cURL and python configured.

### term-search.sh

Searching for "melanoma":

```
./term-search.sh "melanoma"
```

This command produces a log that includes the json response from the server.

**Output**: 

```
-----------------------------------------------------
Starting ...Wed Nov 20 14:11:01 EST 2019
-----------------------------------------------------
  Performing search for 'melanoma' - http://ncias-d2174-c.nci.nih.gov:8080/api/v1

{
  "from" : 0,
  "size" : 10,
  "total" : 1456,
  "hits" : [ {
    "Code" : "C3224",
    "Label" : "Melanoma",
    "Semantic_Type" : [ "Neoplastic Process" ],
    ...
      "relationship" : "Disease_May_Have_Finding",
      "relationshipCode" : "R115",
      "relatedConceptCode" : "C40993",
      "relatedConceptLabel" : "S-100-Positive Neoplastic Cells Present"
    } ]
  } ]
}
-----------------------------------------------------
Finished ..Wed Nov 20 14:11:02 EST 2019
-----------------------------------------------------
```

### get-concept.sh

Searching for "melanoma":

```
./get-concept.sh "C3224"
```

This command produces a log that includes the json response from the server.

**Output**: 



