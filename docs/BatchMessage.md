

# BatchMessage

SMS Message Batch

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sender** | **String** | The sender of the message. Should be no longer than 11 characters for alphanumeric or 15 characters for numeric sender ID&#39;s. No spaces or special characters. |  |
|**destinations** | **List&lt;String&gt;** | Telephone numbers of each of the recipients |  |
|**content** | **String** | Message to send to the recipient |  |
|**deliveryreporturl** | **String** | The url to which we should POST delivery reports to for this message. If none is specified, we&#39;ll use the global delivery report URL that you&#39;ve configured on your account page. |  [optional] |
|**schedule** | **String** | Date-time at which to send the batch. This is only used by the batch/schedule service. |  [optional] |
|**tag** | **String** | An identifying label for the message, which you can use to filter and report on messages you&#39;ve sent later. Ideal for campaigns. A maximum of 280 characters. |  [optional] |
|**ttl** | **BigDecimal** | The number of minutes before the delivery report is deleted. Optional. Omit to prevent delivery report deletion. Integer. |  [optional] |
|**validity** | **BigDecimal** | The optional number of minutes to attempt delivery before the message is marked as EXPIRED. Optional. The default is 2880 minutes. Integer. |  [optional] |



