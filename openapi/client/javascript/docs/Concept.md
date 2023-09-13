# WestCoastInformaticsTerminologyApi.Concept

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | the code in the specified terminology | 
**atoms** | [**[Atom]**](Atom.md) | the names associated with this concept | 
**semanticTypes** | **[String]** | high-level semantic categories associated with this concept - values depend on the terminologies loaded | [optional] 
**definitions** | [**[Definition]**](Definition.md) | the definitions associated with this concept | [optional] 
**axioms** | [**[Axiom]**](Axiom.md) | the axioms associated with this concept | [optional] 
**sufficientlyDefined** | **Boolean** | indicates whether the concept is specified with logical necessary and sufficient conditions.  Generally not important except for description-logic based terminologies where this is important. | 
**created** | **Date** | the created date | 
**local** | **Boolean** | indicates whether this data element was created by local editing | 
**modifiedBy** | **String** | the identifier of the user who made the last modification | 
**modified** | **Date** | the last modified date | 
**id** | **String** | the unique identifier | 
**active** | **Boolean** | indicates whether or not this data element is active | 
**terminology** | **String** | the terminology abbreviation | 
**name** | **String** | the name | 
**attributes** | **{String: String}** | key/value pairs associated with this object. Entries in this map are terminology-specific | [optional] 


