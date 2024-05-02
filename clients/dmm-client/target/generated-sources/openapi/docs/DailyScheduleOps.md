

# DailyScheduleOps


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**backupsPerDay** | **Integer** | The number of backups to be captured per day, this is exclusive with &#39;backupStartTimes&#39; |  [optional]
**backupStartTimes** | [**Set&lt;TimeFormat&gt;**](TimeFormat.md) | List of times when backup(s) has to be captured at. If this is specified, the &#39;backupStartTime&#39; (at top level) value would be overridden by the first entry in this list |  [optional]



