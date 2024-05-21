// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.outputs.GetIpsecTunnelListDataAutoKeyProxyIdProtocolTcp;
import com.pulumi.scm.outputs.GetIpsecTunnelListDataAutoKeyProxyIdProtocolUdp;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetIpsecTunnelListDataAutoKeyProxyIdProtocol {
    /**
     * @return IP protocol number. Value must be between 1 and 254.
     * 
     */
    private Integer number;
    /**
     * @return The Tcp param.
     * 
     */
    private GetIpsecTunnelListDataAutoKeyProxyIdProtocolTcp tcp;
    /**
     * @return The Udp param.
     * 
     */
    private GetIpsecTunnelListDataAutoKeyProxyIdProtocolUdp udp;

    private GetIpsecTunnelListDataAutoKeyProxyIdProtocol() {}
    /**
     * @return IP protocol number. Value must be between 1 and 254.
     * 
     */
    public Integer number() {
        return this.number;
    }
    /**
     * @return The Tcp param.
     * 
     */
    public GetIpsecTunnelListDataAutoKeyProxyIdProtocolTcp tcp() {
        return this.tcp;
    }
    /**
     * @return The Udp param.
     * 
     */
    public GetIpsecTunnelListDataAutoKeyProxyIdProtocolUdp udp() {
        return this.udp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIpsecTunnelListDataAutoKeyProxyIdProtocol defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer number;
        private GetIpsecTunnelListDataAutoKeyProxyIdProtocolTcp tcp;
        private GetIpsecTunnelListDataAutoKeyProxyIdProtocolUdp udp;
        public Builder() {}
        public Builder(GetIpsecTunnelListDataAutoKeyProxyIdProtocol defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.number = defaults.number;
    	      this.tcp = defaults.tcp;
    	      this.udp = defaults.udp;
        }

        @CustomType.Setter
        public Builder number(Integer number) {
            if (number == null) {
              throw new MissingRequiredPropertyException("GetIpsecTunnelListDataAutoKeyProxyIdProtocol", "number");
            }
            this.number = number;
            return this;
        }
        @CustomType.Setter
        public Builder tcp(GetIpsecTunnelListDataAutoKeyProxyIdProtocolTcp tcp) {
            if (tcp == null) {
              throw new MissingRequiredPropertyException("GetIpsecTunnelListDataAutoKeyProxyIdProtocol", "tcp");
            }
            this.tcp = tcp;
            return this;
        }
        @CustomType.Setter
        public Builder udp(GetIpsecTunnelListDataAutoKeyProxyIdProtocolUdp udp) {
            if (udp == null) {
              throw new MissingRequiredPropertyException("GetIpsecTunnelListDataAutoKeyProxyIdProtocol", "udp");
            }
            this.udp = udp;
            return this;
        }
        public GetIpsecTunnelListDataAutoKeyProxyIdProtocol build() {
            final var _resultValue = new GetIpsecTunnelListDataAutoKeyProxyIdProtocol();
            _resultValue.number = number;
            _resultValue.tcp = tcp;
            _resultValue.udp = udp;
            return _resultValue;
        }
    }
}
