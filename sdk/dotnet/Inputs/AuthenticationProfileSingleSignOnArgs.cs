// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class AuthenticationProfileSingleSignOnArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The KerberosKeytab param. String length must not exceed 8192 characters.
        /// </summary>
        [Input("kerberosKeytab")]
        public Input<string>? KerberosKeytab { get; set; }

        /// <summary>
        /// The Realm param. String length must not exceed 127 characters.
        /// </summary>
        [Input("realm")]
        public Input<string>? Realm { get; set; }

        public AuthenticationProfileSingleSignOnArgs()
        {
        }
        public static new AuthenticationProfileSingleSignOnArgs Empty => new AuthenticationProfileSingleSignOnArgs();
    }
}