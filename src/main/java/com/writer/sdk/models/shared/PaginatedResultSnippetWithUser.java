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


public class PaginatedResultSnippetWithUser {

    @JsonProperty("pagination")
    private Pagination pagination;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("result")
    private Optional<? extends java.util.List<SnippetWithUser>> result;

    @JsonProperty("totalCount")
    private long totalCount;

    @JsonCreator
    public PaginatedResultSnippetWithUser(
            @JsonProperty("pagination") Pagination pagination,
            @JsonProperty("result") Optional<? extends java.util.List<SnippetWithUser>> result,
            @JsonProperty("totalCount") long totalCount) {
        Utils.checkNotNull(pagination, "pagination");
        Utils.checkNotNull(result, "result");
        Utils.checkNotNull(totalCount, "totalCount");
        this.pagination = pagination;
        this.result = result;
        this.totalCount = totalCount;
    }
    
    public PaginatedResultSnippetWithUser(
            Pagination pagination,
            long totalCount) {
        this(pagination, Optional.empty(), totalCount);
    }

    @JsonIgnore
    public Pagination pagination() {
        return pagination;
    }

    @JsonIgnore
    public Optional<? extends java.util.List<SnippetWithUser>> result() {
        return result;
    }

    @JsonIgnore
    public long totalCount() {
        return totalCount;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PaginatedResultSnippetWithUser withPagination(Pagination pagination) {
        Utils.checkNotNull(pagination, "pagination");
        this.pagination = pagination;
        return this;
    }

    public PaginatedResultSnippetWithUser withResult(java.util.List<SnippetWithUser> result) {
        Utils.checkNotNull(result, "result");
        this.result = Optional.ofNullable(result);
        return this;
    }

    public PaginatedResultSnippetWithUser withResult(Optional<? extends java.util.List<SnippetWithUser>> result) {
        Utils.checkNotNull(result, "result");
        this.result = result;
        return this;
    }

    public PaginatedResultSnippetWithUser withTotalCount(long totalCount) {
        Utils.checkNotNull(totalCount, "totalCount");
        this.totalCount = totalCount;
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
        PaginatedResultSnippetWithUser other = (PaginatedResultSnippetWithUser) o;
        return 
            java.util.Objects.deepEquals(this.pagination, other.pagination) &&
            java.util.Objects.deepEquals(this.result, other.result) &&
            java.util.Objects.deepEquals(this.totalCount, other.totalCount);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            pagination,
            result,
            totalCount);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PaginatedResultSnippetWithUser.class,
                "pagination", pagination,
                "result", result,
                "totalCount", totalCount);
    }
    
    public final static class Builder {
 
        private Pagination pagination;
 
        private Optional<? extends java.util.List<SnippetWithUser>> result = Optional.empty();
 
        private Long totalCount;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder pagination(Pagination pagination) {
            Utils.checkNotNull(pagination, "pagination");
            this.pagination = pagination;
            return this;
        }

        public Builder result(java.util.List<SnippetWithUser> result) {
            Utils.checkNotNull(result, "result");
            this.result = Optional.ofNullable(result);
            return this;
        }

        public Builder result(Optional<? extends java.util.List<SnippetWithUser>> result) {
            Utils.checkNotNull(result, "result");
            this.result = result;
            return this;
        }

        public Builder totalCount(long totalCount) {
            Utils.checkNotNull(totalCount, "totalCount");
            this.totalCount = totalCount;
            return this;
        }
        
        public PaginatedResultSnippetWithUser build() {
            return new PaginatedResultSnippetWithUser(
                pagination,
                result,
                totalCount);
        }
    }
}
