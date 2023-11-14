/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;


public class ContentDetectorResponse {
    @JsonProperty("label")
    public Label label;

    public ContentDetectorResponse withLabel(Label label) {
        this.label = label;
        return this;
    }
    
    @JsonProperty("score")
    public Double score;

    public ContentDetectorResponse withScore(Double score) {
        this.score = score;
        return this;
    }
    
    public ContentDetectorResponse(@JsonProperty("label") Label label, @JsonProperty("score") Double score) {
        this.label = label;
        this.score = score;
  }
}
