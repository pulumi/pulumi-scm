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
 * const example = scm.getDecryptionProfile({
 *     id: "1234-56-789",
 * });
 * ```
 */
export function getDecryptionProfile(args: GetDecryptionProfileArgs, opts?: pulumi.InvokeOptions): Promise<GetDecryptionProfileResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("scm:index/getDecryptionProfile:getDecryptionProfile", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getDecryptionProfile.
 */
export interface GetDecryptionProfileArgs {
    /**
     * The Id param.
     */
    id: string;
}

/**
 * A collection of values returned by getDecryptionProfile.
 */
export interface GetDecryptionProfileResult {
    /**
     * The Id param.
     */
    readonly id: string;
    /**
     * Must start with alphanumeric char and should contain only alphanemeric, underscore, hyphen, dot or space. String validation regex: `^[A-Za-z0-9]{1}[A-Za-z0-9_\-\.\s]{0,}$`.
     */
    readonly name: string;
    /**
     * The SslForwardProxy param.
     */
    readonly sslForwardProxy: outputs.GetDecryptionProfileSslForwardProxy;
    /**
     * The SslInboundProxy param.
     */
    readonly sslInboundProxy: outputs.GetDecryptionProfileSslInboundProxy;
    /**
     * The SslNoProxy param.
     */
    readonly sslNoProxy: outputs.GetDecryptionProfileSslNoProxy;
    /**
     * The SslProtocolSettings param.
     */
    readonly sslProtocolSettings: outputs.GetDecryptionProfileSslProtocolSettings;
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
 * const example = scm.getDecryptionProfile({
 *     id: "1234-56-789",
 * });
 * ```
 */
export function getDecryptionProfileOutput(args: GetDecryptionProfileOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetDecryptionProfileResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("scm:index/getDecryptionProfile:getDecryptionProfile", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getDecryptionProfile.
 */
export interface GetDecryptionProfileOutputArgs {
    /**
     * The Id param.
     */
    id: pulumi.Input<string>;
}
