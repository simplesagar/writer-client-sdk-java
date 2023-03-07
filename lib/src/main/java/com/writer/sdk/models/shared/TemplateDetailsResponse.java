package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.writer.sdk.utils.DateTimeDeserializer;
import com.writer.sdk.utils.DateTimeSerializer;
import java.time.OffsetDateTime;

public class TemplateDetailsResponse {
    @JsonProperty("categoryId")
    public Long categoryId;
    public TemplateDetailsResponse withCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("creationTime")
    public OffsetDateTime creationTime;
    public TemplateDetailsResponse withCreationTime(OffsetDateTime creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    public String description;
    public TemplateDetailsResponse withDescription(String description) {
        this.description = description;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("guideUrl")
    public String guideUrl;
    public TemplateDetailsResponse withGuideUrl(String guideUrl) {
        this.guideUrl = guideUrl;
        return this;
    }
    
    @JsonProperty("id")
    public String id;
    public TemplateDetailsResponse withId(String id) {
        this.id = id;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("inputs")
    public Input[] inputs;
    public TemplateDetailsResponse withInputs(Input[] inputs) {
        this.inputs = inputs;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("modificationTime")
    public OffsetDateTime modificationTime;
    public TemplateDetailsResponse withModificationTime(OffsetDateTime modificationTime) {
        this.modificationTime = modificationTime;
        return this;
    }
    
    @JsonProperty("name")
    public String name;
    public TemplateDetailsResponse withName(String name) {
        this.name = name;
        return this;
    }
    
}
