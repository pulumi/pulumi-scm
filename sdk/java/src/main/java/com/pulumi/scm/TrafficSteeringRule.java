// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.scm.TrafficSteeringRuleArgs;
import com.pulumi.scm.Utilities;
import com.pulumi.scm.inputs.TrafficSteeringRuleState;
import com.pulumi.scm.outputs.TrafficSteeringRuleAction;
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
 * import com.pulumi.scm.TrafficSteeringRule;
 * import com.pulumi.scm.TrafficSteeringRuleArgs;
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
 *         var example = new TrafficSteeringRule("example", TrafficSteeringRuleArgs.builder()
 *             .folder("Shared")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="scm:index/trafficSteeringRule:TrafficSteeringRule")
public class TrafficSteeringRule extends com.pulumi.resources.CustomResource {
    /**
     * The Action param.
     * 
     */
    @Export(name="action", refs={TrafficSteeringRuleAction.class}, tree="[0]")
    private Output</* @Nullable */ TrafficSteeringRuleAction> action;

    /**
     * @return The Action param.
     * 
     */
    public Output<Optional<TrafficSteeringRuleAction>> action() {
        return Codegen.optional(this.action);
    }
    /**
     * The Category param.
     * 
     */
    @Export(name="categories", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> categories;

    /**
     * @return The Category param.
     * 
     */
    public Output<Optional<List<String>>> categories() {
        return Codegen.optional(this.categories);
    }
    /**
     * The Destination param.
     * 
     */
    @Export(name="destinations", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> destinations;

    /**
     * @return The Destination param.
     * 
     */
    public Output<Optional<List<String>>> destinations() {
        return Codegen.optional(this.destinations);
    }
    /**
     * The Folder param. String can either be a specific string(`&#34;Service Connections&#34;`) or match this regex: `^[0-9a-zA-Z._\s-]{1,}$`. Default: `&#34;Service Connections&#34;`.
     * 
     */
    @Export(name="folder", refs={String.class}, tree="[0]")
    private Output<String> folder;

    /**
     * @return The Folder param. String can either be a specific string(`&#34;Service Connections&#34;`) or match this regex: `^[0-9a-zA-Z._\s-]{1,}$`. Default: `&#34;Service Connections&#34;`.
     * 
     */
    public Output<String> folder() {
        return this.folder;
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
     * The Service param.
     * 
     */
    @Export(name="services", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> services;

    /**
     * @return The Service param.
     * 
     */
    public Output<List<String>> services() {
        return this.services;
    }
    /**
     * The SourceUser param.
     * 
     */
    @Export(name="sourceUsers", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> sourceUsers;

    /**
     * @return The SourceUser param.
     * 
     */
    public Output<Optional<List<String>>> sourceUsers() {
        return Codegen.optional(this.sourceUsers);
    }
    /**
     * The Source param.
     * 
     */
    @Export(name="sources", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> sources;

    /**
     * @return The Source param.
     * 
     */
    public Output<List<String>> sources() {
        return this.sources;
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
    public TrafficSteeringRule(String name) {
        this(name, TrafficSteeringRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TrafficSteeringRule(String name, TrafficSteeringRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TrafficSteeringRule(String name, TrafficSteeringRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("scm:index/trafficSteeringRule:TrafficSteeringRule", name, args == null ? TrafficSteeringRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TrafficSteeringRule(String name, Output<String> id, @Nullable TrafficSteeringRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("scm:index/trafficSteeringRule:TrafficSteeringRule", name, state, makeResourceOptions(options, id));
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
    public static TrafficSteeringRule get(String name, Output<String> id, @Nullable TrafficSteeringRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TrafficSteeringRule(name, id, state, options);
    }
}
