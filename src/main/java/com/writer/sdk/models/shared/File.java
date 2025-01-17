/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.writer.sdk.utils.SpeakeasyMetadata;
import com.writer.sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;


public class File {

    @SpeakeasyMetadata("multipartForm:content")
    private byte[] content;

    @SpeakeasyMetadata("multipartForm:name=file")
    private String fileName;

    @JsonCreator
    public File(
            byte[] content,
            String fileName) {
        Utils.checkNotNull(content, "content");
        Utils.checkNotNull(fileName, "fileName");
        this.content = content;
        this.fileName = fileName;
    }

    @JsonIgnore
    public byte[] content() {
        return content;
    }

    @JsonIgnore
    public String fileName() {
        return fileName;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public File withContent(byte[] content) {
        Utils.checkNotNull(content, "content");
        this.content = content;
        return this;
    }

    public File withFileName(String fileName) {
        Utils.checkNotNull(fileName, "fileName");
        this.fileName = fileName;
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
        File other = (File) o;
        return 
            java.util.Objects.deepEquals(this.content, other.content) &&
            java.util.Objects.deepEquals(this.fileName, other.fileName);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            content,
            fileName);
    }
    
    @Override
    public String toString() {
        return Utils.toString(File.class,
                "content", content,
                "fileName", fileName);
    }
    
    public final static class Builder {
 
        private byte[] content;
 
        private String fileName;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder content(byte[] content) {
            Utils.checkNotNull(content, "content");
            this.content = content;
            return this;
        }

        public Builder fileName(String fileName) {
            Utils.checkNotNull(fileName, "fileName");
            this.fileName = fileName;
            return this;
        }
        
        public File build() {
            return new File(
                content,
                fileName);
        }
    }
}

