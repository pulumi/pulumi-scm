// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Outputs
{

    [OutputType]
    public sealed class GetIkeGatewayAuthenticationCertificateResult
    {
        /// <summary>
        /// The AllowIdPayloadMismatch param.
        /// </summary>
        public readonly bool AllowIdPayloadMismatch;
        /// <summary>
        /// The CertificateProfile param.
        /// </summary>
        public readonly string CertificateProfile;
        /// <summary>
        /// The LocalCertificate param.
        /// </summary>
        public readonly Outputs.GetIkeGatewayAuthenticationCertificateLocalCertificateResult LocalCertificate;
        /// <summary>
        /// The StrictValidationRevocation param.
        /// </summary>
        public readonly bool StrictValidationRevocation;
        /// <summary>
        /// The UseManagementAsSource param.
        /// </summary>
        public readonly bool UseManagementAsSource;

        [OutputConstructor]
        private GetIkeGatewayAuthenticationCertificateResult(
            bool allowIdPayloadMismatch,

            string certificateProfile,

            Outputs.GetIkeGatewayAuthenticationCertificateLocalCertificateResult localCertificate,

            bool strictValidationRevocation,

            bool useManagementAsSource)
        {
            AllowIdPayloadMismatch = allowIdPayloadMismatch;
            CertificateProfile = certificateProfile;
            LocalCertificate = localCertificate;
            StrictValidationRevocation = strictValidationRevocation;
            UseManagementAsSource = useManagementAsSource;
        }
    }
}
