// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Outputs
{

    [OutputType]
    public sealed class GetExternalDynamicListListDataTypeDomainRecurringWeeklyResult
    {
        /// <summary>
        /// Time specification hh (e.g. 20). String length must be between 2 and 2 characters. String validation regex: `([01][0-9]|[2][0-3])`. Default: `"00"`.
        /// </summary>
        public readonly string At;
        /// <summary>
        /// The DayOfWeek param. String must be one of these: `"sunday"`, `"monday"`, `"tuesday"`, `"wednesday"`, `"thursday"`, `"friday"`, `"saturday"`.
        /// </summary>
        public readonly string DayOfWeek;

        [OutputConstructor]
        private GetExternalDynamicListListDataTypeDomainRecurringWeeklyResult(
            string at,

            string dayOfWeek)
        {
            At = at;
            DayOfWeek = dayOfWeek;
        }
    }
}
