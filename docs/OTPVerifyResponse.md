

# OTPVerifyResponse

Response schema for the /otp/verify method

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**destination** | **String** | The mobile number that the OTP was sent to |  [optional] |
|**status** | **String** | The status of the OTP. If the passcode is used within the validity period then this will be &#39;VERIFIED&#39;, otherwise it will be &#39;EXPIRED&#39; |  [optional] |
|**passcode** | **BigDecimal** | The passcode used. |  [optional] |
|**validity** | **BigDecimal** | The length of time in seconds for which the generated passcode is valid. |  [optional] |
|**metadata** | **Object** | A JSON object storing data supplied when this passcode was generated, for use in your application. |  [optional] |
|**created** | **String** | The ISO 8601 date/time at which this OTP was created |  [optional] |
|**expires** | **String** | The ISO 8601 date/time at which this OTP expires |  [optional] |
|**modified** | **String** | The ISO 8601 date/time at which this OTP was modified (typically when it was verified) |  [optional] |



