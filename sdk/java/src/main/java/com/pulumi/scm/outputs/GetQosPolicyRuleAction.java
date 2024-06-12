// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetQosPolicyRuleAction {
    /**
     * @return The Class param.
     * 
     */
    private String class_;

    private GetQosPolicyRuleAction() {}
    /**
     * @return The Class param.
     * 
     */
    public String class_() {
        return this.class_;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetQosPolicyRuleAction defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String class_;
        public Builder() {}
        public Builder(GetQosPolicyRuleAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.class_ = defaults.class_;
        }

        @CustomType.Setter("class")
        public Builder class_(String class_) {
            if (class_ == null) {
              throw new MissingRequiredPropertyException("GetQosPolicyRuleAction", "class_");
            }
            this.class_ = class_;
            return this;
        }
        public GetQosPolicyRuleAction build() {
            final var _resultValue = new GetQosPolicyRuleAction();
            _resultValue.class_ = class_;
            return _resultValue;
        }
    }
}