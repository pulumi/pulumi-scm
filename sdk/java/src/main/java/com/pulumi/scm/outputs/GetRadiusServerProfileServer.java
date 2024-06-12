// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetRadiusServerProfileServer {
    /**
     * @return The IpAddress param.
     * 
     */
    private String ipAddress;
    /**
     * @return The Name param.
     * 
     */
    private String name;
    /**
     * @return The Port param. Value must be between 1 and 65535.
     * 
     */
    private Integer port;
    /**
     * @return The Secret param. String length must not exceed 64 characters.
     * 
     */
    private String secret;

    private GetRadiusServerProfileServer() {}
    /**
     * @return The IpAddress param.
     * 
     */
    public String ipAddress() {
        return this.ipAddress;
    }
    /**
     * @return The Name param.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The Port param. Value must be between 1 and 65535.
     * 
     */
    public Integer port() {
        return this.port;
    }
    /**
     * @return The Secret param. String length must not exceed 64 characters.
     * 
     */
    public String secret() {
        return this.secret;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRadiusServerProfileServer defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String ipAddress;
        private String name;
        private Integer port;
        private String secret;
        public Builder() {}
        public Builder(GetRadiusServerProfileServer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipAddress = defaults.ipAddress;
    	      this.name = defaults.name;
    	      this.port = defaults.port;
    	      this.secret = defaults.secret;
        }

        @CustomType.Setter
        public Builder ipAddress(String ipAddress) {
            if (ipAddress == null) {
              throw new MissingRequiredPropertyException("GetRadiusServerProfileServer", "ipAddress");
            }
            this.ipAddress = ipAddress;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetRadiusServerProfileServer", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder port(Integer port) {
            if (port == null) {
              throw new MissingRequiredPropertyException("GetRadiusServerProfileServer", "port");
            }
            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder secret(String secret) {
            if (secret == null) {
              throw new MissingRequiredPropertyException("GetRadiusServerProfileServer", "secret");
            }
            this.secret = secret;
            return this;
        }
        public GetRadiusServerProfileServer build() {
            final var _resultValue = new GetRadiusServerProfileServer();
            _resultValue.ipAddress = ipAddress;
            _resultValue.name = name;
            _resultValue.port = port;
            _resultValue.secret = secret;
            return _resultValue;
        }
    }
}