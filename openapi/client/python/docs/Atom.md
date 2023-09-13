# Atom

Represents a name with a term type that contributes meaning to a concept

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code_id** | **str** | the code in the specified terminology | 
**locale_map** | **Dict[str, bool]** | a map of language codes to boolean values indicated whether this definition is preferred in that language context | 
**concept_id** | **str** | the concept id (for terminologies that use concepts) | [optional] 
**descriptor_id** | **str** | the descriptor id (for terminologies that use descriptors) | [optional] 
**term_type** | **str** | the term type | 
**created** | **datetime** | the created date | 
**local** | **bool** | indicates whether this data element was created by local editing | 
**modified_by** | **str** | the identifier of the user who made the last modification | 
**modified** | **datetime** | the last modified date | 
**id** | **str** | the unique identifier | 
**active** | **bool** | indicates whether or not this data element is active | 
**name** | **str** | the name | 
**terminology_id** | **str** | the identifier asserted by the terminology | [optional] 
**terminology** | **str** | the terminology abbreviation | 
**attributes** | **Dict[str, str]** | key/value pairs associated with this object. Entries in this map are terminology-specific | [optional] 

## Example

```python
from openapi_client.models.atom import Atom

# TODO update the JSON string below
json = "{}"
# create an instance of Atom from a JSON string
atom_instance = Atom.from_json(json)
# print the JSON string representation of the object
print Atom.to_json()

# convert the object into a dict
atom_dict = atom_instance.to_dict()
# create an instance of Atom from a dict
atom_form_dict = atom.from_dict(atom_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


