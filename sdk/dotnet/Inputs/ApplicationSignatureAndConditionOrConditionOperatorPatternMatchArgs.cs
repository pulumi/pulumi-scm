// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class ApplicationSignatureAndConditionOrConditionOperatorPatternMatchArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Context param. String length must not exceed 127 characters.
        /// </summary>
        [Input("context", required: true)]
        public Input<string> Context { get; set; } = null!;

        /// <summary>
        /// The Pattern param. String length must not exceed 127 characters.
        /// </summary>
        [Input("pattern", required: true)]
        public Input<string> Pattern { get; set; } = null!;

        [Input("qualifiers")]
        private InputList<Inputs.ApplicationSignatureAndConditionOrConditionOperatorPatternMatchQualifierArgs>? _qualifiers;

        /// <summary>
        /// The Qualifiers param.
        /// </summary>
        public InputList<Inputs.ApplicationSignatureAndConditionOrConditionOperatorPatternMatchQualifierArgs> Qualifiers
        {
            get => _qualifiers ?? (_qualifiers = new InputList<Inputs.ApplicationSignatureAndConditionOrConditionOperatorPatternMatchQualifierArgs>());
            set => _qualifiers = value;
        }

        public ApplicationSignatureAndConditionOrConditionOperatorPatternMatchArgs()
        {
        }
        public static new ApplicationSignatureAndConditionOrConditionOperatorPatternMatchArgs Empty => new ApplicationSignatureAndConditionOrConditionOperatorPatternMatchArgs();
    }
}
