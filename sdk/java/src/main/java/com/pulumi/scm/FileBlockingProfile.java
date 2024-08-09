// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.scm.FileBlockingProfileArgs;
import com.pulumi.scm.Utilities;
import com.pulumi.scm.inputs.FileBlockingProfileState;
import com.pulumi.scm.outputs.FileBlockingProfileRule;
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
 * import com.pulumi.scm.FileBlockingProfile;
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
 *         var example = new FileBlockingProfile("example");
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="scm:index/fileBlockingProfile:FileBlockingProfile")
public class FileBlockingProfile extends com.pulumi.resources.CustomResource {
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
     * The Rules param.
     * 
     */
    @Export(name="rules", refs={List.class,FileBlockingProfileRule.class}, tree="[0,1]")
    private Output</* @Nullable */ List<FileBlockingProfileRule>> rules;

    /**
     * @return The Rules param.
     * 
     */
    public Output<Optional<List<FileBlockingProfileRule>>> rules() {
        return Codegen.optional(this.rules);
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
    public FileBlockingProfile(java.lang.String name) {
        this(name, FileBlockingProfileArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FileBlockingProfile(java.lang.String name, @Nullable FileBlockingProfileArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FileBlockingProfile(java.lang.String name, @Nullable FileBlockingProfileArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("scm:index/fileBlockingProfile:FileBlockingProfile", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private FileBlockingProfile(java.lang.String name, Output<java.lang.String> id, @Nullable FileBlockingProfileState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("scm:index/fileBlockingProfile:FileBlockingProfile", name, state, makeResourceOptions(options, id), false);
    }

    private static FileBlockingProfileArgs makeArgs(@Nullable FileBlockingProfileArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? FileBlockingProfileArgs.Empty : args;
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
    public static FileBlockingProfile get(java.lang.String name, Output<java.lang.String> id, @Nullable FileBlockingProfileState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FileBlockingProfile(name, id, state, options);
    }
}
