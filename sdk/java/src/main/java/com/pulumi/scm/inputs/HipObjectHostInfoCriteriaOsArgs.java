// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.scm.inputs.HipObjectHostInfoCriteriaOsContainsArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HipObjectHostInfoCriteriaOsArgs extends com.pulumi.resources.ResourceArgs {

    public static final HipObjectHostInfoCriteriaOsArgs Empty = new HipObjectHostInfoCriteriaOsArgs();

    /**
     * The Contains param. Ensure that only one of the following is specified: `contains`
     * 
     */
    @Import(name="contains")
    private @Nullable Output<HipObjectHostInfoCriteriaOsContainsArgs> contains;

    /**
     * @return The Contains param. Ensure that only one of the following is specified: `contains`
     * 
     */
    public Optional<Output<HipObjectHostInfoCriteriaOsContainsArgs>> contains() {
        return Optional.ofNullable(this.contains);
    }

    private HipObjectHostInfoCriteriaOsArgs() {}

    private HipObjectHostInfoCriteriaOsArgs(HipObjectHostInfoCriteriaOsArgs $) {
        this.contains = $.contains;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HipObjectHostInfoCriteriaOsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HipObjectHostInfoCriteriaOsArgs $;

        public Builder() {
            $ = new HipObjectHostInfoCriteriaOsArgs();
        }

        public Builder(HipObjectHostInfoCriteriaOsArgs defaults) {
            $ = new HipObjectHostInfoCriteriaOsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param contains The Contains param. Ensure that only one of the following is specified: `contains`
         * 
         * @return builder
         * 
         */
        public Builder contains(@Nullable Output<HipObjectHostInfoCriteriaOsContainsArgs> contains) {
            $.contains = contains;
            return this;
        }

        /**
         * @param contains The Contains param. Ensure that only one of the following is specified: `contains`
         * 
         * @return builder
         * 
         */
        public Builder contains(HipObjectHostInfoCriteriaOsContainsArgs contains) {
            return contains(Output.of(contains));
        }

        public HipObjectHostInfoCriteriaOsArgs build() {
            return $;
        }
    }

}
