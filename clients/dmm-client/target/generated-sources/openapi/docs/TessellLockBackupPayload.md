

# TessellLockBackupPayload

This is a definition for locking/releasing a backup

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**subscriberId** | **UUID** | Identifier for backup lock/unlock request |  [optional]
**lock** | **Boolean** | Exclusive with &#39;release&#39; |  [optional]
**release** | **Boolean** | Exclusive with &#39;lock&#39; |  [optional]
**lockForMinutes** | **Integer** | Lock the backup for specified minutes, required only if &#39;lock&#39; is true |  [optional]
**lockPurpose** | **String** |  |  [optional]



