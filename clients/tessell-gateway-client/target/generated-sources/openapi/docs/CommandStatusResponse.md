

# CommandStatusResponse

Command status is sent by TA to TGA when a command is completed.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **CommandStatus** |  |  [optional]
**output** | **byte[]** | output of the associated log file. |  [optional]
**error** | **String** | error message. |  [optional]
**errno** | **Integer** | Error number from the command. |  [optional]



