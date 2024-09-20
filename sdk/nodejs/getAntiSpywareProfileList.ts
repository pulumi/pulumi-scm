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
 * const example = scm.getAntiSpywareProfileList({
 *     folder: "Shared",
 * });
 * ```
 */
export function getAntiSpywareProfileList(args?: GetAntiSpywareProfileListArgs, opts?: pulumi.InvokeOptions): Promise<GetAntiSpywareProfileListResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("scm:index/getAntiSpywareProfileList:getAntiSpywareProfileList", {
        "device": args.device,
        "folder": args.folder,
        "limit": args.limit,
        "name": args.name,
        "offset": args.offset,
        "snippet": args.snippet,
    }, opts);
}

/**
 * A collection of arguments for invoking getAntiSpywareProfileList.
 */
export interface GetAntiSpywareProfileListArgs {
    /**
     * The Device param.
     */
    device?: string;
    /**
     * The Folder param.
     */
    folder?: string;
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
    /**
     * The Snippet param.
     */
    snippet?: string;
}

/**
 * A collection of values returned by getAntiSpywareProfileList.
 */
export interface GetAntiSpywareProfileListResult {
    /**
     * The Data param.
     */
    readonly datas: outputs.GetAntiSpywareProfileListData[];
    /**
     * The Device param.
     */
    readonly device?: string;
    /**
     * The Folder param.
     */
    readonly folder?: string;
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
    /**
     * The Snippet param.
     */
    readonly snippet?: string;
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
 * const example = scm.getAntiSpywareProfileList({
 *     folder: "Shared",
 * });
 * ```
 */
export function getAntiSpywareProfileListOutput(args?: GetAntiSpywareProfileListOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAntiSpywareProfileListResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("scm:index/getAntiSpywareProfileList:getAntiSpywareProfileList", {
        "device": args.device,
        "folder": args.folder,
        "limit": args.limit,
        "name": args.name,
        "offset": args.offset,
        "snippet": args.snippet,
    }, opts);
}

/**
 * A collection of arguments for invoking getAntiSpywareProfileList.
 */
export interface GetAntiSpywareProfileListOutputArgs {
    /**
     * The Device param.
     */
    device?: pulumi.Input<string>;
    /**
     * The Folder param.
     */
    folder?: pulumi.Input<string>;
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
    /**
     * The Snippet param.
     */
    snippet?: pulumi.Input<string>;
}
