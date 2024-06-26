// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.scm.outputs.AntiSpywareSignatureSignatureStandardAndConditionOrConditionOperatorPatternMatchQualifier;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AntiSpywareSignatureSignatureStandardAndConditionOrConditionOperatorPatternMatch {
    /**
     * @return The Context param.
     * 
     */
    private @Nullable String context;
    /**
     * @return The Negate param. Default: `false`.
     * 
     */
    private @Nullable Boolean negate;
    /**
     * @return The Pattern param.
     * 
     */
    private @Nullable String pattern;
    /**
     * @return The Qualifiers param.
     * 
     */
    private @Nullable List<AntiSpywareSignatureSignatureStandardAndConditionOrConditionOperatorPatternMatchQualifier> qualifiers;

    private AntiSpywareSignatureSignatureStandardAndConditionOrConditionOperatorPatternMatch() {}
    /**
     * @return The Context param.
     * 
     */
    public Optional<String> context() {
        return Optional.ofNullable(this.context);
    }
    /**
     * @return The Negate param. Default: `false`.
     * 
     */
    public Optional<Boolean> negate() {
        return Optional.ofNullable(this.negate);
    }
    /**
     * @return The Pattern param.
     * 
     */
    public Optional<String> pattern() {
        return Optional.ofNullable(this.pattern);
    }
    /**
     * @return The Qualifiers param.
     * 
     */
    public List<AntiSpywareSignatureSignatureStandardAndConditionOrConditionOperatorPatternMatchQualifier> qualifiers() {
        return this.qualifiers == null ? List.of() : this.qualifiers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AntiSpywareSignatureSignatureStandardAndConditionOrConditionOperatorPatternMatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String context;
        private @Nullable Boolean negate;
        private @Nullable String pattern;
        private @Nullable List<AntiSpywareSignatureSignatureStandardAndConditionOrConditionOperatorPatternMatchQualifier> qualifiers;
        public Builder() {}
        public Builder(AntiSpywareSignatureSignatureStandardAndConditionOrConditionOperatorPatternMatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.context = defaults.context;
    	      this.negate = defaults.negate;
    	      this.pattern = defaults.pattern;
    	      this.qualifiers = defaults.qualifiers;
        }

        @CustomType.Setter
        public Builder context(@Nullable String context) {

            this.context = context;
            return this;
        }
        @CustomType.Setter
        public Builder negate(@Nullable Boolean negate) {

            this.negate = negate;
            return this;
        }
        @CustomType.Setter
        public Builder pattern(@Nullable String pattern) {

            this.pattern = pattern;
            return this;
        }
        @CustomType.Setter
        public Builder qualifiers(@Nullable List<AntiSpywareSignatureSignatureStandardAndConditionOrConditionOperatorPatternMatchQualifier> qualifiers) {

            this.qualifiers = qualifiers;
            return this;
        }
        public Builder qualifiers(AntiSpywareSignatureSignatureStandardAndConditionOrConditionOperatorPatternMatchQualifier... qualifiers) {
            return qualifiers(List.of(qualifiers));
        }
        public AntiSpywareSignatureSignatureStandardAndConditionOrConditionOperatorPatternMatch build() {
            final var _resultValue = new AntiSpywareSignatureSignatureStandardAndConditionOrConditionOperatorPatternMatch();
            _resultValue.context = context;
            _resultValue.negate = negate;
            _resultValue.pattern = pattern;
            _resultValue.qualifiers = qualifiers;
            return _resultValue;
        }
    }
}
