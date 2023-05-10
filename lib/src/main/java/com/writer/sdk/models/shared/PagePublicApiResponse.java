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

public class PagePublicApiResponse {
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("createdAt")
    public OffsetDateTime createdAt;

    public PagePublicApiResponse withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    @JsonProperty("id")
    public Long id;

    public PagePublicApiResponse withId(Long id) {
        this.id = id;
        return this;
    }
    
    @JsonProperty("order")
    public Long order;

    public PagePublicApiResponse withOrder(Long order) {
        this.order = order;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("section")
    public SectionInfo section;

    public PagePublicApiResponse withSection(SectionInfo section) {
        this.section = section;
        return this;
    }
    
    @JsonProperty("status")
    public PagePublicApiResponseStatusEnum status;

    public PagePublicApiResponse withStatus(PagePublicApiResponseStatusEnum status) {
        this.status = status;
        return this;
    }
    
    @JsonProperty("title")
    public String title;

    public PagePublicApiResponse withTitle(String title) {
        this.title = title;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("updatedAt")
    public OffsetDateTime updatedAt;

    public PagePublicApiResponse withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updatedBy")
    public SimpleUser updatedBy;

    public PagePublicApiResponse withUpdatedBy(SimpleUser updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }
    
    @JsonProperty("url")
    public String url;

    public PagePublicApiResponse withUrl(String url) {
        this.url = url;
        return this;
    }
    
    public PagePublicApiResponse(@JsonProperty("createdAt") OffsetDateTime createdAt, @JsonProperty("id") Long id, @JsonProperty("order") Long order, @JsonProperty("status") PagePublicApiResponseStatusEnum status, @JsonProperty("title") String title, @JsonProperty("updatedAt") OffsetDateTime updatedAt, @JsonProperty("url") String url) {
        this.createdAt = createdAt;
        this.id = id;
        this.order = order;
        this.status = status;
        this.title = title;
        this.updatedAt = updatedAt;
        this.url = url;
  }
}
