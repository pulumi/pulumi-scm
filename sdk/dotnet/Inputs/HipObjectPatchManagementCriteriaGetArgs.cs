// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class HipObjectPatchManagementCriteriaGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// is enabled. String must be one of these: `"no"`, `"yes"`, `"not-available"`.
        /// </summary>
        [Input("isEnabled")]
        public Input<string>? IsEnabled { get; set; }

        /// <summary>
        /// Is Installed. Default: `true`.
        /// </summary>
        [Input("isInstalled")]
        public Input<bool>? IsInstalled { get; set; }

        /// <summary>
        /// The MissingPatches param.
        /// </summary>
        [Input("missingPatches")]
        public Input<Inputs.HipObjectPatchManagementCriteriaMissingPatchesGetArgs>? MissingPatches { get; set; }

        public HipObjectPatchManagementCriteriaGetArgs()
        {
        }
        public static new HipObjectPatchManagementCriteriaGetArgs Empty => new HipObjectPatchManagementCriteriaGetArgs();
    }
}
