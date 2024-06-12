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
 * const example = new scm.DnsSecurityProfile("example", {});
 * ```
 */
export class DnsSecurityProfile extends pulumi.CustomResource {
    /**
     * Get an existing DnsSecurityProfile resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DnsSecurityProfileState, opts?: pulumi.CustomResourceOptions): DnsSecurityProfile {
        return new DnsSecurityProfile(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'scm:index/dnsSecurityProfile:DnsSecurityProfile';

    /**
     * Returns true if the given object is an instance of DnsSecurityProfile.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DnsSecurityProfile {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DnsSecurityProfile.__pulumiType;
    }

    /**
     * The BotnetDomains param.
     */
    public readonly botnetDomains!: pulumi.Output<outputs.DnsSecurityProfileBotnetDomains | undefined>;
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
     * The Name param.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The Snippet param.
     */
    public readonly snippet!: pulumi.Output<string | undefined>;
    public /*out*/ readonly tfid!: pulumi.Output<string>;

    /**
     * Create a DnsSecurityProfile resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: DnsSecurityProfileArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DnsSecurityProfileArgs | DnsSecurityProfileState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DnsSecurityProfileState | undefined;
            resourceInputs["botnetDomains"] = state ? state.botnetDomains : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["device"] = state ? state.device : undefined;
            resourceInputs["folder"] = state ? state.folder : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["snippet"] = state ? state.snippet : undefined;
            resourceInputs["tfid"] = state ? state.tfid : undefined;
        } else {
            const args = argsOrState as DnsSecurityProfileArgs | undefined;
            resourceInputs["botnetDomains"] = args ? args.botnetDomains : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["device"] = args ? args.device : undefined;
            resourceInputs["folder"] = args ? args.folder : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["snippet"] = args ? args.snippet : undefined;
            resourceInputs["tfid"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(DnsSecurityProfile.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DnsSecurityProfile resources.
 */
export interface DnsSecurityProfileState {
    /**
     * The BotnetDomains param.
     */
    botnetDomains?: pulumi.Input<inputs.DnsSecurityProfileBotnetDomains>;
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
 * The set of arguments for constructing a DnsSecurityProfile resource.
 */
export interface DnsSecurityProfileArgs {
    /**
     * The BotnetDomains param.
     */
    botnetDomains?: pulumi.Input<inputs.DnsSecurityProfileBotnetDomains>;
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
     * The Name param.
     */
    name?: pulumi.Input<string>;
    /**
     * The Snippet param.
     */
    snippet?: pulumi.Input<string>;
}