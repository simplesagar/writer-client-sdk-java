/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SnippetTagV2 {
    @JsonProperty("tag")
    public String tag;

    public SnippetTagV2 withTag(String tag) {
        this.tag = tag;
        return this;
    }
    
    public SnippetTagV2(@JsonProperty("tag") String tag) {
        this.tag = tag;
  }
}
