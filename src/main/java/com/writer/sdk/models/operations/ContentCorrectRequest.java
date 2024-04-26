/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.writer.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import com.writer.sdk.utils.SpeakeasyMetadata;
import com.writer.sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;


public class ContentCorrectRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private com.writer.sdk.models.shared.ContentRequest contentRequest;

    @SpeakeasyMetadata("header:style=simple,explode=false,name=X-Request-ID")
    private Optional<? extends String> xRequestID;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=organizationId")
    private Optional<? extends Long> organizationId;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=teamId")
    private long teamId;

    @JsonCreator
    public ContentCorrectRequest(
            com.writer.sdk.models.shared.ContentRequest contentRequest,
            Optional<? extends String> xRequestID,
            Optional<? extends Long> organizationId,
            long teamId) {
        Utils.checkNotNull(contentRequest, "contentRequest");
        Utils.checkNotNull(xRequestID, "xRequestID");
        Utils.checkNotNull(organizationId, "organizationId");
        Utils.checkNotNull(teamId, "teamId");
        this.contentRequest = contentRequest;
        this.xRequestID = xRequestID;
        this.organizationId = organizationId;
        this.teamId = teamId;
    }
    
    public ContentCorrectRequest(
            com.writer.sdk.models.shared.ContentRequest contentRequest,
            long teamId) {
        this(contentRequest, Optional.empty(), Optional.empty(), teamId);
    }

    @JsonIgnore
    public com.writer.sdk.models.shared.ContentRequest contentRequest() {
        return contentRequest;
    }

    @JsonIgnore
    public Optional<? extends String> xRequestID() {
        return xRequestID;
    }

    @JsonIgnore
    public Optional<? extends Long> organizationId() {
        return organizationId;
    }

    @JsonIgnore
    public long teamId() {
        return teamId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ContentCorrectRequest withContentRequest(com.writer.sdk.models.shared.ContentRequest contentRequest) {
        Utils.checkNotNull(contentRequest, "contentRequest");
        this.contentRequest = contentRequest;
        return this;
    }

    public ContentCorrectRequest withXRequestID(String xRequestID) {
        Utils.checkNotNull(xRequestID, "xRequestID");
        this.xRequestID = Optional.ofNullable(xRequestID);
        return this;
    }

    public ContentCorrectRequest withXRequestID(Optional<? extends String> xRequestID) {
        Utils.checkNotNull(xRequestID, "xRequestID");
        this.xRequestID = xRequestID;
        return this;
    }

    public ContentCorrectRequest withOrganizationId(long organizationId) {
        Utils.checkNotNull(organizationId, "organizationId");
        this.organizationId = Optional.ofNullable(organizationId);
        return this;
    }

    public ContentCorrectRequest withOrganizationId(Optional<? extends Long> organizationId) {
        Utils.checkNotNull(organizationId, "organizationId");
        this.organizationId = organizationId;
        return this;
    }

    public ContentCorrectRequest withTeamId(long teamId) {
        Utils.checkNotNull(teamId, "teamId");
        this.teamId = teamId;
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
        ContentCorrectRequest other = (ContentCorrectRequest) o;
        return 
            java.util.Objects.deepEquals(this.contentRequest, other.contentRequest) &&
            java.util.Objects.deepEquals(this.xRequestID, other.xRequestID) &&
            java.util.Objects.deepEquals(this.organizationId, other.organizationId) &&
            java.util.Objects.deepEquals(this.teamId, other.teamId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentRequest,
            xRequestID,
            organizationId,
            teamId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ContentCorrectRequest.class,
                "contentRequest", contentRequest,
                "xRequestID", xRequestID,
                "organizationId", organizationId,
                "teamId", teamId);
    }
    
    public final static class Builder {
 
        private com.writer.sdk.models.shared.ContentRequest contentRequest;
 
        private Optional<? extends String> xRequestID = Optional.empty();
 
        private Optional<? extends Long> organizationId = Optional.empty();
 
        private Long teamId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder contentRequest(com.writer.sdk.models.shared.ContentRequest contentRequest) {
            Utils.checkNotNull(contentRequest, "contentRequest");
            this.contentRequest = contentRequest;
            return this;
        }

        public Builder xRequestID(String xRequestID) {
            Utils.checkNotNull(xRequestID, "xRequestID");
            this.xRequestID = Optional.ofNullable(xRequestID);
            return this;
        }

        public Builder xRequestID(Optional<? extends String> xRequestID) {
            Utils.checkNotNull(xRequestID, "xRequestID");
            this.xRequestID = xRequestID;
            return this;
        }

        public Builder organizationId(long organizationId) {
            Utils.checkNotNull(organizationId, "organizationId");
            this.organizationId = Optional.ofNullable(organizationId);
            return this;
        }

        public Builder organizationId(Optional<? extends Long> organizationId) {
            Utils.checkNotNull(organizationId, "organizationId");
            this.organizationId = organizationId;
            return this;
        }

        public Builder teamId(long teamId) {
            Utils.checkNotNull(teamId, "teamId");
            this.teamId = teamId;
            return this;
        }
        
        public ContentCorrectRequest build() {
            return new ContentCorrectRequest(
                contentRequest,
                xRequestID,
                organizationId,
                teamId);
        }
    }
}
