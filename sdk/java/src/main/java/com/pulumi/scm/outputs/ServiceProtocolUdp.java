// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.outputs.ServiceProtocolUdpOverride;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceProtocolUdp {
    /**
     * @return The Override param.
     * 
     */
    private @Nullable ServiceProtocolUdpOverride override;
    /**
     * @return The Port param. String length must be between 1 and 1023 characters.
     * 
     */
    private String port;
    /**
     * @return The SourcePort param. String length must be between 1 and 1023 characters.
     * 
     */
    private @Nullable String sourcePort;

    private ServiceProtocolUdp() {}
    /**
     * @return The Override param.
     * 
     */
    public Optional<ServiceProtocolUdpOverride> override() {
        return Optional.ofNullable(this.override);
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
    public Optional<String> sourcePort() {
        return Optional.ofNullable(this.sourcePort);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceProtocolUdp defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ServiceProtocolUdpOverride override;
        private String port;
        private @Nullable String sourcePort;
        public Builder() {}
        public Builder(ServiceProtocolUdp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.override = defaults.override;
    	      this.port = defaults.port;
    	      this.sourcePort = defaults.sourcePort;
        }

        @CustomType.Setter
        public Builder override(@Nullable ServiceProtocolUdpOverride override) {

            this.override = override;
            return this;
        }
        @CustomType.Setter
        public Builder port(String port) {
            if (port == null) {
              throw new MissingRequiredPropertyException("ServiceProtocolUdp", "port");
            }
            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder sourcePort(@Nullable String sourcePort) {

            this.sourcePort = sourcePort;
            return this;
        }
        public ServiceProtocolUdp build() {
            final var _resultValue = new ServiceProtocolUdp();
            _resultValue.override = override;
            _resultValue.port = port;
            _resultValue.sourcePort = sourcePort;
            return _resultValue;
        }
    }
}
