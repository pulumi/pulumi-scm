// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.scm.inputs.HipObjectNetworkInfoCriteriaArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HipObjectNetworkInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final HipObjectNetworkInfoArgs Empty = new HipObjectNetworkInfoArgs();

    /**
     * The Criteria param.
     * 
     */
    @Import(name="criteria")
    private @Nullable Output<HipObjectNetworkInfoCriteriaArgs> criteria;

    /**
     * @return The Criteria param.
     * 
     */
    public Optional<Output<HipObjectNetworkInfoCriteriaArgs>> criteria() {
        return Optional.ofNullable(this.criteria);
    }

    private HipObjectNetworkInfoArgs() {}

    private HipObjectNetworkInfoArgs(HipObjectNetworkInfoArgs $) {
        this.criteria = $.criteria;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HipObjectNetworkInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HipObjectNetworkInfoArgs $;

        public Builder() {
            $ = new HipObjectNetworkInfoArgs();
        }

        public Builder(HipObjectNetworkInfoArgs defaults) {
            $ = new HipObjectNetworkInfoArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param criteria The Criteria param.
         * 
         * @return builder
         * 
         */
        public Builder criteria(@Nullable Output<HipObjectNetworkInfoCriteriaArgs> criteria) {
            $.criteria = criteria;
            return this;
        }

        /**
         * @param criteria The Criteria param.
         * 
         * @return builder
         * 
         */
        public Builder criteria(HipObjectNetworkInfoCriteriaArgs criteria) {
            return criteria(Output.of(criteria));
        }

        public HipObjectNetworkInfoArgs build() {
            return $;
        }
    }

}
