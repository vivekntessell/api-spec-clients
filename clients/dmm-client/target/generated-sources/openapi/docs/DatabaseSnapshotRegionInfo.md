

# DatabaseSnapshotRegionInfo

Region availability details for a snapshot

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**region** | **String** | The region name | 
**status** | [**StatusEnum**](#StatusEnum) | The current status of the snapshot in the respective region |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
AVAILABLE | &quot;AVAILABLE&quot;
COPYING | &quot;COPYING&quot;
NOT_AVAILABLE | &quot;NOT_AVAILABLE&quot;



