// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.scm.SecurityRuleArgs;
import com.pulumi.scm.Utilities;
import com.pulumi.scm.inputs.SecurityRuleState;
import com.pulumi.scm.outputs.SecurityRuleProfileSetting;
import java.lang.Boolean;
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
 * import com.pulumi.scm.SecurityRule;
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
 *         var example = new SecurityRule("example");
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="scm:index/securityRule:SecurityRule")
public class SecurityRule extends com.pulumi.resources.CustomResource {
    /**
     * The action to be taken when the rule is matched. String must be one of these: `&#34;allow&#34;`, `&#34;deny&#34;`, `&#34;drop&#34;`, `&#34;reset-client&#34;`, `&#34;reset-server&#34;`, `&#34;reset-both&#34;`.
     * 
     */
    @Export(name="action", refs={String.class}, tree="[0]")
    private Output<String> action;

    /**
     * @return The action to be taken when the rule is matched. String must be one of these: `&#34;allow&#34;`, `&#34;deny&#34;`, `&#34;drop&#34;`, `&#34;reset-client&#34;`, `&#34;reset-server&#34;`, `&#34;reset-both&#34;`.
     * 
     */
    public Output<String> action() {
        return this.action;
    }
    /**
     * The application(s) being accessed.
     * 
     */
    @Export(name="applications", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> applications;

    /**
     * @return The application(s) being accessed.
     * 
     */
    public Output<List<String>> applications() {
        return this.applications;
    }
    /**
     * The URL categories being accessed.
     * 
     */
    @Export(name="categories", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> categories;

    /**
     * @return The URL categories being accessed.
     * 
     */
    public Output<List<String>> categories() {
        return this.categories;
    }
    /**
     * The description of the security rule.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the security rule.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The destination Host Integrity Profile(s).
     * 
     */
    @Export(name="destinationHips", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> destinationHips;

    /**
     * @return The destination Host Integrity Profile(s).
     * 
     */
    public Output<Optional<List<String>>> destinationHips() {
        return Codegen.optional(this.destinationHips);
    }
    /**
     * The destination address(es).
     * 
     */
    @Export(name="destinations", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> destinations;

    /**
     * @return The destination address(es).
     * 
     */
    public Output<List<String>> destinations() {
        return this.destinations;
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
     * The state of the security rule. Default: `false`.
     * 
     */
    @Export(name="disabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> disabled;

    /**
     * @return The state of the security rule. Default: `false`.
     * 
     */
    public Output<Boolean> disabled() {
        return this.disabled;
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
     * The source security zone(s).
     * 
     */
    @Export(name="froms", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> froms;

    /**
     * @return The source security zone(s).
     * 
     */
    public Output<List<String>> froms() {
        return this.froms;
    }
    /**
     * The external log forwarding profile.
     * 
     */
    @Export(name="logSetting", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> logSetting;

    /**
     * @return The external log forwarding profile.
     * 
     */
    public Output<Optional<String>> logSetting() {
        return Codegen.optional(this.logSetting);
    }
    /**
     * The name of the security rule.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the security rule.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Negate the destination addresses(es). Default: `false`.
     * 
     */
    @Export(name="negateDestination", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> negateDestination;

    /**
     * @return Negate the destination addresses(es). Default: `false`.
     * 
     */
    public Output<Boolean> negateDestination() {
        return this.negateDestination;
    }
    /**
     * Negate the source address(es). Default: `false`.
     * 
     */
    @Export(name="negateSource", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> negateSource;

    /**
     * @return Negate the source address(es). Default: `false`.
     * 
     */
    public Output<Boolean> negateSource() {
        return this.negateSource;
    }
    /**
     * The Position param. String must be one of these: `&#34;pre&#34;`, `&#34;post&#34;`. Default: `&#34;pre&#34;`.
     * 
     */
    @Export(name="position", refs={String.class}, tree="[0]")
    private Output<String> position;

    /**
     * @return The Position param. String must be one of these: `&#34;pre&#34;`, `&#34;post&#34;`. Default: `&#34;pre&#34;`.
     * 
     */
    public Output<String> position() {
        return this.position;
    }
    /**
     * The security profile object.
     * 
     */
    @Export(name="profileSetting", refs={SecurityRuleProfileSetting.class}, tree="[0]")
    private Output</* @Nullable */ SecurityRuleProfileSetting> profileSetting;

    /**
     * @return The security profile object.
     * 
     */
    public Output<Optional<SecurityRuleProfileSetting>> profileSetting() {
        return Codegen.optional(this.profileSetting);
    }
    /**
     * The service(s) being accessed.
     * 
     */
    @Export(name="services", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> services;

    /**
     * @return The service(s) being accessed.
     * 
     */
    public Output<List<String>> services() {
        return this.services;
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
     * The source Host Integrity Profile(s).
     * 
     */
    @Export(name="sourceHips", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> sourceHips;

    /**
     * @return The source Host Integrity Profile(s).
     * 
     */
    public Output<Optional<List<String>>> sourceHips() {
        return Codegen.optional(this.sourceHips);
    }
    /**
     * The source user(s) or group(s).
     * 
     */
    @Export(name="sourceUsers", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> sourceUsers;

    /**
     * @return The source user(s) or group(s).
     * 
     */
    public Output<List<String>> sourceUsers() {
        return this.sourceUsers;
    }
    /**
     * The source address(es).
     * 
     */
    @Export(name="sources", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> sources;

    /**
     * @return The source address(es).
     * 
     */
    public Output<List<String>> sources() {
        return this.sources;
    }
    /**
     * The tags associated with the security rule.
     * 
     */
    @Export(name="tags", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> tags;

    /**
     * @return The tags associated with the security rule.
     * 
     */
    public Output<Optional<List<String>>> tags() {
        return Codegen.optional(this.tags);
    }
    @Export(name="tfid", refs={String.class}, tree="[0]")
    private Output<String> tfid;

    public Output<String> tfid() {
        return this.tfid;
    }
    /**
     * The destination security zone(s).
     * 
     */
    @Export(name="tos", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> tos;

    /**
     * @return The destination security zone(s).
     * 
     */
    public Output<List<String>> tos() {
        return this.tos;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SecurityRule(java.lang.String name) {
        this(name, SecurityRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SecurityRule(java.lang.String name, SecurityRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SecurityRule(java.lang.String name, SecurityRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("scm:index/securityRule:SecurityRule", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private SecurityRule(java.lang.String name, Output<java.lang.String> id, @Nullable SecurityRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("scm:index/securityRule:SecurityRule", name, state, makeResourceOptions(options, id), false);
    }

    private static SecurityRuleArgs makeArgs(SecurityRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? SecurityRuleArgs.Empty : args;
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
    public static SecurityRule get(java.lang.String name, Output<java.lang.String> id, @Nullable SecurityRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SecurityRule(name, id, state, options);
    }
}
