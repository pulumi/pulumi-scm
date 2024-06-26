// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IkeCryptoProfileLifetimeArgs extends com.pulumi.resources.ResourceArgs {

    public static final IkeCryptoProfileLifetimeArgs Empty = new IkeCryptoProfileLifetimeArgs();

    /**
     * specify lifetime in days. Value must be between 1 and 365. Ensure that only one of the following is specified: `days`, `hours`, `minutes`, `seconds`
     * 
     */
    @Import(name="days")
    private @Nullable Output<Integer> days;

    /**
     * @return specify lifetime in days. Value must be between 1 and 365. Ensure that only one of the following is specified: `days`, `hours`, `minutes`, `seconds`
     * 
     */
    public Optional<Output<Integer>> days() {
        return Optional.ofNullable(this.days);
    }

    /**
     * specify lifetime in hours. Value must be between 1 and 65535. Ensure that only one of the following is specified: `days`, `hours`, `minutes`, `seconds`
     * 
     */
    @Import(name="hours")
    private @Nullable Output<Integer> hours;

    /**
     * @return specify lifetime in hours. Value must be between 1 and 65535. Ensure that only one of the following is specified: `days`, `hours`, `minutes`, `seconds`
     * 
     */
    public Optional<Output<Integer>> hours() {
        return Optional.ofNullable(this.hours);
    }

    /**
     * specify lifetime in minutes. Value must be between 3 and 65535. Ensure that only one of the following is specified: `days`, `hours`, `minutes`, `seconds`
     * 
     */
    @Import(name="minutes")
    private @Nullable Output<Integer> minutes;

    /**
     * @return specify lifetime in minutes. Value must be between 3 and 65535. Ensure that only one of the following is specified: `days`, `hours`, `minutes`, `seconds`
     * 
     */
    public Optional<Output<Integer>> minutes() {
        return Optional.ofNullable(this.minutes);
    }

    /**
     * specify lifetime in seconds. Value must be between 180 and 65535. Ensure that only one of the following is specified: `days`, `hours`, `minutes`, `seconds`
     * 
     */
    @Import(name="seconds")
    private @Nullable Output<Integer> seconds;

    /**
     * @return specify lifetime in seconds. Value must be between 180 and 65535. Ensure that only one of the following is specified: `days`, `hours`, `minutes`, `seconds`
     * 
     */
    public Optional<Output<Integer>> seconds() {
        return Optional.ofNullable(this.seconds);
    }

    private IkeCryptoProfileLifetimeArgs() {}

    private IkeCryptoProfileLifetimeArgs(IkeCryptoProfileLifetimeArgs $) {
        this.days = $.days;
        this.hours = $.hours;
        this.minutes = $.minutes;
        this.seconds = $.seconds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IkeCryptoProfileLifetimeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IkeCryptoProfileLifetimeArgs $;

        public Builder() {
            $ = new IkeCryptoProfileLifetimeArgs();
        }

        public Builder(IkeCryptoProfileLifetimeArgs defaults) {
            $ = new IkeCryptoProfileLifetimeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param days specify lifetime in days. Value must be between 1 and 365. Ensure that only one of the following is specified: `days`, `hours`, `minutes`, `seconds`
         * 
         * @return builder
         * 
         */
        public Builder days(@Nullable Output<Integer> days) {
            $.days = days;
            return this;
        }

        /**
         * @param days specify lifetime in days. Value must be between 1 and 365. Ensure that only one of the following is specified: `days`, `hours`, `minutes`, `seconds`
         * 
         * @return builder
         * 
         */
        public Builder days(Integer days) {
            return days(Output.of(days));
        }

        /**
         * @param hours specify lifetime in hours. Value must be between 1 and 65535. Ensure that only one of the following is specified: `days`, `hours`, `minutes`, `seconds`
         * 
         * @return builder
         * 
         */
        public Builder hours(@Nullable Output<Integer> hours) {
            $.hours = hours;
            return this;
        }

        /**
         * @param hours specify lifetime in hours. Value must be between 1 and 65535. Ensure that only one of the following is specified: `days`, `hours`, `minutes`, `seconds`
         * 
         * @return builder
         * 
         */
        public Builder hours(Integer hours) {
            return hours(Output.of(hours));
        }

        /**
         * @param minutes specify lifetime in minutes. Value must be between 3 and 65535. Ensure that only one of the following is specified: `days`, `hours`, `minutes`, `seconds`
         * 
         * @return builder
         * 
         */
        public Builder minutes(@Nullable Output<Integer> minutes) {
            $.minutes = minutes;
            return this;
        }

        /**
         * @param minutes specify lifetime in minutes. Value must be between 3 and 65535. Ensure that only one of the following is specified: `days`, `hours`, `minutes`, `seconds`
         * 
         * @return builder
         * 
         */
        public Builder minutes(Integer minutes) {
            return minutes(Output.of(minutes));
        }

        /**
         * @param seconds specify lifetime in seconds. Value must be between 180 and 65535. Ensure that only one of the following is specified: `days`, `hours`, `minutes`, `seconds`
         * 
         * @return builder
         * 
         */
        public Builder seconds(@Nullable Output<Integer> seconds) {
            $.seconds = seconds;
            return this;
        }

        /**
         * @param seconds specify lifetime in seconds. Value must be between 180 and 65535. Ensure that only one of the following is specified: `days`, `hours`, `minutes`, `seconds`
         * 
         * @return builder
         * 
         */
        public Builder seconds(Integer seconds) {
            return seconds(Output.of(seconds));
        }

        public IkeCryptoProfileLifetimeArgs build() {
            return $;
        }
    }

}
