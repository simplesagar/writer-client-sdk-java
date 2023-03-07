package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SnippetUpdate {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    public String description;
    public SnippetUpdate withDescription(String description) {
        this.description = description;
        return this;
    }
    
    @JsonProperty("id")
    public String id;
    public SnippetUpdate withId(String id) {
        this.id = id;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("shortcut")
    public String shortcut;
    public SnippetUpdate withShortcut(String shortcut) {
        this.shortcut = shortcut;
        return this;
    }
    
    @JsonProperty("snippet")
    public String snippet;
    public SnippetUpdate withSnippet(String snippet) {
        this.snippet = snippet;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tags")
    public SnippetTagV2[] tags;
    public SnippetUpdate withTags(SnippetTagV2[] tags) {
        this.tags = tags;
        return this;
    }
    
}
