/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.writer.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * ListUsersSortOrderEnum
 */
public enum ListUsersSortOrderEnum {
    ASC("asc"),
    DESC("desc");

    @JsonValue
    public final String value;

    private ListUsersSortOrderEnum(String value) {
        this.value = value;
    }
}
