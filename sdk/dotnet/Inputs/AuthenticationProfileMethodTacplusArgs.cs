// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class AuthenticationProfileMethodTacplusArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Checkgroup param.
        /// </summary>
        [Input("checkgroup")]
        public Input<bool>? Checkgroup { get; set; }

        /// <summary>
        /// The ServerProfile param.
        /// </summary>
        [Input("serverProfile")]
        public Input<string>? ServerProfile { get; set; }

        public AuthenticationProfileMethodTacplusArgs()
        {
        }
        public static new AuthenticationProfileMethodTacplusArgs Empty => new AuthenticationProfileMethodTacplusArgs();
    }
}