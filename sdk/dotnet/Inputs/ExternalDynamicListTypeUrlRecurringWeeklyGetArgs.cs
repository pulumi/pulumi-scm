// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class ExternalDynamicListTypeUrlRecurringWeeklyGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Time specification hh (e.g. 20). String length must be between 2 and 2 characters. String validation regex: `([01][0-9]|[2][0-3])`. Default: `"00"`.
        /// </summary>
        [Input("at")]
        public Input<string>? At { get; set; }

        /// <summary>
        /// The DayOfWeek param. String must be one of these: `"sunday"`, `"monday"`, `"tuesday"`, `"wednesday"`, `"thursday"`, `"friday"`, `"saturday"`.
        /// </summary>
        [Input("dayOfWeek", required: true)]
        public Input<string> DayOfWeek { get; set; } = null!;

        public ExternalDynamicListTypeUrlRecurringWeeklyGetArgs()
        {
        }
        public static new ExternalDynamicListTypeUrlRecurringWeeklyGetArgs Empty => new ExternalDynamicListTypeUrlRecurringWeeklyGetArgs();
    }
}
