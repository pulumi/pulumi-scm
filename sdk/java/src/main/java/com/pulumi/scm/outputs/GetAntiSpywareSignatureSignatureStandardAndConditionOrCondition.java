// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.outputs.GetAntiSpywareSignatureSignatureStandardAndConditionOrConditionOperator;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAntiSpywareSignatureSignatureStandardAndConditionOrCondition {
    /**
     * @return The Name param.
     * 
     */
    private String name;
    /**
     * @return The Operator param.
     * 
     */
    private GetAntiSpywareSignatureSignatureStandardAndConditionOrConditionOperator operator;

    private GetAntiSpywareSignatureSignatureStandardAndConditionOrCondition() {}
    /**
     * @return The Name param.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The Operator param.
     * 
     */
    public GetAntiSpywareSignatureSignatureStandardAndConditionOrConditionOperator operator() {
        return this.operator;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAntiSpywareSignatureSignatureStandardAndConditionOrCondition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private GetAntiSpywareSignatureSignatureStandardAndConditionOrConditionOperator operator;
        public Builder() {}
        public Builder(GetAntiSpywareSignatureSignatureStandardAndConditionOrCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.operator = defaults.operator;
        }

        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetAntiSpywareSignatureSignatureStandardAndConditionOrCondition", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder operator(GetAntiSpywareSignatureSignatureStandardAndConditionOrConditionOperator operator) {
            if (operator == null) {
              throw new MissingRequiredPropertyException("GetAntiSpywareSignatureSignatureStandardAndConditionOrCondition", "operator");
            }
            this.operator = operator;
            return this;
        }
        public GetAntiSpywareSignatureSignatureStandardAndConditionOrCondition build() {
            final var _resultValue = new GetAntiSpywareSignatureSignatureStandardAndConditionOrCondition();
            _resultValue.name = name;
            _resultValue.operator = operator;
            return _resultValue;
        }
    }
}
