// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HipObjectMobileDeviceCriteriaLastCheckinTimeWithinArgs extends com.pulumi.resources.ResourceArgs {

    public static final HipObjectMobileDeviceCriteriaLastCheckinTimeWithinArgs Empty = new HipObjectMobileDeviceCriteriaLastCheckinTimeWithinArgs();

    /**
     * specify time in days. Value must be between 1 and 365. Default: `30`.
     * 
     */
    @Import(name="days")
    private @Nullable Output<Integer> days;

    /**
     * @return specify time in days. Value must be between 1 and 365. Default: `30`.
     * 
     */
    public Optional<Output<Integer>> days() {
        return Optional.ofNullable(this.days);
    }

    private HipObjectMobileDeviceCriteriaLastCheckinTimeWithinArgs() {}

    private HipObjectMobileDeviceCriteriaLastCheckinTimeWithinArgs(HipObjectMobileDeviceCriteriaLastCheckinTimeWithinArgs $) {
        this.days = $.days;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HipObjectMobileDeviceCriteriaLastCheckinTimeWithinArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HipObjectMobileDeviceCriteriaLastCheckinTimeWithinArgs $;

        public Builder() {
            $ = new HipObjectMobileDeviceCriteriaLastCheckinTimeWithinArgs();
        }

        public Builder(HipObjectMobileDeviceCriteriaLastCheckinTimeWithinArgs defaults) {
            $ = new HipObjectMobileDeviceCriteriaLastCheckinTimeWithinArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param days specify time in days. Value must be between 1 and 365. Default: `30`.
         * 
         * @return builder
         * 
         */
        public Builder days(@Nullable Output<Integer> days) {
            $.days = days;
            return this;
        }

        /**
         * @param days specify time in days. Value must be between 1 and 365. Default: `30`.
         * 
         * @return builder
         * 
         */
        public Builder days(Integer days) {
            return days(Output.of(days));
        }

        public HipObjectMobileDeviceCriteriaLastCheckinTimeWithinArgs build() {
            return $;
        }
    }

}
