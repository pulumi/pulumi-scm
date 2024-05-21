// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetRadiusServerProfileListDataProtocolPeapWithGtc {
    /**
     * @return The AnonOuterId param.
     * 
     */
    private Boolean anonOuterId;
    /**
     * @return The RadiusCertProfile param.
     * 
     */
    private String radiusCertProfile;

    private GetRadiusServerProfileListDataProtocolPeapWithGtc() {}
    /**
     * @return The AnonOuterId param.
     * 
     */
    public Boolean anonOuterId() {
        return this.anonOuterId;
    }
    /**
     * @return The RadiusCertProfile param.
     * 
     */
    public String radiusCertProfile() {
        return this.radiusCertProfile;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRadiusServerProfileListDataProtocolPeapWithGtc defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean anonOuterId;
        private String radiusCertProfile;
        public Builder() {}
        public Builder(GetRadiusServerProfileListDataProtocolPeapWithGtc defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.anonOuterId = defaults.anonOuterId;
    	      this.radiusCertProfile = defaults.radiusCertProfile;
        }

        @CustomType.Setter
        public Builder anonOuterId(Boolean anonOuterId) {
            if (anonOuterId == null) {
              throw new MissingRequiredPropertyException("GetRadiusServerProfileListDataProtocolPeapWithGtc", "anonOuterId");
            }
            this.anonOuterId = anonOuterId;
            return this;
        }
        @CustomType.Setter
        public Builder radiusCertProfile(String radiusCertProfile) {
            if (radiusCertProfile == null) {
              throw new MissingRequiredPropertyException("GetRadiusServerProfileListDataProtocolPeapWithGtc", "radiusCertProfile");
            }
            this.radiusCertProfile = radiusCertProfile;
            return this;
        }
        public GetRadiusServerProfileListDataProtocolPeapWithGtc build() {
            final var _resultValue = new GetRadiusServerProfileListDataProtocolPeapWithGtc();
            _resultValue.anonOuterId = anonOuterId;
            _resultValue.radiusCertProfile = radiusCertProfile;
            return _resultValue;
        }
    }
}
