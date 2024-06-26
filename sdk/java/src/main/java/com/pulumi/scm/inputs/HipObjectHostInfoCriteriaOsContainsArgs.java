// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HipObjectHostInfoCriteriaOsContainsArgs extends com.pulumi.resources.ResourceArgs {

    public static final HipObjectHostInfoCriteriaOsContainsArgs Empty = new HipObjectHostInfoCriteriaOsContainsArgs();

    /**
     * Apple vendor. String length must not exceed 255 characters. Ensure that only one of the following is specified: `Apple`, `Google`, `Linux`, `Microsoft`, `Other`
     * 
     */
    @Import(name="apple")
    private @Nullable Output<String> apple;

    /**
     * @return Apple vendor. String length must not exceed 255 characters. Ensure that only one of the following is specified: `Apple`, `Google`, `Linux`, `Microsoft`, `Other`
     * 
     */
    public Optional<Output<String>> apple() {
        return Optional.ofNullable(this.apple);
    }

    /**
     * Google vendor. String length must not exceed 255 characters. Ensure that only one of the following is specified: `Apple`, `Google`, `Linux`, `Microsoft`, `Other`
     * 
     */
    @Import(name="google")
    private @Nullable Output<String> google;

    /**
     * @return Google vendor. String length must not exceed 255 characters. Ensure that only one of the following is specified: `Apple`, `Google`, `Linux`, `Microsoft`, `Other`
     * 
     */
    public Optional<Output<String>> google() {
        return Optional.ofNullable(this.google);
    }

    /**
     * Linux vendor. String length must not exceed 255 characters. Ensure that only one of the following is specified: `Apple`, `Google`, `Linux`, `Microsoft`, `Other`
     * 
     */
    @Import(name="linux")
    private @Nullable Output<String> linux;

    /**
     * @return Linux vendor. String length must not exceed 255 characters. Ensure that only one of the following is specified: `Apple`, `Google`, `Linux`, `Microsoft`, `Other`
     * 
     */
    public Optional<Output<String>> linux() {
        return Optional.ofNullable(this.linux);
    }

    /**
     * Microsoft vendor. String length must not exceed 255 characters. Ensure that only one of the following is specified: `Apple`, `Google`, `Linux`, `Microsoft`, `Other`
     * 
     */
    @Import(name="microsoft")
    private @Nullable Output<String> microsoft;

    /**
     * @return Microsoft vendor. String length must not exceed 255 characters. Ensure that only one of the following is specified: `Apple`, `Google`, `Linux`, `Microsoft`, `Other`
     * 
     */
    public Optional<Output<String>> microsoft() {
        return Optional.ofNullable(this.microsoft);
    }

    /**
     * Other vendor. String length must not exceed 255 characters. Ensure that only one of the following is specified: `Apple`, `Google`, `Linux`, `Microsoft`, `Other`
     * 
     */
    @Import(name="other")
    private @Nullable Output<String> other;

    /**
     * @return Other vendor. String length must not exceed 255 characters. Ensure that only one of the following is specified: `Apple`, `Google`, `Linux`, `Microsoft`, `Other`
     * 
     */
    public Optional<Output<String>> other() {
        return Optional.ofNullable(this.other);
    }

    private HipObjectHostInfoCriteriaOsContainsArgs() {}

    private HipObjectHostInfoCriteriaOsContainsArgs(HipObjectHostInfoCriteriaOsContainsArgs $) {
        this.apple = $.apple;
        this.google = $.google;
        this.linux = $.linux;
        this.microsoft = $.microsoft;
        this.other = $.other;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HipObjectHostInfoCriteriaOsContainsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HipObjectHostInfoCriteriaOsContainsArgs $;

        public Builder() {
            $ = new HipObjectHostInfoCriteriaOsContainsArgs();
        }

        public Builder(HipObjectHostInfoCriteriaOsContainsArgs defaults) {
            $ = new HipObjectHostInfoCriteriaOsContainsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apple Apple vendor. String length must not exceed 255 characters. Ensure that only one of the following is specified: `Apple`, `Google`, `Linux`, `Microsoft`, `Other`
         * 
         * @return builder
         * 
         */
        public Builder apple(@Nullable Output<String> apple) {
            $.apple = apple;
            return this;
        }

        /**
         * @param apple Apple vendor. String length must not exceed 255 characters. Ensure that only one of the following is specified: `Apple`, `Google`, `Linux`, `Microsoft`, `Other`
         * 
         * @return builder
         * 
         */
        public Builder apple(String apple) {
            return apple(Output.of(apple));
        }

        /**
         * @param google Google vendor. String length must not exceed 255 characters. Ensure that only one of the following is specified: `Apple`, `Google`, `Linux`, `Microsoft`, `Other`
         * 
         * @return builder
         * 
         */
        public Builder google(@Nullable Output<String> google) {
            $.google = google;
            return this;
        }

        /**
         * @param google Google vendor. String length must not exceed 255 characters. Ensure that only one of the following is specified: `Apple`, `Google`, `Linux`, `Microsoft`, `Other`
         * 
         * @return builder
         * 
         */
        public Builder google(String google) {
            return google(Output.of(google));
        }

        /**
         * @param linux Linux vendor. String length must not exceed 255 characters. Ensure that only one of the following is specified: `Apple`, `Google`, `Linux`, `Microsoft`, `Other`
         * 
         * @return builder
         * 
         */
        public Builder linux(@Nullable Output<String> linux) {
            $.linux = linux;
            return this;
        }

        /**
         * @param linux Linux vendor. String length must not exceed 255 characters. Ensure that only one of the following is specified: `Apple`, `Google`, `Linux`, `Microsoft`, `Other`
         * 
         * @return builder
         * 
         */
        public Builder linux(String linux) {
            return linux(Output.of(linux));
        }

        /**
         * @param microsoft Microsoft vendor. String length must not exceed 255 characters. Ensure that only one of the following is specified: `Apple`, `Google`, `Linux`, `Microsoft`, `Other`
         * 
         * @return builder
         * 
         */
        public Builder microsoft(@Nullable Output<String> microsoft) {
            $.microsoft = microsoft;
            return this;
        }

        /**
         * @param microsoft Microsoft vendor. String length must not exceed 255 characters. Ensure that only one of the following is specified: `Apple`, `Google`, `Linux`, `Microsoft`, `Other`
         * 
         * @return builder
         * 
         */
        public Builder microsoft(String microsoft) {
            return microsoft(Output.of(microsoft));
        }

        /**
         * @param other Other vendor. String length must not exceed 255 characters. Ensure that only one of the following is specified: `Apple`, `Google`, `Linux`, `Microsoft`, `Other`
         * 
         * @return builder
         * 
         */
        public Builder other(@Nullable Output<String> other) {
            $.other = other;
            return this;
        }

        /**
         * @param other Other vendor. String length must not exceed 255 characters. Ensure that only one of the following is specified: `Apple`, `Google`, `Linux`, `Microsoft`, `Other`
         * 
         * @return builder
         * 
         */
        public Builder other(String other) {
            return other(Output.of(other));
        }

        public HipObjectHostInfoCriteriaOsContainsArgs build() {
            return $;
        }
    }

}
