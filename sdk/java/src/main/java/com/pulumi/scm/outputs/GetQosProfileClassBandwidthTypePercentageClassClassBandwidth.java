// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetQosProfileClassBandwidthTypePercentageClassClassBandwidth {
    /**
     * @return guaranteed sending bandwidth in percentage. Value must be between 0 and 100.
     * 
     */
    private Integer egressGuaranteed;
    /**
     * @return max sending bandwidth in percentage. Value must be between 0 and 100.
     * 
     */
    private Integer egressMax;

    private GetQosProfileClassBandwidthTypePercentageClassClassBandwidth() {}
    /**
     * @return guaranteed sending bandwidth in percentage. Value must be between 0 and 100.
     * 
     */
    public Integer egressGuaranteed() {
        return this.egressGuaranteed;
    }
    /**
     * @return max sending bandwidth in percentage. Value must be between 0 and 100.
     * 
     */
    public Integer egressMax() {
        return this.egressMax;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetQosProfileClassBandwidthTypePercentageClassClassBandwidth defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer egressGuaranteed;
        private Integer egressMax;
        public Builder() {}
        public Builder(GetQosProfileClassBandwidthTypePercentageClassClassBandwidth defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.egressGuaranteed = defaults.egressGuaranteed;
    	      this.egressMax = defaults.egressMax;
        }

        @CustomType.Setter
        public Builder egressGuaranteed(Integer egressGuaranteed) {
            if (egressGuaranteed == null) {
              throw new MissingRequiredPropertyException("GetQosProfileClassBandwidthTypePercentageClassClassBandwidth", "egressGuaranteed");
            }
            this.egressGuaranteed = egressGuaranteed;
            return this;
        }
        @CustomType.Setter
        public Builder egressMax(Integer egressMax) {
            if (egressMax == null) {
              throw new MissingRequiredPropertyException("GetQosProfileClassBandwidthTypePercentageClassClassBandwidth", "egressMax");
            }
            this.egressMax = egressMax;
            return this;
        }
        public GetQosProfileClassBandwidthTypePercentageClassClassBandwidth build() {
            final var _resultValue = new GetQosProfileClassBandwidthTypePercentageClassClassBandwidth();
            _resultValue.egressGuaranteed = egressGuaranteed;
            _resultValue.egressMax = egressMax;
            return _resultValue;
        }
    }
}