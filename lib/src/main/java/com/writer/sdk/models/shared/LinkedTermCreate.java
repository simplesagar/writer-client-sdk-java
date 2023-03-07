package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class LinkedTermCreate {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("linkedTermId")
    public Long linkedTermId;
    public LinkedTermCreate withLinkedTermId(Long linkedTermId) {
        this.linkedTermId = linkedTermId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("reference")
    public String reference;
    public LinkedTermCreate withReference(String reference) {
        this.reference = reference;
        return this;
    }
    
}
