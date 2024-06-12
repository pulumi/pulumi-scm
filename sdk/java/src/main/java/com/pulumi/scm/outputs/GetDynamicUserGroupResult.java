// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDynamicUserGroupResult {
    /**
     * @return The Description param. String length must not exceed 1023 characters.
     * 
     */
    private String description;
    /**
     * @return tag-based filter. String length must not exceed 2047 characters.
     * 
     */
    private String filter;
    /**
     * @return The Id param.
     * 
     */
    private String id;
    /**
     * @return Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 63 characters.
     * 
     */
    private String name;
    /**
     * @return Tags for dynamic user group object. List must contain at most 64 elements. Individual elements in this list are subject to additional validation. String length must not exceed 127 characters.
     * 
     */
    private List<String> tags;
    private String tfid;

    private GetDynamicUserGroupResult() {}
    /**
     * @return The Description param. String length must not exceed 1023 characters.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return tag-based filter. String length must not exceed 2047 characters.
     * 
     */
    public String filter() {
        return this.filter;
    }
    /**
     * @return The Id param.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 63 characters.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Tags for dynamic user group object. List must contain at most 64 elements. Individual elements in this list are subject to additional validation. String length must not exceed 127 characters.
     * 
     */
    public List<String> tags() {
        return this.tags;
    }
    public String tfid() {
        return this.tfid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDynamicUserGroupResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String description;
        private String filter;
        private String id;
        private String name;
        private List<String> tags;
        private String tfid;
        public Builder() {}
        public Builder(GetDynamicUserGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.filter = defaults.filter;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
    	      this.tfid = defaults.tfid;
        }

        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetDynamicUserGroupResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder filter(String filter) {
            if (filter == null) {
              throw new MissingRequiredPropertyException("GetDynamicUserGroupResult", "filter");
            }
            this.filter = filter;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetDynamicUserGroupResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetDynamicUserGroupResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder tags(List<String> tags) {
            if (tags == null) {
              throw new MissingRequiredPropertyException("GetDynamicUserGroupResult", "tags");
            }
            this.tags = tags;
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        @CustomType.Setter
        public Builder tfid(String tfid) {
            if (tfid == null) {
              throw new MissingRequiredPropertyException("GetDynamicUserGroupResult", "tfid");
            }
            this.tfid = tfid;
            return this;
        }
        public GetDynamicUserGroupResult build() {
            final var _resultValue = new GetDynamicUserGroupResult();
            _resultValue.description = description;
            _resultValue.filter = filter;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.tags = tags;
            _resultValue.tfid = tfid;
            return _resultValue;
        }
    }
}