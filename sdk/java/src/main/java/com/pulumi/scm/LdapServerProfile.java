// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.scm.LdapServerProfileArgs;
import com.pulumi.scm.Utilities;
import com.pulumi.scm.inputs.LdapServerProfileState;
import com.pulumi.scm.outputs.LdapServerProfileServer;
import java.lang.Boolean;
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
 * import com.pulumi.scm.LdapServerProfile;
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
 *         var example = new LdapServerProfile("example");
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="scm:index/ldapServerProfile:LdapServerProfile")
public class LdapServerProfile extends com.pulumi.resources.CustomResource {
    /**
     * The Base param. String length must not exceed 255 characters.
     * 
     */
    @Export(name="base", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> base;

    /**
     * @return The Base param. String length must not exceed 255 characters.
     * 
     */
    public Output<Optional<String>> base() {
        return Codegen.optional(this.base);
    }
    /**
     * The BindDn param. String length must not exceed 255 characters.
     * 
     */
    @Export(name="bindDn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> bindDn;

    /**
     * @return The BindDn param. String length must not exceed 255 characters.
     * 
     */
    public Output<Optional<String>> bindDn() {
        return Codegen.optional(this.bindDn);
    }
    /**
     * The BindPassword param. String length must not exceed 121 characters.
     * 
     */
    @Export(name="bindPassword", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> bindPassword;

    /**
     * @return The BindPassword param. String length must not exceed 121 characters.
     * 
     */
    public Output<Optional<String>> bindPassword() {
        return Codegen.optional(this.bindPassword);
    }
    /**
     * The BindTimelimit param.
     * 
     */
    @Export(name="bindTimelimit", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> bindTimelimit;

    /**
     * @return The BindTimelimit param.
     * 
     */
    public Output<Optional<String>> bindTimelimit() {
        return Codegen.optional(this.bindTimelimit);
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
     * The LdapType param. String must be one of these: `&#34;active-directory&#34;`, `&#34;e-directory&#34;`, `&#34;sun&#34;`, `&#34;other&#34;`.
     * 
     */
    @Export(name="ldapType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ldapType;

    /**
     * @return The LdapType param. String must be one of these: `&#34;active-directory&#34;`, `&#34;e-directory&#34;`, `&#34;sun&#34;`, `&#34;other&#34;`.
     * 
     */
    public Output<Optional<String>> ldapType() {
        return Codegen.optional(this.ldapType);
    }
    /**
     * The RetryInterval param.
     * 
     */
    @Export(name="retryInterval", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> retryInterval;

    /**
     * @return The RetryInterval param.
     * 
     */
    public Output<Optional<Integer>> retryInterval() {
        return Codegen.optional(this.retryInterval);
    }
    /**
     * The Servers param.
     * 
     */
    @Export(name="servers", refs={List.class,LdapServerProfileServer.class}, tree="[0,1]")
    private Output<List<LdapServerProfileServer>> servers;

    /**
     * @return The Servers param.
     * 
     */
    public Output<List<LdapServerProfileServer>> servers() {
        return this.servers;
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
     * The Ssl param.
     * 
     */
    @Export(name="ssl", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> ssl;

    /**
     * @return The Ssl param.
     * 
     */
    public Output<Optional<Boolean>> ssl() {
        return Codegen.optional(this.ssl);
    }
    @Export(name="tfid", refs={String.class}, tree="[0]")
    private Output<String> tfid;

    public Output<String> tfid() {
        return this.tfid;
    }
    /**
     * The Timelimit param.
     * 
     */
    @Export(name="timelimit", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> timelimit;

    /**
     * @return The Timelimit param.
     * 
     */
    public Output<Optional<Integer>> timelimit() {
        return Codegen.optional(this.timelimit);
    }
    /**
     * The VerifyServerCertificate param.
     * 
     */
    @Export(name="verifyServerCertificate", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> verifyServerCertificate;

    /**
     * @return The VerifyServerCertificate param.
     * 
     */
    public Output<Optional<Boolean>> verifyServerCertificate() {
        return Codegen.optional(this.verifyServerCertificate);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LdapServerProfile(java.lang.String name) {
        this(name, LdapServerProfileArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LdapServerProfile(java.lang.String name, LdapServerProfileArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LdapServerProfile(java.lang.String name, LdapServerProfileArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("scm:index/ldapServerProfile:LdapServerProfile", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private LdapServerProfile(java.lang.String name, Output<java.lang.String> id, @Nullable LdapServerProfileState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("scm:index/ldapServerProfile:LdapServerProfile", name, state, makeResourceOptions(options, id), false);
    }

    private static LdapServerProfileArgs makeArgs(LdapServerProfileArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? LdapServerProfileArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "bindPassword"
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
    public static LdapServerProfile get(java.lang.String name, Output<java.lang.String> id, @Nullable LdapServerProfileState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LdapServerProfile(name, id, state, options);
    }
}
