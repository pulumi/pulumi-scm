// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IkeGatewayAuthenticationCertificateLocalCertificate {
    /**
     * @return The LocalCertificateName param.
     * 
     */
    private @Nullable String localCertificateName;

    private IkeGatewayAuthenticationCertificateLocalCertificate() {}
    /**
     * @return The LocalCertificateName param.
     * 
     */
    public Optional<String> localCertificateName() {
        return Optional.ofNullable(this.localCertificateName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IkeGatewayAuthenticationCertificateLocalCertificate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String localCertificateName;
        public Builder() {}
        public Builder(IkeGatewayAuthenticationCertificateLocalCertificate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.localCertificateName = defaults.localCertificateName;
        }

        @CustomType.Setter
        public Builder localCertificateName(@Nullable String localCertificateName) {

            this.localCertificateName = localCertificateName;
            return this;
        }
        public IkeGatewayAuthenticationCertificateLocalCertificate build() {
            final var _resultValue = new IkeGatewayAuthenticationCertificateLocalCertificate();
            _resultValue.localCertificateName = localCertificateName;
            return _resultValue;
        }
    }
}
