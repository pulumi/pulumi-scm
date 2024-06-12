// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.scm.outputs.QosProfileClassBandwidthTypePercentageClassClassBandwidth;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class QosProfileClassBandwidthTypePercentageClass {
    /**
     * @return The ClassBandwidth param.
     * 
     */
    private @Nullable QosProfileClassBandwidthTypePercentageClassClassBandwidth classBandwidth;
    /**
     * @return Traffic class. String length must not exceed 31 characters.
     * 
     */
    private @Nullable String name;
    /**
     * @return traffic class priority. String must be one of these: `&#34;real-time&#34;`, `&#34;high&#34;`, `&#34;medium&#34;`, `&#34;low&#34;`. Default: `&#34;medium&#34;`.
     * 
     */
    private @Nullable String priority;

    private QosProfileClassBandwidthTypePercentageClass() {}
    /**
     * @return The ClassBandwidth param.
     * 
     */
    public Optional<QosProfileClassBandwidthTypePercentageClassClassBandwidth> classBandwidth() {
        return Optional.ofNullable(this.classBandwidth);
    }
    /**
     * @return Traffic class. String length must not exceed 31 characters.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return traffic class priority. String must be one of these: `&#34;real-time&#34;`, `&#34;high&#34;`, `&#34;medium&#34;`, `&#34;low&#34;`. Default: `&#34;medium&#34;`.
     * 
     */
    public Optional<String> priority() {
        return Optional.ofNullable(this.priority);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QosProfileClassBandwidthTypePercentageClass defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable QosProfileClassBandwidthTypePercentageClassClassBandwidth classBandwidth;
        private @Nullable String name;
        private @Nullable String priority;
        public Builder() {}
        public Builder(QosProfileClassBandwidthTypePercentageClass defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.classBandwidth = defaults.classBandwidth;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
        }

        @CustomType.Setter
        public Builder classBandwidth(@Nullable QosProfileClassBandwidthTypePercentageClassClassBandwidth classBandwidth) {

            this.classBandwidth = classBandwidth;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder priority(@Nullable String priority) {

            this.priority = priority;
            return this;
        }
        public QosProfileClassBandwidthTypePercentageClass build() {
            final var _resultValue = new QosProfileClassBandwidthTypePercentageClass();
            _resultValue.classBandwidth = classBandwidth;
            _resultValue.name = name;
            _resultValue.priority = priority;
            return _resultValue;
        }
    }
}