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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.writer.sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.OffsetDateTime;
import java.util.Optional;


public class UserPublicResponse {

    @JsonProperty("accountStatus")
    private AccountStatus accountStatus;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("avatar")
    private Optional<? extends String> avatar;

    @JsonProperty("createdAt")
    private OffsetDateTime createdAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("email")
    private Optional<? extends String> email;

    @JsonProperty("firstName")
    private String firstName;

    @JsonProperty("fullName")
    private String fullName;

    @JsonProperty("id")
    private long id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("invitedBy")
    private Optional<? extends Long> invitedBy;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lastName")
    private Optional<? extends String> lastName;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lastSeenOnline")
    private Optional<? extends OffsetDateTime> lastSeenOnline;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("timezone")
    private Optional<? extends String> timezone;

    @JsonCreator
    public UserPublicResponse(
            @JsonProperty("accountStatus") AccountStatus accountStatus,
            @JsonProperty("avatar") Optional<? extends String> avatar,
            @JsonProperty("createdAt") OffsetDateTime createdAt,
            @JsonProperty("email") Optional<? extends String> email,
            @JsonProperty("firstName") String firstName,
            @JsonProperty("fullName") String fullName,
            @JsonProperty("id") long id,
            @JsonProperty("invitedBy") Optional<? extends Long> invitedBy,
            @JsonProperty("lastName") Optional<? extends String> lastName,
            @JsonProperty("lastSeenOnline") Optional<? extends OffsetDateTime> lastSeenOnline,
            @JsonProperty("timezone") Optional<? extends String> timezone) {
        Utils.checkNotNull(accountStatus, "accountStatus");
        Utils.checkNotNull(avatar, "avatar");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(email, "email");
        Utils.checkNotNull(firstName, "firstName");
        Utils.checkNotNull(fullName, "fullName");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(invitedBy, "invitedBy");
        Utils.checkNotNull(lastName, "lastName");
        Utils.checkNotNull(lastSeenOnline, "lastSeenOnline");
        Utils.checkNotNull(timezone, "timezone");
        this.accountStatus = accountStatus;
        this.avatar = avatar;
        this.createdAt = createdAt;
        this.email = email;
        this.firstName = firstName;
        this.fullName = fullName;
        this.id = id;
        this.invitedBy = invitedBy;
        this.lastName = lastName;
        this.lastSeenOnline = lastSeenOnline;
        this.timezone = timezone;
    }
    
    public UserPublicResponse(
            AccountStatus accountStatus,
            OffsetDateTime createdAt,
            String firstName,
            String fullName,
            long id) {
        this(accountStatus, Optional.empty(), createdAt, Optional.empty(), firstName, fullName, id, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public AccountStatus accountStatus() {
        return accountStatus;
    }

    @JsonIgnore
    public Optional<? extends String> avatar() {
        return avatar;
    }

    @JsonIgnore
    public OffsetDateTime createdAt() {
        return createdAt;
    }

    @JsonIgnore
    public Optional<? extends String> email() {
        return email;
    }

    @JsonIgnore
    public String firstName() {
        return firstName;
    }

    @JsonIgnore
    public String fullName() {
        return fullName;
    }

    @JsonIgnore
    public long id() {
        return id;
    }

    @JsonIgnore
    public Optional<? extends Long> invitedBy() {
        return invitedBy;
    }

    @JsonIgnore
    public Optional<? extends String> lastName() {
        return lastName;
    }

    @JsonIgnore
    public Optional<? extends OffsetDateTime> lastSeenOnline() {
        return lastSeenOnline;
    }

    @JsonIgnore
    public Optional<? extends String> timezone() {
        return timezone;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public UserPublicResponse withAccountStatus(AccountStatus accountStatus) {
        Utils.checkNotNull(accountStatus, "accountStatus");
        this.accountStatus = accountStatus;
        return this;
    }

    public UserPublicResponse withAvatar(String avatar) {
        Utils.checkNotNull(avatar, "avatar");
        this.avatar = Optional.ofNullable(avatar);
        return this;
    }

    public UserPublicResponse withAvatar(Optional<? extends String> avatar) {
        Utils.checkNotNull(avatar, "avatar");
        this.avatar = avatar;
        return this;
    }

    public UserPublicResponse withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public UserPublicResponse withEmail(String email) {
        Utils.checkNotNull(email, "email");
        this.email = Optional.ofNullable(email);
        return this;
    }

    public UserPublicResponse withEmail(Optional<? extends String> email) {
        Utils.checkNotNull(email, "email");
        this.email = email;
        return this;
    }

    public UserPublicResponse withFirstName(String firstName) {
        Utils.checkNotNull(firstName, "firstName");
        this.firstName = firstName;
        return this;
    }

    public UserPublicResponse withFullName(String fullName) {
        Utils.checkNotNull(fullName, "fullName");
        this.fullName = fullName;
        return this;
    }

    public UserPublicResponse withId(long id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public UserPublicResponse withInvitedBy(long invitedBy) {
        Utils.checkNotNull(invitedBy, "invitedBy");
        this.invitedBy = Optional.ofNullable(invitedBy);
        return this;
    }

    public UserPublicResponse withInvitedBy(Optional<? extends Long> invitedBy) {
        Utils.checkNotNull(invitedBy, "invitedBy");
        this.invitedBy = invitedBy;
        return this;
    }

    public UserPublicResponse withLastName(String lastName) {
        Utils.checkNotNull(lastName, "lastName");
        this.lastName = Optional.ofNullable(lastName);
        return this;
    }

    public UserPublicResponse withLastName(Optional<? extends String> lastName) {
        Utils.checkNotNull(lastName, "lastName");
        this.lastName = lastName;
        return this;
    }

    public UserPublicResponse withLastSeenOnline(OffsetDateTime lastSeenOnline) {
        Utils.checkNotNull(lastSeenOnline, "lastSeenOnline");
        this.lastSeenOnline = Optional.ofNullable(lastSeenOnline);
        return this;
    }

    public UserPublicResponse withLastSeenOnline(Optional<? extends OffsetDateTime> lastSeenOnline) {
        Utils.checkNotNull(lastSeenOnline, "lastSeenOnline");
        this.lastSeenOnline = lastSeenOnline;
        return this;
    }

    public UserPublicResponse withTimezone(String timezone) {
        Utils.checkNotNull(timezone, "timezone");
        this.timezone = Optional.ofNullable(timezone);
        return this;
    }

    public UserPublicResponse withTimezone(Optional<? extends String> timezone) {
        Utils.checkNotNull(timezone, "timezone");
        this.timezone = timezone;
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
        UserPublicResponse other = (UserPublicResponse) o;
        return 
            java.util.Objects.deepEquals(this.accountStatus, other.accountStatus) &&
            java.util.Objects.deepEquals(this.avatar, other.avatar) &&
            java.util.Objects.deepEquals(this.createdAt, other.createdAt) &&
            java.util.Objects.deepEquals(this.email, other.email) &&
            java.util.Objects.deepEquals(this.firstName, other.firstName) &&
            java.util.Objects.deepEquals(this.fullName, other.fullName) &&
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.invitedBy, other.invitedBy) &&
            java.util.Objects.deepEquals(this.lastName, other.lastName) &&
            java.util.Objects.deepEquals(this.lastSeenOnline, other.lastSeenOnline) &&
            java.util.Objects.deepEquals(this.timezone, other.timezone);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            accountStatus,
            avatar,
            createdAt,
            email,
            firstName,
            fullName,
            id,
            invitedBy,
            lastName,
            lastSeenOnline,
            timezone);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UserPublicResponse.class,
                "accountStatus", accountStatus,
                "avatar", avatar,
                "createdAt", createdAt,
                "email", email,
                "firstName", firstName,
                "fullName", fullName,
                "id", id,
                "invitedBy", invitedBy,
                "lastName", lastName,
                "lastSeenOnline", lastSeenOnline,
                "timezone", timezone);
    }
    
    public final static class Builder {
 
        private AccountStatus accountStatus;
 
        private Optional<? extends String> avatar = Optional.empty();
 
        private OffsetDateTime createdAt;
 
        private Optional<? extends String> email = Optional.empty();
 
        private String firstName;
 
        private String fullName;
 
        private Long id;
 
        private Optional<? extends Long> invitedBy = Optional.empty();
 
        private Optional<? extends String> lastName = Optional.empty();
 
        private Optional<? extends OffsetDateTime> lastSeenOnline = Optional.empty();
 
        private Optional<? extends String> timezone = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder accountStatus(AccountStatus accountStatus) {
            Utils.checkNotNull(accountStatus, "accountStatus");
            this.accountStatus = accountStatus;
            return this;
        }

        public Builder avatar(String avatar) {
            Utils.checkNotNull(avatar, "avatar");
            this.avatar = Optional.ofNullable(avatar);
            return this;
        }

        public Builder avatar(Optional<? extends String> avatar) {
            Utils.checkNotNull(avatar, "avatar");
            this.avatar = avatar;
            return this;
        }

        public Builder createdAt(OffsetDateTime createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = createdAt;
            return this;
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

        public Builder firstName(String firstName) {
            Utils.checkNotNull(firstName, "firstName");
            this.firstName = firstName;
            return this;
        }

        public Builder fullName(String fullName) {
            Utils.checkNotNull(fullName, "fullName");
            this.fullName = fullName;
            return this;
        }

        public Builder id(long id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder invitedBy(long invitedBy) {
            Utils.checkNotNull(invitedBy, "invitedBy");
            this.invitedBy = Optional.ofNullable(invitedBy);
            return this;
        }

        public Builder invitedBy(Optional<? extends Long> invitedBy) {
            Utils.checkNotNull(invitedBy, "invitedBy");
            this.invitedBy = invitedBy;
            return this;
        }

        public Builder lastName(String lastName) {
            Utils.checkNotNull(lastName, "lastName");
            this.lastName = Optional.ofNullable(lastName);
            return this;
        }

        public Builder lastName(Optional<? extends String> lastName) {
            Utils.checkNotNull(lastName, "lastName");
            this.lastName = lastName;
            return this;
        }

        public Builder lastSeenOnline(OffsetDateTime lastSeenOnline) {
            Utils.checkNotNull(lastSeenOnline, "lastSeenOnline");
            this.lastSeenOnline = Optional.ofNullable(lastSeenOnline);
            return this;
        }

        public Builder lastSeenOnline(Optional<? extends OffsetDateTime> lastSeenOnline) {
            Utils.checkNotNull(lastSeenOnline, "lastSeenOnline");
            this.lastSeenOnline = lastSeenOnline;
            return this;
        }

        public Builder timezone(String timezone) {
            Utils.checkNotNull(timezone, "timezone");
            this.timezone = Optional.ofNullable(timezone);
            return this;
        }

        public Builder timezone(Optional<? extends String> timezone) {
            Utils.checkNotNull(timezone, "timezone");
            this.timezone = timezone;
            return this;
        }
        
        public UserPublicResponse build() {
            return new UserPublicResponse(
                accountStatus,
                avatar,
                createdAt,
                email,
                firstName,
                fullName,
                id,
                invitedBy,
                lastName,
                lastSeenOnline,
                timezone);
        }
    }
}

