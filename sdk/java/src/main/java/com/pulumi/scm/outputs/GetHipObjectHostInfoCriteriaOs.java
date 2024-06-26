// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.outputs.GetHipObjectHostInfoCriteriaOsContains;
import java.util.Objects;

@CustomType
public final class GetHipObjectHostInfoCriteriaOs {
    /**
     * @return The Contains param.
     * 
     */
    private GetHipObjectHostInfoCriteriaOsContains contains;

    private GetHipObjectHostInfoCriteriaOs() {}
    /**
     * @return The Contains param.
     * 
     */
    public GetHipObjectHostInfoCriteriaOsContains contains() {
        return this.contains;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHipObjectHostInfoCriteriaOs defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetHipObjectHostInfoCriteriaOsContains contains;
        public Builder() {}
        public Builder(GetHipObjectHostInfoCriteriaOs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contains = defaults.contains;
        }

        @CustomType.Setter
        public Builder contains(GetHipObjectHostInfoCriteriaOsContains contains) {
            if (contains == null) {
              throw new MissingRequiredPropertyException("GetHipObjectHostInfoCriteriaOs", "contains");
            }
            this.contains = contains;
            return this;
        }
        public GetHipObjectHostInfoCriteriaOs build() {
            final var _resultValue = new GetHipObjectHostInfoCriteriaOs();
            _resultValue.contains = contains;
            return _resultValue;
        }
    }
}
