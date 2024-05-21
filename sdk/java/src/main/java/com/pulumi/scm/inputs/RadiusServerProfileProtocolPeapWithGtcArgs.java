// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RadiusServerProfileProtocolPeapWithGtcArgs extends com.pulumi.resources.ResourceArgs {

    public static final RadiusServerProfileProtocolPeapWithGtcArgs Empty = new RadiusServerProfileProtocolPeapWithGtcArgs();

    /**
     * The AnonOuterId param.
     * 
     */
    @Import(name="anonOuterId")
    private @Nullable Output<Boolean> anonOuterId;

    /**
     * @return The AnonOuterId param.
     * 
     */
    public Optional<Output<Boolean>> anonOuterId() {
        return Optional.ofNullable(this.anonOuterId);
    }

    /**
     * The RadiusCertProfile param.
     * 
     */
    @Import(name="radiusCertProfile")
    private @Nullable Output<String> radiusCertProfile;

    /**
     * @return The RadiusCertProfile param.
     * 
     */
    public Optional<Output<String>> radiusCertProfile() {
        return Optional.ofNullable(this.radiusCertProfile);
    }

    private RadiusServerProfileProtocolPeapWithGtcArgs() {}

    private RadiusServerProfileProtocolPeapWithGtcArgs(RadiusServerProfileProtocolPeapWithGtcArgs $) {
        this.anonOuterId = $.anonOuterId;
        this.radiusCertProfile = $.radiusCertProfile;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RadiusServerProfileProtocolPeapWithGtcArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RadiusServerProfileProtocolPeapWithGtcArgs $;

        public Builder() {
            $ = new RadiusServerProfileProtocolPeapWithGtcArgs();
        }

        public Builder(RadiusServerProfileProtocolPeapWithGtcArgs defaults) {
            $ = new RadiusServerProfileProtocolPeapWithGtcArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param anonOuterId The AnonOuterId param.
         * 
         * @return builder
         * 
         */
        public Builder anonOuterId(@Nullable Output<Boolean> anonOuterId) {
            $.anonOuterId = anonOuterId;
            return this;
        }

        /**
         * @param anonOuterId The AnonOuterId param.
         * 
         * @return builder
         * 
         */
        public Builder anonOuterId(Boolean anonOuterId) {
            return anonOuterId(Output.of(anonOuterId));
        }

        /**
         * @param radiusCertProfile The RadiusCertProfile param.
         * 
         * @return builder
         * 
         */
        public Builder radiusCertProfile(@Nullable Output<String> radiusCertProfile) {
            $.radiusCertProfile = radiusCertProfile;
            return this;
        }

        /**
         * @param radiusCertProfile The RadiusCertProfile param.
         * 
         * @return builder
         * 
         */
        public Builder radiusCertProfile(String radiusCertProfile) {
            return radiusCertProfile(Output.of(radiusCertProfile));
        }

        public RadiusServerProfileProtocolPeapWithGtcArgs build() {
            return $;
        }
    }

}
