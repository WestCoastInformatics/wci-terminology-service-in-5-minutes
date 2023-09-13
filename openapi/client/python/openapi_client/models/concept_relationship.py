# coding: utf-8

"""
    West Coast Informatics Terminology API

    API documentation for the <a href=\"https://www.westcoastinformatics.com\">West Coast Informatics</a> terminology server API.<p>Request a 30-day bearer token from <a href=\"mailto:info@westcoastinformatics.com\">info@westcoastinformatics.com</a>.</p> <p>For full documentation on this service, please visit our wiki page at <a href=\"https://wci-wiki.atlassian.net/wiki/spaces/TSV2\">https://wci-wiki.atlassian.net/wiki/spaces/TSV2</a>.</p>

    The version of the OpenAPI document: 1.0.0
    Contact: info@westcoastinformatics.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from datetime import datetime
from typing import Optional
from pydantic import BaseModel, Field, StrictBool, StrictStr

class ConceptRelationship(BaseModel):
    """
    Represents a relationship between two concepts
    """
    hierarchical: StrictBool = Field(..., description="indicates whether this relationship is part of the hierarchy")
    type: StrictStr = Field(..., description="the high level type of relationship (more information about this label is provided in the terminology metadata)")
    group: Optional[StrictStr] = Field(None, description="used by terminologies that group relationships (e.g. SNOMEDCT) to indicate the group value")
    asserted_direction: StrictBool = Field(..., alias="assertedDirection", description="indicates whether this relationship is in the direction asserted by the terminology. This is meaninful because in some instances relationships are loaded in both directions")
    additional_type: Optional[StrictStr] = Field(None, alias="additionalType", description="the more specific type of relationship (more information about this label is provided in the terminology metadata)")
    defining: StrictBool = Field(..., description="indicates whether this is a relationship is part of the concept logical definition")
    to_terminology: Optional[StrictStr] = Field(None, alias="toTerminology", description="the terminology of the concept this relationship is to (the right-hand side). If this is not used, the relationship will have a 'toValue'")
    to_code: Optional[StrictStr] = Field(None, alias="toCode", description="the code of the concept this relationship is to (the right-hand side). If this is not used, the relationship will have a 'toValue'")
    to_value: Optional[StrictStr] = Field(None, alias="toValue", description="the literal value relationship is to (the right-hand side). If this is null, the relationship will have a 'to'")
    to_name: Optional[StrictStr] = Field(None, alias="toName", description="the name of the concept this relationship is to (the right-hand side). If this is not used, the relationship will have a 'toValue'")
    created: datetime = Field(..., description="the created date")
    local: StrictBool = Field(..., description="indicates whether this data element was created by local editing")
    modified_by: StrictStr = Field(..., alias="modifiedBy", description="the identifier of the user who made the last modification")
    modified: datetime = Field(..., description="the last modified date")
    id: StrictStr = Field(..., description="the unique identifier")
    active: StrictBool = Field(..., description="indicates whether or not this data element is active")
    terminology_id: Optional[StrictStr] = Field(None, alias="terminologyId", description="the identifier asserted by the terminology")
    terminology: StrictStr = Field(..., description="the terminology abbreviation")
    __properties = ["hierarchical", "type", "group", "assertedDirection", "additionalType", "defining", "toTerminology", "toCode", "toValue", "toName", "created", "local", "modifiedBy", "modified", "id", "active", "terminologyId", "terminology"]

    class Config:
        """Pydantic configuration"""
        allow_population_by_field_name = True
        validate_assignment = True

    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.dict(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> ConceptRelationship:
        """Create an instance of ConceptRelationship from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> ConceptRelationship:
        """Create an instance of ConceptRelationship from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return ConceptRelationship.parse_obj(obj)

        _obj = ConceptRelationship.parse_obj({
            "hierarchical": obj.get("hierarchical"),
            "type": obj.get("type"),
            "group": obj.get("group"),
            "asserted_direction": obj.get("assertedDirection"),
            "additional_type": obj.get("additionalType"),
            "defining": obj.get("defining"),
            "to_terminology": obj.get("toTerminology"),
            "to_code": obj.get("toCode"),
            "to_value": obj.get("toValue"),
            "to_name": obj.get("toName"),
            "created": obj.get("created"),
            "local": obj.get("local"),
            "modified_by": obj.get("modifiedBy"),
            "modified": obj.get("modified"),
            "id": obj.get("id"),
            "active": obj.get("active"),
            "terminology_id": obj.get("terminologyId"),
            "terminology": obj.get("terminology")
        })
        return _obj


