// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class AntiSpywareProfileThreatExceptionActionBlockIpArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Duration param. Value must be between 1 and 3600.
        /// </summary>
        [Input("duration")]
        public Input<int>? Duration { get; set; }

        /// <summary>
        /// The TrackBy param. String must be one of these: `"source-and-destination"`, `"source"`.
        /// </summary>
        [Input("trackBy")]
        public Input<string>? TrackBy { get; set; }

        public AntiSpywareProfileThreatExceptionActionBlockIpArgs()
        {
        }
        public static new AntiSpywareProfileThreatExceptionActionBlockIpArgs Empty => new AntiSpywareProfileThreatExceptionActionBlockIpArgs();
    }
}
