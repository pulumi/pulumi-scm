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
 * const example = scm.getQosPolicyRule({
 *     id: "1234-56-789",
 * });
 * ```
 */
export function getQosPolicyRule(args: GetQosPolicyRuleArgs, opts?: pulumi.InvokeOptions): Promise<GetQosPolicyRuleResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("scm:index/getQosPolicyRule:getQosPolicyRule", {
        "folder": args.folder,
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getQosPolicyRule.
 */
export interface GetQosPolicyRuleArgs {
    /**
     * The Folder param.
     */
    folder?: string;
    /**
     * The Id param.
     */
    id: string;
}

/**
 * A collection of values returned by getQosPolicyRule.
 */
export interface GetQosPolicyRuleResult {
    /**
     * The Action param.
     */
    readonly action: outputs.GetQosPolicyRuleAction;
    /**
     * The Description param.
     */
    readonly description: string;
    /**
     * The DscpTos param.
     */
    readonly dscpTos: outputs.GetQosPolicyRuleDscpTos;
    /**
     * The Folder param.
     */
    readonly folder?: string;
    /**
     * The Id param.
     */
    readonly id: string;
    /**
     * The Name param.
     */
    readonly name: string;
    /**
     * The Schedule param.
     */
    readonly schedule: string;
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
 * const example = scm.getQosPolicyRule({
 *     id: "1234-56-789",
 * });
 * ```
 */
export function getQosPolicyRuleOutput(args: GetQosPolicyRuleOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetQosPolicyRuleResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("scm:index/getQosPolicyRule:getQosPolicyRule", {
        "folder": args.folder,
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getQosPolicyRule.
 */
export interface GetQosPolicyRuleOutputArgs {
    /**
     * The Folder param.
     */
    folder?: pulumi.Input<string>;
    /**
     * The Id param.
     */
    id: pulumi.Input<string>;
}
