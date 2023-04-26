/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PaginatedResultFullTermWithUser {
    @JsonProperty("pagination")
    public Pagination pagination;
    public PaginatedResultFullTermWithUser withPagination(Pagination pagination) {
        this.pagination = pagination;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("result")
    public FullTermWithUser[] result;
    public PaginatedResultFullTermWithUser withResult(FullTermWithUser[] result) {
        this.result = result;
        return this;
    }
    
    @JsonProperty("totalCount")
    public Long totalCount;
    public PaginatedResultFullTermWithUser withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    
    public PaginatedResultFullTermWithUser(@JsonProperty("pagination") Pagination pagination, @JsonProperty("totalCount") Long totalCount) {
        this.pagination = pagination;
        this.totalCount = totalCount;
  }
}
