/**
 * Copyright 2018 Dingfan Zhao
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
/*
 * Apache Fineract API Documentation
 * Apache Fineract is a secure, multi-tenanted microfinance platform. <br />              The goal of the Apache Fineract API is to empower developers to build apps on top of the Apache Fineract Platform. The reference app [  https://demo.openmf.org  ] (username: mifos, password: password) works on the same demo tenant as the interactive links in this documentation.              <br/>The API                 is organized around REST [ https://en.wikipedia.org/wiki/Representational_state_transfer ]               <br/> Find out more about Apache Fineract on [ https://demo.openmf.org/api-docs/apiLive.htm#top ]              <br/> You can Try The API From Your Browser itself at [ https://demo.openmf.org/api-docs/apiLive.htm#interact ]              <br/> The Generic Options are available at [ https://demo.openmf.org/api-docs/apiLive.htm#genopts ]              <br/> Find out more about Updating Dates and Numbers at [ https://demo.openmf.org/api-docs/apiLive.htm#dates_and_numbers ]              <br/> For the Authentication and the Basic of HTTP and HTTPS refer [ https://demo.openmf.org/api-docs/apiLive.htm#authentication_overview ]              <br/> Check about ERROR codes at [ https://demo.openmf.org/api-docs/apiLive.htm#errors ]               <br/> <br/> Please refer to the old documentation for any documentation queries [ https://demo.openmf.org/api-docs/apiLive.htm ]              <br/>             ______________________________________________________________________________________________________________________________          
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.mifos.chatbot.client.api;

import org.mifos.chatbot.client.ApiCallback;
import org.mifos.chatbot.client.ApiClient;
import org.mifos.chatbot.client.ApiException;
import org.mifos.chatbot.client.ApiResponse;
import org.mifos.chatbot.client.Configuration;
import org.mifos.chatbot.client.Pair;
import org.mifos.chatbot.client.ProgressRequestBody;
import org.mifos.chatbot.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.mifos.chatbot.client.model.PostLoansLoanIdScheduleRequest;
import org.mifos.chatbot.client.model.PostLoansLoanIdScheduleResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoanReschedulingApi {
    private ApiClient apiClient;

    public LoanReschedulingApi() {
        this(Configuration.getDefaultApiClient());
    }

    public LoanReschedulingApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for calculateLoanScheduleOrSubmitVariableSchedule
     * @param loanId loanId (required)
     * @param body body (required)
     * @param command command (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call calculateLoanScheduleOrSubmitVariableScheduleCall(Long loanId, PostLoansLoanIdScheduleRequest body, String command, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/loans/{loanId}/schedule"
            .replaceAll("\\{" + "loanId" + "\\}", apiClient.escapeString(loanId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (command != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("command", command));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call calculateLoanScheduleOrSubmitVariableScheduleValidateBeforeCall(Long loanId, PostLoansLoanIdScheduleRequest body, String command, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'loanId' is set
        if (loanId == null) {
            throw new ApiException("Missing the required parameter 'loanId' when calling calculateLoanScheduleOrSubmitVariableSchedule(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling calculateLoanScheduleOrSubmitVariableSchedule(Async)");
        }
        

        com.squareup.okhttp.Call call = calculateLoanScheduleOrSubmitVariableScheduleCall(loanId, body, command, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Calculate loan repayment schedule based on Loan term variations | Updates loan repayment schedule based on Loan term variations | Updates loan repayment schedule by removing Loan term variations
     * Calculate loan repayment schedule based on Loan term variations:  Mandatory Fields: exceptions,locale,dateFormat  Updates loan repayment schedule based on Loan term variations:  Mandatory Fields: exceptions,locale,dateFormat  Updates loan repayment schedule by removing Loan term variations:  It updates the loan repayment schedule by removing Loan term variations  Showing request/response for &#39;Updates loan repayment schedule by removing Loan term variations&#39;
     * @param loanId loanId (required)
     * @param body body (required)
     * @param command command (optional)
     * @return PostLoansLoanIdScheduleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PostLoansLoanIdScheduleResponse calculateLoanScheduleOrSubmitVariableSchedule(Long loanId, PostLoansLoanIdScheduleRequest body, String command) throws ApiException {
        ApiResponse<PostLoansLoanIdScheduleResponse> resp = calculateLoanScheduleOrSubmitVariableScheduleWithHttpInfo(loanId, body, command);
        return resp.getData();
    }

    /**
     * Calculate loan repayment schedule based on Loan term variations | Updates loan repayment schedule based on Loan term variations | Updates loan repayment schedule by removing Loan term variations
     * Calculate loan repayment schedule based on Loan term variations:  Mandatory Fields: exceptions,locale,dateFormat  Updates loan repayment schedule based on Loan term variations:  Mandatory Fields: exceptions,locale,dateFormat  Updates loan repayment schedule by removing Loan term variations:  It updates the loan repayment schedule by removing Loan term variations  Showing request/response for &#39;Updates loan repayment schedule by removing Loan term variations&#39;
     * @param loanId loanId (required)
     * @param body body (required)
     * @param command command (optional)
     * @return ApiResponse&lt;PostLoansLoanIdScheduleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PostLoansLoanIdScheduleResponse> calculateLoanScheduleOrSubmitVariableScheduleWithHttpInfo(Long loanId, PostLoansLoanIdScheduleRequest body, String command) throws ApiException {
        com.squareup.okhttp.Call call = calculateLoanScheduleOrSubmitVariableScheduleValidateBeforeCall(loanId, body, command, null, null);
        Type localVarReturnType = new TypeToken<PostLoansLoanIdScheduleResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Calculate loan repayment schedule based on Loan term variations | Updates loan repayment schedule based on Loan term variations | Updates loan repayment schedule by removing Loan term variations (asynchronously)
     * Calculate loan repayment schedule based on Loan term variations:  Mandatory Fields: exceptions,locale,dateFormat  Updates loan repayment schedule based on Loan term variations:  Mandatory Fields: exceptions,locale,dateFormat  Updates loan repayment schedule by removing Loan term variations:  It updates the loan repayment schedule by removing Loan term variations  Showing request/response for &#39;Updates loan repayment schedule by removing Loan term variations&#39;
     * @param loanId loanId (required)
     * @param body body (required)
     * @param command command (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call calculateLoanScheduleOrSubmitVariableScheduleAsync(Long loanId, PostLoansLoanIdScheduleRequest body, String command, final ApiCallback<PostLoansLoanIdScheduleResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = calculateLoanScheduleOrSubmitVariableScheduleValidateBeforeCall(loanId, body, command, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PostLoansLoanIdScheduleResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
