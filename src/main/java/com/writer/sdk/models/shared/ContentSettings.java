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


public class ContentSettings {

    @JsonProperty("ageAndFamilyStatus")
    private boolean ageAndFamilyStatus;

    @JsonProperty("confidence")
    private boolean confidence;

    @JsonProperty("contentSafeguards")
    private boolean contentSafeguards;

    @JsonProperty("disability")
    private boolean disability;

    @JsonProperty("genderIdentitySensitivity")
    private boolean genderIdentitySensitivity;

    @JsonProperty("genderInclusiveNouns")
    private boolean genderInclusiveNouns;

    @JsonProperty("genderInclusivePronouns")
    private boolean genderInclusivePronouns;

    @JsonProperty("grammar")
    private boolean grammar;

    @JsonProperty("healthyCommunication")
    private boolean healthyCommunication;

    @JsonProperty("passiveVoice")
    private boolean passiveVoice;

    @JsonProperty("raceEthnicityNationalitySensitivity")
    private boolean raceEthnicityNationalitySensitivity;

    @JsonProperty("sexualOrientationSensitivity")
    private boolean sexualOrientationSensitivity;

    @JsonProperty("spelling")
    private boolean spelling;

    @JsonProperty("substanceUseSensitivity")
    private boolean substanceUseSensitivity;

    @JsonProperty("unclearReference")
    private boolean unclearReference;

    @JsonProperty("wordiness")
    private boolean wordiness;

    @JsonCreator
    public ContentSettings(
            @JsonProperty("ageAndFamilyStatus") boolean ageAndFamilyStatus,
            @JsonProperty("confidence") boolean confidence,
            @JsonProperty("contentSafeguards") boolean contentSafeguards,
            @JsonProperty("disability") boolean disability,
            @JsonProperty("genderIdentitySensitivity") boolean genderIdentitySensitivity,
            @JsonProperty("genderInclusiveNouns") boolean genderInclusiveNouns,
            @JsonProperty("genderInclusivePronouns") boolean genderInclusivePronouns,
            @JsonProperty("grammar") boolean grammar,
            @JsonProperty("healthyCommunication") boolean healthyCommunication,
            @JsonProperty("passiveVoice") boolean passiveVoice,
            @JsonProperty("raceEthnicityNationalitySensitivity") boolean raceEthnicityNationalitySensitivity,
            @JsonProperty("sexualOrientationSensitivity") boolean sexualOrientationSensitivity,
            @JsonProperty("spelling") boolean spelling,
            @JsonProperty("substanceUseSensitivity") boolean substanceUseSensitivity,
            @JsonProperty("unclearReference") boolean unclearReference,
            @JsonProperty("wordiness") boolean wordiness) {
        Utils.checkNotNull(ageAndFamilyStatus, "ageAndFamilyStatus");
        Utils.checkNotNull(confidence, "confidence");
        Utils.checkNotNull(contentSafeguards, "contentSafeguards");
        Utils.checkNotNull(disability, "disability");
        Utils.checkNotNull(genderIdentitySensitivity, "genderIdentitySensitivity");
        Utils.checkNotNull(genderInclusiveNouns, "genderInclusiveNouns");
        Utils.checkNotNull(genderInclusivePronouns, "genderInclusivePronouns");
        Utils.checkNotNull(grammar, "grammar");
        Utils.checkNotNull(healthyCommunication, "healthyCommunication");
        Utils.checkNotNull(passiveVoice, "passiveVoice");
        Utils.checkNotNull(raceEthnicityNationalitySensitivity, "raceEthnicityNationalitySensitivity");
        Utils.checkNotNull(sexualOrientationSensitivity, "sexualOrientationSensitivity");
        Utils.checkNotNull(spelling, "spelling");
        Utils.checkNotNull(substanceUseSensitivity, "substanceUseSensitivity");
        Utils.checkNotNull(unclearReference, "unclearReference");
        Utils.checkNotNull(wordiness, "wordiness");
        this.ageAndFamilyStatus = ageAndFamilyStatus;
        this.confidence = confidence;
        this.contentSafeguards = contentSafeguards;
        this.disability = disability;
        this.genderIdentitySensitivity = genderIdentitySensitivity;
        this.genderInclusiveNouns = genderInclusiveNouns;
        this.genderInclusivePronouns = genderInclusivePronouns;
        this.grammar = grammar;
        this.healthyCommunication = healthyCommunication;
        this.passiveVoice = passiveVoice;
        this.raceEthnicityNationalitySensitivity = raceEthnicityNationalitySensitivity;
        this.sexualOrientationSensitivity = sexualOrientationSensitivity;
        this.spelling = spelling;
        this.substanceUseSensitivity = substanceUseSensitivity;
        this.unclearReference = unclearReference;
        this.wordiness = wordiness;
    }

    @JsonIgnore
    public boolean ageAndFamilyStatus() {
        return ageAndFamilyStatus;
    }

    @JsonIgnore
    public boolean confidence() {
        return confidence;
    }

    @JsonIgnore
    public boolean contentSafeguards() {
        return contentSafeguards;
    }

    @JsonIgnore
    public boolean disability() {
        return disability;
    }

    @JsonIgnore
    public boolean genderIdentitySensitivity() {
        return genderIdentitySensitivity;
    }

    @JsonIgnore
    public boolean genderInclusiveNouns() {
        return genderInclusiveNouns;
    }

    @JsonIgnore
    public boolean genderInclusivePronouns() {
        return genderInclusivePronouns;
    }

    @JsonIgnore
    public boolean grammar() {
        return grammar;
    }

    @JsonIgnore
    public boolean healthyCommunication() {
        return healthyCommunication;
    }

    @JsonIgnore
    public boolean passiveVoice() {
        return passiveVoice;
    }

    @JsonIgnore
    public boolean raceEthnicityNationalitySensitivity() {
        return raceEthnicityNationalitySensitivity;
    }

    @JsonIgnore
    public boolean sexualOrientationSensitivity() {
        return sexualOrientationSensitivity;
    }

    @JsonIgnore
    public boolean spelling() {
        return spelling;
    }

    @JsonIgnore
    public boolean substanceUseSensitivity() {
        return substanceUseSensitivity;
    }

    @JsonIgnore
    public boolean unclearReference() {
        return unclearReference;
    }

    @JsonIgnore
    public boolean wordiness() {
        return wordiness;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ContentSettings withAgeAndFamilyStatus(boolean ageAndFamilyStatus) {
        Utils.checkNotNull(ageAndFamilyStatus, "ageAndFamilyStatus");
        this.ageAndFamilyStatus = ageAndFamilyStatus;
        return this;
    }

    public ContentSettings withConfidence(boolean confidence) {
        Utils.checkNotNull(confidence, "confidence");
        this.confidence = confidence;
        return this;
    }

    public ContentSettings withContentSafeguards(boolean contentSafeguards) {
        Utils.checkNotNull(contentSafeguards, "contentSafeguards");
        this.contentSafeguards = contentSafeguards;
        return this;
    }

    public ContentSettings withDisability(boolean disability) {
        Utils.checkNotNull(disability, "disability");
        this.disability = disability;
        return this;
    }

    public ContentSettings withGenderIdentitySensitivity(boolean genderIdentitySensitivity) {
        Utils.checkNotNull(genderIdentitySensitivity, "genderIdentitySensitivity");
        this.genderIdentitySensitivity = genderIdentitySensitivity;
        return this;
    }

    public ContentSettings withGenderInclusiveNouns(boolean genderInclusiveNouns) {
        Utils.checkNotNull(genderInclusiveNouns, "genderInclusiveNouns");
        this.genderInclusiveNouns = genderInclusiveNouns;
        return this;
    }

    public ContentSettings withGenderInclusivePronouns(boolean genderInclusivePronouns) {
        Utils.checkNotNull(genderInclusivePronouns, "genderInclusivePronouns");
        this.genderInclusivePronouns = genderInclusivePronouns;
        return this;
    }

    public ContentSettings withGrammar(boolean grammar) {
        Utils.checkNotNull(grammar, "grammar");
        this.grammar = grammar;
        return this;
    }

    public ContentSettings withHealthyCommunication(boolean healthyCommunication) {
        Utils.checkNotNull(healthyCommunication, "healthyCommunication");
        this.healthyCommunication = healthyCommunication;
        return this;
    }

    public ContentSettings withPassiveVoice(boolean passiveVoice) {
        Utils.checkNotNull(passiveVoice, "passiveVoice");
        this.passiveVoice = passiveVoice;
        return this;
    }

    public ContentSettings withRaceEthnicityNationalitySensitivity(boolean raceEthnicityNationalitySensitivity) {
        Utils.checkNotNull(raceEthnicityNationalitySensitivity, "raceEthnicityNationalitySensitivity");
        this.raceEthnicityNationalitySensitivity = raceEthnicityNationalitySensitivity;
        return this;
    }

    public ContentSettings withSexualOrientationSensitivity(boolean sexualOrientationSensitivity) {
        Utils.checkNotNull(sexualOrientationSensitivity, "sexualOrientationSensitivity");
        this.sexualOrientationSensitivity = sexualOrientationSensitivity;
        return this;
    }

    public ContentSettings withSpelling(boolean spelling) {
        Utils.checkNotNull(spelling, "spelling");
        this.spelling = spelling;
        return this;
    }

    public ContentSettings withSubstanceUseSensitivity(boolean substanceUseSensitivity) {
        Utils.checkNotNull(substanceUseSensitivity, "substanceUseSensitivity");
        this.substanceUseSensitivity = substanceUseSensitivity;
        return this;
    }

    public ContentSettings withUnclearReference(boolean unclearReference) {
        Utils.checkNotNull(unclearReference, "unclearReference");
        this.unclearReference = unclearReference;
        return this;
    }

    public ContentSettings withWordiness(boolean wordiness) {
        Utils.checkNotNull(wordiness, "wordiness");
        this.wordiness = wordiness;
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
        ContentSettings other = (ContentSettings) o;
        return 
            java.util.Objects.deepEquals(this.ageAndFamilyStatus, other.ageAndFamilyStatus) &&
            java.util.Objects.deepEquals(this.confidence, other.confidence) &&
            java.util.Objects.deepEquals(this.contentSafeguards, other.contentSafeguards) &&
            java.util.Objects.deepEquals(this.disability, other.disability) &&
            java.util.Objects.deepEquals(this.genderIdentitySensitivity, other.genderIdentitySensitivity) &&
            java.util.Objects.deepEquals(this.genderInclusiveNouns, other.genderInclusiveNouns) &&
            java.util.Objects.deepEquals(this.genderInclusivePronouns, other.genderInclusivePronouns) &&
            java.util.Objects.deepEquals(this.grammar, other.grammar) &&
            java.util.Objects.deepEquals(this.healthyCommunication, other.healthyCommunication) &&
            java.util.Objects.deepEquals(this.passiveVoice, other.passiveVoice) &&
            java.util.Objects.deepEquals(this.raceEthnicityNationalitySensitivity, other.raceEthnicityNationalitySensitivity) &&
            java.util.Objects.deepEquals(this.sexualOrientationSensitivity, other.sexualOrientationSensitivity) &&
            java.util.Objects.deepEquals(this.spelling, other.spelling) &&
            java.util.Objects.deepEquals(this.substanceUseSensitivity, other.substanceUseSensitivity) &&
            java.util.Objects.deepEquals(this.unclearReference, other.unclearReference) &&
            java.util.Objects.deepEquals(this.wordiness, other.wordiness);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            ageAndFamilyStatus,
            confidence,
            contentSafeguards,
            disability,
            genderIdentitySensitivity,
            genderInclusiveNouns,
            genderInclusivePronouns,
            grammar,
            healthyCommunication,
            passiveVoice,
            raceEthnicityNationalitySensitivity,
            sexualOrientationSensitivity,
            spelling,
            substanceUseSensitivity,
            unclearReference,
            wordiness);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ContentSettings.class,
                "ageAndFamilyStatus", ageAndFamilyStatus,
                "confidence", confidence,
                "contentSafeguards", contentSafeguards,
                "disability", disability,
                "genderIdentitySensitivity", genderIdentitySensitivity,
                "genderInclusiveNouns", genderInclusiveNouns,
                "genderInclusivePronouns", genderInclusivePronouns,
                "grammar", grammar,
                "healthyCommunication", healthyCommunication,
                "passiveVoice", passiveVoice,
                "raceEthnicityNationalitySensitivity", raceEthnicityNationalitySensitivity,
                "sexualOrientationSensitivity", sexualOrientationSensitivity,
                "spelling", spelling,
                "substanceUseSensitivity", substanceUseSensitivity,
                "unclearReference", unclearReference,
                "wordiness", wordiness);
    }
    
    public final static class Builder {
 
        private Boolean ageAndFamilyStatus;
 
        private Boolean confidence;
 
        private Boolean contentSafeguards;
 
        private Boolean disability;
 
        private Boolean genderIdentitySensitivity;
 
        private Boolean genderInclusiveNouns;
 
        private Boolean genderInclusivePronouns;
 
        private Boolean grammar;
 
        private Boolean healthyCommunication;
 
        private Boolean passiveVoice;
 
        private Boolean raceEthnicityNationalitySensitivity;
 
        private Boolean sexualOrientationSensitivity;
 
        private Boolean spelling;
 
        private Boolean substanceUseSensitivity;
 
        private Boolean unclearReference;
 
        private Boolean wordiness;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder ageAndFamilyStatus(boolean ageAndFamilyStatus) {
            Utils.checkNotNull(ageAndFamilyStatus, "ageAndFamilyStatus");
            this.ageAndFamilyStatus = ageAndFamilyStatus;
            return this;
        }

        public Builder confidence(boolean confidence) {
            Utils.checkNotNull(confidence, "confidence");
            this.confidence = confidence;
            return this;
        }

        public Builder contentSafeguards(boolean contentSafeguards) {
            Utils.checkNotNull(contentSafeguards, "contentSafeguards");
            this.contentSafeguards = contentSafeguards;
            return this;
        }

        public Builder disability(boolean disability) {
            Utils.checkNotNull(disability, "disability");
            this.disability = disability;
            return this;
        }

        public Builder genderIdentitySensitivity(boolean genderIdentitySensitivity) {
            Utils.checkNotNull(genderIdentitySensitivity, "genderIdentitySensitivity");
            this.genderIdentitySensitivity = genderIdentitySensitivity;
            return this;
        }

        public Builder genderInclusiveNouns(boolean genderInclusiveNouns) {
            Utils.checkNotNull(genderInclusiveNouns, "genderInclusiveNouns");
            this.genderInclusiveNouns = genderInclusiveNouns;
            return this;
        }

        public Builder genderInclusivePronouns(boolean genderInclusivePronouns) {
            Utils.checkNotNull(genderInclusivePronouns, "genderInclusivePronouns");
            this.genderInclusivePronouns = genderInclusivePronouns;
            return this;
        }

        public Builder grammar(boolean grammar) {
            Utils.checkNotNull(grammar, "grammar");
            this.grammar = grammar;
            return this;
        }

        public Builder healthyCommunication(boolean healthyCommunication) {
            Utils.checkNotNull(healthyCommunication, "healthyCommunication");
            this.healthyCommunication = healthyCommunication;
            return this;
        }

        public Builder passiveVoice(boolean passiveVoice) {
            Utils.checkNotNull(passiveVoice, "passiveVoice");
            this.passiveVoice = passiveVoice;
            return this;
        }

        public Builder raceEthnicityNationalitySensitivity(boolean raceEthnicityNationalitySensitivity) {
            Utils.checkNotNull(raceEthnicityNationalitySensitivity, "raceEthnicityNationalitySensitivity");
            this.raceEthnicityNationalitySensitivity = raceEthnicityNationalitySensitivity;
            return this;
        }

        public Builder sexualOrientationSensitivity(boolean sexualOrientationSensitivity) {
            Utils.checkNotNull(sexualOrientationSensitivity, "sexualOrientationSensitivity");
            this.sexualOrientationSensitivity = sexualOrientationSensitivity;
            return this;
        }

        public Builder spelling(boolean spelling) {
            Utils.checkNotNull(spelling, "spelling");
            this.spelling = spelling;
            return this;
        }

        public Builder substanceUseSensitivity(boolean substanceUseSensitivity) {
            Utils.checkNotNull(substanceUseSensitivity, "substanceUseSensitivity");
            this.substanceUseSensitivity = substanceUseSensitivity;
            return this;
        }

        public Builder unclearReference(boolean unclearReference) {
            Utils.checkNotNull(unclearReference, "unclearReference");
            this.unclearReference = unclearReference;
            return this;
        }

        public Builder wordiness(boolean wordiness) {
            Utils.checkNotNull(wordiness, "wordiness");
            this.wordiness = wordiness;
            return this;
        }
        
        public ContentSettings build() {
            return new ContentSettings(
                ageAndFamilyStatus,
                confidence,
                contentSafeguards,
                disability,
                genderIdentitySensitivity,
                genderInclusiveNouns,
                genderInclusivePronouns,
                grammar,
                healthyCommunication,
                passiveVoice,
                raceEthnicityNationalitySensitivity,
                sexualOrientationSensitivity,
                spelling,
                substanceUseSensitivity,
                unclearReference,
                wordiness);
        }
    }
}
