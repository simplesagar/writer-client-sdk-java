package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.writer.sdk.utils.DateTimeDeserializer;
import com.writer.sdk.utils.DateTimeSerializer;
import java.time.OffsetDateTime;

public class UserPublicResponse {
    @JsonProperty("accountStatus")
    public UserPublicResponseAccountStatusEnum accountStatus;
    public UserPublicResponse withAccountStatus(UserPublicResponseAccountStatusEnum accountStatus) {
        this.accountStatus = accountStatus;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("avatar")
    public String avatar;
    public UserPublicResponse withAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("createdAt")
    public OffsetDateTime createdAt;
    public UserPublicResponse withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("email")
    public String email;
    public UserPublicResponse withEmail(String email) {
        this.email = email;
        return this;
    }
    
    @JsonProperty("firstName")
    public String firstName;
    public UserPublicResponse withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }
    
    @JsonProperty("fullName")
    public String fullName;
    public UserPublicResponse withFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }
    
    @JsonProperty("id")
    public Long id;
    public UserPublicResponse withId(Long id) {
        this.id = id;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("invitedBy")
    public Long invitedBy;
    public UserPublicResponse withInvitedBy(Long invitedBy) {
        this.invitedBy = invitedBy;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lastName")
    public String lastName;
    public UserPublicResponse withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("lastSeenOnline")
    public OffsetDateTime lastSeenOnline;
    public UserPublicResponse withLastSeenOnline(OffsetDateTime lastSeenOnline) {
        this.lastSeenOnline = lastSeenOnline;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("timezone")
    public String timezone;
    public UserPublicResponse withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }
    
}
