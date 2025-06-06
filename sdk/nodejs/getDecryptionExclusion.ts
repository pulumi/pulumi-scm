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
 * const example = scm.getDecryptionExclusion({
 *     id: "1234-56-789",
 * });
 * ```
 */
export function getDecryptionExclusion(args: GetDecryptionExclusionArgs, opts?: pulumi.InvokeOptions): Promise<GetDecryptionExclusionResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("scm:index/getDecryptionExclusion:getDecryptionExclusion", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getDecryptionExclusion.
 */
export interface GetDecryptionExclusionArgs {
    /**
     * The Id param.
     */
    id: string;
}

/**
 * A collection of values returned by getDecryptionExclusion.
 */
export interface GetDecryptionExclusionResult {
    /**
     * The Description param.
     */
    readonly description: string;
    /**
     * The Id param.
     */
    readonly id: string;
    /**
     * The Name param.
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
 * const example = scm.getDecryptionExclusion({
 *     id: "1234-56-789",
 * });
 * ```
 */
export function getDecryptionExclusionOutput(args: GetDecryptionExclusionOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetDecryptionExclusionResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("scm:index/getDecryptionExclusion:getDecryptionExclusion", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getDecryptionExclusion.
 */
export interface GetDecryptionExclusionOutputArgs {
    /**
     * The Id param.
     */
    id: pulumi.Input<string>;
}
