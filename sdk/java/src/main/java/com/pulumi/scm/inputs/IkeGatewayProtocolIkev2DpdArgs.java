// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IkeGatewayProtocolIkev2DpdArgs extends com.pulumi.resources.ResourceArgs {

    public static final IkeGatewayProtocolIkev2DpdArgs Empty = new IkeGatewayProtocolIkev2DpdArgs();

    /**
     * The Enable param.
     * 
     */
    @Import(name="enable")
    private @Nullable Output<Boolean> enable;

    /**
     * @return The Enable param.
     * 
     */
    public Optional<Output<Boolean>> enable() {
        return Optional.ofNullable(this.enable);
    }

    private IkeGatewayProtocolIkev2DpdArgs() {}

    private IkeGatewayProtocolIkev2DpdArgs(IkeGatewayProtocolIkev2DpdArgs $) {
        this.enable = $.enable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IkeGatewayProtocolIkev2DpdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IkeGatewayProtocolIkev2DpdArgs $;

        public Builder() {
            $ = new IkeGatewayProtocolIkev2DpdArgs();
        }

        public Builder(IkeGatewayProtocolIkev2DpdArgs defaults) {
            $ = new IkeGatewayProtocolIkev2DpdArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enable The Enable param.
         * 
         * @return builder
         * 
         */
        public Builder enable(@Nullable Output<Boolean> enable) {
            $.enable = enable;
            return this;
        }

        /**
         * @param enable The Enable param.
         * 
         * @return builder
         * 
         */
        public Builder enable(Boolean enable) {
            return enable(Output.of(enable));
        }

        public IkeGatewayProtocolIkev2DpdArgs build() {
            return $;
        }
    }

}
