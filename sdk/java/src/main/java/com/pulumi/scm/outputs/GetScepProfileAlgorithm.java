// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.outputs.GetScepProfileAlgorithmRsa;
import java.util.Objects;

@CustomType
public final class GetScepProfileAlgorithm {
    /**
     * @return The Rsa param.
     * 
     */
    private GetScepProfileAlgorithmRsa rsa;

    private GetScepProfileAlgorithm() {}
    /**
     * @return The Rsa param.
     * 
     */
    public GetScepProfileAlgorithmRsa rsa() {
        return this.rsa;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetScepProfileAlgorithm defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetScepProfileAlgorithmRsa rsa;
        public Builder() {}
        public Builder(GetScepProfileAlgorithm defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rsa = defaults.rsa;
        }

        @CustomType.Setter
        public Builder rsa(GetScepProfileAlgorithmRsa rsa) {
            if (rsa == null) {
              throw new MissingRequiredPropertyException("GetScepProfileAlgorithm", "rsa");
            }
            this.rsa = rsa;
            return this;
        }
        public GetScepProfileAlgorithm build() {
            final var _resultValue = new GetScepProfileAlgorithm();
            _resultValue.rsa = rsa;
            return _resultValue;
        }
    }
}
