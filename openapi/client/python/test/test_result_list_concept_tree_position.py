# coding: utf-8

"""
    West Coast Informatics Terminology API

    API documentation for the <a href=\"https://www.westcoastinformatics.com\">West Coast Informatics</a> terminology server API.<p>Request a 30-day bearer token from <a href=\"mailto:info@westcoastinformatics.com\">info@westcoastinformatics.com</a>.</p> <p>For full documentation on this service, please visit our wiki page at <a href=\"https://wci-wiki.atlassian.net/wiki/spaces/TSV2\">https://wci-wiki.atlassian.net/wiki/spaces/TSV2</a>.</p>

    The version of the OpenAPI document: 1.0.0
    Contact: info@westcoastinformatics.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest
import datetime

from openapi_client.models.result_list_concept_tree_position import ResultListConceptTreePosition  # noqa: E501

class TestResultListConceptTreePosition(unittest.TestCase):
    """ResultListConceptTreePosition unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ResultListConceptTreePosition:
        """Test ResultListConceptTreePosition
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ResultListConceptTreePosition`
        """
        model = ResultListConceptTreePosition()  # noqa: E501
        if include_optional:
            return ResultListConceptTreePosition(
                total = 56,
                limit = 56,
                offset = 56,
                confidence = 1.337,
                items = [
                    openapi_client.models.concept_tree_position.ConceptTreePosition(
                        children = [
                            openapi_client.models.concept_tree_position.ConceptTreePosition(
                                level = 56, 
                                ancestor_path = 'e.g. isa, part_of', 
                                code = 'e.g. 404684003 in SNOMEDCT, or 1191 in RXNORM, or 2951-2 in LNC', 
                                additional_type = 'e.g. isa, has_part', 
                                child_ct = 56, 
                                created = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                                local = True, 
                                modified_by = '', 
                                modified = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                                id = '', 
                                active = True, 
                                name = '', 
                                terminology = '', )
                            ], 
                        level = 56, 
                        ancestor_path = 'e.g. isa, part_of', 
                        code = 'e.g. 404684003 in SNOMEDCT, or 1191 in RXNORM, or 2951-2 in LNC', 
                        additional_type = 'e.g. isa, has_part', 
                        child_ct = 56, 
                        created = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                        local = True, 
                        modified_by = '', 
                        modified = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                        id = '', 
                        active = True, 
                        name = '', 
                        terminology = '', )
                    ]
            )
        else:
            return ResultListConceptTreePosition(
                total = 56,
                limit = 56,
                offset = 56,
                items = [
                    openapi_client.models.concept_tree_position.ConceptTreePosition(
                        children = [
                            openapi_client.models.concept_tree_position.ConceptTreePosition(
                                level = 56, 
                                ancestor_path = 'e.g. isa, part_of', 
                                code = 'e.g. 404684003 in SNOMEDCT, or 1191 in RXNORM, or 2951-2 in LNC', 
                                additional_type = 'e.g. isa, has_part', 
                                child_ct = 56, 
                                created = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                                local = True, 
                                modified_by = '', 
                                modified = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                                id = '', 
                                active = True, 
                                name = '', 
                                terminology = '', )
                            ], 
                        level = 56, 
                        ancestor_path = 'e.g. isa, part_of', 
                        code = 'e.g. 404684003 in SNOMEDCT, or 1191 in RXNORM, or 2951-2 in LNC', 
                        additional_type = 'e.g. isa, has_part', 
                        child_ct = 56, 
                        created = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                        local = True, 
                        modified_by = '', 
                        modified = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                        id = '', 
                        active = True, 
                        name = '', 
                        terminology = '', )
                    ],
        )
        """

    def testResultListConceptTreePosition(self):
        """Test ResultListConceptTreePosition"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
