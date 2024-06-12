// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GetDecryptionProfileListDataSslForwardProxy {
    /**
     * @return The AutoIncludeAltname param. Default: `false`.
     * 
     */
    private Boolean autoIncludeAltname;
    /**
     * @return The BlockClientCert param. Default: `false`.
     * 
     */
    private Boolean blockClientCert;
    /**
     * @return The BlockExpiredCertificate param. Default: `false`.
     * 
     */
    private Boolean blockExpiredCertificate;
    /**
     * @return The BlockTimeoutCert param. Default: `false`.
     * 
     */
    private Boolean blockTimeoutCert;
    /**
     * @return The BlockTls13DowngradeNoResource param. Default: `false`.
     * 
     */
    private Boolean blockTls13DowngradeNoResource;
    /**
     * @return The BlockUnknownCert param. Default: `false`.
     * 
     */
    private Boolean blockUnknownCert;
    /**
     * @return The BlockUnsupportedCipher param. Default: `false`.
     * 
     */
    private Boolean blockUnsupportedCipher;
    /**
     * @return The BlockUnsupportedVersion param. Default: `false`.
     * 
     */
    private Boolean blockUnsupportedVersion;
    /**
     * @return The BlockUntrustedIssuer param. Default: `false`.
     * 
     */
    private Boolean blockUntrustedIssuer;
    /**
     * @return The RestrictCertExts param. Default: `false`.
     * 
     */
    private Boolean restrictCertExts;
    /**
     * @return The StripAlpn param. Default: `false`.
     * 
     */
    private Boolean stripAlpn;

    private GetDecryptionProfileListDataSslForwardProxy() {}
    /**
     * @return The AutoIncludeAltname param. Default: `false`.
     * 
     */
    public Boolean autoIncludeAltname() {
        return this.autoIncludeAltname;
    }
    /**
     * @return The BlockClientCert param. Default: `false`.
     * 
     */
    public Boolean blockClientCert() {
        return this.blockClientCert;
    }
    /**
     * @return The BlockExpiredCertificate param. Default: `false`.
     * 
     */
    public Boolean blockExpiredCertificate() {
        return this.blockExpiredCertificate;
    }
    /**
     * @return The BlockTimeoutCert param. Default: `false`.
     * 
     */
    public Boolean blockTimeoutCert() {
        return this.blockTimeoutCert;
    }
    /**
     * @return The BlockTls13DowngradeNoResource param. Default: `false`.
     * 
     */
    public Boolean blockTls13DowngradeNoResource() {
        return this.blockTls13DowngradeNoResource;
    }
    /**
     * @return The BlockUnknownCert param. Default: `false`.
     * 
     */
    public Boolean blockUnknownCert() {
        return this.blockUnknownCert;
    }
    /**
     * @return The BlockUnsupportedCipher param. Default: `false`.
     * 
     */
    public Boolean blockUnsupportedCipher() {
        return this.blockUnsupportedCipher;
    }
    /**
     * @return The BlockUnsupportedVersion param. Default: `false`.
     * 
     */
    public Boolean blockUnsupportedVersion() {
        return this.blockUnsupportedVersion;
    }
    /**
     * @return The BlockUntrustedIssuer param. Default: `false`.
     * 
     */
    public Boolean blockUntrustedIssuer() {
        return this.blockUntrustedIssuer;
    }
    /**
     * @return The RestrictCertExts param. Default: `false`.
     * 
     */
    public Boolean restrictCertExts() {
        return this.restrictCertExts;
    }
    /**
     * @return The StripAlpn param. Default: `false`.
     * 
     */
    public Boolean stripAlpn() {
        return this.stripAlpn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDecryptionProfileListDataSslForwardProxy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean autoIncludeAltname;
        private Boolean blockClientCert;
        private Boolean blockExpiredCertificate;
        private Boolean blockTimeoutCert;
        private Boolean blockTls13DowngradeNoResource;
        private Boolean blockUnknownCert;
        private Boolean blockUnsupportedCipher;
        private Boolean blockUnsupportedVersion;
        private Boolean blockUntrustedIssuer;
        private Boolean restrictCertExts;
        private Boolean stripAlpn;
        public Builder() {}
        public Builder(GetDecryptionProfileListDataSslForwardProxy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoIncludeAltname = defaults.autoIncludeAltname;
    	      this.blockClientCert = defaults.blockClientCert;
    	      this.blockExpiredCertificate = defaults.blockExpiredCertificate;
    	      this.blockTimeoutCert = defaults.blockTimeoutCert;
    	      this.blockTls13DowngradeNoResource = defaults.blockTls13DowngradeNoResource;
    	      this.blockUnknownCert = defaults.blockUnknownCert;
    	      this.blockUnsupportedCipher = defaults.blockUnsupportedCipher;
    	      this.blockUnsupportedVersion = defaults.blockUnsupportedVersion;
    	      this.blockUntrustedIssuer = defaults.blockUntrustedIssuer;
    	      this.restrictCertExts = defaults.restrictCertExts;
    	      this.stripAlpn = defaults.stripAlpn;
        }

        @CustomType.Setter
        public Builder autoIncludeAltname(Boolean autoIncludeAltname) {
            if (autoIncludeAltname == null) {
              throw new MissingRequiredPropertyException("GetDecryptionProfileListDataSslForwardProxy", "autoIncludeAltname");
            }
            this.autoIncludeAltname = autoIncludeAltname;
            return this;
        }
        @CustomType.Setter
        public Builder blockClientCert(Boolean blockClientCert) {
            if (blockClientCert == null) {
              throw new MissingRequiredPropertyException("GetDecryptionProfileListDataSslForwardProxy", "blockClientCert");
            }
            this.blockClientCert = blockClientCert;
            return this;
        }
        @CustomType.Setter
        public Builder blockExpiredCertificate(Boolean blockExpiredCertificate) {
            if (blockExpiredCertificate == null) {
              throw new MissingRequiredPropertyException("GetDecryptionProfileListDataSslForwardProxy", "blockExpiredCertificate");
            }
            this.blockExpiredCertificate = blockExpiredCertificate;
            return this;
        }
        @CustomType.Setter
        public Builder blockTimeoutCert(Boolean blockTimeoutCert) {
            if (blockTimeoutCert == null) {
              throw new MissingRequiredPropertyException("GetDecryptionProfileListDataSslForwardProxy", "blockTimeoutCert");
            }
            this.blockTimeoutCert = blockTimeoutCert;
            return this;
        }
        @CustomType.Setter
        public Builder blockTls13DowngradeNoResource(Boolean blockTls13DowngradeNoResource) {
            if (blockTls13DowngradeNoResource == null) {
              throw new MissingRequiredPropertyException("GetDecryptionProfileListDataSslForwardProxy", "blockTls13DowngradeNoResource");
            }
            this.blockTls13DowngradeNoResource = blockTls13DowngradeNoResource;
            return this;
        }
        @CustomType.Setter
        public Builder blockUnknownCert(Boolean blockUnknownCert) {
            if (blockUnknownCert == null) {
              throw new MissingRequiredPropertyException("GetDecryptionProfileListDataSslForwardProxy", "blockUnknownCert");
            }
            this.blockUnknownCert = blockUnknownCert;
            return this;
        }
        @CustomType.Setter
        public Builder blockUnsupportedCipher(Boolean blockUnsupportedCipher) {
            if (blockUnsupportedCipher == null) {
              throw new MissingRequiredPropertyException("GetDecryptionProfileListDataSslForwardProxy", "blockUnsupportedCipher");
            }
            this.blockUnsupportedCipher = blockUnsupportedCipher;
            return this;
        }
        @CustomType.Setter
        public Builder blockUnsupportedVersion(Boolean blockUnsupportedVersion) {
            if (blockUnsupportedVersion == null) {
              throw new MissingRequiredPropertyException("GetDecryptionProfileListDataSslForwardProxy", "blockUnsupportedVersion");
            }
            this.blockUnsupportedVersion = blockUnsupportedVersion;
            return this;
        }
        @CustomType.Setter
        public Builder blockUntrustedIssuer(Boolean blockUntrustedIssuer) {
            if (blockUntrustedIssuer == null) {
              throw new MissingRequiredPropertyException("GetDecryptionProfileListDataSslForwardProxy", "blockUntrustedIssuer");
            }
            this.blockUntrustedIssuer = blockUntrustedIssuer;
            return this;
        }
        @CustomType.Setter
        public Builder restrictCertExts(Boolean restrictCertExts) {
            if (restrictCertExts == null) {
              throw new MissingRequiredPropertyException("GetDecryptionProfileListDataSslForwardProxy", "restrictCertExts");
            }
            this.restrictCertExts = restrictCertExts;
            return this;
        }
        @CustomType.Setter
        public Builder stripAlpn(Boolean stripAlpn) {
            if (stripAlpn == null) {
              throw new MissingRequiredPropertyException("GetDecryptionProfileListDataSslForwardProxy", "stripAlpn");
            }
            this.stripAlpn = stripAlpn;
            return this;
        }
        public GetDecryptionProfileListDataSslForwardProxy build() {
            final var _resultValue = new GetDecryptionProfileListDataSslForwardProxy();
            _resultValue.autoIncludeAltname = autoIncludeAltname;
            _resultValue.blockClientCert = blockClientCert;
            _resultValue.blockExpiredCertificate = blockExpiredCertificate;
            _resultValue.blockTimeoutCert = blockTimeoutCert;
            _resultValue.blockTls13DowngradeNoResource = blockTls13DowngradeNoResource;
            _resultValue.blockUnknownCert = blockUnknownCert;
            _resultValue.blockUnsupportedCipher = blockUnsupportedCipher;
            _resultValue.blockUnsupportedVersion = blockUnsupportedVersion;
            _resultValue.blockUntrustedIssuer = blockUntrustedIssuer;
            _resultValue.restrictCertExts = restrictCertExts;
            _resultValue.stripAlpn = stripAlpn;
            return _resultValue;
        }
    }
}