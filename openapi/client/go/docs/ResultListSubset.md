# ResultListSubset

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Total** | **int32** | the total number of potential results | 
**Limit** | **int32** | the max number results requested | 
**Offset** | **int32** | the starting index requested | 
**Confidence** | Pointer to **float64** | the score of the search result, when used | [optional] 
**Items** | [**[]Subset**](Subset.md) | the items themselves (the format will vary depending on the type of list) | 

## Methods

### NewResultListSubset

`func NewResultListSubset(total int32, limit int32, offset int32, items []Subset, ) *ResultListSubset`

NewResultListSubset instantiates a new ResultListSubset object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewResultListSubsetWithDefaults

`func NewResultListSubsetWithDefaults() *ResultListSubset`

NewResultListSubsetWithDefaults instantiates a new ResultListSubset object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetTotal

`func (o *ResultListSubset) GetTotal() int32`

GetTotal returns the Total field if non-nil, zero value otherwise.

### GetTotalOk

`func (o *ResultListSubset) GetTotalOk() (*int32, bool)`

GetTotalOk returns a tuple with the Total field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotal

`func (o *ResultListSubset) SetTotal(v int32)`

SetTotal sets Total field to given value.


### GetLimit

`func (o *ResultListSubset) GetLimit() int32`

GetLimit returns the Limit field if non-nil, zero value otherwise.

### GetLimitOk

`func (o *ResultListSubset) GetLimitOk() (*int32, bool)`

GetLimitOk returns a tuple with the Limit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLimit

`func (o *ResultListSubset) SetLimit(v int32)`

SetLimit sets Limit field to given value.


### GetOffset

`func (o *ResultListSubset) GetOffset() int32`

GetOffset returns the Offset field if non-nil, zero value otherwise.

### GetOffsetOk

`func (o *ResultListSubset) GetOffsetOk() (*int32, bool)`

GetOffsetOk returns a tuple with the Offset field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOffset

`func (o *ResultListSubset) SetOffset(v int32)`

SetOffset sets Offset field to given value.


### GetConfidence

`func (o *ResultListSubset) GetConfidence() float64`

GetConfidence returns the Confidence field if non-nil, zero value otherwise.

### GetConfidenceOk

`func (o *ResultListSubset) GetConfidenceOk() (*float64, bool)`

GetConfidenceOk returns a tuple with the Confidence field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConfidence

`func (o *ResultListSubset) SetConfidence(v float64)`

SetConfidence sets Confidence field to given value.

### HasConfidence

`func (o *ResultListSubset) HasConfidence() bool`

HasConfidence returns a boolean if a field has been set.

### GetItems

`func (o *ResultListSubset) GetItems() []Subset`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *ResultListSubset) GetItemsOk() (*[]Subset, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *ResultListSubset) SetItems(v []Subset)`

SetItems sets Items field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


