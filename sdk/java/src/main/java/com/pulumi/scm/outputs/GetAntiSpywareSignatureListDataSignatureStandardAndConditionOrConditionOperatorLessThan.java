// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.outputs.GetAntiSpywareSignatureListDataSignatureStandardAndConditionOrConditionOperatorLessThanQualifier;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAntiSpywareSignatureListDataSignatureStandardAndConditionOrConditionOperatorLessThan {
    /**
     * @return The Context param.
     * 
     */
    private String context;
    /**
     * @return The Qualifiers param.
     * 
     */
    private List<GetAntiSpywareSignatureListDataSignatureStandardAndConditionOrConditionOperatorLessThanQualifier> qualifiers;
    /**
     * @return The Value param. Value must be between 0 and 4294967295.
     * 
     */
    private Integer value;

    private GetAntiSpywareSignatureListDataSignatureStandardAndConditionOrConditionOperatorLessThan() {}
    /**
     * @return The Context param.
     * 
     */
    public String context() {
        return this.context;
    }
    /**
     * @return The Qualifiers param.
     * 
     */
    public List<GetAntiSpywareSignatureListDataSignatureStandardAndConditionOrConditionOperatorLessThanQualifier> qualifiers() {
        return this.qualifiers;
    }
    /**
     * @return The Value param. Value must be between 0 and 4294967295.
     * 
     */
    public Integer value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAntiSpywareSignatureListDataSignatureStandardAndConditionOrConditionOperatorLessThan defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String context;
        private List<GetAntiSpywareSignatureListDataSignatureStandardAndConditionOrConditionOperatorLessThanQualifier> qualifiers;
        private Integer value;
        public Builder() {}
        public Builder(GetAntiSpywareSignatureListDataSignatureStandardAndConditionOrConditionOperatorLessThan defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.context = defaults.context;
    	      this.qualifiers = defaults.qualifiers;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder context(String context) {
            if (context == null) {
              throw new MissingRequiredPropertyException("GetAntiSpywareSignatureListDataSignatureStandardAndConditionOrConditionOperatorLessThan", "context");
            }
            this.context = context;
            return this;
        }
        @CustomType.Setter
        public Builder qualifiers(List<GetAntiSpywareSignatureListDataSignatureStandardAndConditionOrConditionOperatorLessThanQualifier> qualifiers) {
            if (qualifiers == null) {
              throw new MissingRequiredPropertyException("GetAntiSpywareSignatureListDataSignatureStandardAndConditionOrConditionOperatorLessThan", "qualifiers");
            }
            this.qualifiers = qualifiers;
            return this;
        }
        public Builder qualifiers(GetAntiSpywareSignatureListDataSignatureStandardAndConditionOrConditionOperatorLessThanQualifier... qualifiers) {
            return qualifiers(List.of(qualifiers));
        }
        @CustomType.Setter
        public Builder value(Integer value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("GetAntiSpywareSignatureListDataSignatureStandardAndConditionOrConditionOperatorLessThan", "value");
            }
            this.value = value;
            return this;
        }
        public GetAntiSpywareSignatureListDataSignatureStandardAndConditionOrConditionOperatorLessThan build() {
            final var _resultValue = new GetAntiSpywareSignatureListDataSignatureStandardAndConditionOrConditionOperatorLessThan();
            _resultValue.context = context;
            _resultValue.qualifiers = qualifiers;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
