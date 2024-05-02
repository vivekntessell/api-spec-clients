

# ConvoyDeploymentConfig

Deployment related configuration required by Convoy. Any missing values will fall back to values provided via env variables to tenant-worker. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**baseConfigBranch** | **String** | Base Config Branch to use from tenant-deployment-configs |  [optional]
**releaseLabel** | **String** | Either \&quot;latest-main\&quot; or \&quot;x.y.z\&quot; |  [optional]
**releaseManifestOverride** | [**ReleaseManifestOverride**](ReleaseManifestOverride.md) |  |  [optional]



