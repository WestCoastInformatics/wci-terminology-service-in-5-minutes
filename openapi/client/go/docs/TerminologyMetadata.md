# TerminologyMetadata

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AttributeNames** | Pointer to [**map[string]Metadata**](Metadata.md) | the attribute names used by the terminology | [optional] 
**Terminology** | [**Terminology**](Terminology.md) |  | 
**SemanticTypes** | Pointer to [**map[string]Metadata**](Metadata.md) | the semantic types used by the terminology | [optional] 
**AdditionalRelationshipTypes** | Pointer to [**map[string]Metadata**](Metadata.md) | the additional relationship types used by the terminology | [optional] 
**RelationshipTypes** | Pointer to [**map[string]Metadata**](Metadata.md) | the relationship types used by the terminology | [optional] 
**TermTypes** | Pointer to [**map[string]Metadata**](Metadata.md) | the term types used by the terminology | [optional] 
**Languages** | Pointer to [**map[string]Metadata**](Metadata.md) | the languages used by the terminology | [optional] 
**Other** | Pointer to [**map[string]Metadata**](Metadata.md) | miscellaneous terminology metadata (terminology-specific) | [optional] 
**Created** | **time.Time** | the created date | 
**Local** | **bool** | indicates whether this data element was created by local editing | 
**ModifiedBy** | **string** | the identifier of the user who made the last modification | 
**Modified** | **time.Time** | the last modified date | 
**Id** | **string** | the unique identifier | 
**Active** | **bool** | indicates whether or not this data element is active | 

## Methods

### NewTerminologyMetadata

`func NewTerminologyMetadata(terminology Terminology, created time.Time, local bool, modifiedBy string, modified time.Time, id string, active bool, ) *TerminologyMetadata`

NewTerminologyMetadata instantiates a new TerminologyMetadata object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewTerminologyMetadataWithDefaults

`func NewTerminologyMetadataWithDefaults() *TerminologyMetadata`

NewTerminologyMetadataWithDefaults instantiates a new TerminologyMetadata object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAttributeNames

`func (o *TerminologyMetadata) GetAttributeNames() map[string]Metadata`

GetAttributeNames returns the AttributeNames field if non-nil, zero value otherwise.

### GetAttributeNamesOk

`func (o *TerminologyMetadata) GetAttributeNamesOk() (*map[string]Metadata, bool)`

GetAttributeNamesOk returns a tuple with the AttributeNames field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttributeNames

`func (o *TerminologyMetadata) SetAttributeNames(v map[string]Metadata)`

SetAttributeNames sets AttributeNames field to given value.

### HasAttributeNames

`func (o *TerminologyMetadata) HasAttributeNames() bool`

HasAttributeNames returns a boolean if a field has been set.

### GetTerminology

`func (o *TerminologyMetadata) GetTerminology() Terminology`

GetTerminology returns the Terminology field if non-nil, zero value otherwise.

### GetTerminologyOk

`func (o *TerminologyMetadata) GetTerminologyOk() (*Terminology, bool)`

GetTerminologyOk returns a tuple with the Terminology field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTerminology

`func (o *TerminologyMetadata) SetTerminology(v Terminology)`

SetTerminology sets Terminology field to given value.


### GetSemanticTypes

`func (o *TerminologyMetadata) GetSemanticTypes() map[string]Metadata`

GetSemanticTypes returns the SemanticTypes field if non-nil, zero value otherwise.

### GetSemanticTypesOk

`func (o *TerminologyMetadata) GetSemanticTypesOk() (*map[string]Metadata, bool)`

GetSemanticTypesOk returns a tuple with the SemanticTypes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSemanticTypes

`func (o *TerminologyMetadata) SetSemanticTypes(v map[string]Metadata)`

SetSemanticTypes sets SemanticTypes field to given value.

### HasSemanticTypes

`func (o *TerminologyMetadata) HasSemanticTypes() bool`

HasSemanticTypes returns a boolean if a field has been set.

### GetAdditionalRelationshipTypes

`func (o *TerminologyMetadata) GetAdditionalRelationshipTypes() map[string]Metadata`

GetAdditionalRelationshipTypes returns the AdditionalRelationshipTypes field if non-nil, zero value otherwise.

### GetAdditionalRelationshipTypesOk

`func (o *TerminologyMetadata) GetAdditionalRelationshipTypesOk() (*map[string]Metadata, bool)`

GetAdditionalRelationshipTypesOk returns a tuple with the AdditionalRelationshipTypes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdditionalRelationshipTypes

`func (o *TerminologyMetadata) SetAdditionalRelationshipTypes(v map[string]Metadata)`

SetAdditionalRelationshipTypes sets AdditionalRelationshipTypes field to given value.

### HasAdditionalRelationshipTypes

`func (o *TerminologyMetadata) HasAdditionalRelationshipTypes() bool`

HasAdditionalRelationshipTypes returns a boolean if a field has been set.

### GetRelationshipTypes

`func (o *TerminologyMetadata) GetRelationshipTypes() map[string]Metadata`

GetRelationshipTypes returns the RelationshipTypes field if non-nil, zero value otherwise.

### GetRelationshipTypesOk

`func (o *TerminologyMetadata) GetRelationshipTypesOk() (*map[string]Metadata, bool)`

GetRelationshipTypesOk returns a tuple with the RelationshipTypes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRelationshipTypes

`func (o *TerminologyMetadata) SetRelationshipTypes(v map[string]Metadata)`

SetRelationshipTypes sets RelationshipTypes field to given value.

### HasRelationshipTypes

`func (o *TerminologyMetadata) HasRelationshipTypes() bool`

HasRelationshipTypes returns a boolean if a field has been set.

### GetTermTypes

`func (o *TerminologyMetadata) GetTermTypes() map[string]Metadata`

GetTermTypes returns the TermTypes field if non-nil, zero value otherwise.

### GetTermTypesOk

`func (o *TerminologyMetadata) GetTermTypesOk() (*map[string]Metadata, bool)`

GetTermTypesOk returns a tuple with the TermTypes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTermTypes

`func (o *TerminologyMetadata) SetTermTypes(v map[string]Metadata)`

SetTermTypes sets TermTypes field to given value.

### HasTermTypes

`func (o *TerminologyMetadata) HasTermTypes() bool`

HasTermTypes returns a boolean if a field has been set.

### GetLanguages

`func (o *TerminologyMetadata) GetLanguages() map[string]Metadata`

GetLanguages returns the Languages field if non-nil, zero value otherwise.

### GetLanguagesOk

`func (o *TerminologyMetadata) GetLanguagesOk() (*map[string]Metadata, bool)`

GetLanguagesOk returns a tuple with the Languages field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLanguages

`func (o *TerminologyMetadata) SetLanguages(v map[string]Metadata)`

SetLanguages sets Languages field to given value.

### HasLanguages

`func (o *TerminologyMetadata) HasLanguages() bool`

HasLanguages returns a boolean if a field has been set.

### GetOther

`func (o *TerminologyMetadata) GetOther() map[string]Metadata`

GetOther returns the Other field if non-nil, zero value otherwise.

### GetOtherOk

`func (o *TerminologyMetadata) GetOtherOk() (*map[string]Metadata, bool)`

GetOtherOk returns a tuple with the Other field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOther

`func (o *TerminologyMetadata) SetOther(v map[string]Metadata)`

SetOther sets Other field to given value.

### HasOther

`func (o *TerminologyMetadata) HasOther() bool`

HasOther returns a boolean if a field has been set.

### GetCreated

`func (o *TerminologyMetadata) GetCreated() time.Time`

GetCreated returns the Created field if non-nil, zero value otherwise.

### GetCreatedOk

`func (o *TerminologyMetadata) GetCreatedOk() (*time.Time, bool)`

GetCreatedOk returns a tuple with the Created field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreated

`func (o *TerminologyMetadata) SetCreated(v time.Time)`

SetCreated sets Created field to given value.


### GetLocal

`func (o *TerminologyMetadata) GetLocal() bool`

GetLocal returns the Local field if non-nil, zero value otherwise.

### GetLocalOk

`func (o *TerminologyMetadata) GetLocalOk() (*bool, bool)`

GetLocalOk returns a tuple with the Local field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLocal

`func (o *TerminologyMetadata) SetLocal(v bool)`

SetLocal sets Local field to given value.


### GetModifiedBy

`func (o *TerminologyMetadata) GetModifiedBy() string`

GetModifiedBy returns the ModifiedBy field if non-nil, zero value otherwise.

### GetModifiedByOk

`func (o *TerminologyMetadata) GetModifiedByOk() (*string, bool)`

GetModifiedByOk returns a tuple with the ModifiedBy field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModifiedBy

`func (o *TerminologyMetadata) SetModifiedBy(v string)`

SetModifiedBy sets ModifiedBy field to given value.


### GetModified

`func (o *TerminologyMetadata) GetModified() time.Time`

GetModified returns the Modified field if non-nil, zero value otherwise.

### GetModifiedOk

`func (o *TerminologyMetadata) GetModifiedOk() (*time.Time, bool)`

GetModifiedOk returns a tuple with the Modified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModified

`func (o *TerminologyMetadata) SetModified(v time.Time)`

SetModified sets Modified field to given value.


### GetId

`func (o *TerminologyMetadata) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *TerminologyMetadata) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *TerminologyMetadata) SetId(v string)`

SetId sets Id field to given value.


### GetActive

`func (o *TerminologyMetadata) GetActive() bool`

GetActive returns the Active field if non-nil, zero value otherwise.

### GetActiveOk

`func (o *TerminologyMetadata) GetActiveOk() (*bool, bool)`

GetActiveOk returns a tuple with the Active field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetActive

`func (o *TerminologyMetadata) SetActive(v bool)`

SetActive sets Active field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


