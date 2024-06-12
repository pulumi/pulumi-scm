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
 * const example = scm.getTag({
 *     id: "1234-56-789",
 * });
 * ```
 */
export function getTag(args: GetTagArgs, opts?: pulumi.InvokeOptions): Promise<GetTagResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("scm:index/getTag:getTag", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getTag.
 */
export interface GetTagArgs {
    /**
     * The Id param.
     */
    id: string;
}

/**
 * A collection of values returned by getTag.
 */
export interface GetTagResult {
    /**
     * The Color param. String must be one of these: `"Red"`, `"Green"`, `"Blue"`, `"Yellow"`, `"Copper"`, `"Orange"`, `"Purple"`, `"Gray"`, `"Light Green"`, `"Cyan"`, `"Light Gray"`, `"Blue Gray"`, `"Lime"`, `"Black"`, `"Gold"`, `"Brown"`, `"Olive"`, `"Maroon"`, `"Red-Orange"`, `"Yellow-Orange"`, `"Forest Green"`, `"Turquoise Blue"`, `"Azure Blue"`, `"Cerulean Blue"`, `"Midnight Blue"`, `"Medium Blue"`, `"Cobalt Blue"`, `"Violet Blue"`, `"Blue Violet"`, `"Medium Violet"`, `"Medium Rose"`, `"Lavender"`, `"Orchid"`, `"Thistle"`, `"Peach"`, `"Salmon"`, `"Magenta"`, `"Red Violet"`, `"Mahogany"`, `"Burnt Sienna"`, `"Chestnut"`.
     */
    readonly color: string;
    /**
     * The Comments param. String length must not exceed 1023 characters.
     */
    readonly comments: string;
    /**
     * The Id param.
     */
    readonly id: string;
    /**
     * The Name param. String length must not exceed 127 characters.
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
 * const example = scm.getTag({
 *     id: "1234-56-789",
 * });
 * ```
 */
export function getTagOutput(args: GetTagOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetTagResult> {
    return pulumi.output(args).apply((a: any) => getTag(a, opts))
}

/**
 * A collection of arguments for invoking getTag.
 */
export interface GetTagOutputArgs {
    /**
     * The Id param.
     */
    id: pulumi.Input<string>;
}