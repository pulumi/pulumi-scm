// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.scm.SnippetArgs;
import com.pulumi.scm.Utilities;
import com.pulumi.scm.inputs.SnippetState;
import com.pulumi.scm.outputs.SnippetFolder;
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
 * import com.pulumi.scm.Snippet;
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
 *         var example = new Snippet("example");
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="scm:index/snippet:Snippet")
public class Snippet extends com.pulumi.resources.CustomResource {
    /**
     * The CreatedIn param.
     * 
     */
    @Export(name="createdIn", refs={String.class}, tree="[0]")
    private Output<String> createdIn;

    /**
     * @return The CreatedIn param.
     * 
     */
    public Output<String> createdIn() {
        return this.createdIn;
    }
    /**
     * The Description param.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The Description param.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The DisplayName param.
     * 
     */
    @Export(name="displayName", refs={String.class}, tree="[0]")
    private Output<String> displayName;

    /**
     * @return The DisplayName param.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * The Folders param.
     * 
     */
    @Export(name="folders", refs={List.class,SnippetFolder.class}, tree="[0,1]")
    private Output<List<SnippetFolder>> folders;

    /**
     * @return The Folders param.
     * 
     */
    public Output<List<SnippetFolder>> folders() {
        return this.folders;
    }
    /**
     * The Labels param.
     * 
     */
    @Export(name="labels", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> labels;

    /**
     * @return The Labels param.
     * 
     */
    public Output<Optional<List<String>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * The LastUpdate param.
     * 
     */
    @Export(name="lastUpdate", refs={String.class}, tree="[0]")
    private Output<String> lastUpdate;

    /**
     * @return The LastUpdate param.
     * 
     */
    public Output<String> lastUpdate() {
        return this.lastUpdate;
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
     * The SharedIn param.
     * 
     */
    @Export(name="sharedIn", refs={String.class}, tree="[0]")
    private Output<String> sharedIn;

    /**
     * @return The SharedIn param.
     * 
     */
    public Output<String> sharedIn() {
        return this.sharedIn;
    }
    @Export(name="tfid", refs={String.class}, tree="[0]")
    private Output<String> tfid;

    public Output<String> tfid() {
        return this.tfid;
    }
    /**
     * The Type param. String must be one of these: `&#34;predefined&#34;`.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return The Type param. String must be one of these: `&#34;predefined&#34;`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Snippet(String name) {
        this(name, SnippetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Snippet(String name, @Nullable SnippetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Snippet(String name, @Nullable SnippetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("scm:index/snippet:Snippet", name, args == null ? SnippetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Snippet(String name, Output<String> id, @Nullable SnippetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("scm:index/snippet:Snippet", name, state, makeResourceOptions(options, id));
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
    public static Snippet get(String name, Output<String> id, @Nullable SnippetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Snippet(name, id, state, options);
    }
}
