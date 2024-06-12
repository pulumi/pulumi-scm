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
    public sealed class GetAntiSpywareSignatureSignatureStandardAndConditionResult
    {
        /// <summary>
        /// The Name param.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The OrConditions param.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAntiSpywareSignatureSignatureStandardAndConditionOrConditionResult> OrConditions;

        [OutputConstructor]
        private GetAntiSpywareSignatureSignatureStandardAndConditionResult(
            string name,

            ImmutableArray<Outputs.GetAntiSpywareSignatureSignatureStandardAndConditionOrConditionResult> orConditions)
        {
            Name = name;
            OrConditions = orConditions;
        }
    }
}