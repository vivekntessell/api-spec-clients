

# TessellCloneSummaryInfo

This is a definition for Database Clone's summary

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** |  |  [optional]
**name** | **String** | Name of the clone database | 
**subscription** | **String** | Clone&#39;s subscription name |  [optional]
**computeType** | **String** | Clone&#39;s compute type |  [optional]
**status** | **String** | Status of the clone database |  [optional]
**cloudAvailability** | [**List&lt;CloudRegionInfo&gt;**](CloudRegionInfo.md) |  |  [optional]
**cloneInfo** | **Map&lt;String, String&gt;** | Miscellaneous information |  [optional]
**owner** | **String** | The user who created database clone |  [optional]
**dateCreated** | **Date** | Timestamp when the entity was created |  [optional]



