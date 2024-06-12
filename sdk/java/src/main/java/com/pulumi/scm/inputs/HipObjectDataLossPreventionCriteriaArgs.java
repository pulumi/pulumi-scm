// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HipObjectDataLossPreventionCriteriaArgs extends com.pulumi.resources.ResourceArgs {

    public static final HipObjectDataLossPreventionCriteriaArgs Empty = new HipObjectDataLossPreventionCriteriaArgs();

    /**
     * is enabled. String must be one of these: `&#34;no&#34;`, `&#34;yes&#34;`, `&#34;not-available&#34;`.
     * 
     */
    @Import(name="isEnabled")
    private @Nullable Output<String> isEnabled;

    /**
     * @return is enabled. String must be one of these: `&#34;no&#34;`, `&#34;yes&#34;`, `&#34;not-available&#34;`.
     * 
     */
    public Optional<Output<String>> isEnabled() {
        return Optional.ofNullable(this.isEnabled);
    }

    /**
     * Is Installed. Default: `true`.
     * 
     */
    @Import(name="isInstalled")
    private @Nullable Output<Boolean> isInstalled;

    /**
     * @return Is Installed. Default: `true`.
     * 
     */
    public Optional<Output<Boolean>> isInstalled() {
        return Optional.ofNullable(this.isInstalled);
    }

    private HipObjectDataLossPreventionCriteriaArgs() {}

    private HipObjectDataLossPreventionCriteriaArgs(HipObjectDataLossPreventionCriteriaArgs $) {
        this.isEnabled = $.isEnabled;
        this.isInstalled = $.isInstalled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HipObjectDataLossPreventionCriteriaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HipObjectDataLossPreventionCriteriaArgs $;

        public Builder() {
            $ = new HipObjectDataLossPreventionCriteriaArgs();
        }

        public Builder(HipObjectDataLossPreventionCriteriaArgs defaults) {
            $ = new HipObjectDataLossPreventionCriteriaArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param isEnabled is enabled. String must be one of these: `&#34;no&#34;`, `&#34;yes&#34;`, `&#34;not-available&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder isEnabled(@Nullable Output<String> isEnabled) {
            $.isEnabled = isEnabled;
            return this;
        }

        /**
         * @param isEnabled is enabled. String must be one of these: `&#34;no&#34;`, `&#34;yes&#34;`, `&#34;not-available&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder isEnabled(String isEnabled) {
            return isEnabled(Output.of(isEnabled));
        }

        /**
         * @param isInstalled Is Installed. Default: `true`.
         * 
         * @return builder
         * 
         */
        public Builder isInstalled(@Nullable Output<Boolean> isInstalled) {
            $.isInstalled = isInstalled;
            return this;
        }

        /**
         * @param isInstalled Is Installed. Default: `true`.
         * 
         * @return builder
         * 
         */
        public Builder isInstalled(Boolean isInstalled) {
            return isInstalled(Output.of(isInstalled));
        }

        public HipObjectDataLossPreventionCriteriaArgs build() {
            return $;
        }
    }

}