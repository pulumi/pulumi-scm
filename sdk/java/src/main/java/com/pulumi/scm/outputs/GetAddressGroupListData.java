// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.outputs.GetAddressGroupListDataDynamicValue;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAddressGroupListData {
    /**
     * @return The Description param. String length must not exceed 1023 characters.
     * 
     */
    private String description;
    /**
     * @return The DynamicValue param.
     * 
     */
    private GetAddressGroupListDataDynamicValue dynamicValue;
    /**
     * @return UUID of the resource.
     * 
     */
    private String id;
    /**
     * @return Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 63 characters.
     * 
     */
    private String name;
    /**
     * @return The StaticList param. Individual elements in this list are subject to additional validation. String length must not exceed 63 characters.
     * 
     */
    private List<String> staticLists;
    /**
     * @return Tags for address group object. List must contain at most 64 elements. Individual elements in this list are subject to additional validation. String length must not exceed 127 characters.
     * 
     */
    private List<String> tags;

    private GetAddressGroupListData() {}
    /**
     * @return The Description param. String length must not exceed 1023 characters.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The DynamicValue param.
     * 
     */
    public GetAddressGroupListDataDynamicValue dynamicValue() {
        return this.dynamicValue;
    }
    /**
     * @return UUID of the resource.
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
     * @return The StaticList param. Individual elements in this list are subject to additional validation. String length must not exceed 63 characters.
     * 
     */
    public List<String> staticLists() {
        return this.staticLists;
    }
    /**
     * @return Tags for address group object. List must contain at most 64 elements. Individual elements in this list are subject to additional validation. String length must not exceed 127 characters.
     * 
     */
    public List<String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAddressGroupListData defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String description;
        private GetAddressGroupListDataDynamicValue dynamicValue;
        private String id;
        private String name;
        private List<String> staticLists;
        private List<String> tags;
        public Builder() {}
        public Builder(GetAddressGroupListData defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.dynamicValue = defaults.dynamicValue;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.staticLists = defaults.staticLists;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetAddressGroupListData", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder dynamicValue(GetAddressGroupListDataDynamicValue dynamicValue) {
            if (dynamicValue == null) {
              throw new MissingRequiredPropertyException("GetAddressGroupListData", "dynamicValue");
            }
            this.dynamicValue = dynamicValue;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetAddressGroupListData", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetAddressGroupListData", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder staticLists(List<String> staticLists) {
            if (staticLists == null) {
              throw new MissingRequiredPropertyException("GetAddressGroupListData", "staticLists");
            }
            this.staticLists = staticLists;
            return this;
        }
        public Builder staticLists(String... staticLists) {
            return staticLists(List.of(staticLists));
        }
        @CustomType.Setter
        public Builder tags(List<String> tags) {
            if (tags == null) {
              throw new MissingRequiredPropertyException("GetAddressGroupListData", "tags");
            }
            this.tags = tags;
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        public GetAddressGroupListData build() {
            final var _resultValue = new GetAddressGroupListData();
            _resultValue.description = description;
            _resultValue.dynamicValue = dynamicValue;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.staticLists = staticLists;
            _resultValue.tags = tags;
            return _resultValue;
        }
    }
}