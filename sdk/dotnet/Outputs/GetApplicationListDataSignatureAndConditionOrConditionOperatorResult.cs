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
    public sealed class GetApplicationListDataSignatureAndConditionOrConditionOperatorResult
    {
        /// <summary>
        /// The EqualTo param.
        /// </summary>
        public readonly Outputs.GetApplicationListDataSignatureAndConditionOrConditionOperatorEqualToResult EqualTo;
        /// <summary>
        /// The GreaterThan param.
        /// </summary>
        public readonly Outputs.GetApplicationListDataSignatureAndConditionOrConditionOperatorGreaterThanResult GreaterThan;
        /// <summary>
        /// The LessThan param.
        /// </summary>
        public readonly Outputs.GetApplicationListDataSignatureAndConditionOrConditionOperatorLessThanResult LessThan;
        /// <summary>
        /// The PatternMatch param.
        /// </summary>
        public readonly Outputs.GetApplicationListDataSignatureAndConditionOrConditionOperatorPatternMatchResult PatternMatch;

        [OutputConstructor]
        private GetApplicationListDataSignatureAndConditionOrConditionOperatorResult(
            Outputs.GetApplicationListDataSignatureAndConditionOrConditionOperatorEqualToResult equalTo,

            Outputs.GetApplicationListDataSignatureAndConditionOrConditionOperatorGreaterThanResult greaterThan,

            Outputs.GetApplicationListDataSignatureAndConditionOrConditionOperatorLessThanResult lessThan,

            Outputs.GetApplicationListDataSignatureAndConditionOrConditionOperatorPatternMatchResult patternMatch)
        {
            EqualTo = equalTo;
            GreaterThan = greaterThan;
            LessThan = lessThan;
            PatternMatch = patternMatch;
        }
    }
}