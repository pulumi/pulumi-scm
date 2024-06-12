// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class AntiSpywareSignatureSignatureStandardAndConditionGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Name param.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("orConditions")]
        private InputList<Inputs.AntiSpywareSignatureSignatureStandardAndConditionOrConditionGetArgs>? _orConditions;

        /// <summary>
        /// The OrConditions param.
        /// </summary>
        public InputList<Inputs.AntiSpywareSignatureSignatureStandardAndConditionOrConditionGetArgs> OrConditions
        {
            get => _orConditions ?? (_orConditions = new InputList<Inputs.AntiSpywareSignatureSignatureStandardAndConditionOrConditionGetArgs>());
            set => _orConditions = value;
        }

        public AntiSpywareSignatureSignatureStandardAndConditionGetArgs()
        {
        }
        public static new AntiSpywareSignatureSignatureStandardAndConditionGetArgs Empty => new AntiSpywareSignatureSignatureStandardAndConditionGetArgs();
    }
}