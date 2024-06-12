// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.scm.outputs.HipObjectDiskBackupCriteria;
import com.pulumi.scm.outputs.HipObjectDiskBackupVendor;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HipObjectDiskBackup {
    /**
     * @return The Criteria param.
     * 
     */
    private @Nullable HipObjectDiskBackupCriteria criteria;
    /**
     * @return The ExcludeVendor param. Default: `false`.
     * 
     */
    private @Nullable Boolean excludeVendor;
    /**
     * @return Vendor name.
     * 
     */
    private @Nullable List<HipObjectDiskBackupVendor> vendors;

    private HipObjectDiskBackup() {}
    /**
     * @return The Criteria param.
     * 
     */
    public Optional<HipObjectDiskBackupCriteria> criteria() {
        return Optional.ofNullable(this.criteria);
    }
    /**
     * @return The ExcludeVendor param. Default: `false`.
     * 
     */
    public Optional<Boolean> excludeVendor() {
        return Optional.ofNullable(this.excludeVendor);
    }
    /**
     * @return Vendor name.
     * 
     */
    public List<HipObjectDiskBackupVendor> vendors() {
        return this.vendors == null ? List.of() : this.vendors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HipObjectDiskBackup defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable HipObjectDiskBackupCriteria criteria;
        private @Nullable Boolean excludeVendor;
        private @Nullable List<HipObjectDiskBackupVendor> vendors;
        public Builder() {}
        public Builder(HipObjectDiskBackup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.criteria = defaults.criteria;
    	      this.excludeVendor = defaults.excludeVendor;
    	      this.vendors = defaults.vendors;
        }

        @CustomType.Setter
        public Builder criteria(@Nullable HipObjectDiskBackupCriteria criteria) {

            this.criteria = criteria;
            return this;
        }
        @CustomType.Setter
        public Builder excludeVendor(@Nullable Boolean excludeVendor) {

            this.excludeVendor = excludeVendor;
            return this;
        }
        @CustomType.Setter
        public Builder vendors(@Nullable List<HipObjectDiskBackupVendor> vendors) {

            this.vendors = vendors;
            return this;
        }
        public Builder vendors(HipObjectDiskBackupVendor... vendors) {
            return vendors(List.of(vendors));
        }
        public HipObjectDiskBackup build() {
            final var _resultValue = new HipObjectDiskBackup();
            _resultValue.criteria = criteria;
            _resultValue.excludeVendor = excludeVendor;
            _resultValue.vendors = vendors;
            return _resultValue;
        }
    }
}