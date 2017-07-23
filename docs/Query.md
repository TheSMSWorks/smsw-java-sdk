
# Query

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **String** | The status of the messages you would like returned (either &#39;SENT&#39;, &#39;DELIVERED&#39;, &#39;EXPIRED&#39;, &#39;DELETED&#39;, &#39;UNDELIVERABLE&#39;, &#39;ACCEPTED&#39;, &#39;UNKNOWN&#39;, &#39;REJECTED&#39;) |  [optional]
**destination** | **String** | The phone number of the recipient |  [optional]
**sender** | **String** | The sender of the message (this can be the configured sender name for an outbound message or the senders phone numner for an inbound message). |  [optional]
**keyword** | **String** | The keyword used in the inbound message |  [optional]
**from** | **String** | The date-time from which you would like matching messages |  [optional]
**to** | **String** | The date-time to which you would like matching messages |  [optional]



