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
    public sealed class HipObjectDataLossPreventionCriteria
    {
        /// <summary>
        /// is enabled. String must be one of these: `"no"`, `"yes"`, `"not-available"`.
        /// </summary>
        public readonly string? IsEnabled;
        /// <summary>
        /// Is Installed. Default: `true`.
        /// </summary>
        public readonly bool? IsInstalled;

        [OutputConstructor]
        private HipObjectDataLossPreventionCriteria(
            string? isEnabled,

            bool? isInstalled)
        {
            IsEnabled = isEnabled;
            IsInstalled = isInstalled;
        }
    }
}