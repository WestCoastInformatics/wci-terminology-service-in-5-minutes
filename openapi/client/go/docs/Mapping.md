# Mapping

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Group** | Pointer to **string** | the value for the group this map participates in (for complex maps that use groups) | [optional] 
**Category** | Pointer to **string** | the map category (for RF2-based maps) | [optional] 
**FromTerminology** | **string** | the terminology of the &#39;from&#39; code | 
**FromCode** | **string** | the &#39;from&#39; code (the left-hand side) | 
**ToTerminology** | **string** | the terminology of the &#39;to&#39; code | 
**ToCode** | **string** | the &#39;to&#39; code (the left-hand side) | 
**FromName** | **string** | the name of the &#39;from&#39; code | 
**ToName** | **string** | the name of the &#39;to&#39; code | 
**Rule** | Pointer to **string** | the machine-readable map rule for this mapping (for complex maps that use rules) | [optional] 
**MapsetCode** | **string** | the code of the mapset containing this mapping | 
**Advice** | Pointer to **string** | the map advice | [optional] 
**Priority** | Pointer to **string** | the value for the priority of this map within its group (for complex maps that use groups) | [optional] 
**Created** | **time.Time** | the created date | 
**Local** | **bool** | indicates whether this data element was created by local editing | 
**ModifiedBy** | **string** | the identifier of the user who made the last modification | 
**Modified** | **time.Time** | the last modified date | 
**Id** | **string** | the unique identifier | 
**Active** | **bool** | indicates whether or not this data element is active | 
**Attributes** | Pointer to **map[string]string** | key/value pairs associated with this object. Entries in this map are terminology-specific | [optional] 

## Methods

### NewMapping

`func NewMapping(fromTerminology string, fromCode string, toTerminology string, toCode string, fromName string, toName string, mapsetCode string, created time.Time, local bool, modifiedBy string, modified time.Time, id string, active bool, ) *Mapping`

NewMapping instantiates a new Mapping object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMappingWithDefaults

`func NewMappingWithDefaults() *Mapping`

NewMappingWithDefaults instantiates a new Mapping object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetGroup

`func (o *Mapping) GetGroup() string`

GetGroup returns the Group field if non-nil, zero value otherwise.

### GetGroupOk

`func (o *Mapping) GetGroupOk() (*string, bool)`

GetGroupOk returns a tuple with the Group field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroup

`func (o *Mapping) SetGroup(v string)`

SetGroup sets Group field to given value.

### HasGroup

`func (o *Mapping) HasGroup() bool`

HasGroup returns a boolean if a field has been set.

### GetCategory

`func (o *Mapping) GetCategory() string`

GetCategory returns the Category field if non-nil, zero value otherwise.

### GetCategoryOk

`func (o *Mapping) GetCategoryOk() (*string, bool)`

GetCategoryOk returns a tuple with the Category field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCategory

`func (o *Mapping) SetCategory(v string)`

SetCategory sets Category field to given value.

### HasCategory

`func (o *Mapping) HasCategory() bool`

HasCategory returns a boolean if a field has been set.

### GetFromTerminology

`func (o *Mapping) GetFromTerminology() string`

GetFromTerminology returns the FromTerminology field if non-nil, zero value otherwise.

### GetFromTerminologyOk

`func (o *Mapping) GetFromTerminologyOk() (*string, bool)`

GetFromTerminologyOk returns a tuple with the FromTerminology field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFromTerminology

`func (o *Mapping) SetFromTerminology(v string)`

SetFromTerminology sets FromTerminology field to given value.


### GetFromCode

`func (o *Mapping) GetFromCode() string`

GetFromCode returns the FromCode field if non-nil, zero value otherwise.

### GetFromCodeOk

`func (o *Mapping) GetFromCodeOk() (*string, bool)`

GetFromCodeOk returns a tuple with the FromCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFromCode

`func (o *Mapping) SetFromCode(v string)`

SetFromCode sets FromCode field to given value.


### GetToTerminology

`func (o *Mapping) GetToTerminology() string`

GetToTerminology returns the ToTerminology field if non-nil, zero value otherwise.

### GetToTerminologyOk

`func (o *Mapping) GetToTerminologyOk() (*string, bool)`

GetToTerminologyOk returns a tuple with the ToTerminology field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetToTerminology

`func (o *Mapping) SetToTerminology(v string)`

SetToTerminology sets ToTerminology field to given value.


### GetToCode

`func (o *Mapping) GetToCode() string`

GetToCode returns the ToCode field if non-nil, zero value otherwise.

### GetToCodeOk

`func (o *Mapping) GetToCodeOk() (*string, bool)`

GetToCodeOk returns a tuple with the ToCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetToCode

`func (o *Mapping) SetToCode(v string)`

SetToCode sets ToCode field to given value.


### GetFromName

`func (o *Mapping) GetFromName() string`

GetFromName returns the FromName field if non-nil, zero value otherwise.

### GetFromNameOk

`func (o *Mapping) GetFromNameOk() (*string, bool)`

GetFromNameOk returns a tuple with the FromName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFromName

`func (o *Mapping) SetFromName(v string)`

SetFromName sets FromName field to given value.


### GetToName

`func (o *Mapping) GetToName() string`

GetToName returns the ToName field if non-nil, zero value otherwise.

### GetToNameOk

`func (o *Mapping) GetToNameOk() (*string, bool)`

GetToNameOk returns a tuple with the ToName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetToName

`func (o *Mapping) SetToName(v string)`

SetToName sets ToName field to given value.


### GetRule

`func (o *Mapping) GetRule() string`

GetRule returns the Rule field if non-nil, zero value otherwise.

### GetRuleOk

`func (o *Mapping) GetRuleOk() (*string, bool)`

GetRuleOk returns a tuple with the Rule field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRule

`func (o *Mapping) SetRule(v string)`

SetRule sets Rule field to given value.

### HasRule

`func (o *Mapping) HasRule() bool`

HasRule returns a boolean if a field has been set.

### GetMapsetCode

`func (o *Mapping) GetMapsetCode() string`

GetMapsetCode returns the MapsetCode field if non-nil, zero value otherwise.

### GetMapsetCodeOk

`func (o *Mapping) GetMapsetCodeOk() (*string, bool)`

GetMapsetCodeOk returns a tuple with the MapsetCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMapsetCode

`func (o *Mapping) SetMapsetCode(v string)`

SetMapsetCode sets MapsetCode field to given value.


### GetAdvice

`func (o *Mapping) GetAdvice() string`

GetAdvice returns the Advice field if non-nil, zero value otherwise.

### GetAdviceOk

`func (o *Mapping) GetAdviceOk() (*string, bool)`

GetAdviceOk returns a tuple with the Advice field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdvice

`func (o *Mapping) SetAdvice(v string)`

SetAdvice sets Advice field to given value.

### HasAdvice

`func (o *Mapping) HasAdvice() bool`

HasAdvice returns a boolean if a field has been set.

### GetPriority

`func (o *Mapping) GetPriority() string`

GetPriority returns the Priority field if non-nil, zero value otherwise.

### GetPriorityOk

`func (o *Mapping) GetPriorityOk() (*string, bool)`

GetPriorityOk returns a tuple with the Priority field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPriority

`func (o *Mapping) SetPriority(v string)`

SetPriority sets Priority field to given value.

### HasPriority

`func (o *Mapping) HasPriority() bool`

HasPriority returns a boolean if a field has been set.

### GetCreated

`func (o *Mapping) GetCreated() time.Time`

GetCreated returns the Created field if non-nil, zero value otherwise.

### GetCreatedOk

`func (o *Mapping) GetCreatedOk() (*time.Time, bool)`

GetCreatedOk returns a tuple with the Created field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreated

`func (o *Mapping) SetCreated(v time.Time)`

SetCreated sets Created field to given value.


### GetLocal

`func (o *Mapping) GetLocal() bool`

GetLocal returns the Local field if non-nil, zero value otherwise.

### GetLocalOk

`func (o *Mapping) GetLocalOk() (*bool, bool)`

GetLocalOk returns a tuple with the Local field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLocal

`func (o *Mapping) SetLocal(v bool)`

SetLocal sets Local field to given value.


### GetModifiedBy

`func (o *Mapping) GetModifiedBy() string`

GetModifiedBy returns the ModifiedBy field if non-nil, zero value otherwise.

### GetModifiedByOk

`func (o *Mapping) GetModifiedByOk() (*string, bool)`

GetModifiedByOk returns a tuple with the ModifiedBy field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModifiedBy

`func (o *Mapping) SetModifiedBy(v string)`

SetModifiedBy sets ModifiedBy field to given value.


### GetModified

`func (o *Mapping) GetModified() time.Time`

GetModified returns the Modified field if non-nil, zero value otherwise.

### GetModifiedOk

`func (o *Mapping) GetModifiedOk() (*time.Time, bool)`

GetModifiedOk returns a tuple with the Modified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModified

`func (o *Mapping) SetModified(v time.Time)`

SetModified sets Modified field to given value.


### GetId

`func (o *Mapping) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *Mapping) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *Mapping) SetId(v string)`

SetId sets Id field to given value.


### GetActive

`func (o *Mapping) GetActive() bool`

GetActive returns the Active field if non-nil, zero value otherwise.

### GetActiveOk

`func (o *Mapping) GetActiveOk() (*bool, bool)`

GetActiveOk returns a tuple with the Active field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetActive

`func (o *Mapping) SetActive(v bool)`

SetActive sets Active field to given value.


### GetAttributes

`func (o *Mapping) GetAttributes() map[string]string`

GetAttributes returns the Attributes field if non-nil, zero value otherwise.

### GetAttributesOk

`func (o *Mapping) GetAttributesOk() (*map[string]string, bool)`

GetAttributesOk returns a tuple with the Attributes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttributes

`func (o *Mapping) SetAttributes(v map[string]string)`

SetAttributes sets Attributes field to given value.

### HasAttributes

`func (o *Mapping) HasAttributes() bool`

HasAttributes returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


