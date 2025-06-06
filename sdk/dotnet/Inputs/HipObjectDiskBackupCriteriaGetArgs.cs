// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class HipObjectDiskBackupCriteriaGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Is Installed. Default: `true`.
        /// </summary>
        [Input("isInstalled")]
        public Input<bool>? IsInstalled { get; set; }

        /// <summary>
        /// The LastBackupTime param.
        /// </summary>
        [Input("lastBackupTime")]
        public Input<Inputs.HipObjectDiskBackupCriteriaLastBackupTimeGetArgs>? LastBackupTime { get; set; }

        public HipObjectDiskBackupCriteriaGetArgs()
        {
        }
        public static new HipObjectDiskBackupCriteriaGetArgs Empty => new HipObjectDiskBackupCriteriaGetArgs();
    }
}
