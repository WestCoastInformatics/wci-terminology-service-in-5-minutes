<a name="top"/>

WCI Terminology Service in 5 minutes: bash Tutorial
===================================================

This tutorial shows how to use bash scripts to access content from the WCI Terminology API.

Prerequisites
* bash must be installed
* curl must be installed ([Download cURL](https://curl.haxx.se/dlwiz/))
* jq must be installed ([Download jq](https://stedolan.github.io/jq/download/))


Test Scripts
------------
- [login.sh](#login-sh)
- [get-terminologies.sh](#get-terminologies-sh)
- [get-concept.sh](#get-concept-sh)
- [get-concept.sh](#get-concept-sh)
- [find-concepts.sh](#find-concepts-sh)

The following examples can be typed into the command line of any terminal that has bash, cURL and jq installed.  Run each script with no parameters for examples of how to call each one.

<a name="login-sh"/>

### login.sh

Login to a WCI terminology server instance via username and password.
When finished, copy/past the "token=..." to set a local variable that
can be easily used for further calls.

```
$ ./login.sh username "password"
-----------------------------------------------------
Starting ...Thu, Feb 27, 2020  3:45:27 PM
-----------------------------------------------------
url = https://wci.terminology.tools
username = username
password = ************

  token=eyJ0eX...6lKzWG0

-----------------------------------------------------
Finished ...Thu, Feb 27, 2020  3:45:27 PM
-----------------------------------------------------
```

[Back to Top](#top)

<a name="get-terminologies-sh"/>

### get-terminologies.sh

Return all loaded terminologies currently hosted by the API.

```
$ ./get-terminologies.sh --token $token
-----------------------------------------------------
Starting ...Thu, Feb 27, 2020  3:47:56 PM
-----------------------------------------------------
url = https://wci.terminology.tools

  Performing terminologies lookup
    count = 5

    [
      {
        "id": "e439d62b-1b71-4955-827e-365301661813",
        "modified": "2020-02-27T02:28:32.034Z",
        "created": "2019-01-01T00:00:00.000Z",
        "modifiedBy": "admin",
        "local": false,
        "active": true,
        "abbreviation": "ICD10CM",
        "name": "International Classification of Diseases, 10th Edition, Clinical Modification, 2020",
        "version": "2020",
        "systemUri": "http://hl7.org/fhir/sid/icd-10-cm",
        "systemOid": "2.16.840.1.113883.6.90",
        "expressionEnabled": true,
        "attributes": {
          "tree-positions": "true"
        }
      },
   ...
      {
        "id": "a3c4e858-6f75-4c14-a25c-cd824c325caa",
        "modified": "2020-02-27T02:27:32.158Z",
        "created": "2019-01-01T00:00:00.000Z",
        "modifiedBy": "admin",
        "local": false,
        "active": true,
        "abbreviation": "SNOMEDCT_US",
        "name": "US Edition of SNOMED CT, 2019_09_01",
        "version": "2019_09_01",
        "expressionEnabled": true,
        "attributes": {
          "tree-positions": "true"
        }
      }
    ]

-----------------------------------------------------
Finished ...Thu, Feb 27, 2020  3:47:56 PM
-----------------------------------------------------
```

[Back to Top](#top)

<a name="get-concept-sh"/>

### get-concept.sh

Return summary concept information for a given terminology and code.  The following
example gets the 80891009 | Heart structure | concept in SNOMEDCT_US.

```
$ ./get-concept.sh SNOMEDCT_US 80891009 --token $token
-----------------------------------------------------
Starting ...Thu, Feb 27, 2020  3:49:45 PM
-----------------------------------------------------
url = https://wci.terminology.tools
terminology = SNOMEDCT_US
code = 80891009

  Get concept for SNOMEDCT_US 80891009:

    {
      "id": "51806948-9b2f-4c34-81a8-c70d298cfcac",
      "modified": "2020-02-27T02:32:19.291Z",
      "created": "2019-01-01T00:00:00.000Z",
      "modifiedBy": "admin",
      "local": false,
      "active": true,
      "name": "Heart structure",
      "code": "80891009",
      "terminology": "SNOMEDCT_US",
      "sufficientlyDefined": false,
      "anonymous": false,
      "attributes": {
        "DEFINITION_STATUS_ID": "900000000000074008",
        "ACTIVE": "1",
        "CUI": "C0018787",
        "SCG": "<<< 409708007 | Heart and/or pericardium structure | + 27832009 | Structure of thoracic viscus | :  has_entire_anatomy_structure = 302509004 | Entire heart |,  has_part_anatomy_structure = 119202000 | Heart part |",
        "EFFECTIVE_TIME": "20020131"
      },
      "semanticTypes": [
        "Body Part, Organ, or Organ Component",
        "body structure"
      ],
      "atoms": [
        {
          "id": "a3c02304-2e33-45bf-aca5-95dca98b6df2",
          "modified": "2019-01-01T00:00:00.000Z",
          "created": "2019-01-01T00:00:00.000Z",
          "modifiedBy": "loader",
          "local": false,
          "active": true,
          "name": "Heart structure (body structure)",
          "terminology": "SNOMEDCT_US",
          "terminologyId": "A3488292",
          "codeId": "80891009",
          "conceptId": "80891009",
          "caseSensitive": false,
          "orderSensitive": false,
          "punctuationSensitive": false,
          "localeMap": {
            "en": false
          },
          "termType": "FN",
          "attributes": {
            "TYPE_ID": "900000000000003001",
            "CASE_SIGNIFICANCE_ID": "900000000000448009"
          }
        }, 
    ...
      ]
    }

-----------------------------------------------------
Finished ...Thu, Feb 27, 2020  3:49:46 PM
-----------------------------------------------------
```

[Back to Top](#top)

<a name="get-concept-relationships-sh"/>

### get-concept-relationships.sh

Return concept relationship information for a given terminology and code. The 
following example finds relationships for the 80891009 | Heart structure | concept in 
SNOMEDCT_US.  It limits the results to 5 entries and sorts by the "additionalType"
field.

```
$ ./get-concept-relationships.sh SNOMEDCT_US 80891009 --token $token --limit 5 --sort additionalType
-----------------------------------------------------
Starting ...Thu, Feb 27, 2020  3:51:52 PM
-----------------------------------------------------
url = https://wci.terminology.tools
terminology = SNOMEDCT_US
code = 80891009

  Get concept for SNOMEDCT_US 80891009:

    {
      "total": 1207,
      "limit": 0,
      "offset": 0,
      "items": [
        {
          "id": "fd2b17bc-21c0-4dd9-ab80-9b8a0589a318",
          "modified": "2019-01-01T00:00:00.000Z",
          "created": "2019-01-01T00:00:00.000Z",
          "modifiedBy": "loader",
          "local": false,
          "active": true,
          "terminology": "SNOMEDCT_US",
          "terminologyId": "R28970370",
          "type": "RO",
          "additionalType": "specimen_source_topography_of",
          "hierarchical": false,
          "assertedDirection": false,
          "defining": true,
          "toCode": "116157005",
          "toName": "Heart cytologic material",
          "toId": "339b9eb1-a2ad-4dcc-bade-69ab4193503c"
        },...
      ]
    }

-----------------------------------------------------
Finished ...Thu, Feb 27, 2020  3:51:52 PM
-----------------------------------------------------
```

[Back to Top](#top)

<a name="find-concepts-sh"/>

### find-concepts.sh

Used to perform text searches to find matching concepts. The following example
performs a text search for "malignant melanoma" and limits search results to 5
entries.  When not specified the "MIN" resolver is used, which returns only
first-class attributes of the concept object.  Use "--resolver DEFAULT" for
summary concept information about each result.

```
$ ./find-concepts.sh SNOMEDCT_US "malignant melanoma" --token $token --limit 5
-----------------------------------------------------
Starting ...Thu, Feb 27, 2020  3:54:32 PM
-----------------------------------------------------
url = https://wci.terminology.tools
terminology = SNOMEDCT_US
query = malignant melanoma
resolver =

  Find concept for SNOMEDCT_US malignant melanoma:

    {
      "total": 394,
      "limit": 5,
      "offset": 0,
      "items": [
        {
          "id": "dfb307b2-2224-41e8-b1fd-1b249ae87dcb",
          "modified": "2019-01-01T00:00:00.000Z",
          "created": "2019-01-01T00:00:00.000Z",
          "modifiedBy": "loader",
          "local": false,
          "active": true,
          "name": "Malignant melanoma",
          "code": "2092003",
          "terminology": "SNOMEDCT_US",
          "sufficientlyDefined": false,
          "anonymous": false
        },
        {
          "id": "e0c14124-2d0f-4116-a486-fe75d16177df",
          "modified": "2019-01-01T00:00:00.000Z",
          "created": "2019-01-01T00:00:00.000Z",
          "modifiedBy": "loader",
          "local": false,
          "active": true,
          "name": "Malignant melanoma",
          "code": "372244006",
          "terminology": "SNOMEDCT_US",
          "sufficientlyDefined": true,
          "anonymous": false
        },
        {
          "id": "a5dfb75c-7512-41ca-9af1-69b18653f598",
          "modified": "2019-01-01T00:00:00.000Z",
          "created": "2019-01-01T00:00:00.000Z",
          "modifiedBy": "loader",
          "local": false,
          "active": false,
          "name": "Melanoma: [skin] or [malignant]",
          "code": "154501005",
          "terminology": "SNOMEDCT_US",
          "sufficientlyDefined": false,
          "anonymous": false
        },
        {
          "id": "4bcd0c14-5fb5-4c1f-b7f8-a4956e2f1fa1",
          "modified": "2019-01-01T00:00:00.000Z",
          "created": "2019-01-01T00:00:00.000Z",
          "modifiedBy": "loader",
          "local": false,
          "active": false,
          "name": "Melanoma: [skin] or [malignant]",
          "code": "269577007",
          "terminology": "SNOMEDCT_US",
          "sufficientlyDefined": false,
          "anonymous": false
        },
        {
          "id": "0c703136-fba8-4dd0-a796-97a0f10eba76",
          "modified": "2019-01-01T00:00:00.000Z",
          "created": "2019-01-01T00:00:00.000Z",
          "modifiedBy": "loader",
          "local": false,
          "active": false,
          "name": "Regressing malignant melanoma",
          "code": "189750008",
          "terminology": "SNOMEDCT_US",
          "sufficientlyDefined": false,
          "anonymous": false
        }
      ]
    }

-----------------------------------------------------
Finished ...Thu, Feb 27, 2020  3:54:33 PM
-----------------------------------------------------
```

[Back to Top](#top)

