// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Retrieves a listing of config items.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as scm from "@pulumi/scm";
 *
 * const example = scm.getSnippetList({});
 * ```
 */
export function getSnippetList(args?: GetSnippetListArgs, opts?: pulumi.InvokeOptions): Promise<GetSnippetListResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("scm:index/getSnippetList:getSnippetList", {
        "limit": args.limit,
        "name": args.name,
        "offset": args.offset,
    }, opts);
}

/**
 * A collection of arguments for invoking getSnippetList.
 */
export interface GetSnippetListArgs {
    /**
     * The Limit param. A limit of -1 will return all configured items. Default: `200`.
     */
    limit?: number;
    /**
     * The Name param.
     */
    name?: string;
    /**
     * The Offset param. Default: `0`.
     */
    offset?: number;
}

/**
 * A collection of values returned by getSnippetList.
 */
export interface GetSnippetListResult {
    /**
     * The Data param.
     */
    readonly datas: outputs.GetSnippetListData[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The Limit param. A limit of -1 will return all configured items. Default: `200`.
     */
    readonly limit: number;
    /**
     * The Name param.
     */
    readonly name?: string;
    /**
     * The Offset param. Default: `0`.
     */
    readonly offset: number;
    readonly tfid: string;
    /**
     * The Total param.
     */
    readonly total: number;
}
/**
 * Retrieves a listing of config items.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as scm from "@pulumi/scm";
 *
 * const example = scm.getSnippetList({});
 * ```
 */
export function getSnippetListOutput(args?: GetSnippetListOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSnippetListResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("scm:index/getSnippetList:getSnippetList", {
        "limit": args.limit,
        "name": args.name,
        "offset": args.offset,
    }, opts);
}

/**
 * A collection of arguments for invoking getSnippetList.
 */
export interface GetSnippetListOutputArgs {
    /**
     * The Limit param. A limit of -1 will return all configured items. Default: `200`.
     */
    limit?: pulumi.Input<number>;
    /**
     * The Name param.
     */
    name?: pulumi.Input<string>;
    /**
     * The Offset param. Default: `0`.
     */
    offset?: pulumi.Input<number>;
}
