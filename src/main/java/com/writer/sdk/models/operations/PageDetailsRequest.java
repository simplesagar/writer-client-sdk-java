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


public class PageDetailsRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=pageId")
    private long pageId;

    @JsonCreator
    public PageDetailsRequest(
            long pageId) {
        Utils.checkNotNull(pageId, "pageId");
        this.pageId = pageId;
    }

    @JsonIgnore
    public long pageId() {
        return pageId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PageDetailsRequest withPageId(long pageId) {
        Utils.checkNotNull(pageId, "pageId");
        this.pageId = pageId;
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
        PageDetailsRequest other = (PageDetailsRequest) o;
        return 
            java.util.Objects.deepEquals(this.pageId, other.pageId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            pageId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PageDetailsRequest.class,
                "pageId", pageId);
    }
    
    public final static class Builder {
 
        private Long pageId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder pageId(long pageId) {
            Utils.checkNotNull(pageId, "pageId");
            this.pageId = pageId;
            return this;
        }
        
        public PageDetailsRequest build() {
            return new PageDetailsRequest(
                pageId);
        }
    }
}

