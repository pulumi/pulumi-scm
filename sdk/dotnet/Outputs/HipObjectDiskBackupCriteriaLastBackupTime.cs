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
    public sealed class HipObjectDiskBackupCriteriaLastBackupTime
    {
        /// <summary>
        /// The NotAvailable param. Ensure that only one of the following is specified: `not_available`, `not_within`, `within`
        /// </summary>
        public readonly bool? NotAvailable;
        /// <summary>
        /// The NotWithin param. Ensure that only one of the following is specified: `not_available`, `not_within`, `within`
        /// </summary>
        public readonly Outputs.HipObjectDiskBackupCriteriaLastBackupTimeNotWithin? NotWithin;
        /// <summary>
        /// The Within param. Ensure that only one of the following is specified: `not_available`, `not_within`, `within`
        /// </summary>
        public readonly Outputs.HipObjectDiskBackupCriteriaLastBackupTimeWithin? Within;

        [OutputConstructor]
        private HipObjectDiskBackupCriteriaLastBackupTime(
            bool? notAvailable,

            Outputs.HipObjectDiskBackupCriteriaLastBackupTimeNotWithin? notWithin,

            Outputs.HipObjectDiskBackupCriteriaLastBackupTimeWithin? within)
        {
            NotAvailable = notAvailable;
            NotWithin = notWithin;
            Within = within;
        }
    }
}
