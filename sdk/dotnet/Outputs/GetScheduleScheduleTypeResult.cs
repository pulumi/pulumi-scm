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
    public sealed class GetScheduleScheduleTypeResult
    {
        /// <summary>
        /// The NonRecurringList param. Individual elements in this list are subject to additional validation. String length must be between 33 and 33 characters. String validation regex: `[0-9][0-9][0-9][0-9]\/([0][1-9]|[1][0-2])\/([0-2][0-9]|[3][0-1])@([01][0-9]|[2][0-3]):([0-5][0-9])-[0-9][0-9][0-9][0-9]\/([0][1-9]|[1][0-2])\/([0-2][0-9]|[3][0-1])@([01][0-9]|[2][0-3]):([0-5][0-9])`.
        /// </summary>
        public readonly ImmutableArray<string> NonRecurringLists;
        /// <summary>
        /// The Recurring param.
        /// </summary>
        public readonly Outputs.GetScheduleScheduleTypeRecurringResult Recurring;

        [OutputConstructor]
        private GetScheduleScheduleTypeResult(
            ImmutableArray<string> nonRecurringLists,

            Outputs.GetScheduleScheduleTypeRecurringResult recurring)
        {
            NonRecurringLists = nonRecurringLists;
            Recurring = recurring;
        }
    }
}
