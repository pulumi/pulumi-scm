// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.scm.ApplicationArgs;
import com.pulumi.scm.Utilities;
import com.pulumi.scm.inputs.ApplicationState;
import com.pulumi.scm.outputs.ApplicationDefault;
import com.pulumi.scm.outputs.ApplicationSignature;
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
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.scm.Application;
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
 *         var example = new Application(&#34;example&#34;);
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="scm:index/application:Application")
public class Application extends com.pulumi.resources.CustomResource {
    /**
     * The AbleToTransferFile param.
     * 
     */
    @Export(name="ableToTransferFile", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> ableToTransferFile;

    /**
     * @return The AbleToTransferFile param.
     * 
     */
    public Output<Optional<Boolean>> ableToTransferFile() {
        return Codegen.optional(this.ableToTransferFile);
    }
    /**
     * The AlgDisableCapability param. String length must not exceed 127 characters.
     * 
     */
    @Export(name="algDisableCapability", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> algDisableCapability;

    /**
     * @return The AlgDisableCapability param. String length must not exceed 127 characters.
     * 
     */
    public Output<Optional<String>> algDisableCapability() {
        return Codegen.optional(this.algDisableCapability);
    }
    /**
     * The Category param.
     * 
     */
    @Export(name="category", refs={String.class}, tree="[0]")
    private Output<String> category;

    /**
     * @return The Category param.
     * 
     */
    public Output<String> category() {
        return this.category;
    }
    /**
     * The ConsumeBigBandwidth param.
     * 
     */
    @Export(name="consumeBigBandwidth", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> consumeBigBandwidth;

    /**
     * @return The ConsumeBigBandwidth param.
     * 
     */
    public Output<Optional<Boolean>> consumeBigBandwidth() {
        return Codegen.optional(this.consumeBigBandwidth);
    }
    /**
     * The DataIdent param.
     * 
     */
    @Export(name="dataIdent", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> dataIdent;

    /**
     * @return The DataIdent param.
     * 
     */
    public Output<Optional<Boolean>> dataIdent() {
        return Codegen.optional(this.dataIdent);
    }
    /**
     * The Default param.
     * 
     */
    @Export(name="default", refs={ApplicationDefault.class}, tree="[0]")
    private Output</* @Nullable */ ApplicationDefault> default_;

    /**
     * @return The Default param.
     * 
     */
    public Output<Optional<ApplicationDefault>> default_() {
        return Codegen.optional(this.default_);
    }
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
     * The EvasiveBehavior param.
     * 
     */
    @Export(name="evasiveBehavior", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> evasiveBehavior;

    /**
     * @return The EvasiveBehavior param.
     * 
     */
    public Output<Optional<Boolean>> evasiveBehavior() {
        return Codegen.optional(this.evasiveBehavior);
    }
    /**
     * The FileTypeIdent param.
     * 
     */
    @Export(name="fileTypeIdent", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> fileTypeIdent;

    /**
     * @return The FileTypeIdent param.
     * 
     */
    public Output<Optional<Boolean>> fileTypeIdent() {
        return Codegen.optional(this.fileTypeIdent);
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
     * The HasKnownVulnerability param.
     * 
     */
    @Export(name="hasKnownVulnerability", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> hasKnownVulnerability;

    /**
     * @return The HasKnownVulnerability param.
     * 
     */
    public Output<Optional<Boolean>> hasKnownVulnerability() {
        return Codegen.optional(this.hasKnownVulnerability);
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
     * The NoAppidCaching param.
     * 
     */
    @Export(name="noAppidCaching", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> noAppidCaching;

    /**
     * @return The NoAppidCaching param.
     * 
     */
    public Output<Optional<Boolean>> noAppidCaching() {
        return Codegen.optional(this.noAppidCaching);
    }
    /**
     * The ParentApp param. String length must not exceed 127 characters.
     * 
     */
    @Export(name="parentApp", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> parentApp;

    /**
     * @return The ParentApp param. String length must not exceed 127 characters.
     * 
     */
    public Output<Optional<String>> parentApp() {
        return Codegen.optional(this.parentApp);
    }
    /**
     * The PervasiveUse param.
     * 
     */
    @Export(name="pervasiveUse", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> pervasiveUse;

    /**
     * @return The PervasiveUse param.
     * 
     */
    public Output<Optional<Boolean>> pervasiveUse() {
        return Codegen.optional(this.pervasiveUse);
    }
    /**
     * The ProneToMisuse param.
     * 
     */
    @Export(name="proneToMisuse", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> proneToMisuse;

    /**
     * @return The ProneToMisuse param.
     * 
     */
    public Output<Optional<Boolean>> proneToMisuse() {
        return Codegen.optional(this.proneToMisuse);
    }
    /**
     * The Risk param. Value must be between 1 and 5.
     * 
     */
    @Export(name="risk", refs={Integer.class}, tree="[0]")
    private Output<Integer> risk;

    /**
     * @return The Risk param. Value must be between 1 and 5.
     * 
     */
    public Output<Integer> risk() {
        return this.risk;
    }
    /**
     * The Signatures param.
     * 
     */
    @Export(name="signatures", refs={List.class,ApplicationSignature.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ApplicationSignature>> signatures;

    /**
     * @return The Signatures param.
     * 
     */
    public Output<Optional<List<ApplicationSignature>>> signatures() {
        return Codegen.optional(this.signatures);
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
     * The Subcategory param. String length must not exceed 63 characters.
     * 
     */
    @Export(name="subcategory", refs={String.class}, tree="[0]")
    private Output<String> subcategory;

    /**
     * @return The Subcategory param. String length must not exceed 63 characters.
     * 
     */
    public Output<String> subcategory() {
        return this.subcategory;
    }
    /**
     * timeout for half-close session in seconds. Value must be between 1 and 604800.
     * 
     */
    @Export(name="tcpHalfClosedTimeout", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> tcpHalfClosedTimeout;

    /**
     * @return timeout for half-close session in seconds. Value must be between 1 and 604800.
     * 
     */
    public Output<Optional<Integer>> tcpHalfClosedTimeout() {
        return Codegen.optional(this.tcpHalfClosedTimeout);
    }
    /**
     * timeout for session in time_wait state in seconds. Value must be between 1 and 600.
     * 
     */
    @Export(name="tcpTimeWaitTimeout", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> tcpTimeWaitTimeout;

    /**
     * @return timeout for session in time_wait state in seconds. Value must be between 1 and 600.
     * 
     */
    public Output<Optional<Integer>> tcpTimeWaitTimeout() {
        return Codegen.optional(this.tcpTimeWaitTimeout);
    }
    /**
     * timeout in seconds. Value must be between 0 and 604800.
     * 
     */
    @Export(name="tcpTimeout", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> tcpTimeout;

    /**
     * @return timeout in seconds. Value must be between 0 and 604800.
     * 
     */
    public Output<Optional<Integer>> tcpTimeout() {
        return Codegen.optional(this.tcpTimeout);
    }
    /**
     * The Technology param. String length must not exceed 63 characters.
     * 
     */
    @Export(name="technology", refs={String.class}, tree="[0]")
    private Output<String> technology;

    /**
     * @return The Technology param. String length must not exceed 63 characters.
     * 
     */
    public Output<String> technology() {
        return this.technology;
    }
    @Export(name="tfid", refs={String.class}, tree="[0]")
    private Output<String> tfid;

    public Output<String> tfid() {
        return this.tfid;
    }
    /**
     * timeout in seconds. Value must be between 0 and 604800.
     * 
     */
    @Export(name="timeout", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> timeout;

    /**
     * @return timeout in seconds. Value must be between 0 and 604800.
     * 
     */
    public Output<Optional<Integer>> timeout() {
        return Codegen.optional(this.timeout);
    }
    /**
     * The TunnelApplications param.
     * 
     */
    @Export(name="tunnelApplications", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> tunnelApplications;

    /**
     * @return The TunnelApplications param.
     * 
     */
    public Output<Optional<Boolean>> tunnelApplications() {
        return Codegen.optional(this.tunnelApplications);
    }
    /**
     * The TunnelOtherApplication param.
     * 
     */
    @Export(name="tunnelOtherApplication", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> tunnelOtherApplication;

    /**
     * @return The TunnelOtherApplication param.
     * 
     */
    public Output<Optional<Boolean>> tunnelOtherApplication() {
        return Codegen.optional(this.tunnelOtherApplication);
    }
    /**
     * timeout in seconds. Value must be between 0 and 604800.
     * 
     */
    @Export(name="udpTimeout", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> udpTimeout;

    /**
     * @return timeout in seconds. Value must be between 0 and 604800.
     * 
     */
    public Output<Optional<Integer>> udpTimeout() {
        return Codegen.optional(this.udpTimeout);
    }
    /**
     * The UsedByMalware param.
     * 
     */
    @Export(name="usedByMalware", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> usedByMalware;

    /**
     * @return The UsedByMalware param.
     * 
     */
    public Output<Optional<Boolean>> usedByMalware() {
        return Codegen.optional(this.usedByMalware);
    }
    /**
     * The VirusIdent param.
     * 
     */
    @Export(name="virusIdent", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> virusIdent;

    /**
     * @return The VirusIdent param.
     * 
     */
    public Output<Optional<Boolean>> virusIdent() {
        return Codegen.optional(this.virusIdent);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Application(String name) {
        this(name, ApplicationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Application(String name, ApplicationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Application(String name, ApplicationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("scm:index/application:Application", name, args == null ? ApplicationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Application(String name, Output<String> id, @Nullable ApplicationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("scm:index/application:Application", name, state, makeResourceOptions(options, id));
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
    public static Application get(String name, Output<String> id, @Nullable ApplicationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Application(name, id, state, options);
    }
}
