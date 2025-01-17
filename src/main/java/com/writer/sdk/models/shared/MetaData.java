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


public class MetaData {

    @JsonProperty("portal")
    private java.util.Map<String, String> portal;

    @JsonProperty("reporting")
    private java.util.Map<String, String> reporting;

    @JsonProperty("snippetsCount")
    private long snippetsCount;

    @JsonProperty("ssoAccess")
    private boolean ssoAccess;

    @JsonProperty("styleguide")
    private java.util.Map<String, String> styleguide;

    @JsonProperty("teamCount")
    private long teamCount;

    @JsonProperty("termsCount")
    private long termsCount;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tier")
    private Optional<? extends Tier> tier;

    @JsonCreator
    public MetaData(
            @JsonProperty("portal") java.util.Map<String, String> portal,
            @JsonProperty("reporting") java.util.Map<String, String> reporting,
            @JsonProperty("snippetsCount") long snippetsCount,
            @JsonProperty("ssoAccess") boolean ssoAccess,
            @JsonProperty("styleguide") java.util.Map<String, String> styleguide,
            @JsonProperty("teamCount") long teamCount,
            @JsonProperty("termsCount") long termsCount,
            @JsonProperty("tier") Optional<? extends Tier> tier) {
        portal = Utils.emptyMapIfNull(portal);
        reporting = Utils.emptyMapIfNull(reporting);
        Utils.checkNotNull(snippetsCount, "snippetsCount");
        Utils.checkNotNull(ssoAccess, "ssoAccess");
        styleguide = Utils.emptyMapIfNull(styleguide);
        Utils.checkNotNull(teamCount, "teamCount");
        Utils.checkNotNull(termsCount, "termsCount");
        Utils.checkNotNull(tier, "tier");
        this.portal = portal;
        this.reporting = reporting;
        this.snippetsCount = snippetsCount;
        this.ssoAccess = ssoAccess;
        this.styleguide = styleguide;
        this.teamCount = teamCount;
        this.termsCount = termsCount;
        this.tier = tier;
    }
    
    public MetaData(
            java.util.Map<String, String> portal,
            java.util.Map<String, String> reporting,
            long snippetsCount,
            boolean ssoAccess,
            java.util.Map<String, String> styleguide,
            long teamCount,
            long termsCount) {
        this(portal, reporting, snippetsCount, ssoAccess, styleguide, teamCount, termsCount, Optional.empty());
    }

    @JsonIgnore
    public java.util.Map<String, String> portal() {
        return portal;
    }

    @JsonIgnore
    public java.util.Map<String, String> reporting() {
        return reporting;
    }

    @JsonIgnore
    public long snippetsCount() {
        return snippetsCount;
    }

    @JsonIgnore
    public boolean ssoAccess() {
        return ssoAccess;
    }

    @JsonIgnore
    public java.util.Map<String, String> styleguide() {
        return styleguide;
    }

    @JsonIgnore
    public long teamCount() {
        return teamCount;
    }

    @JsonIgnore
    public long termsCount() {
        return termsCount;
    }

    @JsonIgnore
    public Optional<? extends Tier> tier() {
        return tier;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public MetaData withPortal(java.util.Map<String, String> portal) {
        Utils.checkNotNull(portal, "portal");
        this.portal = portal;
        return this;
    }

    public MetaData withReporting(java.util.Map<String, String> reporting) {
        Utils.checkNotNull(reporting, "reporting");
        this.reporting = reporting;
        return this;
    }

    public MetaData withSnippetsCount(long snippetsCount) {
        Utils.checkNotNull(snippetsCount, "snippetsCount");
        this.snippetsCount = snippetsCount;
        return this;
    }

    public MetaData withSsoAccess(boolean ssoAccess) {
        Utils.checkNotNull(ssoAccess, "ssoAccess");
        this.ssoAccess = ssoAccess;
        return this;
    }

    public MetaData withStyleguide(java.util.Map<String, String> styleguide) {
        Utils.checkNotNull(styleguide, "styleguide");
        this.styleguide = styleguide;
        return this;
    }

    public MetaData withTeamCount(long teamCount) {
        Utils.checkNotNull(teamCount, "teamCount");
        this.teamCount = teamCount;
        return this;
    }

    public MetaData withTermsCount(long termsCount) {
        Utils.checkNotNull(termsCount, "termsCount");
        this.termsCount = termsCount;
        return this;
    }

    public MetaData withTier(Tier tier) {
        Utils.checkNotNull(tier, "tier");
        this.tier = Optional.ofNullable(tier);
        return this;
    }

    public MetaData withTier(Optional<? extends Tier> tier) {
        Utils.checkNotNull(tier, "tier");
        this.tier = tier;
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
        MetaData other = (MetaData) o;
        return 
            java.util.Objects.deepEquals(this.portal, other.portal) &&
            java.util.Objects.deepEquals(this.reporting, other.reporting) &&
            java.util.Objects.deepEquals(this.snippetsCount, other.snippetsCount) &&
            java.util.Objects.deepEquals(this.ssoAccess, other.ssoAccess) &&
            java.util.Objects.deepEquals(this.styleguide, other.styleguide) &&
            java.util.Objects.deepEquals(this.teamCount, other.teamCount) &&
            java.util.Objects.deepEquals(this.termsCount, other.termsCount) &&
            java.util.Objects.deepEquals(this.tier, other.tier);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            portal,
            reporting,
            snippetsCount,
            ssoAccess,
            styleguide,
            teamCount,
            termsCount,
            tier);
    }
    
    @Override
    public String toString() {
        return Utils.toString(MetaData.class,
                "portal", portal,
                "reporting", reporting,
                "snippetsCount", snippetsCount,
                "ssoAccess", ssoAccess,
                "styleguide", styleguide,
                "teamCount", teamCount,
                "termsCount", termsCount,
                "tier", tier);
    }
    
    public final static class Builder {
 
        private java.util.Map<String, String> portal;
 
        private java.util.Map<String, String> reporting;
 
        private Long snippetsCount;
 
        private Boolean ssoAccess;
 
        private java.util.Map<String, String> styleguide;
 
        private Long teamCount;
 
        private Long termsCount;
 
        private Optional<? extends Tier> tier = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder portal(java.util.Map<String, String> portal) {
            Utils.checkNotNull(portal, "portal");
            this.portal = portal;
            return this;
        }

        public Builder reporting(java.util.Map<String, String> reporting) {
            Utils.checkNotNull(reporting, "reporting");
            this.reporting = reporting;
            return this;
        }

        public Builder snippetsCount(long snippetsCount) {
            Utils.checkNotNull(snippetsCount, "snippetsCount");
            this.snippetsCount = snippetsCount;
            return this;
        }

        public Builder ssoAccess(boolean ssoAccess) {
            Utils.checkNotNull(ssoAccess, "ssoAccess");
            this.ssoAccess = ssoAccess;
            return this;
        }

        public Builder styleguide(java.util.Map<String, String> styleguide) {
            Utils.checkNotNull(styleguide, "styleguide");
            this.styleguide = styleguide;
            return this;
        }

        public Builder teamCount(long teamCount) {
            Utils.checkNotNull(teamCount, "teamCount");
            this.teamCount = teamCount;
            return this;
        }

        public Builder termsCount(long termsCount) {
            Utils.checkNotNull(termsCount, "termsCount");
            this.termsCount = termsCount;
            return this;
        }

        public Builder tier(Tier tier) {
            Utils.checkNotNull(tier, "tier");
            this.tier = Optional.ofNullable(tier);
            return this;
        }

        public Builder tier(Optional<? extends Tier> tier) {
            Utils.checkNotNull(tier, "tier");
            this.tier = tier;
            return this;
        }
        
        public MetaData build() {
            return new MetaData(
                portal,
                reporting,
                snippetsCount,
                ssoAccess,
                styleguide,
                teamCount,
                termsCount,
                tier);
        }
    }
}

