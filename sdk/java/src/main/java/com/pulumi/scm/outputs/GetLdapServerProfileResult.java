// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.outputs.GetLdapServerProfileServer;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetLdapServerProfileResult {
    /**
     * @return The Base param. String length must not exceed 255 characters.
     * 
     */
    private String base;
    /**
     * @return The BindDn param. String length must not exceed 255 characters.
     * 
     */
    private String bindDn;
    /**
     * @return The BindPassword param. String length must not exceed 121 characters.
     * 
     */
    private String bindPassword;
    /**
     * @return The BindTimelimit param.
     * 
     */
    private String bindTimelimit;
    /**
     * @return The Id param.
     * 
     */
    private String id;
    /**
     * @return The LdapType param. String must be one of these: `&#34;active-directory&#34;`, `&#34;e-directory&#34;`, `&#34;sun&#34;`, `&#34;other&#34;`.
     * 
     */
    private String ldapType;
    /**
     * @return The RetryInterval param.
     * 
     */
    private Integer retryInterval;
    /**
     * @return The Servers param.
     * 
     */
    private List<GetLdapServerProfileServer> servers;
    /**
     * @return The Ssl param.
     * 
     */
    private Boolean ssl;
    private String tfid;
    /**
     * @return The Timelimit param.
     * 
     */
    private Integer timelimit;
    /**
     * @return The VerifyServerCertificate param.
     * 
     */
    private Boolean verifyServerCertificate;

    private GetLdapServerProfileResult() {}
    /**
     * @return The Base param. String length must not exceed 255 characters.
     * 
     */
    public String base() {
        return this.base;
    }
    /**
     * @return The BindDn param. String length must not exceed 255 characters.
     * 
     */
    public String bindDn() {
        return this.bindDn;
    }
    /**
     * @return The BindPassword param. String length must not exceed 121 characters.
     * 
     */
    public String bindPassword() {
        return this.bindPassword;
    }
    /**
     * @return The BindTimelimit param.
     * 
     */
    public String bindTimelimit() {
        return this.bindTimelimit;
    }
    /**
     * @return The Id param.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The LdapType param. String must be one of these: `&#34;active-directory&#34;`, `&#34;e-directory&#34;`, `&#34;sun&#34;`, `&#34;other&#34;`.
     * 
     */
    public String ldapType() {
        return this.ldapType;
    }
    /**
     * @return The RetryInterval param.
     * 
     */
    public Integer retryInterval() {
        return this.retryInterval;
    }
    /**
     * @return The Servers param.
     * 
     */
    public List<GetLdapServerProfileServer> servers() {
        return this.servers;
    }
    /**
     * @return The Ssl param.
     * 
     */
    public Boolean ssl() {
        return this.ssl;
    }
    public String tfid() {
        return this.tfid;
    }
    /**
     * @return The Timelimit param.
     * 
     */
    public Integer timelimit() {
        return this.timelimit;
    }
    /**
     * @return The VerifyServerCertificate param.
     * 
     */
    public Boolean verifyServerCertificate() {
        return this.verifyServerCertificate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLdapServerProfileResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String base;
        private String bindDn;
        private String bindPassword;
        private String bindTimelimit;
        private String id;
        private String ldapType;
        private Integer retryInterval;
        private List<GetLdapServerProfileServer> servers;
        private Boolean ssl;
        private String tfid;
        private Integer timelimit;
        private Boolean verifyServerCertificate;
        public Builder() {}
        public Builder(GetLdapServerProfileResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.base = defaults.base;
    	      this.bindDn = defaults.bindDn;
    	      this.bindPassword = defaults.bindPassword;
    	      this.bindTimelimit = defaults.bindTimelimit;
    	      this.id = defaults.id;
    	      this.ldapType = defaults.ldapType;
    	      this.retryInterval = defaults.retryInterval;
    	      this.servers = defaults.servers;
    	      this.ssl = defaults.ssl;
    	      this.tfid = defaults.tfid;
    	      this.timelimit = defaults.timelimit;
    	      this.verifyServerCertificate = defaults.verifyServerCertificate;
        }

        @CustomType.Setter
        public Builder base(String base) {
            if (base == null) {
              throw new MissingRequiredPropertyException("GetLdapServerProfileResult", "base");
            }
            this.base = base;
            return this;
        }
        @CustomType.Setter
        public Builder bindDn(String bindDn) {
            if (bindDn == null) {
              throw new MissingRequiredPropertyException("GetLdapServerProfileResult", "bindDn");
            }
            this.bindDn = bindDn;
            return this;
        }
        @CustomType.Setter
        public Builder bindPassword(String bindPassword) {
            if (bindPassword == null) {
              throw new MissingRequiredPropertyException("GetLdapServerProfileResult", "bindPassword");
            }
            this.bindPassword = bindPassword;
            return this;
        }
        @CustomType.Setter
        public Builder bindTimelimit(String bindTimelimit) {
            if (bindTimelimit == null) {
              throw new MissingRequiredPropertyException("GetLdapServerProfileResult", "bindTimelimit");
            }
            this.bindTimelimit = bindTimelimit;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetLdapServerProfileResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ldapType(String ldapType) {
            if (ldapType == null) {
              throw new MissingRequiredPropertyException("GetLdapServerProfileResult", "ldapType");
            }
            this.ldapType = ldapType;
            return this;
        }
        @CustomType.Setter
        public Builder retryInterval(Integer retryInterval) {
            if (retryInterval == null) {
              throw new MissingRequiredPropertyException("GetLdapServerProfileResult", "retryInterval");
            }
            this.retryInterval = retryInterval;
            return this;
        }
        @CustomType.Setter
        public Builder servers(List<GetLdapServerProfileServer> servers) {
            if (servers == null) {
              throw new MissingRequiredPropertyException("GetLdapServerProfileResult", "servers");
            }
            this.servers = servers;
            return this;
        }
        public Builder servers(GetLdapServerProfileServer... servers) {
            return servers(List.of(servers));
        }
        @CustomType.Setter
        public Builder ssl(Boolean ssl) {
            if (ssl == null) {
              throw new MissingRequiredPropertyException("GetLdapServerProfileResult", "ssl");
            }
            this.ssl = ssl;
            return this;
        }
        @CustomType.Setter
        public Builder tfid(String tfid) {
            if (tfid == null) {
              throw new MissingRequiredPropertyException("GetLdapServerProfileResult", "tfid");
            }
            this.tfid = tfid;
            return this;
        }
        @CustomType.Setter
        public Builder timelimit(Integer timelimit) {
            if (timelimit == null) {
              throw new MissingRequiredPropertyException("GetLdapServerProfileResult", "timelimit");
            }
            this.timelimit = timelimit;
            return this;
        }
        @CustomType.Setter
        public Builder verifyServerCertificate(Boolean verifyServerCertificate) {
            if (verifyServerCertificate == null) {
              throw new MissingRequiredPropertyException("GetLdapServerProfileResult", "verifyServerCertificate");
            }
            this.verifyServerCertificate = verifyServerCertificate;
            return this;
        }
        public GetLdapServerProfileResult build() {
            final var _resultValue = new GetLdapServerProfileResult();
            _resultValue.base = base;
            _resultValue.bindDn = bindDn;
            _resultValue.bindPassword = bindPassword;
            _resultValue.bindTimelimit = bindTimelimit;
            _resultValue.id = id;
            _resultValue.ldapType = ldapType;
            _resultValue.retryInterval = retryInterval;
            _resultValue.servers = servers;
            _resultValue.ssl = ssl;
            _resultValue.tfid = tfid;
            _resultValue.timelimit = timelimit;
            _resultValue.verifyServerCertificate = verifyServerCertificate;
            return _resultValue;
        }
    }
}