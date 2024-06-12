// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetIpsecTunnelAutoKeyProxyIdProtocolUdp {
    /**
     * @return The LocalPort param. Value must be between 0 and 65535. Default: `0`.
     * 
     */
    private Integer localPort;
    /**
     * @return The RemotePort param. Value must be between 0 and 65535. Default: `0`.
     * 
     */
    private Integer remotePort;

    private GetIpsecTunnelAutoKeyProxyIdProtocolUdp() {}
    /**
     * @return The LocalPort param. Value must be between 0 and 65535. Default: `0`.
     * 
     */
    public Integer localPort() {
        return this.localPort;
    }
    /**
     * @return The RemotePort param. Value must be between 0 and 65535. Default: `0`.
     * 
     */
    public Integer remotePort() {
        return this.remotePort;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIpsecTunnelAutoKeyProxyIdProtocolUdp defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer localPort;
        private Integer remotePort;
        public Builder() {}
        public Builder(GetIpsecTunnelAutoKeyProxyIdProtocolUdp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.localPort = defaults.localPort;
    	      this.remotePort = defaults.remotePort;
        }

        @CustomType.Setter
        public Builder localPort(Integer localPort) {
            if (localPort == null) {
              throw new MissingRequiredPropertyException("GetIpsecTunnelAutoKeyProxyIdProtocolUdp", "localPort");
            }
            this.localPort = localPort;
            return this;
        }
        @CustomType.Setter
        public Builder remotePort(Integer remotePort) {
            if (remotePort == null) {
              throw new MissingRequiredPropertyException("GetIpsecTunnelAutoKeyProxyIdProtocolUdp", "remotePort");
            }
            this.remotePort = remotePort;
            return this;
        }
        public GetIpsecTunnelAutoKeyProxyIdProtocolUdp build() {
            final var _resultValue = new GetIpsecTunnelAutoKeyProxyIdProtocolUdp();
            _resultValue.localPort = localPort;
            _resultValue.remotePort = remotePort;
            return _resultValue;
        }
    }
}