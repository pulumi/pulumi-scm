// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.outputs.GetQosPolicyRuleListDataDscpTosCodepointTypeCustomCodepoint;
import java.util.Objects;

@CustomType
public final class GetQosPolicyRuleListDataDscpTosCodepointTypeCustom {
    /**
     * @return The Codepoint param.
     * 
     */
    private GetQosPolicyRuleListDataDscpTosCodepointTypeCustomCodepoint codepoint;

    private GetQosPolicyRuleListDataDscpTosCodepointTypeCustom() {}
    /**
     * @return The Codepoint param.
     * 
     */
    public GetQosPolicyRuleListDataDscpTosCodepointTypeCustomCodepoint codepoint() {
        return this.codepoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetQosPolicyRuleListDataDscpTosCodepointTypeCustom defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetQosPolicyRuleListDataDscpTosCodepointTypeCustomCodepoint codepoint;
        public Builder() {}
        public Builder(GetQosPolicyRuleListDataDscpTosCodepointTypeCustom defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.codepoint = defaults.codepoint;
        }

        @CustomType.Setter
        public Builder codepoint(GetQosPolicyRuleListDataDscpTosCodepointTypeCustomCodepoint codepoint) {
            if (codepoint == null) {
              throw new MissingRequiredPropertyException("GetQosPolicyRuleListDataDscpTosCodepointTypeCustom", "codepoint");
            }
            this.codepoint = codepoint;
            return this;
        }
        public GetQosPolicyRuleListDataDscpTosCodepointTypeCustom build() {
            final var _resultValue = new GetQosPolicyRuleListDataDscpTosCodepointTypeCustom();
            _resultValue.codepoint = codepoint;
            return _resultValue;
        }
    }
}
