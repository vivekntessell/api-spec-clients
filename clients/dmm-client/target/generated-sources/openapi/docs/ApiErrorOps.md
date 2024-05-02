

# ApiErrorOps

Common error response object for non 2xx responses of internal or ops APIs

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errorCode** | [**TessellErrorCode**](TessellErrorCode.md) |  |  [optional]
**message** | **String** | Error message for API response |  [optional]
**details** | [**ApiErrorDetails**](ApiErrorDetails.md) |  |  [optional]
**serviceException** | [**ApiError**](ApiError.md) |  |  [optional]
**contextId** | **String** | ContextId of API request |  [optional]
**sessionId** | **String** | SessionId of API request |  [optional]



