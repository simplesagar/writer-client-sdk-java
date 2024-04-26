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


public class TermMistakeCreate {

    @JsonProperty("caseSensitive")
    private boolean caseSensitive;

    @JsonProperty("mistake")
    private String mistake;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pos")
    private Optional<? extends TermMistakeCreatePos> pos;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("reference")
    private Optional<? extends String> reference;

    @JsonCreator
    public TermMistakeCreate(
            @JsonProperty("caseSensitive") boolean caseSensitive,
            @JsonProperty("mistake") String mistake,
            @JsonProperty("pos") Optional<? extends TermMistakeCreatePos> pos,
            @JsonProperty("reference") Optional<? extends String> reference) {
        Utils.checkNotNull(caseSensitive, "caseSensitive");
        Utils.checkNotNull(mistake, "mistake");
        Utils.checkNotNull(pos, "pos");
        Utils.checkNotNull(reference, "reference");
        this.caseSensitive = caseSensitive;
        this.mistake = mistake;
        this.pos = pos;
        this.reference = reference;
    }
    
    public TermMistakeCreate(
            boolean caseSensitive,
            String mistake) {
        this(caseSensitive, mistake, Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public boolean caseSensitive() {
        return caseSensitive;
    }

    @JsonIgnore
    public String mistake() {
        return mistake;
    }

    @JsonIgnore
    public Optional<? extends TermMistakeCreatePos> pos() {
        return pos;
    }

    @JsonIgnore
    public Optional<? extends String> reference() {
        return reference;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public TermMistakeCreate withCaseSensitive(boolean caseSensitive) {
        Utils.checkNotNull(caseSensitive, "caseSensitive");
        this.caseSensitive = caseSensitive;
        return this;
    }

    public TermMistakeCreate withMistake(String mistake) {
        Utils.checkNotNull(mistake, "mistake");
        this.mistake = mistake;
        return this;
    }

    public TermMistakeCreate withPos(TermMistakeCreatePos pos) {
        Utils.checkNotNull(pos, "pos");
        this.pos = Optional.ofNullable(pos);
        return this;
    }

    public TermMistakeCreate withPos(Optional<? extends TermMistakeCreatePos> pos) {
        Utils.checkNotNull(pos, "pos");
        this.pos = pos;
        return this;
    }

    public TermMistakeCreate withReference(String reference) {
        Utils.checkNotNull(reference, "reference");
        this.reference = Optional.ofNullable(reference);
        return this;
    }

    public TermMistakeCreate withReference(Optional<? extends String> reference) {
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
        TermMistakeCreate other = (TermMistakeCreate) o;
        return 
            java.util.Objects.deepEquals(this.caseSensitive, other.caseSensitive) &&
            java.util.Objects.deepEquals(this.mistake, other.mistake) &&
            java.util.Objects.deepEquals(this.pos, other.pos) &&
            java.util.Objects.deepEquals(this.reference, other.reference);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            caseSensitive,
            mistake,
            pos,
            reference);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TermMistakeCreate.class,
                "caseSensitive", caseSensitive,
                "mistake", mistake,
                "pos", pos,
                "reference", reference);
    }
    
    public final static class Builder {
 
        private Boolean caseSensitive;
 
        private String mistake;
 
        private Optional<? extends TermMistakeCreatePos> pos = Optional.empty();
 
        private Optional<? extends String> reference = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder caseSensitive(boolean caseSensitive) {
            Utils.checkNotNull(caseSensitive, "caseSensitive");
            this.caseSensitive = caseSensitive;
            return this;
        }

        public Builder mistake(String mistake) {
            Utils.checkNotNull(mistake, "mistake");
            this.mistake = mistake;
            return this;
        }

        public Builder pos(TermMistakeCreatePos pos) {
            Utils.checkNotNull(pos, "pos");
            this.pos = Optional.ofNullable(pos);
            return this;
        }

        public Builder pos(Optional<? extends TermMistakeCreatePos> pos) {
            Utils.checkNotNull(pos, "pos");
            this.pos = pos;
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
        
        public TermMistakeCreate build() {
            return new TermMistakeCreate(
                caseSensitive,
                mistake,
                pos,
                reference);
        }
    }
}
