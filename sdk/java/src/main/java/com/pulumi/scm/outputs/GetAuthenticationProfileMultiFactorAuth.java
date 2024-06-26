// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAuthenticationProfileMultiFactorAuth {
    /**
     * @return The Factors param.
     * 
     */
    private List<String> factors;
    /**
     * @return The MfaEnable param.
     * 
     */
    private Boolean mfaEnable;

    private GetAuthenticationProfileMultiFactorAuth() {}
    /**
     * @return The Factors param.
     * 
     */
    public List<String> factors() {
        return this.factors;
    }
    /**
     * @return The MfaEnable param.
     * 
     */
    public Boolean mfaEnable() {
        return this.mfaEnable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAuthenticationProfileMultiFactorAuth defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> factors;
        private Boolean mfaEnable;
        public Builder() {}
        public Builder(GetAuthenticationProfileMultiFactorAuth defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.factors = defaults.factors;
    	      this.mfaEnable = defaults.mfaEnable;
        }

        @CustomType.Setter
        public Builder factors(List<String> factors) {
            if (factors == null) {
              throw new MissingRequiredPropertyException("GetAuthenticationProfileMultiFactorAuth", "factors");
            }
            this.factors = factors;
            return this;
        }
        public Builder factors(String... factors) {
            return factors(List.of(factors));
        }
        @CustomType.Setter
        public Builder mfaEnable(Boolean mfaEnable) {
            if (mfaEnable == null) {
              throw new MissingRequiredPropertyException("GetAuthenticationProfileMultiFactorAuth", "mfaEnable");
            }
            this.mfaEnable = mfaEnable;
            return this;
        }
        public GetAuthenticationProfileMultiFactorAuth build() {
            final var _resultValue = new GetAuthenticationProfileMultiFactorAuth();
            _resultValue.factors = factors;
            _resultValue.mfaEnable = mfaEnable;
            return _resultValue;
        }
    }
}
