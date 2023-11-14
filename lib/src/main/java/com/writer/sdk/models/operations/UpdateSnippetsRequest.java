/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.writer.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.writer.sdk.utils.SpeakeasyMetadata;


public class UpdateSnippetsRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.writer.sdk.models.shared.SnippetUpdate[] requestBody;

    public UpdateSnippetsRequest withRequestBody(com.writer.sdk.models.shared.SnippetUpdate[] requestBody) {
        this.requestBody = requestBody;
        return this;
    }
    
    @SpeakeasyMetadata("header:style=simple,explode=false,name=X-Request-ID")
    public String xRequestID;

    public UpdateSnippetsRequest withXRequestID(String xRequestID) {
        this.xRequestID = xRequestID;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=organizationId")
    public Long organizationId;

    public UpdateSnippetsRequest withOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=teamId")
    public Long teamId;

    public UpdateSnippetsRequest withTeamId(Long teamId) {
        this.teamId = teamId;
        return this;
    }
    
    public UpdateSnippetsRequest(@JsonProperty("teamId") Long teamId) {
        this.teamId = teamId;
  }
}
