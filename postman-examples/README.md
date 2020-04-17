<a name="top" />

WCI Terminology Service in 5 minutes: Postman Tutorial
======================================================

This tutorial shows how to use Postman access content from the WCI Terminology API.

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

This message means you have to first log in and acquire an access token.  To do so, click on
the "Authorization" tab and you'll see a message like this:

`"This request is using an authorization helper from collection __WCI Terminology Server Postman Client__"`

1. Click on the link to open the authorization popup.
2. Click the "Get New Access Token" button
3. "Grant Type" should be set to "Password Credentials"
4. "Access Token URL" should be set to "https://wci.terminology.tools/auth/token"
5. "Username" and "Password" should be your UTS account credentials
6. "Client ID", "Client Secret", and "Scope" should be blank (but their values do not matter)
7. "Client Authentication" should be set to "Send client credentials in body"
8. Click "Request Token"
9. If successful, the popup will contain an access token and a button that says "Use Token"
10. Click the "Use Token" button.  NOW - all requests will be authorized with this token.


Sample Postman Calls
-----------------
When the collection is loaded into Postman, you will see a number
of requests matching the scenarios defined in the top level README file of this project.  
Simply choose any one and click the "Send" button to see the result.

[Back to Top](#top)
