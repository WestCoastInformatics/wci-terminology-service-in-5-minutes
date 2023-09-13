# Mapping

Represents a mapping from a concept in one terminology to a concept in another

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**group** | **str** | the value for the group this map participates in (for complex maps that use groups) | [optional] 
**category** | **str** | the map category (for RF2-based maps) | [optional] 
**from_terminology** | **str** | the terminology of the &#39;from&#39; code | 
**from_code** | **str** | the &#39;from&#39; code (the left-hand side) | 
**to_terminology** | **str** | the terminology of the &#39;to&#39; code | 
**to_code** | **str** | the &#39;to&#39; code (the left-hand side) | 
**from_name** | **str** | the name of the &#39;from&#39; code | 
**to_name** | **str** | the name of the &#39;to&#39; code | 
**rule** | **str** | the machine-readable map rule for this mapping (for complex maps that use rules) | [optional] 
**mapset_code** | **str** | the code of the mapset containing this mapping | 
**advice** | **str** | the map advice | [optional] 
**priority** | **str** | the value for the priority of this map within its group (for complex maps that use groups) | [optional] 
**created** | **datetime** | the created date | 
**local** | **bool** | indicates whether this data element was created by local editing | 
**modified_by** | **str** | the identifier of the user who made the last modification | 
**modified** | **datetime** | the last modified date | 
**id** | **str** | the unique identifier | 
**active** | **bool** | indicates whether or not this data element is active | 
**attributes** | **Dict[str, str]** | key/value pairs associated with this object. Entries in this map are terminology-specific | [optional] 

## Example

```python
from openapi_client.models.mapping import Mapping

# TODO update the JSON string below
json = "{}"
# create an instance of Mapping from a JSON string
mapping_instance = Mapping.from_json(json)
# print the JSON string representation of the object
print Mapping.to_json()

# convert the object into a dict
mapping_dict = mapping_instance.to_dict()
# create an instance of Mapping from a dict
mapping_form_dict = mapping.from_dict(mapping_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


