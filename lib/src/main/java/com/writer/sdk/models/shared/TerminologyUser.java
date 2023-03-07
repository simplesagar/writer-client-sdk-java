package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TerminologyUser {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("email")
    public String email;
    public TerminologyUser withEmail(String email) {
        this.email = email;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("fullName")
    public String fullName;
    public TerminologyUser withFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }
    
    @JsonProperty("id")
    public Long id;
    public TerminologyUser withId(Long id) {
        this.id = id;
        return this;
    }
    
}
