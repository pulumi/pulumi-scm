// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AuthenticationProfileMethodRadius {
    /**
     * @return The Checkgroup param.
     * 
     */
    private @Nullable Boolean checkgroup;
    /**
     * @return The ServerProfile param.
     * 
     */
    private @Nullable String serverProfile;

    private AuthenticationProfileMethodRadius() {}
    /**
     * @return The Checkgroup param.
     * 
     */
    public Optional<Boolean> checkgroup() {
        return Optional.ofNullable(this.checkgroup);
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

    public static Builder builder(AuthenticationProfileMethodRadius defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean checkgroup;
        private @Nullable String serverProfile;
        public Builder() {}
        public Builder(AuthenticationProfileMethodRadius defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.checkgroup = defaults.checkgroup;
    	      this.serverProfile = defaults.serverProfile;
        }

        @CustomType.Setter
        public Builder checkgroup(@Nullable Boolean checkgroup) {

            this.checkgroup = checkgroup;
            return this;
        }
        @CustomType.Setter
        public Builder serverProfile(@Nullable String serverProfile) {

            this.serverProfile = serverProfile;
            return this;
        }
        public AuthenticationProfileMethodRadius build() {
            final var _resultValue = new AuthenticationProfileMethodRadius();
            _resultValue.checkgroup = checkgroup;
            _resultValue.serverProfile = serverProfile;
            return _resultValue;
        }
    }
}
