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
    public sealed class GetHipObjectListDataDiskEncryptionCriteriaEncryptedLocationResult
    {
        /// <summary>
        /// The EncryptionState param.
        /// </summary>
        public readonly Outputs.GetHipObjectListDataDiskEncryptionCriteriaEncryptedLocationEncryptionStateResult EncryptionState;
        /// <summary>
        /// The Name param.
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private GetHipObjectListDataDiskEncryptionCriteriaEncryptedLocationResult(
            Outputs.GetHipObjectListDataDiskEncryptionCriteriaEncryptedLocationEncryptionStateResult encryptionState,

            string name)
        {
            EncryptionState = encryptionState;
            Name = name;
        }
    }
}
