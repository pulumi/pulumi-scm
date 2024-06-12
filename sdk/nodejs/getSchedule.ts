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
 * const example = scm.getSchedule({
 *     id: "1234-56-789",
 * });
 * ```
 */
export function getSchedule(args: GetScheduleArgs, opts?: pulumi.InvokeOptions): Promise<GetScheduleResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("scm:index/getSchedule:getSchedule", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getSchedule.
 */
export interface GetScheduleArgs {
    /**
     * The Id param.
     */
    id: string;
}

/**
 * A collection of values returned by getSchedule.
 */
export interface GetScheduleResult {
    /**
     * The Id param.
     */
    readonly id: string;
    /**
     * Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
     */
    readonly name: string;
    /**
     * The ScheduleType param.
     */
    readonly scheduleType: outputs.GetScheduleScheduleType;
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
 * const example = scm.getSchedule({
 *     id: "1234-56-789",
 * });
 * ```
 */
export function getScheduleOutput(args: GetScheduleOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetScheduleResult> {
    return pulumi.output(args).apply((a: any) => getSchedule(a, opts))
}

/**
 * A collection of arguments for invoking getSchedule.
 */
export interface GetScheduleOutputArgs {
    /**
     * The Id param.
     */
    id: pulumi.Input<string>;
}