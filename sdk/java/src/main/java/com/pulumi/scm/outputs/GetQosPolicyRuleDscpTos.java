// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.outputs.GetQosPolicyRuleDscpTosCodepoint;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetQosPolicyRuleDscpTos {
    /**
     * @return The Codepoints param.
     * 
     */
    private List<GetQosPolicyRuleDscpTosCodepoint> codepoints;

    private GetQosPolicyRuleDscpTos() {}
    /**
     * @return The Codepoints param.
     * 
     */
    public List<GetQosPolicyRuleDscpTosCodepoint> codepoints() {
        return this.codepoints;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetQosPolicyRuleDscpTos defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetQosPolicyRuleDscpTosCodepoint> codepoints;
        public Builder() {}
        public Builder(GetQosPolicyRuleDscpTos defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.codepoints = defaults.codepoints;
        }

        @CustomType.Setter
        public Builder codepoints(List<GetQosPolicyRuleDscpTosCodepoint> codepoints) {
            if (codepoints == null) {
              throw new MissingRequiredPropertyException("GetQosPolicyRuleDscpTos", "codepoints");
            }
            this.codepoints = codepoints;
            return this;
        }
        public Builder codepoints(GetQosPolicyRuleDscpTosCodepoint... codepoints) {
            return codepoints(List.of(codepoints));
        }
        public GetQosPolicyRuleDscpTos build() {
            final var _resultValue = new GetQosPolicyRuleDscpTos();
            _resultValue.codepoints = codepoints;
            return _resultValue;
        }
    }
}