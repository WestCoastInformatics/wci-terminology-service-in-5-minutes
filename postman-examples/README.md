WCI Terminology Service in 5 minutes: Postman Tutorial
======================================================

This tutorial shows how to use Postman access content from the WCI Terminology API.

[Postman Tutorial Training Video](https://youtube.com/tbd)

Prerequisites
-------------
* Postman must be installed (with a version capable of importing a v2.1 collection)
* The [WCI-Term-Server-Postman-Client.json](WCI-Term-Server-Postman-Client.json) file must be loaded into Postman using File->Import
* The base API_URL variable is et in the collection.  To change this, edit the collection, select the "Variables" tab, change the value, click "Update".
 - It is currently set to `https://wci.terminology.tools`

Login
-----
After importing the collection, if you choose a request and click "Send" you should see this: 

```
{
    "local": false,
    "code": 401,
    "description": "Unauthorized",
    "message": "Unauthorized"
}
```

This message means you have to first configure authentication.  Edit the collection and choose
the "Authorization" tab.

For testing against "https://wci.terminology.tools", set the "Type" to "Bearer Token"
and request a 30-day token from info@westcoastinformatics.com to use as that token.

For testing against "https://snomed.terminology.tools", no authentication is needed, so set the
"Type" to "No auth".

For testing against a local install that is using embedded username/password auth, do the following.

1. Set the "type" to "Oauth 2.0"
2. "Grant Type" should be set to "Password Credentials"
3. "Access Token URL" should be set to something like "https://example.com/auth/token"
   where "example.com" represents the deployment to authenticate against
4. "Username" and "Password" should be your account credentials
5. "Client ID", "Client Secret", and "Scope" should be blank (but their values do not matter)
6. "Client Authentication" should be set to "Send client credentials in body"
7. Click "Request Token"
8. If successful, the popup will contain an access token and a button that says "Use Token"
9. Click the "Use Token" button.  NOW - all requests will be authorized with this token.


Sample Postman Calls
-----------------
When the collection is loaded into Postman, you will see a number
of requests matching the scenarios defined in the top level README 
file of this project.  Simply choose any one and click the "Send" 
button to see the result.

[Back to Top](#wci-terminology-service-in-5-minutes-postman-tutorial)
