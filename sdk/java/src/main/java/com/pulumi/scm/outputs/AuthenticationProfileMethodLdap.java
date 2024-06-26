// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AuthenticationProfileMethodLdap {
    /**
     * @return The LoginAttribute param.
     * 
     */
    private @Nullable String loginAttribute;
    /**
     * @return The PasswdExpDays param.
     * 
     */
    private @Nullable Integer passwdExpDays;
    /**
     * @return The ServerProfile param.
     * 
     */
    private @Nullable String serverProfile;

    private AuthenticationProfileMethodLdap() {}
    /**
     * @return The LoginAttribute param.
     * 
     */
    public Optional<String> loginAttribute() {
        return Optional.ofNullable(this.loginAttribute);
    }
    /**
     * @return The PasswdExpDays param.
     * 
     */
    public Optional<Integer> passwdExpDays() {
        return Optional.ofNullable(this.passwdExpDays);
    }
    /**
     * @return The ServerProfile param.
     * 
     */
    public Optional<String> serverProfile() {
        return Optional.ofNullable(this.serverProfile);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthenticationProfileMethodLdap defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String loginAttribute;
        private @Nullable Integer passwdExpDays;
        private @Nullable String serverProfile;
        public Builder() {}
        public Builder(AuthenticationProfileMethodLdap defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.loginAttribute = defaults.loginAttribute;
    	      this.passwdExpDays = defaults.passwdExpDays;
    	      this.serverProfile = defaults.serverProfile;
        }

        @CustomType.Setter
        public Builder loginAttribute(@Nullable String loginAttribute) {

            this.loginAttribute = loginAttribute;
            return this;
        }
        @CustomType.Setter
        public Builder passwdExpDays(@Nullable Integer passwdExpDays) {

            this.passwdExpDays = passwdExpDays;
            return this;
        }
        @CustomType.Setter
        public Builder serverProfile(@Nullable String serverProfile) {

            this.serverProfile = serverProfile;
            return this;
        }
        public AuthenticationProfileMethodLdap build() {
            final var _resultValue = new AuthenticationProfileMethodLdap();
            _resultValue.loginAttribute = loginAttribute;
            _resultValue.passwdExpDays = passwdExpDays;
            _resultValue.serverProfile = serverProfile;
            return _resultValue;
        }
    }
}
