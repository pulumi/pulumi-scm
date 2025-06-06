// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
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
 * const example = scm.getHipProfile({
 *     id: "1234-56-789",
 * });
 * ```
 */
export function getHipProfile(args: GetHipProfileArgs, opts?: pulumi.InvokeOptions): Promise<GetHipProfileResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("scm:index/getHipProfile:getHipProfile", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getHipProfile.
 */
export interface GetHipProfileArgs {
    /**
     * The Id param.
     */
    id: string;
}

/**
 * A collection of values returned by getHipProfile.
 */
export interface GetHipProfileResult {
    /**
     * The Description param. String length must not exceed 255 characters.
     */
    readonly description: string;
    /**
     * The Id param.
     */
    readonly id: string;
    /**
     * The Match param. String length must not exceed 2048 characters.
     */
    readonly match: string;
    /**
     * Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
     */
    readonly name: string;
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
 * const example = scm.getHipProfile({
 *     id: "1234-56-789",
 * });
 * ```
 */
export function getHipProfileOutput(args: GetHipProfileOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetHipProfileResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("scm:index/getHipProfile:getHipProfile", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getHipProfile.
 */
export interface GetHipProfileOutputArgs {
    /**
     * The Id param.
     */
    id: pulumi.Input<string>;
}
