// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IpsecTunnelAutoKeyIkeGatewayArgs extends com.pulumi.resources.ResourceArgs {

    public static final IpsecTunnelAutoKeyIkeGatewayArgs Empty = new IpsecTunnelAutoKeyIkeGatewayArgs();

    /**
     * The Name param.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The Name param.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private IpsecTunnelAutoKeyIkeGatewayArgs() {}

    private IpsecTunnelAutoKeyIkeGatewayArgs(IpsecTunnelAutoKeyIkeGatewayArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IpsecTunnelAutoKeyIkeGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IpsecTunnelAutoKeyIkeGatewayArgs $;

        public Builder() {
            $ = new IpsecTunnelAutoKeyIkeGatewayArgs();
        }

        public Builder(IpsecTunnelAutoKeyIkeGatewayArgs defaults) {
            $ = new IpsecTunnelAutoKeyIkeGatewayArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The Name param.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The Name param.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public IpsecTunnelAutoKeyIkeGatewayArgs build() {
            return $;
        }
    }

}
