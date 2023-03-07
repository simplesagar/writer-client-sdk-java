package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.writer.sdk.utils.DateTimeDeserializer;
import com.writer.sdk.utils.DateTimeSerializer;
import java.time.OffsetDateTime;

public class FullTermWithUser {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("approvedTermExtension")
    public ApprovedTermExtension approvedTermExtension;
    public FullTermWithUser withApprovedTermExtension(ApprovedTermExtension approvedTermExtension) {
        this.approvedTermExtension = approvedTermExtension;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("backlinkedTerms")
    public FullLinkedTerm[] backlinkedTerms;
    public FullTermWithUser withBacklinkedTerms(FullLinkedTerm[] backlinkedTerms) {
        this.backlinkedTerms = backlinkedTerms;
        return this;
    }
    
    @JsonProperty("caseSensitive")
    public Boolean caseSensitive;
    public FullTermWithUser withCaseSensitive(Boolean caseSensitive) {
        this.caseSensitive = caseSensitive;
        return this;
    }
    
    @JsonProperty("createdUser")
    public TerminologyUser createdUser;
    public FullTermWithUser withCreatedUser(TerminologyUser createdUser) {
        this.createdUser = createdUser;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("creationTime")
    public OffsetDateTime creationTime;
    public FullTermWithUser withCreationTime(OffsetDateTime creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    public String description;
    public FullTermWithUser withDescription(String description) {
        this.description = description;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("examples")
    public TermExample[] examples;
    public FullTermWithUser withExamples(TermExample[] examples) {
        this.examples = examples;
        return this;
    }
    
    @JsonProperty("highlight")
    public Boolean highlight;
    public FullTermWithUser withHighlight(Boolean highlight) {
        this.highlight = highlight;
        return this;
    }
    
    @JsonProperty("id")
    public Long id;
    public FullTermWithUser withId(Long id) {
        this.id = id;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("linkedTerms")
    public FullLinkedTerm[] linkedTerms;
    public FullTermWithUser withLinkedTerms(FullLinkedTerm[] linkedTerms) {
        this.linkedTerms = linkedTerms;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mistakes")
    public TermMistake[] mistakes;
    public FullTermWithUser withMistakes(TermMistake[] mistakes) {
        this.mistakes = mistakes;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("modificationTime")
    public OffsetDateTime modificationTime;
    public FullTermWithUser withModificationTime(OffsetDateTime modificationTime) {
        this.modificationTime = modificationTime;
        return this;
    }
    
    @JsonProperty("modifiedUser")
    public TerminologyUser modifiedUser;
    public FullTermWithUser withModifiedUser(TerminologyUser modifiedUser) {
        this.modifiedUser = modifiedUser;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pos")
    public FullTermWithUserPosEnum pos;
    public FullTermWithUser withPos(FullTermWithUserPosEnum pos) {
        this.pos = pos;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tags")
    public TermTagResponse[] tags;
    public FullTermWithUser withTags(TermTagResponse[] tags) {
        this.tags = tags;
        return this;
    }
    
    @JsonProperty("term")
    public String term;
    public FullTermWithUser withTerm(String term) {
        this.term = term;
        return this;
    }
    
    @JsonProperty("termBankId")
    public Long termBankId;
    public FullTermWithUser withTermBankId(Long termBankId) {
        this.termBankId = termBankId;
        return this;
    }
    
    @JsonProperty("type")
    public FullTermWithUserTypeEnum type;
    public FullTermWithUser withType(FullTermWithUserTypeEnum type) {
        this.type = type;
        return this;
    }
    
}
