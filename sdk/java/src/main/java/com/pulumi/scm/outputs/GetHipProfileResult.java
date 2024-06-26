// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetHipProfileResult {
    /**
     * @return The Description param. String length must not exceed 255 characters.
     * 
     */
    private String description;
    /**
     * @return The Id param.
     * 
     */
    private String id;
    /**
     * @return The Match param. String length must not exceed 2048 characters.
     * 
     */
    private String match;
    /**
     * @return Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
     * 
     */
    private String name;
    private String tfid;

    private GetHipProfileResult() {}
    /**
     * @return The Description param. String length must not exceed 255 characters.
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
     * @return The Match param. String length must not exceed 2048 characters.
     * 
     */
    public String match() {
        return this.match;
    }
    /**
     * @return Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
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

    public static Builder builder(GetHipProfileResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String description;
        private String id;
        private String match;
        private String name;
        private String tfid;
        public Builder() {}
        public Builder(GetHipProfileResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.match = defaults.match;
    	      this.name = defaults.name;
    	      this.tfid = defaults.tfid;
        }

        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetHipProfileResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetHipProfileResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder match(String match) {
            if (match == null) {
              throw new MissingRequiredPropertyException("GetHipProfileResult", "match");
            }
            this.match = match;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetHipProfileResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder tfid(String tfid) {
            if (tfid == null) {
              throw new MissingRequiredPropertyException("GetHipProfileResult", "tfid");
            }
            this.tfid = tfid;
            return this;
        }
        public GetHipProfileResult build() {
            final var _resultValue = new GetHipProfileResult();
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.match = match;
            _resultValue.name = name;
            _resultValue.tfid = tfid;
            return _resultValue;
        }
    }
}
