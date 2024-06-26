// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.outputs.GetAntiSpywareSignatureSignatureStandardAndConditionOrCondition;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAntiSpywareSignatureSignatureStandardAndCondition {
    /**
     * @return The Name param.
     * 
     */
    private String name;
    /**
     * @return The OrConditions param.
     * 
     */
    private List<GetAntiSpywareSignatureSignatureStandardAndConditionOrCondition> orConditions;

    private GetAntiSpywareSignatureSignatureStandardAndCondition() {}
    /**
     * @return The Name param.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The OrConditions param.
     * 
     */
    public List<GetAntiSpywareSignatureSignatureStandardAndConditionOrCondition> orConditions() {
        return this.orConditions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAntiSpywareSignatureSignatureStandardAndCondition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private List<GetAntiSpywareSignatureSignatureStandardAndConditionOrCondition> orConditions;
        public Builder() {}
        public Builder(GetAntiSpywareSignatureSignatureStandardAndCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.orConditions = defaults.orConditions;
        }

        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetAntiSpywareSignatureSignatureStandardAndCondition", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder orConditions(List<GetAntiSpywareSignatureSignatureStandardAndConditionOrCondition> orConditions) {
            if (orConditions == null) {
              throw new MissingRequiredPropertyException("GetAntiSpywareSignatureSignatureStandardAndCondition", "orConditions");
            }
            this.orConditions = orConditions;
            return this;
        }
        public Builder orConditions(GetAntiSpywareSignatureSignatureStandardAndConditionOrCondition... orConditions) {
            return orConditions(List.of(orConditions));
        }
        public GetAntiSpywareSignatureSignatureStandardAndCondition build() {
            final var _resultValue = new GetAntiSpywareSignatureSignatureStandardAndCondition();
            _resultValue.name = name;
            _resultValue.orConditions = orConditions;
            return _resultValue;
        }
    }
}
