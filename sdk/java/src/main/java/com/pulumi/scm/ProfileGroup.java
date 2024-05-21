// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.scm.ProfileGroupArgs;
import com.pulumi.scm.Utilities;
import com.pulumi.scm.inputs.ProfileGroupState;
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
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.scm.ProfileGroup;
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
 *         var example = new ProfileGroup(&#34;example&#34;);
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="scm:index/profileGroup:ProfileGroup")
public class ProfileGroup extends com.pulumi.resources.CustomResource {
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
     * The DnsSecurities param.
     * 
     */
    @Export(name="dnsSecurities", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> dnsSecurities;

    /**
     * @return The DnsSecurities param.
     * 
     */
    public Output<Optional<List<String>>> dnsSecurities() {
        return Codegen.optional(this.dnsSecurities);
    }
    /**
     * The FileBlockings param.
     * 
     */
    @Export(name="fileBlockings", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> fileBlockings;

    /**
     * @return The FileBlockings param.
     * 
     */
    public Output<Optional<List<String>>> fileBlockings() {
        return Codegen.optional(this.fileBlockings);
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
     * The Name param.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The Name param.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The SaasSecurities param.
     * 
     */
    @Export(name="saasSecurities", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> saasSecurities;

    /**
     * @return The SaasSecurities param.
     * 
     */
    public Output<Optional<List<String>>> saasSecurities() {
        return Codegen.optional(this.saasSecurities);
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
     * The Spywares param.
     * 
     */
    @Export(name="spywares", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> spywares;

    /**
     * @return The Spywares param.
     * 
     */
    public Output<Optional<List<String>>> spywares() {
        return Codegen.optional(this.spywares);
    }
    @Export(name="tfid", refs={String.class}, tree="[0]")
    private Output<String> tfid;

    public Output<String> tfid() {
        return this.tfid;
    }
    /**
     * The UrlFilterings param.
     * 
     */
    @Export(name="urlFilterings", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> urlFilterings;

    /**
     * @return The UrlFilterings param.
     * 
     */
    public Output<Optional<List<String>>> urlFilterings() {
        return Codegen.optional(this.urlFilterings);
    }
    /**
     * The VirusAndWildfireAnalyses param.
     * 
     */
    @Export(name="virusAndWildfireAnalyses", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> virusAndWildfireAnalyses;

    /**
     * @return The VirusAndWildfireAnalyses param.
     * 
     */
    public Output<Optional<List<String>>> virusAndWildfireAnalyses() {
        return Codegen.optional(this.virusAndWildfireAnalyses);
    }
    /**
     * The Vulnerabilities param.
     * 
     */
    @Export(name="vulnerabilities", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> vulnerabilities;

    /**
     * @return The Vulnerabilities param.
     * 
     */
    public Output<Optional<List<String>>> vulnerabilities() {
        return Codegen.optional(this.vulnerabilities);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ProfileGroup(String name) {
        this(name, ProfileGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ProfileGroup(String name, @Nullable ProfileGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ProfileGroup(String name, @Nullable ProfileGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("scm:index/profileGroup:ProfileGroup", name, args == null ? ProfileGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ProfileGroup(String name, Output<String> id, @Nullable ProfileGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("scm:index/profileGroup:ProfileGroup", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
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
    public static ProfileGroup get(String name, Output<String> id, @Nullable ProfileGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ProfileGroup(name, id, state, options);
    }
}
