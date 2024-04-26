/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.writer.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import com.writer.sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.http.HttpResponse;
import java.util.Optional;


public class GetFileResponse implements com.writer.sdk.utils.Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    private java.util.Map<String, java.util.List<String>> headers;

    private Optional<? extends com.writer.sdk.models.shared.ModelFile> modelFile;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public GetFileResponse(
            String contentType,
            java.util.Map<String, java.util.List<String>> headers,
            Optional<? extends com.writer.sdk.models.shared.ModelFile> modelFile,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        headers = Utils.emptyMapIfNull(headers);
        Utils.checkNotNull(modelFile, "modelFile");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.headers = headers;
        this.modelFile = modelFile;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public GetFileResponse(
            String contentType,
            java.util.Map<String, java.util.List<String>> headers,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(contentType, headers, Optional.empty(), statusCode, rawResponse);
    }

    /**
     * HTTP response content type for this operation
     */
    @JsonIgnore
    public String contentType() {
        return contentType;
    }

    @JsonIgnore
    public java.util.Map<String, java.util.List<String>> headers() {
        return headers;
    }

    @JsonIgnore
    public Optional<? extends com.writer.sdk.models.shared.ModelFile> modelFile() {
        return modelFile;
    }

    /**
     * HTTP response status code for this operation
     */
    @JsonIgnore
    public int statusCode() {
        return statusCode;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    @JsonIgnore
    public HttpResponse<InputStream> rawResponse() {
        return rawResponse;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public GetFileResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    public GetFileResponse withHeaders(java.util.Map<String, java.util.List<String>> headers) {
        Utils.checkNotNull(headers, "headers");
        this.headers = headers;
        return this;
    }

    public GetFileResponse withModelFile(com.writer.sdk.models.shared.ModelFile modelFile) {
        Utils.checkNotNull(modelFile, "modelFile");
        this.modelFile = Optional.ofNullable(modelFile);
        return this;
    }

    public GetFileResponse withModelFile(Optional<? extends com.writer.sdk.models.shared.ModelFile> modelFile) {
        Utils.checkNotNull(modelFile, "modelFile");
        this.modelFile = modelFile;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetFileResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetFileResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetFileResponse other = (GetFileResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.headers, other.headers) &&
            java.util.Objects.deepEquals(this.modelFile, other.modelFile) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            headers,
            modelFile,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetFileResponse.class,
                "contentType", contentType,
                "headers", headers,
                "modelFile", modelFile,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private java.util.Map<String, java.util.List<String>> headers;
 
        private Optional<? extends com.writer.sdk.models.shared.ModelFile> modelFile = Optional.empty();
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * HTTP response content type for this operation
         */
        public Builder contentType(String contentType) {
            Utils.checkNotNull(contentType, "contentType");
            this.contentType = contentType;
            return this;
        }

        public Builder headers(java.util.Map<String, java.util.List<String>> headers) {
            Utils.checkNotNull(headers, "headers");
            this.headers = headers;
            return this;
        }

        public Builder modelFile(com.writer.sdk.models.shared.ModelFile modelFile) {
            Utils.checkNotNull(modelFile, "modelFile");
            this.modelFile = Optional.ofNullable(modelFile);
            return this;
        }

        public Builder modelFile(Optional<? extends com.writer.sdk.models.shared.ModelFile> modelFile) {
            Utils.checkNotNull(modelFile, "modelFile");
            this.modelFile = modelFile;
            return this;
        }

        /**
         * HTTP response status code for this operation
         */
        public Builder statusCode(int statusCode) {
            Utils.checkNotNull(statusCode, "statusCode");
            this.statusCode = statusCode;
            return this;
        }

        /**
         * Raw HTTP response; suitable for custom response parsing
         */
        public Builder rawResponse(HttpResponse<InputStream> rawResponse) {
            Utils.checkNotNull(rawResponse, "rawResponse");
            this.rawResponse = rawResponse;
            return this;
        }
        
        public GetFileResponse build() {
            return new GetFileResponse(
                contentType,
                headers,
                modelFile,
                statusCode,
                rawResponse);
        }
    }
}
