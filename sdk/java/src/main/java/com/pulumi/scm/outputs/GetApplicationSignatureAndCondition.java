// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.outputs.GetApplicationSignatureAndConditionOrCondition;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetApplicationSignatureAndCondition {
    /**
     * @return Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
     * 
     */
    private String name;
    /**
     * @return The OrConditions param.
     * 
     */
    private List<GetApplicationSignatureAndConditionOrCondition> orConditions;

    private GetApplicationSignatureAndCondition() {}
    /**
     * @return Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The OrConditions param.
     * 
     */
    public List<GetApplicationSignatureAndConditionOrCondition> orConditions() {
        return this.orConditions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplicationSignatureAndCondition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private List<GetApplicationSignatureAndConditionOrCondition> orConditions;
        public Builder() {}
        public Builder(GetApplicationSignatureAndCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.orConditions = defaults.orConditions;
        }

        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetApplicationSignatureAndCondition", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder orConditions(List<GetApplicationSignatureAndConditionOrCondition> orConditions) {
            if (orConditions == null) {
              throw new MissingRequiredPropertyException("GetApplicationSignatureAndCondition", "orConditions");
            }
            this.orConditions = orConditions;
            return this;
        }
        public Builder orConditions(GetApplicationSignatureAndConditionOrCondition... orConditions) {
            return orConditions(List.of(orConditions));
        }
        public GetApplicationSignatureAndCondition build() {
            final var _resultValue = new GetApplicationSignatureAndCondition();
            _resultValue.name = name;
            _resultValue.orConditions = orConditions;
            return _resultValue;
        }
    }
}