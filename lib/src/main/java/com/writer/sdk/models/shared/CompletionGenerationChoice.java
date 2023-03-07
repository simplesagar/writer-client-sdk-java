package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CompletionGenerationChoice {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("logprobs")
    public CompletionGenerationChoiceLogprobs logprobs;
    public CompletionGenerationChoice withLogprobs(CompletionGenerationChoiceLogprobs logprobs) {
        this.logprobs = logprobs;
        return this;
    }
    
    @JsonProperty("text")
    public String text;
    public CompletionGenerationChoice withText(String text) {
        this.text = text;
        return this;
    }
    
}
