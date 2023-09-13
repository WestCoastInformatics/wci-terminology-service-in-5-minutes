# Concept

Represents a concept with a code in a terminology

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **str** | the code in the specified terminology | 
**atoms** | [**List[Atom]**](Atom.md) | the names associated with this concept | 
**semantic_types** | **List[str]** | high-level semantic categories associated with this concept - values depend on the terminologies loaded | [optional] 
**definitions** | [**List[Definition]**](Definition.md) | the definitions associated with this concept | [optional] 
**axioms** | [**List[Axiom]**](Axiom.md) | the axioms associated with this concept | [optional] 
**sufficiently_defined** | **bool** | indicates whether the concept is specified with logical necessary and sufficient conditions.  Generally not important except for description-logic based terminologies where this is important. | 
**created** | **datetime** | the created date | 
**local** | **bool** | indicates whether this data element was created by local editing | 
**modified_by** | **str** | the identifier of the user who made the last modification | 
**modified** | **datetime** | the last modified date | 
**id** | **str** | the unique identifier | 
**active** | **bool** | indicates whether or not this data element is active | 
**terminology** | **str** | the terminology abbreviation | 
**name** | **str** | the name | 
**attributes** | **Dict[str, str]** | key/value pairs associated with this object. Entries in this map are terminology-specific | [optional] 

## Example

```python
from openapi_client.models.concept import Concept

# TODO update the JSON string below
json = "{}"
# create an instance of Concept from a JSON string
concept_instance = Concept.from_json(json)
# print the JSON string representation of the object
print Concept.to_json()

# convert the object into a dict
concept_dict = concept_instance.to_dict()
# create an instance of Concept from a dict
concept_form_dict = concept.from_dict(concept_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


