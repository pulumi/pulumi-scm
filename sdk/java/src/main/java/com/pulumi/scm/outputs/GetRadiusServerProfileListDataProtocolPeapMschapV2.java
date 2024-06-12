// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetRadiusServerProfileListDataProtocolPeapMschapV2 {
    /**
     * @return The AllowPwdChange param.
     * 
     */
    private Boolean allowPwdChange;
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

    private GetRadiusServerProfileListDataProtocolPeapMschapV2() {}
    /**
     * @return The AllowPwdChange param.
     * 
     */
    public Boolean allowPwdChange() {
        return this.allowPwdChange;
    }
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

    public static Builder builder(GetRadiusServerProfileListDataProtocolPeapMschapV2 defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean allowPwdChange;
        private Boolean anonOuterId;
        private String radiusCertProfile;
        public Builder() {}
        public Builder(GetRadiusServerProfileListDataProtocolPeapMschapV2 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowPwdChange = defaults.allowPwdChange;
    	      this.anonOuterId = defaults.anonOuterId;
    	      this.radiusCertProfile = defaults.radiusCertProfile;
        }

        @CustomType.Setter
        public Builder allowPwdChange(Boolean allowPwdChange) {
            if (allowPwdChange == null) {
              throw new MissingRequiredPropertyException("GetRadiusServerProfileListDataProtocolPeapMschapV2", "allowPwdChange");
            }
            this.allowPwdChange = allowPwdChange;
            return this;
        }
        @CustomType.Setter
        public Builder anonOuterId(Boolean anonOuterId) {
            if (anonOuterId == null) {
              throw new MissingRequiredPropertyException("GetRadiusServerProfileListDataProtocolPeapMschapV2", "anonOuterId");
            }
            this.anonOuterId = anonOuterId;
            return this;
        }
        @CustomType.Setter
        public Builder radiusCertProfile(String radiusCertProfile) {
            if (radiusCertProfile == null) {
              throw new MissingRequiredPropertyException("GetRadiusServerProfileListDataProtocolPeapMschapV2", "radiusCertProfile");
            }
            this.radiusCertProfile = radiusCertProfile;
            return this;
        }
        public GetRadiusServerProfileListDataProtocolPeapMschapV2 build() {
            final var _resultValue = new GetRadiusServerProfileListDataProtocolPeapMschapV2();
            _resultValue.allowPwdChange = allowPwdChange;
            _resultValue.anonOuterId = anonOuterId;
            _resultValue.radiusCertProfile = radiusCertProfile;
            return _resultValue;
        }
    }
}