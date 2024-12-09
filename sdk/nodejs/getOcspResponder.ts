// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
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
 * const example = scm.getOcspResponder({
 *     id: "1234-56-789",
 * });
 * ```
 */
export function getOcspResponder(args: GetOcspResponderArgs, opts?: pulumi.InvokeOptions): Promise<GetOcspResponderResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("scm:index/getOcspResponder:getOcspResponder", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getOcspResponder.
 */
export interface GetOcspResponderArgs {
    /**
     * The Id param.
     */
    id: string;
}

/**
 * A collection of values returned by getOcspResponder.
 */
export interface GetOcspResponderResult {
    /**
     * The HostName param. String length must be between 1 and 255 characters.
     */
    readonly hostName: string;
    /**
     * The Id param.
     */
    readonly id: string;
    /**
     * alphanumeric string [:0-9a-zA-Z._-]. String length must not exceed 63 characters. String validation regex: `^[a-zA-Z0-9._-]+$`.
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
 * const example = scm.getOcspResponder({
 *     id: "1234-56-789",
 * });
 * ```
 */
export function getOcspResponderOutput(args: GetOcspResponderOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetOcspResponderResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("scm:index/getOcspResponder:getOcspResponder", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getOcspResponder.
 */
export interface GetOcspResponderOutputArgs {
    /**
     * The Id param.
     */
    id: pulumi.Input<string>;
}
