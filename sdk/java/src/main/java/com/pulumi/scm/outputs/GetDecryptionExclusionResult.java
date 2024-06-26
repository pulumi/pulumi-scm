// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDecryptionExclusionResult {
    /**
     * @return The Description param.
     * 
     */
    private String description;
    /**
     * @return The Id param.
     * 
     */
    private String id;
    /**
     * @return The Name param.
     * 
     */
    private String name;
    private String tfid;

    private GetDecryptionExclusionResult() {}
    /**
     * @return The Description param.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The Id param.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The Name param.
     * 
     */
    public String name() {
        return this.name;
    }
    public String tfid() {
        return this.tfid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDecryptionExclusionResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String description;
        private String id;
        private String name;
        private String tfid;
        public Builder() {}
        public Builder(GetDecryptionExclusionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.tfid = defaults.tfid;
        }

        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetDecryptionExclusionResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetDecryptionExclusionResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetDecryptionExclusionResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder tfid(String tfid) {
            if (tfid == null) {
              throw new MissingRequiredPropertyException("GetDecryptionExclusionResult", "tfid");
            }
            this.tfid = tfid;
            return this;
        }
        public GetDecryptionExclusionResult build() {
            final var _resultValue = new GetDecryptionExclusionResult();
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.tfid = tfid;
            return _resultValue;
        }
    }
}
