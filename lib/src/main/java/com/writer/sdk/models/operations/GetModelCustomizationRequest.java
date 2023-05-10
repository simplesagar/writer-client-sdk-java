/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.writer.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.writer.sdk.utils.SpeakeasyMetadata;

public class GetModelCustomizationRequest {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=customizationId")
    public String customizationId;

    public GetModelCustomizationRequest withCustomizationId(String customizationId) {
        this.customizationId = customizationId;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=modelId")
    public String modelId;

    public GetModelCustomizationRequest withModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=organizationId")
    public Long organizationId;

    public GetModelCustomizationRequest withOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    
    public GetModelCustomizationRequest(@JsonProperty("customizationId") String customizationId, @JsonProperty("modelId") String modelId) {
        this.customizationId = customizationId;
        this.modelId = modelId;
  }
}
