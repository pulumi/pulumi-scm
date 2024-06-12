// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.outputs.GetQosPolicyRuleListDataDscpTosCodepointTypeAf;
import com.pulumi.scm.outputs.GetQosPolicyRuleListDataDscpTosCodepointTypeCs;
import com.pulumi.scm.outputs.GetQosPolicyRuleListDataDscpTosCodepointTypeCustom;
import com.pulumi.scm.outputs.GetQosPolicyRuleListDataDscpTosCodepointTypeTos;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GetQosPolicyRuleListDataDscpTosCodepointType {
    /**
     * @return The Af param.
     * 
     */
    private GetQosPolicyRuleListDataDscpTosCodepointTypeAf af;
    /**
     * @return The Cs param.
     * 
     */
    private GetQosPolicyRuleListDataDscpTosCodepointTypeCs cs;
    /**
     * @return The Custom param.
     * 
     */
    private GetQosPolicyRuleListDataDscpTosCodepointTypeCustom custom;
    /**
     * @return The Ef param.
     * 
     */
    private Boolean ef;
    /**
     * @return The Tos param.
     * 
     */
    private GetQosPolicyRuleListDataDscpTosCodepointTypeTos tos;

    private GetQosPolicyRuleListDataDscpTosCodepointType() {}
    /**
     * @return The Af param.
     * 
     */
    public GetQosPolicyRuleListDataDscpTosCodepointTypeAf af() {
        return this.af;
    }
    /**
     * @return The Cs param.
     * 
     */
    public GetQosPolicyRuleListDataDscpTosCodepointTypeCs cs() {
        return this.cs;
    }
    /**
     * @return The Custom param.
     * 
     */
    public GetQosPolicyRuleListDataDscpTosCodepointTypeCustom custom() {
        return this.custom;
    }
    /**
     * @return The Ef param.
     * 
     */
    public Boolean ef() {
        return this.ef;
    }
    /**
     * @return The Tos param.
     * 
     */
    public GetQosPolicyRuleListDataDscpTosCodepointTypeTos tos() {
        return this.tos;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetQosPolicyRuleListDataDscpTosCodepointType defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetQosPolicyRuleListDataDscpTosCodepointTypeAf af;
        private GetQosPolicyRuleListDataDscpTosCodepointTypeCs cs;
        private GetQosPolicyRuleListDataDscpTosCodepointTypeCustom custom;
        private Boolean ef;
        private GetQosPolicyRuleListDataDscpTosCodepointTypeTos tos;
        public Builder() {}
        public Builder(GetQosPolicyRuleListDataDscpTosCodepointType defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.af = defaults.af;
    	      this.cs = defaults.cs;
    	      this.custom = defaults.custom;
    	      this.ef = defaults.ef;
    	      this.tos = defaults.tos;
        }

        @CustomType.Setter
        public Builder af(GetQosPolicyRuleListDataDscpTosCodepointTypeAf af) {
            if (af == null) {
              throw new MissingRequiredPropertyException("GetQosPolicyRuleListDataDscpTosCodepointType", "af");
            }
            this.af = af;
            return this;
        }
        @CustomType.Setter
        public Builder cs(GetQosPolicyRuleListDataDscpTosCodepointTypeCs cs) {
            if (cs == null) {
              throw new MissingRequiredPropertyException("GetQosPolicyRuleListDataDscpTosCodepointType", "cs");
            }
            this.cs = cs;
            return this;
        }
        @CustomType.Setter
        public Builder custom(GetQosPolicyRuleListDataDscpTosCodepointTypeCustom custom) {
            if (custom == null) {
              throw new MissingRequiredPropertyException("GetQosPolicyRuleListDataDscpTosCodepointType", "custom");
            }
            this.custom = custom;
            return this;
        }
        @CustomType.Setter
        public Builder ef(Boolean ef) {
            if (ef == null) {
              throw new MissingRequiredPropertyException("GetQosPolicyRuleListDataDscpTosCodepointType", "ef");
            }
            this.ef = ef;
            return this;
        }
        @CustomType.Setter
        public Builder tos(GetQosPolicyRuleListDataDscpTosCodepointTypeTos tos) {
            if (tos == null) {
              throw new MissingRequiredPropertyException("GetQosPolicyRuleListDataDscpTosCodepointType", "tos");
            }
            this.tos = tos;
            return this;
        }
        public GetQosPolicyRuleListDataDscpTosCodepointType build() {
            final var _resultValue = new GetQosPolicyRuleListDataDscpTosCodepointType();
            _resultValue.af = af;
            _resultValue.cs = cs;
            _resultValue.custom = custom;
            _resultValue.ef = ef;
            _resultValue.tos = tos;
            return _resultValue;
        }
    }
}