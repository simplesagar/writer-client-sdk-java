/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum TermMistakeCreatePos {
    NOUN("noun"),
    VERB("verb"),
    ADVERB("adverb"),
    ADJECTIVE("adjective");

    @JsonValue
    public final String value;

    private TermMistakeCreatePos(String value) {
        this.value = value;
    }
}