/*
 * The SMS Works API
 * The SMS Works provides a low-cost, reliable SMS API for developers. Pay only for delivered texts, all failed UK messages are refunded.
 *
 * The version of the OpenAPI document: 1.9.0
 * Contact: support@thesmsworks.co.uk
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.BatchMessage;
import org.openapitools.client.model.BatchMessageResponse;
import org.openapitools.client.model.CancelledMessageResponse;
import org.openapitools.client.model.ErrorModel;
import org.openapitools.client.model.ExtendedErrorModel;
import org.openapitools.client.model.MessageResponse;
import org.openapitools.client.model.ScheduledBatchResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BatchMessagesApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public BatchMessagesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public BatchMessagesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for batchAnyPost
     * @param messages An array of messages (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Error </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call batchAnyPostCall(Object messages, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = messages;

        // create path and map variables
        String localVarPath = "/batch/any";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=UTF-8"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "JWT" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call batchAnyPostValidateBeforeCall(Object messages, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'messages' is set
        if (messages == null) {
            throw new ApiException("Missing the required parameter 'messages' when calling batchAnyPost(Async)");
        }

        return batchAnyPostCall(messages, _callback);

    }

    /**
     * 
     * Sends a collection of unique SMS messages. Batches may contain up to 5000 messages at a time.
     * @param messages An array of messages (required)
     * @return BatchMessageResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Error </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public BatchMessageResponse batchAnyPost(Object messages) throws ApiException {
        ApiResponse<BatchMessageResponse> localVarResp = batchAnyPostWithHttpInfo(messages);
        return localVarResp.getData();
    }

    /**
     * 
     * Sends a collection of unique SMS messages. Batches may contain up to 5000 messages at a time.
     * @param messages An array of messages (required)
     * @return ApiResponse&lt;BatchMessageResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Error </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<BatchMessageResponse> batchAnyPostWithHttpInfo(Object messages) throws ApiException {
        okhttp3.Call localVarCall = batchAnyPostValidateBeforeCall(messages, null);
        Type localVarReturnType = new TypeToken<BatchMessageResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Sends a collection of unique SMS messages. Batches may contain up to 5000 messages at a time.
     * @param messages An array of messages (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Error </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call batchAnyPostAsync(Object messages, final ApiCallback<BatchMessageResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = batchAnyPostValidateBeforeCall(messages, _callback);
        Type localVarReturnType = new TypeToken<BatchMessageResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for batchBatchidGet
     * @param batchid The ID of the batch you would like returned (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call batchBatchidGetCall(String batchid, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/batch/{batchid}"
            .replace("{" + "batchid" + "}", localVarApiClient.escapeString(batchid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=UTF-8"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "JWT" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call batchBatchidGetValidateBeforeCall(String batchid, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'batchid' is set
        if (batchid == null) {
            throw new ApiException("Missing the required parameter 'batchid' when calling batchBatchidGet(Async)");
        }

        return batchBatchidGetCall(batchid, _callback);

    }

    /**
     * 
     * Retrieve all messages in a batch with the given batch ID
     * @param batchid The ID of the batch you would like returned (required)
     * @return List&lt;MessageResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public List<MessageResponse> batchBatchidGet(String batchid) throws ApiException {
        ApiResponse<List<MessageResponse>> localVarResp = batchBatchidGetWithHttpInfo(batchid);
        return localVarResp.getData();
    }

    /**
     * 
     * Retrieve all messages in a batch with the given batch ID
     * @param batchid The ID of the batch you would like returned (required)
     * @return ApiResponse&lt;List&lt;MessageResponse&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<MessageResponse>> batchBatchidGetWithHttpInfo(String batchid) throws ApiException {
        okhttp3.Call localVarCall = batchBatchidGetValidateBeforeCall(batchid, null);
        Type localVarReturnType = new TypeToken<List<MessageResponse>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Retrieve all messages in a batch with the given batch ID
     * @param batchid The ID of the batch you would like returned (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call batchBatchidGetAsync(String batchid, final ApiCallback<List<MessageResponse>> _callback) throws ApiException {

        okhttp3.Call localVarCall = batchBatchidGetValidateBeforeCall(batchid, _callback);
        Type localVarReturnType = new TypeToken<List<MessageResponse>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for batchSchedulePost
     * @param smsMessage Message properties (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Error </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call batchSchedulePostCall(BatchMessage smsMessage, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = smsMessage;

        // create path and map variables
        String localVarPath = "/batch/schedule";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=UTF-8"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "JWT" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call batchSchedulePostValidateBeforeCall(BatchMessage smsMessage, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'smsMessage' is set
        if (smsMessage == null) {
            throw new ApiException("Missing the required parameter 'smsMessage' when calling batchSchedulePost(Async)");
        }

        return batchSchedulePostCall(smsMessage, _callback);

    }

    /**
     * 
     * Schedules a batch of SMS messages to be sent at the date time you specify
     * @param smsMessage Message properties (required)
     * @return ScheduledBatchResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Error </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public ScheduledBatchResponse batchSchedulePost(BatchMessage smsMessage) throws ApiException {
        ApiResponse<ScheduledBatchResponse> localVarResp = batchSchedulePostWithHttpInfo(smsMessage);
        return localVarResp.getData();
    }

    /**
     * 
     * Schedules a batch of SMS messages to be sent at the date time you specify
     * @param smsMessage Message properties (required)
     * @return ApiResponse&lt;ScheduledBatchResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Error </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ScheduledBatchResponse> batchSchedulePostWithHttpInfo(BatchMessage smsMessage) throws ApiException {
        okhttp3.Call localVarCall = batchSchedulePostValidateBeforeCall(smsMessage, null);
        Type localVarReturnType = new TypeToken<ScheduledBatchResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Schedules a batch of SMS messages to be sent at the date time you specify
     * @param smsMessage Message properties (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Error </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call batchSchedulePostAsync(BatchMessage smsMessage, final ApiCallback<ScheduledBatchResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = batchSchedulePostValidateBeforeCall(smsMessage, _callback);
        Type localVarReturnType = new TypeToken<ScheduledBatchResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for batchSendPost
     * @param smsMessage Message properties (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Error </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call batchSendPostCall(BatchMessage smsMessage, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = smsMessage;

        // create path and map variables
        String localVarPath = "/batch/send";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=UTF-8"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "JWT" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call batchSendPostValidateBeforeCall(BatchMessage smsMessage, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'smsMessage' is set
        if (smsMessage == null) {
            throw new ApiException("Missing the required parameter 'smsMessage' when calling batchSendPost(Async)");
        }

        return batchSendPostCall(smsMessage, _callback);

    }

    /**
     * 
     * Send a single SMS message to multiple recipients.  Batches may contain up to 5000 messages at a time.
     * @param smsMessage Message properties (required)
     * @return BatchMessageResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Error </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public BatchMessageResponse batchSendPost(BatchMessage smsMessage) throws ApiException {
        ApiResponse<BatchMessageResponse> localVarResp = batchSendPostWithHttpInfo(smsMessage);
        return localVarResp.getData();
    }

    /**
     * 
     * Send a single SMS message to multiple recipients.  Batches may contain up to 5000 messages at a time.
     * @param smsMessage Message properties (required)
     * @return ApiResponse&lt;BatchMessageResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Error </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<BatchMessageResponse> batchSendPostWithHttpInfo(BatchMessage smsMessage) throws ApiException {
        okhttp3.Call localVarCall = batchSendPostValidateBeforeCall(smsMessage, null);
        Type localVarReturnType = new TypeToken<BatchMessageResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Send a single SMS message to multiple recipients.  Batches may contain up to 5000 messages at a time.
     * @param smsMessage Message properties (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Error </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call batchSendPostAsync(BatchMessage smsMessage, final ApiCallback<BatchMessageResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = batchSendPostValidateBeforeCall(smsMessage, _callback);
        Type localVarReturnType = new TypeToken<BatchMessageResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for batchesScheduleBatchidDelete
     * @param batchid The ID of the batch you would like returned (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call batchesScheduleBatchidDeleteCall(String batchid, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/batches/schedule/{batchid}"
            .replace("{" + "batchid" + "}", localVarApiClient.escapeString(batchid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=UTF-8"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "JWT" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call batchesScheduleBatchidDeleteValidateBeforeCall(String batchid, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'batchid' is set
        if (batchid == null) {
            throw new ApiException("Missing the required parameter 'batchid' when calling batchesScheduleBatchidDelete(Async)");
        }

        return batchesScheduleBatchidDeleteCall(batchid, _callback);

    }

    /**
     * 
     * Cancels a scheduled SMS message
     * @param batchid The ID of the batch you would like returned (required)
     * @return CancelledMessageResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public CancelledMessageResponse batchesScheduleBatchidDelete(String batchid) throws ApiException {
        ApiResponse<CancelledMessageResponse> localVarResp = batchesScheduleBatchidDeleteWithHttpInfo(batchid);
        return localVarResp.getData();
    }

    /**
     * 
     * Cancels a scheduled SMS message
     * @param batchid The ID of the batch you would like returned (required)
     * @return ApiResponse&lt;CancelledMessageResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CancelledMessageResponse> batchesScheduleBatchidDeleteWithHttpInfo(String batchid) throws ApiException {
        okhttp3.Call localVarCall = batchesScheduleBatchidDeleteValidateBeforeCall(batchid, null);
        Type localVarReturnType = new TypeToken<CancelledMessageResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Cancels a scheduled SMS message
     * @param batchid The ID of the batch you would like returned (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call batchesScheduleBatchidDeleteAsync(String batchid, final ApiCallback<CancelledMessageResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = batchesScheduleBatchidDeleteValidateBeforeCall(batchid, _callback);
        Type localVarReturnType = new TypeToken<CancelledMessageResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
