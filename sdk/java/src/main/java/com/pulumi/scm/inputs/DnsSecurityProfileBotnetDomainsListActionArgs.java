// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DnsSecurityProfileBotnetDomainsListActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final DnsSecurityProfileBotnetDomainsListActionArgs Empty = new DnsSecurityProfileBotnetDomainsListActionArgs();

    /**
     * The Alert param. Ensure that only one of the following is specified: `alert`, `allow`, `block`, `sinkhole`
     * 
     */
    @Import(name="alert")
    private @Nullable Output<Boolean> alert;

    /**
     * @return The Alert param. Ensure that only one of the following is specified: `alert`, `allow`, `block`, `sinkhole`
     * 
     */
    public Optional<Output<Boolean>> alert() {
        return Optional.ofNullable(this.alert);
    }

    /**
     * The Allow param. Ensure that only one of the following is specified: `alert`, `allow`, `block`, `sinkhole`
     * 
     */
    @Import(name="allow")
    private @Nullable Output<Boolean> allow;

    /**
     * @return The Allow param. Ensure that only one of the following is specified: `alert`, `allow`, `block`, `sinkhole`
     * 
     */
    public Optional<Output<Boolean>> allow() {
        return Optional.ofNullable(this.allow);
    }

    /**
     * The Block param. Ensure that only one of the following is specified: `alert`, `allow`, `block`, `sinkhole`
     * 
     */
    @Import(name="block")
    private @Nullable Output<Boolean> block;

    /**
     * @return The Block param. Ensure that only one of the following is specified: `alert`, `allow`, `block`, `sinkhole`
     * 
     */
    public Optional<Output<Boolean>> block() {
        return Optional.ofNullable(this.block);
    }

    /**
     * The Sinkhole param. Ensure that only one of the following is specified: `alert`, `allow`, `block`, `sinkhole`
     * 
     */
    @Import(name="sinkhole")
    private @Nullable Output<Boolean> sinkhole;

    /**
     * @return The Sinkhole param. Ensure that only one of the following is specified: `alert`, `allow`, `block`, `sinkhole`
     * 
     */
    public Optional<Output<Boolean>> sinkhole() {
        return Optional.ofNullable(this.sinkhole);
    }

    private DnsSecurityProfileBotnetDomainsListActionArgs() {}

    private DnsSecurityProfileBotnetDomainsListActionArgs(DnsSecurityProfileBotnetDomainsListActionArgs $) {
        this.alert = $.alert;
        this.allow = $.allow;
        this.block = $.block;
        this.sinkhole = $.sinkhole;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DnsSecurityProfileBotnetDomainsListActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DnsSecurityProfileBotnetDomainsListActionArgs $;

        public Builder() {
            $ = new DnsSecurityProfileBotnetDomainsListActionArgs();
        }

        public Builder(DnsSecurityProfileBotnetDomainsListActionArgs defaults) {
            $ = new DnsSecurityProfileBotnetDomainsListActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alert The Alert param. Ensure that only one of the following is specified: `alert`, `allow`, `block`, `sinkhole`
         * 
         * @return builder
         * 
         */
        public Builder alert(@Nullable Output<Boolean> alert) {
            $.alert = alert;
            return this;
        }

        /**
         * @param alert The Alert param. Ensure that only one of the following is specified: `alert`, `allow`, `block`, `sinkhole`
         * 
         * @return builder
         * 
         */
        public Builder alert(Boolean alert) {
            return alert(Output.of(alert));
        }

        /**
         * @param allow The Allow param. Ensure that only one of the following is specified: `alert`, `allow`, `block`, `sinkhole`
         * 
         * @return builder
         * 
         */
        public Builder allow(@Nullable Output<Boolean> allow) {
            $.allow = allow;
            return this;
        }

        /**
         * @param allow The Allow param. Ensure that only one of the following is specified: `alert`, `allow`, `block`, `sinkhole`
         * 
         * @return builder
         * 
         */
        public Builder allow(Boolean allow) {
            return allow(Output.of(allow));
        }

        /**
         * @param block The Block param. Ensure that only one of the following is specified: `alert`, `allow`, `block`, `sinkhole`
         * 
         * @return builder
         * 
         */
        public Builder block(@Nullable Output<Boolean> block) {
            $.block = block;
            return this;
        }

        /**
         * @param block The Block param. Ensure that only one of the following is specified: `alert`, `allow`, `block`, `sinkhole`
         * 
         * @return builder
         * 
         */
        public Builder block(Boolean block) {
            return block(Output.of(block));
        }

        /**
         * @param sinkhole The Sinkhole param. Ensure that only one of the following is specified: `alert`, `allow`, `block`, `sinkhole`
         * 
         * @return builder
         * 
         */
        public Builder sinkhole(@Nullable Output<Boolean> sinkhole) {
            $.sinkhole = sinkhole;
            return this;
        }

        /**
         * @param sinkhole The Sinkhole param. Ensure that only one of the following is specified: `alert`, `allow`, `block`, `sinkhole`
         * 
         * @return builder
         * 
         */
        public Builder sinkhole(Boolean sinkhole) {
            return sinkhole(Output.of(sinkhole));
        }

        public DnsSecurityProfileBotnetDomainsListActionArgs build() {
            return $;
        }
    }

}
