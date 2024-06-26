// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IpsecTunnelAutoKeyProxyIdProtocolUdpArgs extends com.pulumi.resources.ResourceArgs {

    public static final IpsecTunnelAutoKeyProxyIdProtocolUdpArgs Empty = new IpsecTunnelAutoKeyProxyIdProtocolUdpArgs();

    /**
     * The LocalPort param. Value must be between 0 and 65535. Default: `0`.
     * 
     */
    @Import(name="localPort")
    private @Nullable Output<Integer> localPort;

    /**
     * @return The LocalPort param. Value must be between 0 and 65535. Default: `0`.
     * 
     */
    public Optional<Output<Integer>> localPort() {
        return Optional.ofNullable(this.localPort);
    }

    /**
     * The RemotePort param. Value must be between 0 and 65535. Default: `0`.
     * 
     */
    @Import(name="remotePort")
    private @Nullable Output<Integer> remotePort;

    /**
     * @return The RemotePort param. Value must be between 0 and 65535. Default: `0`.
     * 
     */
    public Optional<Output<Integer>> remotePort() {
        return Optional.ofNullable(this.remotePort);
    }

    private IpsecTunnelAutoKeyProxyIdProtocolUdpArgs() {}

    private IpsecTunnelAutoKeyProxyIdProtocolUdpArgs(IpsecTunnelAutoKeyProxyIdProtocolUdpArgs $) {
        this.localPort = $.localPort;
        this.remotePort = $.remotePort;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IpsecTunnelAutoKeyProxyIdProtocolUdpArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IpsecTunnelAutoKeyProxyIdProtocolUdpArgs $;

        public Builder() {
            $ = new IpsecTunnelAutoKeyProxyIdProtocolUdpArgs();
        }

        public Builder(IpsecTunnelAutoKeyProxyIdProtocolUdpArgs defaults) {
            $ = new IpsecTunnelAutoKeyProxyIdProtocolUdpArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param localPort The LocalPort param. Value must be between 0 and 65535. Default: `0`.
         * 
         * @return builder
         * 
         */
        public Builder localPort(@Nullable Output<Integer> localPort) {
            $.localPort = localPort;
            return this;
        }

        /**
         * @param localPort The LocalPort param. Value must be between 0 and 65535. Default: `0`.
         * 
         * @return builder
         * 
         */
        public Builder localPort(Integer localPort) {
            return localPort(Output.of(localPort));
        }

        /**
         * @param remotePort The RemotePort param. Value must be between 0 and 65535. Default: `0`.
         * 
         * @return builder
         * 
         */
        public Builder remotePort(@Nullable Output<Integer> remotePort) {
            $.remotePort = remotePort;
            return this;
        }

        /**
         * @param remotePort The RemotePort param. Value must be between 0 and 65535. Default: `0`.
         * 
         * @return builder
         * 
         */
        public Builder remotePort(Integer remotePort) {
            return remotePort(Output.of(remotePort));
        }

        public IpsecTunnelAutoKeyProxyIdProtocolUdpArgs build() {
            return $;
        }
    }

}
