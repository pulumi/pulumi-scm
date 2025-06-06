// *** WARNING: this file was generated by pulumi-language-nodejs. ***
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
 * const example = new scm.RemoteNetwork("example", {});
 * ```
 */
export class RemoteNetwork extends pulumi.CustomResource {
    /**
     * Get an existing RemoteNetwork resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RemoteNetworkState, opts?: pulumi.CustomResourceOptions): RemoteNetwork {
        return new RemoteNetwork(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'scm:index/remoteNetwork:RemoteNetwork';

    /**
     * Returns true if the given object is an instance of RemoteNetwork.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is RemoteNetwork {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === RemoteNetwork.__pulumiType;
    }

    /**
     * The EcmpLoadBalancing param. String must be one of these: `"enable"`, `"disable"`. Default: `"disable"`.
     */
    public readonly ecmpLoadBalancing!: pulumi.Output<string>;
    /**
     * ecmp*tunnels is required when ecmp*load*balancing is enable.
     */
    public readonly ecmpTunnels!: pulumi.Output<outputs.RemoteNetworkEcmpTunnel[] | undefined>;
    /**
     * (Internal use) Encrypted values returned from the API.
     */
    public /*out*/ readonly encryptedValues!: pulumi.Output<{[key: string]: string}>;
    /**
     * The Folder param. String can either be a specific string(`"Remote Networks"`) or match this regex: `^[\s0-9a-zA-Z._-]{1,}$`. Default: `"Remote Networks"`.
     */
    public readonly folder!: pulumi.Output<string>;
    /**
     * ipsec*tunnel is required when ecmp*load_balancing is disable.
     */
    public readonly ipsecTunnel!: pulumi.Output<string | undefined>;
    /**
     * New customer will only be on aggregate bandwidth licensing. String length must exceed 1 characters. Default: `"FWAAS-AGGREGATE"`.
     */
    public readonly licenseType!: pulumi.Output<string>;
    /**
     * Alphanumeric string begin with letter: [0-9a-zA-Z._-]. String length must not exceed 63 characters.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * setup the protocol when ecmp*load*balancing is disable.
     */
    public readonly protocol!: pulumi.Output<outputs.RemoteNetworkProtocol | undefined>;
    /**
     * The Region param. String length must exceed 1 characters.
     */
    public readonly region!: pulumi.Output<string>;
    /**
     * specify secondary ipsecTunnel if needed.
     */
    public readonly secondaryIpsecTunnel!: pulumi.Output<string | undefined>;
    /**
     * spn-name is needed when licenseType is FWAAS-AGGREGATE.
     */
    public readonly spnName!: pulumi.Output<string | undefined>;
    /**
     * The Subnets param.
     */
    public readonly subnets!: pulumi.Output<string[] | undefined>;
    public /*out*/ readonly tfid!: pulumi.Output<string>;

    /**
     * Create a RemoteNetwork resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RemoteNetworkArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RemoteNetworkArgs | RemoteNetworkState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RemoteNetworkState | undefined;
            resourceInputs["ecmpLoadBalancing"] = state ? state.ecmpLoadBalancing : undefined;
            resourceInputs["ecmpTunnels"] = state ? state.ecmpTunnels : undefined;
            resourceInputs["encryptedValues"] = state ? state.encryptedValues : undefined;
            resourceInputs["folder"] = state ? state.folder : undefined;
            resourceInputs["ipsecTunnel"] = state ? state.ipsecTunnel : undefined;
            resourceInputs["licenseType"] = state ? state.licenseType : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["protocol"] = state ? state.protocol : undefined;
            resourceInputs["region"] = state ? state.region : undefined;
            resourceInputs["secondaryIpsecTunnel"] = state ? state.secondaryIpsecTunnel : undefined;
            resourceInputs["spnName"] = state ? state.spnName : undefined;
            resourceInputs["subnets"] = state ? state.subnets : undefined;
            resourceInputs["tfid"] = state ? state.tfid : undefined;
        } else {
            const args = argsOrState as RemoteNetworkArgs | undefined;
            if ((!args || args.region === undefined) && !opts.urn) {
                throw new Error("Missing required property 'region'");
            }
            resourceInputs["ecmpLoadBalancing"] = args ? args.ecmpLoadBalancing : undefined;
            resourceInputs["ecmpTunnels"] = args ? args.ecmpTunnels : undefined;
            resourceInputs["folder"] = args ? args.folder : undefined;
            resourceInputs["ipsecTunnel"] = args ? args.ipsecTunnel : undefined;
            resourceInputs["licenseType"] = args ? args.licenseType : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["protocol"] = args ? args.protocol : undefined;
            resourceInputs["region"] = args ? args.region : undefined;
            resourceInputs["secondaryIpsecTunnel"] = args ? args.secondaryIpsecTunnel : undefined;
            resourceInputs["spnName"] = args ? args.spnName : undefined;
            resourceInputs["subnets"] = args ? args.subnets : undefined;
            resourceInputs["encryptedValues"] = undefined /*out*/;
            resourceInputs["tfid"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["encryptedValues"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(RemoteNetwork.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering RemoteNetwork resources.
 */
export interface RemoteNetworkState {
    /**
     * The EcmpLoadBalancing param. String must be one of these: `"enable"`, `"disable"`. Default: `"disable"`.
     */
    ecmpLoadBalancing?: pulumi.Input<string>;
    /**
     * ecmp*tunnels is required when ecmp*load*balancing is enable.
     */
    ecmpTunnels?: pulumi.Input<pulumi.Input<inputs.RemoteNetworkEcmpTunnel>[]>;
    /**
     * (Internal use) Encrypted values returned from the API.
     */
    encryptedValues?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The Folder param. String can either be a specific string(`"Remote Networks"`) or match this regex: `^[\s0-9a-zA-Z._-]{1,}$`. Default: `"Remote Networks"`.
     */
    folder?: pulumi.Input<string>;
    /**
     * ipsec*tunnel is required when ecmp*load_balancing is disable.
     */
    ipsecTunnel?: pulumi.Input<string>;
    /**
     * New customer will only be on aggregate bandwidth licensing. String length must exceed 1 characters. Default: `"FWAAS-AGGREGATE"`.
     */
    licenseType?: pulumi.Input<string>;
    /**
     * Alphanumeric string begin with letter: [0-9a-zA-Z._-]. String length must not exceed 63 characters.
     */
    name?: pulumi.Input<string>;
    /**
     * setup the protocol when ecmp*load*balancing is disable.
     */
    protocol?: pulumi.Input<inputs.RemoteNetworkProtocol>;
    /**
     * The Region param. String length must exceed 1 characters.
     */
    region?: pulumi.Input<string>;
    /**
     * specify secondary ipsecTunnel if needed.
     */
    secondaryIpsecTunnel?: pulumi.Input<string>;
    /**
     * spn-name is needed when licenseType is FWAAS-AGGREGATE.
     */
    spnName?: pulumi.Input<string>;
    /**
     * The Subnets param.
     */
    subnets?: pulumi.Input<pulumi.Input<string>[]>;
    tfid?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a RemoteNetwork resource.
 */
export interface RemoteNetworkArgs {
    /**
     * The EcmpLoadBalancing param. String must be one of these: `"enable"`, `"disable"`. Default: `"disable"`.
     */
    ecmpLoadBalancing?: pulumi.Input<string>;
    /**
     * ecmp*tunnels is required when ecmp*load*balancing is enable.
     */
    ecmpTunnels?: pulumi.Input<pulumi.Input<inputs.RemoteNetworkEcmpTunnel>[]>;
    /**
     * The Folder param. String can either be a specific string(`"Remote Networks"`) or match this regex: `^[\s0-9a-zA-Z._-]{1,}$`. Default: `"Remote Networks"`.
     */
    folder?: pulumi.Input<string>;
    /**
     * ipsec*tunnel is required when ecmp*load_balancing is disable.
     */
    ipsecTunnel?: pulumi.Input<string>;
    /**
     * New customer will only be on aggregate bandwidth licensing. String length must exceed 1 characters. Default: `"FWAAS-AGGREGATE"`.
     */
    licenseType?: pulumi.Input<string>;
    /**
     * Alphanumeric string begin with letter: [0-9a-zA-Z._-]. String length must not exceed 63 characters.
     */
    name?: pulumi.Input<string>;
    /**
     * setup the protocol when ecmp*load*balancing is disable.
     */
    protocol?: pulumi.Input<inputs.RemoteNetworkProtocol>;
    /**
     * The Region param. String length must exceed 1 characters.
     */
    region: pulumi.Input<string>;
    /**
     * specify secondary ipsecTunnel if needed.
     */
    secondaryIpsecTunnel?: pulumi.Input<string>;
    /**
     * spn-name is needed when licenseType is FWAAS-AGGREGATE.
     */
    spnName?: pulumi.Input<string>;
    /**
     * The Subnets param.
     */
    subnets?: pulumi.Input<pulumi.Input<string>[]>;
}
