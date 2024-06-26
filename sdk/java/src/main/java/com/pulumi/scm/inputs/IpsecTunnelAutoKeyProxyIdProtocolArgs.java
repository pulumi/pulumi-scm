// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.scm.inputs.IpsecTunnelAutoKeyProxyIdProtocolTcpArgs;
import com.pulumi.scm.inputs.IpsecTunnelAutoKeyProxyIdProtocolUdpArgs;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IpsecTunnelAutoKeyProxyIdProtocolArgs extends com.pulumi.resources.ResourceArgs {

    public static final IpsecTunnelAutoKeyProxyIdProtocolArgs Empty = new IpsecTunnelAutoKeyProxyIdProtocolArgs();

    /**
     * IP protocol number. Value must be between 1 and 254. Ensure that only one of the following is specified: `number`, `tcp`, `udp`
     * 
     */
    @Import(name="number")
    private @Nullable Output<Integer> number;

    /**
     * @return IP protocol number. Value must be between 1 and 254. Ensure that only one of the following is specified: `number`, `tcp`, `udp`
     * 
     */
    public Optional<Output<Integer>> number() {
        return Optional.ofNullable(this.number);
    }

    /**
     * The Tcp param. Ensure that only one of the following is specified: `number`, `tcp`, `udp`
     * 
     */
    @Import(name="tcp")
    private @Nullable Output<IpsecTunnelAutoKeyProxyIdProtocolTcpArgs> tcp;

    /**
     * @return The Tcp param. Ensure that only one of the following is specified: `number`, `tcp`, `udp`
     * 
     */
    public Optional<Output<IpsecTunnelAutoKeyProxyIdProtocolTcpArgs>> tcp() {
        return Optional.ofNullable(this.tcp);
    }

    /**
     * The Udp param. Ensure that only one of the following is specified: `number`, `tcp`, `udp`
     * 
     */
    @Import(name="udp")
    private @Nullable Output<IpsecTunnelAutoKeyProxyIdProtocolUdpArgs> udp;

    /**
     * @return The Udp param. Ensure that only one of the following is specified: `number`, `tcp`, `udp`
     * 
     */
    public Optional<Output<IpsecTunnelAutoKeyProxyIdProtocolUdpArgs>> udp() {
        return Optional.ofNullable(this.udp);
    }

    private IpsecTunnelAutoKeyProxyIdProtocolArgs() {}

    private IpsecTunnelAutoKeyProxyIdProtocolArgs(IpsecTunnelAutoKeyProxyIdProtocolArgs $) {
        this.number = $.number;
        this.tcp = $.tcp;
        this.udp = $.udp;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IpsecTunnelAutoKeyProxyIdProtocolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IpsecTunnelAutoKeyProxyIdProtocolArgs $;

        public Builder() {
            $ = new IpsecTunnelAutoKeyProxyIdProtocolArgs();
        }

        public Builder(IpsecTunnelAutoKeyProxyIdProtocolArgs defaults) {
            $ = new IpsecTunnelAutoKeyProxyIdProtocolArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param number IP protocol number. Value must be between 1 and 254. Ensure that only one of the following is specified: `number`, `tcp`, `udp`
         * 
         * @return builder
         * 
         */
        public Builder number(@Nullable Output<Integer> number) {
            $.number = number;
            return this;
        }

        /**
         * @param number IP protocol number. Value must be between 1 and 254. Ensure that only one of the following is specified: `number`, `tcp`, `udp`
         * 
         * @return builder
         * 
         */
        public Builder number(Integer number) {
            return number(Output.of(number));
        }

        /**
         * @param tcp The Tcp param. Ensure that only one of the following is specified: `number`, `tcp`, `udp`
         * 
         * @return builder
         * 
         */
        public Builder tcp(@Nullable Output<IpsecTunnelAutoKeyProxyIdProtocolTcpArgs> tcp) {
            $.tcp = tcp;
            return this;
        }

        /**
         * @param tcp The Tcp param. Ensure that only one of the following is specified: `number`, `tcp`, `udp`
         * 
         * @return builder
         * 
         */
        public Builder tcp(IpsecTunnelAutoKeyProxyIdProtocolTcpArgs tcp) {
            return tcp(Output.of(tcp));
        }

        /**
         * @param udp The Udp param. Ensure that only one of the following is specified: `number`, `tcp`, `udp`
         * 
         * @return builder
         * 
         */
        public Builder udp(@Nullable Output<IpsecTunnelAutoKeyProxyIdProtocolUdpArgs> udp) {
            $.udp = udp;
            return this;
        }

        /**
         * @param udp The Udp param. Ensure that only one of the following is specified: `number`, `tcp`, `udp`
         * 
         * @return builder
         * 
         */
        public Builder udp(IpsecTunnelAutoKeyProxyIdProtocolUdpArgs udp) {
            return udp(Output.of(udp));
        }

        public IpsecTunnelAutoKeyProxyIdProtocolArgs build() {
            return $;
        }
    }

}
