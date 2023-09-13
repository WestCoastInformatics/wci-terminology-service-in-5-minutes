# Metadata

Represents a named metadata entry

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | the type of metadata | 
**abbreviation** | **str** | the label for the metadata element | 
**rank** | **int** | used for when metadata lists need to be ranked (as in a ranked list of term types) | [optional] 
**name** | **str** | the name | 
**terminology** | **str** | the terminology abbreviation | 
**attributes** | **Dict[str, str]** | key/value pairs associated with this object. Entries in this map are terminology-specific | [optional] 
**created** | **datetime** | the created date | 
**local** | **bool** | indicates whether this data element was created by local editing | 
**modified_by** | **str** | the identifier of the user who made the last modification | 
**modified** | **datetime** | the last modified date | 
**id** | **str** | the unique identifier | 
**active** | **bool** | indicates whether or not this data element is active | 

## Example

```python
from openapi_client.models.metadata import Metadata

# TODO update the JSON string below
json = "{}"
# create an instance of Metadata from a JSON string
metadata_instance = Metadata.from_json(json)
# print the JSON string representation of the object
print Metadata.to_json()

# convert the object into a dict
metadata_dict = metadata_instance.to_dict()
# create an instance of Metadata from a dict
metadata_form_dict = metadata.from_dict(metadata_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


