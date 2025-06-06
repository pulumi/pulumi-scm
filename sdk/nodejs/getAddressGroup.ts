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
 * const example = scm.getAddressGroup({
 *     id: "1234-56-789",
 * });
 * ```
 */
export function getAddressGroup(args: GetAddressGroupArgs, opts?: pulumi.InvokeOptions): Promise<GetAddressGroupResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("scm:index/getAddressGroup:getAddressGroup", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getAddressGroup.
 */
export interface GetAddressGroupArgs {
    /**
     * The Id param.
     */
    id: string;
}

/**
 * A collection of values returned by getAddressGroup.
 */
export interface GetAddressGroupResult {
    /**
     * The Description param. String length must not exceed 1023 characters.
     */
    readonly description: string;
    /**
     * The DynamicValue param.
     */
    readonly dynamicValue: outputs.GetAddressGroupDynamicValue;
    /**
     * The Id param.
     */
    readonly id: string;
    /**
     * Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 63 characters.
     */
    readonly name: string;
    /**
     * The StaticList param. Individual elements in this list are subject to additional validation. String length must not exceed 63 characters.
     */
    readonly staticLists: string[];
    /**
     * Tags for address group object. List must contain at most 64 elements. Individual elements in this list are subject to additional validation. String length must not exceed 127 characters.
     */
    readonly tags: string[];
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
 * const example = scm.getAddressGroup({
 *     id: "1234-56-789",
 * });
 * ```
 */
export function getAddressGroupOutput(args: GetAddressGroupOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetAddressGroupResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("scm:index/getAddressGroup:getAddressGroup", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getAddressGroup.
 */
export interface GetAddressGroupOutputArgs {
    /**
     * The Id param.
     */
    id: pulumi.Input<string>;
}
