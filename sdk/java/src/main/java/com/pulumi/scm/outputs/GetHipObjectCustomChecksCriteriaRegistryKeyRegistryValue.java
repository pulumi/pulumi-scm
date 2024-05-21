// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetHipObjectCustomChecksCriteriaRegistryKeyRegistryValue {
    /**
     * @return Registry value name. String length must not exceed 1023 characters.
     * 
     */
    private String name;
    /**
     * @return Value does not exist or match specified value data. Default: `false`.
     * 
     */
    private Boolean negate;
    /**
     * @return Registry value data. String length must not exceed 1024 characters. String validation regex: `.*`.
     * 
     */
    private String valueData;

    private GetHipObjectCustomChecksCriteriaRegistryKeyRegistryValue() {}
    /**
     * @return Registry value name. String length must not exceed 1023 characters.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Value does not exist or match specified value data. Default: `false`.
     * 
     */
    public Boolean negate() {
        return this.negate;
    }
    /**
     * @return Registry value data. String length must not exceed 1024 characters. String validation regex: `.*`.
     * 
     */
    public String valueData() {
        return this.valueData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHipObjectCustomChecksCriteriaRegistryKeyRegistryValue defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private Boolean negate;
        private String valueData;
        public Builder() {}
        public Builder(GetHipObjectCustomChecksCriteriaRegistryKeyRegistryValue defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.negate = defaults.negate;
    	      this.valueData = defaults.valueData;
        }

        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetHipObjectCustomChecksCriteriaRegistryKeyRegistryValue", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder negate(Boolean negate) {
            if (negate == null) {
              throw new MissingRequiredPropertyException("GetHipObjectCustomChecksCriteriaRegistryKeyRegistryValue", "negate");
            }
            this.negate = negate;
            return this;
        }
        @CustomType.Setter
        public Builder valueData(String valueData) {
            if (valueData == null) {
              throw new MissingRequiredPropertyException("GetHipObjectCustomChecksCriteriaRegistryKeyRegistryValue", "valueData");
            }
            this.valueData = valueData;
            return this;
        }
        public GetHipObjectCustomChecksCriteriaRegistryKeyRegistryValue build() {
            final var _resultValue = new GetHipObjectCustomChecksCriteriaRegistryKeyRegistryValue();
            _resultValue.name = name;
            _resultValue.negate = negate;
            _resultValue.valueData = valueData;
            return _resultValue;
        }
    }
}
