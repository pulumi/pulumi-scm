// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.scm.inputs.HipObjectNetworkInfoCriteriaNetworkIsNotMobileArgs;
import com.pulumi.scm.inputs.HipObjectNetworkInfoCriteriaNetworkIsNotWifiArgs;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HipObjectNetworkInfoCriteriaNetworkIsNotArgs extends com.pulumi.resources.ResourceArgs {

    public static final HipObjectNetworkInfoCriteriaNetworkIsNotArgs Empty = new HipObjectNetworkInfoCriteriaNetworkIsNotArgs();

    /**
     * The Ethernet param. Ensure that only one of the following is specified: `ethernet`, `mobile`, `unknown`, `wifi`
     * 
     */
    @Import(name="ethernet")
    private @Nullable Output<Boolean> ethernet;

    /**
     * @return The Ethernet param. Ensure that only one of the following is specified: `ethernet`, `mobile`, `unknown`, `wifi`
     * 
     */
    public Optional<Output<Boolean>> ethernet() {
        return Optional.ofNullable(this.ethernet);
    }

    /**
     * The Mobile param. Ensure that only one of the following is specified: `ethernet`, `mobile`, `unknown`, `wifi`
     * 
     */
    @Import(name="mobile")
    private @Nullable Output<HipObjectNetworkInfoCriteriaNetworkIsNotMobileArgs> mobile;

    /**
     * @return The Mobile param. Ensure that only one of the following is specified: `ethernet`, `mobile`, `unknown`, `wifi`
     * 
     */
    public Optional<Output<HipObjectNetworkInfoCriteriaNetworkIsNotMobileArgs>> mobile() {
        return Optional.ofNullable(this.mobile);
    }

    /**
     * The Unknown param. Ensure that only one of the following is specified: `ethernet`, `mobile`, `unknown`, `wifi`
     * 
     */
    @Import(name="unknown")
    private @Nullable Output<Boolean> unknown;

    /**
     * @return The Unknown param. Ensure that only one of the following is specified: `ethernet`, `mobile`, `unknown`, `wifi`
     * 
     */
    public Optional<Output<Boolean>> unknown() {
        return Optional.ofNullable(this.unknown);
    }

    /**
     * The Wifi param. Ensure that only one of the following is specified: `ethernet`, `mobile`, `unknown`, `wifi`
     * 
     */
    @Import(name="wifi")
    private @Nullable Output<HipObjectNetworkInfoCriteriaNetworkIsNotWifiArgs> wifi;

    /**
     * @return The Wifi param. Ensure that only one of the following is specified: `ethernet`, `mobile`, `unknown`, `wifi`
     * 
     */
    public Optional<Output<HipObjectNetworkInfoCriteriaNetworkIsNotWifiArgs>> wifi() {
        return Optional.ofNullable(this.wifi);
    }

    private HipObjectNetworkInfoCriteriaNetworkIsNotArgs() {}

    private HipObjectNetworkInfoCriteriaNetworkIsNotArgs(HipObjectNetworkInfoCriteriaNetworkIsNotArgs $) {
        this.ethernet = $.ethernet;
        this.mobile = $.mobile;
        this.unknown = $.unknown;
        this.wifi = $.wifi;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HipObjectNetworkInfoCriteriaNetworkIsNotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HipObjectNetworkInfoCriteriaNetworkIsNotArgs $;

        public Builder() {
            $ = new HipObjectNetworkInfoCriteriaNetworkIsNotArgs();
        }

        public Builder(HipObjectNetworkInfoCriteriaNetworkIsNotArgs defaults) {
            $ = new HipObjectNetworkInfoCriteriaNetworkIsNotArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ethernet The Ethernet param. Ensure that only one of the following is specified: `ethernet`, `mobile`, `unknown`, `wifi`
         * 
         * @return builder
         * 
         */
        public Builder ethernet(@Nullable Output<Boolean> ethernet) {
            $.ethernet = ethernet;
            return this;
        }

        /**
         * @param ethernet The Ethernet param. Ensure that only one of the following is specified: `ethernet`, `mobile`, `unknown`, `wifi`
         * 
         * @return builder
         * 
         */
        public Builder ethernet(Boolean ethernet) {
            return ethernet(Output.of(ethernet));
        }

        /**
         * @param mobile The Mobile param. Ensure that only one of the following is specified: `ethernet`, `mobile`, `unknown`, `wifi`
         * 
         * @return builder
         * 
         */
        public Builder mobile(@Nullable Output<HipObjectNetworkInfoCriteriaNetworkIsNotMobileArgs> mobile) {
            $.mobile = mobile;
            return this;
        }

        /**
         * @param mobile The Mobile param. Ensure that only one of the following is specified: `ethernet`, `mobile`, `unknown`, `wifi`
         * 
         * @return builder
         * 
         */
        public Builder mobile(HipObjectNetworkInfoCriteriaNetworkIsNotMobileArgs mobile) {
            return mobile(Output.of(mobile));
        }

        /**
         * @param unknown The Unknown param. Ensure that only one of the following is specified: `ethernet`, `mobile`, `unknown`, `wifi`
         * 
         * @return builder
         * 
         */
        public Builder unknown(@Nullable Output<Boolean> unknown) {
            $.unknown = unknown;
            return this;
        }

        /**
         * @param unknown The Unknown param. Ensure that only one of the following is specified: `ethernet`, `mobile`, `unknown`, `wifi`
         * 
         * @return builder
         * 
         */
        public Builder unknown(Boolean unknown) {
            return unknown(Output.of(unknown));
        }

        /**
         * @param wifi The Wifi param. Ensure that only one of the following is specified: `ethernet`, `mobile`, `unknown`, `wifi`
         * 
         * @return builder
         * 
         */
        public Builder wifi(@Nullable Output<HipObjectNetworkInfoCriteriaNetworkIsNotWifiArgs> wifi) {
            $.wifi = wifi;
            return this;
        }

        /**
         * @param wifi The Wifi param. Ensure that only one of the following is specified: `ethernet`, `mobile`, `unknown`, `wifi`
         * 
         * @return builder
         * 
         */
        public Builder wifi(HipObjectNetworkInfoCriteriaNetworkIsNotWifiArgs wifi) {
            return wifi(Output.of(wifi));
        }

        public HipObjectNetworkInfoCriteriaNetworkIsNotArgs build() {
            return $;
        }
    }

}
