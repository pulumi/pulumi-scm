// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.outputs.GetServiceProtocolTcpOverride;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetServiceProtocolTcp {
    /**
     * @return The Override param.
     * 
     */
    private GetServiceProtocolTcpOverride override;
    /**
     * @return The Port param. String length must be between 1 and 1023 characters.
     * 
     */
    private String port;
    /**
     * @return The SourcePort param. String length must be between 1 and 1023 characters.
     * 
     */
    private String sourcePort;

    private GetServiceProtocolTcp() {}
    /**
     * @return The Override param.
     * 
     */
    public GetServiceProtocolTcpOverride override() {
        return this.override;
    }
    /**
     * @return The Port param. String length must be between 1 and 1023 characters.
     * 
     */
    public String port() {
        return this.port;
    }
    /**
     * @return The SourcePort param. String length must be between 1 and 1023 characters.
     * 
     */
    public String sourcePort() {
        return this.sourcePort;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceProtocolTcp defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetServiceProtocolTcpOverride override;
        private String port;
        private String sourcePort;
        public Builder() {}
        public Builder(GetServiceProtocolTcp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.override = defaults.override;
    	      this.port = defaults.port;
    	      this.sourcePort = defaults.sourcePort;
        }

        @CustomType.Setter
        public Builder override(GetServiceProtocolTcpOverride override) {
            if (override == null) {
              throw new MissingRequiredPropertyException("GetServiceProtocolTcp", "override");
            }
            this.override = override;
            return this;
        }
        @CustomType.Setter
        public Builder port(String port) {
            if (port == null) {
              throw new MissingRequiredPropertyException("GetServiceProtocolTcp", "port");
            }
            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder sourcePort(String sourcePort) {
            if (sourcePort == null) {
              throw new MissingRequiredPropertyException("GetServiceProtocolTcp", "sourcePort");
            }
            this.sourcePort = sourcePort;
            return this;
        }
        public GetServiceProtocolTcp build() {
            final var _resultValue = new GetServiceProtocolTcp();
            _resultValue.override = override;
            _resultValue.port = port;
            _resultValue.sourcePort = sourcePort;
            return _resultValue;
        }
    }
}