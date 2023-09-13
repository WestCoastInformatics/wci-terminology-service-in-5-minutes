# ConceptRelationship

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Hierarchical** | **bool** | indicates whether this relationship is part of the hierarchy | 
**Type** | **string** | the high level type of relationship (more information about this label is provided in the terminology metadata) | 
**Group** | Pointer to **string** | used by terminologies that group relationships (e.g. SNOMEDCT) to indicate the group value | [optional] 
**AssertedDirection** | **bool** | indicates whether this relationship is in the direction asserted by the terminology. This is meaninful because in some instances relationships are loaded in both directions | 
**AdditionalType** | Pointer to **string** | the more specific type of relationship (more information about this label is provided in the terminology metadata) | [optional] 
**Defining** | **bool** | indicates whether this is a relationship is part of the concept logical definition | 
**ToTerminology** | Pointer to **string** | the terminology of the concept this relationship is to (the right-hand side). If this is not used, the relationship will have a &#39;toValue&#39; | [optional] 
**ToCode** | Pointer to **string** | the code of the concept this relationship is to (the right-hand side). If this is not used, the relationship will have a &#39;toValue&#39; | [optional] 
**ToValue** | Pointer to **string** | the literal value relationship is to (the right-hand side). If this is null, the relationship will have a &#39;to&#39; | [optional] 
**ToName** | Pointer to **string** | the name of the concept this relationship is to (the right-hand side). If this is not used, the relationship will have a &#39;toValue&#39; | [optional] 
**Created** | **time.Time** | the created date | 
**Local** | **bool** | indicates whether this data element was created by local editing | 
**ModifiedBy** | **string** | the identifier of the user who made the last modification | 
**Modified** | **time.Time** | the last modified date | 
**Id** | **string** | the unique identifier | 
**Active** | **bool** | indicates whether or not this data element is active | 
**TerminologyId** | Pointer to **string** | the identifier asserted by the terminology | [optional] 
**Terminology** | **string** | the terminology abbreviation | 

## Methods

### NewConceptRelationship

`func NewConceptRelationship(hierarchical bool, type_ string, assertedDirection bool, defining bool, created time.Time, local bool, modifiedBy string, modified time.Time, id string, active bool, terminology string, ) *ConceptRelationship`

NewConceptRelationship instantiates a new ConceptRelationship object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewConceptRelationshipWithDefaults

`func NewConceptRelationshipWithDefaults() *ConceptRelationship`

NewConceptRelationshipWithDefaults instantiates a new ConceptRelationship object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetHierarchical

`func (o *ConceptRelationship) GetHierarchical() bool`

GetHierarchical returns the Hierarchical field if non-nil, zero value otherwise.

### GetHierarchicalOk

`func (o *ConceptRelationship) GetHierarchicalOk() (*bool, bool)`

GetHierarchicalOk returns a tuple with the Hierarchical field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHierarchical

`func (o *ConceptRelationship) SetHierarchical(v bool)`

SetHierarchical sets Hierarchical field to given value.


### GetType

`func (o *ConceptRelationship) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *ConceptRelationship) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *ConceptRelationship) SetType(v string)`

SetType sets Type field to given value.


### GetGroup

`func (o *ConceptRelationship) GetGroup() string`

GetGroup returns the Group field if non-nil, zero value otherwise.

### GetGroupOk

`func (o *ConceptRelationship) GetGroupOk() (*string, bool)`

GetGroupOk returns a tuple with the Group field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroup

`func (o *ConceptRelationship) SetGroup(v string)`

SetGroup sets Group field to given value.

### HasGroup

`func (o *ConceptRelationship) HasGroup() bool`

HasGroup returns a boolean if a field has been set.

### GetAssertedDirection

`func (o *ConceptRelationship) GetAssertedDirection() bool`

GetAssertedDirection returns the AssertedDirection field if non-nil, zero value otherwise.

### GetAssertedDirectionOk

`func (o *ConceptRelationship) GetAssertedDirectionOk() (*bool, bool)`

GetAssertedDirectionOk returns a tuple with the AssertedDirection field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssertedDirection

`func (o *ConceptRelationship) SetAssertedDirection(v bool)`

SetAssertedDirection sets AssertedDirection field to given value.


### GetAdditionalType

`func (o *ConceptRelationship) GetAdditionalType() string`

GetAdditionalType returns the AdditionalType field if non-nil, zero value otherwise.

### GetAdditionalTypeOk

`func (o *ConceptRelationship) GetAdditionalTypeOk() (*string, bool)`

GetAdditionalTypeOk returns a tuple with the AdditionalType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdditionalType

`func (o *ConceptRelationship) SetAdditionalType(v string)`

SetAdditionalType sets AdditionalType field to given value.

### HasAdditionalType

`func (o *ConceptRelationship) HasAdditionalType() bool`

HasAdditionalType returns a boolean if a field has been set.

### GetDefining

`func (o *ConceptRelationship) GetDefining() bool`

GetDefining returns the Defining field if non-nil, zero value otherwise.

### GetDefiningOk

`func (o *ConceptRelationship) GetDefiningOk() (*bool, bool)`

GetDefiningOk returns a tuple with the Defining field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefining

`func (o *ConceptRelationship) SetDefining(v bool)`

SetDefining sets Defining field to given value.


### GetToTerminology

`func (o *ConceptRelationship) GetToTerminology() string`

GetToTerminology returns the ToTerminology field if non-nil, zero value otherwise.

### GetToTerminologyOk

`func (o *ConceptRelationship) GetToTerminologyOk() (*string, bool)`

GetToTerminologyOk returns a tuple with the ToTerminology field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetToTerminology

`func (o *ConceptRelationship) SetToTerminology(v string)`

SetToTerminology sets ToTerminology field to given value.

### HasToTerminology

`func (o *ConceptRelationship) HasToTerminology() bool`

HasToTerminology returns a boolean if a field has been set.

### GetToCode

`func (o *ConceptRelationship) GetToCode() string`

GetToCode returns the ToCode field if non-nil, zero value otherwise.

### GetToCodeOk

`func (o *ConceptRelationship) GetToCodeOk() (*string, bool)`

GetToCodeOk returns a tuple with the ToCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetToCode

`func (o *ConceptRelationship) SetToCode(v string)`

SetToCode sets ToCode field to given value.

### HasToCode

`func (o *ConceptRelationship) HasToCode() bool`

HasToCode returns a boolean if a field has been set.

### GetToValue

`func (o *ConceptRelationship) GetToValue() string`

GetToValue returns the ToValue field if non-nil, zero value otherwise.

### GetToValueOk

`func (o *ConceptRelationship) GetToValueOk() (*string, bool)`

GetToValueOk returns a tuple with the ToValue field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetToValue

`func (o *ConceptRelationship) SetToValue(v string)`

SetToValue sets ToValue field to given value.

### HasToValue

`func (o *ConceptRelationship) HasToValue() bool`

HasToValue returns a boolean if a field has been set.

### GetToName

`func (o *ConceptRelationship) GetToName() string`

GetToName returns the ToName field if non-nil, zero value otherwise.

### GetToNameOk

`func (o *ConceptRelationship) GetToNameOk() (*string, bool)`

GetToNameOk returns a tuple with the ToName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetToName

`func (o *ConceptRelationship) SetToName(v string)`

SetToName sets ToName field to given value.

### HasToName

`func (o *ConceptRelationship) HasToName() bool`

HasToName returns a boolean if a field has been set.

### GetCreated

`func (o *ConceptRelationship) GetCreated() time.Time`

GetCreated returns the Created field if non-nil, zero value otherwise.

### GetCreatedOk

`func (o *ConceptRelationship) GetCreatedOk() (*time.Time, bool)`

GetCreatedOk returns a tuple with the Created field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreated

`func (o *ConceptRelationship) SetCreated(v time.Time)`

SetCreated sets Created field to given value.


### GetLocal

`func (o *ConceptRelationship) GetLocal() bool`

GetLocal returns the Local field if non-nil, zero value otherwise.

### GetLocalOk

`func (o *ConceptRelationship) GetLocalOk() (*bool, bool)`

GetLocalOk returns a tuple with the Local field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLocal

`func (o *ConceptRelationship) SetLocal(v bool)`

SetLocal sets Local field to given value.


### GetModifiedBy

`func (o *ConceptRelationship) GetModifiedBy() string`

GetModifiedBy returns the ModifiedBy field if non-nil, zero value otherwise.

### GetModifiedByOk

`func (o *ConceptRelationship) GetModifiedByOk() (*string, bool)`

GetModifiedByOk returns a tuple with the ModifiedBy field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModifiedBy

`func (o *ConceptRelationship) SetModifiedBy(v string)`

SetModifiedBy sets ModifiedBy field to given value.


### GetModified

`func (o *ConceptRelationship) GetModified() time.Time`

GetModified returns the Modified field if non-nil, zero value otherwise.

### GetModifiedOk

`func (o *ConceptRelationship) GetModifiedOk() (*time.Time, bool)`

GetModifiedOk returns a tuple with the Modified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModified

`func (o *ConceptRelationship) SetModified(v time.Time)`

SetModified sets Modified field to given value.


### GetId

`func (o *ConceptRelationship) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ConceptRelationship) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ConceptRelationship) SetId(v string)`

SetId sets Id field to given value.


### GetActive

`func (o *ConceptRelationship) GetActive() bool`

GetActive returns the Active field if non-nil, zero value otherwise.

### GetActiveOk

`func (o *ConceptRelationship) GetActiveOk() (*bool, bool)`

GetActiveOk returns a tuple with the Active field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetActive

`func (o *ConceptRelationship) SetActive(v bool)`

SetActive sets Active field to given value.


### GetTerminologyId

`func (o *ConceptRelationship) GetTerminologyId() string`

GetTerminologyId returns the TerminologyId field if non-nil, zero value otherwise.

### GetTerminologyIdOk

`func (o *ConceptRelationship) GetTerminologyIdOk() (*string, bool)`

GetTerminologyIdOk returns a tuple with the TerminologyId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTerminologyId

`func (o *ConceptRelationship) SetTerminologyId(v string)`

SetTerminologyId sets TerminologyId field to given value.

### HasTerminologyId

`func (o *ConceptRelationship) HasTerminologyId() bool`

HasTerminologyId returns a boolean if a field has been set.

### GetTerminology

`func (o *ConceptRelationship) GetTerminology() string`

GetTerminology returns the Terminology field if non-nil, zero value otherwise.

### GetTerminologyOk

`func (o *ConceptRelationship) GetTerminologyOk() (*string, bool)`

GetTerminologyOk returns a tuple with the Terminology field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTerminology

`func (o *ConceptRelationship) SetTerminology(v string)`

SetTerminology sets Terminology field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


