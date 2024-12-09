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
 * const example = scm.getIkeCryptoProfile({
 *     id: "1234-56-789",
 * });
 * ```
 */
export function getIkeCryptoProfile(args: GetIkeCryptoProfileArgs, opts?: pulumi.InvokeOptions): Promise<GetIkeCryptoProfileResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("scm:index/getIkeCryptoProfile:getIkeCryptoProfile", {
        "device": args.device,
        "folder": args.folder,
        "id": args.id,
        "snippet": args.snippet,
    }, opts);
}

/**
 * A collection of arguments for invoking getIkeCryptoProfile.
 */
export interface GetIkeCryptoProfileArgs {
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
 * A collection of values returned by getIkeCryptoProfile.
 */
export interface GetIkeCryptoProfileResult {
    /**
     * IKEv2 SA reauthentication interval equals authetication-multiple * rekey-lifetime; 0 means reauthentication disabled. Value must be less than or equal to 50. Default: `0`.
     */
    readonly authenticationMultiple: number;
    /**
     * The Device param.
     */
    readonly device?: string;
    /**
     * The DhGroups param. Individual elements in this list are subject to additional validation. String must be one of these: `"group1"`, `"group2"`, `"group5"`, `"group14"`, `"group19"`, `"group20"`.
     */
    readonly dhGroups: string[];
    /**
     * Encryption algorithm. Individual elements in this list are subject to additional validation. String must be one of these: `"des"`, `"3des"`, `"aes-128-cbc"`, `"aes-192-cbc"`, `"aes-256-cbc"`, `"aes-128-gcm"`, `"aes-256-gcm"`.
     */
    readonly encryptions: string[];
    /**
     * The Folder param.
     */
    readonly folder?: string;
    /**
     * The Hashes param. Individual elements in this list are subject to additional validation. String must be one of these: `"md5"`, `"sha1"`, `"sha256"`, `"sha384"`, `"sha512"`.
     */
    readonly hashes: string[];
    /**
     * The Id param.
     */
    readonly id: string;
    /**
     * The Lifetime param.
     */
    readonly lifetime: outputs.GetIkeCryptoProfileLifetime;
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
 * const example = scm.getIkeCryptoProfile({
 *     id: "1234-56-789",
 * });
 * ```
 */
export function getIkeCryptoProfileOutput(args: GetIkeCryptoProfileOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetIkeCryptoProfileResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("scm:index/getIkeCryptoProfile:getIkeCryptoProfile", {
        "device": args.device,
        "folder": args.folder,
        "id": args.id,
        "snippet": args.snippet,
    }, opts);
}

/**
 * A collection of arguments for invoking getIkeCryptoProfile.
 */
export interface GetIkeCryptoProfileOutputArgs {
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
