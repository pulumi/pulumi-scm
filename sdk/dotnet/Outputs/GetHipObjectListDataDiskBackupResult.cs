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
    public sealed class GetHipObjectListDataDiskBackupResult
    {
        /// <summary>
        /// The Criteria param.
        /// </summary>
        public readonly Outputs.GetHipObjectListDataDiskBackupCriteriaResult Criteria;
        /// <summary>
        /// The ExcludeVendor param. Default: `false`.
        /// </summary>
        public readonly bool ExcludeVendor;
        /// <summary>
        /// Vendor name.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetHipObjectListDataDiskBackupVendorResult> Vendors;

        [OutputConstructor]
        private GetHipObjectListDataDiskBackupResult(
            Outputs.GetHipObjectListDataDiskBackupCriteriaResult criteria,

            bool excludeVendor,

            ImmutableArray<Outputs.GetHipObjectListDataDiskBackupVendorResult> vendors)
        {
            Criteria = criteria;
            ExcludeVendor = excludeVendor;
            Vendors = vendors;
        }
    }
}