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
    public sealed class GetHipObjectCertificateResult
    {
        /// <summary>
        /// The Criteria param.
        /// </summary>
        public readonly Outputs.GetHipObjectCertificateCriteriaResult Criteria;

        [OutputConstructor]
        private GetHipObjectCertificateResult(Outputs.GetHipObjectCertificateCriteriaResult criteria)
        {
            Criteria = criteria;
        }
    }
}
