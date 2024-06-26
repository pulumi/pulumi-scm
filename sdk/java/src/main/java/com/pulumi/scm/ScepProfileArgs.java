// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.inputs.ScepProfileAlgorithmArgs;
import com.pulumi.scm.inputs.ScepProfileCertificateAttributesArgs;
import com.pulumi.scm.inputs.ScepProfileScepChallengeArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ScepProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final ScepProfileArgs Empty = new ScepProfileArgs();

    /**
     * The Algorithm param.
     * 
     */
    @Import(name="algorithm")
    private @Nullable Output<ScepProfileAlgorithmArgs> algorithm;

    /**
     * @return The Algorithm param.
     * 
     */
    public Optional<Output<ScepProfileAlgorithmArgs>> algorithm() {
        return Optional.ofNullable(this.algorithm);
    }

    /**
     * The CaIdentityName param.
     * 
     */
    @Import(name="caIdentityName", required=true)
    private Output<String> caIdentityName;

    /**
     * @return The CaIdentityName param.
     * 
     */
    public Output<String> caIdentityName() {
        return this.caIdentityName;
    }

    /**
     * The CertificateAttributes param.
     * 
     */
    @Import(name="certificateAttributes")
    private @Nullable Output<ScepProfileCertificateAttributesArgs> certificateAttributes;

    /**
     * @return The CertificateAttributes param.
     * 
     */
    public Optional<Output<ScepProfileCertificateAttributesArgs>> certificateAttributes() {
        return Optional.ofNullable(this.certificateAttributes);
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
     * The Digest param.
     * 
     */
    @Import(name="digest", required=true)
    private Output<String> digest;

    /**
     * @return The Digest param.
     * 
     */
    public Output<String> digest() {
        return this.digest;
    }

    /**
     * The Fingerprint param.
     * 
     */
    @Import(name="fingerprint")
    private @Nullable Output<String> fingerprint;

    /**
     * @return The Fingerprint param.
     * 
     */
    public Optional<Output<String>> fingerprint() {
        return Optional.ofNullable(this.fingerprint);
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
     * alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ScepCaCert param.
     * 
     */
    @Import(name="scepCaCert")
    private @Nullable Output<String> scepCaCert;

    /**
     * @return The ScepCaCert param.
     * 
     */
    public Optional<Output<String>> scepCaCert() {
        return Optional.ofNullable(this.scepCaCert);
    }

    /**
     * The ScepChallenge param.
     * 
     */
    @Import(name="scepChallenge")
    private @Nullable Output<ScepProfileScepChallengeArgs> scepChallenge;

    /**
     * @return The ScepChallenge param.
     * 
     */
    public Optional<Output<ScepProfileScepChallengeArgs>> scepChallenge() {
        return Optional.ofNullable(this.scepChallenge);
    }

    /**
     * The ScepClientCert param.
     * 
     */
    @Import(name="scepClientCert")
    private @Nullable Output<String> scepClientCert;

    /**
     * @return The ScepClientCert param.
     * 
     */
    public Optional<Output<String>> scepClientCert() {
        return Optional.ofNullable(this.scepClientCert);
    }

    /**
     * The ScepUrl param.
     * 
     */
    @Import(name="scepUrl", required=true)
    private Output<String> scepUrl;

    /**
     * @return The ScepUrl param.
     * 
     */
    public Output<String> scepUrl() {
        return this.scepUrl;
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
     * The Subject param.
     * 
     */
    @Import(name="subject")
    private @Nullable Output<String> subject;

    /**
     * @return The Subject param.
     * 
     */
    public Optional<Output<String>> subject() {
        return Optional.ofNullable(this.subject);
    }

    /**
     * The UseAsDigitalSignature param.
     * 
     */
    @Import(name="useAsDigitalSignature")
    private @Nullable Output<Boolean> useAsDigitalSignature;

    /**
     * @return The UseAsDigitalSignature param.
     * 
     */
    public Optional<Output<Boolean>> useAsDigitalSignature() {
        return Optional.ofNullable(this.useAsDigitalSignature);
    }

    /**
     * The UseForKeyEncipherment param.
     * 
     */
    @Import(name="useForKeyEncipherment")
    private @Nullable Output<Boolean> useForKeyEncipherment;

    /**
     * @return The UseForKeyEncipherment param.
     * 
     */
    public Optional<Output<Boolean>> useForKeyEncipherment() {
        return Optional.ofNullable(this.useForKeyEncipherment);
    }

    private ScepProfileArgs() {}

    private ScepProfileArgs(ScepProfileArgs $) {
        this.algorithm = $.algorithm;
        this.caIdentityName = $.caIdentityName;
        this.certificateAttributes = $.certificateAttributes;
        this.device = $.device;
        this.digest = $.digest;
        this.fingerprint = $.fingerprint;
        this.folder = $.folder;
        this.name = $.name;
        this.scepCaCert = $.scepCaCert;
        this.scepChallenge = $.scepChallenge;
        this.scepClientCert = $.scepClientCert;
        this.scepUrl = $.scepUrl;
        this.snippet = $.snippet;
        this.subject = $.subject;
        this.useAsDigitalSignature = $.useAsDigitalSignature;
        this.useForKeyEncipherment = $.useForKeyEncipherment;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScepProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScepProfileArgs $;

        public Builder() {
            $ = new ScepProfileArgs();
        }

        public Builder(ScepProfileArgs defaults) {
            $ = new ScepProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param algorithm The Algorithm param.
         * 
         * @return builder
         * 
         */
        public Builder algorithm(@Nullable Output<ScepProfileAlgorithmArgs> algorithm) {
            $.algorithm = algorithm;
            return this;
        }

        /**
         * @param algorithm The Algorithm param.
         * 
         * @return builder
         * 
         */
        public Builder algorithm(ScepProfileAlgorithmArgs algorithm) {
            return algorithm(Output.of(algorithm));
        }

        /**
         * @param caIdentityName The CaIdentityName param.
         * 
         * @return builder
         * 
         */
        public Builder caIdentityName(Output<String> caIdentityName) {
            $.caIdentityName = caIdentityName;
            return this;
        }

        /**
         * @param caIdentityName The CaIdentityName param.
         * 
         * @return builder
         * 
         */
        public Builder caIdentityName(String caIdentityName) {
            return caIdentityName(Output.of(caIdentityName));
        }

        /**
         * @param certificateAttributes The CertificateAttributes param.
         * 
         * @return builder
         * 
         */
        public Builder certificateAttributes(@Nullable Output<ScepProfileCertificateAttributesArgs> certificateAttributes) {
            $.certificateAttributes = certificateAttributes;
            return this;
        }

        /**
         * @param certificateAttributes The CertificateAttributes param.
         * 
         * @return builder
         * 
         */
        public Builder certificateAttributes(ScepProfileCertificateAttributesArgs certificateAttributes) {
            return certificateAttributes(Output.of(certificateAttributes));
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
         * @param digest The Digest param.
         * 
         * @return builder
         * 
         */
        public Builder digest(Output<String> digest) {
            $.digest = digest;
            return this;
        }

        /**
         * @param digest The Digest param.
         * 
         * @return builder
         * 
         */
        public Builder digest(String digest) {
            return digest(Output.of(digest));
        }

        /**
         * @param fingerprint The Fingerprint param.
         * 
         * @return builder
         * 
         */
        public Builder fingerprint(@Nullable Output<String> fingerprint) {
            $.fingerprint = fingerprint;
            return this;
        }

        /**
         * @param fingerprint The Fingerprint param.
         * 
         * @return builder
         * 
         */
        public Builder fingerprint(String fingerprint) {
            return fingerprint(Output.of(fingerprint));
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
         * @param name alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param scepCaCert The ScepCaCert param.
         * 
         * @return builder
         * 
         */
        public Builder scepCaCert(@Nullable Output<String> scepCaCert) {
            $.scepCaCert = scepCaCert;
            return this;
        }

        /**
         * @param scepCaCert The ScepCaCert param.
         * 
         * @return builder
         * 
         */
        public Builder scepCaCert(String scepCaCert) {
            return scepCaCert(Output.of(scepCaCert));
        }

        /**
         * @param scepChallenge The ScepChallenge param.
         * 
         * @return builder
         * 
         */
        public Builder scepChallenge(@Nullable Output<ScepProfileScepChallengeArgs> scepChallenge) {
            $.scepChallenge = scepChallenge;
            return this;
        }

        /**
         * @param scepChallenge The ScepChallenge param.
         * 
         * @return builder
         * 
         */
        public Builder scepChallenge(ScepProfileScepChallengeArgs scepChallenge) {
            return scepChallenge(Output.of(scepChallenge));
        }

        /**
         * @param scepClientCert The ScepClientCert param.
         * 
         * @return builder
         * 
         */
        public Builder scepClientCert(@Nullable Output<String> scepClientCert) {
            $.scepClientCert = scepClientCert;
            return this;
        }

        /**
         * @param scepClientCert The ScepClientCert param.
         * 
         * @return builder
         * 
         */
        public Builder scepClientCert(String scepClientCert) {
            return scepClientCert(Output.of(scepClientCert));
        }

        /**
         * @param scepUrl The ScepUrl param.
         * 
         * @return builder
         * 
         */
        public Builder scepUrl(Output<String> scepUrl) {
            $.scepUrl = scepUrl;
            return this;
        }

        /**
         * @param scepUrl The ScepUrl param.
         * 
         * @return builder
         * 
         */
        public Builder scepUrl(String scepUrl) {
            return scepUrl(Output.of(scepUrl));
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
         * @param subject The Subject param.
         * 
         * @return builder
         * 
         */
        public Builder subject(@Nullable Output<String> subject) {
            $.subject = subject;
            return this;
        }

        /**
         * @param subject The Subject param.
         * 
         * @return builder
         * 
         */
        public Builder subject(String subject) {
            return subject(Output.of(subject));
        }

        /**
         * @param useAsDigitalSignature The UseAsDigitalSignature param.
         * 
         * @return builder
         * 
         */
        public Builder useAsDigitalSignature(@Nullable Output<Boolean> useAsDigitalSignature) {
            $.useAsDigitalSignature = useAsDigitalSignature;
            return this;
        }

        /**
         * @param useAsDigitalSignature The UseAsDigitalSignature param.
         * 
         * @return builder
         * 
         */
        public Builder useAsDigitalSignature(Boolean useAsDigitalSignature) {
            return useAsDigitalSignature(Output.of(useAsDigitalSignature));
        }

        /**
         * @param useForKeyEncipherment The UseForKeyEncipherment param.
         * 
         * @return builder
         * 
         */
        public Builder useForKeyEncipherment(@Nullable Output<Boolean> useForKeyEncipherment) {
            $.useForKeyEncipherment = useForKeyEncipherment;
            return this;
        }

        /**
         * @param useForKeyEncipherment The UseForKeyEncipherment param.
         * 
         * @return builder
         * 
         */
        public Builder useForKeyEncipherment(Boolean useForKeyEncipherment) {
            return useForKeyEncipherment(Output.of(useForKeyEncipherment));
        }

        public ScepProfileArgs build() {
            if ($.caIdentityName == null) {
                throw new MissingRequiredPropertyException("ScepProfileArgs", "caIdentityName");
            }
            if ($.digest == null) {
                throw new MissingRequiredPropertyException("ScepProfileArgs", "digest");
            }
            if ($.scepUrl == null) {
                throw new MissingRequiredPropertyException("ScepProfileArgs", "scepUrl");
            }
            return $;
        }
    }

}
