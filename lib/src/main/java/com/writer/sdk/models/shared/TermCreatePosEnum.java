package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum TermCreatePosEnum {
    NOUN("noun"),
    VERB("verb"),
    ADVERB("adverb"),
    ADJECTIVE("adjective");

    @JsonValue
    public final String value;

    private TermCreatePosEnum(String value) {
        this.value = value;
    }
}
