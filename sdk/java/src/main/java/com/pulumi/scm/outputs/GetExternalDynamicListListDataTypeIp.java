// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.outputs.GetExternalDynamicListListDataTypeIpIpAuth;
import com.pulumi.scm.outputs.GetExternalDynamicListListDataTypeIpRecurring;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetExternalDynamicListListDataTypeIp {
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
     * @return The ExceptionList param. Individual elements in this list are subject to additional validation. String length must not exceed 255 characters.
     * 
     */
    private List<String> exceptionLists;
    /**
     * @return The IpAuth param.
     * 
     */
    private GetExternalDynamicListListDataTypeIpIpAuth ipAuth;
    /**
     * @return The Recurring param.
     * 
     */
    private GetExternalDynamicListListDataTypeIpRecurring recurring;
    /**
     * @return The Url param. String length must not exceed 255 characters. Default: `&#34;http://&#34;`.
     * 
     */
    private String url;

    private GetExternalDynamicListListDataTypeIp() {}
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
     * @return The ExceptionList param. Individual elements in this list are subject to additional validation. String length must not exceed 255 characters.
     * 
     */
    public List<String> exceptionLists() {
        return this.exceptionLists;
    }
    /**
     * @return The IpAuth param.
     * 
     */
    public GetExternalDynamicListListDataTypeIpIpAuth ipAuth() {
        return this.ipAuth;
    }
    /**
     * @return The Recurring param.
     * 
     */
    public GetExternalDynamicListListDataTypeIpRecurring recurring() {
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

    public static Builder builder(GetExternalDynamicListListDataTypeIp defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String certificateProfile;
        private String description;
        private List<String> exceptionLists;
        private GetExternalDynamicListListDataTypeIpIpAuth ipAuth;
        private GetExternalDynamicListListDataTypeIpRecurring recurring;
        private String url;
        public Builder() {}
        public Builder(GetExternalDynamicListListDataTypeIp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateProfile = defaults.certificateProfile;
    	      this.description = defaults.description;
    	      this.exceptionLists = defaults.exceptionLists;
    	      this.ipAuth = defaults.ipAuth;
    	      this.recurring = defaults.recurring;
    	      this.url = defaults.url;
        }

        @CustomType.Setter
        public Builder certificateProfile(String certificateProfile) {
            if (certificateProfile == null) {
              throw new MissingRequiredPropertyException("GetExternalDynamicListListDataTypeIp", "certificateProfile");
            }
            this.certificateProfile = certificateProfile;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetExternalDynamicListListDataTypeIp", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder exceptionLists(List<String> exceptionLists) {
            if (exceptionLists == null) {
              throw new MissingRequiredPropertyException("GetExternalDynamicListListDataTypeIp", "exceptionLists");
            }
            this.exceptionLists = exceptionLists;
            return this;
        }
        public Builder exceptionLists(String... exceptionLists) {
            return exceptionLists(List.of(exceptionLists));
        }
        @CustomType.Setter
        public Builder ipAuth(GetExternalDynamicListListDataTypeIpIpAuth ipAuth) {
            if (ipAuth == null) {
              throw new MissingRequiredPropertyException("GetExternalDynamicListListDataTypeIp", "ipAuth");
            }
            this.ipAuth = ipAuth;
            return this;
        }
        @CustomType.Setter
        public Builder recurring(GetExternalDynamicListListDataTypeIpRecurring recurring) {
            if (recurring == null) {
              throw new MissingRequiredPropertyException("GetExternalDynamicListListDataTypeIp", "recurring");
            }
            this.recurring = recurring;
            return this;
        }
        @CustomType.Setter
        public Builder url(String url) {
            if (url == null) {
              throw new MissingRequiredPropertyException("GetExternalDynamicListListDataTypeIp", "url");
            }
            this.url = url;
            return this;
        }
        public GetExternalDynamicListListDataTypeIp build() {
            final var _resultValue = new GetExternalDynamicListListDataTypeIp();
            _resultValue.certificateProfile = certificateProfile;
            _resultValue.description = description;
            _resultValue.exceptionLists = exceptionLists;
            _resultValue.ipAuth = ipAuth;
            _resultValue.recurring = recurring;
            _resultValue.url = url;
            return _resultValue;
        }
    }
}
