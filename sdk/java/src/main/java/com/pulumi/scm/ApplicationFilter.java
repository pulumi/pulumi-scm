// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.scm.ApplicationFilterArgs;
import com.pulumi.scm.Utilities;
import com.pulumi.scm.inputs.ApplicationFilterState;
import com.pulumi.scm.outputs.ApplicationFilterTagging;
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
 * import com.pulumi.scm.ApplicationFilter;
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
 *         var example = new ApplicationFilter("example");
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="scm:index/applicationFilter:ApplicationFilter")
public class ApplicationFilter extends com.pulumi.resources.CustomResource {
    /**
     * The Categories param. Individual elements in this list are subject to additional validation. String length must not exceed 128 characters.
     * 
     */
    @Export(name="categories", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> categories;

    /**
     * @return The Categories param. Individual elements in this list are subject to additional validation. String length must not exceed 128 characters.
     * 
     */
    public Output<Optional<List<String>>> categories() {
        return Codegen.optional(this.categories);
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
     * only True is a valid value.
     * 
     */
    @Export(name="evasive", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> evasive;

    /**
     * @return only True is a valid value.
     * 
     */
    public Output<Optional<Boolean>> evasive() {
        return Codegen.optional(this.evasive);
    }
    /**
     * only True is a valid value.
     * 
     */
    @Export(name="excessiveBandwidthUse", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> excessiveBandwidthUse;

    /**
     * @return only True is a valid value.
     * 
     */
    public Output<Optional<Boolean>> excessiveBandwidthUse() {
        return Codegen.optional(this.excessiveBandwidthUse);
    }
    /**
     * The Excludes param. Individual elements in this list are subject to additional validation. String length must not exceed 63 characters.
     * 
     */
    @Export(name="excludes", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> excludes;

    /**
     * @return The Excludes param. Individual elements in this list are subject to additional validation. String length must not exceed 63 characters.
     * 
     */
    public Output<Optional<List<String>>> excludes() {
        return Codegen.optional(this.excludes);
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
     * only True is a valid value.
     * 
     */
    @Export(name="hasKnownVulnerabilities", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> hasKnownVulnerabilities;

    /**
     * @return only True is a valid value.
     * 
     */
    public Output<Optional<Boolean>> hasKnownVulnerabilities() {
        return Codegen.optional(this.hasKnownVulnerabilities);
    }
    /**
     * only True is a valid value.
     * 
     */
    @Export(name="isSaas", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> isSaas;

    /**
     * @return only True is a valid value.
     * 
     */
    public Output<Optional<Boolean>> isSaas() {
        return Codegen.optional(this.isSaas);
    }
    /**
     * Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * only True is a valid value.
     * 
     */
    @Export(name="newAppid", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> newAppid;

    /**
     * @return only True is a valid value.
     * 
     */
    public Output<Optional<Boolean>> newAppid() {
        return Codegen.optional(this.newAppid);
    }
    /**
     * only True is a valid value.
     * 
     */
    @Export(name="pervasive", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> pervasive;

    /**
     * @return only True is a valid value.
     * 
     */
    public Output<Optional<Boolean>> pervasive() {
        return Codegen.optional(this.pervasive);
    }
    /**
     * only True is a valid value.
     * 
     */
    @Export(name="proneToMisuse", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> proneToMisuse;

    /**
     * @return only True is a valid value.
     * 
     */
    public Output<Optional<Boolean>> proneToMisuse() {
        return Codegen.optional(this.proneToMisuse);
    }
    /**
     * The Risks param. Individual elements in this list are subject to additional validation. Value must be between 1 and 5.
     * 
     */
    @Export(name="risks", refs={List.class,Integer.class}, tree="[0,1]")
    private Output</* @Nullable */ List<Integer>> risks;

    /**
     * @return The Risks param. Individual elements in this list are subject to additional validation. Value must be between 1 and 5.
     * 
     */
    public Output<Optional<List<Integer>>> risks() {
        return Codegen.optional(this.risks);
    }
    /**
     * The SaasCertifications param. Individual elements in this list are subject to additional validation. String length must not exceed 32 characters.
     * 
     */
    @Export(name="saasCertifications", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> saasCertifications;

    /**
     * @return The SaasCertifications param. Individual elements in this list are subject to additional validation. String length must not exceed 32 characters.
     * 
     */
    public Output<Optional<List<String>>> saasCertifications() {
        return Codegen.optional(this.saasCertifications);
    }
    /**
     * The SaasRisks param. Individual elements in this list are subject to additional validation. String length must not exceed 32 characters.
     * 
     */
    @Export(name="saasRisks", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> saasRisks;

    /**
     * @return The SaasRisks param. Individual elements in this list are subject to additional validation. String length must not exceed 32 characters.
     * 
     */
    public Output<Optional<List<String>>> saasRisks() {
        return Codegen.optional(this.saasRisks);
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
     * The Subcategories param. Individual elements in this list are subject to additional validation. String length must not exceed 128 characters.
     * 
     */
    @Export(name="subcategories", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> subcategories;

    /**
     * @return The Subcategories param. Individual elements in this list are subject to additional validation. String length must not exceed 128 characters.
     * 
     */
    public Output<Optional<List<String>>> subcategories() {
        return Codegen.optional(this.subcategories);
    }
    /**
     * The Tagging param.
     * 
     */
    @Export(name="tagging", refs={ApplicationFilterTagging.class}, tree="[0]")
    private Output</* @Nullable */ ApplicationFilterTagging> tagging;

    /**
     * @return The Tagging param.
     * 
     */
    public Output<Optional<ApplicationFilterTagging>> tagging() {
        return Codegen.optional(this.tagging);
    }
    /**
     * The Technologies param. Individual elements in this list are subject to additional validation. String length must not exceed 128 characters.
     * 
     */
    @Export(name="technologies", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> technologies;

    /**
     * @return The Technologies param. Individual elements in this list are subject to additional validation. String length must not exceed 128 characters.
     * 
     */
    public Output<Optional<List<String>>> technologies() {
        return Codegen.optional(this.technologies);
    }
    @Export(name="tfid", refs={String.class}, tree="[0]")
    private Output<String> tfid;

    public Output<String> tfid() {
        return this.tfid;
    }
    /**
     * only True is a valid value.
     * 
     */
    @Export(name="transfersFiles", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> transfersFiles;

    /**
     * @return only True is a valid value.
     * 
     */
    public Output<Optional<Boolean>> transfersFiles() {
        return Codegen.optional(this.transfersFiles);
    }
    /**
     * only True is a valid value.
     * 
     */
    @Export(name="tunnelsOtherApps", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> tunnelsOtherApps;

    /**
     * @return only True is a valid value.
     * 
     */
    public Output<Optional<Boolean>> tunnelsOtherApps() {
        return Codegen.optional(this.tunnelsOtherApps);
    }
    /**
     * only True is a valid value.
     * 
     */
    @Export(name="usedByMalware", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> usedByMalware;

    /**
     * @return only True is a valid value.
     * 
     */
    public Output<Optional<Boolean>> usedByMalware() {
        return Codegen.optional(this.usedByMalware);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ApplicationFilter(String name) {
        this(name, ApplicationFilterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ApplicationFilter(String name, @Nullable ApplicationFilterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ApplicationFilter(String name, @Nullable ApplicationFilterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("scm:index/applicationFilter:ApplicationFilter", name, args == null ? ApplicationFilterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ApplicationFilter(String name, Output<String> id, @Nullable ApplicationFilterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("scm:index/applicationFilter:ApplicationFilter", name, state, makeResourceOptions(options, id));
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
    public static ApplicationFilter get(String name, Output<String> id, @Nullable ApplicationFilterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ApplicationFilter(name, id, state, options);
    }
}