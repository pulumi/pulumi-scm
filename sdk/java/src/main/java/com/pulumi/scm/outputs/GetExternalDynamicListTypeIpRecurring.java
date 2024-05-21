// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.outputs.GetExternalDynamicListTypeIpRecurringDaily;
import com.pulumi.scm.outputs.GetExternalDynamicListTypeIpRecurringMonthly;
import com.pulumi.scm.outputs.GetExternalDynamicListTypeIpRecurringWeekly;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GetExternalDynamicListTypeIpRecurring {
    /**
     * @return The Daily param.
     * 
     */
    private GetExternalDynamicListTypeIpRecurringDaily daily;
    /**
     * @return The FiveMinute param.
     * 
     */
    private Boolean fiveMinute;
    /**
     * @return The Hourly param.
     * 
     */
    private Boolean hourly;
    /**
     * @return The Monthly param.
     * 
     */
    private GetExternalDynamicListTypeIpRecurringMonthly monthly;
    /**
     * @return The Weekly param.
     * 
     */
    private GetExternalDynamicListTypeIpRecurringWeekly weekly;

    private GetExternalDynamicListTypeIpRecurring() {}
    /**
     * @return The Daily param.
     * 
     */
    public GetExternalDynamicListTypeIpRecurringDaily daily() {
        return this.daily;
    }
    /**
     * @return The FiveMinute param.
     * 
     */
    public Boolean fiveMinute() {
        return this.fiveMinute;
    }
    /**
     * @return The Hourly param.
     * 
     */
    public Boolean hourly() {
        return this.hourly;
    }
    /**
     * @return The Monthly param.
     * 
     */
    public GetExternalDynamicListTypeIpRecurringMonthly monthly() {
        return this.monthly;
    }
    /**
     * @return The Weekly param.
     * 
     */
    public GetExternalDynamicListTypeIpRecurringWeekly weekly() {
        return this.weekly;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetExternalDynamicListTypeIpRecurring defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetExternalDynamicListTypeIpRecurringDaily daily;
        private Boolean fiveMinute;
        private Boolean hourly;
        private GetExternalDynamicListTypeIpRecurringMonthly monthly;
        private GetExternalDynamicListTypeIpRecurringWeekly weekly;
        public Builder() {}
        public Builder(GetExternalDynamicListTypeIpRecurring defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.daily = defaults.daily;
    	      this.fiveMinute = defaults.fiveMinute;
    	      this.hourly = defaults.hourly;
    	      this.monthly = defaults.monthly;
    	      this.weekly = defaults.weekly;
        }

        @CustomType.Setter
        public Builder daily(GetExternalDynamicListTypeIpRecurringDaily daily) {
            if (daily == null) {
              throw new MissingRequiredPropertyException("GetExternalDynamicListTypeIpRecurring", "daily");
            }
            this.daily = daily;
            return this;
        }
        @CustomType.Setter
        public Builder fiveMinute(Boolean fiveMinute) {
            if (fiveMinute == null) {
              throw new MissingRequiredPropertyException("GetExternalDynamicListTypeIpRecurring", "fiveMinute");
            }
            this.fiveMinute = fiveMinute;
            return this;
        }
        @CustomType.Setter
        public Builder hourly(Boolean hourly) {
            if (hourly == null) {
              throw new MissingRequiredPropertyException("GetExternalDynamicListTypeIpRecurring", "hourly");
            }
            this.hourly = hourly;
            return this;
        }
        @CustomType.Setter
        public Builder monthly(GetExternalDynamicListTypeIpRecurringMonthly monthly) {
            if (monthly == null) {
              throw new MissingRequiredPropertyException("GetExternalDynamicListTypeIpRecurring", "monthly");
            }
            this.monthly = monthly;
            return this;
        }
        @CustomType.Setter
        public Builder weekly(GetExternalDynamicListTypeIpRecurringWeekly weekly) {
            if (weekly == null) {
              throw new MissingRequiredPropertyException("GetExternalDynamicListTypeIpRecurring", "weekly");
            }
            this.weekly = weekly;
            return this;
        }
        public GetExternalDynamicListTypeIpRecurring build() {
            final var _resultValue = new GetExternalDynamicListTypeIpRecurring();
            _resultValue.daily = daily;
            _resultValue.fiveMinute = fiveMinute;
            _resultValue.hourly = hourly;
            _resultValue.monthly = monthly;
            _resultValue.weekly = weekly;
            return _resultValue;
        }
    }
}
