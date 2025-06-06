// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class ScheduleScheduleTypeRecurringGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("dailyLists")]
        private InputList<string>? _dailyLists;

        /// <summary>
        /// The DailyList param. Individual elements in this list are subject to additional validation. String length must be between 11 and 11 characters. String validation regex: `([01][0-9]|[2][0-3]):([0-5][0-9])-([01][0-9]|[2][0-3]):([0-5][0-9])`. Ensure that only one of the following is specified: `daily`, `weekly`
        /// </summary>
        public InputList<string> DailyLists
        {
            get => _dailyLists ?? (_dailyLists = new InputList<string>());
            set => _dailyLists = value;
        }

        /// <summary>
        /// The Weekly param. Ensure that only one of the following is specified: `daily`, `weekly`
        /// </summary>
        [Input("weekly")]
        public Input<Inputs.ScheduleScheduleTypeRecurringWeeklyGetArgs>? Weekly { get; set; }

        public ScheduleScheduleTypeRecurringGetArgs()
        {
        }
        public static new ScheduleScheduleTypeRecurringGetArgs Empty => new ScheduleScheduleTypeRecurringGetArgs();
    }
}
