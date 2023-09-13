# WestCoastInformaticsTerminologyApi.Mapping

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**group** | **String** | the value for the group this map participates in (for complex maps that use groups) | [optional] 
**category** | **String** | the map category (for RF2-based maps) | [optional] 
**fromTerminology** | **String** | the terminology of the &#39;from&#39; code | 
**fromCode** | **String** | the &#39;from&#39; code (the left-hand side) | 
**toTerminology** | **String** | the terminology of the &#39;to&#39; code | 
**toCode** | **String** | the &#39;to&#39; code (the left-hand side) | 
**fromName** | **String** | the name of the &#39;from&#39; code | 
**toName** | **String** | the name of the &#39;to&#39; code | 
**rule** | **String** | the machine-readable map rule for this mapping (for complex maps that use rules) | [optional] 
**mapsetCode** | **String** | the code of the mapset containing this mapping | 
**advice** | **String** | the map advice | [optional] 
**priority** | **String** | the value for the priority of this map within its group (for complex maps that use groups) | [optional] 
**created** | **Date** | the created date | 
**local** | **Boolean** | indicates whether this data element was created by local editing | 
**modifiedBy** | **String** | the identifier of the user who made the last modification | 
**modified** | **Date** | the last modified date | 
**id** | **String** | the unique identifier | 
**active** | **Boolean** | indicates whether or not this data element is active | 
**attributes** | **{String: String}** | key/value pairs associated with this object. Entries in this map are terminology-specific | [optional] 


