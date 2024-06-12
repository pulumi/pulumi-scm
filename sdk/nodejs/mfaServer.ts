// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Retrieves a config item.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as scm from "@pulumi/scm";
 *
 * const example = new scm.MfaServer("example", {});
 * ```
 */
export class MfaServer extends pulumi.CustomResource {
    /**
     * Get an existing MfaServer resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: MfaServerState, opts?: pulumi.CustomResourceOptions): MfaServer {
        return new MfaServer(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'scm:index/mfaServer:MfaServer';

    /**
     * Returns true if the given object is an instance of MfaServer.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is MfaServer {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === MfaServer.__pulumiType;
    }

    /**
     * The Device param.
     */
    public readonly device!: pulumi.Output<string | undefined>;
    /**
     * The Folder param.
     */
    public readonly folder!: pulumi.Output<string | undefined>;
    /**
     * The MfaCertProfile param.
     */
    public readonly mfaCertProfile!: pulumi.Output<string>;
    /**
     * The MfaVendorType param.
     */
    public readonly mfaVendorType!: pulumi.Output<outputs.MfaServerMfaVendorType | undefined>;
    /**
     * The Name param.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The Snippet param.
     */
    public readonly snippet!: pulumi.Output<string | undefined>;
    public /*out*/ readonly tfid!: pulumi.Output<string>;

    /**
     * Create a MfaServer resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: MfaServerArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: MfaServerArgs | MfaServerState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as MfaServerState | undefined;
            resourceInputs["device"] = state ? state.device : undefined;
            resourceInputs["folder"] = state ? state.folder : undefined;
            resourceInputs["mfaCertProfile"] = state ? state.mfaCertProfile : undefined;
            resourceInputs["mfaVendorType"] = state ? state.mfaVendorType : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["snippet"] = state ? state.snippet : undefined;
            resourceInputs["tfid"] = state ? state.tfid : undefined;
        } else {
            const args = argsOrState as MfaServerArgs | undefined;
            if ((!args || args.mfaCertProfile === undefined) && !opts.urn) {
                throw new Error("Missing required property 'mfaCertProfile'");
            }
            resourceInputs["device"] = args ? args.device : undefined;
            resourceInputs["folder"] = args ? args.folder : undefined;
            resourceInputs["mfaCertProfile"] = args ? args.mfaCertProfile : undefined;
            resourceInputs["mfaVendorType"] = args ? args.mfaVendorType : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["snippet"] = args ? args.snippet : undefined;
            resourceInputs["tfid"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(MfaServer.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering MfaServer resources.
 */
export interface MfaServerState {
    /**
     * The Device param.
     */
    device?: pulumi.Input<string>;
    /**
     * The Folder param.
     */
    folder?: pulumi.Input<string>;
    /**
     * The MfaCertProfile param.
     */
    mfaCertProfile?: pulumi.Input<string>;
    /**
     * The MfaVendorType param.
     */
    mfaVendorType?: pulumi.Input<inputs.MfaServerMfaVendorType>;
    /**
     * The Name param.
     */
    name?: pulumi.Input<string>;
    /**
     * The Snippet param.
     */
    snippet?: pulumi.Input<string>;
    tfid?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a MfaServer resource.
 */
export interface MfaServerArgs {
    /**
     * The Device param.
     */
    device?: pulumi.Input<string>;
    /**
     * The Folder param.
     */
    folder?: pulumi.Input<string>;
    /**
     * The MfaCertProfile param.
     */
    mfaCertProfile: pulumi.Input<string>;
    /**
     * The MfaVendorType param.
     */
    mfaVendorType?: pulumi.Input<inputs.MfaServerMfaVendorType>;
    /**
     * The Name param.
     */
    name?: pulumi.Input<string>;
    /**
     * The Snippet param.
     */
    snippet?: pulumi.Input<string>;
}