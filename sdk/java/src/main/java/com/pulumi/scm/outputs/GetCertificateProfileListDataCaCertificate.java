// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCertificateProfileListDataCaCertificate {
    /**
     * @return The DefaultOcspUrl param.
     * 
     */
    private String defaultOcspUrl;
    /**
     * @return The Name param.
     * 
     */
    private String name;
    /**
     * @return The OcspVerifyCert param.
     * 
     */
    private String ocspVerifyCert;
    /**
     * @return The TemplateName param.
     * 
     */
    private String templateName;

    private GetCertificateProfileListDataCaCertificate() {}
    /**
     * @return The DefaultOcspUrl param.
     * 
     */
    public String defaultOcspUrl() {
        return this.defaultOcspUrl;
    }
    /**
     * @return The Name param.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The OcspVerifyCert param.
     * 
     */
    public String ocspVerifyCert() {
        return this.ocspVerifyCert;
    }
    /**
     * @return The TemplateName param.
     * 
     */
    public String templateName() {
        return this.templateName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCertificateProfileListDataCaCertificate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String defaultOcspUrl;
        private String name;
        private String ocspVerifyCert;
        private String templateName;
        public Builder() {}
        public Builder(GetCertificateProfileListDataCaCertificate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultOcspUrl = defaults.defaultOcspUrl;
    	      this.name = defaults.name;
    	      this.ocspVerifyCert = defaults.ocspVerifyCert;
    	      this.templateName = defaults.templateName;
        }

        @CustomType.Setter
        public Builder defaultOcspUrl(String defaultOcspUrl) {
            if (defaultOcspUrl == null) {
              throw new MissingRequiredPropertyException("GetCertificateProfileListDataCaCertificate", "defaultOcspUrl");
            }
            this.defaultOcspUrl = defaultOcspUrl;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetCertificateProfileListDataCaCertificate", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder ocspVerifyCert(String ocspVerifyCert) {
            if (ocspVerifyCert == null) {
              throw new MissingRequiredPropertyException("GetCertificateProfileListDataCaCertificate", "ocspVerifyCert");
            }
            this.ocspVerifyCert = ocspVerifyCert;
            return this;
        }
        @CustomType.Setter
        public Builder templateName(String templateName) {
            if (templateName == null) {
              throw new MissingRequiredPropertyException("GetCertificateProfileListDataCaCertificate", "templateName");
            }
            this.templateName = templateName;
            return this;
        }
        public GetCertificateProfileListDataCaCertificate build() {
            final var _resultValue = new GetCertificateProfileListDataCaCertificate();
            _resultValue.defaultOcspUrl = defaultOcspUrl;
            _resultValue.name = name;
            _resultValue.ocspVerifyCert = ocspVerifyCert;
            _resultValue.templateName = templateName;
            return _resultValue;
        }
    }
}