// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ScepProfileAlgorithmRsa {
    /**
     * @return The RsaNbits param.
     * 
     */
    private @Nullable String rsaNbits;

    private ScepProfileAlgorithmRsa() {}
    /**
     * @return The RsaNbits param.
     * 
     */
    public Optional<String> rsaNbits() {
        return Optional.ofNullable(this.rsaNbits);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScepProfileAlgorithmRsa defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String rsaNbits;
        public Builder() {}
        public Builder(ScepProfileAlgorithmRsa defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rsaNbits = defaults.rsaNbits;
        }

        @CustomType.Setter
        public Builder rsaNbits(@Nullable String rsaNbits) {

            this.rsaNbits = rsaNbits;
            return this;
        }
        public ScepProfileAlgorithmRsa build() {
            final var _resultValue = new ScepProfileAlgorithmRsa();
            _resultValue.rsaNbits = rsaNbits;
            return _resultValue;
        }
    }
}
