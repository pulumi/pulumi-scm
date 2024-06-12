// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class QosProfileClassBandwidthTypeMbpsClassClassBandwidth {
    /**
     * @return guaranteed sending bandwidth in mbps. Value must be between 0 and 60000.
     * 
     */
    private @Nullable Integer egressGuaranteed;
    /**
     * @return max sending bandwidth in mbps. Value must be between 0 and 60000.
     * 
     */
    private @Nullable Integer egressMax;

    private QosProfileClassBandwidthTypeMbpsClassClassBandwidth() {}
    /**
     * @return guaranteed sending bandwidth in mbps. Value must be between 0 and 60000.
     * 
     */
    public Optional<Integer> egressGuaranteed() {
        return Optional.ofNullable(this.egressGuaranteed);
    }
    /**
     * @return max sending bandwidth in mbps. Value must be between 0 and 60000.
     * 
     */
    public Optional<Integer> egressMax() {
        return Optional.ofNullable(this.egressMax);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QosProfileClassBandwidthTypeMbpsClassClassBandwidth defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer egressGuaranteed;
        private @Nullable Integer egressMax;
        public Builder() {}
        public Builder(QosProfileClassBandwidthTypeMbpsClassClassBandwidth defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.egressGuaranteed = defaults.egressGuaranteed;
    	      this.egressMax = defaults.egressMax;
        }

        @CustomType.Setter
        public Builder egressGuaranteed(@Nullable Integer egressGuaranteed) {

            this.egressGuaranteed = egressGuaranteed;
            return this;
        }
        @CustomType.Setter
        public Builder egressMax(@Nullable Integer egressMax) {

            this.egressMax = egressMax;
            return this;
        }
        public QosProfileClassBandwidthTypeMbpsClassClassBandwidth build() {
            final var _resultValue = new QosProfileClassBandwidthTypeMbpsClassClassBandwidth();
            _resultValue.egressGuaranteed = egressGuaranteed;
            _resultValue.egressMax = egressMax;
            return _resultValue;
        }
    }
}