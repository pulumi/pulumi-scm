// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.inputs.LdapServerProfileServerArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LdapServerProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final LdapServerProfileArgs Empty = new LdapServerProfileArgs();

    /**
     * The Base param. String length must not exceed 255 characters.
     * 
     */
    @Import(name="base")
    private @Nullable Output<String> base;

    /**
     * @return The Base param. String length must not exceed 255 characters.
     * 
     */
    public Optional<Output<String>> base() {
        return Optional.ofNullable(this.base);
    }

    /**
     * The BindDn param. String length must not exceed 255 characters.
     * 
     */
    @Import(name="bindDn")
    private @Nullable Output<String> bindDn;

    /**
     * @return The BindDn param. String length must not exceed 255 characters.
     * 
     */
    public Optional<Output<String>> bindDn() {
        return Optional.ofNullable(this.bindDn);
    }

    /**
     * The BindPassword param. String length must not exceed 121 characters.
     * 
     */
    @Import(name="bindPassword")
    private @Nullable Output<String> bindPassword;

    /**
     * @return The BindPassword param. String length must not exceed 121 characters.
     * 
     */
    public Optional<Output<String>> bindPassword() {
        return Optional.ofNullable(this.bindPassword);
    }

    /**
     * The BindTimelimit param.
     * 
     */
    @Import(name="bindTimelimit")
    private @Nullable Output<String> bindTimelimit;

    /**
     * @return The BindTimelimit param.
     * 
     */
    public Optional<Output<String>> bindTimelimit() {
        return Optional.ofNullable(this.bindTimelimit);
    }

    /**
     * The Device param.
     * 
     */
    @Import(name="device")
    private @Nullable Output<String> device;

    /**
     * @return The Device param.
     * 
     */
    public Optional<Output<String>> device() {
        return Optional.ofNullable(this.device);
    }

    /**
     * The Folder param.
     * 
     */
    @Import(name="folder")
    private @Nullable Output<String> folder;

    /**
     * @return The Folder param.
     * 
     */
    public Optional<Output<String>> folder() {
        return Optional.ofNullable(this.folder);
    }

    /**
     * The LdapType param. String must be one of these: `&#34;active-directory&#34;`, `&#34;e-directory&#34;`, `&#34;sun&#34;`, `&#34;other&#34;`.
     * 
     */
    @Import(name="ldapType")
    private @Nullable Output<String> ldapType;

    /**
     * @return The LdapType param. String must be one of these: `&#34;active-directory&#34;`, `&#34;e-directory&#34;`, `&#34;sun&#34;`, `&#34;other&#34;`.
     * 
     */
    public Optional<Output<String>> ldapType() {
        return Optional.ofNullable(this.ldapType);
    }

    /**
     * The RetryInterval param.
     * 
     */
    @Import(name="retryInterval")
    private @Nullable Output<Integer> retryInterval;

    /**
     * @return The RetryInterval param.
     * 
     */
    public Optional<Output<Integer>> retryInterval() {
        return Optional.ofNullable(this.retryInterval);
    }

    /**
     * The Servers param.
     * 
     */
    @Import(name="servers", required=true)
    private Output<List<LdapServerProfileServerArgs>> servers;

    /**
     * @return The Servers param.
     * 
     */
    public Output<List<LdapServerProfileServerArgs>> servers() {
        return this.servers;
    }

    /**
     * The Snippet param.
     * 
     */
    @Import(name="snippet")
    private @Nullable Output<String> snippet;

    /**
     * @return The Snippet param.
     * 
     */
    public Optional<Output<String>> snippet() {
        return Optional.ofNullable(this.snippet);
    }

    /**
     * The Ssl param.
     * 
     */
    @Import(name="ssl")
    private @Nullable Output<Boolean> ssl;

    /**
     * @return The Ssl param.
     * 
     */
    public Optional<Output<Boolean>> ssl() {
        return Optional.ofNullable(this.ssl);
    }

    /**
     * The Timelimit param.
     * 
     */
    @Import(name="timelimit")
    private @Nullable Output<Integer> timelimit;

    /**
     * @return The Timelimit param.
     * 
     */
    public Optional<Output<Integer>> timelimit() {
        return Optional.ofNullable(this.timelimit);
    }

    /**
     * The VerifyServerCertificate param.
     * 
     */
    @Import(name="verifyServerCertificate")
    private @Nullable Output<Boolean> verifyServerCertificate;

    /**
     * @return The VerifyServerCertificate param.
     * 
     */
    public Optional<Output<Boolean>> verifyServerCertificate() {
        return Optional.ofNullable(this.verifyServerCertificate);
    }

    private LdapServerProfileArgs() {}

    private LdapServerProfileArgs(LdapServerProfileArgs $) {
        this.base = $.base;
        this.bindDn = $.bindDn;
        this.bindPassword = $.bindPassword;
        this.bindTimelimit = $.bindTimelimit;
        this.device = $.device;
        this.folder = $.folder;
        this.ldapType = $.ldapType;
        this.retryInterval = $.retryInterval;
        this.servers = $.servers;
        this.snippet = $.snippet;
        this.ssl = $.ssl;
        this.timelimit = $.timelimit;
        this.verifyServerCertificate = $.verifyServerCertificate;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LdapServerProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LdapServerProfileArgs $;

        public Builder() {
            $ = new LdapServerProfileArgs();
        }

        public Builder(LdapServerProfileArgs defaults) {
            $ = new LdapServerProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param base The Base param. String length must not exceed 255 characters.
         * 
         * @return builder
         * 
         */
        public Builder base(@Nullable Output<String> base) {
            $.base = base;
            return this;
        }

        /**
         * @param base The Base param. String length must not exceed 255 characters.
         * 
         * @return builder
         * 
         */
        public Builder base(String base) {
            return base(Output.of(base));
        }

        /**
         * @param bindDn The BindDn param. String length must not exceed 255 characters.
         * 
         * @return builder
         * 
         */
        public Builder bindDn(@Nullable Output<String> bindDn) {
            $.bindDn = bindDn;
            return this;
        }

        /**
         * @param bindDn The BindDn param. String length must not exceed 255 characters.
         * 
         * @return builder
         * 
         */
        public Builder bindDn(String bindDn) {
            return bindDn(Output.of(bindDn));
        }

        /**
         * @param bindPassword The BindPassword param. String length must not exceed 121 characters.
         * 
         * @return builder
         * 
         */
        public Builder bindPassword(@Nullable Output<String> bindPassword) {
            $.bindPassword = bindPassword;
            return this;
        }

        /**
         * @param bindPassword The BindPassword param. String length must not exceed 121 characters.
         * 
         * @return builder
         * 
         */
        public Builder bindPassword(String bindPassword) {
            return bindPassword(Output.of(bindPassword));
        }

        /**
         * @param bindTimelimit The BindTimelimit param.
         * 
         * @return builder
         * 
         */
        public Builder bindTimelimit(@Nullable Output<String> bindTimelimit) {
            $.bindTimelimit = bindTimelimit;
            return this;
        }

        /**
         * @param bindTimelimit The BindTimelimit param.
         * 
         * @return builder
         * 
         */
        public Builder bindTimelimit(String bindTimelimit) {
            return bindTimelimit(Output.of(bindTimelimit));
        }

        /**
         * @param device The Device param.
         * 
         * @return builder
         * 
         */
        public Builder device(@Nullable Output<String> device) {
            $.device = device;
            return this;
        }

        /**
         * @param device The Device param.
         * 
         * @return builder
         * 
         */
        public Builder device(String device) {
            return device(Output.of(device));
        }

        /**
         * @param folder The Folder param.
         * 
         * @return builder
         * 
         */
        public Builder folder(@Nullable Output<String> folder) {
            $.folder = folder;
            return this;
        }

        /**
         * @param folder The Folder param.
         * 
         * @return builder
         * 
         */
        public Builder folder(String folder) {
            return folder(Output.of(folder));
        }

        /**
         * @param ldapType The LdapType param. String must be one of these: `&#34;active-directory&#34;`, `&#34;e-directory&#34;`, `&#34;sun&#34;`, `&#34;other&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder ldapType(@Nullable Output<String> ldapType) {
            $.ldapType = ldapType;
            return this;
        }

        /**
         * @param ldapType The LdapType param. String must be one of these: `&#34;active-directory&#34;`, `&#34;e-directory&#34;`, `&#34;sun&#34;`, `&#34;other&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder ldapType(String ldapType) {
            return ldapType(Output.of(ldapType));
        }

        /**
         * @param retryInterval The RetryInterval param.
         * 
         * @return builder
         * 
         */
        public Builder retryInterval(@Nullable Output<Integer> retryInterval) {
            $.retryInterval = retryInterval;
            return this;
        }

        /**
         * @param retryInterval The RetryInterval param.
         * 
         * @return builder
         * 
         */
        public Builder retryInterval(Integer retryInterval) {
            return retryInterval(Output.of(retryInterval));
        }

        /**
         * @param servers The Servers param.
         * 
         * @return builder
         * 
         */
        public Builder servers(Output<List<LdapServerProfileServerArgs>> servers) {
            $.servers = servers;
            return this;
        }

        /**
         * @param servers The Servers param.
         * 
         * @return builder
         * 
         */
        public Builder servers(List<LdapServerProfileServerArgs> servers) {
            return servers(Output.of(servers));
        }

        /**
         * @param servers The Servers param.
         * 
         * @return builder
         * 
         */
        public Builder servers(LdapServerProfileServerArgs... servers) {
            return servers(List.of(servers));
        }

        /**
         * @param snippet The Snippet param.
         * 
         * @return builder
         * 
         */
        public Builder snippet(@Nullable Output<String> snippet) {
            $.snippet = snippet;
            return this;
        }

        /**
         * @param snippet The Snippet param.
         * 
         * @return builder
         * 
         */
        public Builder snippet(String snippet) {
            return snippet(Output.of(snippet));
        }

        /**
         * @param ssl The Ssl param.
         * 
         * @return builder
         * 
         */
        public Builder ssl(@Nullable Output<Boolean> ssl) {
            $.ssl = ssl;
            return this;
        }

        /**
         * @param ssl The Ssl param.
         * 
         * @return builder
         * 
         */
        public Builder ssl(Boolean ssl) {
            return ssl(Output.of(ssl));
        }

        /**
         * @param timelimit The Timelimit param.
         * 
         * @return builder
         * 
         */
        public Builder timelimit(@Nullable Output<Integer> timelimit) {
            $.timelimit = timelimit;
            return this;
        }

        /**
         * @param timelimit The Timelimit param.
         * 
         * @return builder
         * 
         */
        public Builder timelimit(Integer timelimit) {
            return timelimit(Output.of(timelimit));
        }

        /**
         * @param verifyServerCertificate The VerifyServerCertificate param.
         * 
         * @return builder
         * 
         */
        public Builder verifyServerCertificate(@Nullable Output<Boolean> verifyServerCertificate) {
            $.verifyServerCertificate = verifyServerCertificate;
            return this;
        }

        /**
         * @param verifyServerCertificate The VerifyServerCertificate param.
         * 
         * @return builder
         * 
         */
        public Builder verifyServerCertificate(Boolean verifyServerCertificate) {
            return verifyServerCertificate(Output.of(verifyServerCertificate));
        }

        public LdapServerProfileArgs build() {
            if ($.servers == null) {
                throw new MissingRequiredPropertyException("LdapServerProfileArgs", "servers");
            }
            return $;
        }
    }

}
