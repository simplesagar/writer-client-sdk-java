/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.writer.sdk.models.operations;

import com.writer.sdk.utils.SpeakeasyMetadata;

public class GenerateContentRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.writer.sdk.models.shared.GenerateTemplateRequest generateTemplateRequest;
    public GenerateContentRequest withGenerateTemplateRequest(com.writer.sdk.models.shared.GenerateTemplateRequest generateTemplateRequest) {
        this.generateTemplateRequest = generateTemplateRequest;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=organizationId")
    public Long organizationId;
    public GenerateContentRequest withOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=teamId")
    public Long teamId;
    public GenerateContentRequest withTeamId(Long teamId) {
        this.teamId = teamId;
        return this;
    }
    
}
