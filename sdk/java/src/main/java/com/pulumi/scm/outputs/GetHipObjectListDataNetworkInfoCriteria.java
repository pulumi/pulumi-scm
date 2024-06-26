// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.outputs.GetHipObjectListDataNetworkInfoCriteriaNetwork;
import java.util.Objects;

@CustomType
public final class GetHipObjectListDataNetworkInfoCriteria {
    /**
     * @return The Network param.
     * 
     */
    private GetHipObjectListDataNetworkInfoCriteriaNetwork network;

    private GetHipObjectListDataNetworkInfoCriteria() {}
    /**
     * @return The Network param.
     * 
     */
    public GetHipObjectListDataNetworkInfoCriteriaNetwork network() {
        return this.network;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHipObjectListDataNetworkInfoCriteria defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetHipObjectListDataNetworkInfoCriteriaNetwork network;
        public Builder() {}
        public Builder(GetHipObjectListDataNetworkInfoCriteria defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.network = defaults.network;
        }

        @CustomType.Setter
        public Builder network(GetHipObjectListDataNetworkInfoCriteriaNetwork network) {
            if (network == null) {
              throw new MissingRequiredPropertyException("GetHipObjectListDataNetworkInfoCriteria", "network");
            }
            this.network = network;
            return this;
        }
        public GetHipObjectListDataNetworkInfoCriteria build() {
            final var _resultValue = new GetHipObjectListDataNetworkInfoCriteria();
            _resultValue.network = network;
            return _resultValue;
        }
    }
}
