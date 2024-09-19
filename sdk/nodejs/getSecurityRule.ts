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
 * const example = scm.getSecurityRule({
 *     id: "1234-56-789",
 * });
 * ```
 */
export function getSecurityRule(args: GetSecurityRuleArgs, opts?: pulumi.InvokeOptions): Promise<GetSecurityRuleResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("scm:index/getSecurityRule:getSecurityRule", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getSecurityRule.
 */
export interface GetSecurityRuleArgs {
    /**
     * The Id param.
     */
    id: string;
}

/**
 * A collection of values returned by getSecurityRule.
 */
export interface GetSecurityRuleResult {
    /**
     * The action to be taken when the rule is matched. String must be one of these: `"allow"`, `"deny"`, `"drop"`, `"reset-client"`, `"reset-server"`, `"reset-both"`.
     */
    readonly action: string;
    /**
     * The application(s) being accessed.
     */
    readonly applications: string[];
    /**
     * The URL categories being accessed.
     */
    readonly categories: string[];
    /**
     * The description of the security rule.
     */
    readonly description: string;
    /**
     * The destination Host Integrity Profile(s).
     */
    readonly destinationHips: string[];
    /**
     * The destination address(es).
     */
    readonly destinations: string[];
    /**
     * The state of the security rule. Default: `false`.
     */
    readonly disabled: boolean;
    /**
     * The source security zone(s).
     */
    readonly froms: string[];
    /**
     * The Id param.
     */
    readonly id: string;
    /**
     * The external log forwarding profile.
     */
    readonly logSetting: string;
    /**
     * The name of the security rule.
     */
    readonly name: string;
    /**
     * Negate the destination addresses(es). Default: `false`.
     */
    readonly negateDestination: boolean;
    /**
     * Negate the source address(es). Default: `false`.
     */
    readonly negateSource: boolean;
    /**
     * The security profile object.
     */
    readonly profileSetting: outputs.GetSecurityRuleProfileSetting;
    /**
     * The service(s) being accessed.
     */
    readonly services: string[];
    /**
     * The source Host Integrity Profile(s).
     */
    readonly sourceHips: string[];
    /**
     * The source user(s) or group(s).
     */
    readonly sourceUsers: string[];
    /**
     * The source address(es).
     */
    readonly sources: string[];
    /**
     * The tags associated with the security rule.
     */
    readonly tags: string[];
    readonly tfid: string;
    /**
     * The destination security zone(s).
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
 * const example = scm.getSecurityRule({
 *     id: "1234-56-789",
 * });
 * ```
 */
export function getSecurityRuleOutput(args: GetSecurityRuleOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSecurityRuleResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("scm:index/getSecurityRule:getSecurityRule", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getSecurityRule.
 */
export interface GetSecurityRuleOutputArgs {
    /**
     * The Id param.
     */
    id: pulumi.Input<string>;
}
