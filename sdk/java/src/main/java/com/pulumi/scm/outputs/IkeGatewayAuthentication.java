// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.scm.outputs.IkeGatewayAuthenticationCertificate;
import com.pulumi.scm.outputs.IkeGatewayAuthenticationPreSharedKey;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IkeGatewayAuthentication {
    /**
     * @return The Certificate param. Ensure that only one of the following is specified: `certificate`, `pre_shared_key`
     * 
     */
    private @Nullable IkeGatewayAuthenticationCertificate certificate;
    /**
     * @return The PreSharedKey param. Ensure that only one of the following is specified: `certificate`, `pre_shared_key`
     * 
     */
    private @Nullable IkeGatewayAuthenticationPreSharedKey preSharedKey;

    private IkeGatewayAuthentication() {}
    /**
     * @return The Certificate param. Ensure that only one of the following is specified: `certificate`, `pre_shared_key`
     * 
     */
    public Optional<IkeGatewayAuthenticationCertificate> certificate() {
        return Optional.ofNullable(this.certificate);
    }
    /**
     * @return The PreSharedKey param. Ensure that only one of the following is specified: `certificate`, `pre_shared_key`
     * 
     */
    public Optional<IkeGatewayAuthenticationPreSharedKey> preSharedKey() {
        return Optional.ofNullable(this.preSharedKey);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IkeGatewayAuthentication defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable IkeGatewayAuthenticationCertificate certificate;
        private @Nullable IkeGatewayAuthenticationPreSharedKey preSharedKey;
        public Builder() {}
        public Builder(IkeGatewayAuthentication defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificate = defaults.certificate;
    	      this.preSharedKey = defaults.preSharedKey;
        }

        @CustomType.Setter
        public Builder certificate(@Nullable IkeGatewayAuthenticationCertificate certificate) {

            this.certificate = certificate;
            return this;
        }
        @CustomType.Setter
        public Builder preSharedKey(@Nullable IkeGatewayAuthenticationPreSharedKey preSharedKey) {

            this.preSharedKey = preSharedKey;
            return this;
        }
        public IkeGatewayAuthentication build() {
            final var _resultValue = new IkeGatewayAuthentication();
            _resultValue.certificate = certificate;
            _resultValue.preSharedKey = preSharedKey;
            return _resultValue;
        }
    }
}
