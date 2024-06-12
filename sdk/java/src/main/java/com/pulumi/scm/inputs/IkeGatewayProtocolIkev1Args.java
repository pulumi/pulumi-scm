// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.scm.inputs.IkeGatewayProtocolIkev1DpdArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IkeGatewayProtocolIkev1Args extends com.pulumi.resources.ResourceArgs {

    public static final IkeGatewayProtocolIkev1Args Empty = new IkeGatewayProtocolIkev1Args();

    /**
     * The Dpd param.
     * 
     */
    @Import(name="dpd")
    private @Nullable Output<IkeGatewayProtocolIkev1DpdArgs> dpd;

    /**
     * @return The Dpd param.
     * 
     */
    public Optional<Output<IkeGatewayProtocolIkev1DpdArgs>> dpd() {
        return Optional.ofNullable(this.dpd);
    }

    /**
     * The IkeCryptoProfile param.
     * 
     */
    @Import(name="ikeCryptoProfile")
    private @Nullable Output<String> ikeCryptoProfile;

    /**
     * @return The IkeCryptoProfile param.
     * 
     */
    public Optional<Output<String>> ikeCryptoProfile() {
        return Optional.ofNullable(this.ikeCryptoProfile);
    }

    private IkeGatewayProtocolIkev1Args() {}

    private IkeGatewayProtocolIkev1Args(IkeGatewayProtocolIkev1Args $) {
        this.dpd = $.dpd;
        this.ikeCryptoProfile = $.ikeCryptoProfile;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IkeGatewayProtocolIkev1Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IkeGatewayProtocolIkev1Args $;

        public Builder() {
            $ = new IkeGatewayProtocolIkev1Args();
        }

        public Builder(IkeGatewayProtocolIkev1Args defaults) {
            $ = new IkeGatewayProtocolIkev1Args(Objects.requireNonNull(defaults));
        }

        /**
         * @param dpd The Dpd param.
         * 
         * @return builder
         * 
         */
        public Builder dpd(@Nullable Output<IkeGatewayProtocolIkev1DpdArgs> dpd) {
            $.dpd = dpd;
            return this;
        }

        /**
         * @param dpd The Dpd param.
         * 
         * @return builder
         * 
         */
        public Builder dpd(IkeGatewayProtocolIkev1DpdArgs dpd) {
            return dpd(Output.of(dpd));
        }

        /**
         * @param ikeCryptoProfile The IkeCryptoProfile param.
         * 
         * @return builder
         * 
         */
        public Builder ikeCryptoProfile(@Nullable Output<String> ikeCryptoProfile) {
            $.ikeCryptoProfile = ikeCryptoProfile;
            return this;
        }

        /**
         * @param ikeCryptoProfile The IkeCryptoProfile param.
         * 
         * @return builder
         * 
         */
        public Builder ikeCryptoProfile(String ikeCryptoProfile) {
            return ikeCryptoProfile(Output.of(ikeCryptoProfile));
        }

        public IkeGatewayProtocolIkev1Args build() {
            return $;
        }
    }

}