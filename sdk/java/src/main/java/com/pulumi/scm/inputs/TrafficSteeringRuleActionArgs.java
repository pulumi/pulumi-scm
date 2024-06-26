// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.scm.inputs.TrafficSteeringRuleActionForwardArgs;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TrafficSteeringRuleActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final TrafficSteeringRuleActionArgs Empty = new TrafficSteeringRuleActionArgs();

    /**
     * The Forward param. Ensure that only one of the following is specified: `forward`, `no-pbf`
     * 
     */
    @Import(name="forward")
    private @Nullable Output<TrafficSteeringRuleActionForwardArgs> forward;

    /**
     * @return The Forward param. Ensure that only one of the following is specified: `forward`, `no-pbf`
     * 
     */
    public Optional<Output<TrafficSteeringRuleActionForwardArgs>> forward() {
        return Optional.ofNullable(this.forward);
    }

    /**
     * The NoPbf param. Ensure that only one of the following is specified: `forward`, `no-pbf`
     * 
     */
    @Import(name="noPbf")
    private @Nullable Output<Boolean> noPbf;

    /**
     * @return The NoPbf param. Ensure that only one of the following is specified: `forward`, `no-pbf`
     * 
     */
    public Optional<Output<Boolean>> noPbf() {
        return Optional.ofNullable(this.noPbf);
    }

    private TrafficSteeringRuleActionArgs() {}

    private TrafficSteeringRuleActionArgs(TrafficSteeringRuleActionArgs $) {
        this.forward = $.forward;
        this.noPbf = $.noPbf;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TrafficSteeringRuleActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TrafficSteeringRuleActionArgs $;

        public Builder() {
            $ = new TrafficSteeringRuleActionArgs();
        }

        public Builder(TrafficSteeringRuleActionArgs defaults) {
            $ = new TrafficSteeringRuleActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param forward The Forward param. Ensure that only one of the following is specified: `forward`, `no-pbf`
         * 
         * @return builder
         * 
         */
        public Builder forward(@Nullable Output<TrafficSteeringRuleActionForwardArgs> forward) {
            $.forward = forward;
            return this;
        }

        /**
         * @param forward The Forward param. Ensure that only one of the following is specified: `forward`, `no-pbf`
         * 
         * @return builder
         * 
         */
        public Builder forward(TrafficSteeringRuleActionForwardArgs forward) {
            return forward(Output.of(forward));
        }

        /**
         * @param noPbf The NoPbf param. Ensure that only one of the following is specified: `forward`, `no-pbf`
         * 
         * @return builder
         * 
         */
        public Builder noPbf(@Nullable Output<Boolean> noPbf) {
            $.noPbf = noPbf;
            return this;
        }

        /**
         * @param noPbf The NoPbf param. Ensure that only one of the following is specified: `forward`, `no-pbf`
         * 
         * @return builder
         * 
         */
        public Builder noPbf(Boolean noPbf) {
            return noPbf(Output.of(noPbf));
        }

        public TrafficSteeringRuleActionArgs build() {
            return $;
        }
    }

}
