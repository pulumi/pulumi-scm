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
    public sealed class GetQosProfileListDataResult
    {
        /// <summary>
        /// The AggregateBandwidth param.
        /// </summary>
        public readonly Outputs.GetQosProfileListDataAggregateBandwidthResult AggregateBandwidth;
        /// <summary>
        /// The ClassBandwidthType param.
        /// </summary>
        public readonly Outputs.GetQosProfileListDataClassBandwidthTypeResult ClassBandwidthType;
        /// <summary>
        /// UUID of the resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Alphanumeric string begin with letter: [0-9a-zA-Z._-]. String length must not exceed 31 characters.
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private GetQosProfileListDataResult(
            Outputs.GetQosProfileListDataAggregateBandwidthResult aggregateBandwidth,

            Outputs.GetQosProfileListDataClassBandwidthTypeResult classBandwidthType,

            string id,

            string name)
        {
            AggregateBandwidth = aggregateBandwidth;
            ClassBandwidthType = classBandwidthType;
            Id = id;
            Name = name;
        }
    }
}
