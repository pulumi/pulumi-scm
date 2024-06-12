// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class AuthenticationProfileMultiFactorAuthGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("factors")]
        private InputList<string>? _factors;

        /// <summary>
        /// The Factors param.
        /// </summary>
        public InputList<string> Factors
        {
            get => _factors ?? (_factors = new InputList<string>());
            set => _factors = value;
        }

        /// <summary>
        /// The MfaEnable param.
        /// </summary>
        [Input("mfaEnable")]
        public Input<bool>? MfaEnable { get; set; }

        public AuthenticationProfileMultiFactorAuthGetArgs()
        {
        }
        public static new AuthenticationProfileMultiFactorAuthGetArgs Empty => new AuthenticationProfileMultiFactorAuthGetArgs();
    }
}