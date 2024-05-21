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
public final class RadiusServerProfileProtocolEapTtlsWithPap {
    /**
     * @return The AnonOuterId param.
     * 
     */
    private @Nullable Boolean anonOuterId;
    /**
     * @return The RadiusCertProfile param.
     * 
     */
    private @Nullable String radiusCertProfile;

    private RadiusServerProfileProtocolEapTtlsWithPap() {}
    /**
     * @return The AnonOuterId param.
     * 
     */
    public Optional<Boolean> anonOuterId() {
        return Optional.ofNullable(this.anonOuterId);
    }
    /**
     * @return The RadiusCertProfile param.
     * 
     */
    public Optional<String> radiusCertProfile() {
        return Optional.ofNullable(this.radiusCertProfile);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RadiusServerProfileProtocolEapTtlsWithPap defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean anonOuterId;
        private @Nullable String radiusCertProfile;
        public Builder() {}
        public Builder(RadiusServerProfileProtocolEapTtlsWithPap defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.anonOuterId = defaults.anonOuterId;
    	      this.radiusCertProfile = defaults.radiusCertProfile;
        }

        @CustomType.Setter
        public Builder anonOuterId(@Nullable Boolean anonOuterId) {

            this.anonOuterId = anonOuterId;
            return this;
        }
        @CustomType.Setter
        public Builder radiusCertProfile(@Nullable String radiusCertProfile) {

            this.radiusCertProfile = radiusCertProfile;
            return this;
        }
        public RadiusServerProfileProtocolEapTtlsWithPap build() {
            final var _resultValue = new RadiusServerProfileProtocolEapTtlsWithPap();
            _resultValue.anonOuterId = anonOuterId;
            _resultValue.radiusCertProfile = radiusCertProfile;
            return _resultValue;
        }
    }
}
