/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.writer.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * ListUsersSortOrder
 */
public enum ListUsersSortOrder {
    ASC("asc"),
    DESC("desc");

    @JsonValue
    public final String value;

    private ListUsersSortOrder(String value) {
        this.value = value;
    }
}