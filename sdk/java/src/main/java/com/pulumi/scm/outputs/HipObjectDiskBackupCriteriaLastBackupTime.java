// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.scm.outputs.HipObjectDiskBackupCriteriaLastBackupTimeNotWithin;
import com.pulumi.scm.outputs.HipObjectDiskBackupCriteriaLastBackupTimeWithin;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HipObjectDiskBackupCriteriaLastBackupTime {
    /**
     * @return The NotAvailable param. Ensure that only one of the following is specified: `not_available`, `not_within`, `within`
     * 
     */
    private @Nullable Boolean notAvailable;
    /**
     * @return The NotWithin param. Ensure that only one of the following is specified: `not_available`, `not_within`, `within`
     * 
     */
    private @Nullable HipObjectDiskBackupCriteriaLastBackupTimeNotWithin notWithin;
    /**
     * @return The Within param. Ensure that only one of the following is specified: `not_available`, `not_within`, `within`
     * 
     */
    private @Nullable HipObjectDiskBackupCriteriaLastBackupTimeWithin within;

    private HipObjectDiskBackupCriteriaLastBackupTime() {}
    /**
     * @return The NotAvailable param. Ensure that only one of the following is specified: `not_available`, `not_within`, `within`
     * 
     */
    public Optional<Boolean> notAvailable() {
        return Optional.ofNullable(this.notAvailable);
    }
    /**
     * @return The NotWithin param. Ensure that only one of the following is specified: `not_available`, `not_within`, `within`
     * 
     */
    public Optional<HipObjectDiskBackupCriteriaLastBackupTimeNotWithin> notWithin() {
        return Optional.ofNullable(this.notWithin);
    }
    /**
     * @return The Within param. Ensure that only one of the following is specified: `not_available`, `not_within`, `within`
     * 
     */
    public Optional<HipObjectDiskBackupCriteriaLastBackupTimeWithin> within() {
        return Optional.ofNullable(this.within);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HipObjectDiskBackupCriteriaLastBackupTime defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean notAvailable;
        private @Nullable HipObjectDiskBackupCriteriaLastBackupTimeNotWithin notWithin;
        private @Nullable HipObjectDiskBackupCriteriaLastBackupTimeWithin within;
        public Builder() {}
        public Builder(HipObjectDiskBackupCriteriaLastBackupTime defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.notAvailable = defaults.notAvailable;
    	      this.notWithin = defaults.notWithin;
    	      this.within = defaults.within;
        }

        @CustomType.Setter
        public Builder notAvailable(@Nullable Boolean notAvailable) {

            this.notAvailable = notAvailable;
            return this;
        }
        @CustomType.Setter
        public Builder notWithin(@Nullable HipObjectDiskBackupCriteriaLastBackupTimeNotWithin notWithin) {

            this.notWithin = notWithin;
            return this;
        }
        @CustomType.Setter
        public Builder within(@Nullable HipObjectDiskBackupCriteriaLastBackupTimeWithin within) {

            this.within = within;
            return this;
        }
        public HipObjectDiskBackupCriteriaLastBackupTime build() {
            final var _resultValue = new HipObjectDiskBackupCriteriaLastBackupTime();
            _resultValue.notAvailable = notAvailable;
            _resultValue.notWithin = notWithin;
            _resultValue.within = within;
            return _resultValue;
        }
    }
}
