/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PaginatedResultPagePublicApiResponse {
    @JsonProperty("pagination")
    public Pagination pagination;
    public PaginatedResultPagePublicApiResponse withPagination(Pagination pagination) {
        this.pagination = pagination;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("result")
    public PagePublicApiResponse[] result;
    public PaginatedResultPagePublicApiResponse withResult(PagePublicApiResponse[] result) {
        this.result = result;
        return this;
    }
    
    @JsonProperty("totalCount")
    public Long totalCount;
    public PaginatedResultPagePublicApiResponse withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    
    public PaginatedResultPagePublicApiResponse(@JsonProperty("pagination") Pagination pagination, @JsonProperty("totalCount") Long totalCount) {
        this.pagination = pagination;
        this.totalCount = totalCount;
  }
}
