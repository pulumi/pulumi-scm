// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetHipObjectListDataMobileDeviceCriteriaLastCheckinTimeNotWithin {
    /**
     * @return specify time in days. Value must be between 1 and 365. Default: `30`.
     * 
     */
    private Integer days;

    private GetHipObjectListDataMobileDeviceCriteriaLastCheckinTimeNotWithin() {}
    /**
     * @return specify time in days. Value must be between 1 and 365. Default: `30`.
     * 
     */
    public Integer days() {
        return this.days;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHipObjectListDataMobileDeviceCriteriaLastCheckinTimeNotWithin defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer days;
        public Builder() {}
        public Builder(GetHipObjectListDataMobileDeviceCriteriaLastCheckinTimeNotWithin defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.days = defaults.days;
        }

        @CustomType.Setter
        public Builder days(Integer days) {
            if (days == null) {
              throw new MissingRequiredPropertyException("GetHipObjectListDataMobileDeviceCriteriaLastCheckinTimeNotWithin", "days");
            }
            this.days = days;
            return this;
        }
        public GetHipObjectListDataMobileDeviceCriteriaLastCheckinTimeNotWithin build() {
            final var _resultValue = new GetHipObjectListDataMobileDeviceCriteriaLastCheckinTimeNotWithin();
            _resultValue.days = days;
            return _resultValue;
        }
    }
}
