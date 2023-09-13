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

from openapi_client.models.auth_response import AuthResponse  # noqa: E501

class TestAuthResponse(unittest.TestCase):
    """AuthResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> AuthResponse:
        """Test AuthResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `AuthResponse`
        """
        model = AuthResponse()  # noqa: E501
        if include_optional:
            return AuthResponse(
                access_token = '',
                expires_in = 56,
                expires_on = 56,
                token_type = ''
            )
        else:
            return AuthResponse(
                access_token = '',
                expires_in = 56,
                expires_on = 56,
                token_type = '',
        )
        """

    def testAuthResponse(self):
        """Test AuthResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
