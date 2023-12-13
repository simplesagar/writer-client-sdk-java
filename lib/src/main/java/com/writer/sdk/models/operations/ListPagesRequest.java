/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.writer.sdk.models.operations;

import com.writer.sdk.utils.SpeakeasyMetadata;


public class ListPagesRequest {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    public Long limit;

    public ListPagesRequest withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=offset")
    public Long offset;

    public ListPagesRequest withOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=status")
    public Status status;

    public ListPagesRequest withStatus(Status status) {
        this.status = status;
        return this;
    }
    
    public ListPagesRequest(){}
}
