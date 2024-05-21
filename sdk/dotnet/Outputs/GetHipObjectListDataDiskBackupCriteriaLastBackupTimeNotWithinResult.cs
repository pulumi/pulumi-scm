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
    public sealed class GetHipObjectListDataDiskBackupCriteriaLastBackupTimeNotWithinResult
    {
        /// <summary>
        /// specify time in days. Value must be between 1 and 65535.
        /// </summary>
        public readonly int Days;
        /// <summary>
        /// specify time in hours. Value must be between 1 and 65535.
        /// </summary>
        public readonly int Hours;

        [OutputConstructor]
        private GetHipObjectListDataDiskBackupCriteriaLastBackupTimeNotWithinResult(
            int days,

            int hours)
        {
            Days = days;
            Hours = hours;
        }
    }
}
