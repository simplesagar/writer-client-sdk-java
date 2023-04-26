/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TermExampleCreate {
    @JsonProperty("example")
    public String example;
    public TermExampleCreate withExample(String example) {
        this.example = example;
        return this;
    }
    
    @JsonProperty("type")
    public TermExampleCreateTypeEnum type;
    public TermExampleCreate withType(TermExampleCreateTypeEnum type) {
        this.type = type;
        return this;
    }
    
    public TermExampleCreate(@JsonProperty("example") String example, @JsonProperty("type") TermExampleCreateTypeEnum type) {
        this.example = example;
        this.type = type;
  }
}
