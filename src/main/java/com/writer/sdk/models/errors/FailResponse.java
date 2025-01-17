/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.writer.sdk.models.errors;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.writer.sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.http.HttpResponse;
import java.util.Optional;

/**
 * FailResponse - Bad Request
 */
public class FailResponse extends RuntimeException {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("errors")
    private Optional<? extends java.util.List<com.writer.sdk.models.shared.FailMessage>> errors;

    @JsonProperty("extras")
    private java.lang.Object extras;

    @JsonProperty("tpe")
    private String tpe;

    @JsonCreator
    public FailResponse(
            @JsonProperty("errors") Optional<? extends java.util.List<com.writer.sdk.models.shared.FailMessage>> errors,
            @JsonProperty("extras") java.lang.Object extras,
            @JsonProperty("tpe") String tpe) {
        Utils.checkNotNull(errors, "errors");
        Utils.checkNotNull(extras, "extras");
        Utils.checkNotNull(tpe, "tpe");
        this.errors = errors;
        this.extras = extras;
        this.tpe = tpe;
    }
    
    public FailResponse(
            java.lang.Object extras,
            String tpe) {
        this(Optional.empty(), extras, tpe);
    }

    public Optional<? extends java.util.List<com.writer.sdk.models.shared.FailMessage>> errors(){
        return errors;
    }

    public java.lang.Object extras(){
        return extras;
    }

    public String tpe(){
        return tpe;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    public FailResponse withErrors(java.util.List<com.writer.sdk.models.shared.FailMessage> errors) {
        Utils.checkNotNull(errors, "errors");
        this.errors = Optional.ofNullable(errors);
        return this;
    }
    
    public FailResponse withErrors(Optional<? extends java.util.List<com.writer.sdk.models.shared.FailMessage>> errors) {
        Utils.checkNotNull(errors, "errors");
        this.errors = errors;
        return this;
    }

    public FailResponse withExtras(java.lang.Object extras) {
        Utils.checkNotNull(extras, "extras");
        this.extras = extras;
        return this;
    }

    public FailResponse withTpe(String tpe) {
        Utils.checkNotNull(tpe, "tpe");
        this.tpe = tpe;
        return this;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FailResponse other = (FailResponse) o;
        return
            java.util.Objects.deepEquals(this.errors, other.errors) &&
            java.util.Objects.deepEquals(this.extras, other.extras) &&
            java.util.Objects.deepEquals(this.tpe, other.tpe);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            errors,
            extras,
            tpe);
    }

    @Override
    public String toString() {
        return Utils.toString(FailResponse.class,
                "errors", errors,
                "extras", extras,
                "tpe", tpe);
    }

    public final static class Builder {

        private Optional<? extends java.util.List<com.writer.sdk.models.shared.FailMessage>> errors = Optional.empty();

        private java.lang.Object extras;

        private String tpe;

        private Builder() {
          // force use of static builder() method
        }

        public Builder errors(java.util.List<com.writer.sdk.models.shared.FailMessage> errors) {
            Utils.checkNotNull(errors, "errors");
            this.errors = Optional.ofNullable(errors);
            return this;
        }
        
        public Builder errors(Optional<? extends java.util.List<com.writer.sdk.models.shared.FailMessage>> errors) {
            Utils.checkNotNull(errors, "errors");
            this.errors = errors;
            return this;
        }

        public Builder extras(java.lang.Object extras) {
            Utils.checkNotNull(extras, "extras");
            this.extras = extras;
            return this;
        }

        public Builder tpe(String tpe) {
            Utils.checkNotNull(tpe, "tpe");
            this.tpe = tpe;
            return this;
        }

        public FailResponse build() {
            return new FailResponse(
                errors,
                extras,
                tpe);
        }
    }
}
