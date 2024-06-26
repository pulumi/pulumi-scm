// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IkeGatewayProtocolCommonFragmentationArgs extends com.pulumi.resources.ResourceArgs {

    public static final IkeGatewayProtocolCommonFragmentationArgs Empty = new IkeGatewayProtocolCommonFragmentationArgs();

    /**
     * The Enable param. Default: `false`.
     * 
     */
    @Import(name="enable")
    private @Nullable Output<Boolean> enable;

    /**
     * @return The Enable param. Default: `false`.
     * 
     */
    public Optional<Output<Boolean>> enable() {
        return Optional.ofNullable(this.enable);
    }

    private IkeGatewayProtocolCommonFragmentationArgs() {}

    private IkeGatewayProtocolCommonFragmentationArgs(IkeGatewayProtocolCommonFragmentationArgs $) {
        this.enable = $.enable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IkeGatewayProtocolCommonFragmentationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IkeGatewayProtocolCommonFragmentationArgs $;

        public Builder() {
            $ = new IkeGatewayProtocolCommonFragmentationArgs();
        }

        public Builder(IkeGatewayProtocolCommonFragmentationArgs defaults) {
            $ = new IkeGatewayProtocolCommonFragmentationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enable The Enable param. Default: `false`.
         * 
         * @return builder
         * 
         */
        public Builder enable(@Nullable Output<Boolean> enable) {
            $.enable = enable;
            return this;
        }

        /**
         * @param enable The Enable param. Default: `false`.
         * 
         * @return builder
         * 
         */
        public Builder enable(Boolean enable) {
            return enable(Output.of(enable));
        }

        public IkeGatewayProtocolCommonFragmentationArgs build() {
            return $;
        }
    }

}
