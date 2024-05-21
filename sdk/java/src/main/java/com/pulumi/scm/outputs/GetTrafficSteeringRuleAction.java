// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.outputs.GetTrafficSteeringRuleActionForward;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GetTrafficSteeringRuleAction {
    /**
     * @return The Forward param.
     * 
     */
    private GetTrafficSteeringRuleActionForward forward;
    /**
     * @return The NoPbf param.
     * 
     */
    private Boolean noPbf;

    private GetTrafficSteeringRuleAction() {}
    /**
     * @return The Forward param.
     * 
     */
    public GetTrafficSteeringRuleActionForward forward() {
        return this.forward;
    }
    /**
     * @return The NoPbf param.
     * 
     */
    public Boolean noPbf() {
        return this.noPbf;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTrafficSteeringRuleAction defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetTrafficSteeringRuleActionForward forward;
        private Boolean noPbf;
        public Builder() {}
        public Builder(GetTrafficSteeringRuleAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.forward = defaults.forward;
    	      this.noPbf = defaults.noPbf;
        }

        @CustomType.Setter
        public Builder forward(GetTrafficSteeringRuleActionForward forward) {
            if (forward == null) {
              throw new MissingRequiredPropertyException("GetTrafficSteeringRuleAction", "forward");
            }
            this.forward = forward;
            return this;
        }
        @CustomType.Setter
        public Builder noPbf(Boolean noPbf) {
            if (noPbf == null) {
              throw new MissingRequiredPropertyException("GetTrafficSteeringRuleAction", "noPbf");
            }
            this.noPbf = noPbf;
            return this;
        }
        public GetTrafficSteeringRuleAction build() {
            final var _resultValue = new GetTrafficSteeringRuleAction();
            _resultValue.forward = forward;
            _resultValue.noPbf = noPbf;
            return _resultValue;
        }
    }
}
