// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetScepProfileAlgorithmRsa {
    /**
     * @return The RsaNbits param.
     * 
     */
    private String rsaNbits;

    private GetScepProfileAlgorithmRsa() {}
    /**
     * @return The RsaNbits param.
     * 
     */
    public String rsaNbits() {
        return this.rsaNbits;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetScepProfileAlgorithmRsa defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String rsaNbits;
        public Builder() {}
        public Builder(GetScepProfileAlgorithmRsa defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rsaNbits = defaults.rsaNbits;
        }

        @CustomType.Setter
        public Builder rsaNbits(String rsaNbits) {
            if (rsaNbits == null) {
              throw new MissingRequiredPropertyException("GetScepProfileAlgorithmRsa", "rsaNbits");
            }
            this.rsaNbits = rsaNbits;
            return this;
        }
        public GetScepProfileAlgorithmRsa build() {
            final var _resultValue = new GetScepProfileAlgorithmRsa();
            _resultValue.rsaNbits = rsaNbits;
            return _resultValue;
        }
    }
}
