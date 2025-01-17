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


public class ListTemplatesResponse implements com.writer.sdk.utils.Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    private java.util.Map<String, java.util.List<String>> headers;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    private Optional<? extends com.writer.sdk.models.shared.TemplateDetailsResponse> templateDetailsResponse;

    @JsonCreator
    public ListTemplatesResponse(
            String contentType,
            java.util.Map<String, java.util.List<String>> headers,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends com.writer.sdk.models.shared.TemplateDetailsResponse> templateDetailsResponse) {
        Utils.checkNotNull(contentType, "contentType");
        headers = Utils.emptyMapIfNull(headers);
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(templateDetailsResponse, "templateDetailsResponse");
        this.contentType = contentType;
        this.headers = headers;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.templateDetailsResponse = templateDetailsResponse;
    }
    
    public ListTemplatesResponse(
            String contentType,
            java.util.Map<String, java.util.List<String>> headers,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(contentType, headers, statusCode, rawResponse, Optional.empty());
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

    @JsonIgnore
    public Optional<? extends com.writer.sdk.models.shared.TemplateDetailsResponse> templateDetailsResponse() {
        return templateDetailsResponse;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public ListTemplatesResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    public ListTemplatesResponse withHeaders(java.util.Map<String, java.util.List<String>> headers) {
        Utils.checkNotNull(headers, "headers");
        this.headers = headers;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public ListTemplatesResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public ListTemplatesResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    public ListTemplatesResponse withTemplateDetailsResponse(com.writer.sdk.models.shared.TemplateDetailsResponse templateDetailsResponse) {
        Utils.checkNotNull(templateDetailsResponse, "templateDetailsResponse");
        this.templateDetailsResponse = Optional.ofNullable(templateDetailsResponse);
        return this;
    }

    public ListTemplatesResponse withTemplateDetailsResponse(Optional<? extends com.writer.sdk.models.shared.TemplateDetailsResponse> templateDetailsResponse) {
        Utils.checkNotNull(templateDetailsResponse, "templateDetailsResponse");
        this.templateDetailsResponse = templateDetailsResponse;
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
        ListTemplatesResponse other = (ListTemplatesResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.headers, other.headers) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            java.util.Objects.deepEquals(this.templateDetailsResponse, other.templateDetailsResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            headers,
            statusCode,
            rawResponse,
            templateDetailsResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListTemplatesResponse.class,
                "contentType", contentType,
                "headers", headers,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "templateDetailsResponse", templateDetailsResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private java.util.Map<String, java.util.List<String>> headers;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends com.writer.sdk.models.shared.TemplateDetailsResponse> templateDetailsResponse = Optional.empty();  
        
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

        public Builder templateDetailsResponse(com.writer.sdk.models.shared.TemplateDetailsResponse templateDetailsResponse) {
            Utils.checkNotNull(templateDetailsResponse, "templateDetailsResponse");
            this.templateDetailsResponse = Optional.ofNullable(templateDetailsResponse);
            return this;
        }

        public Builder templateDetailsResponse(Optional<? extends com.writer.sdk.models.shared.TemplateDetailsResponse> templateDetailsResponse) {
            Utils.checkNotNull(templateDetailsResponse, "templateDetailsResponse");
            this.templateDetailsResponse = templateDetailsResponse;
            return this;
        }
        
        public ListTemplatesResponse build() {
            return new ListTemplatesResponse(
                contentType,
                headers,
                statusCode,
                rawResponse,
                templateDetailsResponse);
        }
    }
}

