# Subset

Represents a subset of concepts in a terminology grouped for a particular reason or use case

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **str** | the subset code | 
**member_ids** | **List[str]** | the codes for members of the subset | [optional] 
**created** | **datetime** | the created date | 
**local** | **bool** | indicates whether this data element was created by local editing | 
**modified_by** | **str** | the identifier of the user who made the last modification | 
**modified** | **datetime** | the last modified date | 
**id** | **str** | the unique identifier | 
**active** | **bool** | indicates whether or not this data element is active | 
**name** | **str** | the name | 
**terminology** | **str** | the terminology abbreviation | 
**attributes** | **Dict[str, str]** | key/value pairs associated with this object. Entries in this map are terminology-specific | [optional] 

## Example

```python
from openapi_client.models.subset import Subset

# TODO update the JSON string below
json = "{}"
# create an instance of Subset from a JSON string
subset_instance = Subset.from_json(json)
# print the JSON string representation of the object
print Subset.to_json()

# convert the object into a dict
subset_dict = subset_instance.to_dict()
# create an instance of Subset from a dict
subset_form_dict = subset.from_dict(subset_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


