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
    public sealed class GetNatRuleListDataTargetResult
    {
        /// <summary>
        /// The Devices param.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetNatRuleListDataTargetDeviceResult> Devices;
        /// <summary>
        /// The Negate param.
        /// </summary>
        public readonly bool Negate;
        /// <summary>
        /// The Tags param.
        /// </summary>
        public readonly ImmutableArray<string> Tags;

        [OutputConstructor]
        private GetNatRuleListDataTargetResult(
            ImmutableArray<Outputs.GetNatRuleListDataTargetDeviceResult> devices,

            bool negate,

            ImmutableArray<string> tags)
        {
            Devices = devices;
            Negate = negate;
            Tags = tags;
        }
    }
}