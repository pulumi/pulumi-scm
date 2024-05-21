// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MfaServerMfaVendorTypePingIdentityV1Args extends com.pulumi.resources.ResourceArgs {

    public static final MfaServerMfaVendorTypePingIdentityV1Args Empty = new MfaServerMfaVendorTypePingIdentityV1Args();

    /**
     * The PingApiHost param.
     * 
     */
    @Import(name="pingApiHost")
    private @Nullable Output<String> pingApiHost;

    /**
     * @return The PingApiHost param.
     * 
     */
    public Optional<Output<String>> pingApiHost() {
        return Optional.ofNullable(this.pingApiHost);
    }

    /**
     * The PingBaseuri param.
     * 
     */
    @Import(name="pingBaseuri")
    private @Nullable Output<String> pingBaseuri;

    /**
     * @return The PingBaseuri param.
     * 
     */
    public Optional<Output<String>> pingBaseuri() {
        return Optional.ofNullable(this.pingBaseuri);
    }

    /**
     * The PingOrg param.
     * 
     */
    @Import(name="pingOrg")
    private @Nullable Output<String> pingOrg;

    /**
     * @return The PingOrg param.
     * 
     */
    public Optional<Output<String>> pingOrg() {
        return Optional.ofNullable(this.pingOrg);
    }

    /**
     * The PingOrgAlias param.
     * 
     */
    @Import(name="pingOrgAlias")
    private @Nullable Output<String> pingOrgAlias;

    /**
     * @return The PingOrgAlias param.
     * 
     */
    public Optional<Output<String>> pingOrgAlias() {
        return Optional.ofNullable(this.pingOrgAlias);
    }

    /**
     * The PingTimeout param.
     * 
     */
    @Import(name="pingTimeout")
    private @Nullable Output<String> pingTimeout;

    /**
     * @return The PingTimeout param.
     * 
     */
    public Optional<Output<String>> pingTimeout() {
        return Optional.ofNullable(this.pingTimeout);
    }

    /**
     * The PingToken param.
     * 
     */
    @Import(name="pingToken")
    private @Nullable Output<String> pingToken;

    /**
     * @return The PingToken param.
     * 
     */
    public Optional<Output<String>> pingToken() {
        return Optional.ofNullable(this.pingToken);
    }

    private MfaServerMfaVendorTypePingIdentityV1Args() {}

    private MfaServerMfaVendorTypePingIdentityV1Args(MfaServerMfaVendorTypePingIdentityV1Args $) {
        this.pingApiHost = $.pingApiHost;
        this.pingBaseuri = $.pingBaseuri;
        this.pingOrg = $.pingOrg;
        this.pingOrgAlias = $.pingOrgAlias;
        this.pingTimeout = $.pingTimeout;
        this.pingToken = $.pingToken;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MfaServerMfaVendorTypePingIdentityV1Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MfaServerMfaVendorTypePingIdentityV1Args $;

        public Builder() {
            $ = new MfaServerMfaVendorTypePingIdentityV1Args();
        }

        public Builder(MfaServerMfaVendorTypePingIdentityV1Args defaults) {
            $ = new MfaServerMfaVendorTypePingIdentityV1Args(Objects.requireNonNull(defaults));
        }

        /**
         * @param pingApiHost The PingApiHost param.
         * 
         * @return builder
         * 
         */
        public Builder pingApiHost(@Nullable Output<String> pingApiHost) {
            $.pingApiHost = pingApiHost;
            return this;
        }

        /**
         * @param pingApiHost The PingApiHost param.
         * 
         * @return builder
         * 
         */
        public Builder pingApiHost(String pingApiHost) {
            return pingApiHost(Output.of(pingApiHost));
        }

        /**
         * @param pingBaseuri The PingBaseuri param.
         * 
         * @return builder
         * 
         */
        public Builder pingBaseuri(@Nullable Output<String> pingBaseuri) {
            $.pingBaseuri = pingBaseuri;
            return this;
        }

        /**
         * @param pingBaseuri The PingBaseuri param.
         * 
         * @return builder
         * 
         */
        public Builder pingBaseuri(String pingBaseuri) {
            return pingBaseuri(Output.of(pingBaseuri));
        }

        /**
         * @param pingOrg The PingOrg param.
         * 
         * @return builder
         * 
         */
        public Builder pingOrg(@Nullable Output<String> pingOrg) {
            $.pingOrg = pingOrg;
            return this;
        }

        /**
         * @param pingOrg The PingOrg param.
         * 
         * @return builder
         * 
         */
        public Builder pingOrg(String pingOrg) {
            return pingOrg(Output.of(pingOrg));
        }

        /**
         * @param pingOrgAlias The PingOrgAlias param.
         * 
         * @return builder
         * 
         */
        public Builder pingOrgAlias(@Nullable Output<String> pingOrgAlias) {
            $.pingOrgAlias = pingOrgAlias;
            return this;
        }

        /**
         * @param pingOrgAlias The PingOrgAlias param.
         * 
         * @return builder
         * 
         */
        public Builder pingOrgAlias(String pingOrgAlias) {
            return pingOrgAlias(Output.of(pingOrgAlias));
        }

        /**
         * @param pingTimeout The PingTimeout param.
         * 
         * @return builder
         * 
         */
        public Builder pingTimeout(@Nullable Output<String> pingTimeout) {
            $.pingTimeout = pingTimeout;
            return this;
        }

        /**
         * @param pingTimeout The PingTimeout param.
         * 
         * @return builder
         * 
         */
        public Builder pingTimeout(String pingTimeout) {
            return pingTimeout(Output.of(pingTimeout));
        }

        /**
         * @param pingToken The PingToken param.
         * 
         * @return builder
         * 
         */
        public Builder pingToken(@Nullable Output<String> pingToken) {
            $.pingToken = pingToken;
            return this;
        }

        /**
         * @param pingToken The PingToken param.
         * 
         * @return builder
         * 
         */
        public Builder pingToken(String pingToken) {
            return pingToken(Output.of(pingToken));
        }

        public MfaServerMfaVendorTypePingIdentityV1Args build() {
            return $;
        }
    }

}
