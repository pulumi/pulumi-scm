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
    public sealed class GetQosProfileClassBandwidthTypeResult
    {
        /// <summary>
        /// The Mbps param.
        /// </summary>
        public readonly Outputs.GetQosProfileClassBandwidthTypeMbpsResult Mbps;
        /// <summary>
        /// The Percentage param.
        /// </summary>
        public readonly Outputs.GetQosProfileClassBandwidthTypePercentageResult Percentage;

        [OutputConstructor]
        private GetQosProfileClassBandwidthTypeResult(
            Outputs.GetQosProfileClassBandwidthTypeMbpsResult mbps,

            Outputs.GetQosProfileClassBandwidthTypePercentageResult percentage)
        {
            Mbps = mbps;
            Percentage = percentage;
        }
    }
}