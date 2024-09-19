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
 * const example = scm.getIpsecCryptoProfile({
 *     id: "1234-56-789",
 * });
 * ```
 */
export function getIpsecCryptoProfile(args: GetIpsecCryptoProfileArgs, opts?: pulumi.InvokeOptions): Promise<GetIpsecCryptoProfileResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("scm:index/getIpsecCryptoProfile:getIpsecCryptoProfile", {
        "device": args.device,
        "folder": args.folder,
        "id": args.id,
        "snippet": args.snippet,
    }, opts);
}

/**
 * A collection of arguments for invoking getIpsecCryptoProfile.
 */
export interface GetIpsecCryptoProfileArgs {
    /**
     * The Device param.
     */
    device?: string;
    /**
     * The Folder param.
     */
    folder?: string;
    /**
     * The Id param.
     */
    id: string;
    /**
     * The Snippet param.
     */
    snippet?: string;
}

/**
 * A collection of values returned by getIpsecCryptoProfile.
 */
export interface GetIpsecCryptoProfileResult {
    /**
     * The Ah param.
     */
    readonly ah: outputs.GetIpsecCryptoProfileAh;
    /**
     * The Device param.
     */
    readonly device?: string;
    /**
     * phase-2 DH group (PFS DH group). String must be one of these: `"no-pfs"`, `"group1"`, `"group2"`, `"group5"`, `"group14"`, `"group19"`, `"group20"`. Default: `"group2"`.
     */
    readonly dhGroup: string;
    /**
     * The Esp param.
     */
    readonly esp: outputs.GetIpsecCryptoProfileEsp;
    /**
     * The Folder param.
     */
    readonly folder?: string;
    /**
     * The Id param.
     */
    readonly id: string;
    /**
     * The Lifesize param.
     */
    readonly lifesize: outputs.GetIpsecCryptoProfileLifesize;
    /**
     * The Lifetime param.
     */
    readonly lifetime: outputs.GetIpsecCryptoProfileLifetime;
    /**
     * Alphanumeric string begin with letter: [0-9a-zA-Z._-]. String length must not exceed 31 characters.
     */
    readonly name: string;
    /**
     * The Snippet param.
     */
    readonly snippet?: string;
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
 * const example = scm.getIpsecCryptoProfile({
 *     id: "1234-56-789",
 * });
 * ```
 */
export function getIpsecCryptoProfileOutput(args: GetIpsecCryptoProfileOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetIpsecCryptoProfileResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("scm:index/getIpsecCryptoProfile:getIpsecCryptoProfile", {
        "device": args.device,
        "folder": args.folder,
        "id": args.id,
        "snippet": args.snippet,
    }, opts);
}

/**
 * A collection of arguments for invoking getIpsecCryptoProfile.
 */
export interface GetIpsecCryptoProfileOutputArgs {
    /**
     * The Device param.
     */
    device?: pulumi.Input<string>;
    /**
     * The Folder param.
     */
    folder?: pulumi.Input<string>;
    /**
     * The Id param.
     */
    id: pulumi.Input<string>;
    /**
     * The Snippet param.
     */
    snippet?: pulumi.Input<string>;
}
