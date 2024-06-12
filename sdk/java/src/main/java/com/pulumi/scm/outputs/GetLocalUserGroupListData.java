// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetLocalUserGroupListData {
    /**
     * @return The Name param. String length must not exceed 31 characters. String validation regex: `^[a-zA-Z0-9._-]+$`.
     * 
     */
    private String name;
    /**
     * @return The Users param.
     * 
     */
    private List<String> users;

    private GetLocalUserGroupListData() {}
    /**
     * @return The Name param. String length must not exceed 31 characters. String validation regex: `^[a-zA-Z0-9._-]+$`.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The Users param.
     * 
     */
    public List<String> users() {
        return this.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLocalUserGroupListData defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private List<String> users;
        public Builder() {}
        public Builder(GetLocalUserGroupListData defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.users = defaults.users;
        }

        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetLocalUserGroupListData", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder users(List<String> users) {
            if (users == null) {
              throw new MissingRequiredPropertyException("GetLocalUserGroupListData", "users");
            }
            this.users = users;
            return this;
        }
        public Builder users(String... users) {
            return users(List.of(users));
        }
        public GetLocalUserGroupListData build() {
            final var _resultValue = new GetLocalUserGroupListData();
            _resultValue.name = name;
            _resultValue.users = users;
            return _resultValue;
        }
    }
}