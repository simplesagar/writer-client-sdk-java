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


public class ListModelsRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=organizationId")
    private Optional<? extends Long> organizationId;

    @JsonCreator
    public ListModelsRequest(
            Optional<? extends Long> organizationId) {
        Utils.checkNotNull(organizationId, "organizationId");
        this.organizationId = organizationId;
    }
    
    public ListModelsRequest() {
        this(Optional.empty());
    }

    @JsonIgnore
    public Optional<? extends Long> organizationId() {
        return organizationId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ListModelsRequest withOrganizationId(long organizationId) {
        Utils.checkNotNull(organizationId, "organizationId");
        this.organizationId = Optional.ofNullable(organizationId);
        return this;
    }

    public ListModelsRequest withOrganizationId(Optional<? extends Long> organizationId) {
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
        ListModelsRequest other = (ListModelsRequest) o;
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
        return Utils.toString(ListModelsRequest.class,
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
        
        public ListModelsRequest build() {
            return new ListModelsRequest(
                organizationId);
        }
    }
}

