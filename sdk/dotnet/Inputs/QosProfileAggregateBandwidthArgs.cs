// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class QosProfileAggregateBandwidthArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// guaranteed sending bandwidth in mbps. Value must be between 0 and 16000.
        /// </summary>
        [Input("egressGuaranteed")]
        public Input<int>? EgressGuaranteed { get; set; }

        /// <summary>
        /// max sending bandwidth in mbps. Value must be between 0 and 60000.
        /// </summary>
        [Input("egressMax")]
        public Input<int>? EgressMax { get; set; }

        public QosProfileAggregateBandwidthArgs()
        {
        }
        public static new QosProfileAggregateBandwidthArgs Empty => new QosProfileAggregateBandwidthArgs();
    }
}
