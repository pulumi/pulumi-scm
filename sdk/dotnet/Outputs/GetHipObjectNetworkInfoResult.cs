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
    public sealed class GetHipObjectNetworkInfoResult
    {
        /// <summary>
        /// The Criteria param.
        /// </summary>
        public readonly Outputs.GetHipObjectNetworkInfoCriteriaResult Criteria;

        [OutputConstructor]
        private GetHipObjectNetworkInfoResult(Outputs.GetHipObjectNetworkInfoCriteriaResult criteria)
        {
            Criteria = criteria;
        }
    }
}
