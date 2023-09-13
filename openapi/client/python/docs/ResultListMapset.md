# ResultListMapset


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**total** | **int** | the total number of potential results | 
**limit** | **int** | the max number results requested | 
**offset** | **int** | the starting index requested | 
**confidence** | **float** | the score of the search result, when used | [optional] 
**items** | [**List[Mapset]**](Mapset.md) | the items themselves (the format will vary depending on the type of list) | 

## Example

```python
from openapi_client.models.result_list_mapset import ResultListMapset

# TODO update the JSON string below
json = "{}"
# create an instance of ResultListMapset from a JSON string
result_list_mapset_instance = ResultListMapset.from_json(json)
# print the JSON string representation of the object
print ResultListMapset.to_json()

# convert the object into a dict
result_list_mapset_dict = result_list_mapset_instance.to_dict()
# create an instance of ResultListMapset from a dict
result_list_mapset_form_dict = result_list_mapset.from_dict(result_list_mapset_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


