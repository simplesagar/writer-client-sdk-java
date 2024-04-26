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


public class Usage {

    @JsonProperty("coWriteWords")
    private UsageItem coWriteWords;

    @JsonProperty("team")
    private UsageItem team;

    @JsonProperty("user")
    private UsageItem user;

    @JsonProperty("words")
    private UsageItem words;

    @JsonCreator
    public Usage(
            @JsonProperty("coWriteWords") UsageItem coWriteWords,
            @JsonProperty("team") UsageItem team,
            @JsonProperty("user") UsageItem user,
            @JsonProperty("words") UsageItem words) {
        Utils.checkNotNull(coWriteWords, "coWriteWords");
        Utils.checkNotNull(team, "team");
        Utils.checkNotNull(user, "user");
        Utils.checkNotNull(words, "words");
        this.coWriteWords = coWriteWords;
        this.team = team;
        this.user = user;
        this.words = words;
    }

    @JsonIgnore
    public UsageItem coWriteWords() {
        return coWriteWords;
    }

    @JsonIgnore
    public UsageItem team() {
        return team;
    }

    @JsonIgnore
    public UsageItem user() {
        return user;
    }

    @JsonIgnore
    public UsageItem words() {
        return words;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Usage withCoWriteWords(UsageItem coWriteWords) {
        Utils.checkNotNull(coWriteWords, "coWriteWords");
        this.coWriteWords = coWriteWords;
        return this;
    }

    public Usage withTeam(UsageItem team) {
        Utils.checkNotNull(team, "team");
        this.team = team;
        return this;
    }

    public Usage withUser(UsageItem user) {
        Utils.checkNotNull(user, "user");
        this.user = user;
        return this;
    }

    public Usage withWords(UsageItem words) {
        Utils.checkNotNull(words, "words");
        this.words = words;
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
        Usage other = (Usage) o;
        return 
            java.util.Objects.deepEquals(this.coWriteWords, other.coWriteWords) &&
            java.util.Objects.deepEquals(this.team, other.team) &&
            java.util.Objects.deepEquals(this.user, other.user) &&
            java.util.Objects.deepEquals(this.words, other.words);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            coWriteWords,
            team,
            user,
            words);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Usage.class,
                "coWriteWords", coWriteWords,
                "team", team,
                "user", user,
                "words", words);
    }
    
    public final static class Builder {
 
        private UsageItem coWriteWords;
 
        private UsageItem team;
 
        private UsageItem user;
 
        private UsageItem words;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder coWriteWords(UsageItem coWriteWords) {
            Utils.checkNotNull(coWriteWords, "coWriteWords");
            this.coWriteWords = coWriteWords;
            return this;
        }

        public Builder team(UsageItem team) {
            Utils.checkNotNull(team, "team");
            this.team = team;
            return this;
        }

        public Builder user(UsageItem user) {
            Utils.checkNotNull(user, "user");
            this.user = user;
            return this;
        }

        public Builder words(UsageItem words) {
            Utils.checkNotNull(words, "words");
            this.words = words;
            return this;
        }
        
        public Usage build() {
            return new Usage(
                coWriteWords,
                team,
                user,
                words);
        }
    }
}
