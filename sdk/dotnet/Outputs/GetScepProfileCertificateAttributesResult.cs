// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Outputs
{

    [OutputType]
    public sealed class GetScepProfileCertificateAttributesResult
    {
        /// <summary>
        /// The Dnsname param.
        /// </summary>
        public readonly string Dnsname;
        /// <summary>
        /// The Rfc822name param.
        /// </summary>
        public readonly string Rfc822name;
        /// <summary>
        /// The UniformResourceIdentifier param.
        /// </summary>
        public readonly string UniformResourceIdentifier;

        [OutputConstructor]
        private GetScepProfileCertificateAttributesResult(
            string dnsname,

            string rfc822name,

            string uniformResourceIdentifier)
        {
            Dnsname = dnsname;
            Rfc822name = rfc822name;
            UniformResourceIdentifier = uniformResourceIdentifier;
        }
    }
}