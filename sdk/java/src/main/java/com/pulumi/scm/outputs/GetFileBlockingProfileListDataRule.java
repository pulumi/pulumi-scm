// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetFileBlockingProfileListDataRule {
    /**
     * @return The Action param. String must be one of these: `&#34;alert&#34;`, `&#34;block&#34;`, `&#34;continue&#34;`. Default: `&#34;alert&#34;`.
     * 
     */
    private String action;
    /**
     * @return The Applications param. List must contain at least 1 elements.
     * 
     */
    private List<String> applications;
    /**
     * @return The Direction param. String must be one of these: `&#34;download&#34;`, `&#34;upload&#34;`, `&#34;both&#34;`. Default: `&#34;both&#34;`.
     * 
     */
    private String direction;
    /**
     * @return The FileTypes param. List must contain at least 1 elements.
     * 
     */
    private List<String> fileTypes;
    /**
     * @return The Name param.
     * 
     */
    private String name;

    private GetFileBlockingProfileListDataRule() {}
    /**
     * @return The Action param. String must be one of these: `&#34;alert&#34;`, `&#34;block&#34;`, `&#34;continue&#34;`. Default: `&#34;alert&#34;`.
     * 
     */
    public String action() {
        return this.action;
    }
    /**
     * @return The Applications param. List must contain at least 1 elements.
     * 
     */
    public List<String> applications() {
        return this.applications;
    }
    /**
     * @return The Direction param. String must be one of these: `&#34;download&#34;`, `&#34;upload&#34;`, `&#34;both&#34;`. Default: `&#34;both&#34;`.
     * 
     */
    public String direction() {
        return this.direction;
    }
    /**
     * @return The FileTypes param. List must contain at least 1 elements.
     * 
     */
    public List<String> fileTypes() {
        return this.fileTypes;
    }
    /**
     * @return The Name param.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFileBlockingProfileListDataRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String action;
        private List<String> applications;
        private String direction;
        private List<String> fileTypes;
        private String name;
        public Builder() {}
        public Builder(GetFileBlockingProfileListDataRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.applications = defaults.applications;
    	      this.direction = defaults.direction;
    	      this.fileTypes = defaults.fileTypes;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder action(String action) {
            if (action == null) {
              throw new MissingRequiredPropertyException("GetFileBlockingProfileListDataRule", "action");
            }
            this.action = action;
            return this;
        }
        @CustomType.Setter
        public Builder applications(List<String> applications) {
            if (applications == null) {
              throw new MissingRequiredPropertyException("GetFileBlockingProfileListDataRule", "applications");
            }
            this.applications = applications;
            return this;
        }
        public Builder applications(String... applications) {
            return applications(List.of(applications));
        }
        @CustomType.Setter
        public Builder direction(String direction) {
            if (direction == null) {
              throw new MissingRequiredPropertyException("GetFileBlockingProfileListDataRule", "direction");
            }
            this.direction = direction;
            return this;
        }
        @CustomType.Setter
        public Builder fileTypes(List<String> fileTypes) {
            if (fileTypes == null) {
              throw new MissingRequiredPropertyException("GetFileBlockingProfileListDataRule", "fileTypes");
            }
            this.fileTypes = fileTypes;
            return this;
        }
        public Builder fileTypes(String... fileTypes) {
            return fileTypes(List.of(fileTypes));
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetFileBlockingProfileListDataRule", "name");
            }
            this.name = name;
            return this;
        }
        public GetFileBlockingProfileListDataRule build() {
            final var _resultValue = new GetFileBlockingProfileListDataRule();
            _resultValue.action = action;
            _resultValue.applications = applications;
            _resultValue.direction = direction;
            _resultValue.fileTypes = fileTypes;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
