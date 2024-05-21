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
 * const example = new scm.WildfireAntiVirusProfile("example", {folder: "Shared"});
 * ```
 */
export class WildfireAntiVirusProfile extends pulumi.CustomResource {
    /**
     * Get an existing WildfireAntiVirusProfile resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: WildfireAntiVirusProfileState, opts?: pulumi.CustomResourceOptions): WildfireAntiVirusProfile {
        return new WildfireAntiVirusProfile(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'scm:index/wildfireAntiVirusProfile:WildfireAntiVirusProfile';

    /**
     * Returns true if the given object is an instance of WildfireAntiVirusProfile.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is WildfireAntiVirusProfile {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === WildfireAntiVirusProfile.__pulumiType;
    }

    /**
     * The Description param.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The Device param.
     */
    public readonly device!: pulumi.Output<string | undefined>;
    /**
     * The Folder param.
     */
    public readonly folder!: pulumi.Output<string | undefined>;
    /**
     * The MlavExceptions param.
     */
    public readonly mlavExceptions!: pulumi.Output<outputs.WildfireAntiVirusProfileMlavException[] | undefined>;
    /**
     * The Name param. String validation regex: `^[a-zA-Z0-9._-]+$`.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The PacketCapture param.
     */
    public readonly packetCapture!: pulumi.Output<boolean | undefined>;
    /**
     * The Rules param.
     */
    public readonly rules!: pulumi.Output<outputs.WildfireAntiVirusProfileRule[] | undefined>;
    /**
     * The Snippet param.
     */
    public readonly snippet!: pulumi.Output<string | undefined>;
    public /*out*/ readonly tfid!: pulumi.Output<string>;
    /**
     * The ThreatExceptions param.
     */
    public readonly threatExceptions!: pulumi.Output<outputs.WildfireAntiVirusProfileThreatException[] | undefined>;

    /**
     * Create a WildfireAntiVirusProfile resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: WildfireAntiVirusProfileArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: WildfireAntiVirusProfileArgs | WildfireAntiVirusProfileState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as WildfireAntiVirusProfileState | undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["device"] = state ? state.device : undefined;
            resourceInputs["folder"] = state ? state.folder : undefined;
            resourceInputs["mlavExceptions"] = state ? state.mlavExceptions : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["packetCapture"] = state ? state.packetCapture : undefined;
            resourceInputs["rules"] = state ? state.rules : undefined;
            resourceInputs["snippet"] = state ? state.snippet : undefined;
            resourceInputs["tfid"] = state ? state.tfid : undefined;
            resourceInputs["threatExceptions"] = state ? state.threatExceptions : undefined;
        } else {
            const args = argsOrState as WildfireAntiVirusProfileArgs | undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["device"] = args ? args.device : undefined;
            resourceInputs["folder"] = args ? args.folder : undefined;
            resourceInputs["mlavExceptions"] = args ? args.mlavExceptions : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["packetCapture"] = args ? args.packetCapture : undefined;
            resourceInputs["rules"] = args ? args.rules : undefined;
            resourceInputs["snippet"] = args ? args.snippet : undefined;
            resourceInputs["threatExceptions"] = args ? args.threatExceptions : undefined;
            resourceInputs["tfid"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(WildfireAntiVirusProfile.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering WildfireAntiVirusProfile resources.
 */
export interface WildfireAntiVirusProfileState {
    /**
     * The Description param.
     */
    description?: pulumi.Input<string>;
    /**
     * The Device param.
     */
    device?: pulumi.Input<string>;
    /**
     * The Folder param.
     */
    folder?: pulumi.Input<string>;
    /**
     * The MlavExceptions param.
     */
    mlavExceptions?: pulumi.Input<pulumi.Input<inputs.WildfireAntiVirusProfileMlavException>[]>;
    /**
     * The Name param. String validation regex: `^[a-zA-Z0-9._-]+$`.
     */
    name?: pulumi.Input<string>;
    /**
     * The PacketCapture param.
     */
    packetCapture?: pulumi.Input<boolean>;
    /**
     * The Rules param.
     */
    rules?: pulumi.Input<pulumi.Input<inputs.WildfireAntiVirusProfileRule>[]>;
    /**
     * The Snippet param.
     */
    snippet?: pulumi.Input<string>;
    tfid?: pulumi.Input<string>;
    /**
     * The ThreatExceptions param.
     */
    threatExceptions?: pulumi.Input<pulumi.Input<inputs.WildfireAntiVirusProfileThreatException>[]>;
}

/**
 * The set of arguments for constructing a WildfireAntiVirusProfile resource.
 */
export interface WildfireAntiVirusProfileArgs {
    /**
     * The Description param.
     */
    description?: pulumi.Input<string>;
    /**
     * The Device param.
     */
    device?: pulumi.Input<string>;
    /**
     * The Folder param.
     */
    folder?: pulumi.Input<string>;
    /**
     * The MlavExceptions param.
     */
    mlavExceptions?: pulumi.Input<pulumi.Input<inputs.WildfireAntiVirusProfileMlavException>[]>;
    /**
     * The Name param. String validation regex: `^[a-zA-Z0-9._-]+$`.
     */
    name?: pulumi.Input<string>;
    /**
     * The PacketCapture param.
     */
    packetCapture?: pulumi.Input<boolean>;
    /**
     * The Rules param.
     */
    rules?: pulumi.Input<pulumi.Input<inputs.WildfireAntiVirusProfileRule>[]>;
    /**
     * The Snippet param.
     */
    snippet?: pulumi.Input<string>;
    /**
     * The ThreatExceptions param.
     */
    threatExceptions?: pulumi.Input<pulumi.Input<inputs.WildfireAntiVirusProfileThreatException>[]>;
}
