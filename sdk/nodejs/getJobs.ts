// *** WARNING: this file was generated by pulumi-language-nodejs. ***
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
 * const example = scm.getJobs({});
 * ```
 */
export function getJobs(args: GetJobsArgs, opts?: pulumi.InvokeOptions): Promise<GetJobsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("scm:index/getJobs:getJobs", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getJobs.
 */
export interface GetJobsArgs {
    /**
     * The Id param.
     */
    id: number;
}

/**
 * A collection of values returned by getJobs.
 */
export interface GetJobsResult {
    /**
     * A description provided by the administrator or service account.
     */
    readonly description: string;
    /**
     * The name of the device.
     */
    readonly deviceName: string;
    /**
     * The timestamp indicating when the job was finished.
     */
    readonly endTs: string;
    /**
     * The Id param.
     */
    readonly id: number;
    /**
     * The job result.
     */
    readonly jobResult: number;
    /**
     * The current status of the job.
     */
    readonly jobStatus: number;
    /**
     * The job type.
     */
    readonly jobType: number;
    /**
     * The parent job ID.
     */
    readonly parentId: number;
    /**
     * Job completion percentage. Value must be less than or equal to 100.
     */
    readonly percent: number;
    /**
     * The result of the job. String must be one of these: `"OK"`, `"FAIL"`, `"PEND"`, `"WAIT"`, `"CANCELLED"`.
     */
    readonly resultStr: string;
    /**
     * The timestamp indicating when the job was created.
     */
    readonly startTs: string;
    /**
     * The current status of the job. String must be one of these: `"ACT"`, `"FIN"`, `"PEND"`, `"PUSHSENT"`, `"PUSHFAIL"`.
     */
    readonly statusStr: string;
    /**
     * The completion summary of the job.
     */
    readonly summary: string;
    readonly tfid: string;
    /**
     * The job type. String must be one of these: `"CommitAll"`, `"CommitAndPush"`, `"NGFW-Bootstrap-Push"`, `"Validate"`.
     */
    readonly typeStr: string;
    /**
     * The administrator or service account that created the job.
     */
    readonly uname: string;
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
 * const example = scm.getJobs({});
 * ```
 */
export function getJobsOutput(args: GetJobsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetJobsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("scm:index/getJobs:getJobs", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getJobs.
 */
export interface GetJobsOutputArgs {
    /**
     * The Id param.
     */
    id: pulumi.Input<number>;
}
