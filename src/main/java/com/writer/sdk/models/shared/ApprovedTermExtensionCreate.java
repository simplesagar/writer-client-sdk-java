/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.writer.sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;


public class ApprovedTermExtensionCreate {

    @JsonProperty("capitalize")
    private boolean capitalize;

    @JsonProperty("fixCase")
    private boolean fixCase;

    @JsonProperty("fixCommonMistakes")
    private boolean fixCommonMistakes;

    @JsonCreator
    public ApprovedTermExtensionCreate(
            @JsonProperty("capitalize") boolean capitalize,
            @JsonProperty("fixCase") boolean fixCase,
            @JsonProperty("fixCommonMistakes") boolean fixCommonMistakes) {
        Utils.checkNotNull(capitalize, "capitalize");
        Utils.checkNotNull(fixCase, "fixCase");
        Utils.checkNotNull(fixCommonMistakes, "fixCommonMistakes");
        this.capitalize = capitalize;
        this.fixCase = fixCase;
        this.fixCommonMistakes = fixCommonMistakes;
    }

    @JsonIgnore
    public boolean capitalize() {
        return capitalize;
    }

    @JsonIgnore
    public boolean fixCase() {
        return fixCase;
    }

    @JsonIgnore
    public boolean fixCommonMistakes() {
        return fixCommonMistakes;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ApprovedTermExtensionCreate withCapitalize(boolean capitalize) {
        Utils.checkNotNull(capitalize, "capitalize");
        this.capitalize = capitalize;
        return this;
    }

    public ApprovedTermExtensionCreate withFixCase(boolean fixCase) {
        Utils.checkNotNull(fixCase, "fixCase");
        this.fixCase = fixCase;
        return this;
    }

    public ApprovedTermExtensionCreate withFixCommonMistakes(boolean fixCommonMistakes) {
        Utils.checkNotNull(fixCommonMistakes, "fixCommonMistakes");
        this.fixCommonMistakes = fixCommonMistakes;
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
        ApprovedTermExtensionCreate other = (ApprovedTermExtensionCreate) o;
        return 
            java.util.Objects.deepEquals(this.capitalize, other.capitalize) &&
            java.util.Objects.deepEquals(this.fixCase, other.fixCase) &&
            java.util.Objects.deepEquals(this.fixCommonMistakes, other.fixCommonMistakes);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            capitalize,
            fixCase,
            fixCommonMistakes);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ApprovedTermExtensionCreate.class,
                "capitalize", capitalize,
                "fixCase", fixCase,
                "fixCommonMistakes", fixCommonMistakes);
    }
    
    public final static class Builder {
 
        private Boolean capitalize;
 
        private Boolean fixCase;
 
        private Boolean fixCommonMistakes;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder capitalize(boolean capitalize) {
            Utils.checkNotNull(capitalize, "capitalize");
            this.capitalize = capitalize;
            return this;
        }

        public Builder fixCase(boolean fixCase) {
            Utils.checkNotNull(fixCase, "fixCase");
            this.fixCase = fixCase;
            return this;
        }

        public Builder fixCommonMistakes(boolean fixCommonMistakes) {
            Utils.checkNotNull(fixCommonMistakes, "fixCommonMistakes");
            this.fixCommonMistakes = fixCommonMistakes;
            return this;
        }
        
        public ApprovedTermExtensionCreate build() {
            return new ApprovedTermExtensionCreate(
                capitalize,
                fixCase,
                fixCommonMistakes);
        }
    }
}

