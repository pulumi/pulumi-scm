// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.scm.outputs.ServiceConnectionProtocolBgp;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceConnectionProtocol {
    /**
     * @return The Bgp param.
     * 
     */
    private @Nullable ServiceConnectionProtocolBgp bgp;

    private ServiceConnectionProtocol() {}
    /**
     * @return The Bgp param.
     * 
     */
    public Optional<ServiceConnectionProtocolBgp> bgp() {
        return Optional.ofNullable(this.bgp);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceConnectionProtocol defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ServiceConnectionProtocolBgp bgp;
        public Builder() {}
        public Builder(ServiceConnectionProtocol defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bgp = defaults.bgp;
        }

        @CustomType.Setter
        public Builder bgp(@Nullable ServiceConnectionProtocolBgp bgp) {

            this.bgp = bgp;
            return this;
        }
        public ServiceConnectionProtocol build() {
            final var _resultValue = new ServiceConnectionProtocol();
            _resultValue.bgp = bgp;
            return _resultValue;
        }
    }
}
