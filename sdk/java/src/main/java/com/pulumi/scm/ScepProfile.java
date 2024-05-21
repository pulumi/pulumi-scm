// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.scm.ScepProfileArgs;
import com.pulumi.scm.Utilities;
import com.pulumi.scm.inputs.ScepProfileState;
import com.pulumi.scm.outputs.ScepProfileAlgorithm;
import com.pulumi.scm.outputs.ScepProfileCertificateAttributes;
import com.pulumi.scm.outputs.ScepProfileScepChallenge;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Retrieves a config item.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.scm.ScepProfile;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new ScepProfile(&#34;example&#34;);
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="scm:index/scepProfile:ScepProfile")
public class ScepProfile extends com.pulumi.resources.CustomResource {
    /**
     * The Algorithm param.
     * 
     */
    @Export(name="algorithm", refs={ScepProfileAlgorithm.class}, tree="[0]")
    private Output</* @Nullable */ ScepProfileAlgorithm> algorithm;

    /**
     * @return The Algorithm param.
     * 
     */
    public Output<Optional<ScepProfileAlgorithm>> algorithm() {
        return Codegen.optional(this.algorithm);
    }
    /**
     * The CaIdentityName param.
     * 
     */
    @Export(name="caIdentityName", refs={String.class}, tree="[0]")
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
    @Export(name="certificateAttributes", refs={ScepProfileCertificateAttributes.class}, tree="[0]")
    private Output</* @Nullable */ ScepProfileCertificateAttributes> certificateAttributes;

    /**
     * @return The CertificateAttributes param.
     * 
     */
    public Output<Optional<ScepProfileCertificateAttributes>> certificateAttributes() {
        return Codegen.optional(this.certificateAttributes);
    }
    /**
     * The Device param.
     * 
     */
    @Export(name="device", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> device;

    /**
     * @return The Device param.
     * 
     */
    public Output<Optional<String>> device() {
        return Codegen.optional(this.device);
    }
    /**
     * The Digest param.
     * 
     */
    @Export(name="digest", refs={String.class}, tree="[0]")
    private Output<String> digest;

    /**
     * @return The Digest param.
     * 
     */
    public Output<String> digest() {
        return this.digest;
    }
    /**
     * (Internal use) Encrypted values returned from the API.
     * 
     */
    @Export(name="encryptedValues", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> encryptedValues;

    /**
     * @return (Internal use) Encrypted values returned from the API.
     * 
     */
    public Output<Map<String,String>> encryptedValues() {
        return this.encryptedValues;
    }
    /**
     * The Fingerprint param.
     * 
     */
    @Export(name="fingerprint", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> fingerprint;

    /**
     * @return The Fingerprint param.
     * 
     */
    public Output<Optional<String>> fingerprint() {
        return Codegen.optional(this.fingerprint);
    }
    /**
     * The Folder param.
     * 
     */
    @Export(name="folder", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> folder;

    /**
     * @return The Folder param.
     * 
     */
    public Output<Optional<String>> folder() {
        return Codegen.optional(this.folder);
    }
    /**
     * alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ScepCaCert param.
     * 
     */
    @Export(name="scepCaCert", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> scepCaCert;

    /**
     * @return The ScepCaCert param.
     * 
     */
    public Output<Optional<String>> scepCaCert() {
        return Codegen.optional(this.scepCaCert);
    }
    /**
     * The ScepChallenge param.
     * 
     */
    @Export(name="scepChallenge", refs={ScepProfileScepChallenge.class}, tree="[0]")
    private Output</* @Nullable */ ScepProfileScepChallenge> scepChallenge;

    /**
     * @return The ScepChallenge param.
     * 
     */
    public Output<Optional<ScepProfileScepChallenge>> scepChallenge() {
        return Codegen.optional(this.scepChallenge);
    }
    /**
     * The ScepClientCert param.
     * 
     */
    @Export(name="scepClientCert", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> scepClientCert;

    /**
     * @return The ScepClientCert param.
     * 
     */
    public Output<Optional<String>> scepClientCert() {
        return Codegen.optional(this.scepClientCert);
    }
    /**
     * The ScepUrl param.
     * 
     */
    @Export(name="scepUrl", refs={String.class}, tree="[0]")
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
    @Export(name="snippet", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> snippet;

    /**
     * @return The Snippet param.
     * 
     */
    public Output<Optional<String>> snippet() {
        return Codegen.optional(this.snippet);
    }
    /**
     * The Subject param.
     * 
     */
    @Export(name="subject", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> subject;

    /**
     * @return The Subject param.
     * 
     */
    public Output<Optional<String>> subject() {
        return Codegen.optional(this.subject);
    }
    @Export(name="tfid", refs={String.class}, tree="[0]")
    private Output<String> tfid;

    public Output<String> tfid() {
        return this.tfid;
    }
    /**
     * The UseAsDigitalSignature param.
     * 
     */
    @Export(name="useAsDigitalSignature", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> useAsDigitalSignature;

    /**
     * @return The UseAsDigitalSignature param.
     * 
     */
    public Output<Optional<Boolean>> useAsDigitalSignature() {
        return Codegen.optional(this.useAsDigitalSignature);
    }
    /**
     * The UseForKeyEncipherment param.
     * 
     */
    @Export(name="useForKeyEncipherment", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> useForKeyEncipherment;

    /**
     * @return The UseForKeyEncipherment param.
     * 
     */
    public Output<Optional<Boolean>> useForKeyEncipherment() {
        return Codegen.optional(this.useForKeyEncipherment);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ScepProfile(String name) {
        this(name, ScepProfileArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ScepProfile(String name, ScepProfileArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ScepProfile(String name, ScepProfileArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("scm:index/scepProfile:ScepProfile", name, args == null ? ScepProfileArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ScepProfile(String name, Output<String> id, @Nullable ScepProfileState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("scm:index/scepProfile:ScepProfile", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "encryptedValues"
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ScepProfile get(String name, Output<String> id, @Nullable ScepProfileState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ScepProfile(name, id, state, options);
    }
}
