// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetIkeGatewayAuthenticationCertificateLocalCertificate {
    /**
     * @return The LocalCertificateName param.
     * 
     */
    private String localCertificateName;

    private GetIkeGatewayAuthenticationCertificateLocalCertificate() {}
    /**
     * @return The LocalCertificateName param.
     * 
     */
    public String localCertificateName() {
        return this.localCertificateName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIkeGatewayAuthenticationCertificateLocalCertificate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String localCertificateName;
        public Builder() {}
        public Builder(GetIkeGatewayAuthenticationCertificateLocalCertificate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.localCertificateName = defaults.localCertificateName;
        }

        @CustomType.Setter
        public Builder localCertificateName(String localCertificateName) {
            if (localCertificateName == null) {
              throw new MissingRequiredPropertyException("GetIkeGatewayAuthenticationCertificateLocalCertificate", "localCertificateName");
            }
            this.localCertificateName = localCertificateName;
            return this;
        }
        public GetIkeGatewayAuthenticationCertificateLocalCertificate build() {
            final var _resultValue = new GetIkeGatewayAuthenticationCertificateLocalCertificate();
            _resultValue.localCertificateName = localCertificateName;
            return _resultValue;
        }
    }
}