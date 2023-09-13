

# Metadata

Represents a named metadata entry

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | the type of metadata |  |
|**abbreviation** | **String** | the label for the metadata element |  |
|**rank** | **Integer** | used for when metadata lists need to be ranked (as in a ranked list of term types) |  [optional] |
|**name** | **String** | the name |  |
|**terminology** | **String** | the terminology abbreviation |  |
|**attributes** | **Map&lt;String, String&gt;** | key/value pairs associated with this object. Entries in this map are terminology-specific |  [optional] |
|**created** | **OffsetDateTime** | the created date |  |
|**local** | **Boolean** | indicates whether this data element was created by local editing |  |
|**modifiedBy** | **String** | the identifier of the user who made the last modification |  |
|**modified** | **OffsetDateTime** | the last modified date |  |
|**id** | **UUID** | the unique identifier |  |
|**active** | **Boolean** | indicates whether or not this data element is active |  |



