// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class HipObjectMobileDeviceCriteriaLastCheckinTimeWithinArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// specify time in days. Value must be between 1 and 365. Default: `30`.
        /// </summary>
        [Input("days")]
        public Input<int>? Days { get; set; }

        public HipObjectMobileDeviceCriteriaLastCheckinTimeWithinArgs()
        {
        }
        public static new HipObjectMobileDeviceCriteriaLastCheckinTimeWithinArgs Empty => new HipObjectMobileDeviceCriteriaLastCheckinTimeWithinArgs();
    }
}
