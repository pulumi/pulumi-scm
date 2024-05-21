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
 * const example = scm.getLabelsGetbyidResponse({
 *     id: "1234-56-789",
 * });
 * ```
 */
export function getLabelsGetbyidResponse(args: GetLabelsGetbyidResponseArgs, opts?: pulumi.InvokeOptions): Promise<GetLabelsGetbyidResponseResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("scm:index/getLabelsGetbyidResponse:getLabelsGetbyidResponse", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getLabelsGetbyidResponse.
 */
export interface GetLabelsGetbyidResponseArgs {
    /**
     * The Id param.
     */
    id: string;
}

/**
 * A collection of values returned by getLabelsGetbyidResponse.
 */
export interface GetLabelsGetbyidResponseResult {
    /**
     * The Description param.
     */
    readonly description: string;
    /**
     * The Folders param.
     */
    readonly folders: string[];
    /**
     * The Id param.
     */
    readonly id: string;
    /**
     * The Name param.
     */
    readonly name: string;
    /**
     * The Snippets param.
     */
    readonly snippets: string[];
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
 * const example = scm.getLabelsGetbyidResponse({
 *     id: "1234-56-789",
 * });
 * ```
 */
export function getLabelsGetbyidResponseOutput(args: GetLabelsGetbyidResponseOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetLabelsGetbyidResponseResult> {
    return pulumi.output(args).apply((a: any) => getLabelsGetbyidResponse(a, opts))
}

/**
 * A collection of arguments for invoking getLabelsGetbyidResponse.
 */
export interface GetLabelsGetbyidResponseOutputArgs {
    /**
     * The Id param.
     */
    id: pulumi.Input<string>;
}
