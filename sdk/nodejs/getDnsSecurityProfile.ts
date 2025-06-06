// *** WARNING: this file was generated by pulumi-language-nodejs. ***
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
 * const example = scm.getDnsSecurityProfile({
 *     id: "1234-56-789",
 * });
 * ```
 */
export function getDnsSecurityProfile(args: GetDnsSecurityProfileArgs, opts?: pulumi.InvokeOptions): Promise<GetDnsSecurityProfileResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("scm:index/getDnsSecurityProfile:getDnsSecurityProfile", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getDnsSecurityProfile.
 */
export interface GetDnsSecurityProfileArgs {
    /**
     * The Id param.
     */
    id: string;
}

/**
 * A collection of values returned by getDnsSecurityProfile.
 */
export interface GetDnsSecurityProfileResult {
    /**
     * The BotnetDomains param.
     */
    readonly botnetDomains: outputs.GetDnsSecurityProfileBotnetDomains;
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
 * const example = scm.getDnsSecurityProfile({
 *     id: "1234-56-789",
 * });
 * ```
 */
export function getDnsSecurityProfileOutput(args: GetDnsSecurityProfileOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetDnsSecurityProfileResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("scm:index/getDnsSecurityProfile:getDnsSecurityProfile", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getDnsSecurityProfile.
 */
export interface GetDnsSecurityProfileOutputArgs {
    /**
     * The Id param.
     */
    id: pulumi.Input<string>;
}
