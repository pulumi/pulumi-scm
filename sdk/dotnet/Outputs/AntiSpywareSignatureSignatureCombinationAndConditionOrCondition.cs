// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Outputs
{

    [OutputType]
    public sealed class AntiSpywareSignatureSignatureCombinationAndConditionOrCondition
    {
        /// <summary>
        /// The Name param.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// The ThreatId param.
        /// </summary>
        public readonly string? ThreatId;

        [OutputConstructor]
        private AntiSpywareSignatureSignatureCombinationAndConditionOrCondition(
            string? name,

            string? threatId)
        {
            Name = name;
            ThreatId = threatId;
        }
    }
}
