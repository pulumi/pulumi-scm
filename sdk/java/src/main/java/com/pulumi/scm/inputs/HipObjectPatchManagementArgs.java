// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.scm.inputs.HipObjectPatchManagementCriteriaArgs;
import com.pulumi.scm.inputs.HipObjectPatchManagementVendorArgs;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HipObjectPatchManagementArgs extends com.pulumi.resources.ResourceArgs {

    public static final HipObjectPatchManagementArgs Empty = new HipObjectPatchManagementArgs();

    /**
     * The Criteria param.
     * 
     */
    @Import(name="criteria")
    private @Nullable Output<HipObjectPatchManagementCriteriaArgs> criteria;

    /**
     * @return The Criteria param.
     * 
     */
    public Optional<Output<HipObjectPatchManagementCriteriaArgs>> criteria() {
        return Optional.ofNullable(this.criteria);
    }

    /**
     * The ExcludeVendor param. Default: `false`.
     * 
     */
    @Import(name="excludeVendor")
    private @Nullable Output<Boolean> excludeVendor;

    /**
     * @return The ExcludeVendor param. Default: `false`.
     * 
     */
    public Optional<Output<Boolean>> excludeVendor() {
        return Optional.ofNullable(this.excludeVendor);
    }

    /**
     * Vendor name.
     * 
     */
    @Import(name="vendors")
    private @Nullable Output<List<HipObjectPatchManagementVendorArgs>> vendors;

    /**
     * @return Vendor name.
     * 
     */
    public Optional<Output<List<HipObjectPatchManagementVendorArgs>>> vendors() {
        return Optional.ofNullable(this.vendors);
    }

    private HipObjectPatchManagementArgs() {}

    private HipObjectPatchManagementArgs(HipObjectPatchManagementArgs $) {
        this.criteria = $.criteria;
        this.excludeVendor = $.excludeVendor;
        this.vendors = $.vendors;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HipObjectPatchManagementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HipObjectPatchManagementArgs $;

        public Builder() {
            $ = new HipObjectPatchManagementArgs();
        }

        public Builder(HipObjectPatchManagementArgs defaults) {
            $ = new HipObjectPatchManagementArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param criteria The Criteria param.
         * 
         * @return builder
         * 
         */
        public Builder criteria(@Nullable Output<HipObjectPatchManagementCriteriaArgs> criteria) {
            $.criteria = criteria;
            return this;
        }

        /**
         * @param criteria The Criteria param.
         * 
         * @return builder
         * 
         */
        public Builder criteria(HipObjectPatchManagementCriteriaArgs criteria) {
            return criteria(Output.of(criteria));
        }

        /**
         * @param excludeVendor The ExcludeVendor param. Default: `false`.
         * 
         * @return builder
         * 
         */
        public Builder excludeVendor(@Nullable Output<Boolean> excludeVendor) {
            $.excludeVendor = excludeVendor;
            return this;
        }

        /**
         * @param excludeVendor The ExcludeVendor param. Default: `false`.
         * 
         * @return builder
         * 
         */
        public Builder excludeVendor(Boolean excludeVendor) {
            return excludeVendor(Output.of(excludeVendor));
        }

        /**
         * @param vendors Vendor name.
         * 
         * @return builder
         * 
         */
        public Builder vendors(@Nullable Output<List<HipObjectPatchManagementVendorArgs>> vendors) {
            $.vendors = vendors;
            return this;
        }

        /**
         * @param vendors Vendor name.
         * 
         * @return builder
         * 
         */
        public Builder vendors(List<HipObjectPatchManagementVendorArgs> vendors) {
            return vendors(Output.of(vendors));
        }

        /**
         * @param vendors Vendor name.
         * 
         * @return builder
         * 
         */
        public Builder vendors(HipObjectPatchManagementVendorArgs... vendors) {
            return vendors(List.of(vendors));
        }

        public HipObjectPatchManagementArgs build() {
            return $;
        }
    }

}
