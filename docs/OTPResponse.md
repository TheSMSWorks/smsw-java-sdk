

# OTPResponse

Response schema for the /otp/send method

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**messageid** | **String** | The messageid of the SMS used to send the OTP. Save this in your application to use when verifying passcodes. |  [optional] |
|**status** | **String** | The initial status of the OTP message. |  [optional] |
|**credits** | **BigDecimal** | The credit balance on your account |  [optional] |
|**creditsUsed** | **BigDecimal** | The number of credits used to send this message |  [optional] |
|**messageparts** | **BigDecimal** | The number of message parts used to send this message |  [optional] |



