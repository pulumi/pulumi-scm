// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class CertificateProfileUsernameFieldGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Subject param. String must be one of these: `"common-name"`.
        /// </summary>
        [Input("subject")]
        public Input<string>? Subject { get; set; }

        /// <summary>
        /// The SubjectAlt param. String must be one of these: `"email"`.
        /// </summary>
        [Input("subjectAlt")]
        public Input<string>? SubjectAlt { get; set; }

        public CertificateProfileUsernameFieldGetArgs()
        {
        }
        public static new CertificateProfileUsernameFieldGetArgs Empty => new CertificateProfileUsernameFieldGetArgs();
    }
}