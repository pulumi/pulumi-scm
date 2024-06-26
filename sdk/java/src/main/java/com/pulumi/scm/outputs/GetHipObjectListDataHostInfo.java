// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.outputs.GetHipObjectListDataHostInfoCriteria;
import java.util.Objects;

@CustomType
public final class GetHipObjectListDataHostInfo {
    /**
     * @return The Criteria param.
     * 
     */
    private GetHipObjectListDataHostInfoCriteria criteria;

    private GetHipObjectListDataHostInfo() {}
    /**
     * @return The Criteria param.
     * 
     */
    public GetHipObjectListDataHostInfoCriteria criteria() {
        return this.criteria;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHipObjectListDataHostInfo defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetHipObjectListDataHostInfoCriteria criteria;
        public Builder() {}
        public Builder(GetHipObjectListDataHostInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.criteria = defaults.criteria;
        }

        @CustomType.Setter
        public Builder criteria(GetHipObjectListDataHostInfoCriteria criteria) {
            if (criteria == null) {
              throw new MissingRequiredPropertyException("GetHipObjectListDataHostInfo", "criteria");
            }
            this.criteria = criteria;
            return this;
        }
        public GetHipObjectListDataHostInfo build() {
            final var _resultValue = new GetHipObjectListDataHostInfo();
            _resultValue.criteria = criteria;
            return _resultValue;
        }
    }
}
