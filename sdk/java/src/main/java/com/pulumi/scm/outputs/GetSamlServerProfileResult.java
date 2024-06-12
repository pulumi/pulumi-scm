// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSamlServerProfileResult {
    /**
     * @return The Certificate param. String length must not exceed 63 characters.
     * 
     */
    private String certificate;
    /**
     * @return The EntityId param. String length must be between 1 and 1024 characters.
     * 
     */
    private String entityId;
    /**
     * @return The Id param.
     * 
     */
    private String id;
    /**
     * @return The MaxClockSkew param. Value must be between 1 and 900.
     * 
     */
    private Integer maxClockSkew;
    /**
     * @return The SloBindings param. String must be one of these: `&#34;post&#34;`, `&#34;redirect&#34;`.
     * 
     */
    private String sloBindings;
    /**
     * @return The SsoBindings param. String must be one of these: `&#34;post&#34;`, `&#34;redirect&#34;`.
     * 
     */
    private String ssoBindings;
    /**
     * @return The SsoUrl param. String length must be between 1 and 255 characters.
     * 
     */
    private String ssoUrl;
    private String tfid;
    /**
     * @return The ValidateIdpCertificate param.
     * 
     */
    private Boolean validateIdpCertificate;
    /**
     * @return The WantAuthRequestsSigned param.
     * 
     */
    private Boolean wantAuthRequestsSigned;

    private GetSamlServerProfileResult() {}
    /**
     * @return The Certificate param. String length must not exceed 63 characters.
     * 
     */
    public String certificate() {
        return this.certificate;
    }
    /**
     * @return The EntityId param. String length must be between 1 and 1024 characters.
     * 
     */
    public String entityId() {
        return this.entityId;
    }
    /**
     * @return The Id param.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The MaxClockSkew param. Value must be between 1 and 900.
     * 
     */
    public Integer maxClockSkew() {
        return this.maxClockSkew;
    }
    /**
     * @return The SloBindings param. String must be one of these: `&#34;post&#34;`, `&#34;redirect&#34;`.
     * 
     */
    public String sloBindings() {
        return this.sloBindings;
    }
    /**
     * @return The SsoBindings param. String must be one of these: `&#34;post&#34;`, `&#34;redirect&#34;`.
     * 
     */
    public String ssoBindings() {
        return this.ssoBindings;
    }
    /**
     * @return The SsoUrl param. String length must be between 1 and 255 characters.
     * 
     */
    public String ssoUrl() {
        return this.ssoUrl;
    }
    public String tfid() {
        return this.tfid;
    }
    /**
     * @return The ValidateIdpCertificate param.
     * 
     */
    public Boolean validateIdpCertificate() {
        return this.validateIdpCertificate;
    }
    /**
     * @return The WantAuthRequestsSigned param.
     * 
     */
    public Boolean wantAuthRequestsSigned() {
        return this.wantAuthRequestsSigned;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSamlServerProfileResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String certificate;
        private String entityId;
        private String id;
        private Integer maxClockSkew;
        private String sloBindings;
        private String ssoBindings;
        private String ssoUrl;
        private String tfid;
        private Boolean validateIdpCertificate;
        private Boolean wantAuthRequestsSigned;
        public Builder() {}
        public Builder(GetSamlServerProfileResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificate = defaults.certificate;
    	      this.entityId = defaults.entityId;
    	      this.id = defaults.id;
    	      this.maxClockSkew = defaults.maxClockSkew;
    	      this.sloBindings = defaults.sloBindings;
    	      this.ssoBindings = defaults.ssoBindings;
    	      this.ssoUrl = defaults.ssoUrl;
    	      this.tfid = defaults.tfid;
    	      this.validateIdpCertificate = defaults.validateIdpCertificate;
    	      this.wantAuthRequestsSigned = defaults.wantAuthRequestsSigned;
        }

        @CustomType.Setter
        public Builder certificate(String certificate) {
            if (certificate == null) {
              throw new MissingRequiredPropertyException("GetSamlServerProfileResult", "certificate");
            }
            this.certificate = certificate;
            return this;
        }
        @CustomType.Setter
        public Builder entityId(String entityId) {
            if (entityId == null) {
              throw new MissingRequiredPropertyException("GetSamlServerProfileResult", "entityId");
            }
            this.entityId = entityId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetSamlServerProfileResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder maxClockSkew(Integer maxClockSkew) {
            if (maxClockSkew == null) {
              throw new MissingRequiredPropertyException("GetSamlServerProfileResult", "maxClockSkew");
            }
            this.maxClockSkew = maxClockSkew;
            return this;
        }
        @CustomType.Setter
        public Builder sloBindings(String sloBindings) {
            if (sloBindings == null) {
              throw new MissingRequiredPropertyException("GetSamlServerProfileResult", "sloBindings");
            }
            this.sloBindings = sloBindings;
            return this;
        }
        @CustomType.Setter
        public Builder ssoBindings(String ssoBindings) {
            if (ssoBindings == null) {
              throw new MissingRequiredPropertyException("GetSamlServerProfileResult", "ssoBindings");
            }
            this.ssoBindings = ssoBindings;
            return this;
        }
        @CustomType.Setter
        public Builder ssoUrl(String ssoUrl) {
            if (ssoUrl == null) {
              throw new MissingRequiredPropertyException("GetSamlServerProfileResult", "ssoUrl");
            }
            this.ssoUrl = ssoUrl;
            return this;
        }
        @CustomType.Setter
        public Builder tfid(String tfid) {
            if (tfid == null) {
              throw new MissingRequiredPropertyException("GetSamlServerProfileResult", "tfid");
            }
            this.tfid = tfid;
            return this;
        }
        @CustomType.Setter
        public Builder validateIdpCertificate(Boolean validateIdpCertificate) {
            if (validateIdpCertificate == null) {
              throw new MissingRequiredPropertyException("GetSamlServerProfileResult", "validateIdpCertificate");
            }
            this.validateIdpCertificate = validateIdpCertificate;
            return this;
        }
        @CustomType.Setter
        public Builder wantAuthRequestsSigned(Boolean wantAuthRequestsSigned) {
            if (wantAuthRequestsSigned == null) {
              throw new MissingRequiredPropertyException("GetSamlServerProfileResult", "wantAuthRequestsSigned");
            }
            this.wantAuthRequestsSigned = wantAuthRequestsSigned;
            return this;
        }
        public GetSamlServerProfileResult build() {
            final var _resultValue = new GetSamlServerProfileResult();
            _resultValue.certificate = certificate;
            _resultValue.entityId = entityId;
            _resultValue.id = id;
            _resultValue.maxClockSkew = maxClockSkew;
            _resultValue.sloBindings = sloBindings;
            _resultValue.ssoBindings = ssoBindings;
            _resultValue.ssoUrl = ssoUrl;
            _resultValue.tfid = tfid;
            _resultValue.validateIdpCertificate = validateIdpCertificate;
            _resultValue.wantAuthRequestsSigned = wantAuthRequestsSigned;
            return _resultValue;
        }
    }
}