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


public class TermTagResponse {

    @JsonProperty("id")
    private long id;

    @JsonProperty("parentTagId")
    private long parentTagId;

    @JsonProperty("tag")
    private String tag;

    @JsonProperty("termId")
    private long termId;

    @JsonCreator
    public TermTagResponse(
            @JsonProperty("id") long id,
            @JsonProperty("parentTagId") long parentTagId,
            @JsonProperty("tag") String tag,
            @JsonProperty("termId") long termId) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(parentTagId, "parentTagId");
        Utils.checkNotNull(tag, "tag");
        Utils.checkNotNull(termId, "termId");
        this.id = id;
        this.parentTagId = parentTagId;
        this.tag = tag;
        this.termId = termId;
    }

    @JsonIgnore
    public long id() {
        return id;
    }

    @JsonIgnore
    public long parentTagId() {
        return parentTagId;
    }

    @JsonIgnore
    public String tag() {
        return tag;
    }

    @JsonIgnore
    public long termId() {
        return termId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public TermTagResponse withId(long id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public TermTagResponse withParentTagId(long parentTagId) {
        Utils.checkNotNull(parentTagId, "parentTagId");
        this.parentTagId = parentTagId;
        return this;
    }

    public TermTagResponse withTag(String tag) {
        Utils.checkNotNull(tag, "tag");
        this.tag = tag;
        return this;
    }

    public TermTagResponse withTermId(long termId) {
        Utils.checkNotNull(termId, "termId");
        this.termId = termId;
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
        TermTagResponse other = (TermTagResponse) o;
        return 
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.parentTagId, other.parentTagId) &&
            java.util.Objects.deepEquals(this.tag, other.tag) &&
            java.util.Objects.deepEquals(this.termId, other.termId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            id,
            parentTagId,
            tag,
            termId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TermTagResponse.class,
                "id", id,
                "parentTagId", parentTagId,
                "tag", tag,
                "termId", termId);
    }
    
    public final static class Builder {
 
        private Long id;
 
        private Long parentTagId;
 
        private String tag;
 
        private Long termId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder id(long id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder parentTagId(long parentTagId) {
            Utils.checkNotNull(parentTagId, "parentTagId");
            this.parentTagId = parentTagId;
            return this;
        }

        public Builder tag(String tag) {
            Utils.checkNotNull(tag, "tag");
            this.tag = tag;
            return this;
        }

        public Builder termId(long termId) {
            Utils.checkNotNull(termId, "termId");
            this.termId = termId;
            return this;
        }
        
        public TermTagResponse build() {
            return new TermTagResponse(
                id,
                parentTagId,
                tag,
                termId);
        }
    }
}

