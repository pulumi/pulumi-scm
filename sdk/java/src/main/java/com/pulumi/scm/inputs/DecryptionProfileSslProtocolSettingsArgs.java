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


public final class DecryptionProfileSslProtocolSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final DecryptionProfileSslProtocolSettingsArgs Empty = new DecryptionProfileSslProtocolSettingsArgs();

    /**
     * The AuthAlgoMd5 param. Default: `true`.
     * 
     */
    @Import(name="authAlgoMd5")
    private @Nullable Output<Boolean> authAlgoMd5;

    /**
     * @return The AuthAlgoMd5 param. Default: `true`.
     * 
     */
    public Optional<Output<Boolean>> authAlgoMd5() {
        return Optional.ofNullable(this.authAlgoMd5);
    }

    /**
     * The AuthAlgoSha1 param. Default: `true`.
     * 
     */
    @Import(name="authAlgoSha1")
    private @Nullable Output<Boolean> authAlgoSha1;

    /**
     * @return The AuthAlgoSha1 param. Default: `true`.
     * 
     */
    public Optional<Output<Boolean>> authAlgoSha1() {
        return Optional.ofNullable(this.authAlgoSha1);
    }

    /**
     * The AuthAlgoSha256 param. Default: `true`.
     * 
     */
    @Import(name="authAlgoSha256")
    private @Nullable Output<Boolean> authAlgoSha256;

    /**
     * @return The AuthAlgoSha256 param. Default: `true`.
     * 
     */
    public Optional<Output<Boolean>> authAlgoSha256() {
        return Optional.ofNullable(this.authAlgoSha256);
    }

    /**
     * The AuthAlgoSha384 param. Default: `true`.
     * 
     */
    @Import(name="authAlgoSha384")
    private @Nullable Output<Boolean> authAlgoSha384;

    /**
     * @return The AuthAlgoSha384 param. Default: `true`.
     * 
     */
    public Optional<Output<Boolean>> authAlgoSha384() {
        return Optional.ofNullable(this.authAlgoSha384);
    }

    /**
     * The EncAlgo3des param. Default: `true`.
     * 
     */
    @Import(name="encAlgo3des")
    private @Nullable Output<Boolean> encAlgo3des;

    /**
     * @return The EncAlgo3des param. Default: `true`.
     * 
     */
    public Optional<Output<Boolean>> encAlgo3des() {
        return Optional.ofNullable(this.encAlgo3des);
    }

    /**
     * The EncAlgoAes128Cbc param. Default: `true`.
     * 
     */
    @Import(name="encAlgoAes128Cbc")
    private @Nullable Output<Boolean> encAlgoAes128Cbc;

    /**
     * @return The EncAlgoAes128Cbc param. Default: `true`.
     * 
     */
    public Optional<Output<Boolean>> encAlgoAes128Cbc() {
        return Optional.ofNullable(this.encAlgoAes128Cbc);
    }

    /**
     * The EncAlgoAes128Gcm param. Default: `true`.
     * 
     */
    @Import(name="encAlgoAes128Gcm")
    private @Nullable Output<Boolean> encAlgoAes128Gcm;

    /**
     * @return The EncAlgoAes128Gcm param. Default: `true`.
     * 
     */
    public Optional<Output<Boolean>> encAlgoAes128Gcm() {
        return Optional.ofNullable(this.encAlgoAes128Gcm);
    }

    /**
     * The EncAlgoAes256Cbc param. Default: `true`.
     * 
     */
    @Import(name="encAlgoAes256Cbc")
    private @Nullable Output<Boolean> encAlgoAes256Cbc;

    /**
     * @return The EncAlgoAes256Cbc param. Default: `true`.
     * 
     */
    public Optional<Output<Boolean>> encAlgoAes256Cbc() {
        return Optional.ofNullable(this.encAlgoAes256Cbc);
    }

    /**
     * The EncAlgoAes256Gcm param. Default: `true`.
     * 
     */
    @Import(name="encAlgoAes256Gcm")
    private @Nullable Output<Boolean> encAlgoAes256Gcm;

    /**
     * @return The EncAlgoAes256Gcm param. Default: `true`.
     * 
     */
    public Optional<Output<Boolean>> encAlgoAes256Gcm() {
        return Optional.ofNullable(this.encAlgoAes256Gcm);
    }

    /**
     * The EncAlgoChacha20Poly1305 param. Default: `true`.
     * 
     */
    @Import(name="encAlgoChacha20Poly1305")
    private @Nullable Output<Boolean> encAlgoChacha20Poly1305;

    /**
     * @return The EncAlgoChacha20Poly1305 param. Default: `true`.
     * 
     */
    public Optional<Output<Boolean>> encAlgoChacha20Poly1305() {
        return Optional.ofNullable(this.encAlgoChacha20Poly1305);
    }

    /**
     * The EncAlgoRc4 param. Default: `true`.
     * 
     */
    @Import(name="encAlgoRc4")
    private @Nullable Output<Boolean> encAlgoRc4;

    /**
     * @return The EncAlgoRc4 param. Default: `true`.
     * 
     */
    public Optional<Output<Boolean>> encAlgoRc4() {
        return Optional.ofNullable(this.encAlgoRc4);
    }

    /**
     * The KeyxchgAlgoDhe param. Default: `true`.
     * 
     */
    @Import(name="keyxchgAlgoDhe")
    private @Nullable Output<Boolean> keyxchgAlgoDhe;

    /**
     * @return The KeyxchgAlgoDhe param. Default: `true`.
     * 
     */
    public Optional<Output<Boolean>> keyxchgAlgoDhe() {
        return Optional.ofNullable(this.keyxchgAlgoDhe);
    }

    /**
     * The KeyxchgAlgoEcdhe param. Default: `true`.
     * 
     */
    @Import(name="keyxchgAlgoEcdhe")
    private @Nullable Output<Boolean> keyxchgAlgoEcdhe;

    /**
     * @return The KeyxchgAlgoEcdhe param. Default: `true`.
     * 
     */
    public Optional<Output<Boolean>> keyxchgAlgoEcdhe() {
        return Optional.ofNullable(this.keyxchgAlgoEcdhe);
    }

    /**
     * The KeyxchgAlgoRsa param. Default: `true`.
     * 
     */
    @Import(name="keyxchgAlgoRsa")
    private @Nullable Output<Boolean> keyxchgAlgoRsa;

    /**
     * @return The KeyxchgAlgoRsa param. Default: `true`.
     * 
     */
    public Optional<Output<Boolean>> keyxchgAlgoRsa() {
        return Optional.ofNullable(this.keyxchgAlgoRsa);
    }

    /**
     * The MaxVersion param. String must be one of these: `&#34;sslv3&#34;`, `&#34;tls1-0&#34;`, `&#34;tls1-1&#34;`, `&#34;tls1-2&#34;`, `&#34;tls1-3&#34;`, `&#34;max&#34;`. Default: `&#34;tls1-2&#34;`.
     * 
     */
    @Import(name="maxVersion")
    private @Nullable Output<String> maxVersion;

    /**
     * @return The MaxVersion param. String must be one of these: `&#34;sslv3&#34;`, `&#34;tls1-0&#34;`, `&#34;tls1-1&#34;`, `&#34;tls1-2&#34;`, `&#34;tls1-3&#34;`, `&#34;max&#34;`. Default: `&#34;tls1-2&#34;`.
     * 
     */
    public Optional<Output<String>> maxVersion() {
        return Optional.ofNullable(this.maxVersion);
    }

    /**
     * The MinVersion param. String must be one of these: `&#34;sslv3&#34;`, `&#34;tls1-0&#34;`, `&#34;tls1-1&#34;`, `&#34;tls1-2&#34;`, `&#34;tls1-3&#34;`. Default: `&#34;tls1-0&#34;`.
     * 
     */
    @Import(name="minVersion")
    private @Nullable Output<String> minVersion;

    /**
     * @return The MinVersion param. String must be one of these: `&#34;sslv3&#34;`, `&#34;tls1-0&#34;`, `&#34;tls1-1&#34;`, `&#34;tls1-2&#34;`, `&#34;tls1-3&#34;`. Default: `&#34;tls1-0&#34;`.
     * 
     */
    public Optional<Output<String>> minVersion() {
        return Optional.ofNullable(this.minVersion);
    }

    private DecryptionProfileSslProtocolSettingsArgs() {}

    private DecryptionProfileSslProtocolSettingsArgs(DecryptionProfileSslProtocolSettingsArgs $) {
        this.authAlgoMd5 = $.authAlgoMd5;
        this.authAlgoSha1 = $.authAlgoSha1;
        this.authAlgoSha256 = $.authAlgoSha256;
        this.authAlgoSha384 = $.authAlgoSha384;
        this.encAlgo3des = $.encAlgo3des;
        this.encAlgoAes128Cbc = $.encAlgoAes128Cbc;
        this.encAlgoAes128Gcm = $.encAlgoAes128Gcm;
        this.encAlgoAes256Cbc = $.encAlgoAes256Cbc;
        this.encAlgoAes256Gcm = $.encAlgoAes256Gcm;
        this.encAlgoChacha20Poly1305 = $.encAlgoChacha20Poly1305;
        this.encAlgoRc4 = $.encAlgoRc4;
        this.keyxchgAlgoDhe = $.keyxchgAlgoDhe;
        this.keyxchgAlgoEcdhe = $.keyxchgAlgoEcdhe;
        this.keyxchgAlgoRsa = $.keyxchgAlgoRsa;
        this.maxVersion = $.maxVersion;
        this.minVersion = $.minVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DecryptionProfileSslProtocolSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DecryptionProfileSslProtocolSettingsArgs $;

        public Builder() {
            $ = new DecryptionProfileSslProtocolSettingsArgs();
        }

        public Builder(DecryptionProfileSslProtocolSettingsArgs defaults) {
            $ = new DecryptionProfileSslProtocolSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authAlgoMd5 The AuthAlgoMd5 param. Default: `true`.
         * 
         * @return builder
         * 
         */
        public Builder authAlgoMd5(@Nullable Output<Boolean> authAlgoMd5) {
            $.authAlgoMd5 = authAlgoMd5;
            return this;
        }

        /**
         * @param authAlgoMd5 The AuthAlgoMd5 param. Default: `true`.
         * 
         * @return builder
         * 
         */
        public Builder authAlgoMd5(Boolean authAlgoMd5) {
            return authAlgoMd5(Output.of(authAlgoMd5));
        }

        /**
         * @param authAlgoSha1 The AuthAlgoSha1 param. Default: `true`.
         * 
         * @return builder
         * 
         */
        public Builder authAlgoSha1(@Nullable Output<Boolean> authAlgoSha1) {
            $.authAlgoSha1 = authAlgoSha1;
            return this;
        }

        /**
         * @param authAlgoSha1 The AuthAlgoSha1 param. Default: `true`.
         * 
         * @return builder
         * 
         */
        public Builder authAlgoSha1(Boolean authAlgoSha1) {
            return authAlgoSha1(Output.of(authAlgoSha1));
        }

        /**
         * @param authAlgoSha256 The AuthAlgoSha256 param. Default: `true`.
         * 
         * @return builder
         * 
         */
        public Builder authAlgoSha256(@Nullable Output<Boolean> authAlgoSha256) {
            $.authAlgoSha256 = authAlgoSha256;
            return this;
        }

        /**
         * @param authAlgoSha256 The AuthAlgoSha256 param. Default: `true`.
         * 
         * @return builder
         * 
         */
        public Builder authAlgoSha256(Boolean authAlgoSha256) {
            return authAlgoSha256(Output.of(authAlgoSha256));
        }

        /**
         * @param authAlgoSha384 The AuthAlgoSha384 param. Default: `true`.
         * 
         * @return builder
         * 
         */
        public Builder authAlgoSha384(@Nullable Output<Boolean> authAlgoSha384) {
            $.authAlgoSha384 = authAlgoSha384;
            return this;
        }

        /**
         * @param authAlgoSha384 The AuthAlgoSha384 param. Default: `true`.
         * 
         * @return builder
         * 
         */
        public Builder authAlgoSha384(Boolean authAlgoSha384) {
            return authAlgoSha384(Output.of(authAlgoSha384));
        }

        /**
         * @param encAlgo3des The EncAlgo3des param. Default: `true`.
         * 
         * @return builder
         * 
         */
        public Builder encAlgo3des(@Nullable Output<Boolean> encAlgo3des) {
            $.encAlgo3des = encAlgo3des;
            return this;
        }

        /**
         * @param encAlgo3des The EncAlgo3des param. Default: `true`.
         * 
         * @return builder
         * 
         */
        public Builder encAlgo3des(Boolean encAlgo3des) {
            return encAlgo3des(Output.of(encAlgo3des));
        }

        /**
         * @param encAlgoAes128Cbc The EncAlgoAes128Cbc param. Default: `true`.
         * 
         * @return builder
         * 
         */
        public Builder encAlgoAes128Cbc(@Nullable Output<Boolean> encAlgoAes128Cbc) {
            $.encAlgoAes128Cbc = encAlgoAes128Cbc;
            return this;
        }

        /**
         * @param encAlgoAes128Cbc The EncAlgoAes128Cbc param. Default: `true`.
         * 
         * @return builder
         * 
         */
        public Builder encAlgoAes128Cbc(Boolean encAlgoAes128Cbc) {
            return encAlgoAes128Cbc(Output.of(encAlgoAes128Cbc));
        }

        /**
         * @param encAlgoAes128Gcm The EncAlgoAes128Gcm param. Default: `true`.
         * 
         * @return builder
         * 
         */
        public Builder encAlgoAes128Gcm(@Nullable Output<Boolean> encAlgoAes128Gcm) {
            $.encAlgoAes128Gcm = encAlgoAes128Gcm;
            return this;
        }

        /**
         * @param encAlgoAes128Gcm The EncAlgoAes128Gcm param. Default: `true`.
         * 
         * @return builder
         * 
         */
        public Builder encAlgoAes128Gcm(Boolean encAlgoAes128Gcm) {
            return encAlgoAes128Gcm(Output.of(encAlgoAes128Gcm));
        }

        /**
         * @param encAlgoAes256Cbc The EncAlgoAes256Cbc param. Default: `true`.
         * 
         * @return builder
         * 
         */
        public Builder encAlgoAes256Cbc(@Nullable Output<Boolean> encAlgoAes256Cbc) {
            $.encAlgoAes256Cbc = encAlgoAes256Cbc;
            return this;
        }

        /**
         * @param encAlgoAes256Cbc The EncAlgoAes256Cbc param. Default: `true`.
         * 
         * @return builder
         * 
         */
        public Builder encAlgoAes256Cbc(Boolean encAlgoAes256Cbc) {
            return encAlgoAes256Cbc(Output.of(encAlgoAes256Cbc));
        }

        /**
         * @param encAlgoAes256Gcm The EncAlgoAes256Gcm param. Default: `true`.
         * 
         * @return builder
         * 
         */
        public Builder encAlgoAes256Gcm(@Nullable Output<Boolean> encAlgoAes256Gcm) {
            $.encAlgoAes256Gcm = encAlgoAes256Gcm;
            return this;
        }

        /**
         * @param encAlgoAes256Gcm The EncAlgoAes256Gcm param. Default: `true`.
         * 
         * @return builder
         * 
         */
        public Builder encAlgoAes256Gcm(Boolean encAlgoAes256Gcm) {
            return encAlgoAes256Gcm(Output.of(encAlgoAes256Gcm));
        }

        /**
         * @param encAlgoChacha20Poly1305 The EncAlgoChacha20Poly1305 param. Default: `true`.
         * 
         * @return builder
         * 
         */
        public Builder encAlgoChacha20Poly1305(@Nullable Output<Boolean> encAlgoChacha20Poly1305) {
            $.encAlgoChacha20Poly1305 = encAlgoChacha20Poly1305;
            return this;
        }

        /**
         * @param encAlgoChacha20Poly1305 The EncAlgoChacha20Poly1305 param. Default: `true`.
         * 
         * @return builder
         * 
         */
        public Builder encAlgoChacha20Poly1305(Boolean encAlgoChacha20Poly1305) {
            return encAlgoChacha20Poly1305(Output.of(encAlgoChacha20Poly1305));
        }

        /**
         * @param encAlgoRc4 The EncAlgoRc4 param. Default: `true`.
         * 
         * @return builder
         * 
         */
        public Builder encAlgoRc4(@Nullable Output<Boolean> encAlgoRc4) {
            $.encAlgoRc4 = encAlgoRc4;
            return this;
        }

        /**
         * @param encAlgoRc4 The EncAlgoRc4 param. Default: `true`.
         * 
         * @return builder
         * 
         */
        public Builder encAlgoRc4(Boolean encAlgoRc4) {
            return encAlgoRc4(Output.of(encAlgoRc4));
        }

        /**
         * @param keyxchgAlgoDhe The KeyxchgAlgoDhe param. Default: `true`.
         * 
         * @return builder
         * 
         */
        public Builder keyxchgAlgoDhe(@Nullable Output<Boolean> keyxchgAlgoDhe) {
            $.keyxchgAlgoDhe = keyxchgAlgoDhe;
            return this;
        }

        /**
         * @param keyxchgAlgoDhe The KeyxchgAlgoDhe param. Default: `true`.
         * 
         * @return builder
         * 
         */
        public Builder keyxchgAlgoDhe(Boolean keyxchgAlgoDhe) {
            return keyxchgAlgoDhe(Output.of(keyxchgAlgoDhe));
        }

        /**
         * @param keyxchgAlgoEcdhe The KeyxchgAlgoEcdhe param. Default: `true`.
         * 
         * @return builder
         * 
         */
        public Builder keyxchgAlgoEcdhe(@Nullable Output<Boolean> keyxchgAlgoEcdhe) {
            $.keyxchgAlgoEcdhe = keyxchgAlgoEcdhe;
            return this;
        }

        /**
         * @param keyxchgAlgoEcdhe The KeyxchgAlgoEcdhe param. Default: `true`.
         * 
         * @return builder
         * 
         */
        public Builder keyxchgAlgoEcdhe(Boolean keyxchgAlgoEcdhe) {
            return keyxchgAlgoEcdhe(Output.of(keyxchgAlgoEcdhe));
        }

        /**
         * @param keyxchgAlgoRsa The KeyxchgAlgoRsa param. Default: `true`.
         * 
         * @return builder
         * 
         */
        public Builder keyxchgAlgoRsa(@Nullable Output<Boolean> keyxchgAlgoRsa) {
            $.keyxchgAlgoRsa = keyxchgAlgoRsa;
            return this;
        }

        /**
         * @param keyxchgAlgoRsa The KeyxchgAlgoRsa param. Default: `true`.
         * 
         * @return builder
         * 
         */
        public Builder keyxchgAlgoRsa(Boolean keyxchgAlgoRsa) {
            return keyxchgAlgoRsa(Output.of(keyxchgAlgoRsa));
        }

        /**
         * @param maxVersion The MaxVersion param. String must be one of these: `&#34;sslv3&#34;`, `&#34;tls1-0&#34;`, `&#34;tls1-1&#34;`, `&#34;tls1-2&#34;`, `&#34;tls1-3&#34;`, `&#34;max&#34;`. Default: `&#34;tls1-2&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder maxVersion(@Nullable Output<String> maxVersion) {
            $.maxVersion = maxVersion;
            return this;
        }

        /**
         * @param maxVersion The MaxVersion param. String must be one of these: `&#34;sslv3&#34;`, `&#34;tls1-0&#34;`, `&#34;tls1-1&#34;`, `&#34;tls1-2&#34;`, `&#34;tls1-3&#34;`, `&#34;max&#34;`. Default: `&#34;tls1-2&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder maxVersion(String maxVersion) {
            return maxVersion(Output.of(maxVersion));
        }

        /**
         * @param minVersion The MinVersion param. String must be one of these: `&#34;sslv3&#34;`, `&#34;tls1-0&#34;`, `&#34;tls1-1&#34;`, `&#34;tls1-2&#34;`, `&#34;tls1-3&#34;`. Default: `&#34;tls1-0&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder minVersion(@Nullable Output<String> minVersion) {
            $.minVersion = minVersion;
            return this;
        }

        /**
         * @param minVersion The MinVersion param. String must be one of these: `&#34;sslv3&#34;`, `&#34;tls1-0&#34;`, `&#34;tls1-1&#34;`, `&#34;tls1-2&#34;`, `&#34;tls1-3&#34;`. Default: `&#34;tls1-0&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder minVersion(String minVersion) {
            return minVersion(Output.of(minVersion));
        }

        public DecryptionProfileSslProtocolSettingsArgs build() {
            return $;
        }
    }

}
