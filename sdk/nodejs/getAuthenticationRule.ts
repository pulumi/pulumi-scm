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
 * const example = scm.getAuthenticationRule({
 *     id: "1234-56-789",
 * });
 * ```
 */
export function getAuthenticationRule(args: GetAuthenticationRuleArgs, opts?: pulumi.InvokeOptions): Promise<GetAuthenticationRuleResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("scm:index/getAuthenticationRule:getAuthenticationRule", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getAuthenticationRule.
 */
export interface GetAuthenticationRuleArgs {
    /**
     * The Id param.
     */
    id: string;
}

/**
 * A collection of values returned by getAuthenticationRule.
 */
export interface GetAuthenticationRuleResult {
    /**
     * the authentication profile name to apply to authentication rule.
     */
    readonly authenticationEnforcement: string;
    /**
     * The Categories param.
     */
    readonly categories: string[];
    /**
     * The Description param.
     */
    readonly description: string;
    /**
     * The DestinationHips param.
     */
    readonly destinationHips: string[];
    /**
     * The Destinations param.
     */
    readonly destinations: string[];
    /**
     * The Disabled param. Default: `false`.
     */
    readonly disabled: boolean;
    /**
     * The Froms param.
     */
    readonly froms: string[];
    /**
     * The GroupTag param.
     */
    readonly groupTag: string;
    /**
     * The HipProfiles param.
     */
    readonly hipProfiles: string[];
    /**
     * The Id param.
     */
    readonly id: string;
    /**
     * The LogAuthenticationTimeout param. Default: `false`.
     */
    readonly logAuthenticationTimeout: boolean;
    /**
     * The LogSetting param.
     */
    readonly logSetting: string;
    /**
     * The Name param.
     */
    readonly name: string;
    /**
     * The NegateDestination param. Default: `false`.
     */
    readonly negateDestination: boolean;
    /**
     * The NegateSource param. Default: `false`.
     */
    readonly negateSource: boolean;
    /**
     * The Services param.
     */
    readonly services: string[];
    /**
     * The SourceHips param.
     */
    readonly sourceHips: string[];
    /**
     * The SourceUsers param.
     */
    readonly sourceUsers: string[];
    /**
     * The Sources param.
     */
    readonly sources: string[];
    /**
     * The Tags param.
     */
    readonly tags: string[];
    readonly tfid: string;
    /**
     * The Timeout param. Value must be between 1 and 1440.
     */
    readonly timeout: number;
    /**
     * The Tos param.
     */
    readonly tos: string[];
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
 * const example = scm.getAuthenticationRule({
 *     id: "1234-56-789",
 * });
 * ```
 */
export function getAuthenticationRuleOutput(args: GetAuthenticationRuleOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetAuthenticationRuleResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("scm:index/getAuthenticationRule:getAuthenticationRule", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getAuthenticationRule.
 */
export interface GetAuthenticationRuleOutputArgs {
    /**
     * The Id param.
     */
    id: pulumi.Input<string>;
}
