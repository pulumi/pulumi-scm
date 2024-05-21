// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetHipObjectDiskBackupCriteriaLastBackupTimeNotWithin {
    /**
     * @return specify time in days. Value must be between 1 and 65535.
     * 
     */
    private Integer days;
    /**
     * @return specify time in hours. Value must be between 1 and 65535.
     * 
     */
    private Integer hours;

    private GetHipObjectDiskBackupCriteriaLastBackupTimeNotWithin() {}
    /**
     * @return specify time in days. Value must be between 1 and 65535.
     * 
     */
    public Integer days() {
        return this.days;
    }
    /**
     * @return specify time in hours. Value must be between 1 and 65535.
     * 
     */
    public Integer hours() {
        return this.hours;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHipObjectDiskBackupCriteriaLastBackupTimeNotWithin defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer days;
        private Integer hours;
        public Builder() {}
        public Builder(GetHipObjectDiskBackupCriteriaLastBackupTimeNotWithin defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.days = defaults.days;
    	      this.hours = defaults.hours;
        }

        @CustomType.Setter
        public Builder days(Integer days) {
            if (days == null) {
              throw new MissingRequiredPropertyException("GetHipObjectDiskBackupCriteriaLastBackupTimeNotWithin", "days");
            }
            this.days = days;
            return this;
        }
        @CustomType.Setter
        public Builder hours(Integer hours) {
            if (hours == null) {
              throw new MissingRequiredPropertyException("GetHipObjectDiskBackupCriteriaLastBackupTimeNotWithin", "hours");
            }
            this.hours = hours;
            return this;
        }
        public GetHipObjectDiskBackupCriteriaLastBackupTimeNotWithin build() {
            final var _resultValue = new GetHipObjectDiskBackupCriteriaLastBackupTimeNotWithin();
            _resultValue.days = days;
            _resultValue.hours = hours;
            return _resultValue;
        }
    }
}
