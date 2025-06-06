// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.scm.HipObjectArgs;
import com.pulumi.scm.Utilities;
import com.pulumi.scm.inputs.HipObjectState;
import com.pulumi.scm.outputs.HipObjectAntiMalware;
import com.pulumi.scm.outputs.HipObjectCertificate;
import com.pulumi.scm.outputs.HipObjectCustomChecks;
import com.pulumi.scm.outputs.HipObjectDataLossPrevention;
import com.pulumi.scm.outputs.HipObjectDiskBackup;
import com.pulumi.scm.outputs.HipObjectDiskEncryption;
import com.pulumi.scm.outputs.HipObjectFirewall;
import com.pulumi.scm.outputs.HipObjectHostInfo;
import com.pulumi.scm.outputs.HipObjectMobileDevice;
import com.pulumi.scm.outputs.HipObjectNetworkInfo;
import com.pulumi.scm.outputs.HipObjectPatchManagement;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Retrieves a config item.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="scm:index/hipObject:HipObject")
public class HipObject extends com.pulumi.resources.CustomResource {
    /**
     * The AntiMalware param.
     * 
     */
    @Export(name="antiMalware", refs={HipObjectAntiMalware.class}, tree="[0]")
    private Output</* @Nullable */ HipObjectAntiMalware> antiMalware;

    /**
     * @return The AntiMalware param.
     * 
     */
    public Output<Optional<HipObjectAntiMalware>> antiMalware() {
        return Codegen.optional(this.antiMalware);
    }
    /**
     * The Certificate param.
     * 
     */
    @Export(name="certificate", refs={HipObjectCertificate.class}, tree="[0]")
    private Output</* @Nullable */ HipObjectCertificate> certificate;

    /**
     * @return The Certificate param.
     * 
     */
    public Output<Optional<HipObjectCertificate>> certificate() {
        return Codegen.optional(this.certificate);
    }
    /**
     * The CustomChecks param.
     * 
     */
    @Export(name="customChecks", refs={HipObjectCustomChecks.class}, tree="[0]")
    private Output</* @Nullable */ HipObjectCustomChecks> customChecks;

    /**
     * @return The CustomChecks param.
     * 
     */
    public Output<Optional<HipObjectCustomChecks>> customChecks() {
        return Codegen.optional(this.customChecks);
    }
    /**
     * The DataLossPrevention param.
     * 
     */
    @Export(name="dataLossPrevention", refs={HipObjectDataLossPrevention.class}, tree="[0]")
    private Output</* @Nullable */ HipObjectDataLossPrevention> dataLossPrevention;

    /**
     * @return The DataLossPrevention param.
     * 
     */
    public Output<Optional<HipObjectDataLossPrevention>> dataLossPrevention() {
        return Codegen.optional(this.dataLossPrevention);
    }
    /**
     * The Description param. String length must not exceed 255 characters.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The Description param. String length must not exceed 255 characters.
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
     * The DiskBackup param.
     * 
     */
    @Export(name="diskBackup", refs={HipObjectDiskBackup.class}, tree="[0]")
    private Output</* @Nullable */ HipObjectDiskBackup> diskBackup;

    /**
     * @return The DiskBackup param.
     * 
     */
    public Output<Optional<HipObjectDiskBackup>> diskBackup() {
        return Codegen.optional(this.diskBackup);
    }
    /**
     * The DiskEncryption param.
     * 
     */
    @Export(name="diskEncryption", refs={HipObjectDiskEncryption.class}, tree="[0]")
    private Output</* @Nullable */ HipObjectDiskEncryption> diskEncryption;

    /**
     * @return The DiskEncryption param.
     * 
     */
    public Output<Optional<HipObjectDiskEncryption>> diskEncryption() {
        return Codegen.optional(this.diskEncryption);
    }
    /**
     * The Firewall param.
     * 
     */
    @Export(name="firewall", refs={HipObjectFirewall.class}, tree="[0]")
    private Output</* @Nullable */ HipObjectFirewall> firewall;

    /**
     * @return The Firewall param.
     * 
     */
    public Output<Optional<HipObjectFirewall>> firewall() {
        return Codegen.optional(this.firewall);
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
     * The HostInfo param.
     * 
     */
    @Export(name="hostInfo", refs={HipObjectHostInfo.class}, tree="[0]")
    private Output</* @Nullable */ HipObjectHostInfo> hostInfo;

    /**
     * @return The HostInfo param.
     * 
     */
    public Output<Optional<HipObjectHostInfo>> hostInfo() {
        return Codegen.optional(this.hostInfo);
    }
    /**
     * The MobileDevice param.
     * 
     */
    @Export(name="mobileDevice", refs={HipObjectMobileDevice.class}, tree="[0]")
    private Output</* @Nullable */ HipObjectMobileDevice> mobileDevice;

    /**
     * @return The MobileDevice param.
     * 
     */
    public Output<Optional<HipObjectMobileDevice>> mobileDevice() {
        return Codegen.optional(this.mobileDevice);
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
     * The NetworkInfo param.
     * 
     */
    @Export(name="networkInfo", refs={HipObjectNetworkInfo.class}, tree="[0]")
    private Output</* @Nullable */ HipObjectNetworkInfo> networkInfo;

    /**
     * @return The NetworkInfo param.
     * 
     */
    public Output<Optional<HipObjectNetworkInfo>> networkInfo() {
        return Codegen.optional(this.networkInfo);
    }
    /**
     * The PatchManagement param.
     * 
     */
    @Export(name="patchManagement", refs={HipObjectPatchManagement.class}, tree="[0]")
    private Output</* @Nullable */ HipObjectPatchManagement> patchManagement;

    /**
     * @return The PatchManagement param.
     * 
     */
    public Output<Optional<HipObjectPatchManagement>> patchManagement() {
        return Codegen.optional(this.patchManagement);
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
    public HipObject(java.lang.String name) {
        this(name, HipObjectArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public HipObject(java.lang.String name, @Nullable HipObjectArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public HipObject(java.lang.String name, @Nullable HipObjectArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("scm:index/hipObject:HipObject", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private HipObject(java.lang.String name, Output<java.lang.String> id, @Nullable HipObjectState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("scm:index/hipObject:HipObject", name, state, makeResourceOptions(options, id), false);
    }

    private static HipObjectArgs makeArgs(@Nullable HipObjectArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? HipObjectArgs.Empty : args;
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
    public static HipObject get(java.lang.String name, Output<java.lang.String> id, @Nullable HipObjectState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new HipObject(name, id, state, options);
    }
}
