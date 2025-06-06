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
    public sealed class GetHipObjectListDataResult
    {
        /// <summary>
        /// The AntiMalware param.
        /// </summary>
        public readonly Outputs.GetHipObjectListDataAntiMalwareResult AntiMalware;
        /// <summary>
        /// The Certificate param.
        /// </summary>
        public readonly Outputs.GetHipObjectListDataCertificateResult Certificate;
        /// <summary>
        /// The CustomChecks param.
        /// </summary>
        public readonly Outputs.GetHipObjectListDataCustomChecksResult CustomChecks;
        /// <summary>
        /// The DataLossPrevention param.
        /// </summary>
        public readonly Outputs.GetHipObjectListDataDataLossPreventionResult DataLossPrevention;
        /// <summary>
        /// The Description param. String length must not exceed 255 characters.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The DiskBackup param.
        /// </summary>
        public readonly Outputs.GetHipObjectListDataDiskBackupResult DiskBackup;
        /// <summary>
        /// The DiskEncryption param.
        /// </summary>
        public readonly Outputs.GetHipObjectListDataDiskEncryptionResult DiskEncryption;
        /// <summary>
        /// The Firewall param.
        /// </summary>
        public readonly Outputs.GetHipObjectListDataFirewallResult Firewall;
        /// <summary>
        /// The HostInfo param.
        /// </summary>
        public readonly Outputs.GetHipObjectListDataHostInfoResult HostInfo;
        /// <summary>
        /// UUID of the resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The MobileDevice param.
        /// </summary>
        public readonly Outputs.GetHipObjectListDataMobileDeviceResult MobileDevice;
        /// <summary>
        /// Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The NetworkInfo param.
        /// </summary>
        public readonly Outputs.GetHipObjectListDataNetworkInfoResult NetworkInfo;
        /// <summary>
        /// The PatchManagement param.
        /// </summary>
        public readonly Outputs.GetHipObjectListDataPatchManagementResult PatchManagement;

        [OutputConstructor]
        private GetHipObjectListDataResult(
            Outputs.GetHipObjectListDataAntiMalwareResult antiMalware,

            Outputs.GetHipObjectListDataCertificateResult certificate,

            Outputs.GetHipObjectListDataCustomChecksResult customChecks,

            Outputs.GetHipObjectListDataDataLossPreventionResult dataLossPrevention,

            string description,

            Outputs.GetHipObjectListDataDiskBackupResult diskBackup,

            Outputs.GetHipObjectListDataDiskEncryptionResult diskEncryption,

            Outputs.GetHipObjectListDataFirewallResult firewall,

            Outputs.GetHipObjectListDataHostInfoResult hostInfo,

            string id,

            Outputs.GetHipObjectListDataMobileDeviceResult mobileDevice,

            string name,

            Outputs.GetHipObjectListDataNetworkInfoResult networkInfo,

            Outputs.GetHipObjectListDataPatchManagementResult patchManagement)
        {
            AntiMalware = antiMalware;
            Certificate = certificate;
            CustomChecks = customChecks;
            DataLossPrevention = dataLossPrevention;
            Description = description;
            DiskBackup = diskBackup;
            DiskEncryption = diskEncryption;
            Firewall = firewall;
            HostInfo = hostInfo;
            Id = id;
            MobileDevice = mobileDevice;
            Name = name;
            NetworkInfo = networkInfo;
            PatchManagement = patchManagement;
        }
    }
}
