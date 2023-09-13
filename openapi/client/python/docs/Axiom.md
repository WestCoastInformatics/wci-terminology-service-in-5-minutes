# Axiom

the axioms associated with this concept

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **str** |  | [optional] 
**value** | **str** |  | [optional] 
**created** | **datetime** | the created date | 
**local** | **bool** | indicates whether this data element was created by local editing | 
**modified_by** | **str** | the identifier of the user who made the last modification | 
**modified** | **datetime** | the last modified date | 
**id** | **str** | the unique identifier | 
**active** | **bool** | indicates whether or not this data element is active | 
**terminology** | **str** | the terminology abbreviation | 

## Example

```python
from openapi_client.models.axiom import Axiom

# TODO update the JSON string below
json = "{}"
# create an instance of Axiom from a JSON string
axiom_instance = Axiom.from_json(json)
# print the JSON string representation of the object
print Axiom.to_json()

# convert the object into a dict
axiom_dict = axiom_instance.to_dict()
# create an instance of Axiom from a dict
axiom_form_dict = axiom.from_dict(axiom_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


