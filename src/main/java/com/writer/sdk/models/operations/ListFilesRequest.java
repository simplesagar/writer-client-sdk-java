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


public class ListFilesRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=organizationId")
    private Optional<? extends Long> organizationId;

    @JsonCreator
    public ListFilesRequest(
            Optional<? extends Long> organizationId) {
        Utils.checkNotNull(organizationId, "organizationId");
        this.organizationId = organizationId;
    }
    
    public ListFilesRequest() {
        this(Optional.empty());
    }

    @JsonIgnore
    public Optional<? extends Long> organizationId() {
        return organizationId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ListFilesRequest withOrganizationId(long organizationId) {
        Utils.checkNotNull(organizationId, "organizationId");
        this.organizationId = Optional.ofNullable(organizationId);
        return this;
    }

    public ListFilesRequest withOrganizationId(Optional<? extends Long> organizationId) {
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
        ListFilesRequest other = (ListFilesRequest) o;
        return 
            java.util.Objects.deepEquals(this.organizationId, other.organizationId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            organizationId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListFilesRequest.class,
                "organizationId", organizationId);
    }
    
    public final static class Builder {
 
        private Optional<? extends Long> organizationId = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
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
        
        public ListFilesRequest build() {
            return new ListFilesRequest(
                organizationId);
        }
    }
}

