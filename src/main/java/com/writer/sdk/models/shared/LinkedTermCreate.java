/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.writer.sdk.models.shared;

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
import java.util.Optional;


public class LinkedTermCreate {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("linkedTermId")
    private Optional<? extends Long> linkedTermId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("reference")
    private Optional<? extends String> reference;

    @JsonCreator
    public LinkedTermCreate(
            @JsonProperty("linkedTermId") Optional<? extends Long> linkedTermId,
            @JsonProperty("reference") Optional<? extends String> reference) {
        Utils.checkNotNull(linkedTermId, "linkedTermId");
        Utils.checkNotNull(reference, "reference");
        this.linkedTermId = linkedTermId;
        this.reference = reference;
    }
    
    public LinkedTermCreate() {
        this(Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<? extends Long> linkedTermId() {
        return linkedTermId;
    }

    @JsonIgnore
    public Optional<? extends String> reference() {
        return reference;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public LinkedTermCreate withLinkedTermId(long linkedTermId) {
        Utils.checkNotNull(linkedTermId, "linkedTermId");
        this.linkedTermId = Optional.ofNullable(linkedTermId);
        return this;
    }

    public LinkedTermCreate withLinkedTermId(Optional<? extends Long> linkedTermId) {
        Utils.checkNotNull(linkedTermId, "linkedTermId");
        this.linkedTermId = linkedTermId;
        return this;
    }

    public LinkedTermCreate withReference(String reference) {
        Utils.checkNotNull(reference, "reference");
        this.reference = Optional.ofNullable(reference);
        return this;
    }

    public LinkedTermCreate withReference(Optional<? extends String> reference) {
        Utils.checkNotNull(reference, "reference");
        this.reference = reference;
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
        LinkedTermCreate other = (LinkedTermCreate) o;
        return 
            java.util.Objects.deepEquals(this.linkedTermId, other.linkedTermId) &&
            java.util.Objects.deepEquals(this.reference, other.reference);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            linkedTermId,
            reference);
    }
    
    @Override
    public String toString() {
        return Utils.toString(LinkedTermCreate.class,
                "linkedTermId", linkedTermId,
                "reference", reference);
    }
    
    public final static class Builder {
 
        private Optional<? extends Long> linkedTermId = Optional.empty();
 
        private Optional<? extends String> reference = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder linkedTermId(long linkedTermId) {
            Utils.checkNotNull(linkedTermId, "linkedTermId");
            this.linkedTermId = Optional.ofNullable(linkedTermId);
            return this;
        }

        public Builder linkedTermId(Optional<? extends Long> linkedTermId) {
            Utils.checkNotNull(linkedTermId, "linkedTermId");
            this.linkedTermId = linkedTermId;
            return this;
        }

        public Builder reference(String reference) {
            Utils.checkNotNull(reference, "reference");
            this.reference = Optional.ofNullable(reference);
            return this;
        }

        public Builder reference(Optional<? extends String> reference) {
            Utils.checkNotNull(reference, "reference");
            this.reference = reference;
            return this;
        }
        
        public LinkedTermCreate build() {
            return new LinkedTermCreate(
                linkedTermId,
                reference);
        }
    }
}

