# Mapset

Represents a set of mappings from a concept in one terminology to a concept in another

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **str** | the code in the specified terminology | 
**mapped_to_terminology** | **str** | the target terminology of this map set | 
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
from openapi_client.models.mapset import Mapset

# TODO update the JSON string below
json = "{}"
# create an instance of Mapset from a JSON string
mapset_instance = Mapset.from_json(json)
# print the JSON string representation of the object
print Mapset.to_json()

# convert the object into a dict
mapset_dict = mapset_instance.to_dict()
# create an instance of Mapset from a dict
mapset_form_dict = mapset.from_dict(mapset_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


