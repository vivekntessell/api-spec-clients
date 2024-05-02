

# CreateSanitizedDatabaseSnapshotTaskPayload

Payload to create a sanitized snapshot

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name for the sanitized snapshot, which is to be created | 
**description** | **String** | Description for the sanitized snapshot |  [optional]
**snapshotId** | **UUID** | ID of the source snapshot (which is to be sanitized) | 
**scriptId** | **UUID** | ID of the Sanitization Script, which is to be used for data sanitization | 
**scriptVersion** | **String** | Version of the Sanitization Script |  [optional]



