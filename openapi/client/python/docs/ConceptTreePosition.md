# ConceptTreePosition

Represents a concept position in a hierarchical tree with a path to the root

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**children** | [**List[ConceptTreePosition]**](ConceptTreePosition.md) | the child tree positions of this node | [optional] 
**level** | **int** | the level of depth in the hierarchy of this node | [optional] 
**ancestor_path** | **str** | the path from the root code expressed as a sequence of dot (.) separated code values starting with the root and ending with the parent code | [optional] 
**code** | **str** | the code in the specified terminology | 
**additional_type** | **str** | the more specific type of relationship (more information about this label is provided in the terminology metadata) | [optional] 
**child_ct** | **int** | the child count of this node | [optional] 
**created** | **datetime** | the created date | 
**local** | **bool** | indicates whether this data element was created by local editing | 
**modified_by** | **str** | the identifier of the user who made the last modification | 
**modified** | **datetime** | the last modified date | 
**id** | **str** | the unique identifier | 
**active** | **bool** | indicates whether or not this data element is active | 
**name** | **str** | the name | 
**terminology** | **str** | the terminology abbreviation | 

## Example

```python
from openapi_client.models.concept_tree_position import ConceptTreePosition

# TODO update the JSON string below
json = "{}"
# create an instance of ConceptTreePosition from a JSON string
concept_tree_position_instance = ConceptTreePosition.from_json(json)
# print the JSON string representation of the object
print ConceptTreePosition.to_json()

# convert the object into a dict
concept_tree_position_dict = concept_tree_position_instance.to_dict()
# create an instance of ConceptTreePosition from a dict
concept_tree_position_form_dict = concept_tree_position.from_dict(concept_tree_position_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


