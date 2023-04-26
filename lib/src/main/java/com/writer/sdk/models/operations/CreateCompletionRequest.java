/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.writer.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.writer.sdk.utils.SpeakeasyMetadata;

public class CreateCompletionRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.writer.sdk.models.shared.CompletionRequest completionRequest;
    public CreateCompletionRequest withCompletionRequest(com.writer.sdk.models.shared.CompletionRequest completionRequest) {
        this.completionRequest = completionRequest;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=modelId")
    public String modelId;
    public CreateCompletionRequest withModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=organizationId")
    public Long organizationId;
    public CreateCompletionRequest withOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    
    public CreateCompletionRequest(@JsonProperty("CompletionRequest") com.writer.sdk.models.shared.CompletionRequest completionRequest, @JsonProperty("modelId") String modelId) {
        this.completionRequest = completionRequest;
        this.modelId = modelId;
  }
}
