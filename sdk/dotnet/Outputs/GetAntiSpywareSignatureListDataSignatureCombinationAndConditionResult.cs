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
    public sealed class GetAntiSpywareSignatureListDataSignatureCombinationAndConditionResult
    {
        /// <summary>
        /// The Name param.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The OrConditions param.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAntiSpywareSignatureListDataSignatureCombinationAndConditionOrConditionResult> OrConditions;

        [OutputConstructor]
        private GetAntiSpywareSignatureListDataSignatureCombinationAndConditionResult(
            string name,

            ImmutableArray<Outputs.GetAntiSpywareSignatureListDataSignatureCombinationAndConditionOrConditionResult> orConditions)
        {
            Name = name;
            OrConditions = orConditions;
        }
    }
}