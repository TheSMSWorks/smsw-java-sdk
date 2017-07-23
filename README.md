# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AuthApi;

import java.io.File;
import java.util.*;

public class AuthApiExample {

    public static void main(String[] args) {
        
        AuthApi apiInstance = new AuthApi();
        String customerid = "customerid_example"; // String | The Customer ID
        try {
            ApiKeyResponse result = apiInstance.keySecret(customerid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthApi#keySecret");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.thesmsworks.co.uk:8080/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AuthApi* | [**keySecret**](docs/AuthApi.md#keySecret) | **GET** /auth/getApiKey | 
*AuthApi* | [**login**](docs/AuthApi.md#login) | **POST** /auth/token | 
*BatchMessagesApi* | [**cancelScheduledBatchJob**](docs/BatchMessagesApi.md#cancelScheduledBatchJob) | **DELETE** /batches/schedule/{batchid} | 
*BatchMessagesApi* | [**getBatchById**](docs/BatchMessagesApi.md#getBatchById) | **GET** /batch/{batchid} | 
*BatchMessagesApi* | [**scheduleBatch**](docs/BatchMessagesApi.md#scheduleBatch) | **POST** /batch/schedule | 
*BatchMessagesApi* | [**sendBatch**](docs/BatchMessagesApi.md#sendBatch) | **POST** /batch/send | 
*MessagesApi* | [**cancelScheduledJob**](docs/MessagesApi.md#cancelScheduledJob) | **DELETE** /messages/schedule/{messageid} | 
*MessagesApi* | [**getMessageById**](docs/MessagesApi.md#getMessageById) | **GET** /messages/{messageid} | 
*MessagesApi* | [**getMessages**](docs/MessagesApi.md#getMessages) | **POST** /messages | 
*MessagesApi* | [**scheduleMessage**](docs/MessagesApi.md#scheduleMessage) | **POST** /message/schedule | 
*MessagesApi* | [**sendMessage**](docs/MessagesApi.md#sendMessage) | **POST** /message/send | 
*UtilsApi* | [**hello**](docs/UtilsApi.md#hello) | **GET** /utils/hello | 


## Documentation for Models

 - [ApiKeyResponse](docs/ApiKeyResponse.md)
 - [BatchMessage](docs/BatchMessage.md)
 - [BatchMessageResponse](docs/BatchMessageResponse.md)
 - [CancelledMessageResponse](docs/CancelledMessageResponse.md)
 - [ErrorModel](docs/ErrorModel.md)
 - [HelloWorldResponse](docs/HelloWorldResponse.md)
 - [Login](docs/Login.md)
 - [Message](docs/Message.md)
 - [MessageResponse](docs/MessageResponse.md)
 - [MessagesResponse](docs/MessagesResponse.md)
 - [MessagesResponseMessages](docs/MessagesResponseMessages.md)
 - [Query](docs/Query.md)
 - [ScheduledBatchResponse](docs/ScheduledBatchResponse.md)
 - [ScheduledMessageResponse](docs/ScheduledMessageResponse.md)
 - [SendMessageResponse](docs/SendMessageResponse.md)
 - [TokenResponse](docs/TokenResponse.md)
 - [ExtendedErrorModel](docs/ExtendedErrorModel.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### JWT

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



