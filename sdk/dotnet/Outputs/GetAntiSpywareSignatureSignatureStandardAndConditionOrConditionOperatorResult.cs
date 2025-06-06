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
    public sealed class GetAntiSpywareSignatureSignatureStandardAndConditionOrConditionOperatorResult
    {
        /// <summary>
        /// The EqualTo param.
        /// </summary>
        public readonly Outputs.GetAntiSpywareSignatureSignatureStandardAndConditionOrConditionOperatorEqualToResult EqualTo;
        /// <summary>
        /// The GreaterThan param.
        /// </summary>
        public readonly Outputs.GetAntiSpywareSignatureSignatureStandardAndConditionOrConditionOperatorGreaterThanResult GreaterThan;
        /// <summary>
        /// The LessThan param.
        /// </summary>
        public readonly Outputs.GetAntiSpywareSignatureSignatureStandardAndConditionOrConditionOperatorLessThanResult LessThan;
        /// <summary>
        /// The PatternMatch param.
        /// </summary>
        public readonly Outputs.GetAntiSpywareSignatureSignatureStandardAndConditionOrConditionOperatorPatternMatchResult PatternMatch;

        [OutputConstructor]
        private GetAntiSpywareSignatureSignatureStandardAndConditionOrConditionOperatorResult(
            Outputs.GetAntiSpywareSignatureSignatureStandardAndConditionOrConditionOperatorEqualToResult equalTo,

            Outputs.GetAntiSpywareSignatureSignatureStandardAndConditionOrConditionOperatorGreaterThanResult greaterThan,

            Outputs.GetAntiSpywareSignatureSignatureStandardAndConditionOrConditionOperatorLessThanResult lessThan,

            Outputs.GetAntiSpywareSignatureSignatureStandardAndConditionOrConditionOperatorPatternMatchResult patternMatch)
        {
            EqualTo = equalTo;
            GreaterThan = greaterThan;
            LessThan = lessThan;
            PatternMatch = patternMatch;
        }
    }
}
