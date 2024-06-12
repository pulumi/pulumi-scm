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
 * const example = scm.getServiceConnectionGroup({
 *     id: "1234-56-789",
 *     folder: "Service Connections",
 * });
 * ```
 */
export function getServiceConnectionGroup(args: GetServiceConnectionGroupArgs, opts?: pulumi.InvokeOptions): Promise<GetServiceConnectionGroupResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("scm:index/getServiceConnectionGroup:getServiceConnectionGroup", {
        "folder": args.folder,
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getServiceConnectionGroup.
 */
export interface GetServiceConnectionGroupArgs {
    /**
     * The Folder param. String can either be a specific string(`"Service Connections"`) or match this regex: `^[0-9a-zA-Z._\s-]{1,}$`. Default: `"Service Connections"`.
     */
    folder?: string;
    /**
     * The Id param.
     */
    id: string;
}

/**
 * A collection of values returned by getServiceConnectionGroup.
 */
export interface GetServiceConnectionGroupResult {
    /**
     * The DisableSnat param.
     */
    readonly disableSnat: boolean;
    /**
     * The Folder param. String can either be a specific string(`"Service Connections"`) or match this regex: `^[0-9a-zA-Z._\s-]{1,}$`. Default: `"Service Connections"`.
     */
    readonly folder: string;
    /**
     * The Id param.
     */
    readonly id: string;
    /**
     * The Name param.
     */
    readonly name: string;
    /**
     * The PbfOnly param.
     */
    readonly pbfOnly: boolean;
    /**
     * The Targets param.
     */
    readonly targets: string[];
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
 * const example = scm.getServiceConnectionGroup({
 *     id: "1234-56-789",
 *     folder: "Service Connections",
 * });
 * ```
 */
export function getServiceConnectionGroupOutput(args: GetServiceConnectionGroupOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetServiceConnectionGroupResult> {
    return pulumi.output(args).apply((a: any) => getServiceConnectionGroup(a, opts))
}

/**
 * A collection of arguments for invoking getServiceConnectionGroup.
 */
export interface GetServiceConnectionGroupOutputArgs {
    /**
     * The Folder param. String can either be a specific string(`"Service Connections"`) or match this regex: `^[0-9a-zA-Z._\s-]{1,}$`. Default: `"Service Connections"`.
     */
    folder?: pulumi.Input<string>;
    /**
     * The Id param.
     */
    id: pulumi.Input<string>;
}