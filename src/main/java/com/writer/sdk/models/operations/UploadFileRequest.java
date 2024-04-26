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


public class UploadFileRequest {

    @SpeakeasyMetadata("request:mediaType=multipart/form-data")
    private com.writer.sdk.models.shared.UploadModelFileRequest uploadModelFileRequest;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=organizationId")
    private Optional<? extends Long> organizationId;

    @JsonCreator
    public UploadFileRequest(
            com.writer.sdk.models.shared.UploadModelFileRequest uploadModelFileRequest,
            Optional<? extends Long> organizationId) {
        Utils.checkNotNull(uploadModelFileRequest, "uploadModelFileRequest");
        Utils.checkNotNull(organizationId, "organizationId");
        this.uploadModelFileRequest = uploadModelFileRequest;
        this.organizationId = organizationId;
    }
    
    public UploadFileRequest(
            com.writer.sdk.models.shared.UploadModelFileRequest uploadModelFileRequest) {
        this(uploadModelFileRequest, Optional.empty());
    }

    @JsonIgnore
    public com.writer.sdk.models.shared.UploadModelFileRequest uploadModelFileRequest() {
        return uploadModelFileRequest;
    }

    @JsonIgnore
    public Optional<? extends Long> organizationId() {
        return organizationId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public UploadFileRequest withUploadModelFileRequest(com.writer.sdk.models.shared.UploadModelFileRequest uploadModelFileRequest) {
        Utils.checkNotNull(uploadModelFileRequest, "uploadModelFileRequest");
        this.uploadModelFileRequest = uploadModelFileRequest;
        return this;
    }

    public UploadFileRequest withOrganizationId(long organizationId) {
        Utils.checkNotNull(organizationId, "organizationId");
        this.organizationId = Optional.ofNullable(organizationId);
        return this;
    }

    public UploadFileRequest withOrganizationId(Optional<? extends Long> organizationId) {
        Utils.checkNotNull(organizationId, "organizationId");
        this.organizationId = organizationId;
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
        UploadFileRequest other = (UploadFileRequest) o;
        return 
            java.util.Objects.deepEquals(this.uploadModelFileRequest, other.uploadModelFileRequest) &&
            java.util.Objects.deepEquals(this.organizationId, other.organizationId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            uploadModelFileRequest,
            organizationId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UploadFileRequest.class,
                "uploadModelFileRequest", uploadModelFileRequest,
                "organizationId", organizationId);
    }
    
    public final static class Builder {
 
        private com.writer.sdk.models.shared.UploadModelFileRequest uploadModelFileRequest;
 
        private Optional<? extends Long> organizationId = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder uploadModelFileRequest(com.writer.sdk.models.shared.UploadModelFileRequest uploadModelFileRequest) {
            Utils.checkNotNull(uploadModelFileRequest, "uploadModelFileRequest");
            this.uploadModelFileRequest = uploadModelFileRequest;
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
        
        public UploadFileRequest build() {
            return new UploadFileRequest(
                uploadModelFileRequest,
                organizationId);
        }
    }
}
