// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetIkeGatewayListDataPeerAddress {
    /**
     * @return The DynamicAddress param.
     * 
     */
    private Boolean dynamicAddress;
    /**
     * @return peer gateway FQDN name. String length must not exceed 255 characters.
     * 
     */
    private String fqdn;
    /**
     * @return peer gateway has static IP address.
     * 
     */
    private String ip;

    private GetIkeGatewayListDataPeerAddress() {}
    /**
     * @return The DynamicAddress param.
     * 
     */
    public Boolean dynamicAddress() {
        return this.dynamicAddress;
    }
    /**
     * @return peer gateway FQDN name. String length must not exceed 255 characters.
     * 
     */
    public String fqdn() {
        return this.fqdn;
    }
    /**
     * @return peer gateway has static IP address.
     * 
     */
    public String ip() {
        return this.ip;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIkeGatewayListDataPeerAddress defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean dynamicAddress;
        private String fqdn;
        private String ip;
        public Builder() {}
        public Builder(GetIkeGatewayListDataPeerAddress defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dynamicAddress = defaults.dynamicAddress;
    	      this.fqdn = defaults.fqdn;
    	      this.ip = defaults.ip;
        }

        @CustomType.Setter
        public Builder dynamicAddress(Boolean dynamicAddress) {
            if (dynamicAddress == null) {
              throw new MissingRequiredPropertyException("GetIkeGatewayListDataPeerAddress", "dynamicAddress");
            }
            this.dynamicAddress = dynamicAddress;
            return this;
        }
        @CustomType.Setter
        public Builder fqdn(String fqdn) {
            if (fqdn == null) {
              throw new MissingRequiredPropertyException("GetIkeGatewayListDataPeerAddress", "fqdn");
            }
            this.fqdn = fqdn;
            return this;
        }
        @CustomType.Setter
        public Builder ip(String ip) {
            if (ip == null) {
              throw new MissingRequiredPropertyException("GetIkeGatewayListDataPeerAddress", "ip");
            }
            this.ip = ip;
            return this;
        }
        public GetIkeGatewayListDataPeerAddress build() {
            final var _resultValue = new GetIkeGatewayListDataPeerAddress();
            _resultValue.dynamicAddress = dynamicAddress;
            _resultValue.fqdn = fqdn;
            _resultValue.ip = ip;
            return _resultValue;
        }
    }
}
