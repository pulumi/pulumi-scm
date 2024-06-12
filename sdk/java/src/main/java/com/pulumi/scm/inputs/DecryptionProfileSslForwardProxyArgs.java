// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DecryptionProfileSslForwardProxyArgs extends com.pulumi.resources.ResourceArgs {

    public static final DecryptionProfileSslForwardProxyArgs Empty = new DecryptionProfileSslForwardProxyArgs();

    /**
     * The AutoIncludeAltname param. Default: `false`.
     * 
     */
    @Import(name="autoIncludeAltname")
    private @Nullable Output<Boolean> autoIncludeAltname;

    /**
     * @return The AutoIncludeAltname param. Default: `false`.
     * 
     */
    public Optional<Output<Boolean>> autoIncludeAltname() {
        return Optional.ofNullable(this.autoIncludeAltname);
    }

    /**
     * The BlockClientCert param. Default: `false`.
     * 
     */
    @Import(name="blockClientCert")
    private @Nullable Output<Boolean> blockClientCert;

    /**
     * @return The BlockClientCert param. Default: `false`.
     * 
     */
    public Optional<Output<Boolean>> blockClientCert() {
        return Optional.ofNullable(this.blockClientCert);
    }

    /**
     * The BlockExpiredCertificate param. Default: `false`.
     * 
     */
    @Import(name="blockExpiredCertificate")
    private @Nullable Output<Boolean> blockExpiredCertificate;

    /**
     * @return The BlockExpiredCertificate param. Default: `false`.
     * 
     */
    public Optional<Output<Boolean>> blockExpiredCertificate() {
        return Optional.ofNullable(this.blockExpiredCertificate);
    }

    /**
     * The BlockTimeoutCert param. Default: `false`.
     * 
     */
    @Import(name="blockTimeoutCert")
    private @Nullable Output<Boolean> blockTimeoutCert;

    /**
     * @return The BlockTimeoutCert param. Default: `false`.
     * 
     */
    public Optional<Output<Boolean>> blockTimeoutCert() {
        return Optional.ofNullable(this.blockTimeoutCert);
    }

    /**
     * The BlockTls13DowngradeNoResource param. Default: `false`.
     * 
     */
    @Import(name="blockTls13DowngradeNoResource")
    private @Nullable Output<Boolean> blockTls13DowngradeNoResource;

    /**
     * @return The BlockTls13DowngradeNoResource param. Default: `false`.
     * 
     */
    public Optional<Output<Boolean>> blockTls13DowngradeNoResource() {
        return Optional.ofNullable(this.blockTls13DowngradeNoResource);
    }

    /**
     * The BlockUnknownCert param. Default: `false`.
     * 
     */
    @Import(name="blockUnknownCert")
    private @Nullable Output<Boolean> blockUnknownCert;

    /**
     * @return The BlockUnknownCert param. Default: `false`.
     * 
     */
    public Optional<Output<Boolean>> blockUnknownCert() {
        return Optional.ofNullable(this.blockUnknownCert);
    }

    /**
     * The BlockUnsupportedCipher param. Default: `false`.
     * 
     */
    @Import(name="blockUnsupportedCipher")
    private @Nullable Output<Boolean> blockUnsupportedCipher;

    /**
     * @return The BlockUnsupportedCipher param. Default: `false`.
     * 
     */
    public Optional<Output<Boolean>> blockUnsupportedCipher() {
        return Optional.ofNullable(this.blockUnsupportedCipher);
    }

    /**
     * The BlockUnsupportedVersion param. Default: `false`.
     * 
     */
    @Import(name="blockUnsupportedVersion")
    private @Nullable Output<Boolean> blockUnsupportedVersion;

    /**
     * @return The BlockUnsupportedVersion param. Default: `false`.
     * 
     */
    public Optional<Output<Boolean>> blockUnsupportedVersion() {
        return Optional.ofNullable(this.blockUnsupportedVersion);
    }

    /**
     * The BlockUntrustedIssuer param. Default: `false`.
     * 
     */
    @Import(name="blockUntrustedIssuer")
    private @Nullable Output<Boolean> blockUntrustedIssuer;

    /**
     * @return The BlockUntrustedIssuer param. Default: `false`.
     * 
     */
    public Optional<Output<Boolean>> blockUntrustedIssuer() {
        return Optional.ofNullable(this.blockUntrustedIssuer);
    }

    /**
     * The RestrictCertExts param. Default: `false`.
     * 
     */
    @Import(name="restrictCertExts")
    private @Nullable Output<Boolean> restrictCertExts;

    /**
     * @return The RestrictCertExts param. Default: `false`.
     * 
     */
    public Optional<Output<Boolean>> restrictCertExts() {
        return Optional.ofNullable(this.restrictCertExts);
    }

    /**
     * The StripAlpn param. Default: `false`.
     * 
     */
    @Import(name="stripAlpn")
    private @Nullable Output<Boolean> stripAlpn;

    /**
     * @return The StripAlpn param. Default: `false`.
     * 
     */
    public Optional<Output<Boolean>> stripAlpn() {
        return Optional.ofNullable(this.stripAlpn);
    }

    private DecryptionProfileSslForwardProxyArgs() {}

    private DecryptionProfileSslForwardProxyArgs(DecryptionProfileSslForwardProxyArgs $) {
        this.autoIncludeAltname = $.autoIncludeAltname;
        this.blockClientCert = $.blockClientCert;
        this.blockExpiredCertificate = $.blockExpiredCertificate;
        this.blockTimeoutCert = $.blockTimeoutCert;
        this.blockTls13DowngradeNoResource = $.blockTls13DowngradeNoResource;
        this.blockUnknownCert = $.blockUnknownCert;
        this.blockUnsupportedCipher = $.blockUnsupportedCipher;
        this.blockUnsupportedVersion = $.blockUnsupportedVersion;
        this.blockUntrustedIssuer = $.blockUntrustedIssuer;
        this.restrictCertExts = $.restrictCertExts;
        this.stripAlpn = $.stripAlpn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DecryptionProfileSslForwardProxyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DecryptionProfileSslForwardProxyArgs $;

        public Builder() {
            $ = new DecryptionProfileSslForwardProxyArgs();
        }

        public Builder(DecryptionProfileSslForwardProxyArgs defaults) {
            $ = new DecryptionProfileSslForwardProxyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoIncludeAltname The AutoIncludeAltname param. Default: `false`.
         * 
         * @return builder
         * 
         */
        public Builder autoIncludeAltname(@Nullable Output<Boolean> autoIncludeAltname) {
            $.autoIncludeAltname = autoIncludeAltname;
            return this;
        }

        /**
         * @param autoIncludeAltname The AutoIncludeAltname param. Default: `false`.
         * 
         * @return builder
         * 
         */
        public Builder autoIncludeAltname(Boolean autoIncludeAltname) {
            return autoIncludeAltname(Output.of(autoIncludeAltname));
        }

        /**
         * @param blockClientCert The BlockClientCert param. Default: `false`.
         * 
         * @return builder
         * 
         */
        public Builder blockClientCert(@Nullable Output<Boolean> blockClientCert) {
            $.blockClientCert = blockClientCert;
            return this;
        }

        /**
         * @param blockClientCert The BlockClientCert param. Default: `false`.
         * 
         * @return builder
         * 
         */
        public Builder blockClientCert(Boolean blockClientCert) {
            return blockClientCert(Output.of(blockClientCert));
        }

        /**
         * @param blockExpiredCertificate The BlockExpiredCertificate param. Default: `false`.
         * 
         * @return builder
         * 
         */
        public Builder blockExpiredCertificate(@Nullable Output<Boolean> blockExpiredCertificate) {
            $.blockExpiredCertificate = blockExpiredCertificate;
            return this;
        }

        /**
         * @param blockExpiredCertificate The BlockExpiredCertificate param. Default: `false`.
         * 
         * @return builder
         * 
         */
        public Builder blockExpiredCertificate(Boolean blockExpiredCertificate) {
            return blockExpiredCertificate(Output.of(blockExpiredCertificate));
        }

        /**
         * @param blockTimeoutCert The BlockTimeoutCert param. Default: `false`.
         * 
         * @return builder
         * 
         */
        public Builder blockTimeoutCert(@Nullable Output<Boolean> blockTimeoutCert) {
            $.blockTimeoutCert = blockTimeoutCert;
            return this;
        }

        /**
         * @param blockTimeoutCert The BlockTimeoutCert param. Default: `false`.
         * 
         * @return builder
         * 
         */
        public Builder blockTimeoutCert(Boolean blockTimeoutCert) {
            return blockTimeoutCert(Output.of(blockTimeoutCert));
        }

        /**
         * @param blockTls13DowngradeNoResource The BlockTls13DowngradeNoResource param. Default: `false`.
         * 
         * @return builder
         * 
         */
        public Builder blockTls13DowngradeNoResource(@Nullable Output<Boolean> blockTls13DowngradeNoResource) {
            $.blockTls13DowngradeNoResource = blockTls13DowngradeNoResource;
            return this;
        }

        /**
         * @param blockTls13DowngradeNoResource The BlockTls13DowngradeNoResource param. Default: `false`.
         * 
         * @return builder
         * 
         */
        public Builder blockTls13DowngradeNoResource(Boolean blockTls13DowngradeNoResource) {
            return blockTls13DowngradeNoResource(Output.of(blockTls13DowngradeNoResource));
        }

        /**
         * @param blockUnknownCert The BlockUnknownCert param. Default: `false`.
         * 
         * @return builder
         * 
         */
        public Builder blockUnknownCert(@Nullable Output<Boolean> blockUnknownCert) {
            $.blockUnknownCert = blockUnknownCert;
            return this;
        }

        /**
         * @param blockUnknownCert The BlockUnknownCert param. Default: `false`.
         * 
         * @return builder
         * 
         */
        public Builder blockUnknownCert(Boolean blockUnknownCert) {
            return blockUnknownCert(Output.of(blockUnknownCert));
        }

        /**
         * @param blockUnsupportedCipher The BlockUnsupportedCipher param. Default: `false`.
         * 
         * @return builder
         * 
         */
        public Builder blockUnsupportedCipher(@Nullable Output<Boolean> blockUnsupportedCipher) {
            $.blockUnsupportedCipher = blockUnsupportedCipher;
            return this;
        }

        /**
         * @param blockUnsupportedCipher The BlockUnsupportedCipher param. Default: `false`.
         * 
         * @return builder
         * 
         */
        public Builder blockUnsupportedCipher(Boolean blockUnsupportedCipher) {
            return blockUnsupportedCipher(Output.of(blockUnsupportedCipher));
        }

        /**
         * @param blockUnsupportedVersion The BlockUnsupportedVersion param. Default: `false`.
         * 
         * @return builder
         * 
         */
        public Builder blockUnsupportedVersion(@Nullable Output<Boolean> blockUnsupportedVersion) {
            $.blockUnsupportedVersion = blockUnsupportedVersion;
            return this;
        }

        /**
         * @param blockUnsupportedVersion The BlockUnsupportedVersion param. Default: `false`.
         * 
         * @return builder
         * 
         */
        public Builder blockUnsupportedVersion(Boolean blockUnsupportedVersion) {
            return blockUnsupportedVersion(Output.of(blockUnsupportedVersion));
        }

        /**
         * @param blockUntrustedIssuer The BlockUntrustedIssuer param. Default: `false`.
         * 
         * @return builder
         * 
         */
        public Builder blockUntrustedIssuer(@Nullable Output<Boolean> blockUntrustedIssuer) {
            $.blockUntrustedIssuer = blockUntrustedIssuer;
            return this;
        }

        /**
         * @param blockUntrustedIssuer The BlockUntrustedIssuer param. Default: `false`.
         * 
         * @return builder
         * 
         */
        public Builder blockUntrustedIssuer(Boolean blockUntrustedIssuer) {
            return blockUntrustedIssuer(Output.of(blockUntrustedIssuer));
        }

        /**
         * @param restrictCertExts The RestrictCertExts param. Default: `false`.
         * 
         * @return builder
         * 
         */
        public Builder restrictCertExts(@Nullable Output<Boolean> restrictCertExts) {
            $.restrictCertExts = restrictCertExts;
            return this;
        }

        /**
         * @param restrictCertExts The RestrictCertExts param. Default: `false`.
         * 
         * @return builder
         * 
         */
        public Builder restrictCertExts(Boolean restrictCertExts) {
            return restrictCertExts(Output.of(restrictCertExts));
        }

        /**
         * @param stripAlpn The StripAlpn param. Default: `false`.
         * 
         * @return builder
         * 
         */
        public Builder stripAlpn(@Nullable Output<Boolean> stripAlpn) {
            $.stripAlpn = stripAlpn;
            return this;
        }

        /**
         * @param stripAlpn The StripAlpn param. Default: `false`.
         * 
         * @return builder
         * 
         */
        public Builder stripAlpn(Boolean stripAlpn) {
            return stripAlpn(Output.of(stripAlpn));
        }

        public DecryptionProfileSslForwardProxyArgs build() {
            return $;
        }
    }

}