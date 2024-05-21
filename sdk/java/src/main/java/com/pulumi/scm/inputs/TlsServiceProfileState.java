// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.scm.inputs.TlsServiceProfileProtocolSettingsArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TlsServiceProfileState extends com.pulumi.resources.ResourceArgs {

    public static final TlsServiceProfileState Empty = new TlsServiceProfileState();

    /**
     * SSL certificate file name. String length must not exceed 255 characters.
     * 
     */
    @Import(name="certificate")
    private @Nullable Output<String> certificate;

    /**
     * @return SSL certificate file name. String length must not exceed 255 characters.
     * 
     */
    public Optional<Output<String>> certificate() {
        return Optional.ofNullable(this.certificate);
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
     * SSL TLS Service Profile name, value is muCustomDomainSSLProfile when it is used on mobile-agent infra settings. String length must not exceed 127 characters. String validation regex: `^[a-zA-Z0-9._-]+$`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return SSL TLS Service Profile name, value is muCustomDomainSSLProfile when it is used on mobile-agent infra settings. String length must not exceed 127 characters. String validation regex: `^[a-zA-Z0-9._-]+$`.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ProtocolSettings param.
     * 
     */
    @Import(name="protocolSettings")
    private @Nullable Output<TlsServiceProfileProtocolSettingsArgs> protocolSettings;

    /**
     * @return The ProtocolSettings param.
     * 
     */
    public Optional<Output<TlsServiceProfileProtocolSettingsArgs>> protocolSettings() {
        return Optional.ofNullable(this.protocolSettings);
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

    @Import(name="tfid")
    private @Nullable Output<String> tfid;

    public Optional<Output<String>> tfid() {
        return Optional.ofNullable(this.tfid);
    }

    private TlsServiceProfileState() {}

    private TlsServiceProfileState(TlsServiceProfileState $) {
        this.certificate = $.certificate;
        this.device = $.device;
        this.folder = $.folder;
        this.name = $.name;
        this.protocolSettings = $.protocolSettings;
        this.snippet = $.snippet;
        this.tfid = $.tfid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TlsServiceProfileState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TlsServiceProfileState $;

        public Builder() {
            $ = new TlsServiceProfileState();
        }

        public Builder(TlsServiceProfileState defaults) {
            $ = new TlsServiceProfileState(Objects.requireNonNull(defaults));
        }

        /**
         * @param certificate SSL certificate file name. String length must not exceed 255 characters.
         * 
         * @return builder
         * 
         */
        public Builder certificate(@Nullable Output<String> certificate) {
            $.certificate = certificate;
            return this;
        }

        /**
         * @param certificate SSL certificate file name. String length must not exceed 255 characters.
         * 
         * @return builder
         * 
         */
        public Builder certificate(String certificate) {
            return certificate(Output.of(certificate));
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
         * @param name SSL TLS Service Profile name, value is muCustomDomainSSLProfile when it is used on mobile-agent infra settings. String length must not exceed 127 characters. String validation regex: `^[a-zA-Z0-9._-]+$`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name SSL TLS Service Profile name, value is muCustomDomainSSLProfile when it is used on mobile-agent infra settings. String length must not exceed 127 characters. String validation regex: `^[a-zA-Z0-9._-]+$`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param protocolSettings The ProtocolSettings param.
         * 
         * @return builder
         * 
         */
        public Builder protocolSettings(@Nullable Output<TlsServiceProfileProtocolSettingsArgs> protocolSettings) {
            $.protocolSettings = protocolSettings;
            return this;
        }

        /**
         * @param protocolSettings The ProtocolSettings param.
         * 
         * @return builder
         * 
         */
        public Builder protocolSettings(TlsServiceProfileProtocolSettingsArgs protocolSettings) {
            return protocolSettings(Output.of(protocolSettings));
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

        public Builder tfid(@Nullable Output<String> tfid) {
            $.tfid = tfid;
            return this;
        }

        public Builder tfid(String tfid) {
            return tfid(Output.of(tfid));
        }

        public TlsServiceProfileState build() {
            return $;
        }
    }

}
