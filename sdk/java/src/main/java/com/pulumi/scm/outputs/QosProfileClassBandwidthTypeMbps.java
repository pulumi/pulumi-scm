// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.scm.outputs.QosProfileClassBandwidthTypeMbpsClass;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class QosProfileClassBandwidthTypeMbps {
    /**
     * @return QoS setting for traffic classes.
     * 
     */
    private @Nullable List<QosProfileClassBandwidthTypeMbpsClass> classes;

    private QosProfileClassBandwidthTypeMbps() {}
    /**
     * @return QoS setting for traffic classes.
     * 
     */
    public List<QosProfileClassBandwidthTypeMbpsClass> classes() {
        return this.classes == null ? List.of() : this.classes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QosProfileClassBandwidthTypeMbps defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<QosProfileClassBandwidthTypeMbpsClass> classes;
        public Builder() {}
        public Builder(QosProfileClassBandwidthTypeMbps defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.classes = defaults.classes;
        }

        @CustomType.Setter
        public Builder classes(@Nullable List<QosProfileClassBandwidthTypeMbpsClass> classes) {

            this.classes = classes;
            return this;
        }
        public Builder classes(QosProfileClassBandwidthTypeMbpsClass... classes) {
            return classes(List.of(classes));
        }
        public QosProfileClassBandwidthTypeMbps build() {
            final var _resultValue = new QosProfileClassBandwidthTypeMbps();
            _resultValue.classes = classes;
            return _resultValue;
        }
    }
}
