# ResultListConcept

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Total** | **int32** | the total number of potential results | 
**Limit** | **int32** | the max number results requested | 
**Offset** | **int32** | the starting index requested | 
**Confidence** | Pointer to **float64** | the score of the search result, when used | [optional] 
**Items** | [**[]Concept**](Concept.md) | the items themselves (the format will vary depending on the type of list) | 

## Methods

### NewResultListConcept

`func NewResultListConcept(total int32, limit int32, offset int32, items []Concept, ) *ResultListConcept`

NewResultListConcept instantiates a new ResultListConcept object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewResultListConceptWithDefaults

`func NewResultListConceptWithDefaults() *ResultListConcept`

NewResultListConceptWithDefaults instantiates a new ResultListConcept object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetTotal

`func (o *ResultListConcept) GetTotal() int32`

GetTotal returns the Total field if non-nil, zero value otherwise.

### GetTotalOk

`func (o *ResultListConcept) GetTotalOk() (*int32, bool)`

GetTotalOk returns a tuple with the Total field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotal

`func (o *ResultListConcept) SetTotal(v int32)`

SetTotal sets Total field to given value.


### GetLimit

`func (o *ResultListConcept) GetLimit() int32`

GetLimit returns the Limit field if non-nil, zero value otherwise.

### GetLimitOk

`func (o *ResultListConcept) GetLimitOk() (*int32, bool)`

GetLimitOk returns a tuple with the Limit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLimit

`func (o *ResultListConcept) SetLimit(v int32)`

SetLimit sets Limit field to given value.


### GetOffset

`func (o *ResultListConcept) GetOffset() int32`

GetOffset returns the Offset field if non-nil, zero value otherwise.

### GetOffsetOk

`func (o *ResultListConcept) GetOffsetOk() (*int32, bool)`

GetOffsetOk returns a tuple with the Offset field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOffset

`func (o *ResultListConcept) SetOffset(v int32)`

SetOffset sets Offset field to given value.


### GetConfidence

`func (o *ResultListConcept) GetConfidence() float64`

GetConfidence returns the Confidence field if non-nil, zero value otherwise.

### GetConfidenceOk

`func (o *ResultListConcept) GetConfidenceOk() (*float64, bool)`

GetConfidenceOk returns a tuple with the Confidence field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConfidence

`func (o *ResultListConcept) SetConfidence(v float64)`

SetConfidence sets Confidence field to given value.

### HasConfidence

`func (o *ResultListConcept) HasConfidence() bool`

HasConfidence returns a boolean if a field has been set.

### GetItems

`func (o *ResultListConcept) GetItems() []Concept`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *ResultListConcept) GetItemsOk() (*[]Concept, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *ResultListConcept) SetItems(v []Concept)`

SetItems sets Items field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


