// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetScepProfileScepChallengeDynamicChallenge {
    /**
     * @return The OtpServerUrl param. String length must not exceed 255 characters.
     * 
     */
    private String otpServerUrl;
    /**
     * @return The Password param. String length must not exceed 255 characters.
     * 
     */
    private String password;
    /**
     * @return The Username param. String length must not exceed 255 characters.
     * 
     */
    private String username;

    private GetScepProfileScepChallengeDynamicChallenge() {}
    /**
     * @return The OtpServerUrl param. String length must not exceed 255 characters.
     * 
     */
    public String otpServerUrl() {
        return this.otpServerUrl;
    }
    /**
     * @return The Password param. String length must not exceed 255 characters.
     * 
     */
    public String password() {
        return this.password;
    }
    /**
     * @return The Username param. String length must not exceed 255 characters.
     * 
     */
    public String username() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetScepProfileScepChallengeDynamicChallenge defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String otpServerUrl;
        private String password;
        private String username;
        public Builder() {}
        public Builder(GetScepProfileScepChallengeDynamicChallenge defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.otpServerUrl = defaults.otpServerUrl;
    	      this.password = defaults.password;
    	      this.username = defaults.username;
        }

        @CustomType.Setter
        public Builder otpServerUrl(String otpServerUrl) {
            if (otpServerUrl == null) {
              throw new MissingRequiredPropertyException("GetScepProfileScepChallengeDynamicChallenge", "otpServerUrl");
            }
            this.otpServerUrl = otpServerUrl;
            return this;
        }
        @CustomType.Setter
        public Builder password(String password) {
            if (password == null) {
              throw new MissingRequiredPropertyException("GetScepProfileScepChallengeDynamicChallenge", "password");
            }
            this.password = password;
            return this;
        }
        @CustomType.Setter
        public Builder username(String username) {
            if (username == null) {
              throw new MissingRequiredPropertyException("GetScepProfileScepChallengeDynamicChallenge", "username");
            }
            this.username = username;
            return this;
        }
        public GetScepProfileScepChallengeDynamicChallenge build() {
            final var _resultValue = new GetScepProfileScepChallengeDynamicChallenge();
            _resultValue.otpServerUrl = otpServerUrl;
            _resultValue.password = password;
            _resultValue.username = username;
            return _resultValue;
        }
    }
}