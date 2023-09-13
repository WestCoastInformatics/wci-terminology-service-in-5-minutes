# west_coast_informatics_terminology_api

WestCoastInformaticsTerminologyApi - JavaScript client for west_coast_informatics_terminology_api
API documentation for the <a href=\"https://www.westcoastinformatics.com\">West Coast Informatics</a> terminology server API.<p>Request a 30-day bearer token from <a href=\"mailto:info@westcoastinformatics.com\">info@westcoastinformatics.com</a>.</p> <p>For full documentation on this service, please visit our wiki page at <a href=\"https://wci-wiki.atlassian.net/wiki/spaces/TSV2\">https://wci-wiki.atlassian.net/wiki/spaces/TSV2</a>.</p>
This SDK is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 1.0.0
- Package version: 1.0.0
- Build package: org.openapitools.codegen.languages.JavascriptClientCodegen
For more information, please visit [https://westcoastinformatics.com](https://westcoastinformatics.com)

## Installation

### For [Node.js](https://nodejs.org/)

#### npm

To publish the library as a [npm](https://www.npmjs.com/), please follow the procedure in ["Publishing npm packages"](https://docs.npmjs.com/getting-started/publishing-npm-packages).

Then install it via:

```shell
npm install west_coast_informatics_terminology_api --save
```

Finally, you need to build the module:

```shell
npm run build
```

##### Local development

To use the library locally without publishing to a remote npm registry, first install the dependencies by changing into the directory containing `package.json` (and this README). Let's call this `JAVASCRIPT_CLIENT_DIR`. Then run:

```shell
npm install
```

Next, [link](https://docs.npmjs.com/cli/link) it globally in npm with the following, also from `JAVASCRIPT_CLIENT_DIR`:

```shell
npm link
```

To use the link you just defined in your project, switch to the directory you want to use your west_coast_informatics_terminology_api from, and run:

```shell
npm link /path/to/<JAVASCRIPT_CLIENT_DIR>
```

Finally, you need to build the module:

```shell
npm run build
```

#### git

If the library is hosted at a git repository, e.g.https://github.com/GIT_USER_ID/GIT_REPO_ID
then install it via:

```shell
    npm install GIT_USER_ID/GIT_REPO_ID --save
```

### For browser

The library also works in the browser environment via npm and [browserify](http://browserify.org/). After following
the above steps with Node.js and installing browserify with `npm install -g browserify`,
perform the following (assuming *main.js* is your entry file):

```shell
browserify main.js > bundle.js
```

Then include *bundle.js* in the HTML pages.

### Webpack Configuration

Using Webpack you may encounter the following error: "Module not found: Error:
Cannot resolve module", most certainly you should disable AMD loader. Add/merge
the following section to your webpack config:

```javascript
module: {
  rules: [
    {
      parser: {
        amd: false
      }
    }
  ]
}
```

## Getting Started

Please follow the [installation](#installation) instruction and execute the following JS code:

```javascript
var WestCoastInformaticsTerminologyApi = require('west_coast_informatics_terminology_api');

var defaultClient = WestCoastInformaticsTerminologyApi.ApiClient.instance;
// Configure Bearer (Bearer [token]) access token for authorization: bearerAuth
var bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.accessToken = "YOUR ACCESS TOKEN"

var api = new WestCoastInformaticsTerminologyApi.LoginApi()
var authRequest = new WestCoastInformaticsTerminologyApi.AuthRequest(); // {AuthRequest} Authorization information
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
api.auth(authRequest, callback);

```

## Documentation for API Endpoints

All URIs are relative to *https://termserver.westcoastinformatics.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*WestCoastInformaticsTerminologyApi.LoginApi* | [**auth**](docs/LoginApi.md#auth) | **POST** /auth/token | Login
*WestCoastInformaticsTerminologyApi.TerminologyApi* | [**addSynonym**](docs/TerminologyApi.md#addSynonym) | **POST** /terminology/concept/{terminology}/{code}/atom | Add synonym
*WestCoastInformaticsTerminologyApi.TerminologyApi* | [**autocompleteConcepts1**](docs/TerminologyApi.md#autocompleteConcepts1) | **GET** /terminology/concept/{terminology}/autocomplete | Autocomplete
*WestCoastInformaticsTerminologyApi.TerminologyApi* | [**findConcepts**](docs/TerminologyApi.md#findConcepts) | **GET** /terminology/concept/{terminology} | Find concepts
*WestCoastInformaticsTerminologyApi.TerminologyApi* | [**findConcepts2**](docs/TerminologyApi.md#findConcepts2) | **GET** /terminology/concept | Find concepts (across all terminologies)
*WestCoastInformaticsTerminologyApi.TerminologyApi* | [**findMappings1**](docs/TerminologyApi.md#findMappings1) | **GET** /terminology/mapset/{terminology}/{code}/mapping | Find mappings
*WestCoastInformaticsTerminologyApi.TerminologyApi* | [**findSubsetMemberships1**](docs/TerminologyApi.md#findSubsetMemberships1) | **GET** /terminology/concept/{terminology}/{code}/subsets | Get concept subset memberships
*WestCoastInformaticsTerminologyApi.TerminologyApi* | [**findTreePositionChildren1**](docs/TerminologyApi.md#findTreePositionChildren1) | **GET** /terminology/concept/{terminology}/{code}/trees/children | Find tree position children
*WestCoastInformaticsTerminologyApi.TerminologyApi* | [**findTreePositions1**](docs/TerminologyApi.md#findTreePositions1) | **GET** /terminology/concept/{terminology}/{code}/trees | Find tree positions
*WestCoastInformaticsTerminologyApi.TerminologyApi* | [**getConcept1**](docs/TerminologyApi.md#getConcept1) | **GET** /terminology/concept/{terminology}/{code} | Get concept
*WestCoastInformaticsTerminologyApi.TerminologyApi* | [**getConceptMappings1**](docs/TerminologyApi.md#getConceptMappings1) | **GET** /terminology/concept/{terminology}/{code}/mapping | Get concept mappings
*WestCoastInformaticsTerminologyApi.TerminologyApi* | [**getConfigProperties1**](docs/TerminologyApi.md#getConfigProperties1) | **GET** /terminology/properties | Get properties
*WestCoastInformaticsTerminologyApi.TerminologyApi* | [**getMapset1**](docs/TerminologyApi.md#getMapset1) | **GET** /terminology/mapset/{terminology}/{code} | Get mapset
*WestCoastInformaticsTerminologyApi.TerminologyApi* | [**getMapsets1**](docs/TerminologyApi.md#getMapsets1) | **GET** /terminology/mapset/{terminology} | Get mapsets
*WestCoastInformaticsTerminologyApi.TerminologyApi* | [**getRelationships1**](docs/TerminologyApi.md#getRelationships1) | **GET** /terminology/concept/{terminology}/{code}/relationships | Get concept relationships
*WestCoastInformaticsTerminologyApi.TerminologyApi* | [**getSubset1**](docs/TerminologyApi.md#getSubset1) | **GET** /terminology/subset/{terminology}/{code} | Get subset
*WestCoastInformaticsTerminologyApi.TerminologyApi* | [**getSubsets1**](docs/TerminologyApi.md#getSubsets1) | **GET** /terminology/subset/{terminology} | Get subsets
*WestCoastInformaticsTerminologyApi.TerminologyApi* | [**getSubtree1**](docs/TerminologyApi.md#getSubtree1) | **GET** /terminology/concept/{terminology}/{code}/subtree | Get subtree
*WestCoastInformaticsTerminologyApi.TerminologyApi* | [**getTerminologies1**](docs/TerminologyApi.md#getTerminologies1) | **GET** /terminology | Get terminologies
*WestCoastInformaticsTerminologyApi.TerminologyApi* | [**getTerminology1**](docs/TerminologyApi.md#getTerminology1) | **GET** /terminology/{terminology} | Get terminology
*WestCoastInformaticsTerminologyApi.TerminologyApi* | [**getTerminologyMetadata1**](docs/TerminologyApi.md#getTerminologyMetadata1) | **GET** /terminology/metadata/{terminology} | Get terminology metadata
*WestCoastInformaticsTerminologyApi.TerminologyApi* | [**resolveExpression1**](docs/TerminologyApi.md#resolveExpression1) | **GET** /terminology/expr/{terminology} | Resolve expression


## Documentation for Models

 - [WestCoastInformaticsTerminologyApi.Atom](docs/Atom.md)
 - [WestCoastInformaticsTerminologyApi.AuthRequest](docs/AuthRequest.md)
 - [WestCoastInformaticsTerminologyApi.AuthResponse](docs/AuthResponse.md)
 - [WestCoastInformaticsTerminologyApi.Axiom](docs/Axiom.md)
 - [WestCoastInformaticsTerminologyApi.Concept](docs/Concept.md)
 - [WestCoastInformaticsTerminologyApi.ConceptRelationship](docs/ConceptRelationship.md)
 - [WestCoastInformaticsTerminologyApi.ConceptTreePosition](docs/ConceptTreePosition.md)
 - [WestCoastInformaticsTerminologyApi.Definition](docs/Definition.md)
 - [WestCoastInformaticsTerminologyApi.Mapping](docs/Mapping.md)
 - [WestCoastInformaticsTerminologyApi.Mapset](docs/Mapset.md)
 - [WestCoastInformaticsTerminologyApi.Metadata](docs/Metadata.md)
 - [WestCoastInformaticsTerminologyApi.ResultListConcept](docs/ResultListConcept.md)
 - [WestCoastInformaticsTerminologyApi.ResultListConceptRelationship](docs/ResultListConceptRelationship.md)
 - [WestCoastInformaticsTerminologyApi.ResultListConceptTreePosition](docs/ResultListConceptTreePosition.md)
 - [WestCoastInformaticsTerminologyApi.ResultListMapping](docs/ResultListMapping.md)
 - [WestCoastInformaticsTerminologyApi.ResultListMapset](docs/ResultListMapset.md)
 - [WestCoastInformaticsTerminologyApi.ResultListSubset](docs/ResultListSubset.md)
 - [WestCoastInformaticsTerminologyApi.Subset](docs/Subset.md)
 - [WestCoastInformaticsTerminologyApi.Terminology](docs/Terminology.md)
 - [WestCoastInformaticsTerminologyApi.TerminologyMetadata](docs/TerminologyMetadata.md)


## Documentation for Authorization


Authentication schemes defined for the API:
### bearerAuth

- **Type**: Bearer authentication (Bearer [token])
