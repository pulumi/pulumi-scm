// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AuthenticationProfileMultiFactorAuth {
    /**
     * @return The Factors param.
     * 
     */
    private @Nullable List<String> factors;
    /**
     * @return The MfaEnable param.
     * 
     */
    private @Nullable Boolean mfaEnable;

    private AuthenticationProfileMultiFactorAuth() {}
    /**
     * @return The Factors param.
     * 
     */
    public List<String> factors() {
        return this.factors == null ? List.of() : this.factors;
    }
    /**
     * @return The MfaEnable param.
     * 
     */
    public Optional<Boolean> mfaEnable() {
        return Optional.ofNullable(this.mfaEnable);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthenticationProfileMultiFactorAuth defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> factors;
        private @Nullable Boolean mfaEnable;
        public Builder() {}
        public Builder(AuthenticationProfileMultiFactorAuth defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.factors = defaults.factors;
    	      this.mfaEnable = defaults.mfaEnable;
        }

        @CustomType.Setter
        public Builder factors(@Nullable List<String> factors) {

            this.factors = factors;
            return this;
        }
        public Builder factors(String... factors) {
            return factors(List.of(factors));
        }
        @CustomType.Setter
        public Builder mfaEnable(@Nullable Boolean mfaEnable) {

            this.mfaEnable = mfaEnable;
            return this;
        }
        public AuthenticationProfileMultiFactorAuth build() {
            final var _resultValue = new AuthenticationProfileMultiFactorAuth();
            _resultValue.factors = factors;
            _resultValue.mfaEnable = mfaEnable;
            return _resultValue;
        }
    }
}
