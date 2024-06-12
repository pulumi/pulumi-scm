// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IpsecTunnelAutoKeyIkeGateway {
    /**
     * @return The Name param.
     * 
     */
    private @Nullable String name;

    private IpsecTunnelAutoKeyIkeGateway() {}
    /**
     * @return The Name param.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IpsecTunnelAutoKeyIkeGateway defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String name;
        public Builder() {}
        public Builder(IpsecTunnelAutoKeyIkeGateway defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        public IpsecTunnelAutoKeyIkeGateway build() {
            final var _resultValue = new IpsecTunnelAutoKeyIkeGateway();
            _resultValue.name = name;
            return _resultValue;
        }
    }
}