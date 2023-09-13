# Atom

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CodeId** | **string** | the code in the specified terminology | 
**LocaleMap** | **map[string]bool** | a map of language codes to boolean values indicated whether this definition is preferred in that language context | 
**ConceptId** | Pointer to **string** | the concept id (for terminologies that use concepts) | [optional] 
**DescriptorId** | Pointer to **string** | the descriptor id (for terminologies that use descriptors) | [optional] 
**TermType** | **string** | the term type | 
**Created** | **time.Time** | the created date | 
**Local** | **bool** | indicates whether this data element was created by local editing | 
**ModifiedBy** | **string** | the identifier of the user who made the last modification | 
**Modified** | **time.Time** | the last modified date | 
**Id** | **string** | the unique identifier | 
**Active** | **bool** | indicates whether or not this data element is active | 
**Name** | **string** | the name | 
**TerminologyId** | Pointer to **string** | the identifier asserted by the terminology | [optional] 
**Terminology** | **string** | the terminology abbreviation | 
**Attributes** | Pointer to **map[string]string** | key/value pairs associated with this object. Entries in this map are terminology-specific | [optional] 

## Methods

### NewAtom

`func NewAtom(codeId string, localeMap map[string]bool, termType string, created time.Time, local bool, modifiedBy string, modified time.Time, id string, active bool, name string, terminology string, ) *Atom`

NewAtom instantiates a new Atom object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAtomWithDefaults

`func NewAtomWithDefaults() *Atom`

NewAtomWithDefaults instantiates a new Atom object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCodeId

`func (o *Atom) GetCodeId() string`

GetCodeId returns the CodeId field if non-nil, zero value otherwise.

### GetCodeIdOk

`func (o *Atom) GetCodeIdOk() (*string, bool)`

GetCodeIdOk returns a tuple with the CodeId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCodeId

`func (o *Atom) SetCodeId(v string)`

SetCodeId sets CodeId field to given value.


### GetLocaleMap

`func (o *Atom) GetLocaleMap() map[string]bool`

GetLocaleMap returns the LocaleMap field if non-nil, zero value otherwise.

### GetLocaleMapOk

`func (o *Atom) GetLocaleMapOk() (*map[string]bool, bool)`

GetLocaleMapOk returns a tuple with the LocaleMap field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLocaleMap

`func (o *Atom) SetLocaleMap(v map[string]bool)`

SetLocaleMap sets LocaleMap field to given value.


### GetConceptId

`func (o *Atom) GetConceptId() string`

GetConceptId returns the ConceptId field if non-nil, zero value otherwise.

### GetConceptIdOk

`func (o *Atom) GetConceptIdOk() (*string, bool)`

GetConceptIdOk returns a tuple with the ConceptId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConceptId

`func (o *Atom) SetConceptId(v string)`

SetConceptId sets ConceptId field to given value.

### HasConceptId

`func (o *Atom) HasConceptId() bool`

HasConceptId returns a boolean if a field has been set.

### GetDescriptorId

`func (o *Atom) GetDescriptorId() string`

GetDescriptorId returns the DescriptorId field if non-nil, zero value otherwise.

### GetDescriptorIdOk

`func (o *Atom) GetDescriptorIdOk() (*string, bool)`

GetDescriptorIdOk returns a tuple with the DescriptorId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescriptorId

`func (o *Atom) SetDescriptorId(v string)`

SetDescriptorId sets DescriptorId field to given value.

### HasDescriptorId

`func (o *Atom) HasDescriptorId() bool`

HasDescriptorId returns a boolean if a field has been set.

### GetTermType

`func (o *Atom) GetTermType() string`

GetTermType returns the TermType field if non-nil, zero value otherwise.

### GetTermTypeOk

`func (o *Atom) GetTermTypeOk() (*string, bool)`

GetTermTypeOk returns a tuple with the TermType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTermType

`func (o *Atom) SetTermType(v string)`

SetTermType sets TermType field to given value.


### GetCreated

`func (o *Atom) GetCreated() time.Time`

GetCreated returns the Created field if non-nil, zero value otherwise.

### GetCreatedOk

`func (o *Atom) GetCreatedOk() (*time.Time, bool)`

GetCreatedOk returns a tuple with the Created field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreated

`func (o *Atom) SetCreated(v time.Time)`

SetCreated sets Created field to given value.


### GetLocal

`func (o *Atom) GetLocal() bool`

GetLocal returns the Local field if non-nil, zero value otherwise.

### GetLocalOk

`func (o *Atom) GetLocalOk() (*bool, bool)`

GetLocalOk returns a tuple with the Local field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLocal

`func (o *Atom) SetLocal(v bool)`

SetLocal sets Local field to given value.


### GetModifiedBy

`func (o *Atom) GetModifiedBy() string`

GetModifiedBy returns the ModifiedBy field if non-nil, zero value otherwise.

### GetModifiedByOk

`func (o *Atom) GetModifiedByOk() (*string, bool)`

GetModifiedByOk returns a tuple with the ModifiedBy field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModifiedBy

`func (o *Atom) SetModifiedBy(v string)`

SetModifiedBy sets ModifiedBy field to given value.


### GetModified

`func (o *Atom) GetModified() time.Time`

GetModified returns the Modified field if non-nil, zero value otherwise.

### GetModifiedOk

`func (o *Atom) GetModifiedOk() (*time.Time, bool)`

GetModifiedOk returns a tuple with the Modified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModified

`func (o *Atom) SetModified(v time.Time)`

SetModified sets Modified field to given value.


### GetId

`func (o *Atom) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *Atom) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *Atom) SetId(v string)`

SetId sets Id field to given value.


### GetActive

`func (o *Atom) GetActive() bool`

GetActive returns the Active field if non-nil, zero value otherwise.

### GetActiveOk

`func (o *Atom) GetActiveOk() (*bool, bool)`

GetActiveOk returns a tuple with the Active field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetActive

`func (o *Atom) SetActive(v bool)`

SetActive sets Active field to given value.


### GetName

`func (o *Atom) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *Atom) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *Atom) SetName(v string)`

SetName sets Name field to given value.


### GetTerminologyId

`func (o *Atom) GetTerminologyId() string`

GetTerminologyId returns the TerminologyId field if non-nil, zero value otherwise.

### GetTerminologyIdOk

`func (o *Atom) GetTerminologyIdOk() (*string, bool)`

GetTerminologyIdOk returns a tuple with the TerminologyId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTerminologyId

`func (o *Atom) SetTerminologyId(v string)`

SetTerminologyId sets TerminologyId field to given value.

### HasTerminologyId

`func (o *Atom) HasTerminologyId() bool`

HasTerminologyId returns a boolean if a field has been set.

### GetTerminology

`func (o *Atom) GetTerminology() string`

GetTerminology returns the Terminology field if non-nil, zero value otherwise.

### GetTerminologyOk

`func (o *Atom) GetTerminologyOk() (*string, bool)`

GetTerminologyOk returns a tuple with the Terminology field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTerminology

`func (o *Atom) SetTerminology(v string)`

SetTerminology sets Terminology field to given value.


### GetAttributes

`func (o *Atom) GetAttributes() map[string]string`

GetAttributes returns the Attributes field if non-nil, zero value otherwise.

### GetAttributesOk

`func (o *Atom) GetAttributesOk() (*map[string]string, bool)`

GetAttributesOk returns a tuple with the Attributes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttributes

`func (o *Atom) SetAttributes(v map[string]string)`

SetAttributes sets Attributes field to given value.

### HasAttributes

`func (o *Atom) HasAttributes() bool`

HasAttributes returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


