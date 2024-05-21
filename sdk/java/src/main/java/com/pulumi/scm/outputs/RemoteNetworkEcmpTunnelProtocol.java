// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.scm.outputs.RemoteNetworkEcmpTunnelProtocolBgp;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RemoteNetworkEcmpTunnelProtocol {
    /**
     * @return The Bgp param.
     * 
     */
    private @Nullable RemoteNetworkEcmpTunnelProtocolBgp bgp;

    private RemoteNetworkEcmpTunnelProtocol() {}
    /**
     * @return The Bgp param.
     * 
     */
    public Optional<RemoteNetworkEcmpTunnelProtocolBgp> bgp() {
        return Optional.ofNullable(this.bgp);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RemoteNetworkEcmpTunnelProtocol defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable RemoteNetworkEcmpTunnelProtocolBgp bgp;
        public Builder() {}
        public Builder(RemoteNetworkEcmpTunnelProtocol defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bgp = defaults.bgp;
        }

        @CustomType.Setter
        public Builder bgp(@Nullable RemoteNetworkEcmpTunnelProtocolBgp bgp) {

            this.bgp = bgp;
            return this;
        }
        public RemoteNetworkEcmpTunnelProtocol build() {
            final var _resultValue = new RemoteNetworkEcmpTunnelProtocol();
            _resultValue.bgp = bgp;
            return _resultValue;
        }
    }
}
