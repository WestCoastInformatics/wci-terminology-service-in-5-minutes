# ConceptRelationship

Represents a relationship between two concepts

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hierarchical** | **bool** | indicates whether this relationship is part of the hierarchy | 
**type** | **str** | the high level type of relationship (more information about this label is provided in the terminology metadata) | 
**group** | **str** | used by terminologies that group relationships (e.g. SNOMEDCT) to indicate the group value | [optional] 
**asserted_direction** | **bool** | indicates whether this relationship is in the direction asserted by the terminology. This is meaninful because in some instances relationships are loaded in both directions | 
**additional_type** | **str** | the more specific type of relationship (more information about this label is provided in the terminology metadata) | [optional] 
**defining** | **bool** | indicates whether this is a relationship is part of the concept logical definition | 
**to_terminology** | **str** | the terminology of the concept this relationship is to (the right-hand side). If this is not used, the relationship will have a &#39;toValue&#39; | [optional] 
**to_code** | **str** | the code of the concept this relationship is to (the right-hand side). If this is not used, the relationship will have a &#39;toValue&#39; | [optional] 
**to_value** | **str** | the literal value relationship is to (the right-hand side). If this is null, the relationship will have a &#39;to&#39; | [optional] 
**to_name** | **str** | the name of the concept this relationship is to (the right-hand side). If this is not used, the relationship will have a &#39;toValue&#39; | [optional] 
**created** | **datetime** | the created date | 
**local** | **bool** | indicates whether this data element was created by local editing | 
**modified_by** | **str** | the identifier of the user who made the last modification | 
**modified** | **datetime** | the last modified date | 
**id** | **str** | the unique identifier | 
**active** | **bool** | indicates whether or not this data element is active | 
**terminology_id** | **str** | the identifier asserted by the terminology | [optional] 
**terminology** | **str** | the terminology abbreviation | 

## Example

```python
from openapi_client.models.concept_relationship import ConceptRelationship

# TODO update the JSON string below
json = "{}"
# create an instance of ConceptRelationship from a JSON string
concept_relationship_instance = ConceptRelationship.from_json(json)
# print the JSON string representation of the object
print ConceptRelationship.to_json()

# convert the object into a dict
concept_relationship_dict = concept_relationship_instance.to_dict()
# create an instance of ConceptRelationship from a dict
concept_relationship_form_dict = concept_relationship.from_dict(concept_relationship_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


