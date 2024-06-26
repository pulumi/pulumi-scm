// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetIpsecTunnelListDataTunnelMonitor {
    /**
     * @return Destination IP to send ICMP probe.
     * 
     */
    private String destinationIp;
    /**
     * @return Enable tunnel monitoring on this tunnel. Default: `true`.
     * 
     */
    private Boolean enable;
    /**
     * @return Which proxy-id (or proxy-id-v6) the monitoring traffic will use.
     * 
     */
    private String proxyId;

    private GetIpsecTunnelListDataTunnelMonitor() {}
    /**
     * @return Destination IP to send ICMP probe.
     * 
     */
    public String destinationIp() {
        return this.destinationIp;
    }
    /**
     * @return Enable tunnel monitoring on this tunnel. Default: `true`.
     * 
     */
    public Boolean enable() {
        return this.enable;
    }
    /**
     * @return Which proxy-id (or proxy-id-v6) the monitoring traffic will use.
     * 
     */
    public String proxyId() {
        return this.proxyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIpsecTunnelListDataTunnelMonitor defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String destinationIp;
        private Boolean enable;
        private String proxyId;
        public Builder() {}
        public Builder(GetIpsecTunnelListDataTunnelMonitor defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationIp = defaults.destinationIp;
    	      this.enable = defaults.enable;
    	      this.proxyId = defaults.proxyId;
        }

        @CustomType.Setter
        public Builder destinationIp(String destinationIp) {
            if (destinationIp == null) {
              throw new MissingRequiredPropertyException("GetIpsecTunnelListDataTunnelMonitor", "destinationIp");
            }
            this.destinationIp = destinationIp;
            return this;
        }
        @CustomType.Setter
        public Builder enable(Boolean enable) {
            if (enable == null) {
              throw new MissingRequiredPropertyException("GetIpsecTunnelListDataTunnelMonitor", "enable");
            }
            this.enable = enable;
            return this;
        }
        @CustomType.Setter
        public Builder proxyId(String proxyId) {
            if (proxyId == null) {
              throw new MissingRequiredPropertyException("GetIpsecTunnelListDataTunnelMonitor", "proxyId");
            }
            this.proxyId = proxyId;
            return this;
        }
        public GetIpsecTunnelListDataTunnelMonitor build() {
            final var _resultValue = new GetIpsecTunnelListDataTunnelMonitor();
            _resultValue.destinationIp = destinationIp;
            _resultValue.enable = enable;
            _resultValue.proxyId = proxyId;
            return _resultValue;
        }
    }
}
