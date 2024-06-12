// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetApplicationGroupResult {
    /**
     * @return The Id param.
     * 
     */
    private String id;
    /**
     * @return The Members param. Individual elements in this list are subject to additional validation. String length must not exceed 63 characters.
     * 
     */
    private List<String> members;
    /**
     * @return Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
     * 
     */
    private String name;
    private String tfid;

    private GetApplicationGroupResult() {}
    /**
     * @return The Id param.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The Members param. Individual elements in this list are subject to additional validation. String length must not exceed 63 characters.
     * 
     */
    public List<String> members() {
        return this.members;
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

    public static Builder builder(GetApplicationGroupResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<String> members;
        private String name;
        private String tfid;
        public Builder() {}
        public Builder(GetApplicationGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.members = defaults.members;
    	      this.name = defaults.name;
    	      this.tfid = defaults.tfid;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetApplicationGroupResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder members(List<String> members) {
            if (members == null) {
              throw new MissingRequiredPropertyException("GetApplicationGroupResult", "members");
            }
            this.members = members;
            return this;
        }
        public Builder members(String... members) {
            return members(List.of(members));
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetApplicationGroupResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder tfid(String tfid) {
            if (tfid == null) {
              throw new MissingRequiredPropertyException("GetApplicationGroupResult", "tfid");
            }
            this.tfid = tfid;
            return this;
        }
        public GetApplicationGroupResult build() {
            final var _resultValue = new GetApplicationGroupResult();
            _resultValue.id = id;
            _resultValue.members = members;
            _resultValue.name = name;
            _resultValue.tfid = tfid;
            return _resultValue;
        }
    }
}