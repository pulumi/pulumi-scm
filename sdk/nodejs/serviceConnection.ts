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
 * const example = new scm.ServiceConnection("example", {});
 * ```
 */
export class ServiceConnection extends pulumi.CustomResource {
    /**
     * Get an existing ServiceConnection resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ServiceConnectionState, opts?: pulumi.CustomResourceOptions): ServiceConnection {
        return new ServiceConnection(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'scm:index/serviceConnection:ServiceConnection';

    /**
     * Returns true if the given object is an instance of ServiceConnection.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ServiceConnection {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ServiceConnection.__pulumiType;
    }

    /**
     * The BackupSC param.
     */
    public readonly backupSC!: pulumi.Output<string | undefined>;
    /**
     * The BgpPeer param.
     */
    public readonly bgpPeer!: pulumi.Output<outputs.ServiceConnectionBgpPeer | undefined>;
    /**
     * (Internal use) Encrypted values returned from the API.
     */
    public /*out*/ readonly encryptedValues!: pulumi.Output<{[key: string]: string}>;
    /**
     * The Folder param. String can either be a specific string(`"Service Connections"`) or match this regex: `^[0-9a-zA-Z._\s-]{1,}$`. Default: `"Service Connections"`.
     */
    public readonly folder!: pulumi.Output<string>;
    /**
     * The IpsecTunnel param.
     */
    public readonly ipsecTunnel!: pulumi.Output<string>;
    /**
     * The Name param.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The NatPool param.
     */
    public readonly natPool!: pulumi.Output<string | undefined>;
    /**
     * The NoExportCommunity param. String must be one of these: `"Disabled"`, `"Enabled-In"`, `"Enabled-Out"`, `"Enabled-Both"`.
     */
    public readonly noExportCommunity!: pulumi.Output<string | undefined>;
    /**
     * The OnboardingType param. String must be one of these: `"classic"`. Default: `"classic"`.
     */
    public readonly onboardingType!: pulumi.Output<string>;
    /**
     * The Protocol param.
     */
    public readonly protocol!: pulumi.Output<outputs.ServiceConnectionProtocol | undefined>;
    /**
     * The Qos param.
     */
    public readonly qos!: pulumi.Output<outputs.ServiceConnectionQos | undefined>;
    /**
     * The Region param.
     */
    public readonly region!: pulumi.Output<string>;
    /**
     * The SecondaryIpsecTunnel param.
     */
    public readonly secondaryIpsecTunnel!: pulumi.Output<string | undefined>;
    /**
     * The SourceNat param.
     */
    public readonly sourceNat!: pulumi.Output<boolean | undefined>;
    /**
     * The Subnets param.
     */
    public readonly subnets!: pulumi.Output<string[] | undefined>;
    public /*out*/ readonly tfid!: pulumi.Output<string>;

    /**
     * Create a ServiceConnection resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ServiceConnectionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ServiceConnectionArgs | ServiceConnectionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ServiceConnectionState | undefined;
            resourceInputs["backupSC"] = state ? state.backupSC : undefined;
            resourceInputs["bgpPeer"] = state ? state.bgpPeer : undefined;
            resourceInputs["encryptedValues"] = state ? state.encryptedValues : undefined;
            resourceInputs["folder"] = state ? state.folder : undefined;
            resourceInputs["ipsecTunnel"] = state ? state.ipsecTunnel : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["natPool"] = state ? state.natPool : undefined;
            resourceInputs["noExportCommunity"] = state ? state.noExportCommunity : undefined;
            resourceInputs["onboardingType"] = state ? state.onboardingType : undefined;
            resourceInputs["protocol"] = state ? state.protocol : undefined;
            resourceInputs["qos"] = state ? state.qos : undefined;
            resourceInputs["region"] = state ? state.region : undefined;
            resourceInputs["secondaryIpsecTunnel"] = state ? state.secondaryIpsecTunnel : undefined;
            resourceInputs["sourceNat"] = state ? state.sourceNat : undefined;
            resourceInputs["subnets"] = state ? state.subnets : undefined;
            resourceInputs["tfid"] = state ? state.tfid : undefined;
        } else {
            const args = argsOrState as ServiceConnectionArgs | undefined;
            if ((!args || args.ipsecTunnel === undefined) && !opts.urn) {
                throw new Error("Missing required property 'ipsecTunnel'");
            }
            if ((!args || args.region === undefined) && !opts.urn) {
                throw new Error("Missing required property 'region'");
            }
            resourceInputs["backupSC"] = args ? args.backupSC : undefined;
            resourceInputs["bgpPeer"] = args ? args.bgpPeer : undefined;
            resourceInputs["folder"] = args ? args.folder : undefined;
            resourceInputs["ipsecTunnel"] = args ? args.ipsecTunnel : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["natPool"] = args ? args.natPool : undefined;
            resourceInputs["noExportCommunity"] = args ? args.noExportCommunity : undefined;
            resourceInputs["onboardingType"] = args ? args.onboardingType : undefined;
            resourceInputs["protocol"] = args ? args.protocol : undefined;
            resourceInputs["qos"] = args ? args.qos : undefined;
            resourceInputs["region"] = args ? args.region : undefined;
            resourceInputs["secondaryIpsecTunnel"] = args ? args.secondaryIpsecTunnel : undefined;
            resourceInputs["sourceNat"] = args ? args.sourceNat : undefined;
            resourceInputs["subnets"] = args ? args.subnets : undefined;
            resourceInputs["encryptedValues"] = undefined /*out*/;
            resourceInputs["tfid"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["encryptedValues"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(ServiceConnection.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ServiceConnection resources.
 */
export interface ServiceConnectionState {
    /**
     * The BackupSC param.
     */
    backupSC?: pulumi.Input<string>;
    /**
     * The BgpPeer param.
     */
    bgpPeer?: pulumi.Input<inputs.ServiceConnectionBgpPeer>;
    /**
     * (Internal use) Encrypted values returned from the API.
     */
    encryptedValues?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The Folder param. String can either be a specific string(`"Service Connections"`) or match this regex: `^[0-9a-zA-Z._\s-]{1,}$`. Default: `"Service Connections"`.
     */
    folder?: pulumi.Input<string>;
    /**
     * The IpsecTunnel param.
     */
    ipsecTunnel?: pulumi.Input<string>;
    /**
     * The Name param.
     */
    name?: pulumi.Input<string>;
    /**
     * The NatPool param.
     */
    natPool?: pulumi.Input<string>;
    /**
     * The NoExportCommunity param. String must be one of these: `"Disabled"`, `"Enabled-In"`, `"Enabled-Out"`, `"Enabled-Both"`.
     */
    noExportCommunity?: pulumi.Input<string>;
    /**
     * The OnboardingType param. String must be one of these: `"classic"`. Default: `"classic"`.
     */
    onboardingType?: pulumi.Input<string>;
    /**
     * The Protocol param.
     */
    protocol?: pulumi.Input<inputs.ServiceConnectionProtocol>;
    /**
     * The Qos param.
     */
    qos?: pulumi.Input<inputs.ServiceConnectionQos>;
    /**
     * The Region param.
     */
    region?: pulumi.Input<string>;
    /**
     * The SecondaryIpsecTunnel param.
     */
    secondaryIpsecTunnel?: pulumi.Input<string>;
    /**
     * The SourceNat param.
     */
    sourceNat?: pulumi.Input<boolean>;
    /**
     * The Subnets param.
     */
    subnets?: pulumi.Input<pulumi.Input<string>[]>;
    tfid?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ServiceConnection resource.
 */
export interface ServiceConnectionArgs {
    /**
     * The BackupSC param.
     */
    backupSC?: pulumi.Input<string>;
    /**
     * The BgpPeer param.
     */
    bgpPeer?: pulumi.Input<inputs.ServiceConnectionBgpPeer>;
    /**
     * The Folder param. String can either be a specific string(`"Service Connections"`) or match this regex: `^[0-9a-zA-Z._\s-]{1,}$`. Default: `"Service Connections"`.
     */
    folder?: pulumi.Input<string>;
    /**
     * The IpsecTunnel param.
     */
    ipsecTunnel: pulumi.Input<string>;
    /**
     * The Name param.
     */
    name?: pulumi.Input<string>;
    /**
     * The NatPool param.
     */
    natPool?: pulumi.Input<string>;
    /**
     * The NoExportCommunity param. String must be one of these: `"Disabled"`, `"Enabled-In"`, `"Enabled-Out"`, `"Enabled-Both"`.
     */
    noExportCommunity?: pulumi.Input<string>;
    /**
     * The OnboardingType param. String must be one of these: `"classic"`. Default: `"classic"`.
     */
    onboardingType?: pulumi.Input<string>;
    /**
     * The Protocol param.
     */
    protocol?: pulumi.Input<inputs.ServiceConnectionProtocol>;
    /**
     * The Qos param.
     */
    qos?: pulumi.Input<inputs.ServiceConnectionQos>;
    /**
     * The Region param.
     */
    region: pulumi.Input<string>;
    /**
     * The SecondaryIpsecTunnel param.
     */
    secondaryIpsecTunnel?: pulumi.Input<string>;
    /**
     * The SourceNat param.
     */
    sourceNat?: pulumi.Input<boolean>;
    /**
     * The Subnets param.
     */
    subnets?: pulumi.Input<pulumi.Input<string>[]>;
}
