/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ContentIssue {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    public String description;

    public ContentIssue withDescription(String description) {
        this.description = description;
        return this;
    }
    
    @JsonProperty("from")
    public Long from;

    public ContentIssue withFrom(Long from) {
        this.from = from;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("meta")
    public Object meta;

    public ContentIssue withMeta(Object meta) {
        this.meta = meta;
        return this;
    }
    
    @JsonProperty("service")
    public Service service;

    public ContentIssue withService(Service service) {
        this.service = service;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("suggestions")
    public String[] suggestions;

    public ContentIssue withSuggestions(String[] suggestions) {
        this.suggestions = suggestions;
        return this;
    }
    
    @JsonProperty("until")
    public Long until;

    public ContentIssue withUntil(Long until) {
        this.until = until;
        return this;
    }
    
    public ContentIssue(@JsonProperty("from") Long from, @JsonProperty("service") Service service, @JsonProperty("until") Long until) {
        this.from = from;
        this.service = service;
        this.until = until;
  }
}
