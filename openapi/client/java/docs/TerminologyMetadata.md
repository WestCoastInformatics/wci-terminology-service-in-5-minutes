

# TerminologyMetadata

Represents all types of metadata associated with a terminology

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attributeNames** | [**Map&lt;String, Metadata&gt;**](Metadata.md) | the attribute names used by the terminology |  [optional] |
|**terminology** | [**Terminology**](Terminology.md) |  |  |
|**semanticTypes** | [**Map&lt;String, Metadata&gt;**](Metadata.md) | the semantic types used by the terminology |  [optional] |
|**additionalRelationshipTypes** | [**Map&lt;String, Metadata&gt;**](Metadata.md) | the additional relationship types used by the terminology |  [optional] |
|**relationshipTypes** | [**Map&lt;String, Metadata&gt;**](Metadata.md) | the relationship types used by the terminology |  [optional] |
|**termTypes** | [**Map&lt;String, Metadata&gt;**](Metadata.md) | the term types used by the terminology |  [optional] |
|**languages** | [**Map&lt;String, Metadata&gt;**](Metadata.md) | the languages used by the terminology |  [optional] |
|**other** | [**Map&lt;String, Metadata&gt;**](Metadata.md) | miscellaneous terminology metadata (terminology-specific) |  [optional] |
|**created** | **OffsetDateTime** | the created date |  |
|**local** | **Boolean** | indicates whether this data element was created by local editing |  |
|**modifiedBy** | **String** | the identifier of the user who made the last modification |  |
|**modified** | **OffsetDateTime** | the last modified date |  |
|**id** | **UUID** | the unique identifier |  |
|**active** | **Boolean** | indicates whether or not this data element is active |  |



