/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum AccountStatus {
    INVITED("invited"),
    SIGNED_UP("signed_up");

    @JsonValue
    public final String value;

    private AccountStatus(String value) {
        this.value = value;
    }
}
