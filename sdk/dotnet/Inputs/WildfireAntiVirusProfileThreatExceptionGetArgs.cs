// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class WildfireAntiVirusProfileThreatExceptionGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Name param.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The Notes param.
        /// </summary>
        [Input("notes")]
        public Input<string>? Notes { get; set; }

        public WildfireAntiVirusProfileThreatExceptionGetArgs()
        {
        }
        public static new WildfireAntiVirusProfileThreatExceptionGetArgs Empty => new WildfireAntiVirusProfileThreatExceptionGetArgs();
    }
}
