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
 * const example = new scm.IpsecTunnel("example", {});
 * ```
 */
export class IpsecTunnel extends pulumi.CustomResource {
    /**
     * Get an existing IpsecTunnel resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: IpsecTunnelState, opts?: pulumi.CustomResourceOptions): IpsecTunnel {
        return new IpsecTunnel(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'scm:index/ipsecTunnel:IpsecTunnel';

    /**
     * Returns true if the given object is an instance of IpsecTunnel.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is IpsecTunnel {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === IpsecTunnel.__pulumiType;
    }

    /**
     * Enable Anti-Replay check on this tunnel.
     */
    public readonly antiReplay!: pulumi.Output<boolean | undefined>;
    /**
     * The AutoKey param.
     */
    public readonly autoKey!: pulumi.Output<outputs.IpsecTunnelAutoKey>;
    /**
     * Copy IP TOS bits from inner packet to IPSec packet (not recommended). Default: `false`.
     */
    public readonly copyTos!: pulumi.Output<boolean>;
    /**
     * The Device param.
     */
    public readonly device!: pulumi.Output<string | undefined>;
    /**
     * allow GRE over IPSec. Default: `false`.
     */
    public readonly enableGreEncapsulation!: pulumi.Output<boolean>;
    /**
     * The Folder param.
     */
    public readonly folder!: pulumi.Output<string | undefined>;
    /**
     * Alphanumeric string begin with letter: [0-9a-zA-Z._-]. String length must not exceed 63 characters.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The Snippet param.
     */
    public readonly snippet!: pulumi.Output<string | undefined>;
    public /*out*/ readonly tfid!: pulumi.Output<string>;
    /**
     * The TunnelMonitor param.
     */
    public readonly tunnelMonitor!: pulumi.Output<outputs.IpsecTunnelTunnelMonitor | undefined>;

    /**
     * Create a IpsecTunnel resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: IpsecTunnelArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: IpsecTunnelArgs | IpsecTunnelState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as IpsecTunnelState | undefined;
            resourceInputs["antiReplay"] = state ? state.antiReplay : undefined;
            resourceInputs["autoKey"] = state ? state.autoKey : undefined;
            resourceInputs["copyTos"] = state ? state.copyTos : undefined;
            resourceInputs["device"] = state ? state.device : undefined;
            resourceInputs["enableGreEncapsulation"] = state ? state.enableGreEncapsulation : undefined;
            resourceInputs["folder"] = state ? state.folder : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["snippet"] = state ? state.snippet : undefined;
            resourceInputs["tfid"] = state ? state.tfid : undefined;
            resourceInputs["tunnelMonitor"] = state ? state.tunnelMonitor : undefined;
        } else {
            const args = argsOrState as IpsecTunnelArgs | undefined;
            if ((!args || args.autoKey === undefined) && !opts.urn) {
                throw new Error("Missing required property 'autoKey'");
            }
            resourceInputs["antiReplay"] = args ? args.antiReplay : undefined;
            resourceInputs["autoKey"] = args ? args.autoKey : undefined;
            resourceInputs["copyTos"] = args ? args.copyTos : undefined;
            resourceInputs["device"] = args ? args.device : undefined;
            resourceInputs["enableGreEncapsulation"] = args ? args.enableGreEncapsulation : undefined;
            resourceInputs["folder"] = args ? args.folder : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["snippet"] = args ? args.snippet : undefined;
            resourceInputs["tunnelMonitor"] = args ? args.tunnelMonitor : undefined;
            resourceInputs["tfid"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(IpsecTunnel.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering IpsecTunnel resources.
 */
export interface IpsecTunnelState {
    /**
     * Enable Anti-Replay check on this tunnel.
     */
    antiReplay?: pulumi.Input<boolean>;
    /**
     * The AutoKey param.
     */
    autoKey?: pulumi.Input<inputs.IpsecTunnelAutoKey>;
    /**
     * Copy IP TOS bits from inner packet to IPSec packet (not recommended). Default: `false`.
     */
    copyTos?: pulumi.Input<boolean>;
    /**
     * The Device param.
     */
    device?: pulumi.Input<string>;
    /**
     * allow GRE over IPSec. Default: `false`.
     */
    enableGreEncapsulation?: pulumi.Input<boolean>;
    /**
     * The Folder param.
     */
    folder?: pulumi.Input<string>;
    /**
     * Alphanumeric string begin with letter: [0-9a-zA-Z._-]. String length must not exceed 63 characters.
     */
    name?: pulumi.Input<string>;
    /**
     * The Snippet param.
     */
    snippet?: pulumi.Input<string>;
    tfid?: pulumi.Input<string>;
    /**
     * The TunnelMonitor param.
     */
    tunnelMonitor?: pulumi.Input<inputs.IpsecTunnelTunnelMonitor>;
}

/**
 * The set of arguments for constructing a IpsecTunnel resource.
 */
export interface IpsecTunnelArgs {
    /**
     * Enable Anti-Replay check on this tunnel.
     */
    antiReplay?: pulumi.Input<boolean>;
    /**
     * The AutoKey param.
     */
    autoKey: pulumi.Input<inputs.IpsecTunnelAutoKey>;
    /**
     * Copy IP TOS bits from inner packet to IPSec packet (not recommended). Default: `false`.
     */
    copyTos?: pulumi.Input<boolean>;
    /**
     * The Device param.
     */
    device?: pulumi.Input<string>;
    /**
     * allow GRE over IPSec. Default: `false`.
     */
    enableGreEncapsulation?: pulumi.Input<boolean>;
    /**
     * The Folder param.
     */
    folder?: pulumi.Input<string>;
    /**
     * Alphanumeric string begin with letter: [0-9a-zA-Z._-]. String length must not exceed 63 characters.
     */
    name?: pulumi.Input<string>;
    /**
     * The Snippet param.
     */
    snippet?: pulumi.Input<string>;
    /**
     * The TunnelMonitor param.
     */
    tunnelMonitor?: pulumi.Input<inputs.IpsecTunnelTunnelMonitor>;
}