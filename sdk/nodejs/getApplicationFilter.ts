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
 * const example = scm.getApplicationFilter({
 *     id: "1234-56-789",
 * });
 * ```
 */
export function getApplicationFilter(args: GetApplicationFilterArgs, opts?: pulumi.InvokeOptions): Promise<GetApplicationFilterResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("scm:index/getApplicationFilter:getApplicationFilter", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getApplicationFilter.
 */
export interface GetApplicationFilterArgs {
    /**
     * The Id param.
     */
    id: string;
}

/**
 * A collection of values returned by getApplicationFilter.
 */
export interface GetApplicationFilterResult {
    /**
     * The Categories param. Individual elements in this list are subject to additional validation. String length must not exceed 128 characters.
     */
    readonly categories: string[];
    /**
     * only True is a valid value.
     */
    readonly evasive: boolean;
    /**
     * only True is a valid value.
     */
    readonly excessiveBandwidthUse: boolean;
    /**
     * The Excludes param. Individual elements in this list are subject to additional validation. String length must not exceed 63 characters.
     */
    readonly excludes: string[];
    /**
     * only True is a valid value.
     */
    readonly hasKnownVulnerabilities: boolean;
    /**
     * The Id param.
     */
    readonly id: string;
    /**
     * only True is a valid value.
     */
    readonly isSaas: boolean;
    /**
     * Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
     */
    readonly name: string;
    /**
     * only True is a valid value.
     */
    readonly newAppid: boolean;
    /**
     * only True is a valid value.
     */
    readonly pervasive: boolean;
    /**
     * only True is a valid value.
     */
    readonly proneToMisuse: boolean;
    /**
     * The Risks param. Individual elements in this list are subject to additional validation. Value must be between 1 and 5.
     */
    readonly risks: number[];
    /**
     * The SaasCertifications param. Individual elements in this list are subject to additional validation. String length must not exceed 32 characters.
     */
    readonly saasCertifications: string[];
    /**
     * The SaasRisks param. Individual elements in this list are subject to additional validation. String length must not exceed 32 characters.
     */
    readonly saasRisks: string[];
    /**
     * The Subcategories param. Individual elements in this list are subject to additional validation. String length must not exceed 128 characters.
     */
    readonly subcategories: string[];
    /**
     * The Tagging param.
     */
    readonly tagging: outputs.GetApplicationFilterTagging;
    /**
     * The Technologies param. Individual elements in this list are subject to additional validation. String length must not exceed 128 characters.
     */
    readonly technologies: string[];
    readonly tfid: string;
    /**
     * only True is a valid value.
     */
    readonly transfersFiles: boolean;
    /**
     * only True is a valid value.
     */
    readonly tunnelsOtherApps: boolean;
    /**
     * only True is a valid value.
     */
    readonly usedByMalware: boolean;
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
 * const example = scm.getApplicationFilter({
 *     id: "1234-56-789",
 * });
 * ```
 */
export function getApplicationFilterOutput(args: GetApplicationFilterOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetApplicationFilterResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("scm:index/getApplicationFilter:getApplicationFilter", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getApplicationFilter.
 */
export interface GetApplicationFilterOutputArgs {
    /**
     * The Id param.
     */
    id: pulumi.Input<string>;
}
