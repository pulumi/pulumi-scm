// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.outputs.GetExternalDynamicListTypeDomainDomainAuth;
import com.pulumi.scm.outputs.GetExternalDynamicListTypeDomainRecurring;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetExternalDynamicListTypeDomain {
    /**
     * @return Profile for authenticating client certificates. Default: `&#34;None&#34;`.
     * 
     */
    private String certificateProfile;
    /**
     * @return The Description param. String length must not exceed 255 characters.
     * 
     */
    private String description;
    /**
     * @return The DomainAuth param.
     * 
     */
    private GetExternalDynamicListTypeDomainDomainAuth domainAuth;
    /**
     * @return The ExceptionList param. Individual elements in this list are subject to additional validation. String length must not exceed 255 characters.
     * 
     */
    private List<String> exceptionLists;
    /**
     * @return Enable/Disable expand domain. Default: `false`.
     * 
     */
    private Boolean expandDomain;
    /**
     * @return The Recurring param.
     * 
     */
    private GetExternalDynamicListTypeDomainRecurring recurring;
    /**
     * @return The Url param. String length must not exceed 255 characters. Default: `&#34;http://&#34;`.
     * 
     */
    private String url;

    private GetExternalDynamicListTypeDomain() {}
    /**
     * @return Profile for authenticating client certificates. Default: `&#34;None&#34;`.
     * 
     */
    public String certificateProfile() {
        return this.certificateProfile;
    }
    /**
     * @return The Description param. String length must not exceed 255 characters.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The DomainAuth param.
     * 
     */
    public GetExternalDynamicListTypeDomainDomainAuth domainAuth() {
        return this.domainAuth;
    }
    /**
     * @return The ExceptionList param. Individual elements in this list are subject to additional validation. String length must not exceed 255 characters.
     * 
     */
    public List<String> exceptionLists() {
        return this.exceptionLists;
    }
    /**
     * @return Enable/Disable expand domain. Default: `false`.
     * 
     */
    public Boolean expandDomain() {
        return this.expandDomain;
    }
    /**
     * @return The Recurring param.
     * 
     */
    public GetExternalDynamicListTypeDomainRecurring recurring() {
        return this.recurring;
    }
    /**
     * @return The Url param. String length must not exceed 255 characters. Default: `&#34;http://&#34;`.
     * 
     */
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetExternalDynamicListTypeDomain defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String certificateProfile;
        private String description;
        private GetExternalDynamicListTypeDomainDomainAuth domainAuth;
        private List<String> exceptionLists;
        private Boolean expandDomain;
        private GetExternalDynamicListTypeDomainRecurring recurring;
        private String url;
        public Builder() {}
        public Builder(GetExternalDynamicListTypeDomain defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateProfile = defaults.certificateProfile;
    	      this.description = defaults.description;
    	      this.domainAuth = defaults.domainAuth;
    	      this.exceptionLists = defaults.exceptionLists;
    	      this.expandDomain = defaults.expandDomain;
    	      this.recurring = defaults.recurring;
    	      this.url = defaults.url;
        }

        @CustomType.Setter
        public Builder certificateProfile(String certificateProfile) {
            if (certificateProfile == null) {
              throw new MissingRequiredPropertyException("GetExternalDynamicListTypeDomain", "certificateProfile");
            }
            this.certificateProfile = certificateProfile;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetExternalDynamicListTypeDomain", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder domainAuth(GetExternalDynamicListTypeDomainDomainAuth domainAuth) {
            if (domainAuth == null) {
              throw new MissingRequiredPropertyException("GetExternalDynamicListTypeDomain", "domainAuth");
            }
            this.domainAuth = domainAuth;
            return this;
        }
        @CustomType.Setter
        public Builder exceptionLists(List<String> exceptionLists) {
            if (exceptionLists == null) {
              throw new MissingRequiredPropertyException("GetExternalDynamicListTypeDomain", "exceptionLists");
            }
            this.exceptionLists = exceptionLists;
            return this;
        }
        public Builder exceptionLists(String... exceptionLists) {
            return exceptionLists(List.of(exceptionLists));
        }
        @CustomType.Setter
        public Builder expandDomain(Boolean expandDomain) {
            if (expandDomain == null) {
              throw new MissingRequiredPropertyException("GetExternalDynamicListTypeDomain", "expandDomain");
            }
            this.expandDomain = expandDomain;
            return this;
        }
        @CustomType.Setter
        public Builder recurring(GetExternalDynamicListTypeDomainRecurring recurring) {
            if (recurring == null) {
              throw new MissingRequiredPropertyException("GetExternalDynamicListTypeDomain", "recurring");
            }
            this.recurring = recurring;
            return this;
        }
        @CustomType.Setter
        public Builder url(String url) {
            if (url == null) {
              throw new MissingRequiredPropertyException("GetExternalDynamicListTypeDomain", "url");
            }
            this.url = url;
            return this;
        }
        public GetExternalDynamicListTypeDomain build() {
            final var _resultValue = new GetExternalDynamicListTypeDomain();
            _resultValue.certificateProfile = certificateProfile;
            _resultValue.description = description;
            _resultValue.domainAuth = domainAuth;
            _resultValue.exceptionLists = exceptionLists;
            _resultValue.expandDomain = expandDomain;
            _resultValue.recurring = recurring;
            _resultValue.url = url;
            return _resultValue;
        }
    }
}