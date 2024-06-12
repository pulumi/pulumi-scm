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
 * const example = scm.getAntiSpywareProfile({
 *     id: "1234-56-789",
 * });
 * ```
 */
export function getAntiSpywareProfile(args: GetAntiSpywareProfileArgs, opts?: pulumi.InvokeOptions): Promise<GetAntiSpywareProfileResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("scm:index/getAntiSpywareProfile:getAntiSpywareProfile", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getAntiSpywareProfile.
 */
export interface GetAntiSpywareProfileArgs {
    /**
     * The Id param.
     */
    id: string;
}

/**
 * A collection of values returned by getAntiSpywareProfile.
 */
export interface GetAntiSpywareProfileResult {
    /**
     * The CloudInlineAnalysis param. Default: `false`.
     */
    readonly cloudInlineAnalysis: boolean;
    /**
     * The Description param.
     */
    readonly description: string;
    /**
     * The Id param.
     */
    readonly id: string;
    /**
     * The InlineExceptionEdlUrls param.
     */
    readonly inlineExceptionEdlUrls: string[];
    /**
     * The InlineExceptionIpAddresses param.
     */
    readonly inlineExceptionIpAddresses: string[];
    /**
     * The MicaEngineSpywareEnabledList param.
     */
    readonly micaEngineSpywareEnabledLists: outputs.GetAntiSpywareProfileMicaEngineSpywareEnabledList[];
    /**
     * The Name param.
     */
    readonly name: string;
    /**
     * The Rules param.
     */
    readonly rules: outputs.GetAntiSpywareProfileRule[];
    readonly tfid: string;
    /**
     * The ThreatExceptions param.
     */
    readonly threatExceptions: outputs.GetAntiSpywareProfileThreatException[];
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
 * const example = scm.getAntiSpywareProfile({
 *     id: "1234-56-789",
 * });
 * ```
 */
export function getAntiSpywareProfileOutput(args: GetAntiSpywareProfileOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAntiSpywareProfileResult> {
    return pulumi.output(args).apply((a: any) => getAntiSpywareProfile(a, opts))
}

/**
 * A collection of arguments for invoking getAntiSpywareProfile.
 */
export interface GetAntiSpywareProfileOutputArgs {
    /**
     * The Id param.
     */
    id: pulumi.Input<string>;
}