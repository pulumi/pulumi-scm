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
 * const example = scm.getTacacsServerProfile({
 *     id: "1234-56-789",
 * });
 * ```
 */
export function getTacacsServerProfile(args: GetTacacsServerProfileArgs, opts?: pulumi.InvokeOptions): Promise<GetTacacsServerProfileResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("scm:index/getTacacsServerProfile:getTacacsServerProfile", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getTacacsServerProfile.
 */
export interface GetTacacsServerProfileArgs {
    /**
     * The Id param.
     */
    id: string;
}

/**
 * A collection of values returned by getTacacsServerProfile.
 */
export interface GetTacacsServerProfileResult {
    /**
     * The Id param.
     */
    readonly id: string;
    /**
     * The Protocol param. String must be one of these: `"CHAP"`, `"PAP"`.
     */
    readonly protocol: string;
    /**
     * The Servers param.
     */
    readonly servers: outputs.GetTacacsServerProfileServer[];
    readonly tfid: string;
    /**
     * The Timeout param. Value must be between 1 and 30.
     */
    readonly timeout: number;
    /**
     * The UseSingleConnection param.
     */
    readonly useSingleConnection: boolean;
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
 * const example = scm.getTacacsServerProfile({
 *     id: "1234-56-789",
 * });
 * ```
 */
export function getTacacsServerProfileOutput(args: GetTacacsServerProfileOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetTacacsServerProfileResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("scm:index/getTacacsServerProfile:getTacacsServerProfile", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getTacacsServerProfile.
 */
export interface GetTacacsServerProfileOutputArgs {
    /**
     * The Id param.
     */
    id: pulumi.Input<string>;
}
