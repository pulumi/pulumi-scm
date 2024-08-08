// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.scm.ExternalDynamicListArgs;
import com.pulumi.scm.Utilities;
import com.pulumi.scm.inputs.ExternalDynamicListState;
import com.pulumi.scm.outputs.ExternalDynamicListType;
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
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.scm.ExternalDynamicList;
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
 *         var example = new ExternalDynamicList("example");
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="scm:index/externalDynamicList:ExternalDynamicList")
public class ExternalDynamicList extends com.pulumi.resources.CustomResource {
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
     * Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 63 characters.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 63 characters.
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
     * The Type param.
     * 
     */
    @Export(name="type", refs={ExternalDynamicListType.class}, tree="[0]")
    private Output<ExternalDynamicListType> type;

    /**
     * @return The Type param.
     * 
     */
    public Output<ExternalDynamicListType> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ExternalDynamicList(java.lang.String name) {
        this(name, ExternalDynamicListArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ExternalDynamicList(java.lang.String name, ExternalDynamicListArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ExternalDynamicList(java.lang.String name, ExternalDynamicListArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("scm:index/externalDynamicList:ExternalDynamicList", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ExternalDynamicList(java.lang.String name, Output<java.lang.String> id, @Nullable ExternalDynamicListState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("scm:index/externalDynamicList:ExternalDynamicList", name, state, makeResourceOptions(options, id), false);
    }

    private static ExternalDynamicListArgs makeArgs(ExternalDynamicListArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ExternalDynamicListArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
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
    public static ExternalDynamicList get(java.lang.String name, Output<java.lang.String> id, @Nullable ExternalDynamicListState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ExternalDynamicList(name, id, state, options);
    }
}
