// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.outputs.GetApplicationDefaultIdentByIcmp6Type;
import com.pulumi.scm.outputs.GetApplicationDefaultIdentByIcmpType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetApplicationDefault {
    /**
     * @return The IdentByIcmp6Type param.
     * 
     */
    private GetApplicationDefaultIdentByIcmp6Type identByIcmp6Type;
    /**
     * @return The IdentByIcmpType param.
     * 
     */
    private GetApplicationDefaultIdentByIcmpType identByIcmpType;
    /**
     * @return The IdentByIpProtocol param.
     * 
     */
    private String identByIpProtocol;
    /**
     * @return The Ports param. Individual elements in this list are subject to additional validation. String length must not exceed 63 characters.
     * 
     */
    private List<String> ports;

    private GetApplicationDefault() {}
    /**
     * @return The IdentByIcmp6Type param.
     * 
     */
    public GetApplicationDefaultIdentByIcmp6Type identByIcmp6Type() {
        return this.identByIcmp6Type;
    }
    /**
     * @return The IdentByIcmpType param.
     * 
     */
    public GetApplicationDefaultIdentByIcmpType identByIcmpType() {
        return this.identByIcmpType;
    }
    /**
     * @return The IdentByIpProtocol param.
     * 
     */
    public String identByIpProtocol() {
        return this.identByIpProtocol;
    }
    /**
     * @return The Ports param. Individual elements in this list are subject to additional validation. String length must not exceed 63 characters.
     * 
     */
    public List<String> ports() {
        return this.ports;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplicationDefault defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetApplicationDefaultIdentByIcmp6Type identByIcmp6Type;
        private GetApplicationDefaultIdentByIcmpType identByIcmpType;
        private String identByIpProtocol;
        private List<String> ports;
        public Builder() {}
        public Builder(GetApplicationDefault defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identByIcmp6Type = defaults.identByIcmp6Type;
    	      this.identByIcmpType = defaults.identByIcmpType;
    	      this.identByIpProtocol = defaults.identByIpProtocol;
    	      this.ports = defaults.ports;
        }

        @CustomType.Setter
        public Builder identByIcmp6Type(GetApplicationDefaultIdentByIcmp6Type identByIcmp6Type) {
            if (identByIcmp6Type == null) {
              throw new MissingRequiredPropertyException("GetApplicationDefault", "identByIcmp6Type");
            }
            this.identByIcmp6Type = identByIcmp6Type;
            return this;
        }
        @CustomType.Setter
        public Builder identByIcmpType(GetApplicationDefaultIdentByIcmpType identByIcmpType) {
            if (identByIcmpType == null) {
              throw new MissingRequiredPropertyException("GetApplicationDefault", "identByIcmpType");
            }
            this.identByIcmpType = identByIcmpType;
            return this;
        }
        @CustomType.Setter
        public Builder identByIpProtocol(String identByIpProtocol) {
            if (identByIpProtocol == null) {
              throw new MissingRequiredPropertyException("GetApplicationDefault", "identByIpProtocol");
            }
            this.identByIpProtocol = identByIpProtocol;
            return this;
        }
        @CustomType.Setter
        public Builder ports(List<String> ports) {
            if (ports == null) {
              throw new MissingRequiredPropertyException("GetApplicationDefault", "ports");
            }
            this.ports = ports;
            return this;
        }
        public Builder ports(String... ports) {
            return ports(List.of(ports));
        }
        public GetApplicationDefault build() {
            final var _resultValue = new GetApplicationDefault();
            _resultValue.identByIcmp6Type = identByIcmp6Type;
            _resultValue.identByIcmpType = identByIcmpType;
            _resultValue.identByIpProtocol = identByIpProtocol;
            _resultValue.ports = ports;
            return _resultValue;
        }
    }
}
