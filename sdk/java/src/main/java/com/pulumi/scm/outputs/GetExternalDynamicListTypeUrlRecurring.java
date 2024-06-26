// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.outputs.GetExternalDynamicListTypeUrlRecurringDaily;
import com.pulumi.scm.outputs.GetExternalDynamicListTypeUrlRecurringMonthly;
import com.pulumi.scm.outputs.GetExternalDynamicListTypeUrlRecurringWeekly;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GetExternalDynamicListTypeUrlRecurring {
    /**
     * @return The Daily param.
     * 
     */
    private GetExternalDynamicListTypeUrlRecurringDaily daily;
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
    private GetExternalDynamicListTypeUrlRecurringMonthly monthly;
    /**
     * @return The Weekly param.
     * 
     */
    private GetExternalDynamicListTypeUrlRecurringWeekly weekly;

    private GetExternalDynamicListTypeUrlRecurring() {}
    /**
     * @return The Daily param.
     * 
     */
    public GetExternalDynamicListTypeUrlRecurringDaily daily() {
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
    public GetExternalDynamicListTypeUrlRecurringMonthly monthly() {
        return this.monthly;
    }
    /**
     * @return The Weekly param.
     * 
     */
    public GetExternalDynamicListTypeUrlRecurringWeekly weekly() {
        return this.weekly;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetExternalDynamicListTypeUrlRecurring defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetExternalDynamicListTypeUrlRecurringDaily daily;
        private Boolean fiveMinute;
        private Boolean hourly;
        private GetExternalDynamicListTypeUrlRecurringMonthly monthly;
        private GetExternalDynamicListTypeUrlRecurringWeekly weekly;
        public Builder() {}
        public Builder(GetExternalDynamicListTypeUrlRecurring defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.daily = defaults.daily;
    	      this.fiveMinute = defaults.fiveMinute;
    	      this.hourly = defaults.hourly;
    	      this.monthly = defaults.monthly;
    	      this.weekly = defaults.weekly;
        }

        @CustomType.Setter
        public Builder daily(GetExternalDynamicListTypeUrlRecurringDaily daily) {
            if (daily == null) {
              throw new MissingRequiredPropertyException("GetExternalDynamicListTypeUrlRecurring", "daily");
            }
            this.daily = daily;
            return this;
        }
        @CustomType.Setter
        public Builder fiveMinute(Boolean fiveMinute) {
            if (fiveMinute == null) {
              throw new MissingRequiredPropertyException("GetExternalDynamicListTypeUrlRecurring", "fiveMinute");
            }
            this.fiveMinute = fiveMinute;
            return this;
        }
        @CustomType.Setter
        public Builder hourly(Boolean hourly) {
            if (hourly == null) {
              throw new MissingRequiredPropertyException("GetExternalDynamicListTypeUrlRecurring", "hourly");
            }
            this.hourly = hourly;
            return this;
        }
        @CustomType.Setter
        public Builder monthly(GetExternalDynamicListTypeUrlRecurringMonthly monthly) {
            if (monthly == null) {
              throw new MissingRequiredPropertyException("GetExternalDynamicListTypeUrlRecurring", "monthly");
            }
            this.monthly = monthly;
            return this;
        }
        @CustomType.Setter
        public Builder weekly(GetExternalDynamicListTypeUrlRecurringWeekly weekly) {
            if (weekly == null) {
              throw new MissingRequiredPropertyException("GetExternalDynamicListTypeUrlRecurring", "weekly");
            }
            this.weekly = weekly;
            return this;
        }
        public GetExternalDynamicListTypeUrlRecurring build() {
            final var _resultValue = new GetExternalDynamicListTypeUrlRecurring();
            _resultValue.daily = daily;
            _resultValue.fiveMinute = fiveMinute;
            _resultValue.hourly = hourly;
            _resultValue.monthly = monthly;
            _resultValue.weekly = weekly;
            return _resultValue;
        }
    }
}
