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


public class ListTeamDocumentsResponse implements com.writer.sdk.utils.Response {

    private Optional<? extends com.writer.sdk.models.shared.BriefDocuments> briefDocuments;

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

    @JsonCreator
    public ListTeamDocumentsResponse(
            Optional<? extends com.writer.sdk.models.shared.BriefDocuments> briefDocuments,
            String contentType,
            java.util.Map<String, java.util.List<String>> headers,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(briefDocuments, "briefDocuments");
        Utils.checkNotNull(contentType, "contentType");
        headers = Utils.emptyMapIfNull(headers);
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.briefDocuments = briefDocuments;
        this.contentType = contentType;
        this.headers = headers;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public ListTeamDocumentsResponse(
            String contentType,
            java.util.Map<String, java.util.List<String>> headers,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(Optional.empty(), contentType, headers, statusCode, rawResponse);
    }

    @JsonIgnore
    public Optional<? extends com.writer.sdk.models.shared.BriefDocuments> briefDocuments() {
        return briefDocuments;
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

    public final static Builder builder() {
        return new Builder();
    }

    public ListTeamDocumentsResponse withBriefDocuments(com.writer.sdk.models.shared.BriefDocuments briefDocuments) {
        Utils.checkNotNull(briefDocuments, "briefDocuments");
        this.briefDocuments = Optional.ofNullable(briefDocuments);
        return this;
    }

    public ListTeamDocumentsResponse withBriefDocuments(Optional<? extends com.writer.sdk.models.shared.BriefDocuments> briefDocuments) {
        Utils.checkNotNull(briefDocuments, "briefDocuments");
        this.briefDocuments = briefDocuments;
        return this;
    }

    /**
     * HTTP response content type for this operation
     */
    public ListTeamDocumentsResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    public ListTeamDocumentsResponse withHeaders(java.util.Map<String, java.util.List<String>> headers) {
        Utils.checkNotNull(headers, "headers");
        this.headers = headers;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public ListTeamDocumentsResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public ListTeamDocumentsResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        ListTeamDocumentsResponse other = (ListTeamDocumentsResponse) o;
        return 
            java.util.Objects.deepEquals(this.briefDocuments, other.briefDocuments) &&
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.headers, other.headers) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            briefDocuments,
            contentType,
            headers,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListTeamDocumentsResponse.class,
                "briefDocuments", briefDocuments,
                "contentType", contentType,
                "headers", headers,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private Optional<? extends com.writer.sdk.models.shared.BriefDocuments> briefDocuments = Optional.empty();
 
        private String contentType;
 
        private java.util.Map<String, java.util.List<String>> headers;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder briefDocuments(com.writer.sdk.models.shared.BriefDocuments briefDocuments) {
            Utils.checkNotNull(briefDocuments, "briefDocuments");
            this.briefDocuments = Optional.ofNullable(briefDocuments);
            return this;
        }

        public Builder briefDocuments(Optional<? extends com.writer.sdk.models.shared.BriefDocuments> briefDocuments) {
            Utils.checkNotNull(briefDocuments, "briefDocuments");
            this.briefDocuments = briefDocuments;
            return this;
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
        
        public ListTeamDocumentsResponse build() {
            return new ListTeamDocumentsResponse(
                briefDocuments,
                contentType,
                headers,
                statusCode,
                rawResponse);
        }
    }
}

