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
 * const example = scm.getRemoteNetwork({
 *     id: "1234-56-789",
 * });
 * ```
 */
export function getRemoteNetwork(args: GetRemoteNetworkArgs, opts?: pulumi.InvokeOptions): Promise<GetRemoteNetworkResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("scm:index/getRemoteNetwork:getRemoteNetwork", {
        "folder": args.folder,
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getRemoteNetwork.
 */
export interface GetRemoteNetworkArgs {
    /**
     * The Folder param. String can either be a specific string(`"Remote Networks"`) or match this regex: `^[\s0-9a-zA-Z._-]{1,}$`. Default: `"Remote Networks"`.
     */
    folder?: string;
    /**
     * The Id param.
     */
    id: string;
}

/**
 * A collection of values returned by getRemoteNetwork.
 */
export interface GetRemoteNetworkResult {
    /**
     * The EcmpLoadBalancing param. String must be one of these: `"enable"`, `"disable"`. Default: `"disable"`.
     */
    readonly ecmpLoadBalancing: string;
    /**
     * ecmp*tunnels is required when ecmp*load*balancing is enable.
     */
    readonly ecmpTunnels: outputs.GetRemoteNetworkEcmpTunnel[];
    /**
     * The Folder param. String can either be a specific string(`"Remote Networks"`) or match this regex: `^[\s0-9a-zA-Z._-]{1,}$`. Default: `"Remote Networks"`.
     */
    readonly folder: string;
    /**
     * The Id param.
     */
    readonly id: string;
    /**
     * ipsec*tunnel is required when ecmp*load_balancing is disable.
     */
    readonly ipsecTunnel: string;
    /**
     * New customer will only be on aggregate bandwidth licensing. String length must exceed 1 characters. Default: `"FWAAS-AGGREGATE"`.
     */
    readonly licenseType: string;
    /**
     * Alphanumeric string begin with letter: [0-9a-zA-Z._-]. String length must not exceed 63 characters.
     */
    readonly name: string;
    /**
     * setup the protocol when ecmp*load*balancing is disable.
     */
    readonly protocol: outputs.GetRemoteNetworkProtocol;
    /**
     * The Region param. String length must exceed 1 characters.
     */
    readonly region: string;
    /**
     * specify secondary ipsecTunnel if needed.
     */
    readonly secondaryIpsecTunnel: string;
    /**
     * spn-name is needed when licenseType is FWAAS-AGGREGATE.
     */
    readonly spnName: string;
    /**
     * The Subnets param.
     */
    readonly subnets: string[];
    readonly tfid: string;
}
/**
 * Retrieves a config item.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as scm from "@pulumi/scm";
 *
 * const example = scm.getRemoteNetwork({
 *     id: "1234-56-789",
 * });
 * ```
 */
export function getRemoteNetworkOutput(args: GetRemoteNetworkOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetRemoteNetworkResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("scm:index/getRemoteNetwork:getRemoteNetwork", {
        "folder": args.folder,
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getRemoteNetwork.
 */
export interface GetRemoteNetworkOutputArgs {
    /**
     * The Folder param. String can either be a specific string(`"Remote Networks"`) or match this regex: `^[\s0-9a-zA-Z._-]{1,}$`. Default: `"Remote Networks"`.
     */
    folder?: pulumi.Input<string>;
    /**
     * The Id param.
     */
    id: pulumi.Input<string>;
}
