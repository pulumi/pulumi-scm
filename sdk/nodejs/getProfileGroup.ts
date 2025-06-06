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
 * const example = scm.getProfileGroup({
 *     id: "1234-56-789",
 * });
 * ```
 */
export function getProfileGroup(args: GetProfileGroupArgs, opts?: pulumi.InvokeOptions): Promise<GetProfileGroupResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("scm:index/getProfileGroup:getProfileGroup", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getProfileGroup.
 */
export interface GetProfileGroupArgs {
    /**
     * The Id param.
     */
    id: string;
}

/**
 * A collection of values returned by getProfileGroup.
 */
export interface GetProfileGroupResult {
    /**
     * List of AI security profiles.
     */
    readonly aiSecurities: string[];
    /**
     * List of DNS security profiles.
     */
    readonly dnsSecurities: string[];
    /**
     * List of file blocking profiles.
     */
    readonly fileBlockings: string[];
    /**
     * The Id param.
     */
    readonly id: string;
    /**
     * The name of the profile group.
     */
    readonly name: string;
    /**
     * List of HTTP header insertion profiles.
     */
    readonly saasSecurities: string[];
    /**
     * List of anti-spyware profiles.
     */
    readonly spywares: string[];
    readonly tfid: string;
    /**
     * List of URL filtering profiles.
     */
    readonly urlFilterings: string[];
    /**
     * List of anti-virus and Wildfire analysis profiles.
     */
    readonly virusAndWildfireAnalyses: string[];
    /**
     * List of vulnerability protection profiles.
     */
    readonly vulnerabilities: string[];
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
 * const example = scm.getProfileGroup({
 *     id: "1234-56-789",
 * });
 * ```
 */
export function getProfileGroupOutput(args: GetProfileGroupOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetProfileGroupResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("scm:index/getProfileGroup:getProfileGroup", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getProfileGroup.
 */
export interface GetProfileGroupOutputArgs {
    /**
     * The Id param.
     */
    id: pulumi.Input<string>;
}
