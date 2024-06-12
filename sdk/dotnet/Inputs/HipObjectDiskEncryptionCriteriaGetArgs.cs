// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class HipObjectDiskEncryptionCriteriaGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("encryptedLocations")]
        private InputList<Inputs.HipObjectDiskEncryptionCriteriaEncryptedLocationGetArgs>? _encryptedLocations;

        /// <summary>
        /// The EncryptedLocations param.
        /// </summary>
        public InputList<Inputs.HipObjectDiskEncryptionCriteriaEncryptedLocationGetArgs> EncryptedLocations
        {
            get => _encryptedLocations ?? (_encryptedLocations = new InputList<Inputs.HipObjectDiskEncryptionCriteriaEncryptedLocationGetArgs>());
            set => _encryptedLocations = value;
        }

        /// <summary>
        /// Is Installed. Default: `true`.
        /// </summary>
        [Input("isInstalled")]
        public Input<bool>? IsInstalled { get; set; }

        public HipObjectDiskEncryptionCriteriaGetArgs()
        {
        }
        public static new HipObjectDiskEncryptionCriteriaGetArgs Empty => new HipObjectDiskEncryptionCriteriaGetArgs();
    }
}