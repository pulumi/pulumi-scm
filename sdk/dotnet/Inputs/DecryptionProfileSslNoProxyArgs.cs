// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class DecryptionProfileSslNoProxyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The BlockExpiredCertificate param. Default: `false`.
        /// </summary>
        [Input("blockExpiredCertificate")]
        public Input<bool>? BlockExpiredCertificate { get; set; }

        /// <summary>
        /// The BlockUntrustedIssuer param. Default: `false`.
        /// </summary>
        [Input("blockUntrustedIssuer")]
        public Input<bool>? BlockUntrustedIssuer { get; set; }

        public DecryptionProfileSslNoProxyArgs()
        {
        }
        public static new DecryptionProfileSslNoProxyArgs Empty => new DecryptionProfileSslNoProxyArgs();
    }
}