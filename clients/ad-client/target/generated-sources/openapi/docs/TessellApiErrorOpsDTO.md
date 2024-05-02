

# TessellApiErrorOpsDTO

Common error response object for non 2xx responses of internal or ops APIs

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errorCode** | [**TessellTessellErrorCodeDTO**](TessellTessellErrorCodeDTO.md) |  |  [optional]
**message** | **String** | Error message for API response |  [optional]
**details** | [**TessellApiErrorDetailsDTO**](TessellApiErrorDetailsDTO.md) |  |  [optional]
**serviceException** | [**TessellApiErrorDTO**](TessellApiErrorDTO.md) |  |  [optional]
**contextId** | **String** | ContextId of API request |  [optional]
**sessionId** | **String** | SessionId of API request |  [optional]



