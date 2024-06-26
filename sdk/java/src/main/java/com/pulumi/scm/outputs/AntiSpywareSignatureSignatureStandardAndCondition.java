// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.scm.outputs.AntiSpywareSignatureSignatureStandardAndConditionOrCondition;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AntiSpywareSignatureSignatureStandardAndCondition {
    /**
     * @return The Name param.
     * 
     */
    private @Nullable String name;
    /**
     * @return The OrConditions param.
     * 
     */
    private @Nullable List<AntiSpywareSignatureSignatureStandardAndConditionOrCondition> orConditions;

    private AntiSpywareSignatureSignatureStandardAndCondition() {}
    /**
     * @return The Name param.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The OrConditions param.
     * 
     */
    public List<AntiSpywareSignatureSignatureStandardAndConditionOrCondition> orConditions() {
        return this.orConditions == null ? List.of() : this.orConditions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AntiSpywareSignatureSignatureStandardAndCondition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String name;
        private @Nullable List<AntiSpywareSignatureSignatureStandardAndConditionOrCondition> orConditions;
        public Builder() {}
        public Builder(AntiSpywareSignatureSignatureStandardAndCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.orConditions = defaults.orConditions;
        }

        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder orConditions(@Nullable List<AntiSpywareSignatureSignatureStandardAndConditionOrCondition> orConditions) {

            this.orConditions = orConditions;
            return this;
        }
        public Builder orConditions(AntiSpywareSignatureSignatureStandardAndConditionOrCondition... orConditions) {
            return orConditions(List.of(orConditions));
        }
        public AntiSpywareSignatureSignatureStandardAndCondition build() {
            final var _resultValue = new AntiSpywareSignatureSignatureStandardAndCondition();
            _resultValue.name = name;
            _resultValue.orConditions = orConditions;
            return _resultValue;
        }
    }
}
