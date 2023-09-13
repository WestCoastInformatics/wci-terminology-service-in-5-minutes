# Mapset

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Code** | **string** | the code in the specified terminology | 
**MappedToTerminology** | **string** | the target terminology of this map set | 
**Created** | **time.Time** | the created date | 
**Local** | **bool** | indicates whether this data element was created by local editing | 
**ModifiedBy** | **string** | the identifier of the user who made the last modification | 
**Modified** | **time.Time** | the last modified date | 
**Id** | **string** | the unique identifier | 
**Active** | **bool** | indicates whether or not this data element is active | 
**Name** | **string** | the name | 
**Terminology** | **string** | the terminology abbreviation | 
**Attributes** | Pointer to **map[string]string** | key/value pairs associated with this object. Entries in this map are terminology-specific | [optional] 

## Methods

### NewMapset

`func NewMapset(code string, mappedToTerminology string, created time.Time, local bool, modifiedBy string, modified time.Time, id string, active bool, name string, terminology string, ) *Mapset`

NewMapset instantiates a new Mapset object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMapsetWithDefaults

`func NewMapsetWithDefaults() *Mapset`

NewMapsetWithDefaults instantiates a new Mapset object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCode

`func (o *Mapset) GetCode() string`

GetCode returns the Code field if non-nil, zero value otherwise.

### GetCodeOk

`func (o *Mapset) GetCodeOk() (*string, bool)`

GetCodeOk returns a tuple with the Code field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCode

`func (o *Mapset) SetCode(v string)`

SetCode sets Code field to given value.


### GetMappedToTerminology

`func (o *Mapset) GetMappedToTerminology() string`

GetMappedToTerminology returns the MappedToTerminology field if non-nil, zero value otherwise.

### GetMappedToTerminologyOk

`func (o *Mapset) GetMappedToTerminologyOk() (*string, bool)`

GetMappedToTerminologyOk returns a tuple with the MappedToTerminology field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMappedToTerminology

`func (o *Mapset) SetMappedToTerminology(v string)`

SetMappedToTerminology sets MappedToTerminology field to given value.


### GetCreated

`func (o *Mapset) GetCreated() time.Time`

GetCreated returns the Created field if non-nil, zero value otherwise.

### GetCreatedOk

`func (o *Mapset) GetCreatedOk() (*time.Time, bool)`

GetCreatedOk returns a tuple with the Created field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreated

`func (o *Mapset) SetCreated(v time.Time)`

SetCreated sets Created field to given value.


### GetLocal

`func (o *Mapset) GetLocal() bool`

GetLocal returns the Local field if non-nil, zero value otherwise.

### GetLocalOk

`func (o *Mapset) GetLocalOk() (*bool, bool)`

GetLocalOk returns a tuple with the Local field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLocal

`func (o *Mapset) SetLocal(v bool)`

SetLocal sets Local field to given value.


### GetModifiedBy

`func (o *Mapset) GetModifiedBy() string`

GetModifiedBy returns the ModifiedBy field if non-nil, zero value otherwise.

### GetModifiedByOk

`func (o *Mapset) GetModifiedByOk() (*string, bool)`

GetModifiedByOk returns a tuple with the ModifiedBy field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModifiedBy

`func (o *Mapset) SetModifiedBy(v string)`

SetModifiedBy sets ModifiedBy field to given value.


### GetModified

`func (o *Mapset) GetModified() time.Time`

GetModified returns the Modified field if non-nil, zero value otherwise.

### GetModifiedOk

`func (o *Mapset) GetModifiedOk() (*time.Time, bool)`

GetModifiedOk returns a tuple with the Modified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModified

`func (o *Mapset) SetModified(v time.Time)`

SetModified sets Modified field to given value.


### GetId

`func (o *Mapset) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *Mapset) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *Mapset) SetId(v string)`

SetId sets Id field to given value.


### GetActive

`func (o *Mapset) GetActive() bool`

GetActive returns the Active field if non-nil, zero value otherwise.

### GetActiveOk

`func (o *Mapset) GetActiveOk() (*bool, bool)`

GetActiveOk returns a tuple with the Active field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetActive

`func (o *Mapset) SetActive(v bool)`

SetActive sets Active field to given value.


### GetName

`func (o *Mapset) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *Mapset) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *Mapset) SetName(v string)`

SetName sets Name field to given value.


### GetTerminology

`func (o *Mapset) GetTerminology() string`

GetTerminology returns the Terminology field if non-nil, zero value otherwise.

### GetTerminologyOk

`func (o *Mapset) GetTerminologyOk() (*string, bool)`

GetTerminologyOk returns a tuple with the Terminology field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTerminology

`func (o *Mapset) SetTerminology(v string)`

SetTerminology sets Terminology field to given value.


### GetAttributes

`func (o *Mapset) GetAttributes() map[string]string`

GetAttributes returns the Attributes field if non-nil, zero value otherwise.

### GetAttributesOk

`func (o *Mapset) GetAttributesOk() (*map[string]string, bool)`

GetAttributesOk returns a tuple with the Attributes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttributes

`func (o *Mapset) SetAttributes(v map[string]string)`

SetAttributes sets Attributes field to given value.

### HasAttributes

`func (o *Mapset) HasAttributes() bool`

HasAttributes returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


