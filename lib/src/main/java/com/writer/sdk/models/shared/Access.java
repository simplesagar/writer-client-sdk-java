/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Access {
    PRIVATE_("private"),
    PUBLIC_("public"),
    SHARED("shared");

    @JsonValue
    public final String value;

    private Access(String value) {
        this.value = value;
    }
}