// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class ApplicationSignatureAndConditionOrConditionOperatorArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The EqualTo param. Ensure that only one of the following is specified: `equal_to`, `greater_than`, `less_than`, `pattern_match`
        /// </summary>
        [Input("equalTo")]
        public Input<Inputs.ApplicationSignatureAndConditionOrConditionOperatorEqualToArgs>? EqualTo { get; set; }

        /// <summary>
        /// The GreaterThan param. Ensure that only one of the following is specified: `equal_to`, `greater_than`, `less_than`, `pattern_match`
        /// </summary>
        [Input("greaterThan")]
        public Input<Inputs.ApplicationSignatureAndConditionOrConditionOperatorGreaterThanArgs>? GreaterThan { get; set; }

        /// <summary>
        /// The LessThan param. Ensure that only one of the following is specified: `equal_to`, `greater_than`, `less_than`, `pattern_match`
        /// </summary>
        [Input("lessThan")]
        public Input<Inputs.ApplicationSignatureAndConditionOrConditionOperatorLessThanArgs>? LessThan { get; set; }

        /// <summary>
        /// The PatternMatch param. Ensure that only one of the following is specified: `equal_to`, `greater_than`, `less_than`, `pattern_match`
        /// </summary>
        [Input("patternMatch")]
        public Input<Inputs.ApplicationSignatureAndConditionOrConditionOperatorPatternMatchArgs>? PatternMatch { get; set; }

        public ApplicationSignatureAndConditionOrConditionOperatorArgs()
        {
        }
        public static new ApplicationSignatureAndConditionOrConditionOperatorArgs Empty => new ApplicationSignatureAndConditionOrConditionOperatorArgs();
    }
}
