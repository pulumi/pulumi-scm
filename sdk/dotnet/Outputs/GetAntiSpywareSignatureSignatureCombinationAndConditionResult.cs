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
    public sealed class GetAntiSpywareSignatureSignatureCombinationAndConditionResult
    {
        /// <summary>
        /// The Name param.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The OrConditions param.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAntiSpywareSignatureSignatureCombinationAndConditionOrConditionResult> OrConditions;

        [OutputConstructor]
        private GetAntiSpywareSignatureSignatureCombinationAndConditionResult(
            string name,

            ImmutableArray<Outputs.GetAntiSpywareSignatureSignatureCombinationAndConditionOrConditionResult> orConditions)
        {
            Name = name;
            OrConditions = orConditions;
        }
    }
}
