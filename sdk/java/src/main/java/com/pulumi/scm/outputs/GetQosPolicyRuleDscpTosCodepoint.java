// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.outputs.GetQosPolicyRuleDscpTosCodepointType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetQosPolicyRuleDscpTosCodepoint {
    /**
     * @return The Name param.
     * 
     */
    private String name;
    /**
     * @return The Type param.
     * 
     */
    private GetQosPolicyRuleDscpTosCodepointType type;

    private GetQosPolicyRuleDscpTosCodepoint() {}
    /**
     * @return The Name param.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The Type param.
     * 
     */
    public GetQosPolicyRuleDscpTosCodepointType type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetQosPolicyRuleDscpTosCodepoint defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private GetQosPolicyRuleDscpTosCodepointType type;
        public Builder() {}
        public Builder(GetQosPolicyRuleDscpTosCodepoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetQosPolicyRuleDscpTosCodepoint", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder type(GetQosPolicyRuleDscpTosCodepointType type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetQosPolicyRuleDscpTosCodepoint", "type");
            }
            this.type = type;
            return this;
        }
        public GetQosPolicyRuleDscpTosCodepoint build() {
            final var _resultValue = new GetQosPolicyRuleDscpTosCodepoint();
            _resultValue.name = name;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
