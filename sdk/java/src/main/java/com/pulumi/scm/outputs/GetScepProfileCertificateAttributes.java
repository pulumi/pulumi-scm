// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetScepProfileCertificateAttributes {
    /**
     * @return The Dnsname param.
     * 
     */
    private String dnsname;
    /**
     * @return The Rfc822name param.
     * 
     */
    private String rfc822name;
    /**
     * @return The UniformResourceIdentifier param.
     * 
     */
    private String uniformResourceIdentifier;

    private GetScepProfileCertificateAttributes() {}
    /**
     * @return The Dnsname param.
     * 
     */
    public String dnsname() {
        return this.dnsname;
    }
    /**
     * @return The Rfc822name param.
     * 
     */
    public String rfc822name() {
        return this.rfc822name;
    }
    /**
     * @return The UniformResourceIdentifier param.
     * 
     */
    public String uniformResourceIdentifier() {
        return this.uniformResourceIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetScepProfileCertificateAttributes defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String dnsname;
        private String rfc822name;
        private String uniformResourceIdentifier;
        public Builder() {}
        public Builder(GetScepProfileCertificateAttributes defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dnsname = defaults.dnsname;
    	      this.rfc822name = defaults.rfc822name;
    	      this.uniformResourceIdentifier = defaults.uniformResourceIdentifier;
        }

        @CustomType.Setter
        public Builder dnsname(String dnsname) {
            if (dnsname == null) {
              throw new MissingRequiredPropertyException("GetScepProfileCertificateAttributes", "dnsname");
            }
            this.dnsname = dnsname;
            return this;
        }
        @CustomType.Setter
        public Builder rfc822name(String rfc822name) {
            if (rfc822name == null) {
              throw new MissingRequiredPropertyException("GetScepProfileCertificateAttributes", "rfc822name");
            }
            this.rfc822name = rfc822name;
            return this;
        }
        @CustomType.Setter
        public Builder uniformResourceIdentifier(String uniformResourceIdentifier) {
            if (uniformResourceIdentifier == null) {
              throw new MissingRequiredPropertyException("GetScepProfileCertificateAttributes", "uniformResourceIdentifier");
            }
            this.uniformResourceIdentifier = uniformResourceIdentifier;
            return this;
        }
        public GetScepProfileCertificateAttributes build() {
            final var _resultValue = new GetScepProfileCertificateAttributes();
            _resultValue.dnsname = dnsname;
            _resultValue.rfc822name = rfc822name;
            _resultValue.uniformResourceIdentifier = uniformResourceIdentifier;
            return _resultValue;
        }
    }
}
