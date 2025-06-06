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
    public sealed class GetHipObjectListDataMobileDeviceCriteriaApplicationsResult
    {
        /// <summary>
        /// The HasMalware param.
        /// </summary>
        public readonly Outputs.GetHipObjectListDataMobileDeviceCriteriaApplicationsHasMalwareResult HasMalware;
        /// <summary>
        /// Has apps that are not managed.
        /// </summary>
        public readonly bool HasUnmanagedApp;
        /// <summary>
        /// The Includes param.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetHipObjectListDataMobileDeviceCriteriaApplicationsIncludeResult> Includes;

        [OutputConstructor]
        private GetHipObjectListDataMobileDeviceCriteriaApplicationsResult(
            Outputs.GetHipObjectListDataMobileDeviceCriteriaApplicationsHasMalwareResult hasMalware,

            bool hasUnmanagedApp,

            ImmutableArray<Outputs.GetHipObjectListDataMobileDeviceCriteriaApplicationsIncludeResult> includes)
        {
            HasMalware = hasMalware;
            HasUnmanagedApp = hasUnmanagedApp;
            Includes = includes;
        }
    }
}
