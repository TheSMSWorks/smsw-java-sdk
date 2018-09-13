
# BatchMessage

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sender** | **String** | The sender of the message. Should be no longer than 11 characters for alphanumeric or 15 characters for numeric sender ID&#39;s. No spaces or special characters. | 
**destinations** | **List&lt;String&gt;** | Telephone numbers of each of the recipients | 
**content** | **String** | Message to send to the recipient | 
**schedule** | **String** | Date-time at which to send the batch. This is only used by the batch/schedule service. | 
**tag** | **String** | An identifying label for the message, which you can use to filter and report on messages you&#39;ve sent later. Ideal for campaigns. |  [optional]
**ttl** | [**BigDecimal**](BigDecimal.md) | The number of minutes before the message is deleted. Optional. Omit to prevent delivery report deletion. |  [optional]



