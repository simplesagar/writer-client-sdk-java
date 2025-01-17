/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import com.writer.sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

public enum Service {
    COMMON_MISTAKES("common-mistakes"),
    BANNED_WORDS("banned-words"),
    DICTIONARY("dictionary"),
    GEC("gec"),
    INFINITIVE("infinitive"),
    SPELLING("spelling"),
    WRITING_STYLE("writing-style"),
    CUSTOM_RULES("custom-rules"),
    SENTENCE_CASE("sentence-case"),
    ACRONYM("acronym"),
    OXFORD_COMMA("oxford-comma"),
    ML_PUNCTUATION("ml-punctuation"),
    EMOJIS("emojis"),
    GENDER_PRONOUNS("gender-pronouns"),
    SENSITIVITY("sensitivity"),
    PLAGIARISM("plagiarism"),
    READABILITY("readability"),
    SENTENCE_COMPLEXITY("sentence-complexity"),
    VOCABULARY("vocabulary"),
    PARAGRAPH_LENGTH("paragraph-length"),
    PLAIN_LANGUAGE("plain-language"),
    HEALTHY_COMMN("healthy-commn"),
    CONFIDENCE("confidence"),
    DATA_LOSS_PREVENTION("data-loss-prevention"),
    HATE_SPEECH("hate-speech"),
    CONTENT_SAFEGUARDS("content-safeguards"),
    FEEDBACK("feedback"),
    CLAIM("claim"),
    QUOTE("quote"),
    GENDER_NOUNS("gender-nouns"),
    GENDER_TONE("gender-tone"),
    GRAMMAR("grammar"),
    PUNCTUATION_DARK("punctuation-dark"),
    FORMATTING("formatting"),
    TWITTER("twitter"),
    GEC_DARK("gec-dark"),
    GEC_GPT3("gec-gpt3");

    @JsonValue
    private final String value;

    private Service(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
