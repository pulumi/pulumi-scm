// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.scm.IkeCryptoProfileArgs;
import com.pulumi.scm.Utilities;
import com.pulumi.scm.inputs.IkeCryptoProfileState;
import com.pulumi.scm.outputs.IkeCryptoProfileLifetime;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Retrieves a config item.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.scm.IkeCryptoProfile;
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
 *         var example = new IkeCryptoProfile("example");
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="scm:index/ikeCryptoProfile:IkeCryptoProfile")
public class IkeCryptoProfile extends com.pulumi.resources.CustomResource {
    /**
     * IKEv2 SA reauthentication interval equals authetication-multiple * rekey-lifetime; 0 means reauthentication disabled. Value must be less than or equal to 50. Default: `0`.
     * 
     */
    @Export(name="authenticationMultiple", refs={Integer.class}, tree="[0]")
    private Output<Integer> authenticationMultiple;

    /**
     * @return IKEv2 SA reauthentication interval equals authetication-multiple * rekey-lifetime; 0 means reauthentication disabled. Value must be less than or equal to 50. Default: `0`.
     * 
     */
    public Output<Integer> authenticationMultiple() {
        return this.authenticationMultiple;
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
     * The DhGroups param. Individual elements in this list are subject to additional validation. String must be one of these: `&#34;group1&#34;`, `&#34;group2&#34;`, `&#34;group5&#34;`, `&#34;group14&#34;`, `&#34;group19&#34;`, `&#34;group20&#34;`.
     * 
     */
    @Export(name="dhGroups", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> dhGroups;

    /**
     * @return The DhGroups param. Individual elements in this list are subject to additional validation. String must be one of these: `&#34;group1&#34;`, `&#34;group2&#34;`, `&#34;group5&#34;`, `&#34;group14&#34;`, `&#34;group19&#34;`, `&#34;group20&#34;`.
     * 
     */
    public Output<List<String>> dhGroups() {
        return this.dhGroups;
    }
    /**
     * Encryption algorithm. Individual elements in this list are subject to additional validation. String must be one of these: `&#34;des&#34;`, `&#34;3des&#34;`, `&#34;aes-128-cbc&#34;`, `&#34;aes-192-cbc&#34;`, `&#34;aes-256-cbc&#34;`, `&#34;aes-128-gcm&#34;`, `&#34;aes-256-gcm&#34;`.
     * 
     */
    @Export(name="encryptions", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> encryptions;

    /**
     * @return Encryption algorithm. Individual elements in this list are subject to additional validation. String must be one of these: `&#34;des&#34;`, `&#34;3des&#34;`, `&#34;aes-128-cbc&#34;`, `&#34;aes-192-cbc&#34;`, `&#34;aes-256-cbc&#34;`, `&#34;aes-128-gcm&#34;`, `&#34;aes-256-gcm&#34;`.
     * 
     */
    public Output<List<String>> encryptions() {
        return this.encryptions;
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
     * The Hashes param. Individual elements in this list are subject to additional validation. String must be one of these: `&#34;md5&#34;`, `&#34;sha1&#34;`, `&#34;sha256&#34;`, `&#34;sha384&#34;`, `&#34;sha512&#34;`.
     * 
     */
    @Export(name="hashes", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> hashes;

    /**
     * @return The Hashes param. Individual elements in this list are subject to additional validation. String must be one of these: `&#34;md5&#34;`, `&#34;sha1&#34;`, `&#34;sha256&#34;`, `&#34;sha384&#34;`, `&#34;sha512&#34;`.
     * 
     */
    public Output<List<String>> hashes() {
        return this.hashes;
    }
    /**
     * The Lifetime param.
     * 
     */
    @Export(name="lifetime", refs={IkeCryptoProfileLifetime.class}, tree="[0]")
    private Output</* @Nullable */ IkeCryptoProfileLifetime> lifetime;

    /**
     * @return The Lifetime param.
     * 
     */
    public Output<Optional<IkeCryptoProfileLifetime>> lifetime() {
        return Codegen.optional(this.lifetime);
    }
    /**
     * Alphanumeric string begin with letter: [0-9a-zA-Z._-]. String length must not exceed 31 characters.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Alphanumeric string begin with letter: [0-9a-zA-Z._-]. String length must not exceed 31 characters.
     * 
     */
    public Output<String> name() {
        return this.name;
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
    @Export(name="tfid", refs={String.class}, tree="[0]")
    private Output<String> tfid;

    public Output<String> tfid() {
        return this.tfid;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IkeCryptoProfile(java.lang.String name) {
        this(name, IkeCryptoProfileArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IkeCryptoProfile(java.lang.String name, IkeCryptoProfileArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IkeCryptoProfile(java.lang.String name, IkeCryptoProfileArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("scm:index/ikeCryptoProfile:IkeCryptoProfile", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private IkeCryptoProfile(java.lang.String name, Output<java.lang.String> id, @Nullable IkeCryptoProfileState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("scm:index/ikeCryptoProfile:IkeCryptoProfile", name, state, makeResourceOptions(options, id), false);
    }

    private static IkeCryptoProfileArgs makeArgs(IkeCryptoProfileArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? IkeCryptoProfileArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static IkeCryptoProfile get(java.lang.String name, Output<java.lang.String> id, @Nullable IkeCryptoProfileState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new IkeCryptoProfile(name, id, state, options);
    }
}
