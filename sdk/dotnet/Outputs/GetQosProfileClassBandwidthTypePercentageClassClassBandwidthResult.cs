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
    public sealed class GetQosProfileClassBandwidthTypePercentageClassClassBandwidthResult
    {
        /// <summary>
        /// guaranteed sending bandwidth in percentage. Value must be between 0 and 100.
        /// </summary>
        public readonly int EgressGuaranteed;
        /// <summary>
        /// max sending bandwidth in percentage. Value must be between 0 and 100.
        /// </summary>
        public readonly int EgressMax;

        [OutputConstructor]
        private GetQosProfileClassBandwidthTypePercentageClassClassBandwidthResult(
            int egressGuaranteed,

            int egressMax)
        {
            EgressGuaranteed = egressGuaranteed;
            EgressMax = egressMax;
        }
    }
}
