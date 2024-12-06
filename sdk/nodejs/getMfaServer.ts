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
 * const example = scm.getMfaServer({
 *     id: "1234-56-789",
 * });
 * ```
 */
export function getMfaServer(args: GetMfaServerArgs, opts?: pulumi.InvokeOptions): Promise<GetMfaServerResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("scm:index/getMfaServer:getMfaServer", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getMfaServer.
 */
export interface GetMfaServerArgs {
    /**
     * The Id param.
     */
    id: string;
}

/**
 * A collection of values returned by getMfaServer.
 */
export interface GetMfaServerResult {
    /**
     * The Id param.
     */
    readonly id: string;
    /**
     * The MfaCertProfile param.
     */
    readonly mfaCertProfile: string;
    /**
     * The MfaVendorType param.
     */
    readonly mfaVendorType: outputs.GetMfaServerMfaVendorType;
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
 * const example = scm.getMfaServer({
 *     id: "1234-56-789",
 * });
 * ```
 */
export function getMfaServerOutput(args: GetMfaServerOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetMfaServerResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("scm:index/getMfaServer:getMfaServer", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getMfaServer.
 */
export interface GetMfaServerOutputArgs {
    /**
     * The Id param.
     */
    id: pulumi.Input<string>;
}
