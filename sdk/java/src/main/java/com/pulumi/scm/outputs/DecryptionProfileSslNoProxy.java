// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DecryptionProfileSslNoProxy {
    /**
     * @return The BlockExpiredCertificate param. Default: `false`.
     * 
     */
    private @Nullable Boolean blockExpiredCertificate;
    /**
     * @return The BlockUntrustedIssuer param. Default: `false`.
     * 
     */
    private @Nullable Boolean blockUntrustedIssuer;

    private DecryptionProfileSslNoProxy() {}
    /**
     * @return The BlockExpiredCertificate param. Default: `false`.
     * 
     */
    public Optional<Boolean> blockExpiredCertificate() {
        return Optional.ofNullable(this.blockExpiredCertificate);
    }
    /**
     * @return The BlockUntrustedIssuer param. Default: `false`.
     * 
     */
    public Optional<Boolean> blockUntrustedIssuer() {
        return Optional.ofNullable(this.blockUntrustedIssuer);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DecryptionProfileSslNoProxy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean blockExpiredCertificate;
        private @Nullable Boolean blockUntrustedIssuer;
        public Builder() {}
        public Builder(DecryptionProfileSslNoProxy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blockExpiredCertificate = defaults.blockExpiredCertificate;
    	      this.blockUntrustedIssuer = defaults.blockUntrustedIssuer;
        }

        @CustomType.Setter
        public Builder blockExpiredCertificate(@Nullable Boolean blockExpiredCertificate) {

            this.blockExpiredCertificate = blockExpiredCertificate;
            return this;
        }
        @CustomType.Setter
        public Builder blockUntrustedIssuer(@Nullable Boolean blockUntrustedIssuer) {

            this.blockUntrustedIssuer = blockUntrustedIssuer;
            return this;
        }
        public DecryptionProfileSslNoProxy build() {
            final var _resultValue = new DecryptionProfileSslNoProxy();
            _resultValue.blockExpiredCertificate = blockExpiredCertificate;
            _resultValue.blockUntrustedIssuer = blockUntrustedIssuer;
            return _resultValue;
        }
    }
}
