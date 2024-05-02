

# TessellSoftwareImageVersionInternalEntityDTO

SoftwareImage Version Entity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** | Image Version identifier |  [optional]
**osVersion** | **String** | OS Version. |  [optional]
**version** | **String** | DB Version. |  [optional]
**versionName** | **String** | DB Version name string. |  [optional]
**versionRefId** | **UUID** | DB Version reference Id |  [optional]
**supportedVersions** | **List&lt;UUID&gt;** | Column denoting the supported versions to patch |  [optional]
**softwareImageId** | **UUID** | Software Image Id to which the version is referring to. |  [optional]
**status** | **TessellSoftwareImageStatusDTO** |  |  [optional]



