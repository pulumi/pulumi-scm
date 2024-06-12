// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class ApplicationSignatureAndConditionOrConditionOperatorGreaterThanGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Context param. String length must not exceed 127 characters.
        /// </summary>
        [Input("context", required: true)]
        public Input<string> Context { get; set; } = null!;

        [Input("qualifiers")]
        private InputList<Inputs.ApplicationSignatureAndConditionOrConditionOperatorGreaterThanQualifierGetArgs>? _qualifiers;

        /// <summary>
        /// The Qualifiers param.
        /// </summary>
        public InputList<Inputs.ApplicationSignatureAndConditionOrConditionOperatorGreaterThanQualifierGetArgs> Qualifiers
        {
            get => _qualifiers ?? (_qualifiers = new InputList<Inputs.ApplicationSignatureAndConditionOrConditionOperatorGreaterThanQualifierGetArgs>());
            set => _qualifiers = value;
        }

        /// <summary>
        /// The Value param. Value must be between 0 and 4294967295.
        /// </summary>
        [Input("value", required: true)]
        public Input<int> Value { get; set; } = null!;

        public ApplicationSignatureAndConditionOrConditionOperatorGreaterThanGetArgs()
        {
        }
        public static new ApplicationSignatureAndConditionOrConditionOperatorGreaterThanGetArgs Empty => new ApplicationSignatureAndConditionOrConditionOperatorGreaterThanGetArgs();
    }
}