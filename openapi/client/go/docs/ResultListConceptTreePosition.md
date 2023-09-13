# ResultListConceptTreePosition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Total** | **int32** | the total number of potential results | 
**Limit** | **int32** | the max number results requested | 
**Offset** | **int32** | the starting index requested | 
**Confidence** | Pointer to **float64** | the score of the search result, when used | [optional] 
**Items** | [**[]ConceptTreePosition**](ConceptTreePosition.md) | the items themselves (the format will vary depending on the type of list) | 

## Methods

### NewResultListConceptTreePosition

`func NewResultListConceptTreePosition(total int32, limit int32, offset int32, items []ConceptTreePosition, ) *ResultListConceptTreePosition`

NewResultListConceptTreePosition instantiates a new ResultListConceptTreePosition object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewResultListConceptTreePositionWithDefaults

`func NewResultListConceptTreePositionWithDefaults() *ResultListConceptTreePosition`

NewResultListConceptTreePositionWithDefaults instantiates a new ResultListConceptTreePosition object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetTotal

`func (o *ResultListConceptTreePosition) GetTotal() int32`

GetTotal returns the Total field if non-nil, zero value otherwise.

### GetTotalOk

`func (o *ResultListConceptTreePosition) GetTotalOk() (*int32, bool)`

GetTotalOk returns a tuple with the Total field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotal

`func (o *ResultListConceptTreePosition) SetTotal(v int32)`

SetTotal sets Total field to given value.


### GetLimit

`func (o *ResultListConceptTreePosition) GetLimit() int32`

GetLimit returns the Limit field if non-nil, zero value otherwise.

### GetLimitOk

`func (o *ResultListConceptTreePosition) GetLimitOk() (*int32, bool)`

GetLimitOk returns a tuple with the Limit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLimit

`func (o *ResultListConceptTreePosition) SetLimit(v int32)`

SetLimit sets Limit field to given value.


### GetOffset

`func (o *ResultListConceptTreePosition) GetOffset() int32`

GetOffset returns the Offset field if non-nil, zero value otherwise.

### GetOffsetOk

`func (o *ResultListConceptTreePosition) GetOffsetOk() (*int32, bool)`

GetOffsetOk returns a tuple with the Offset field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOffset

`func (o *ResultListConceptTreePosition) SetOffset(v int32)`

SetOffset sets Offset field to given value.


### GetConfidence

`func (o *ResultListConceptTreePosition) GetConfidence() float64`

GetConfidence returns the Confidence field if non-nil, zero value otherwise.

### GetConfidenceOk

`func (o *ResultListConceptTreePosition) GetConfidenceOk() (*float64, bool)`

GetConfidenceOk returns a tuple with the Confidence field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConfidence

`func (o *ResultListConceptTreePosition) SetConfidence(v float64)`

SetConfidence sets Confidence field to given value.

### HasConfidence

`func (o *ResultListConceptTreePosition) HasConfidence() bool`

HasConfidence returns a boolean if a field has been set.

### GetItems

`func (o *ResultListConceptTreePosition) GetItems() []ConceptTreePosition`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *ResultListConceptTreePosition) GetItemsOk() (*[]ConceptTreePosition, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *ResultListConceptTreePosition) SetItems(v []ConceptTreePosition)`

SetItems sets Items field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


