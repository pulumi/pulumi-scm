// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.outputs.GetHipObjectPatchManagementCriteria;
import com.pulumi.scm.outputs.GetHipObjectPatchManagementVendor;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetHipObjectPatchManagement {
    /**
     * @return The Criteria param.
     * 
     */
    private GetHipObjectPatchManagementCriteria criteria;
    /**
     * @return The ExcludeVendor param. Default: `false`.
     * 
     */
    private Boolean excludeVendor;
    /**
     * @return Vendor name.
     * 
     */
    private List<GetHipObjectPatchManagementVendor> vendors;

    private GetHipObjectPatchManagement() {}
    /**
     * @return The Criteria param.
     * 
     */
    public GetHipObjectPatchManagementCriteria criteria() {
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
    public List<GetHipObjectPatchManagementVendor> vendors() {
        return this.vendors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHipObjectPatchManagement defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetHipObjectPatchManagementCriteria criteria;
        private Boolean excludeVendor;
        private List<GetHipObjectPatchManagementVendor> vendors;
        public Builder() {}
        public Builder(GetHipObjectPatchManagement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.criteria = defaults.criteria;
    	      this.excludeVendor = defaults.excludeVendor;
    	      this.vendors = defaults.vendors;
        }

        @CustomType.Setter
        public Builder criteria(GetHipObjectPatchManagementCriteria criteria) {
            if (criteria == null) {
              throw new MissingRequiredPropertyException("GetHipObjectPatchManagement", "criteria");
            }
            this.criteria = criteria;
            return this;
        }
        @CustomType.Setter
        public Builder excludeVendor(Boolean excludeVendor) {
            if (excludeVendor == null) {
              throw new MissingRequiredPropertyException("GetHipObjectPatchManagement", "excludeVendor");
            }
            this.excludeVendor = excludeVendor;
            return this;
        }
        @CustomType.Setter
        public Builder vendors(List<GetHipObjectPatchManagementVendor> vendors) {
            if (vendors == null) {
              throw new MissingRequiredPropertyException("GetHipObjectPatchManagement", "vendors");
            }
            this.vendors = vendors;
            return this;
        }
        public Builder vendors(GetHipObjectPatchManagementVendor... vendors) {
            return vendors(List.of(vendors));
        }
        public GetHipObjectPatchManagement build() {
            final var _resultValue = new GetHipObjectPatchManagement();
            _resultValue.criteria = criteria;
            _resultValue.excludeVendor = excludeVendor;
            _resultValue.vendors = vendors;
            return _resultValue;
        }
    }
}
