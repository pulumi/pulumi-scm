// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class ApplicationSignatureAndConditionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("orConditions")]
        private InputList<Inputs.ApplicationSignatureAndConditionOrConditionArgs>? _orConditions;

        /// <summary>
        /// The OrConditions param.
        /// </summary>
        public InputList<Inputs.ApplicationSignatureAndConditionOrConditionArgs> OrConditions
        {
            get => _orConditions ?? (_orConditions = new InputList<Inputs.ApplicationSignatureAndConditionOrConditionArgs>());
            set => _orConditions = value;
        }

        public ApplicationSignatureAndConditionArgs()
        {
        }
        public static new ApplicationSignatureAndConditionArgs Empty => new ApplicationSignatureAndConditionArgs();
    }
}
