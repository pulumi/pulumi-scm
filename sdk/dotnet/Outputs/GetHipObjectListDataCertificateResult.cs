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
    public sealed class GetHipObjectListDataCertificateResult
    {
        /// <summary>
        /// The Criteria param.
        /// </summary>
        public readonly Outputs.GetHipObjectListDataCertificateCriteriaResult Criteria;

        [OutputConstructor]
        private GetHipObjectListDataCertificateResult(Outputs.GetHipObjectListDataCertificateCriteriaResult criteria)
        {
            Criteria = criteria;
        }
    }
}
