// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.scm.inputs.DecryptionProfileSslForwardProxyArgs;
import com.pulumi.scm.inputs.DecryptionProfileSslInboundProxyArgs;
import com.pulumi.scm.inputs.DecryptionProfileSslNoProxyArgs;
import com.pulumi.scm.inputs.DecryptionProfileSslProtocolSettingsArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DecryptionProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final DecryptionProfileArgs Empty = new DecryptionProfileArgs();

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
     * Must start with alphanumeric char and should contain only alphanemeric, underscore, hyphen, dot or space. String validation regex: `^[A-Za-z0-9]{1}[A-Za-z0-9_\-\.\s]{0,}$`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Must start with alphanumeric char and should contain only alphanemeric, underscore, hyphen, dot or space. String validation regex: `^[A-Za-z0-9]{1}[A-Za-z0-9_\-\.\s]{0,}$`.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
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
     * The SslForwardProxy param.
     * 
     */
    @Import(name="sslForwardProxy")
    private @Nullable Output<DecryptionProfileSslForwardProxyArgs> sslForwardProxy;

    /**
     * @return The SslForwardProxy param.
     * 
     */
    public Optional<Output<DecryptionProfileSslForwardProxyArgs>> sslForwardProxy() {
        return Optional.ofNullable(this.sslForwardProxy);
    }

    /**
     * The SslInboundProxy param.
     * 
     */
    @Import(name="sslInboundProxy")
    private @Nullable Output<DecryptionProfileSslInboundProxyArgs> sslInboundProxy;

    /**
     * @return The SslInboundProxy param.
     * 
     */
    public Optional<Output<DecryptionProfileSslInboundProxyArgs>> sslInboundProxy() {
        return Optional.ofNullable(this.sslInboundProxy);
    }

    /**
     * The SslNoProxy param.
     * 
     */
    @Import(name="sslNoProxy")
    private @Nullable Output<DecryptionProfileSslNoProxyArgs> sslNoProxy;

    /**
     * @return The SslNoProxy param.
     * 
     */
    public Optional<Output<DecryptionProfileSslNoProxyArgs>> sslNoProxy() {
        return Optional.ofNullable(this.sslNoProxy);
    }

    /**
     * The SslProtocolSettings param.
     * 
     */
    @Import(name="sslProtocolSettings")
    private @Nullable Output<DecryptionProfileSslProtocolSettingsArgs> sslProtocolSettings;

    /**
     * @return The SslProtocolSettings param.
     * 
     */
    public Optional<Output<DecryptionProfileSslProtocolSettingsArgs>> sslProtocolSettings() {
        return Optional.ofNullable(this.sslProtocolSettings);
    }

    private DecryptionProfileArgs() {}

    private DecryptionProfileArgs(DecryptionProfileArgs $) {
        this.device = $.device;
        this.folder = $.folder;
        this.name = $.name;
        this.snippet = $.snippet;
        this.sslForwardProxy = $.sslForwardProxy;
        this.sslInboundProxy = $.sslInboundProxy;
        this.sslNoProxy = $.sslNoProxy;
        this.sslProtocolSettings = $.sslProtocolSettings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DecryptionProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DecryptionProfileArgs $;

        public Builder() {
            $ = new DecryptionProfileArgs();
        }

        public Builder(DecryptionProfileArgs defaults) {
            $ = new DecryptionProfileArgs(Objects.requireNonNull(defaults));
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
         * @param name Must start with alphanumeric char and should contain only alphanemeric, underscore, hyphen, dot or space. String validation regex: `^[A-Za-z0-9]{1}[A-Za-z0-9_\-\.\s]{0,}$`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Must start with alphanumeric char and should contain only alphanemeric, underscore, hyphen, dot or space. String validation regex: `^[A-Za-z0-9]{1}[A-Za-z0-9_\-\.\s]{0,}$`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
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
         * @param sslForwardProxy The SslForwardProxy param.
         * 
         * @return builder
         * 
         */
        public Builder sslForwardProxy(@Nullable Output<DecryptionProfileSslForwardProxyArgs> sslForwardProxy) {
            $.sslForwardProxy = sslForwardProxy;
            return this;
        }

        /**
         * @param sslForwardProxy The SslForwardProxy param.
         * 
         * @return builder
         * 
         */
        public Builder sslForwardProxy(DecryptionProfileSslForwardProxyArgs sslForwardProxy) {
            return sslForwardProxy(Output.of(sslForwardProxy));
        }

        /**
         * @param sslInboundProxy The SslInboundProxy param.
         * 
         * @return builder
         * 
         */
        public Builder sslInboundProxy(@Nullable Output<DecryptionProfileSslInboundProxyArgs> sslInboundProxy) {
            $.sslInboundProxy = sslInboundProxy;
            return this;
        }

        /**
         * @param sslInboundProxy The SslInboundProxy param.
         * 
         * @return builder
         * 
         */
        public Builder sslInboundProxy(DecryptionProfileSslInboundProxyArgs sslInboundProxy) {
            return sslInboundProxy(Output.of(sslInboundProxy));
        }

        /**
         * @param sslNoProxy The SslNoProxy param.
         * 
         * @return builder
         * 
         */
        public Builder sslNoProxy(@Nullable Output<DecryptionProfileSslNoProxyArgs> sslNoProxy) {
            $.sslNoProxy = sslNoProxy;
            return this;
        }

        /**
         * @param sslNoProxy The SslNoProxy param.
         * 
         * @return builder
         * 
         */
        public Builder sslNoProxy(DecryptionProfileSslNoProxyArgs sslNoProxy) {
            return sslNoProxy(Output.of(sslNoProxy));
        }

        /**
         * @param sslProtocolSettings The SslProtocolSettings param.
         * 
         * @return builder
         * 
         */
        public Builder sslProtocolSettings(@Nullable Output<DecryptionProfileSslProtocolSettingsArgs> sslProtocolSettings) {
            $.sslProtocolSettings = sslProtocolSettings;
            return this;
        }

        /**
         * @param sslProtocolSettings The SslProtocolSettings param.
         * 
         * @return builder
         * 
         */
        public Builder sslProtocolSettings(DecryptionProfileSslProtocolSettingsArgs sslProtocolSettings) {
            return sslProtocolSettings(Output.of(sslProtocolSettings));
        }

        public DecryptionProfileArgs build() {
            return $;
        }
    }

}
