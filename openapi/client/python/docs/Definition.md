# Definition

Represents a textual definition for a concept

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **str** | the code in the specified terminology | 
**locale_map** | **Dict[str, bool]** | a map of language codes to boolean values indicated whether this definition is preferred in that language context | 
**value** | **str** | the definition value itself | 
**created** | **datetime** | the created date | 
**local** | **bool** | indicates whether this data element was created by local editing | 
**modified_by** | **str** | the identifier of the user who made the last modification | 
**modified** | **datetime** | the last modified date | 
**id** | **str** | the unique identifier | 
**active** | **bool** | indicates whether or not this data element is active | 
**terminology** | **str** | the terminology abbreviation | 

## Example

```python
from openapi_client.models.definition import Definition

# TODO update the JSON string below
json = "{}"
# create an instance of Definition from a JSON string
definition_instance = Definition.from_json(json)
# print the JSON string representation of the object
print Definition.to_json()

# convert the object into a dict
definition_dict = definition_instance.to_dict()
# create an instance of Definition from a dict
definition_form_dict = definition.from_dict(definition_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


