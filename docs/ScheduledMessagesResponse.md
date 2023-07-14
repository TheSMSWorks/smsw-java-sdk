

# ScheduledMessagesResponse

details of a message scheduled to be sent at a specified date and time

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | **String** | The status of the scheduled message (either &#39;SCHEDULED&#39;, &#39;PROCESSED&#39; or &#39;CANCELLED&#39;) |  [optional] |
|**id** | **String** | The scheduled message ID |  [optional] |
|**batch** | **Boolean** | Describes whether the a batch of messages has been scheduled, or just a single message |  [optional] |
|**message** | [**ScheduledMessagesResponseMessage**](ScheduledMessagesResponseMessage.md) |  |  [optional] |



