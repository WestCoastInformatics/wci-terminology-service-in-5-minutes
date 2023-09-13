# Terminology

Represents a terminology abbreviation and associated metadata

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**version** | **str** | the terminology version | 
**abbreviation** | **str** | the terminology abbreviation | 
**system_oid** | **str** | the OID for the terminology | [optional] 
**system_uri** | **str** | the FHIR system URI for the terminology | [optional] 
**expression_enabled** | **bool** | indicates whether ECL-style expressions can be used when searching the terminology | 
**name** | **str** | the name | 
**created** | **datetime** | the created date | 
**local** | **bool** | indicates whether this data element was created by local editing | 
**modified_by** | **str** | the identifier of the user who made the last modification | 
**modified** | **datetime** | the last modified date | 
**id** | **str** | the unique identifier | 
**active** | **bool** | indicates whether or not this data element is active | 
**attributes** | **Dict[str, str]** | key/value pairs associated with this object. Entries in this map are terminology-specific | [optional] 

## Example

```python
from openapi_client.models.terminology import Terminology

# TODO update the JSON string below
json = "{}"
# create an instance of Terminology from a JSON string
terminology_instance = Terminology.from_json(json)
# print the JSON string representation of the object
print Terminology.to_json()

# convert the object into a dict
terminology_dict = terminology_instance.to_dict()
# create an instance of Terminology from a dict
terminology_form_dict = terminology.from_dict(terminology_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


