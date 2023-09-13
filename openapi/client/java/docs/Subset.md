

# Subset

Represents a subset of concepts in a terminology grouped for a particular reason or use case

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | **String** | the subset code |  |
|**memberIds** | **Set&lt;String&gt;** | the codes for members of the subset |  [optional] |
|**created** | **OffsetDateTime** | the created date |  |
|**local** | **Boolean** | indicates whether this data element was created by local editing |  |
|**modifiedBy** | **String** | the identifier of the user who made the last modification |  |
|**modified** | **OffsetDateTime** | the last modified date |  |
|**id** | **UUID** | the unique identifier |  |
|**active** | **Boolean** | indicates whether or not this data element is active |  |
|**name** | **String** | the name |  |
|**terminology** | **String** | the terminology abbreviation |  |
|**attributes** | **Map&lt;String, String&gt;** | key/value pairs associated with this object. Entries in this map are terminology-specific |  [optional] |



