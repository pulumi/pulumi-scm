// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.outputs.GetHipObjectListDataDiskBackupCriteriaLastBackupTimeNotWithin;
import com.pulumi.scm.outputs.GetHipObjectListDataDiskBackupCriteriaLastBackupTimeWithin;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GetHipObjectListDataDiskBackupCriteriaLastBackupTime {
    /**
     * @return The NotAvailable param.
     * 
     */
    private Boolean notAvailable;
    /**
     * @return The NotWithin param.
     * 
     */
    private GetHipObjectListDataDiskBackupCriteriaLastBackupTimeNotWithin notWithin;
    /**
     * @return The Within param.
     * 
     */
    private GetHipObjectListDataDiskBackupCriteriaLastBackupTimeWithin within;

    private GetHipObjectListDataDiskBackupCriteriaLastBackupTime() {}
    /**
     * @return The NotAvailable param.
     * 
     */
    public Boolean notAvailable() {
        return this.notAvailable;
    }
    /**
     * @return The NotWithin param.
     * 
     */
    public GetHipObjectListDataDiskBackupCriteriaLastBackupTimeNotWithin notWithin() {
        return this.notWithin;
    }
    /**
     * @return The Within param.
     * 
     */
    public GetHipObjectListDataDiskBackupCriteriaLastBackupTimeWithin within() {
        return this.within;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHipObjectListDataDiskBackupCriteriaLastBackupTime defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean notAvailable;
        private GetHipObjectListDataDiskBackupCriteriaLastBackupTimeNotWithin notWithin;
        private GetHipObjectListDataDiskBackupCriteriaLastBackupTimeWithin within;
        public Builder() {}
        public Builder(GetHipObjectListDataDiskBackupCriteriaLastBackupTime defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.notAvailable = defaults.notAvailable;
    	      this.notWithin = defaults.notWithin;
    	      this.within = defaults.within;
        }

        @CustomType.Setter
        public Builder notAvailable(Boolean notAvailable) {
            if (notAvailable == null) {
              throw new MissingRequiredPropertyException("GetHipObjectListDataDiskBackupCriteriaLastBackupTime", "notAvailable");
            }
            this.notAvailable = notAvailable;
            return this;
        }
        @CustomType.Setter
        public Builder notWithin(GetHipObjectListDataDiskBackupCriteriaLastBackupTimeNotWithin notWithin) {
            if (notWithin == null) {
              throw new MissingRequiredPropertyException("GetHipObjectListDataDiskBackupCriteriaLastBackupTime", "notWithin");
            }
            this.notWithin = notWithin;
            return this;
        }
        @CustomType.Setter
        public Builder within(GetHipObjectListDataDiskBackupCriteriaLastBackupTimeWithin within) {
            if (within == null) {
              throw new MissingRequiredPropertyException("GetHipObjectListDataDiskBackupCriteriaLastBackupTime", "within");
            }
            this.within = within;
            return this;
        }
        public GetHipObjectListDataDiskBackupCriteriaLastBackupTime build() {
            final var _resultValue = new GetHipObjectListDataDiskBackupCriteriaLastBackupTime();
            _resultValue.notAvailable = notAvailable;
            _resultValue.notWithin = notWithin;
            _resultValue.within = within;
            return _resultValue;
        }
    }
}
