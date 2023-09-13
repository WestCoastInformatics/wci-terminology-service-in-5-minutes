# Terminology

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Version** | **string** | the terminology version | 
**Abbreviation** | **string** | the terminology abbreviation | 
**SystemOid** | Pointer to **string** | the OID for the terminology | [optional] 
**SystemUri** | Pointer to **string** | the FHIR system URI for the terminology | [optional] 
**ExpressionEnabled** | **bool** | indicates whether ECL-style expressions can be used when searching the terminology | 
**Name** | **string** | the name | 
**Created** | **time.Time** | the created date | 
**Local** | **bool** | indicates whether this data element was created by local editing | 
**ModifiedBy** | **string** | the identifier of the user who made the last modification | 
**Modified** | **time.Time** | the last modified date | 
**Id** | **string** | the unique identifier | 
**Active** | **bool** | indicates whether or not this data element is active | 
**Attributes** | Pointer to **map[string]string** | key/value pairs associated with this object. Entries in this map are terminology-specific | [optional] 

## Methods

### NewTerminology

`func NewTerminology(version string, abbreviation string, expressionEnabled bool, name string, created time.Time, local bool, modifiedBy string, modified time.Time, id string, active bool, ) *Terminology`

NewTerminology instantiates a new Terminology object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewTerminologyWithDefaults

`func NewTerminologyWithDefaults() *Terminology`

NewTerminologyWithDefaults instantiates a new Terminology object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetVersion

`func (o *Terminology) GetVersion() string`

GetVersion returns the Version field if non-nil, zero value otherwise.

### GetVersionOk

`func (o *Terminology) GetVersionOk() (*string, bool)`

GetVersionOk returns a tuple with the Version field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersion

`func (o *Terminology) SetVersion(v string)`

SetVersion sets Version field to given value.


### GetAbbreviation

`func (o *Terminology) GetAbbreviation() string`

GetAbbreviation returns the Abbreviation field if non-nil, zero value otherwise.

### GetAbbreviationOk

`func (o *Terminology) GetAbbreviationOk() (*string, bool)`

GetAbbreviationOk returns a tuple with the Abbreviation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAbbreviation

`func (o *Terminology) SetAbbreviation(v string)`

SetAbbreviation sets Abbreviation field to given value.


### GetSystemOid

`func (o *Terminology) GetSystemOid() string`

GetSystemOid returns the SystemOid field if non-nil, zero value otherwise.

### GetSystemOidOk

`func (o *Terminology) GetSystemOidOk() (*string, bool)`

GetSystemOidOk returns a tuple with the SystemOid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSystemOid

`func (o *Terminology) SetSystemOid(v string)`

SetSystemOid sets SystemOid field to given value.

### HasSystemOid

`func (o *Terminology) HasSystemOid() bool`

HasSystemOid returns a boolean if a field has been set.

### GetSystemUri

`func (o *Terminology) GetSystemUri() string`

GetSystemUri returns the SystemUri field if non-nil, zero value otherwise.

### GetSystemUriOk

`func (o *Terminology) GetSystemUriOk() (*string, bool)`

GetSystemUriOk returns a tuple with the SystemUri field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSystemUri

`func (o *Terminology) SetSystemUri(v string)`

SetSystemUri sets SystemUri field to given value.

### HasSystemUri

`func (o *Terminology) HasSystemUri() bool`

HasSystemUri returns a boolean if a field has been set.

### GetExpressionEnabled

`func (o *Terminology) GetExpressionEnabled() bool`

GetExpressionEnabled returns the ExpressionEnabled field if non-nil, zero value otherwise.

### GetExpressionEnabledOk

`func (o *Terminology) GetExpressionEnabledOk() (*bool, bool)`

GetExpressionEnabledOk returns a tuple with the ExpressionEnabled field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExpressionEnabled

`func (o *Terminology) SetExpressionEnabled(v bool)`

SetExpressionEnabled sets ExpressionEnabled field to given value.


### GetName

`func (o *Terminology) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *Terminology) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *Terminology) SetName(v string)`

SetName sets Name field to given value.


### GetCreated

`func (o *Terminology) GetCreated() time.Time`

GetCreated returns the Created field if non-nil, zero value otherwise.

### GetCreatedOk

`func (o *Terminology) GetCreatedOk() (*time.Time, bool)`

GetCreatedOk returns a tuple with the Created field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreated

`func (o *Terminology) SetCreated(v time.Time)`

SetCreated sets Created field to given value.


### GetLocal

`func (o *Terminology) GetLocal() bool`

GetLocal returns the Local field if non-nil, zero value otherwise.

### GetLocalOk

`func (o *Terminology) GetLocalOk() (*bool, bool)`

GetLocalOk returns a tuple with the Local field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLocal

`func (o *Terminology) SetLocal(v bool)`

SetLocal sets Local field to given value.


### GetModifiedBy

`func (o *Terminology) GetModifiedBy() string`

GetModifiedBy returns the ModifiedBy field if non-nil, zero value otherwise.

### GetModifiedByOk

`func (o *Terminology) GetModifiedByOk() (*string, bool)`

GetModifiedByOk returns a tuple with the ModifiedBy field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModifiedBy

`func (o *Terminology) SetModifiedBy(v string)`

SetModifiedBy sets ModifiedBy field to given value.


### GetModified

`func (o *Terminology) GetModified() time.Time`

GetModified returns the Modified field if non-nil, zero value otherwise.

### GetModifiedOk

`func (o *Terminology) GetModifiedOk() (*time.Time, bool)`

GetModifiedOk returns a tuple with the Modified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModified

`func (o *Terminology) SetModified(v time.Time)`

SetModified sets Modified field to given value.


### GetId

`func (o *Terminology) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *Terminology) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *Terminology) SetId(v string)`

SetId sets Id field to given value.


### GetActive

`func (o *Terminology) GetActive() bool`

GetActive returns the Active field if non-nil, zero value otherwise.

### GetActiveOk

`func (o *Terminology) GetActiveOk() (*bool, bool)`

GetActiveOk returns a tuple with the Active field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetActive

`func (o *Terminology) SetActive(v bool)`

SetActive sets Active field to given value.


### GetAttributes

`func (o *Terminology) GetAttributes() map[string]string`

GetAttributes returns the Attributes field if non-nil, zero value otherwise.

### GetAttributesOk

`func (o *Terminology) GetAttributesOk() (*map[string]string, bool)`

GetAttributesOk returns a tuple with the Attributes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttributes

`func (o *Terminology) SetAttributes(v map[string]string)`

SetAttributes sets Attributes field to given value.

### HasAttributes

`func (o *Terminology) HasAttributes() bool`

HasAttributes returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


