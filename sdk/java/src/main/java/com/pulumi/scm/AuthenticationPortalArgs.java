// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AuthenticationPortalArgs extends com.pulumi.resources.ResourceArgs {

    public static final AuthenticationPortalArgs Empty = new AuthenticationPortalArgs();

    /**
     * The AuthenticationProfile param.
     * 
     */
    @Import(name="authenticationProfile")
    private @Nullable Output<String> authenticationProfile;

    /**
     * @return The AuthenticationProfile param.
     * 
     */
    public Optional<Output<String>> authenticationProfile() {
        return Optional.ofNullable(this.authenticationProfile);
    }

    /**
     * The CertificateProfile param.
     * 
     */
    @Import(name="certificateProfile")
    private @Nullable Output<String> certificateProfile;

    /**
     * @return The CertificateProfile param.
     * 
     */
    public Optional<Output<String>> certificateProfile() {
        return Optional.ofNullable(this.certificateProfile);
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
     * The GpUdpPort param. Value must be between 1 and 65535.
     * 
     */
    @Import(name="gpUdpPort")
    private @Nullable Output<Integer> gpUdpPort;

    /**
     * @return The GpUdpPort param. Value must be between 1 and 65535.
     * 
     */
    public Optional<Output<Integer>> gpUdpPort() {
        return Optional.ofNullable(this.gpUdpPort);
    }

    /**
     * The IdleTimer param. Value must be between 1 and 1440.
     * 
     */
    @Import(name="idleTimer")
    private @Nullable Output<Integer> idleTimer;

    /**
     * @return The IdleTimer param. Value must be between 1 and 1440.
     * 
     */
    public Optional<Output<Integer>> idleTimer() {
        return Optional.ofNullable(this.idleTimer);
    }

    /**
     * The RedirectHost param.
     * 
     */
    @Import(name="redirectHost")
    private @Nullable Output<String> redirectHost;

    /**
     * @return The RedirectHost param.
     * 
     */
    public Optional<Output<String>> redirectHost() {
        return Optional.ofNullable(this.redirectHost);
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
     * The Timer param. Value must be between 1 and 1440.
     * 
     */
    @Import(name="timer")
    private @Nullable Output<Integer> timer;

    /**
     * @return The Timer param. Value must be between 1 and 1440.
     * 
     */
    public Optional<Output<Integer>> timer() {
        return Optional.ofNullable(this.timer);
    }

    /**
     * The TlsServiceProfile param.
     * 
     */
    @Import(name="tlsServiceProfile")
    private @Nullable Output<String> tlsServiceProfile;

    /**
     * @return The TlsServiceProfile param.
     * 
     */
    public Optional<Output<String>> tlsServiceProfile() {
        return Optional.ofNullable(this.tlsServiceProfile);
    }

    private AuthenticationPortalArgs() {}

    private AuthenticationPortalArgs(AuthenticationPortalArgs $) {
        this.authenticationProfile = $.authenticationProfile;
        this.certificateProfile = $.certificateProfile;
        this.device = $.device;
        this.folder = $.folder;
        this.gpUdpPort = $.gpUdpPort;
        this.idleTimer = $.idleTimer;
        this.redirectHost = $.redirectHost;
        this.snippet = $.snippet;
        this.timer = $.timer;
        this.tlsServiceProfile = $.tlsServiceProfile;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AuthenticationPortalArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuthenticationPortalArgs $;

        public Builder() {
            $ = new AuthenticationPortalArgs();
        }

        public Builder(AuthenticationPortalArgs defaults) {
            $ = new AuthenticationPortalArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authenticationProfile The AuthenticationProfile param.
         * 
         * @return builder
         * 
         */
        public Builder authenticationProfile(@Nullable Output<String> authenticationProfile) {
            $.authenticationProfile = authenticationProfile;
            return this;
        }

        /**
         * @param authenticationProfile The AuthenticationProfile param.
         * 
         * @return builder
         * 
         */
        public Builder authenticationProfile(String authenticationProfile) {
            return authenticationProfile(Output.of(authenticationProfile));
        }

        /**
         * @param certificateProfile The CertificateProfile param.
         * 
         * @return builder
         * 
         */
        public Builder certificateProfile(@Nullable Output<String> certificateProfile) {
            $.certificateProfile = certificateProfile;
            return this;
        }

        /**
         * @param certificateProfile The CertificateProfile param.
         * 
         * @return builder
         * 
         */
        public Builder certificateProfile(String certificateProfile) {
            return certificateProfile(Output.of(certificateProfile));
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
         * @param gpUdpPort The GpUdpPort param. Value must be between 1 and 65535.
         * 
         * @return builder
         * 
         */
        public Builder gpUdpPort(@Nullable Output<Integer> gpUdpPort) {
            $.gpUdpPort = gpUdpPort;
            return this;
        }

        /**
         * @param gpUdpPort The GpUdpPort param. Value must be between 1 and 65535.
         * 
         * @return builder
         * 
         */
        public Builder gpUdpPort(Integer gpUdpPort) {
            return gpUdpPort(Output.of(gpUdpPort));
        }

        /**
         * @param idleTimer The IdleTimer param. Value must be between 1 and 1440.
         * 
         * @return builder
         * 
         */
        public Builder idleTimer(@Nullable Output<Integer> idleTimer) {
            $.idleTimer = idleTimer;
            return this;
        }

        /**
         * @param idleTimer The IdleTimer param. Value must be between 1 and 1440.
         * 
         * @return builder
         * 
         */
        public Builder idleTimer(Integer idleTimer) {
            return idleTimer(Output.of(idleTimer));
        }

        /**
         * @param redirectHost The RedirectHost param.
         * 
         * @return builder
         * 
         */
        public Builder redirectHost(@Nullable Output<String> redirectHost) {
            $.redirectHost = redirectHost;
            return this;
        }

        /**
         * @param redirectHost The RedirectHost param.
         * 
         * @return builder
         * 
         */
        public Builder redirectHost(String redirectHost) {
            return redirectHost(Output.of(redirectHost));
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
         * @param timer The Timer param. Value must be between 1 and 1440.
         * 
         * @return builder
         * 
         */
        public Builder timer(@Nullable Output<Integer> timer) {
            $.timer = timer;
            return this;
        }

        /**
         * @param timer The Timer param. Value must be between 1 and 1440.
         * 
         * @return builder
         * 
         */
        public Builder timer(Integer timer) {
            return timer(Output.of(timer));
        }

        /**
         * @param tlsServiceProfile The TlsServiceProfile param.
         * 
         * @return builder
         * 
         */
        public Builder tlsServiceProfile(@Nullable Output<String> tlsServiceProfile) {
            $.tlsServiceProfile = tlsServiceProfile;
            return this;
        }

        /**
         * @param tlsServiceProfile The TlsServiceProfile param.
         * 
         * @return builder
         * 
         */
        public Builder tlsServiceProfile(String tlsServiceProfile) {
            return tlsServiceProfile(Output.of(tlsServiceProfile));
        }

        public AuthenticationPortalArgs build() {
            return $;
        }
    }

}