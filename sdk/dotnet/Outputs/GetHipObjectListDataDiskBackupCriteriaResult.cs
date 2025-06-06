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
    public sealed class GetHipObjectListDataDiskBackupCriteriaResult
    {
        /// <summary>
        /// Is Installed. Default: `true`.
        /// </summary>
        public readonly bool IsInstalled;
        /// <summary>
        /// The LastBackupTime param.
        /// </summary>
        public readonly Outputs.GetHipObjectListDataDiskBackupCriteriaLastBackupTimeResult LastBackupTime;

        [OutputConstructor]
        private GetHipObjectListDataDiskBackupCriteriaResult(
            bool isInstalled,

            Outputs.GetHipObjectListDataDiskBackupCriteriaLastBackupTimeResult lastBackupTime)
        {
            IsInstalled = isInstalled;
            LastBackupTime = lastBackupTime;
        }
    }
}
