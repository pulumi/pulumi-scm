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
    public sealed class GetHipObjectCertificateCriteriaResult
    {
        /// <summary>
        /// The CertificateAttributes param.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetHipObjectCertificateCriteriaCertificateAttributeResult> CertificateAttributes;
        /// <summary>
        /// Profile for authenticating client certificates.
        /// </summary>
        public readonly string CertificateProfile;

        [OutputConstructor]
        private GetHipObjectCertificateCriteriaResult(
            ImmutableArray<Outputs.GetHipObjectCertificateCriteriaCertificateAttributeResult> certificateAttributes,

            string certificateProfile)
        {
            CertificateAttributes = certificateAttributes;
            CertificateProfile = certificateProfile;
        }
    }
}
