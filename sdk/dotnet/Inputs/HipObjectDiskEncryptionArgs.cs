// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class HipObjectDiskEncryptionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Encryption locations.
        /// </summary>
        [Input("criteria")]
        public Input<Inputs.HipObjectDiskEncryptionCriteriaArgs>? Criteria { get; set; }

        /// <summary>
        /// The ExcludeVendor param. Default: `false`.
        /// </summary>
        [Input("excludeVendor")]
        public Input<bool>? ExcludeVendor { get; set; }

        [Input("vendors")]
        private InputList<Inputs.HipObjectDiskEncryptionVendorArgs>? _vendors;

        /// <summary>
        /// Vendor name.
        /// </summary>
        public InputList<Inputs.HipObjectDiskEncryptionVendorArgs> Vendors
        {
            get => _vendors ?? (_vendors = new InputList<Inputs.HipObjectDiskEncryptionVendorArgs>());
            set => _vendors = value;
        }

        public HipObjectDiskEncryptionArgs()
        {
        }
        public static new HipObjectDiskEncryptionArgs Empty => new HipObjectDiskEncryptionArgs();
    }
}
