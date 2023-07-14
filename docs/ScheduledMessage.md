

# ScheduledMessage

the scheduled message content

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sender** | **String** | The sender of the message. Should be no longer than 11 characters for alphanumeric or 15 characters for numeric sender ID&#39;s. No spaces or special characters. |  [optional] |
|**content** | **String** | Message to be sent to the recipient |  [optional] |
|**destination** | **String** | For single scheduled messages, the mobile number of the recipient |  [optional] |
|**destinations** | **List&lt;String&gt;** | For batch messages, the mobile numbers of each of the recipients |  [optional] |
|**schedule** | **String** | Date-time at which to send the batch. This is only used by the batch/schedule service. |  [optional] |



