// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetHipObjectListDataNetworkInfoCriteriaNetworkIsNotMobile {
    /**
     * @return The Carrier param. String length must not exceed 1023 characters. String validation regex: `.*`.
     * 
     */
    private String carrier;

    private GetHipObjectListDataNetworkInfoCriteriaNetworkIsNotMobile() {}
    /**
     * @return The Carrier param. String length must not exceed 1023 characters. String validation regex: `.*`.
     * 
     */
    public String carrier() {
        return this.carrier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHipObjectListDataNetworkInfoCriteriaNetworkIsNotMobile defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String carrier;
        public Builder() {}
        public Builder(GetHipObjectListDataNetworkInfoCriteriaNetworkIsNotMobile defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.carrier = defaults.carrier;
        }

        @CustomType.Setter
        public Builder carrier(String carrier) {
            if (carrier == null) {
              throw new MissingRequiredPropertyException("GetHipObjectListDataNetworkInfoCriteriaNetworkIsNotMobile", "carrier");
            }
            this.carrier = carrier;
            return this;
        }
        public GetHipObjectListDataNetworkInfoCriteriaNetworkIsNotMobile build() {
            final var _resultValue = new GetHipObjectListDataNetworkInfoCriteriaNetworkIsNotMobile();
            _resultValue.carrier = carrier;
            return _resultValue;
        }
    }
}