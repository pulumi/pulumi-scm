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
 * const example = scm.getRadiusServerProfileList({
 *     folder: "Shared",
 * });
 * ```
 */
export function getRadiusServerProfileList(args?: GetRadiusServerProfileListArgs, opts?: pulumi.InvokeOptions): Promise<GetRadiusServerProfileListResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("scm:index/getRadiusServerProfileList:getRadiusServerProfileList", {
        "device": args.device,
        "folder": args.folder,
        "limit": args.limit,
        "name": args.name,
        "offset": args.offset,
        "snippet": args.snippet,
    }, opts);
}

/**
 * A collection of arguments for invoking getRadiusServerProfileList.
 */
export interface GetRadiusServerProfileListArgs {
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
 * A collection of values returned by getRadiusServerProfileList.
 */
export interface GetRadiusServerProfileListResult {
    /**
     * The Data param.
     */
    readonly datas: outputs.GetRadiusServerProfileListData[];
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
 * const example = scm.getRadiusServerProfileList({
 *     folder: "Shared",
 * });
 * ```
 */
export function getRadiusServerProfileListOutput(args?: GetRadiusServerProfileListOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetRadiusServerProfileListResult> {
    return pulumi.output(args).apply((a: any) => getRadiusServerProfileList(a, opts))
}

/**
 * A collection of arguments for invoking getRadiusServerProfileList.
 */
export interface GetRadiusServerProfileListOutputArgs {
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