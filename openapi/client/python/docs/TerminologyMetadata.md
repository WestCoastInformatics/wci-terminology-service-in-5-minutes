# TerminologyMetadata

Represents all types of metadata associated with a terminology

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attribute_names** | [**Dict[str, Metadata]**](Metadata.md) | the attribute names used by the terminology | [optional] 
**terminology** | [**Terminology**](Terminology.md) |  | 
**semantic_types** | [**Dict[str, Metadata]**](Metadata.md) | the semantic types used by the terminology | [optional] 
**additional_relationship_types** | [**Dict[str, Metadata]**](Metadata.md) | the additional relationship types used by the terminology | [optional] 
**relationship_types** | [**Dict[str, Metadata]**](Metadata.md) | the relationship types used by the terminology | [optional] 
**term_types** | [**Dict[str, Metadata]**](Metadata.md) | the term types used by the terminology | [optional] 
**languages** | [**Dict[str, Metadata]**](Metadata.md) | the languages used by the terminology | [optional] 
**other** | [**Dict[str, Metadata]**](Metadata.md) | miscellaneous terminology metadata (terminology-specific) | [optional] 
**created** | **datetime** | the created date | 
**local** | **bool** | indicates whether this data element was created by local editing | 
**modified_by** | **str** | the identifier of the user who made the last modification | 
**modified** | **datetime** | the last modified date | 
**id** | **str** | the unique identifier | 
**active** | **bool** | indicates whether or not this data element is active | 

## Example

```python
from openapi_client.models.terminology_metadata import TerminologyMetadata

# TODO update the JSON string below
json = "{}"
# create an instance of TerminologyMetadata from a JSON string
terminology_metadata_instance = TerminologyMetadata.from_json(json)
# print the JSON string representation of the object
print TerminologyMetadata.to_json()

# convert the object into a dict
terminology_metadata_dict = terminology_metadata_instance.to_dict()
# create an instance of TerminologyMetadata from a dict
terminology_metadata_form_dict = terminology_metadata.from_dict(terminology_metadata_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


