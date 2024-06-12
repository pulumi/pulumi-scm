// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAuthenticationProfileSingleSignOn {
    /**
     * @return The KerberosKeytab param. String length must not exceed 8192 characters.
     * 
     */
    private String kerberosKeytab;
    /**
     * @return The Realm param. String length must not exceed 127 characters.
     * 
     */
    private String realm;

    private GetAuthenticationProfileSingleSignOn() {}
    /**
     * @return The KerberosKeytab param. String length must not exceed 8192 characters.
     * 
     */
    public String kerberosKeytab() {
        return this.kerberosKeytab;
    }
    /**
     * @return The Realm param. String length must not exceed 127 characters.
     * 
     */
    public String realm() {
        return this.realm;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAuthenticationProfileSingleSignOn defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String kerberosKeytab;
        private String realm;
        public Builder() {}
        public Builder(GetAuthenticationProfileSingleSignOn defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kerberosKeytab = defaults.kerberosKeytab;
    	      this.realm = defaults.realm;
        }

        @CustomType.Setter
        public Builder kerberosKeytab(String kerberosKeytab) {
            if (kerberosKeytab == null) {
              throw new MissingRequiredPropertyException("GetAuthenticationProfileSingleSignOn", "kerberosKeytab");
            }
            this.kerberosKeytab = kerberosKeytab;
            return this;
        }
        @CustomType.Setter
        public Builder realm(String realm) {
            if (realm == null) {
              throw new MissingRequiredPropertyException("GetAuthenticationProfileSingleSignOn", "realm");
            }
            this.realm = realm;
            return this;
        }
        public GetAuthenticationProfileSingleSignOn build() {
            final var _resultValue = new GetAuthenticationProfileSingleSignOn();
            _resultValue.kerberosKeytab = kerberosKeytab;
            _resultValue.realm = realm;
            return _resultValue;
        }
    }
}