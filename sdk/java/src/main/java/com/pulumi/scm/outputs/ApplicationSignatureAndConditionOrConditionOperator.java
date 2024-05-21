// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.scm.outputs.ApplicationSignatureAndConditionOrConditionOperatorEqualTo;
import com.pulumi.scm.outputs.ApplicationSignatureAndConditionOrConditionOperatorGreaterThan;
import com.pulumi.scm.outputs.ApplicationSignatureAndConditionOrConditionOperatorLessThan;
import com.pulumi.scm.outputs.ApplicationSignatureAndConditionOrConditionOperatorPatternMatch;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationSignatureAndConditionOrConditionOperator {
    /**
     * @return The EqualTo param. Ensure that only one of the following is specified: `equal_to`, `greater_than`, `less_than`, `pattern_match`
     * 
     */
    private @Nullable ApplicationSignatureAndConditionOrConditionOperatorEqualTo equalTo;
    /**
     * @return The GreaterThan param. Ensure that only one of the following is specified: `equal_to`, `greater_than`, `less_than`, `pattern_match`
     * 
     */
    private @Nullable ApplicationSignatureAndConditionOrConditionOperatorGreaterThan greaterThan;
    /**
     * @return The LessThan param. Ensure that only one of the following is specified: `equal_to`, `greater_than`, `less_than`, `pattern_match`
     * 
     */
    private @Nullable ApplicationSignatureAndConditionOrConditionOperatorLessThan lessThan;
    /**
     * @return The PatternMatch param. Ensure that only one of the following is specified: `equal_to`, `greater_than`, `less_than`, `pattern_match`
     * 
     */
    private @Nullable ApplicationSignatureAndConditionOrConditionOperatorPatternMatch patternMatch;

    private ApplicationSignatureAndConditionOrConditionOperator() {}
    /**
     * @return The EqualTo param. Ensure that only one of the following is specified: `equal_to`, `greater_than`, `less_than`, `pattern_match`
     * 
     */
    public Optional<ApplicationSignatureAndConditionOrConditionOperatorEqualTo> equalTo() {
        return Optional.ofNullable(this.equalTo);
    }
    /**
     * @return The GreaterThan param. Ensure that only one of the following is specified: `equal_to`, `greater_than`, `less_than`, `pattern_match`
     * 
     */
    public Optional<ApplicationSignatureAndConditionOrConditionOperatorGreaterThan> greaterThan() {
        return Optional.ofNullable(this.greaterThan);
    }
    /**
     * @return The LessThan param. Ensure that only one of the following is specified: `equal_to`, `greater_than`, `less_than`, `pattern_match`
     * 
     */
    public Optional<ApplicationSignatureAndConditionOrConditionOperatorLessThan> lessThan() {
        return Optional.ofNullable(this.lessThan);
    }
    /**
     * @return The PatternMatch param. Ensure that only one of the following is specified: `equal_to`, `greater_than`, `less_than`, `pattern_match`
     * 
     */
    public Optional<ApplicationSignatureAndConditionOrConditionOperatorPatternMatch> patternMatch() {
        return Optional.ofNullable(this.patternMatch);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationSignatureAndConditionOrConditionOperator defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ApplicationSignatureAndConditionOrConditionOperatorEqualTo equalTo;
        private @Nullable ApplicationSignatureAndConditionOrConditionOperatorGreaterThan greaterThan;
        private @Nullable ApplicationSignatureAndConditionOrConditionOperatorLessThan lessThan;
        private @Nullable ApplicationSignatureAndConditionOrConditionOperatorPatternMatch patternMatch;
        public Builder() {}
        public Builder(ApplicationSignatureAndConditionOrConditionOperator defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.equalTo = defaults.equalTo;
    	      this.greaterThan = defaults.greaterThan;
    	      this.lessThan = defaults.lessThan;
    	      this.patternMatch = defaults.patternMatch;
        }

        @CustomType.Setter
        public Builder equalTo(@Nullable ApplicationSignatureAndConditionOrConditionOperatorEqualTo equalTo) {

            this.equalTo = equalTo;
            return this;
        }
        @CustomType.Setter
        public Builder greaterThan(@Nullable ApplicationSignatureAndConditionOrConditionOperatorGreaterThan greaterThan) {

            this.greaterThan = greaterThan;
            return this;
        }
        @CustomType.Setter
        public Builder lessThan(@Nullable ApplicationSignatureAndConditionOrConditionOperatorLessThan lessThan) {

            this.lessThan = lessThan;
            return this;
        }
        @CustomType.Setter
        public Builder patternMatch(@Nullable ApplicationSignatureAndConditionOrConditionOperatorPatternMatch patternMatch) {

            this.patternMatch = patternMatch;
            return this;
        }
        public ApplicationSignatureAndConditionOrConditionOperator build() {
            final var _resultValue = new ApplicationSignatureAndConditionOrConditionOperator();
            _resultValue.equalTo = equalTo;
            _resultValue.greaterThan = greaterThan;
            _resultValue.lessThan = lessThan;
            _resultValue.patternMatch = patternMatch;
            return _resultValue;
        }
    }
}
