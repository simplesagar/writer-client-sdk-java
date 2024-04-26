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


public class ModelFilesResponse {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("files")
    private Optional<? extends java.util.List<ModelFile>> files;

    @JsonCreator
    public ModelFilesResponse(
            @JsonProperty("files") Optional<? extends java.util.List<ModelFile>> files) {
        Utils.checkNotNull(files, "files");
        this.files = files;
    }
    
    public ModelFilesResponse() {
        this(Optional.empty());
    }

    @JsonIgnore
    public Optional<? extends java.util.List<ModelFile>> files() {
        return files;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ModelFilesResponse withFiles(java.util.List<ModelFile> files) {
        Utils.checkNotNull(files, "files");
        this.files = Optional.ofNullable(files);
        return this;
    }

    public ModelFilesResponse withFiles(Optional<? extends java.util.List<ModelFile>> files) {
        Utils.checkNotNull(files, "files");
        this.files = files;
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
        ModelFilesResponse other = (ModelFilesResponse) o;
        return 
            java.util.Objects.deepEquals(this.files, other.files);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            files);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ModelFilesResponse.class,
                "files", files);
    }
    
    public final static class Builder {
 
        private Optional<? extends java.util.List<ModelFile>> files = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder files(java.util.List<ModelFile> files) {
            Utils.checkNotNull(files, "files");
            this.files = Optional.ofNullable(files);
            return this;
        }

        public Builder files(Optional<? extends java.util.List<ModelFile>> files) {
            Utils.checkNotNull(files, "files");
            this.files = files;
            return this;
        }
        
        public ModelFilesResponse build() {
            return new ModelFilesResponse(
                files);
        }
    }
}
