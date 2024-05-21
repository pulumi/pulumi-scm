// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.scm.AddressObjectArgs;
import com.pulumi.scm.Utilities;
import com.pulumi.scm.inputs.AddressObjectState;
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
 * import com.pulumi.scm.AddressObject;
 * import com.pulumi.scm.AddressObjectArgs;
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
 *         var example = new AddressObject(&#34;example&#34;, AddressObjectArgs.builder()        
 *             .folder(&#34;Shared&#34;)
 *             .name(&#34;example&#34;)
 *             .description(&#34;Made by Terraform&#34;)
 *             .ipNetmask(&#34;10.2.3.4&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="scm:index/addressObject:AddressObject")
public class AddressObject extends com.pulumi.resources.CustomResource {
    /**
     * The Description param. String length must not exceed 1023 characters.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The Description param. String length must not exceed 1023 characters.
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
     * The Fqdn param. String length must be between 1 and 255 characters. String validation regex: `^a-zA-Z0-9_+[a-zA-Z0-9]$`. Ensure that only one of the following is specified: `fqdn`, `ip_netmask`, `ip_range`, `ip_wildcard`
     * 
     */
    @Export(name="fqdn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> fqdn;

    /**
     * @return The Fqdn param. String length must be between 1 and 255 characters. String validation regex: `^a-zA-Z0-9_+[a-zA-Z0-9]$`. Ensure that only one of the following is specified: `fqdn`, `ip_netmask`, `ip_range`, `ip_wildcard`
     * 
     */
    public Output<Optional<String>> fqdn() {
        return Codegen.optional(this.fqdn);
    }
    /**
     * The IpNetmask param. Ensure that only one of the following is specified: `fqdn`, `ip_netmask`, `ip_range`, `ip_wildcard`
     * 
     */
    @Export(name="ipNetmask", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ipNetmask;

    /**
     * @return The IpNetmask param. Ensure that only one of the following is specified: `fqdn`, `ip_netmask`, `ip_range`, `ip_wildcard`
     * 
     */
    public Output<Optional<String>> ipNetmask() {
        return Codegen.optional(this.ipNetmask);
    }
    /**
     * The IpRange param. Ensure that only one of the following is specified: `fqdn`, `ip_netmask`, `ip_range`, `ip_wildcard`
     * 
     */
    @Export(name="ipRange", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ipRange;

    /**
     * @return The IpRange param. Ensure that only one of the following is specified: `fqdn`, `ip_netmask`, `ip_range`, `ip_wildcard`
     * 
     */
    public Output<Optional<String>> ipRange() {
        return Codegen.optional(this.ipRange);
    }
    /**
     * The IpWildcard param. Ensure that only one of the following is specified: `fqdn`, `ip_netmask`, `ip_range`, `ip_wildcard`
     * 
     */
    @Export(name="ipWildcard", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ipWildcard;

    /**
     * @return The IpWildcard param. Ensure that only one of the following is specified: `fqdn`, `ip_netmask`, `ip_range`, `ip_wildcard`
     * 
     */
    public Output<Optional<String>> ipWildcard() {
        return Codegen.optional(this.ipWildcard);
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
    /**
     * Tags for address object. List must contain at most 64 elements. Individual elements in this list are subject to additional validation. String length must not exceed 127 characters.
     * 
     */
    @Export(name="tags", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> tags;

    /**
     * @return Tags for address object. List must contain at most 64 elements. Individual elements in this list are subject to additional validation. String length must not exceed 127 characters.
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
     * The Type param.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return The Type param.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AddressObject(String name) {
        this(name, AddressObjectArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AddressObject(String name, @Nullable AddressObjectArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AddressObject(String name, @Nullable AddressObjectArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("scm:index/addressObject:AddressObject", name, args == null ? AddressObjectArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AddressObject(String name, Output<String> id, @Nullable AddressObjectState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("scm:index/addressObject:AddressObject", name, state, makeResourceOptions(options, id));
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
    public static AddressObject get(String name, Output<String> id, @Nullable AddressObjectState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AddressObject(name, id, state, options);
    }
}
