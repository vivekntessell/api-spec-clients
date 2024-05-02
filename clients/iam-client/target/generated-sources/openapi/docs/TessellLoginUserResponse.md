

# TessellLoginUserResponse

This is a definition for Tessell login user response object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessToken** | **String** | Api access token of the user |  [optional]
**refreshToken** | **String** | Refresh token of the user |  [optional]
**emailId** | **String** | Email Id of the user |  [optional]
**firstName** | **String** | First name of the user |  [optional]
**lastName** | **String** | Last name of the user |  [optional]
**tenantUserAttributes** | [**List&lt;TessellTenantUserAttributes&gt;**](TessellTenantUserAttributes.md) | List of tenant specific user attributes |  [optional]
**status** | **TessellUserStatus** |  |  [optional]
**dateLastLoggedIn** | **Date** | Date when the user last logged into Tessell (null if logging in for first time) |  [optional]



