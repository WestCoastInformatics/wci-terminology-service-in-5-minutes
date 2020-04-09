<a name="top"/>

WCI Terminology Service in 5 minutes: bash Tutorial
===================================================

This tutorial shows how to use bash scripts to access content from the WCI Terminology API.

Prerequisites
-------------
* bash must be installed
* curl must be installed ([Download cURL](https://curl.haxx.se/dlwiz/))
* jq must be installed ([Download jq](https://stedolan.github.io/jq/download/))

The various scripts make use of the local `url.env` file to define the endpoint URL.


Test Scripts
------------
- [login.sh](#login-sh)
- [get-terminologies.sh](#get-terminologies-sh)
- [get-concept.sh](#get-concept-sh)
- [get-concept.sh](#get-concept-sh)
- [find-concepts.sh](#find-concepts-sh)
- [get-subtree.sh](#get-subtree-sh)

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
Starting ...Fri, Feb 28, 2020  2:09:01 PM
-----------------------------------------------------
url = http://localhost:8081
terminology = SNOMEDCT_US
code = 80891009

  Get concept for SNOMEDCT_US 80891009:

    {
      "id": "c2273780-4e2e-40e9-b4bb-e4502a12f4fc",
      "modified": "2019-01-01T00:00:00.000-08:00",
      "created": "2019-01-01T00:00:00.000-08:00",
      "modifiedBy": "loader",
      "local": false,
      "active": true,
      "name": "Heart structure",
      "code": "80891009",
      "terminology": "SNOMEDCT_US",
      "attributes": {
        "ACTIVE": "1",
        "DEFINITION_STATUS_ID": "900000000000074008",
        "CUI": "C0018787",
        "SCG": "<<< 409708007 | Heart and/or pericardium structure | + 27832009 | Structure of thoracic viscus | :  has_part_anatomy_structure = 119202000 | Heart part |,  has_entire_anatomy_structure = 302509004 | Entire heart |",
        "EFFECTIVE_TIME": "20020131"
      },
      "semanticTypes": [
        "Body Part, Organ, or Organ Component",
        "body structure"
      ],
      "atoms": [
        {
          "id": "88f3b793-f12c-4d75-9d96-92df03e8a894",
          "modified": "2019-01-01T00:00:00.000-08:00",
          "created": "2019-01-01T00:00:00.000-08:00",
          "modifiedBy": "loader",
          "local": false,
          "active": false,
          "name": "Heart, NOS",
          "terminology": "SNOMEDCT_US",
          "terminologyId": "A4737609",
          "codeId": "80891009",
          "conceptId": "80891009",
          "localeMap": {
            "en": false
          },
          "termType": "IS",
          "attributes": {
            "suppressible": "true"
          }
        },
        {
          "id": "f0b6a6c3-7f4f-400c-a2a3-d5fa77cd419d",
          "modified": "2019-01-01T00:00:00.000-08:00",
          "created": "2019-01-01T00:00:00.000-08:00",
          "modifiedBy": "loader",
          "local": false,
          "active": true,
          "name": "Heart structure (body structure)",
          "terminology": "SNOMEDCT_US",
          "terminologyId": "A3488292",
          "codeId": "80891009",
          "conceptId": "80891009",
          "localeMap": {
            "en": false
          },
          "termType": "FN",
          "attributes": {
            "TYPE_ID": "900000000000003001",
            "CASE_SIGNIFICANCE_ID": "900000000000448009"
          }
        },
        {
          "id": "642ba814-3cf2-4b78-a6ed-1725c4dc038b",
          "modified": "2019-01-01T00:00:00.000-08:00",
          "created": "2019-01-01T00:00:00.000-08:00",
          "modifiedBy": "loader",
          "local": false,
          "active": true,
          "name": "Heart",
          "terminology": "SNOMEDCT_US",
          "terminologyId": "A2882201",
          "codeId": "80891009",
          "conceptId": "80891009",
          "localeMap": {
            "en": false
          },
          "termType": "SY",
          "attributes": {
            "TYPE_ID": "900000000000013009",
            "CASE_SIGNIFICANCE_ID": "900000000000448009"
          }
        },
        {
          "id": "bbb4ec88-197a-4a6f-b8f6-56e3f32ff403",
          "modified": "2019-01-01T00:00:00.000-08:00",
          "created": "2019-01-01T00:00:00.000-08:00",
          "modifiedBy": "loader",
          "local": false,
          "active": true,
          "name": "Cardiac structure",
          "terminology": "SNOMEDCT_US",
          "terminologyId": "A6921135",
          "codeId": "80891009",
          "conceptId": "80891009",
          "localeMap": {
            "en": false
          },
          "termType": "SY",
          "attributes": {
            "TYPE_ID": "900000000000013009",
            "CASE_SIGNIFICANCE_ID": "900000000000448009"
          }
        },
        {
          "id": "a1561741-9a46-4284-b63b-495d955feb35",
          "modified": "2019-01-01T00:00:00.000-08:00",
          "created": "2019-01-01T00:00:00.000-08:00",
          "modifiedBy": "loader",
          "local": false,
          "active": true,
          "name": "Heart structure",
          "terminology": "SNOMEDCT_US",
          "terminologyId": "A3140621",
          "codeId": "80891009",
          "conceptId": "80891009",
          "localeMap": {
            "en": false
          },
          "termType": "PT",
          "attributes": {
            "TYPE_ID": "900000000000013009",
            "CASE_SIGNIFICANCE_ID": "900000000000448009"
          }
        }
      ]
    }

-----------------------------------------------------
Finished ...Fri, Feb 28, 2020  2:09:01 PM
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
Starting ...Fri, Feb 28, 2020  2:09:52 PM
-----------------------------------------------------
url = http://localhost:8081
terminology = SNOMEDCT_US
code = 80891009

  Get concept for SNOMEDCT_US 80891009:

    {
      "total": 1313,
      "limit": 5,
      "offset": 0,
      "items": [
        {
          "id": "1262d1a9-72df-4e9e-a56d-a468fd4d6c58",
          "modified": "2019-01-01T00:00:00.000-08:00",
          "created": "2019-01-01T00:00:00.000-08:00",
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
          "toName": "Heart cytologic material",
          "toCode": "116157005"
        },
        {
          "id": "582540dd-ecd7-4200-92ec-18bc0cd291a4",
          "modified": "2019-01-01T00:00:00.000-08:00",
          "created": "2019-01-01T00:00:00.000-08:00",
          "modifiedBy": "loader",
          "local": false,
          "active": true,
          "terminology": "SNOMEDCT_US",
          "terminologyId": "R14343274",
          "type": "RO",
          "additionalType": "specimen_source_topography_of",
          "hierarchical": false,
          "assertedDirection": false,
          "defining": true,
          "toName": "Specimen from heart",
          "toCode": "127462005"
        },
        {
          "id": "bddbc143-b84b-4863-a0a0-1aceb253f86d",
          "modified": "2019-01-01T00:00:00.000-08:00",
          "created": "2019-01-01T00:00:00.000-08:00",
          "modifiedBy": "loader",
          "local": false,
          "active": true,
          "terminology": "SNOMEDCT_US",
          "terminologyId": "R14343059",
          "type": "RO",
          "additionalType": "specimen_source_topography_of",
          "hierarchical": false,
          "assertedDirection": false,
          "defining": true,
          "toName": "Specimen from heart obtained by biopsy",
          "toCode": "122623002"
        },
        {
          "id": "f1aec2aa-d921-431d-b1b1-7df7c52aa893",
          "modified": "2019-01-01T00:00:00.000-08:00",
          "created": "2019-01-01T00:00:00.000-08:00",
          "modifiedBy": "loader",
          "local": false,
          "active": true,
          "terminology": "SNOMEDCT_US",
          "terminologyId": "R14343060",
          "type": "RO",
          "additionalType": "specimen_source_topography_of",
          "hierarchical": false,
          "assertedDirection": false,
          "defining": true,
          "toName": "Specimen from heart obtained by excisional biopsy of lesion",
          "toCode": "122624008"
        },
        {
          "id": "601a9dfe-e0fc-4368-b4f5-d0e8c35dfa70",
          "modified": "2019-01-01T00:00:00.000-08:00",
          "created": "2019-01-01T00:00:00.000-08:00",
          "modifiedBy": "loader",
          "local": false,
          "active": true,
          "terminology": "SNOMEDCT_US",
          "terminologyId": "R14343061",
          "type": "RO",
          "additionalType": "specimen_source_topography_of",
          "hierarchical": false,
          "assertedDirection": false,
          "defining": true,
          "toName": "Specimen from heart obtained by incisional biopsy",
          "toCode": "122625009"
        }
      ]
    }

-----------------------------------------------------
Finished ...Fri, Feb 28, 2020  2:09:53 PM
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
Starting ...Thu, Apr  2, 2020  6:35:23 PM
-----------------------------------------------------
url = https://wci.terminology.tools
terminology = SNOMEDCT_US
query = malignant melanoma
resolver = MIN
expr =
offset = 0
limit = 5
sort =
ascending =

  Find concepts:

    {
      "total": 394,
      "limit": 5,
      "offset": 0,
      "items": [
        {
          "id": "9ac1a95b-efb8-4a6f-98ea-e700b5fc5d4b",
          "local": false,
          "active": true,
          "name": "Malignant melanoma",
          "code": "2092003",
          "terminology": "SNOMEDCT_US"
        },
        {
          "id": "b462b506-0a32-4d31-9a8f-ee3e2d0c9ae1",
          "local": false,
          "active": true,
          "name": "Malignant melanoma",
          "code": "372244006",
          "terminology": "SNOMEDCT_US"
        },
        {
          "id": "2a1f7786-c0c0-4898-a1fb-4f63a8da668d",
          "local": false,
          "active": false,
          "name": "Melanoma: [skin] or [malignant]",
          "code": "154501005",
          "terminology": "SNOMEDCT_US"
        },
        {
          "id": "16452f96-3b40-47ca-8945-6efdaae0135b",
          "local": false,
          "active": false,
          "name": "Melanoma: [skin] or [malignant]",
          "code": "269577007",
          "terminology": "SNOMEDCT_US"
        },
        {
          "id": "696329bf-0e9f-4a1a-b5c1-7ab9cf3027a2",
          "local": false,
          "active": false,
          "name": "Regressing malignant melanoma",
          "code": "189750008",
          "terminology": "SNOMEDCT_US"
        }
      ]
    }

-----------------------------------------------------
Finished ...Thu, Apr  2, 2020  6:35:24 PM
-----------------------------------------------------
```

This example performs a search that returns all concept members of the SNOMEDCT_US
reference set 723264001 | Lateralizable body structure reference set |.  When not 
specified the "MIN" resolver is used, which returns only first-class attributes of 
the concept object.  Use "--resolver DEFAULT" for summary concept information about 
each result.

```
$ ./find-concepts.sh SNOMEDCT_US "" --expr ^723264001 --limit 5 --token $token
-----------------------------------------------------
Starting ...Thu, Apr  2, 2020  6:34:28 PM
-----------------------------------------------------
url = https://wci.terminology.tools
terminology = SNOMEDCT_US
query =
resolver = MIN
expr = ^723264001
offset = 0
limit = 5
sort =
ascending =

  Find concepts:

    {
      "total": 19778,
      "limit": 5,
      "offset": 0,
      "items": [
        {
          "id": "e9694627-b34f-488f-b134-7a8e0e13b1ba",
          "local": false,
          "active": true,
          "name": "Pulmonary vein confluence",
          "code": "373097002",
          "terminology": "SNOMEDCT_US"
        },
        {
          "id": "1ed65df3-f320-47e2-bd25-b902678b3658",
          "local": false,
          "active": true,
          "name": "Deiter's cell",
          "code": "4799000",
          "terminology": "SNOMEDCT_US"
        },
        {
          "id": "7358bcab-4791-4378-a094-da9cc83da6e1",
          "local": false,
          "active": true,
          "name": "Cephalometric molar superius point",
          "code": "713770007",
          "terminology": "SNOMEDCT_US"
        },
        {
          "id": "eabb911c-78e5-4a17-b175-459bce6e76fd",
          "local": false,
          "active": true,
          "name": "Cephalometric long axis of lower incisor",
          "code": "713772004",
          "terminology": "SNOMEDCT_US"
        },
        {
          "id": "7099f23d-9304-4f9d-9fda-6d3b579f7b28",
          "local": false,
          "active": true,
          "name": "Tibia and fibula, CS",
          "code": "110536004",
          "terminology": "SNOMEDCT_US"
        }
      ]
    }

-----------------------------------------------------
Finished ...Thu, Apr  2, 2020  6:34:28 PM
-----------------------------------------------------
```

[Back to Top](#top)

<a name="get-subtree-sh"/>

### get-subtree.sh

Used to lookup a subtree for a terminology code.  The following example finds
all of the descendants to a depth of 3 (which for ICD10CM is all of the 
descendants).

```
-----------------------------------------------------
Starting ...Mon, Mar 23, 2020  4:40:37 PM
-----------------------------------------------------
url = https://wci.terminology.tools
terminology = ICD10CM
code = M01
level = 3

  Get concept for ICD10CM M01:

    {
      "local": false,
      "active": true,
      "terminology": "ICD10CM",
      "code": "M01",
      "name": "Direct infections of joint in infectious and parasitic diseases classified elsewhere",
      "childCt": 1,
      "level": 0,
      "children": [
        {
          "local": false,
          "active": true,
          "terminology": "ICD10CM",
          "code": "M01.X",
          "name": "Direct infection of joint in infectious and parasitic diseases classified elsewhere",
          "childCt": 10,
          "level": 1,
          "children": [
            {
              "local": false,
              "active": true,
              "terminology": "ICD10CM",
              "code": "M01.X0",
              "name": "Direct infection of unspecified joint in infectious and parasitic diseases classified elsewhere",
              "childCt": 0,
              "level": 2
            },
            ...
          ]
        }
      ]
    }

-----------------------------------------------------
Finished ...Mon, Mar 23, 2020  4:40:38 PM
-----------------------------------------------------
```

[Back to Top](#top)

