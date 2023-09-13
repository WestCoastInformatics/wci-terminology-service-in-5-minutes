# Concept

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Code** | **string** | the code in the specified terminology | 
**Atoms** | [**[]Atom**](Atom.md) | the names associated with this concept | 
**SemanticTypes** | Pointer to **[]string** | high-level semantic categories associated with this concept - values depend on the terminologies loaded | [optional] 
**Definitions** | Pointer to [**[]Definition**](Definition.md) | the definitions associated with this concept | [optional] 
**Axioms** | Pointer to [**[]Axiom**](Axiom.md) | the axioms associated with this concept | [optional] 
**SufficientlyDefined** | **bool** | indicates whether the concept is specified with logical necessary and sufficient conditions.  Generally not important except for description-logic based terminologies where this is important. | 
**Created** | **time.Time** | the created date | 
**Local** | **bool** | indicates whether this data element was created by local editing | 
**ModifiedBy** | **string** | the identifier of the user who made the last modification | 
**Modified** | **time.Time** | the last modified date | 
**Id** | **string** | the unique identifier | 
**Active** | **bool** | indicates whether or not this data element is active | 
**Terminology** | **string** | the terminology abbreviation | 
**Name** | **string** | the name | 
**Attributes** | Pointer to **map[string]string** | key/value pairs associated with this object. Entries in this map are terminology-specific | [optional] 

## Methods

### NewConcept

`func NewConcept(code string, atoms []Atom, sufficientlyDefined bool, created time.Time, local bool, modifiedBy string, modified time.Time, id string, active bool, terminology string, name string, ) *Concept`

NewConcept instantiates a new Concept object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewConceptWithDefaults

`func NewConceptWithDefaults() *Concept`

NewConceptWithDefaults instantiates a new Concept object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCode

`func (o *Concept) GetCode() string`

GetCode returns the Code field if non-nil, zero value otherwise.

### GetCodeOk

`func (o *Concept) GetCodeOk() (*string, bool)`

GetCodeOk returns a tuple with the Code field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCode

`func (o *Concept) SetCode(v string)`

SetCode sets Code field to given value.


### GetAtoms

`func (o *Concept) GetAtoms() []Atom`

GetAtoms returns the Atoms field if non-nil, zero value otherwise.

### GetAtomsOk

`func (o *Concept) GetAtomsOk() (*[]Atom, bool)`

GetAtomsOk returns a tuple with the Atoms field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAtoms

`func (o *Concept) SetAtoms(v []Atom)`

SetAtoms sets Atoms field to given value.


### GetSemanticTypes

`func (o *Concept) GetSemanticTypes() []string`

GetSemanticTypes returns the SemanticTypes field if non-nil, zero value otherwise.

### GetSemanticTypesOk

`func (o *Concept) GetSemanticTypesOk() (*[]string, bool)`

GetSemanticTypesOk returns a tuple with the SemanticTypes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSemanticTypes

`func (o *Concept) SetSemanticTypes(v []string)`

SetSemanticTypes sets SemanticTypes field to given value.

### HasSemanticTypes

`func (o *Concept) HasSemanticTypes() bool`

HasSemanticTypes returns a boolean if a field has been set.

### GetDefinitions

`func (o *Concept) GetDefinitions() []Definition`

GetDefinitions returns the Definitions field if non-nil, zero value otherwise.

### GetDefinitionsOk

`func (o *Concept) GetDefinitionsOk() (*[]Definition, bool)`

GetDefinitionsOk returns a tuple with the Definitions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefinitions

`func (o *Concept) SetDefinitions(v []Definition)`

SetDefinitions sets Definitions field to given value.

### HasDefinitions

`func (o *Concept) HasDefinitions() bool`

HasDefinitions returns a boolean if a field has been set.

### GetAxioms

`func (o *Concept) GetAxioms() []Axiom`

GetAxioms returns the Axioms field if non-nil, zero value otherwise.

### GetAxiomsOk

`func (o *Concept) GetAxiomsOk() (*[]Axiom, bool)`

GetAxiomsOk returns a tuple with the Axioms field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAxioms

`func (o *Concept) SetAxioms(v []Axiom)`

SetAxioms sets Axioms field to given value.

### HasAxioms

`func (o *Concept) HasAxioms() bool`

HasAxioms returns a boolean if a field has been set.

### GetSufficientlyDefined

`func (o *Concept) GetSufficientlyDefined() bool`

GetSufficientlyDefined returns the SufficientlyDefined field if non-nil, zero value otherwise.

### GetSufficientlyDefinedOk

`func (o *Concept) GetSufficientlyDefinedOk() (*bool, bool)`

GetSufficientlyDefinedOk returns a tuple with the SufficientlyDefined field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSufficientlyDefined

`func (o *Concept) SetSufficientlyDefined(v bool)`

SetSufficientlyDefined sets SufficientlyDefined field to given value.


### GetCreated

`func (o *Concept) GetCreated() time.Time`

GetCreated returns the Created field if non-nil, zero value otherwise.

### GetCreatedOk

`func (o *Concept) GetCreatedOk() (*time.Time, bool)`

GetCreatedOk returns a tuple with the Created field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreated

`func (o *Concept) SetCreated(v time.Time)`

SetCreated sets Created field to given value.


### GetLocal

`func (o *Concept) GetLocal() bool`

GetLocal returns the Local field if non-nil, zero value otherwise.

### GetLocalOk

`func (o *Concept) GetLocalOk() (*bool, bool)`

GetLocalOk returns a tuple with the Local field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLocal

`func (o *Concept) SetLocal(v bool)`

SetLocal sets Local field to given value.


### GetModifiedBy

`func (o *Concept) GetModifiedBy() string`

GetModifiedBy returns the ModifiedBy field if non-nil, zero value otherwise.

### GetModifiedByOk

`func (o *Concept) GetModifiedByOk() (*string, bool)`

GetModifiedByOk returns a tuple with the ModifiedBy field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModifiedBy

`func (o *Concept) SetModifiedBy(v string)`

SetModifiedBy sets ModifiedBy field to given value.


### GetModified

`func (o *Concept) GetModified() time.Time`

GetModified returns the Modified field if non-nil, zero value otherwise.

### GetModifiedOk

`func (o *Concept) GetModifiedOk() (*time.Time, bool)`

GetModifiedOk returns a tuple with the Modified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModified

`func (o *Concept) SetModified(v time.Time)`

SetModified sets Modified field to given value.


### GetId

`func (o *Concept) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *Concept) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *Concept) SetId(v string)`

SetId sets Id field to given value.


### GetActive

`func (o *Concept) GetActive() bool`

GetActive returns the Active field if non-nil, zero value otherwise.

### GetActiveOk

`func (o *Concept) GetActiveOk() (*bool, bool)`

GetActiveOk returns a tuple with the Active field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetActive

`func (o *Concept) SetActive(v bool)`

SetActive sets Active field to given value.


### GetTerminology

`func (o *Concept) GetTerminology() string`

GetTerminology returns the Terminology field if non-nil, zero value otherwise.

### GetTerminologyOk

`func (o *Concept) GetTerminologyOk() (*string, bool)`

GetTerminologyOk returns a tuple with the Terminology field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTerminology

`func (o *Concept) SetTerminology(v string)`

SetTerminology sets Terminology field to given value.


### GetName

`func (o *Concept) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *Concept) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *Concept) SetName(v string)`

SetName sets Name field to given value.


### GetAttributes

`func (o *Concept) GetAttributes() map[string]string`

GetAttributes returns the Attributes field if non-nil, zero value otherwise.

### GetAttributesOk

`func (o *Concept) GetAttributesOk() (*map[string]string, bool)`

GetAttributesOk returns a tuple with the Attributes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttributes

`func (o *Concept) SetAttributes(v map[string]string)`

SetAttributes sets Attributes field to given value.

### HasAttributes

`func (o *Concept) HasAttributes() bool`

HasAttributes returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


