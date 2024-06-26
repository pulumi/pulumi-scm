// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.scm.inputs.QosProfileClassBandwidthTypePercentageClassClassBandwidthArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class QosProfileClassBandwidthTypePercentageClassArgs extends com.pulumi.resources.ResourceArgs {

    public static final QosProfileClassBandwidthTypePercentageClassArgs Empty = new QosProfileClassBandwidthTypePercentageClassArgs();

    /**
     * The ClassBandwidth param.
     * 
     */
    @Import(name="classBandwidth")
    private @Nullable Output<QosProfileClassBandwidthTypePercentageClassClassBandwidthArgs> classBandwidth;

    /**
     * @return The ClassBandwidth param.
     * 
     */
    public Optional<Output<QosProfileClassBandwidthTypePercentageClassClassBandwidthArgs>> classBandwidth() {
        return Optional.ofNullable(this.classBandwidth);
    }

    /**
     * Traffic class. String length must not exceed 31 characters.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Traffic class. String length must not exceed 31 characters.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * traffic class priority. String must be one of these: `&#34;real-time&#34;`, `&#34;high&#34;`, `&#34;medium&#34;`, `&#34;low&#34;`. Default: `&#34;medium&#34;`.
     * 
     */
    @Import(name="priority")
    private @Nullable Output<String> priority;

    /**
     * @return traffic class priority. String must be one of these: `&#34;real-time&#34;`, `&#34;high&#34;`, `&#34;medium&#34;`, `&#34;low&#34;`. Default: `&#34;medium&#34;`.
     * 
     */
    public Optional<Output<String>> priority() {
        return Optional.ofNullable(this.priority);
    }

    private QosProfileClassBandwidthTypePercentageClassArgs() {}

    private QosProfileClassBandwidthTypePercentageClassArgs(QosProfileClassBandwidthTypePercentageClassArgs $) {
        this.classBandwidth = $.classBandwidth;
        this.name = $.name;
        this.priority = $.priority;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(QosProfileClassBandwidthTypePercentageClassArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private QosProfileClassBandwidthTypePercentageClassArgs $;

        public Builder() {
            $ = new QosProfileClassBandwidthTypePercentageClassArgs();
        }

        public Builder(QosProfileClassBandwidthTypePercentageClassArgs defaults) {
            $ = new QosProfileClassBandwidthTypePercentageClassArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param classBandwidth The ClassBandwidth param.
         * 
         * @return builder
         * 
         */
        public Builder classBandwidth(@Nullable Output<QosProfileClassBandwidthTypePercentageClassClassBandwidthArgs> classBandwidth) {
            $.classBandwidth = classBandwidth;
            return this;
        }

        /**
         * @param classBandwidth The ClassBandwidth param.
         * 
         * @return builder
         * 
         */
        public Builder classBandwidth(QosProfileClassBandwidthTypePercentageClassClassBandwidthArgs classBandwidth) {
            return classBandwidth(Output.of(classBandwidth));
        }

        /**
         * @param name Traffic class. String length must not exceed 31 characters.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Traffic class. String length must not exceed 31 characters.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param priority traffic class priority. String must be one of these: `&#34;real-time&#34;`, `&#34;high&#34;`, `&#34;medium&#34;`, `&#34;low&#34;`. Default: `&#34;medium&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder priority(@Nullable Output<String> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority traffic class priority. String must be one of these: `&#34;real-time&#34;`, `&#34;high&#34;`, `&#34;medium&#34;`, `&#34;low&#34;`. Default: `&#34;medium&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder priority(String priority) {
            return priority(Output.of(priority));
        }

        public QosProfileClassBandwidthTypePercentageClassArgs build() {
            return $;
        }
    }

}
