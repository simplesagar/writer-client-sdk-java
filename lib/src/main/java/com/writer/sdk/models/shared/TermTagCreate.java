/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TermTagCreate {
    @JsonProperty("tag")
    public String tag;

    public TermTagCreate withTag(String tag) {
        this.tag = tag;
        return this;
    }
    
    public TermTagCreate(@JsonProperty("tag") String tag) {
        this.tag = tag;
  }
}
