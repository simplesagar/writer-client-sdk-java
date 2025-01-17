/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.writer.sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;


public class Pagination {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("limit")
    private Optional<? extends Long> limit;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("offset")
    private Optional<? extends Long> offset;

    @JsonCreator
    public Pagination(
            @JsonProperty("limit") Optional<? extends Long> limit,
            @JsonProperty("offset") Optional<? extends Long> offset) {
        Utils.checkNotNull(limit, "limit");
        Utils.checkNotNull(offset, "offset");
        this.limit = limit;
        this.offset = offset;
    }
    
    public Pagination() {
        this(Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<? extends Long> limit() {
        return limit;
    }

    @JsonIgnore
    public Optional<? extends Long> offset() {
        return offset;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Pagination withLimit(long limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = Optional.ofNullable(limit);
        return this;
    }

    public Pagination withLimit(Optional<? extends Long> limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = limit;
        return this;
    }

    public Pagination withOffset(long offset) {
        Utils.checkNotNull(offset, "offset");
        this.offset = Optional.ofNullable(offset);
        return this;
    }

    public Pagination withOffset(Optional<? extends Long> offset) {
        Utils.checkNotNull(offset, "offset");
        this.offset = offset;
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
        Pagination other = (Pagination) o;
        return 
            java.util.Objects.deepEquals(this.limit, other.limit) &&
            java.util.Objects.deepEquals(this.offset, other.offset);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            limit,
            offset);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Pagination.class,
                "limit", limit,
                "offset", offset);
    }
    
    public final static class Builder {
 
        private Optional<? extends Long> limit = Optional.empty();
 
        private Optional<? extends Long> offset = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder limit(long limit) {
            Utils.checkNotNull(limit, "limit");
            this.limit = Optional.ofNullable(limit);
            return this;
        }

        public Builder limit(Optional<? extends Long> limit) {
            Utils.checkNotNull(limit, "limit");
            this.limit = limit;
            return this;
        }

        public Builder offset(long offset) {
            Utils.checkNotNull(offset, "offset");
            this.offset = Optional.ofNullable(offset);
            return this;
        }

        public Builder offset(Optional<? extends Long> offset) {
            Utils.checkNotNull(offset, "offset");
            this.offset = offset;
            return this;
        }
        
        public Pagination build() {
            return new Pagination(
                limit,
                offset);
        }
    }
}

