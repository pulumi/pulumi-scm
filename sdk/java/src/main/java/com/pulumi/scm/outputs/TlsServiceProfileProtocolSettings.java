// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TlsServiceProfileProtocolSettings {
    /**
     * @return Allow authentication SHA1.
     * 
     */
    private @Nullable Boolean authAlgoSha1;
    /**
     * @return Allow authentication SHA256.
     * 
     */
    private @Nullable Boolean authAlgoSha256;
    /**
     * @return Allow authentication SHA384.
     * 
     */
    private @Nullable Boolean authAlgoSha384;
    /**
     * @return Allow algorithm 3DES.
     * 
     */
    private @Nullable Boolean encAlgo3des;
    /**
     * @return Allow algorithm AES-128-CBC.
     * 
     */
    private @Nullable Boolean encAlgoAes128Cbc;
    /**
     * @return Allow algorithm AES-128-GCM.
     * 
     */
    private @Nullable Boolean encAlgoAes128Gcm;
    /**
     * @return Allow algorithm AES-256-CBC.
     * 
     */
    private @Nullable Boolean encAlgoAes256Cbc;
    /**
     * @return Allow algorithm AES-256-GCM.
     * 
     */
    private @Nullable Boolean encAlgoAes256Gcm;
    /**
     * @return Allow algorithm RC4.
     * 
     */
    private @Nullable Boolean encAlgoRc4;
    /**
     * @return Allow algorithm DHE.
     * 
     */
    private @Nullable Boolean keyxchgAlgoDhe;
    /**
     * @return Allow algorithm ECDHE.
     * 
     */
    private @Nullable Boolean keyxchgAlgoEcdhe;
    /**
     * @return Allow algorithm RSA.
     * 
     */
    private @Nullable Boolean keyxchgAlgoRsa;
    /**
     * @return The MaxVersion param. String must be one of these: `&#34;tls1-0&#34;`, `&#34;tls1-1&#34;`, `&#34;tls1-2&#34;`, `&#34;tls1-3&#34;`, `&#34;max&#34;`. Default: `&#34;max&#34;`.
     * 
     */
    private @Nullable String maxVersion;
    /**
     * @return The MinVersion param. String must be one of these: `&#34;tls1-0&#34;`, `&#34;tls1-1&#34;`, `&#34;tls1-2&#34;`. Default: `&#34;tls1-0&#34;`.
     * 
     */
    private @Nullable String minVersion;

    private TlsServiceProfileProtocolSettings() {}
    /**
     * @return Allow authentication SHA1.
     * 
     */
    public Optional<Boolean> authAlgoSha1() {
        return Optional.ofNullable(this.authAlgoSha1);
    }
    /**
     * @return Allow authentication SHA256.
     * 
     */
    public Optional<Boolean> authAlgoSha256() {
        return Optional.ofNullable(this.authAlgoSha256);
    }
    /**
     * @return Allow authentication SHA384.
     * 
     */
    public Optional<Boolean> authAlgoSha384() {
        return Optional.ofNullable(this.authAlgoSha384);
    }
    /**
     * @return Allow algorithm 3DES.
     * 
     */
    public Optional<Boolean> encAlgo3des() {
        return Optional.ofNullable(this.encAlgo3des);
    }
    /**
     * @return Allow algorithm AES-128-CBC.
     * 
     */
    public Optional<Boolean> encAlgoAes128Cbc() {
        return Optional.ofNullable(this.encAlgoAes128Cbc);
    }
    /**
     * @return Allow algorithm AES-128-GCM.
     * 
     */
    public Optional<Boolean> encAlgoAes128Gcm() {
        return Optional.ofNullable(this.encAlgoAes128Gcm);
    }
    /**
     * @return Allow algorithm AES-256-CBC.
     * 
     */
    public Optional<Boolean> encAlgoAes256Cbc() {
        return Optional.ofNullable(this.encAlgoAes256Cbc);
    }
    /**
     * @return Allow algorithm AES-256-GCM.
     * 
     */
    public Optional<Boolean> encAlgoAes256Gcm() {
        return Optional.ofNullable(this.encAlgoAes256Gcm);
    }
    /**
     * @return Allow algorithm RC4.
     * 
     */
    public Optional<Boolean> encAlgoRc4() {
        return Optional.ofNullable(this.encAlgoRc4);
    }
    /**
     * @return Allow algorithm DHE.
     * 
     */
    public Optional<Boolean> keyxchgAlgoDhe() {
        return Optional.ofNullable(this.keyxchgAlgoDhe);
    }
    /**
     * @return Allow algorithm ECDHE.
     * 
     */
    public Optional<Boolean> keyxchgAlgoEcdhe() {
        return Optional.ofNullable(this.keyxchgAlgoEcdhe);
    }
    /**
     * @return Allow algorithm RSA.
     * 
     */
    public Optional<Boolean> keyxchgAlgoRsa() {
        return Optional.ofNullable(this.keyxchgAlgoRsa);
    }
    /**
     * @return The MaxVersion param. String must be one of these: `&#34;tls1-0&#34;`, `&#34;tls1-1&#34;`, `&#34;tls1-2&#34;`, `&#34;tls1-3&#34;`, `&#34;max&#34;`. Default: `&#34;max&#34;`.
     * 
     */
    public Optional<String> maxVersion() {
        return Optional.ofNullable(this.maxVersion);
    }
    /**
     * @return The MinVersion param. String must be one of these: `&#34;tls1-0&#34;`, `&#34;tls1-1&#34;`, `&#34;tls1-2&#34;`. Default: `&#34;tls1-0&#34;`.
     * 
     */
    public Optional<String> minVersion() {
        return Optional.ofNullable(this.minVersion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TlsServiceProfileProtocolSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean authAlgoSha1;
        private @Nullable Boolean authAlgoSha256;
        private @Nullable Boolean authAlgoSha384;
        private @Nullable Boolean encAlgo3des;
        private @Nullable Boolean encAlgoAes128Cbc;
        private @Nullable Boolean encAlgoAes128Gcm;
        private @Nullable Boolean encAlgoAes256Cbc;
        private @Nullable Boolean encAlgoAes256Gcm;
        private @Nullable Boolean encAlgoRc4;
        private @Nullable Boolean keyxchgAlgoDhe;
        private @Nullable Boolean keyxchgAlgoEcdhe;
        private @Nullable Boolean keyxchgAlgoRsa;
        private @Nullable String maxVersion;
        private @Nullable String minVersion;
        public Builder() {}
        public Builder(TlsServiceProfileProtocolSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authAlgoSha1 = defaults.authAlgoSha1;
    	      this.authAlgoSha256 = defaults.authAlgoSha256;
    	      this.authAlgoSha384 = defaults.authAlgoSha384;
    	      this.encAlgo3des = defaults.encAlgo3des;
    	      this.encAlgoAes128Cbc = defaults.encAlgoAes128Cbc;
    	      this.encAlgoAes128Gcm = defaults.encAlgoAes128Gcm;
    	      this.encAlgoAes256Cbc = defaults.encAlgoAes256Cbc;
    	      this.encAlgoAes256Gcm = defaults.encAlgoAes256Gcm;
    	      this.encAlgoRc4 = defaults.encAlgoRc4;
    	      this.keyxchgAlgoDhe = defaults.keyxchgAlgoDhe;
    	      this.keyxchgAlgoEcdhe = defaults.keyxchgAlgoEcdhe;
    	      this.keyxchgAlgoRsa = defaults.keyxchgAlgoRsa;
    	      this.maxVersion = defaults.maxVersion;
    	      this.minVersion = defaults.minVersion;
        }

        @CustomType.Setter
        public Builder authAlgoSha1(@Nullable Boolean authAlgoSha1) {

            this.authAlgoSha1 = authAlgoSha1;
            return this;
        }
        @CustomType.Setter
        public Builder authAlgoSha256(@Nullable Boolean authAlgoSha256) {

            this.authAlgoSha256 = authAlgoSha256;
            return this;
        }
        @CustomType.Setter
        public Builder authAlgoSha384(@Nullable Boolean authAlgoSha384) {

            this.authAlgoSha384 = authAlgoSha384;
            return this;
        }
        @CustomType.Setter
        public Builder encAlgo3des(@Nullable Boolean encAlgo3des) {

            this.encAlgo3des = encAlgo3des;
            return this;
        }
        @CustomType.Setter
        public Builder encAlgoAes128Cbc(@Nullable Boolean encAlgoAes128Cbc) {

            this.encAlgoAes128Cbc = encAlgoAes128Cbc;
            return this;
        }
        @CustomType.Setter
        public Builder encAlgoAes128Gcm(@Nullable Boolean encAlgoAes128Gcm) {

            this.encAlgoAes128Gcm = encAlgoAes128Gcm;
            return this;
        }
        @CustomType.Setter
        public Builder encAlgoAes256Cbc(@Nullable Boolean encAlgoAes256Cbc) {

            this.encAlgoAes256Cbc = encAlgoAes256Cbc;
            return this;
        }
        @CustomType.Setter
        public Builder encAlgoAes256Gcm(@Nullable Boolean encAlgoAes256Gcm) {

            this.encAlgoAes256Gcm = encAlgoAes256Gcm;
            return this;
        }
        @CustomType.Setter
        public Builder encAlgoRc4(@Nullable Boolean encAlgoRc4) {

            this.encAlgoRc4 = encAlgoRc4;
            return this;
        }
        @CustomType.Setter
        public Builder keyxchgAlgoDhe(@Nullable Boolean keyxchgAlgoDhe) {

            this.keyxchgAlgoDhe = keyxchgAlgoDhe;
            return this;
        }
        @CustomType.Setter
        public Builder keyxchgAlgoEcdhe(@Nullable Boolean keyxchgAlgoEcdhe) {

            this.keyxchgAlgoEcdhe = keyxchgAlgoEcdhe;
            return this;
        }
        @CustomType.Setter
        public Builder keyxchgAlgoRsa(@Nullable Boolean keyxchgAlgoRsa) {

            this.keyxchgAlgoRsa = keyxchgAlgoRsa;
            return this;
        }
        @CustomType.Setter
        public Builder maxVersion(@Nullable String maxVersion) {

            this.maxVersion = maxVersion;
            return this;
        }
        @CustomType.Setter
        public Builder minVersion(@Nullable String minVersion) {

            this.minVersion = minVersion;
            return this;
        }
        public TlsServiceProfileProtocolSettings build() {
            final var _resultValue = new TlsServiceProfileProtocolSettings();
            _resultValue.authAlgoSha1 = authAlgoSha1;
            _resultValue.authAlgoSha256 = authAlgoSha256;
            _resultValue.authAlgoSha384 = authAlgoSha384;
            _resultValue.encAlgo3des = encAlgo3des;
            _resultValue.encAlgoAes128Cbc = encAlgoAes128Cbc;
            _resultValue.encAlgoAes128Gcm = encAlgoAes128Gcm;
            _resultValue.encAlgoAes256Cbc = encAlgoAes256Cbc;
            _resultValue.encAlgoAes256Gcm = encAlgoAes256Gcm;
            _resultValue.encAlgoRc4 = encAlgoRc4;
            _resultValue.keyxchgAlgoDhe = keyxchgAlgoDhe;
            _resultValue.keyxchgAlgoEcdhe = keyxchgAlgoEcdhe;
            _resultValue.keyxchgAlgoRsa = keyxchgAlgoRsa;
            _resultValue.maxVersion = maxVersion;
            _resultValue.minVersion = minVersion;
            return _resultValue;
        }
    }
}