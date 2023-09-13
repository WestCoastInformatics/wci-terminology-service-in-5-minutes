

# Atom

Represents a name with a term type that contributes meaning to a concept

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**codeId** | **String** | the code in the specified terminology |  |
|**localeMap** | **Map&lt;String, Boolean&gt;** | a map of language codes to boolean values indicated whether this definition is preferred in that language context |  |
|**conceptId** | **String** | the concept id (for terminologies that use concepts) |  [optional] |
|**descriptorId** | **String** | the descriptor id (for terminologies that use descriptors) |  [optional] |
|**termType** | **String** | the term type |  |
|**created** | **OffsetDateTime** | the created date |  |
|**local** | **Boolean** | indicates whether this data element was created by local editing |  |
|**modifiedBy** | **String** | the identifier of the user who made the last modification |  |
|**modified** | **OffsetDateTime** | the last modified date |  |
|**id** | **UUID** | the unique identifier |  |
|**active** | **Boolean** | indicates whether or not this data element is active |  |
|**name** | **String** | the name |  |
|**terminologyId** | **String** | the identifier asserted by the terminology |  [optional] |
|**terminology** | **String** | the terminology abbreviation |  |
|**attributes** | **Map&lt;String, String&gt;** | key/value pairs associated with this object. Entries in this map are terminology-specific |  [optional] |



