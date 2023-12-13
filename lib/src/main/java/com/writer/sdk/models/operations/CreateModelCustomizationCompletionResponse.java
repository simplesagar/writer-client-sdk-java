/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.writer.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class CreateModelCustomizationCompletionResponse {
    
    public com.writer.sdk.models.shared.CompletionResponse completionResponse;

    public CreateModelCustomizationCompletionResponse withCompletionResponse(com.writer.sdk.models.shared.CompletionResponse completionResponse) {
        this.completionResponse = completionResponse;
        return this;
    }
    
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public CreateModelCustomizationCompletionResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Bad Request
     */
    
    public com.writer.sdk.models.shared.FailResponse failResponse;

    public CreateModelCustomizationCompletionResponse withFailResponse(com.writer.sdk.models.shared.FailResponse failResponse) {
        this.failResponse = failResponse;
        return this;
    }
    
    
    public java.util.Map<String, String[]> headers;

    public CreateModelCustomizationCompletionResponse withHeaders(java.util.Map<String, String[]> headers) {
        this.headers = headers;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public CreateModelCustomizationCompletionResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public CreateModelCustomizationCompletionResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public CreateModelCustomizationCompletionResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("Headers") java.util.Map<String, String[]> headers, @JsonProperty("StatusCode") Integer statusCode, @JsonProperty("RawResponse") HttpResponse<byte[]> rawResponse) {
        this.contentType = contentType;
        this.headers = headers;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
  }
}
