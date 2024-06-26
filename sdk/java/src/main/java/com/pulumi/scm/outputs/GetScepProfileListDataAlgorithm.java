// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.outputs.GetScepProfileListDataAlgorithmRsa;
import java.util.Objects;

@CustomType
public final class GetScepProfileListDataAlgorithm {
    /**
     * @return The Rsa param.
     * 
     */
    private GetScepProfileListDataAlgorithmRsa rsa;

    private GetScepProfileListDataAlgorithm() {}
    /**
     * @return The Rsa param.
     * 
     */
    public GetScepProfileListDataAlgorithmRsa rsa() {
        return this.rsa;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetScepProfileListDataAlgorithm defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetScepProfileListDataAlgorithmRsa rsa;
        public Builder() {}
        public Builder(GetScepProfileListDataAlgorithm defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rsa = defaults.rsa;
        }

        @CustomType.Setter
        public Builder rsa(GetScepProfileListDataAlgorithmRsa rsa) {
            if (rsa == null) {
              throw new MissingRequiredPropertyException("GetScepProfileListDataAlgorithm", "rsa");
            }
            this.rsa = rsa;
            return this;
        }
        public GetScepProfileListDataAlgorithm build() {
            final var _resultValue = new GetScepProfileListDataAlgorithm();
            _resultValue.rsa = rsa;
            return _resultValue;
        }
    }
}
