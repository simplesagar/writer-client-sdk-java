/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GenerationModelInfoResponse {
    @JsonProperty("id")
    public String id;

    public GenerationModelInfoResponse withId(String id) {
        this.id = id;
        return this;
    }
    
    @JsonProperty("name")
    public String name;

    public GenerationModelInfoResponse withName(String name) {
        this.name = name;
        return this;
    }
    
    @JsonProperty("type")
    public GenerationModelInfoResponseType type;

    public GenerationModelInfoResponse withType(GenerationModelInfoResponseType type) {
        this.type = type;
        return this;
    }
    
    public GenerationModelInfoResponse(@JsonProperty("id") String id, @JsonProperty("name") String name, @JsonProperty("type") GenerationModelInfoResponseType type) {
        this.id = id;
        this.name = name;
        this.type = type;
  }
}
