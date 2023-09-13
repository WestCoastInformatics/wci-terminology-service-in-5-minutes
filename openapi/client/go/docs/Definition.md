# Definition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Code** | **string** | the code in the specified terminology | 
**LocaleMap** | **map[string]bool** | a map of language codes to boolean values indicated whether this definition is preferred in that language context | 
**Value** | **string** | the definition value itself | 
**Created** | **time.Time** | the created date | 
**Local** | **bool** | indicates whether this data element was created by local editing | 
**ModifiedBy** | **string** | the identifier of the user who made the last modification | 
**Modified** | **time.Time** | the last modified date | 
**Id** | **string** | the unique identifier | 
**Active** | **bool** | indicates whether or not this data element is active | 
**Terminology** | **string** | the terminology abbreviation | 

## Methods

### NewDefinition

`func NewDefinition(code string, localeMap map[string]bool, value string, created time.Time, local bool, modifiedBy string, modified time.Time, id string, active bool, terminology string, ) *Definition`

NewDefinition instantiates a new Definition object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewDefinitionWithDefaults

`func NewDefinitionWithDefaults() *Definition`

NewDefinitionWithDefaults instantiates a new Definition object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCode

`func (o *Definition) GetCode() string`

GetCode returns the Code field if non-nil, zero value otherwise.

### GetCodeOk

`func (o *Definition) GetCodeOk() (*string, bool)`

GetCodeOk returns a tuple with the Code field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCode

`func (o *Definition) SetCode(v string)`

SetCode sets Code field to given value.


### GetLocaleMap

`func (o *Definition) GetLocaleMap() map[string]bool`

GetLocaleMap returns the LocaleMap field if non-nil, zero value otherwise.

### GetLocaleMapOk

`func (o *Definition) GetLocaleMapOk() (*map[string]bool, bool)`

GetLocaleMapOk returns a tuple with the LocaleMap field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLocaleMap

`func (o *Definition) SetLocaleMap(v map[string]bool)`

SetLocaleMap sets LocaleMap field to given value.


### GetValue

`func (o *Definition) GetValue() string`

GetValue returns the Value field if non-nil, zero value otherwise.

### GetValueOk

`func (o *Definition) GetValueOk() (*string, bool)`

GetValueOk returns a tuple with the Value field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValue

`func (o *Definition) SetValue(v string)`

SetValue sets Value field to given value.


### GetCreated

`func (o *Definition) GetCreated() time.Time`

GetCreated returns the Created field if non-nil, zero value otherwise.

### GetCreatedOk

`func (o *Definition) GetCreatedOk() (*time.Time, bool)`

GetCreatedOk returns a tuple with the Created field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreated

`func (o *Definition) SetCreated(v time.Time)`

SetCreated sets Created field to given value.


### GetLocal

`func (o *Definition) GetLocal() bool`

GetLocal returns the Local field if non-nil, zero value otherwise.

### GetLocalOk

`func (o *Definition) GetLocalOk() (*bool, bool)`

GetLocalOk returns a tuple with the Local field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLocal

`func (o *Definition) SetLocal(v bool)`

SetLocal sets Local field to given value.


### GetModifiedBy

`func (o *Definition) GetModifiedBy() string`

GetModifiedBy returns the ModifiedBy field if non-nil, zero value otherwise.

### GetModifiedByOk

`func (o *Definition) GetModifiedByOk() (*string, bool)`

GetModifiedByOk returns a tuple with the ModifiedBy field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModifiedBy

`func (o *Definition) SetModifiedBy(v string)`

SetModifiedBy sets ModifiedBy field to given value.


### GetModified

`func (o *Definition) GetModified() time.Time`

GetModified returns the Modified field if non-nil, zero value otherwise.

### GetModifiedOk

`func (o *Definition) GetModifiedOk() (*time.Time, bool)`

GetModifiedOk returns a tuple with the Modified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModified

`func (o *Definition) SetModified(v time.Time)`

SetModified sets Modified field to given value.


### GetId

`func (o *Definition) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *Definition) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *Definition) SetId(v string)`

SetId sets Id field to given value.


### GetActive

`func (o *Definition) GetActive() bool`

GetActive returns the Active field if non-nil, zero value otherwise.

### GetActiveOk

`func (o *Definition) GetActiveOk() (*bool, bool)`

GetActiveOk returns a tuple with the Active field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetActive

`func (o *Definition) SetActive(v bool)`

SetActive sets Active field to given value.


### GetTerminology

`func (o *Definition) GetTerminology() string`

GetTerminology returns the Terminology field if non-nil, zero value otherwise.

### GetTerminologyOk

`func (o *Definition) GetTerminologyOk() (*string, bool)`

GetTerminologyOk returns a tuple with the Terminology field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTerminology

`func (o *Definition) SetTerminology(v string)`

SetTerminology sets Terminology field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


