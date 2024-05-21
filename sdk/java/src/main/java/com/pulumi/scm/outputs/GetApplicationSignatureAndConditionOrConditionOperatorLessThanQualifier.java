// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetApplicationSignatureAndConditionOrConditionOperatorLessThanQualifier {
    /**
     * @return Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
     * 
     */
    private String name;
    /**
     * @return The Value param.
     * 
     */
    private String value;

    private GetApplicationSignatureAndConditionOrConditionOperatorLessThanQualifier() {}
    /**
     * @return Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The Value param.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplicationSignatureAndConditionOrConditionOperatorLessThanQualifier defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String value;
        public Builder() {}
        public Builder(GetApplicationSignatureAndConditionOrConditionOperatorLessThanQualifier defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetApplicationSignatureAndConditionOrConditionOperatorLessThanQualifier", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("GetApplicationSignatureAndConditionOrConditionOperatorLessThanQualifier", "value");
            }
            this.value = value;
            return this;
        }
        public GetApplicationSignatureAndConditionOrConditionOperatorLessThanQualifier build() {
            final var _resultValue = new GetApplicationSignatureAndConditionOrConditionOperatorLessThanQualifier();
            _resultValue.name = name;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
