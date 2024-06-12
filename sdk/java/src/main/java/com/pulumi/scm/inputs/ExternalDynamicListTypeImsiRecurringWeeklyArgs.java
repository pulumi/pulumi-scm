// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ExternalDynamicListTypeImsiRecurringWeeklyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ExternalDynamicListTypeImsiRecurringWeeklyArgs Empty = new ExternalDynamicListTypeImsiRecurringWeeklyArgs();

    /**
     * Time specification hh (e.g. 20). String length must be between 2 and 2 characters. String validation regex: `([01][0-9]|[2][0-3])`. Default: `&#34;00&#34;`.
     * 
     */
    @Import(name="at")
    private @Nullable Output<String> at;

    /**
     * @return Time specification hh (e.g. 20). String length must be between 2 and 2 characters. String validation regex: `([01][0-9]|[2][0-3])`. Default: `&#34;00&#34;`.
     * 
     */
    public Optional<Output<String>> at() {
        return Optional.ofNullable(this.at);
    }

    /**
     * The DayOfWeek param. String must be one of these: `&#34;sunday&#34;`, `&#34;monday&#34;`, `&#34;tuesday&#34;`, `&#34;wednesday&#34;`, `&#34;thursday&#34;`, `&#34;friday&#34;`, `&#34;saturday&#34;`.
     * 
     */
    @Import(name="dayOfWeek", required=true)
    private Output<String> dayOfWeek;

    /**
     * @return The DayOfWeek param. String must be one of these: `&#34;sunday&#34;`, `&#34;monday&#34;`, `&#34;tuesday&#34;`, `&#34;wednesday&#34;`, `&#34;thursday&#34;`, `&#34;friday&#34;`, `&#34;saturday&#34;`.
     * 
     */
    public Output<String> dayOfWeek() {
        return this.dayOfWeek;
    }

    private ExternalDynamicListTypeImsiRecurringWeeklyArgs() {}

    private ExternalDynamicListTypeImsiRecurringWeeklyArgs(ExternalDynamicListTypeImsiRecurringWeeklyArgs $) {
        this.at = $.at;
        this.dayOfWeek = $.dayOfWeek;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExternalDynamicListTypeImsiRecurringWeeklyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExternalDynamicListTypeImsiRecurringWeeklyArgs $;

        public Builder() {
            $ = new ExternalDynamicListTypeImsiRecurringWeeklyArgs();
        }

        public Builder(ExternalDynamicListTypeImsiRecurringWeeklyArgs defaults) {
            $ = new ExternalDynamicListTypeImsiRecurringWeeklyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param at Time specification hh (e.g. 20). String length must be between 2 and 2 characters. String validation regex: `([01][0-9]|[2][0-3])`. Default: `&#34;00&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder at(@Nullable Output<String> at) {
            $.at = at;
            return this;
        }

        /**
         * @param at Time specification hh (e.g. 20). String length must be between 2 and 2 characters. String validation regex: `([01][0-9]|[2][0-3])`. Default: `&#34;00&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder at(String at) {
            return at(Output.of(at));
        }

        /**
         * @param dayOfWeek The DayOfWeek param. String must be one of these: `&#34;sunday&#34;`, `&#34;monday&#34;`, `&#34;tuesday&#34;`, `&#34;wednesday&#34;`, `&#34;thursday&#34;`, `&#34;friday&#34;`, `&#34;saturday&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder dayOfWeek(Output<String> dayOfWeek) {
            $.dayOfWeek = dayOfWeek;
            return this;
        }

        /**
         * @param dayOfWeek The DayOfWeek param. String must be one of these: `&#34;sunday&#34;`, `&#34;monday&#34;`, `&#34;tuesday&#34;`, `&#34;wednesday&#34;`, `&#34;thursday&#34;`, `&#34;friday&#34;`, `&#34;saturday&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder dayOfWeek(String dayOfWeek) {
            return dayOfWeek(Output.of(dayOfWeek));
        }

        public ExternalDynamicListTypeImsiRecurringWeeklyArgs build() {
            if ($.dayOfWeek == null) {
                throw new MissingRequiredPropertyException("ExternalDynamicListTypeImsiRecurringWeeklyArgs", "dayOfWeek");
            }
            return $;
        }
    }

}