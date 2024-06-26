// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.outputs.GetHipObjectFirewallCriteria;
import com.pulumi.scm.outputs.GetHipObjectFirewallVendor;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetHipObjectFirewall {
    /**
     * @return The Criteria param.
     * 
     */
    private GetHipObjectFirewallCriteria criteria;
    /**
     * @return The ExcludeVendor param. Default: `false`.
     * 
     */
    private Boolean excludeVendor;
    /**
     * @return Vendor name.
     * 
     */
    private List<GetHipObjectFirewallVendor> vendors;

    private GetHipObjectFirewall() {}
    /**
     * @return The Criteria param.
     * 
     */
    public GetHipObjectFirewallCriteria criteria() {
        return this.criteria;
    }
    /**
     * @return The ExcludeVendor param. Default: `false`.
     * 
     */
    public Boolean excludeVendor() {
        return this.excludeVendor;
    }
    /**
     * @return Vendor name.
     * 
     */
    public List<GetHipObjectFirewallVendor> vendors() {
        return this.vendors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHipObjectFirewall defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetHipObjectFirewallCriteria criteria;
        private Boolean excludeVendor;
        private List<GetHipObjectFirewallVendor> vendors;
        public Builder() {}
        public Builder(GetHipObjectFirewall defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.criteria = defaults.criteria;
    	      this.excludeVendor = defaults.excludeVendor;
    	      this.vendors = defaults.vendors;
        }

        @CustomType.Setter
        public Builder criteria(GetHipObjectFirewallCriteria criteria) {
            if (criteria == null) {
              throw new MissingRequiredPropertyException("GetHipObjectFirewall", "criteria");
            }
            this.criteria = criteria;
            return this;
        }
        @CustomType.Setter
        public Builder excludeVendor(Boolean excludeVendor) {
            if (excludeVendor == null) {
              throw new MissingRequiredPropertyException("GetHipObjectFirewall", "excludeVendor");
            }
            this.excludeVendor = excludeVendor;
            return this;
        }
        @CustomType.Setter
        public Builder vendors(List<GetHipObjectFirewallVendor> vendors) {
            if (vendors == null) {
              throw new MissingRequiredPropertyException("GetHipObjectFirewall", "vendors");
            }
            this.vendors = vendors;
            return this;
        }
        public Builder vendors(GetHipObjectFirewallVendor... vendors) {
            return vendors(List.of(vendors));
        }
        public GetHipObjectFirewall build() {
            final var _resultValue = new GetHipObjectFirewall();
            _resultValue.criteria = criteria;
            _resultValue.excludeVendor = excludeVendor;
            _resultValue.vendors = vendors;
            return _resultValue;
        }
    }
}
