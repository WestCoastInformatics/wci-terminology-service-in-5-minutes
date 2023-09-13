# ConceptTreePosition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Children** | Pointer to [**[]ConceptTreePosition**](ConceptTreePosition.md) | the child tree positions of this node | [optional] 
**Level** | Pointer to **int32** | the level of depth in the hierarchy of this node | [optional] 
**AncestorPath** | Pointer to **string** | the path from the root code expressed as a sequence of dot (.) separated code values starting with the root and ending with the parent code | [optional] 
**Code** | **string** | the code in the specified terminology | 
**AdditionalType** | Pointer to **string** | the more specific type of relationship (more information about this label is provided in the terminology metadata) | [optional] 
**ChildCt** | Pointer to **int32** | the child count of this node | [optional] 
**Created** | **time.Time** | the created date | 
**Local** | **bool** | indicates whether this data element was created by local editing | 
**ModifiedBy** | **string** | the identifier of the user who made the last modification | 
**Modified** | **time.Time** | the last modified date | 
**Id** | **string** | the unique identifier | 
**Active** | **bool** | indicates whether or not this data element is active | 
**Name** | **string** | the name | 
**Terminology** | **string** | the terminology abbreviation | 

## Methods

### NewConceptTreePosition

`func NewConceptTreePosition(code string, created time.Time, local bool, modifiedBy string, modified time.Time, id string, active bool, name string, terminology string, ) *ConceptTreePosition`

NewConceptTreePosition instantiates a new ConceptTreePosition object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewConceptTreePositionWithDefaults

`func NewConceptTreePositionWithDefaults() *ConceptTreePosition`

NewConceptTreePositionWithDefaults instantiates a new ConceptTreePosition object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetChildren

`func (o *ConceptTreePosition) GetChildren() []ConceptTreePosition`

GetChildren returns the Children field if non-nil, zero value otherwise.

### GetChildrenOk

`func (o *ConceptTreePosition) GetChildrenOk() (*[]ConceptTreePosition, bool)`

GetChildrenOk returns a tuple with the Children field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChildren

`func (o *ConceptTreePosition) SetChildren(v []ConceptTreePosition)`

SetChildren sets Children field to given value.

### HasChildren

`func (o *ConceptTreePosition) HasChildren() bool`

HasChildren returns a boolean if a field has been set.

### GetLevel

`func (o *ConceptTreePosition) GetLevel() int32`

GetLevel returns the Level field if non-nil, zero value otherwise.

### GetLevelOk

`func (o *ConceptTreePosition) GetLevelOk() (*int32, bool)`

GetLevelOk returns a tuple with the Level field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLevel

`func (o *ConceptTreePosition) SetLevel(v int32)`

SetLevel sets Level field to given value.

### HasLevel

`func (o *ConceptTreePosition) HasLevel() bool`

HasLevel returns a boolean if a field has been set.

### GetAncestorPath

`func (o *ConceptTreePosition) GetAncestorPath() string`

GetAncestorPath returns the AncestorPath field if non-nil, zero value otherwise.

### GetAncestorPathOk

`func (o *ConceptTreePosition) GetAncestorPathOk() (*string, bool)`

GetAncestorPathOk returns a tuple with the AncestorPath field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAncestorPath

`func (o *ConceptTreePosition) SetAncestorPath(v string)`

SetAncestorPath sets AncestorPath field to given value.

### HasAncestorPath

`func (o *ConceptTreePosition) HasAncestorPath() bool`

HasAncestorPath returns a boolean if a field has been set.

### GetCode

`func (o *ConceptTreePosition) GetCode() string`

GetCode returns the Code field if non-nil, zero value otherwise.

### GetCodeOk

`func (o *ConceptTreePosition) GetCodeOk() (*string, bool)`

GetCodeOk returns a tuple with the Code field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCode

`func (o *ConceptTreePosition) SetCode(v string)`

SetCode sets Code field to given value.


### GetAdditionalType

`func (o *ConceptTreePosition) GetAdditionalType() string`

GetAdditionalType returns the AdditionalType field if non-nil, zero value otherwise.

### GetAdditionalTypeOk

`func (o *ConceptTreePosition) GetAdditionalTypeOk() (*string, bool)`

GetAdditionalTypeOk returns a tuple with the AdditionalType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdditionalType

`func (o *ConceptTreePosition) SetAdditionalType(v string)`

SetAdditionalType sets AdditionalType field to given value.

### HasAdditionalType

`func (o *ConceptTreePosition) HasAdditionalType() bool`

HasAdditionalType returns a boolean if a field has been set.

### GetChildCt

`func (o *ConceptTreePosition) GetChildCt() int32`

GetChildCt returns the ChildCt field if non-nil, zero value otherwise.

### GetChildCtOk

`func (o *ConceptTreePosition) GetChildCtOk() (*int32, bool)`

GetChildCtOk returns a tuple with the ChildCt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChildCt

`func (o *ConceptTreePosition) SetChildCt(v int32)`

SetChildCt sets ChildCt field to given value.

### HasChildCt

`func (o *ConceptTreePosition) HasChildCt() bool`

HasChildCt returns a boolean if a field has been set.

### GetCreated

`func (o *ConceptTreePosition) GetCreated() time.Time`

GetCreated returns the Created field if non-nil, zero value otherwise.

### GetCreatedOk

`func (o *ConceptTreePosition) GetCreatedOk() (*time.Time, bool)`

GetCreatedOk returns a tuple with the Created field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreated

`func (o *ConceptTreePosition) SetCreated(v time.Time)`

SetCreated sets Created field to given value.


### GetLocal

`func (o *ConceptTreePosition) GetLocal() bool`

GetLocal returns the Local field if non-nil, zero value otherwise.

### GetLocalOk

`func (o *ConceptTreePosition) GetLocalOk() (*bool, bool)`

GetLocalOk returns a tuple with the Local field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLocal

`func (o *ConceptTreePosition) SetLocal(v bool)`

SetLocal sets Local field to given value.


### GetModifiedBy

`func (o *ConceptTreePosition) GetModifiedBy() string`

GetModifiedBy returns the ModifiedBy field if non-nil, zero value otherwise.

### GetModifiedByOk

`func (o *ConceptTreePosition) GetModifiedByOk() (*string, bool)`

GetModifiedByOk returns a tuple with the ModifiedBy field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModifiedBy

`func (o *ConceptTreePosition) SetModifiedBy(v string)`

SetModifiedBy sets ModifiedBy field to given value.


### GetModified

`func (o *ConceptTreePosition) GetModified() time.Time`

GetModified returns the Modified field if non-nil, zero value otherwise.

### GetModifiedOk

`func (o *ConceptTreePosition) GetModifiedOk() (*time.Time, bool)`

GetModifiedOk returns a tuple with the Modified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModified

`func (o *ConceptTreePosition) SetModified(v time.Time)`

SetModified sets Modified field to given value.


### GetId

`func (o *ConceptTreePosition) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ConceptTreePosition) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ConceptTreePosition) SetId(v string)`

SetId sets Id field to given value.


### GetActive

`func (o *ConceptTreePosition) GetActive() bool`

GetActive returns the Active field if non-nil, zero value otherwise.

### GetActiveOk

`func (o *ConceptTreePosition) GetActiveOk() (*bool, bool)`

GetActiveOk returns a tuple with the Active field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetActive

`func (o *ConceptTreePosition) SetActive(v bool)`

SetActive sets Active field to given value.


### GetName

`func (o *ConceptTreePosition) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ConceptTreePosition) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ConceptTreePosition) SetName(v string)`

SetName sets Name field to given value.


### GetTerminology

`func (o *ConceptTreePosition) GetTerminology() string`

GetTerminology returns the Terminology field if non-nil, zero value otherwise.

### GetTerminologyOk

`func (o *ConceptTreePosition) GetTerminologyOk() (*string, bool)`

GetTerminologyOk returns a tuple with the Terminology field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTerminology

`func (o *ConceptTreePosition) SetTerminology(v string)`

SetTerminology sets Terminology field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


