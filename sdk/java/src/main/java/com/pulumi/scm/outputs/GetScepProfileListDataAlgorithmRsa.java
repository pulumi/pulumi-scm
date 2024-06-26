// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetScepProfileListDataAlgorithmRsa {
    /**
     * @return The RsaNbits param.
     * 
     */
    private String rsaNbits;

    private GetScepProfileListDataAlgorithmRsa() {}
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

    public static Builder builder(GetScepProfileListDataAlgorithmRsa defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String rsaNbits;
        public Builder() {}
        public Builder(GetScepProfileListDataAlgorithmRsa defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rsaNbits = defaults.rsaNbits;
        }

        @CustomType.Setter
        public Builder rsaNbits(String rsaNbits) {
            if (rsaNbits == null) {
              throw new MissingRequiredPropertyException("GetScepProfileListDataAlgorithmRsa", "rsaNbits");
            }
            this.rsaNbits = rsaNbits;
            return this;
        }
        public GetScepProfileListDataAlgorithmRsa build() {
            final var _resultValue = new GetScepProfileListDataAlgorithmRsa();
            _resultValue.rsaNbits = rsaNbits;
            return _resultValue;
        }
    }
}
