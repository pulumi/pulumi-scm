// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class HipObjectDiskEncryptionGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Encryption locations.
        /// </summary>
        [Input("criteria")]
        public Input<Inputs.HipObjectDiskEncryptionCriteriaGetArgs>? Criteria { get; set; }

        /// <summary>
        /// The ExcludeVendor param. Default: `false`.
        /// </summary>
        [Input("excludeVendor")]
        public Input<bool>? ExcludeVendor { get; set; }

        [Input("vendors")]
        private InputList<Inputs.HipObjectDiskEncryptionVendorGetArgs>? _vendors;

        /// <summary>
        /// Vendor name.
        /// </summary>
        public InputList<Inputs.HipObjectDiskEncryptionVendorGetArgs> Vendors
        {
            get => _vendors ?? (_vendors = new InputList<Inputs.HipObjectDiskEncryptionVendorGetArgs>());
            set => _vendors = value;
        }

        public HipObjectDiskEncryptionGetArgs()
        {
        }
        public static new HipObjectDiskEncryptionGetArgs Empty => new HipObjectDiskEncryptionGetArgs();
    }
}
