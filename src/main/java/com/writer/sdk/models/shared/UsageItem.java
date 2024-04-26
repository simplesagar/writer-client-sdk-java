/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.writer.sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;


public class UsageItem {

    @JsonProperty("limit")
    private long limit;

    @JsonProperty("value")
    private long value;

    @JsonCreator
    public UsageItem(
            @JsonProperty("limit") long limit,
            @JsonProperty("value") long value) {
        Utils.checkNotNull(limit, "limit");
        Utils.checkNotNull(value, "value");
        this.limit = limit;
        this.value = value;
    }

    @JsonIgnore
    public long limit() {
        return limit;
    }

    @JsonIgnore
    public long value() {
        return value;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public UsageItem withLimit(long limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = limit;
        return this;
    }

    public UsageItem withValue(long value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
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
        UsageItem other = (UsageItem) o;
        return 
            java.util.Objects.deepEquals(this.limit, other.limit) &&
            java.util.Objects.deepEquals(this.value, other.value);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            limit,
            value);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UsageItem.class,
                "limit", limit,
                "value", value);
    }
    
    public final static class Builder {
 
        private Long limit;
 
        private Long value;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder limit(long limit) {
            Utils.checkNotNull(limit, "limit");
            this.limit = limit;
            return this;
        }

        public Builder value(long value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }
        
        public UsageItem build() {
            return new UsageItem(
                limit,
                value);
        }
    }
}
