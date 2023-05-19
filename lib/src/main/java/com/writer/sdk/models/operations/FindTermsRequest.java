/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.writer.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.writer.sdk.utils.SpeakeasyMetadata;

public class FindTermsRequest {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    public Long limit;

    public FindTermsRequest withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=offset")
    public Long offset;

    public FindTermsRequest withOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=organizationId")
    public Long organizationId;

    public FindTermsRequest withOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=partOfSpeech")
    public FindTermsPartOfSpeech partOfSpeech;

    public FindTermsRequest withPartOfSpeech(FindTermsPartOfSpeech partOfSpeech) {
        this.partOfSpeech = partOfSpeech;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=sortField")
    public FindTermsSortField sortField;

    public FindTermsRequest withSortField(FindTermsSortField sortField) {
        this.sortField = sortField;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=sortOrder")
    public FindTermsSortOrder sortOrder;

    public FindTermsRequest withSortOrder(FindTermsSortOrder sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=tags")
    public String[] tags;

    public FindTermsRequest withTags(String[] tags) {
        this.tags = tags;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=teamId")
    public Long teamId;

    public FindTermsRequest withTeamId(Long teamId) {
        this.teamId = teamId;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=term")
    public String term;

    public FindTermsRequest withTerm(String term) {
        this.term = term;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=type")
    public FindTermsType type;

    public FindTermsRequest withType(FindTermsType type) {
        this.type = type;
        return this;
    }
    
    public FindTermsRequest(@JsonProperty("teamId") Long teamId) {
        this.teamId = teamId;
  }
}
