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


public class TerminologyUser {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("email")
    private Optional<? extends String> email;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("fullName")
    private Optional<? extends String> fullName;

    @JsonProperty("id")
    private long id;

    @JsonCreator
    public TerminologyUser(
            @JsonProperty("email") Optional<? extends String> email,
            @JsonProperty("fullName") Optional<? extends String> fullName,
            @JsonProperty("id") long id) {
        Utils.checkNotNull(email, "email");
        Utils.checkNotNull(fullName, "fullName");
        Utils.checkNotNull(id, "id");
        this.email = email;
        this.fullName = fullName;
        this.id = id;
    }
    
    public TerminologyUser(
            long id) {
        this(Optional.empty(), Optional.empty(), id);
    }

    @JsonIgnore
    public Optional<? extends String> email() {
        return email;
    }

    @JsonIgnore
    public Optional<? extends String> fullName() {
        return fullName;
    }

    @JsonIgnore
    public long id() {
        return id;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public TerminologyUser withEmail(String email) {
        Utils.checkNotNull(email, "email");
        this.email = Optional.ofNullable(email);
        return this;
    }

    public TerminologyUser withEmail(Optional<? extends String> email) {
        Utils.checkNotNull(email, "email");
        this.email = email;
        return this;
    }

    public TerminologyUser withFullName(String fullName) {
        Utils.checkNotNull(fullName, "fullName");
        this.fullName = Optional.ofNullable(fullName);
        return this;
    }

    public TerminologyUser withFullName(Optional<? extends String> fullName) {
        Utils.checkNotNull(fullName, "fullName");
        this.fullName = fullName;
        return this;
    }

    public TerminologyUser withId(long id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
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
        TerminologyUser other = (TerminologyUser) o;
        return 
            java.util.Objects.deepEquals(this.email, other.email) &&
            java.util.Objects.deepEquals(this.fullName, other.fullName) &&
            java.util.Objects.deepEquals(this.id, other.id);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            email,
            fullName,
            id);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TerminologyUser.class,
                "email", email,
                "fullName", fullName,
                "id", id);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> email = Optional.empty();
 
        private Optional<? extends String> fullName = Optional.empty();
 
        private Long id;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder email(String email) {
            Utils.checkNotNull(email, "email");
            this.email = Optional.ofNullable(email);
            return this;
        }

        public Builder email(Optional<? extends String> email) {
            Utils.checkNotNull(email, "email");
            this.email = email;
            return this;
        }

        public Builder fullName(String fullName) {
            Utils.checkNotNull(fullName, "fullName");
            this.fullName = Optional.ofNullable(fullName);
            return this;
        }

        public Builder fullName(Optional<? extends String> fullName) {
            Utils.checkNotNull(fullName, "fullName");
            this.fullName = fullName;
            return this;
        }

        public Builder id(long id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }
        
        public TerminologyUser build() {
            return new TerminologyUser(
                email,
                fullName,
                id);
        }
    }
}

