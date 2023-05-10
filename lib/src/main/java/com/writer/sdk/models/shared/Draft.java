/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.writer.sdk.utils.DateTimeDeserializer;
import com.writer.sdk.utils.DateTimeSerializer;
import java.time.OffsetDateTime;

public class Draft {
    @JsonProperty("body")
    public String body;

    public Draft withBody(String body) {
        this.body = body;
        return this;
    }
    
    @JsonProperty("createdUserId")
    public Long createdUserId;

    public Draft withCreatedUserId(Long createdUserId) {
        this.createdUserId = createdUserId;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("creationTime")
    public OffsetDateTime creationTime;

    public Draft withCreationTime(OffsetDateTime creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    
    @JsonProperty("deleted")
    public Boolean deleted;

    public Draft withDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }
    
    @JsonProperty("documentId")
    public String documentId;

    public Draft withDocumentId(String documentId) {
        this.documentId = documentId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public Long id;

    public Draft withId(Long id) {
        this.id = id;
        return this;
    }
    
    @JsonProperty("inputs")
    public Object inputs;

    public Draft withInputs(Object inputs) {
        this.inputs = inputs;
        return this;
    }
    
    @JsonProperty("organizationId")
    public Long organizationId;

    public Draft withOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    
    @JsonProperty("teamId")
    public Long teamId;

    public Draft withTeamId(Long teamId) {
        this.teamId = teamId;
        return this;
    }
    
    @JsonProperty("templateId")
    public String templateId;

    public Draft withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    public String title;

    public Draft withTitle(String title) {
        this.title = title;
        return this;
    }
    
    public Draft(@JsonProperty("body") String body, @JsonProperty("createdUserId") Long createdUserId, @JsonProperty("creationTime") OffsetDateTime creationTime, @JsonProperty("deleted") Boolean deleted, @JsonProperty("documentId") String documentId, @JsonProperty("inputs") Object inputs, @JsonProperty("organizationId") Long organizationId, @JsonProperty("teamId") Long teamId, @JsonProperty("templateId") String templateId) {
        this.body = body;
        this.createdUserId = createdUserId;
        this.creationTime = creationTime;
        this.deleted = deleted;
        this.documentId = documentId;
        this.inputs = inputs;
        this.organizationId = organizationId;
        this.teamId = teamId;
        this.templateId = templateId;
  }
}
