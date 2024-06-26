// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAuthenticationProfileListDataMethodKerberos {
    /**
     * @return The Realm param.
     * 
     */
    private String realm;
    /**
     * @return The ServerProfile param.
     * 
     */
    private String serverProfile;

    private GetAuthenticationProfileListDataMethodKerberos() {}
    /**
     * @return The Realm param.
     * 
     */
    public String realm() {
        return this.realm;
    }
    /**
     * @return The ServerProfile param.
     * 
     */
    public String serverProfile() {
        return this.serverProfile;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAuthenticationProfileListDataMethodKerberos defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String realm;
        private String serverProfile;
        public Builder() {}
        public Builder(GetAuthenticationProfileListDataMethodKerberos defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.realm = defaults.realm;
    	      this.serverProfile = defaults.serverProfile;
        }

        @CustomType.Setter
        public Builder realm(String realm) {
            if (realm == null) {
              throw new MissingRequiredPropertyException("GetAuthenticationProfileListDataMethodKerberos", "realm");
            }
            this.realm = realm;
            return this;
        }
        @CustomType.Setter
        public Builder serverProfile(String serverProfile) {
            if (serverProfile == null) {
              throw new MissingRequiredPropertyException("GetAuthenticationProfileListDataMethodKerberos", "serverProfile");
            }
            this.serverProfile = serverProfile;
            return this;
        }
        public GetAuthenticationProfileListDataMethodKerberos build() {
            final var _resultValue = new GetAuthenticationProfileListDataMethodKerberos();
            _resultValue.realm = realm;
            _resultValue.serverProfile = serverProfile;
            return _resultValue;
        }
    }
}
