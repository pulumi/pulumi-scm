// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class AuthenticationProfileMethodSamlIdpGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The AttributeNameUsergroup param. String length must be between 1 and 63 characters.
        /// </summary>
        [Input("attributeNameUsergroup")]
        public Input<string>? AttributeNameUsergroup { get; set; }

        /// <summary>
        /// The AttributeNameUsername param. String length must be between 1 and 63 characters.
        /// </summary>
        [Input("attributeNameUsername")]
        public Input<string>? AttributeNameUsername { get; set; }

        /// <summary>
        /// The CertificateProfile param. String length must not exceed 31 characters.
        /// </summary>
        [Input("certificateProfile")]
        public Input<string>? CertificateProfile { get; set; }

        /// <summary>
        /// The EnableSingleLogout param.
        /// </summary>
        [Input("enableSingleLogout")]
        public Input<bool>? EnableSingleLogout { get; set; }

        /// <summary>
        /// The RequestSigningCertificate param. String length must not exceed 64 characters.
        /// </summary>
        [Input("requestSigningCertificate")]
        public Input<string>? RequestSigningCertificate { get; set; }

        /// <summary>
        /// The ServerProfile param. String length must not exceed 63 characters.
        /// </summary>
        [Input("serverProfile")]
        public Input<string>? ServerProfile { get; set; }

        public AuthenticationProfileMethodSamlIdpGetArgs()
        {
        }
        public static new AuthenticationProfileMethodSamlIdpGetArgs Empty => new AuthenticationProfileMethodSamlIdpGetArgs();
    }
}
