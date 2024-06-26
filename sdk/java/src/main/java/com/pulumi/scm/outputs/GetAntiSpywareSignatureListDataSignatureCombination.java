// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.outputs.GetAntiSpywareSignatureListDataSignatureCombinationAndCondition;
import com.pulumi.scm.outputs.GetAntiSpywareSignatureListDataSignatureCombinationTimeAttribute;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAntiSpywareSignatureListDataSignatureCombination {
    /**
     * @return The AndConditions param.
     * 
     */
    private List<GetAntiSpywareSignatureListDataSignatureCombinationAndCondition> andConditions;
    /**
     * @return The OrderFree param. Default: `false`.
     * 
     */
    private Boolean orderFree;
    /**
     * @return The TimeAttribute param.
     * 
     */
    private GetAntiSpywareSignatureListDataSignatureCombinationTimeAttribute timeAttribute;

    private GetAntiSpywareSignatureListDataSignatureCombination() {}
    /**
     * @return The AndConditions param.
     * 
     */
    public List<GetAntiSpywareSignatureListDataSignatureCombinationAndCondition> andConditions() {
        return this.andConditions;
    }
    /**
     * @return The OrderFree param. Default: `false`.
     * 
     */
    public Boolean orderFree() {
        return this.orderFree;
    }
    /**
     * @return The TimeAttribute param.
     * 
     */
    public GetAntiSpywareSignatureListDataSignatureCombinationTimeAttribute timeAttribute() {
        return this.timeAttribute;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAntiSpywareSignatureListDataSignatureCombination defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetAntiSpywareSignatureListDataSignatureCombinationAndCondition> andConditions;
        private Boolean orderFree;
        private GetAntiSpywareSignatureListDataSignatureCombinationTimeAttribute timeAttribute;
        public Builder() {}
        public Builder(GetAntiSpywareSignatureListDataSignatureCombination defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.andConditions = defaults.andConditions;
    	      this.orderFree = defaults.orderFree;
    	      this.timeAttribute = defaults.timeAttribute;
        }

        @CustomType.Setter
        public Builder andConditions(List<GetAntiSpywareSignatureListDataSignatureCombinationAndCondition> andConditions) {
            if (andConditions == null) {
              throw new MissingRequiredPropertyException("GetAntiSpywareSignatureListDataSignatureCombination", "andConditions");
            }
            this.andConditions = andConditions;
            return this;
        }
        public Builder andConditions(GetAntiSpywareSignatureListDataSignatureCombinationAndCondition... andConditions) {
            return andConditions(List.of(andConditions));
        }
        @CustomType.Setter
        public Builder orderFree(Boolean orderFree) {
            if (orderFree == null) {
              throw new MissingRequiredPropertyException("GetAntiSpywareSignatureListDataSignatureCombination", "orderFree");
            }
            this.orderFree = orderFree;
            return this;
        }
        @CustomType.Setter
        public Builder timeAttribute(GetAntiSpywareSignatureListDataSignatureCombinationTimeAttribute timeAttribute) {
            if (timeAttribute == null) {
              throw new MissingRequiredPropertyException("GetAntiSpywareSignatureListDataSignatureCombination", "timeAttribute");
            }
            this.timeAttribute = timeAttribute;
            return this;
        }
        public GetAntiSpywareSignatureListDataSignatureCombination build() {
            final var _resultValue = new GetAntiSpywareSignatureListDataSignatureCombination();
            _resultValue.andConditions = andConditions;
            _resultValue.orderFree = orderFree;
            _resultValue.timeAttribute = timeAttribute;
            return _resultValue;
        }
    }
}
