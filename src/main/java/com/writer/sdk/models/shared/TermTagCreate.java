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


public class TermTagCreate {

    @JsonProperty("tag")
    private String tag;

    @JsonCreator
    public TermTagCreate(
            @JsonProperty("tag") String tag) {
        Utils.checkNotNull(tag, "tag");
        this.tag = tag;
    }

    @JsonIgnore
    public String tag() {
        return tag;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public TermTagCreate withTag(String tag) {
        Utils.checkNotNull(tag, "tag");
        this.tag = tag;
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
        TermTagCreate other = (TermTagCreate) o;
        return 
            java.util.Objects.deepEquals(this.tag, other.tag);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            tag);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TermTagCreate.class,
                "tag", tag);
    }
    
    public final static class Builder {
 
        private String tag;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder tag(String tag) {
            Utils.checkNotNull(tag, "tag");
            this.tag = tag;
            return this;
        }
        
        public TermTagCreate build() {
            return new TermTagCreate(
                tag);
        }
    }
}

