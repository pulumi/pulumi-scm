// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MfaServerMfaVendorTypePingIdentityV1 {
    /**
     * @return The PingApiHost param.
     * 
     */
    private @Nullable String pingApiHost;
    /**
     * @return The PingBaseuri param.
     * 
     */
    private @Nullable String pingBaseuri;
    /**
     * @return The PingOrg param.
     * 
     */
    private @Nullable String pingOrg;
    /**
     * @return The PingOrgAlias param.
     * 
     */
    private @Nullable String pingOrgAlias;
    /**
     * @return The PingTimeout param.
     * 
     */
    private @Nullable String pingTimeout;
    /**
     * @return The PingToken param.
     * 
     */
    private @Nullable String pingToken;

    private MfaServerMfaVendorTypePingIdentityV1() {}
    /**
     * @return The PingApiHost param.
     * 
     */
    public Optional<String> pingApiHost() {
        return Optional.ofNullable(this.pingApiHost);
    }
    /**
     * @return The PingBaseuri param.
     * 
     */
    public Optional<String> pingBaseuri() {
        return Optional.ofNullable(this.pingBaseuri);
    }
    /**
     * @return The PingOrg param.
     * 
     */
    public Optional<String> pingOrg() {
        return Optional.ofNullable(this.pingOrg);
    }
    /**
     * @return The PingOrgAlias param.
     * 
     */
    public Optional<String> pingOrgAlias() {
        return Optional.ofNullable(this.pingOrgAlias);
    }
    /**
     * @return The PingTimeout param.
     * 
     */
    public Optional<String> pingTimeout() {
        return Optional.ofNullable(this.pingTimeout);
    }
    /**
     * @return The PingToken param.
     * 
     */
    public Optional<String> pingToken() {
        return Optional.ofNullable(this.pingToken);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MfaServerMfaVendorTypePingIdentityV1 defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String pingApiHost;
        private @Nullable String pingBaseuri;
        private @Nullable String pingOrg;
        private @Nullable String pingOrgAlias;
        private @Nullable String pingTimeout;
        private @Nullable String pingToken;
        public Builder() {}
        public Builder(MfaServerMfaVendorTypePingIdentityV1 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pingApiHost = defaults.pingApiHost;
    	      this.pingBaseuri = defaults.pingBaseuri;
    	      this.pingOrg = defaults.pingOrg;
    	      this.pingOrgAlias = defaults.pingOrgAlias;
    	      this.pingTimeout = defaults.pingTimeout;
    	      this.pingToken = defaults.pingToken;
        }

        @CustomType.Setter
        public Builder pingApiHost(@Nullable String pingApiHost) {

            this.pingApiHost = pingApiHost;
            return this;
        }
        @CustomType.Setter
        public Builder pingBaseuri(@Nullable String pingBaseuri) {

            this.pingBaseuri = pingBaseuri;
            return this;
        }
        @CustomType.Setter
        public Builder pingOrg(@Nullable String pingOrg) {

            this.pingOrg = pingOrg;
            return this;
        }
        @CustomType.Setter
        public Builder pingOrgAlias(@Nullable String pingOrgAlias) {

            this.pingOrgAlias = pingOrgAlias;
            return this;
        }
        @CustomType.Setter
        public Builder pingTimeout(@Nullable String pingTimeout) {

            this.pingTimeout = pingTimeout;
            return this;
        }
        @CustomType.Setter
        public Builder pingToken(@Nullable String pingToken) {

            this.pingToken = pingToken;
            return this;
        }
        public MfaServerMfaVendorTypePingIdentityV1 build() {
            final var _resultValue = new MfaServerMfaVendorTypePingIdentityV1();
            _resultValue.pingApiHost = pingApiHost;
            _resultValue.pingBaseuri = pingBaseuri;
            _resultValue.pingOrg = pingOrg;
            _resultValue.pingOrgAlias = pingOrgAlias;
            _resultValue.pingTimeout = pingTimeout;
            _resultValue.pingToken = pingToken;
            return _resultValue;
        }
    }
}