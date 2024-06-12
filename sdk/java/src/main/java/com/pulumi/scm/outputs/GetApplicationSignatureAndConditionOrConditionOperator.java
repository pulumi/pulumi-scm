// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.outputs.GetApplicationSignatureAndConditionOrConditionOperatorEqualTo;
import com.pulumi.scm.outputs.GetApplicationSignatureAndConditionOrConditionOperatorGreaterThan;
import com.pulumi.scm.outputs.GetApplicationSignatureAndConditionOrConditionOperatorLessThan;
import com.pulumi.scm.outputs.GetApplicationSignatureAndConditionOrConditionOperatorPatternMatch;
import java.util.Objects;

@CustomType
public final class GetApplicationSignatureAndConditionOrConditionOperator {
    /**
     * @return The EqualTo param.
     * 
     */
    private GetApplicationSignatureAndConditionOrConditionOperatorEqualTo equalTo;
    /**
     * @return The GreaterThan param.
     * 
     */
    private GetApplicationSignatureAndConditionOrConditionOperatorGreaterThan greaterThan;
    /**
     * @return The LessThan param.
     * 
     */
    private GetApplicationSignatureAndConditionOrConditionOperatorLessThan lessThan;
    /**
     * @return The PatternMatch param.
     * 
     */
    private GetApplicationSignatureAndConditionOrConditionOperatorPatternMatch patternMatch;

    private GetApplicationSignatureAndConditionOrConditionOperator() {}
    /**
     * @return The EqualTo param.
     * 
     */
    public GetApplicationSignatureAndConditionOrConditionOperatorEqualTo equalTo() {
        return this.equalTo;
    }
    /**
     * @return The GreaterThan param.
     * 
     */
    public GetApplicationSignatureAndConditionOrConditionOperatorGreaterThan greaterThan() {
        return this.greaterThan;
    }
    /**
     * @return The LessThan param.
     * 
     */
    public GetApplicationSignatureAndConditionOrConditionOperatorLessThan lessThan() {
        return this.lessThan;
    }
    /**
     * @return The PatternMatch param.
     * 
     */
    public GetApplicationSignatureAndConditionOrConditionOperatorPatternMatch patternMatch() {
        return this.patternMatch;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplicationSignatureAndConditionOrConditionOperator defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetApplicationSignatureAndConditionOrConditionOperatorEqualTo equalTo;
        private GetApplicationSignatureAndConditionOrConditionOperatorGreaterThan greaterThan;
        private GetApplicationSignatureAndConditionOrConditionOperatorLessThan lessThan;
        private GetApplicationSignatureAndConditionOrConditionOperatorPatternMatch patternMatch;
        public Builder() {}
        public Builder(GetApplicationSignatureAndConditionOrConditionOperator defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.equalTo = defaults.equalTo;
    	      this.greaterThan = defaults.greaterThan;
    	      this.lessThan = defaults.lessThan;
    	      this.patternMatch = defaults.patternMatch;
        }

        @CustomType.Setter
        public Builder equalTo(GetApplicationSignatureAndConditionOrConditionOperatorEqualTo equalTo) {
            if (equalTo == null) {
              throw new MissingRequiredPropertyException("GetApplicationSignatureAndConditionOrConditionOperator", "equalTo");
            }
            this.equalTo = equalTo;
            return this;
        }
        @CustomType.Setter
        public Builder greaterThan(GetApplicationSignatureAndConditionOrConditionOperatorGreaterThan greaterThan) {
            if (greaterThan == null) {
              throw new MissingRequiredPropertyException("GetApplicationSignatureAndConditionOrConditionOperator", "greaterThan");
            }
            this.greaterThan = greaterThan;
            return this;
        }
        @CustomType.Setter
        public Builder lessThan(GetApplicationSignatureAndConditionOrConditionOperatorLessThan lessThan) {
            if (lessThan == null) {
              throw new MissingRequiredPropertyException("GetApplicationSignatureAndConditionOrConditionOperator", "lessThan");
            }
            this.lessThan = lessThan;
            return this;
        }
        @CustomType.Setter
        public Builder patternMatch(GetApplicationSignatureAndConditionOrConditionOperatorPatternMatch patternMatch) {
            if (patternMatch == null) {
              throw new MissingRequiredPropertyException("GetApplicationSignatureAndConditionOrConditionOperator", "patternMatch");
            }
            this.patternMatch = patternMatch;
            return this;
        }
        public GetApplicationSignatureAndConditionOrConditionOperator build() {
            final var _resultValue = new GetApplicationSignatureAndConditionOrConditionOperator();
            _resultValue.equalTo = equalTo;
            _resultValue.greaterThan = greaterThan;
            _resultValue.lessThan = lessThan;
            _resultValue.patternMatch = patternMatch;
            return _resultValue;
        }
    }
}