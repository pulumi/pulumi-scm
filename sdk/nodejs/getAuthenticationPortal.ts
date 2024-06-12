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
 * const example = scm.getAuthenticationPortal({
 *     id: "1234-56-789",
 * });
 * ```
 */
export function getAuthenticationPortal(args: GetAuthenticationPortalArgs, opts?: pulumi.InvokeOptions): Promise<GetAuthenticationPortalResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("scm:index/getAuthenticationPortal:getAuthenticationPortal", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getAuthenticationPortal.
 */
export interface GetAuthenticationPortalArgs {
    /**
     * The Id param.
     */
    id: string;
}

/**
 * A collection of values returned by getAuthenticationPortal.
 */
export interface GetAuthenticationPortalResult {
    /**
     * The AuthenticationProfile param.
     */
    readonly authenticationProfile: string;
    /**
     * The CertificateProfile param.
     */
    readonly certificateProfile: string;
    /**
     * The GpUdpPort param. Value must be between 1 and 65535.
     */
    readonly gpUdpPort: number;
    /**
     * The Id param.
     */
    readonly id: string;
    /**
     * The IdleTimer param. Value must be between 1 and 1440.
     */
    readonly idleTimer: number;
    /**
     * The RedirectHost param.
     */
    readonly redirectHost: string;
    readonly tfid: string;
    /**
     * The Timer param. Value must be between 1 and 1440.
     */
    readonly timer: number;
    /**
     * The TlsServiceProfile param.
     */
    readonly tlsServiceProfile: string;
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
 * const example = scm.getAuthenticationPortal({
 *     id: "1234-56-789",
 * });
 * ```
 */
export function getAuthenticationPortalOutput(args: GetAuthenticationPortalOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAuthenticationPortalResult> {
    return pulumi.output(args).apply((a: any) => getAuthenticationPortal(a, opts))
}

/**
 * A collection of arguments for invoking getAuthenticationPortal.
 */
export interface GetAuthenticationPortalOutputArgs {
    /**
     * The Id param.
     */
    id: pulumi.Input<string>;
}