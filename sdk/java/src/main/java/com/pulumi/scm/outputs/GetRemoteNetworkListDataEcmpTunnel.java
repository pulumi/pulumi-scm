// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.outputs.GetRemoteNetworkListDataEcmpTunnelProtocol;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetRemoteNetworkListDataEcmpTunnel {
    /**
     * @return The IpsecTunnel param.
     * 
     */
    private String ipsecTunnel;
    /**
     * @return The Name param.
     * 
     */
    private String name;
    /**
     * @return The Protocol param.
     * 
     */
    private GetRemoteNetworkListDataEcmpTunnelProtocol protocol;

    private GetRemoteNetworkListDataEcmpTunnel() {}
    /**
     * @return The IpsecTunnel param.
     * 
     */
    public String ipsecTunnel() {
        return this.ipsecTunnel;
    }
    /**
     * @return The Name param.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The Protocol param.
     * 
     */
    public GetRemoteNetworkListDataEcmpTunnelProtocol protocol() {
        return this.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRemoteNetworkListDataEcmpTunnel defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String ipsecTunnel;
        private String name;
        private GetRemoteNetworkListDataEcmpTunnelProtocol protocol;
        public Builder() {}
        public Builder(GetRemoteNetworkListDataEcmpTunnel defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipsecTunnel = defaults.ipsecTunnel;
    	      this.name = defaults.name;
    	      this.protocol = defaults.protocol;
        }

        @CustomType.Setter
        public Builder ipsecTunnel(String ipsecTunnel) {
            if (ipsecTunnel == null) {
              throw new MissingRequiredPropertyException("GetRemoteNetworkListDataEcmpTunnel", "ipsecTunnel");
            }
            this.ipsecTunnel = ipsecTunnel;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetRemoteNetworkListDataEcmpTunnel", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder protocol(GetRemoteNetworkListDataEcmpTunnelProtocol protocol) {
            if (protocol == null) {
              throw new MissingRequiredPropertyException("GetRemoteNetworkListDataEcmpTunnel", "protocol");
            }
            this.protocol = protocol;
            return this;
        }
        public GetRemoteNetworkListDataEcmpTunnel build() {
            final var _resultValue = new GetRemoteNetworkListDataEcmpTunnel();
            _resultValue.ipsecTunnel = ipsecTunnel;
            _resultValue.name = name;
            _resultValue.protocol = protocol;
            return _resultValue;
        }
    }
}