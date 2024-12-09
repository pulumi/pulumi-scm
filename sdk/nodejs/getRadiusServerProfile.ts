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
 * const example = scm.getRadiusServerProfile({
 *     id: "1234-56-789",
 * });
 * ```
 */
export function getRadiusServerProfile(args: GetRadiusServerProfileArgs, opts?: pulumi.InvokeOptions): Promise<GetRadiusServerProfileResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("scm:index/getRadiusServerProfile:getRadiusServerProfile", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getRadiusServerProfile.
 */
export interface GetRadiusServerProfileArgs {
    /**
     * The Id param.
     */
    id: string;
}

/**
 * A collection of values returned by getRadiusServerProfile.
 */
export interface GetRadiusServerProfileResult {
    /**
     * The Id param.
     */
    readonly id: string;
    /**
     * The Protocol param.
     */
    readonly protocol: outputs.GetRadiusServerProfileProtocol;
    /**
     * The Retries param. Value must be between 1 and 5.
     */
    readonly retries: number;
    /**
     * The Servers param.
     */
    readonly servers: outputs.GetRadiusServerProfileServer[];
    readonly tfid: string;
    /**
     * The Timeout param. Value must be between 1 and 120.
     */
    readonly timeout: number;
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
 * const example = scm.getRadiusServerProfile({
 *     id: "1234-56-789",
 * });
 * ```
 */
export function getRadiusServerProfileOutput(args: GetRadiusServerProfileOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetRadiusServerProfileResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("scm:index/getRadiusServerProfile:getRadiusServerProfile", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getRadiusServerProfile.
 */
export interface GetRadiusServerProfileOutputArgs {
    /**
     * The Id param.
     */
    id: pulumi.Input<string>;
}
