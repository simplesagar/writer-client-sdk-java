/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Input {
    @JsonProperty("dynamic")
    public Boolean dynamic;

    public Input withDynamic(Boolean dynamic) {
        this.dynamic = dynamic;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("help")
    public String help;

    public Input withHelp(String help) {
        this.help = help;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("maxFields")
    public Long maxFields;

    public Input withMaxFields(Long maxFields) {
        this.maxFields = maxFields;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("minFields")
    public Long minFields;

    public Input withMinFields(Long minFields) {
        this.minFields = minFields;
        return this;
    }
    
    @JsonProperty("name")
    public String name;

    public Input withName(String name) {
        this.name = name;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("options")
    public String[] options;

    public Input withOptions(String[] options) {
        this.options = options;
        return this;
    }
    
    @JsonProperty("required")
    public Boolean required;

    public Input withRequired(Boolean required) {
        this.required = required;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("subtitle")
    public String subtitle;

    public Input withSubtitle(String subtitle) {
        this.subtitle = subtitle;
        return this;
    }
    
    @JsonProperty("type")
    public InputType type;

    public Input withType(InputType type) {
        this.type = type;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("unitCopy")
    public String unitCopy;

    public Input withUnitCopy(String unitCopy) {
        this.unitCopy = unitCopy;
        return this;
    }
    
    public Input(@JsonProperty("dynamic") Boolean dynamic, @JsonProperty("name") String name, @JsonProperty("required") Boolean required, @JsonProperty("type") InputType type) {
        this.dynamic = dynamic;
        this.name = name;
        this.required = required;
        this.type = type;
  }
}
