// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.inputs.IpsecTunnelAutoKeyIkeGatewayArgs;
import com.pulumi.scm.inputs.IpsecTunnelAutoKeyProxyIdArgs;
import com.pulumi.scm.inputs.IpsecTunnelAutoKeyProxyIdV6Args;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IpsecTunnelAutoKeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final IpsecTunnelAutoKeyArgs Empty = new IpsecTunnelAutoKeyArgs();

    /**
     * The IkeGateways param.
     * 
     */
    @Import(name="ikeGateways", required=true)
    private Output<List<IpsecTunnelAutoKeyIkeGatewayArgs>> ikeGateways;

    /**
     * @return The IkeGateways param.
     * 
     */
    public Output<List<IpsecTunnelAutoKeyIkeGatewayArgs>> ikeGateways() {
        return this.ikeGateways;
    }

    /**
     * The IpsecCryptoProfile param.
     * 
     */
    @Import(name="ipsecCryptoProfile", required=true)
    private Output<String> ipsecCryptoProfile;

    /**
     * @return The IpsecCryptoProfile param.
     * 
     */
    public Output<String> ipsecCryptoProfile() {
        return this.ipsecCryptoProfile;
    }

    /**
     * IPv6 type of proxy*id values.
     * 
     */
    @Import(name="proxyIdV6s")
    private @Nullable Output<List<IpsecTunnelAutoKeyProxyIdV6Args>> proxyIdV6s;

    /**
     * @return IPv6 type of proxy*id values.
     * 
     */
    public Optional<Output<List<IpsecTunnelAutoKeyProxyIdV6Args>>> proxyIdV6s() {
        return Optional.ofNullable(this.proxyIdV6s);
    }

    /**
     * IPv4 type of proxy*id values.
     * 
     */
    @Import(name="proxyIds")
    private @Nullable Output<List<IpsecTunnelAutoKeyProxyIdArgs>> proxyIds;

    /**
     * @return IPv4 type of proxy*id values.
     * 
     */
    public Optional<Output<List<IpsecTunnelAutoKeyProxyIdArgs>>> proxyIds() {
        return Optional.ofNullable(this.proxyIds);
    }

    private IpsecTunnelAutoKeyArgs() {}

    private IpsecTunnelAutoKeyArgs(IpsecTunnelAutoKeyArgs $) {
        this.ikeGateways = $.ikeGateways;
        this.ipsecCryptoProfile = $.ipsecCryptoProfile;
        this.proxyIdV6s = $.proxyIdV6s;
        this.proxyIds = $.proxyIds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IpsecTunnelAutoKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IpsecTunnelAutoKeyArgs $;

        public Builder() {
            $ = new IpsecTunnelAutoKeyArgs();
        }

        public Builder(IpsecTunnelAutoKeyArgs defaults) {
            $ = new IpsecTunnelAutoKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ikeGateways The IkeGateways param.
         * 
         * @return builder
         * 
         */
        public Builder ikeGateways(Output<List<IpsecTunnelAutoKeyIkeGatewayArgs>> ikeGateways) {
            $.ikeGateways = ikeGateways;
            return this;
        }

        /**
         * @param ikeGateways The IkeGateways param.
         * 
         * @return builder
         * 
         */
        public Builder ikeGateways(List<IpsecTunnelAutoKeyIkeGatewayArgs> ikeGateways) {
            return ikeGateways(Output.of(ikeGateways));
        }

        /**
         * @param ikeGateways The IkeGateways param.
         * 
         * @return builder
         * 
         */
        public Builder ikeGateways(IpsecTunnelAutoKeyIkeGatewayArgs... ikeGateways) {
            return ikeGateways(List.of(ikeGateways));
        }

        /**
         * @param ipsecCryptoProfile The IpsecCryptoProfile param.
         * 
         * @return builder
         * 
         */
        public Builder ipsecCryptoProfile(Output<String> ipsecCryptoProfile) {
            $.ipsecCryptoProfile = ipsecCryptoProfile;
            return this;
        }

        /**
         * @param ipsecCryptoProfile The IpsecCryptoProfile param.
         * 
         * @return builder
         * 
         */
        public Builder ipsecCryptoProfile(String ipsecCryptoProfile) {
            return ipsecCryptoProfile(Output.of(ipsecCryptoProfile));
        }

        /**
         * @param proxyIdV6s IPv6 type of proxy*id values.
         * 
         * @return builder
         * 
         */
        public Builder proxyIdV6s(@Nullable Output<List<IpsecTunnelAutoKeyProxyIdV6Args>> proxyIdV6s) {
            $.proxyIdV6s = proxyIdV6s;
            return this;
        }

        /**
         * @param proxyIdV6s IPv6 type of proxy*id values.
         * 
         * @return builder
         * 
         */
        public Builder proxyIdV6s(List<IpsecTunnelAutoKeyProxyIdV6Args> proxyIdV6s) {
            return proxyIdV6s(Output.of(proxyIdV6s));
        }

        /**
         * @param proxyIdV6s IPv6 type of proxy*id values.
         * 
         * @return builder
         * 
         */
        public Builder proxyIdV6s(IpsecTunnelAutoKeyProxyIdV6Args... proxyIdV6s) {
            return proxyIdV6s(List.of(proxyIdV6s));
        }

        /**
         * @param proxyIds IPv4 type of proxy*id values.
         * 
         * @return builder
         * 
         */
        public Builder proxyIds(@Nullable Output<List<IpsecTunnelAutoKeyProxyIdArgs>> proxyIds) {
            $.proxyIds = proxyIds;
            return this;
        }

        /**
         * @param proxyIds IPv4 type of proxy*id values.
         * 
         * @return builder
         * 
         */
        public Builder proxyIds(List<IpsecTunnelAutoKeyProxyIdArgs> proxyIds) {
            return proxyIds(Output.of(proxyIds));
        }

        /**
         * @param proxyIds IPv4 type of proxy*id values.
         * 
         * @return builder
         * 
         */
        public Builder proxyIds(IpsecTunnelAutoKeyProxyIdArgs... proxyIds) {
            return proxyIds(List.of(proxyIds));
        }

        public IpsecTunnelAutoKeyArgs build() {
            if ($.ikeGateways == null) {
                throw new MissingRequiredPropertyException("IpsecTunnelAutoKeyArgs", "ikeGateways");
            }
            if ($.ipsecCryptoProfile == null) {
                throw new MissingRequiredPropertyException("IpsecTunnelAutoKeyArgs", "ipsecCryptoProfile");
            }
            return $;
        }
    }

}
