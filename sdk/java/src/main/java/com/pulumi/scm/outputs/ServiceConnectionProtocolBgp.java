// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceConnectionProtocolBgp {
    /**
     * @return The DoNotExportRoutes param.
     * 
     */
    private @Nullable Boolean doNotExportRoutes;
    /**
     * @return The Enable param.
     * 
     */
    private @Nullable Boolean enable;
    /**
     * @return The FastFailover param.
     * 
     */
    private @Nullable Boolean fastFailover;
    /**
     * @return The LocalIpAddress param.
     * 
     */
    private @Nullable String localIpAddress;
    /**
     * @return The OriginateDefaultRoute param.
     * 
     */
    private @Nullable Boolean originateDefaultRoute;
    /**
     * @return The PeerAs param.
     * 
     */
    private @Nullable String peerAs;
    /**
     * @return The PeerIpAddress param.
     * 
     */
    private @Nullable String peerIpAddress;
    /**
     * @return The Secret param.
     * 
     */
    private @Nullable String secret;
    /**
     * @return The SummarizeMobileUserRoutes param.
     * 
     */
    private @Nullable Boolean summarizeMobileUserRoutes;

    private ServiceConnectionProtocolBgp() {}
    /**
     * @return The DoNotExportRoutes param.
     * 
     */
    public Optional<Boolean> doNotExportRoutes() {
        return Optional.ofNullable(this.doNotExportRoutes);
    }
    /**
     * @return The Enable param.
     * 
     */
    public Optional<Boolean> enable() {
        return Optional.ofNullable(this.enable);
    }
    /**
     * @return The FastFailover param.
     * 
     */
    public Optional<Boolean> fastFailover() {
        return Optional.ofNullable(this.fastFailover);
    }
    /**
     * @return The LocalIpAddress param.
     * 
     */
    public Optional<String> localIpAddress() {
        return Optional.ofNullable(this.localIpAddress);
    }
    /**
     * @return The OriginateDefaultRoute param.
     * 
     */
    public Optional<Boolean> originateDefaultRoute() {
        return Optional.ofNullable(this.originateDefaultRoute);
    }
    /**
     * @return The PeerAs param.
     * 
     */
    public Optional<String> peerAs() {
        return Optional.ofNullable(this.peerAs);
    }
    /**
     * @return The PeerIpAddress param.
     * 
     */
    public Optional<String> peerIpAddress() {
        return Optional.ofNullable(this.peerIpAddress);
    }
    /**
     * @return The Secret param.
     * 
     */
    public Optional<String> secret() {
        return Optional.ofNullable(this.secret);
    }
    /**
     * @return The SummarizeMobileUserRoutes param.
     * 
     */
    public Optional<Boolean> summarizeMobileUserRoutes() {
        return Optional.ofNullable(this.summarizeMobileUserRoutes);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceConnectionProtocolBgp defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean doNotExportRoutes;
        private @Nullable Boolean enable;
        private @Nullable Boolean fastFailover;
        private @Nullable String localIpAddress;
        private @Nullable Boolean originateDefaultRoute;
        private @Nullable String peerAs;
        private @Nullable String peerIpAddress;
        private @Nullable String secret;
        private @Nullable Boolean summarizeMobileUserRoutes;
        public Builder() {}
        public Builder(ServiceConnectionProtocolBgp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.doNotExportRoutes = defaults.doNotExportRoutes;
    	      this.enable = defaults.enable;
    	      this.fastFailover = defaults.fastFailover;
    	      this.localIpAddress = defaults.localIpAddress;
    	      this.originateDefaultRoute = defaults.originateDefaultRoute;
    	      this.peerAs = defaults.peerAs;
    	      this.peerIpAddress = defaults.peerIpAddress;
    	      this.secret = defaults.secret;
    	      this.summarizeMobileUserRoutes = defaults.summarizeMobileUserRoutes;
        }

        @CustomType.Setter
        public Builder doNotExportRoutes(@Nullable Boolean doNotExportRoutes) {

            this.doNotExportRoutes = doNotExportRoutes;
            return this;
        }
        @CustomType.Setter
        public Builder enable(@Nullable Boolean enable) {

            this.enable = enable;
            return this;
        }
        @CustomType.Setter
        public Builder fastFailover(@Nullable Boolean fastFailover) {

            this.fastFailover = fastFailover;
            return this;
        }
        @CustomType.Setter
        public Builder localIpAddress(@Nullable String localIpAddress) {

            this.localIpAddress = localIpAddress;
            return this;
        }
        @CustomType.Setter
        public Builder originateDefaultRoute(@Nullable Boolean originateDefaultRoute) {

            this.originateDefaultRoute = originateDefaultRoute;
            return this;
        }
        @CustomType.Setter
        public Builder peerAs(@Nullable String peerAs) {

            this.peerAs = peerAs;
            return this;
        }
        @CustomType.Setter
        public Builder peerIpAddress(@Nullable String peerIpAddress) {

            this.peerIpAddress = peerIpAddress;
            return this;
        }
        @CustomType.Setter
        public Builder secret(@Nullable String secret) {

            this.secret = secret;
            return this;
        }
        @CustomType.Setter
        public Builder summarizeMobileUserRoutes(@Nullable Boolean summarizeMobileUserRoutes) {

            this.summarizeMobileUserRoutes = summarizeMobileUserRoutes;
            return this;
        }
        public ServiceConnectionProtocolBgp build() {
            final var _resultValue = new ServiceConnectionProtocolBgp();
            _resultValue.doNotExportRoutes = doNotExportRoutes;
            _resultValue.enable = enable;
            _resultValue.fastFailover = fastFailover;
            _resultValue.localIpAddress = localIpAddress;
            _resultValue.originateDefaultRoute = originateDefaultRoute;
            _resultValue.peerAs = peerAs;
            _resultValue.peerIpAddress = peerIpAddress;
            _resultValue.secret = secret;
            _resultValue.summarizeMobileUserRoutes = summarizeMobileUserRoutes;
            return _resultValue;
        }
    }
}
