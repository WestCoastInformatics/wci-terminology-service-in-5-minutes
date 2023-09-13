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


from typing import List, Optional, Union
from pydantic import BaseModel, Field, StrictFloat, StrictInt, conlist
from openapi_client.models.concept_relationship import ConceptRelationship

class ResultListConceptRelationship(BaseModel):
    """
    ResultListConceptRelationship
    """
    total: StrictInt = Field(..., description="the total number of potential results")
    limit: StrictInt = Field(..., description="the max number results requested")
    offset: StrictInt = Field(..., description="the starting index requested")
    confidence: Optional[Union[StrictFloat, StrictInt]] = Field(None, description="the score of the search result, when used")
    items: conlist(ConceptRelationship) = Field(..., description="the items themselves (the format will vary depending on the type of list)")
    __properties = ["total", "limit", "offset", "confidence", "items"]

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
    def from_json(cls, json_str: str) -> ResultListConceptRelationship:
        """Create an instance of ResultListConceptRelationship from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of each item in items (list)
        _items = []
        if self.items:
            for _item in self.items:
                if _item:
                    _items.append(_item.to_dict())
            _dict['items'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> ResultListConceptRelationship:
        """Create an instance of ResultListConceptRelationship from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return ResultListConceptRelationship.parse_obj(obj)

        _obj = ResultListConceptRelationship.parse_obj({
            "total": obj.get("total"),
            "limit": obj.get("limit"),
            "offset": obj.get("offset"),
            "confidence": obj.get("confidence"),
            "items": [ConceptRelationship.from_dict(_item) for _item in obj.get("items")] if obj.get("items") is not None else None
        })
        return _obj


