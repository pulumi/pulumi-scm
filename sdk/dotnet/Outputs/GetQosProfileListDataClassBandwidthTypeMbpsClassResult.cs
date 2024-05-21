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
    public sealed class GetQosProfileListDataClassBandwidthTypeMbpsClassResult
    {
        /// <summary>
        /// The ClassBandwidth param.
        /// </summary>
        public readonly Outputs.GetQosProfileListDataClassBandwidthTypeMbpsClassClassBandwidthResult ClassBandwidth;
        /// <summary>
        /// Traffic class. String length must not exceed 31 characters.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// traffic class priority. String must be one of these: `"real-time"`, `"high"`, `"medium"`, `"low"`. Default: `"medium"`.
        /// </summary>
        public readonly string Priority;

        [OutputConstructor]
        private GetQosProfileListDataClassBandwidthTypeMbpsClassResult(
            Outputs.GetQosProfileListDataClassBandwidthTypeMbpsClassClassBandwidthResult classBandwidth,

            string name,

            string priority)
        {
            ClassBandwidth = classBandwidth;
            Name = name;
            Priority = priority;
        }
    }
}
