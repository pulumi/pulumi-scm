// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetServiceConnectionGroupListData {
    /**
     * @return The DisableSnat param.
     * 
     */
    private Boolean disableSnat;
    /**
     * @return UUID of the resource.
     * 
     */
    private String id;
    /**
     * @return The Name param.
     * 
     */
    private String name;
    /**
     * @return The PbfOnly param.
     * 
     */
    private Boolean pbfOnly;
    /**
     * @return The Targets param.
     * 
     */
    private List<String> targets;

    private GetServiceConnectionGroupListData() {}
    /**
     * @return The DisableSnat param.
     * 
     */
    public Boolean disableSnat() {
        return this.disableSnat;
    }
    /**
     * @return UUID of the resource.
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
    /**
     * @return The PbfOnly param.
     * 
     */
    public Boolean pbfOnly() {
        return this.pbfOnly;
    }
    /**
     * @return The Targets param.
     * 
     */
    public List<String> targets() {
        return this.targets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceConnectionGroupListData defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean disableSnat;
        private String id;
        private String name;
        private Boolean pbfOnly;
        private List<String> targets;
        public Builder() {}
        public Builder(GetServiceConnectionGroupListData defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableSnat = defaults.disableSnat;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.pbfOnly = defaults.pbfOnly;
    	      this.targets = defaults.targets;
        }

        @CustomType.Setter
        public Builder disableSnat(Boolean disableSnat) {
            if (disableSnat == null) {
              throw new MissingRequiredPropertyException("GetServiceConnectionGroupListData", "disableSnat");
            }
            this.disableSnat = disableSnat;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetServiceConnectionGroupListData", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetServiceConnectionGroupListData", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder pbfOnly(Boolean pbfOnly) {
            if (pbfOnly == null) {
              throw new MissingRequiredPropertyException("GetServiceConnectionGroupListData", "pbfOnly");
            }
            this.pbfOnly = pbfOnly;
            return this;
        }
        @CustomType.Setter
        public Builder targets(List<String> targets) {
            if (targets == null) {
              throw new MissingRequiredPropertyException("GetServiceConnectionGroupListData", "targets");
            }
            this.targets = targets;
            return this;
        }
        public Builder targets(String... targets) {
            return targets(List.of(targets));
        }
        public GetServiceConnectionGroupListData build() {
            final var _resultValue = new GetServiceConnectionGroupListData();
            _resultValue.disableSnat = disableSnat;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.pbfOnly = pbfOnly;
            _resultValue.targets = targets;
            return _resultValue;
        }
    }
}
