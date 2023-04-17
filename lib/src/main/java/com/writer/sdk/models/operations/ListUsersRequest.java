/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.writer.sdk.models.operations;

import com.writer.sdk.utils.SpeakeasyMetadata;

public class ListUsersRequest {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    public Long limit;
    public ListUsersRequest withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=offset")
    public Long offset;
    public ListUsersRequest withOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=search")
    public String search;
    public ListUsersRequest withSearch(String search) {
        this.search = search;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=sortField")
    public ListUsersSortFieldEnum sortField;
    public ListUsersRequest withSortField(ListUsersSortFieldEnum sortField) {
        this.sortField = sortField;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=sortOrder")
    public ListUsersSortOrderEnum sortOrder;
    public ListUsersRequest withSortOrder(ListUsersSortOrderEnum sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    
}
