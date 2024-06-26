// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.scm.inputs.IkeGatewayProtocolIkev1Args;
import com.pulumi.scm.inputs.IkeGatewayProtocolIkev2Args;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IkeGatewayProtocolArgs extends com.pulumi.resources.ResourceArgs {

    public static final IkeGatewayProtocolArgs Empty = new IkeGatewayProtocolArgs();

    /**
     * The Ikev1 param.
     * 
     */
    @Import(name="ikev1")
    private @Nullable Output<IkeGatewayProtocolIkev1Args> ikev1;

    /**
     * @return The Ikev1 param.
     * 
     */
    public Optional<Output<IkeGatewayProtocolIkev1Args>> ikev1() {
        return Optional.ofNullable(this.ikev1);
    }

    /**
     * The Ikev2 param.
     * 
     */
    @Import(name="ikev2")
    private @Nullable Output<IkeGatewayProtocolIkev2Args> ikev2;

    /**
     * @return The Ikev2 param.
     * 
     */
    public Optional<Output<IkeGatewayProtocolIkev2Args>> ikev2() {
        return Optional.ofNullable(this.ikev2);
    }

    /**
     * The Version param. String must be one of these: `&#34;ikev2-preferred&#34;`, `&#34;ikev1&#34;`, `&#34;ikev2&#34;`. Default: `&#34;ikev2-preferred&#34;`.
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return The Version param. String must be one of these: `&#34;ikev2-preferred&#34;`, `&#34;ikev1&#34;`, `&#34;ikev2&#34;`. Default: `&#34;ikev2-preferred&#34;`.
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private IkeGatewayProtocolArgs() {}

    private IkeGatewayProtocolArgs(IkeGatewayProtocolArgs $) {
        this.ikev1 = $.ikev1;
        this.ikev2 = $.ikev2;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IkeGatewayProtocolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IkeGatewayProtocolArgs $;

        public Builder() {
            $ = new IkeGatewayProtocolArgs();
        }

        public Builder(IkeGatewayProtocolArgs defaults) {
            $ = new IkeGatewayProtocolArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ikev1 The Ikev1 param.
         * 
         * @return builder
         * 
         */
        public Builder ikev1(@Nullable Output<IkeGatewayProtocolIkev1Args> ikev1) {
            $.ikev1 = ikev1;
            return this;
        }

        /**
         * @param ikev1 The Ikev1 param.
         * 
         * @return builder
         * 
         */
        public Builder ikev1(IkeGatewayProtocolIkev1Args ikev1) {
            return ikev1(Output.of(ikev1));
        }

        /**
         * @param ikev2 The Ikev2 param.
         * 
         * @return builder
         * 
         */
        public Builder ikev2(@Nullable Output<IkeGatewayProtocolIkev2Args> ikev2) {
            $.ikev2 = ikev2;
            return this;
        }

        /**
         * @param ikev2 The Ikev2 param.
         * 
         * @return builder
         * 
         */
        public Builder ikev2(IkeGatewayProtocolIkev2Args ikev2) {
            return ikev2(Output.of(ikev2));
        }

        /**
         * @param version The Version param. String must be one of these: `&#34;ikev2-preferred&#34;`, `&#34;ikev1&#34;`, `&#34;ikev2&#34;`. Default: `&#34;ikev2-preferred&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The Version param. String must be one of these: `&#34;ikev2-preferred&#34;`, `&#34;ikev1&#34;`, `&#34;ikev2&#34;`. Default: `&#34;ikev2-preferred&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public IkeGatewayProtocolArgs build() {
            return $;
        }
    }

}
