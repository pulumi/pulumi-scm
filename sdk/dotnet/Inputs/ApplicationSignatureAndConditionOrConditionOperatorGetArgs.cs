// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class ApplicationSignatureAndConditionOrConditionOperatorGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The EqualTo param. Ensure that only one of the following is specified: `equal_to`, `greater_than`, `less_than`, `pattern_match`
        /// </summary>
        [Input("equalTo")]
        public Input<Inputs.ApplicationSignatureAndConditionOrConditionOperatorEqualToGetArgs>? EqualTo { get; set; }

        /// <summary>
        /// The GreaterThan param. Ensure that only one of the following is specified: `equal_to`, `greater_than`, `less_than`, `pattern_match`
        /// </summary>
        [Input("greaterThan")]
        public Input<Inputs.ApplicationSignatureAndConditionOrConditionOperatorGreaterThanGetArgs>? GreaterThan { get; set; }

        /// <summary>
        /// The LessThan param. Ensure that only one of the following is specified: `equal_to`, `greater_than`, `less_than`, `pattern_match`
        /// </summary>
        [Input("lessThan")]
        public Input<Inputs.ApplicationSignatureAndConditionOrConditionOperatorLessThanGetArgs>? LessThan { get; set; }

        /// <summary>
        /// The PatternMatch param. Ensure that only one of the following is specified: `equal_to`, `greater_than`, `less_than`, `pattern_match`
        /// </summary>
        [Input("patternMatch")]
        public Input<Inputs.ApplicationSignatureAndConditionOrConditionOperatorPatternMatchGetArgs>? PatternMatch { get; set; }

        public ApplicationSignatureAndConditionOrConditionOperatorGetArgs()
        {
        }
        public static new ApplicationSignatureAndConditionOrConditionOperatorGetArgs Empty => new ApplicationSignatureAndConditionOrConditionOperatorGetArgs();
    }
}
