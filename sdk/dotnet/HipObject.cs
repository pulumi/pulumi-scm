// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm
{
    /// <summary>
    /// Retrieves a config item.
    /// </summary>
    [ScmResourceType("scm:index/hipObject:HipObject")]
    public partial class HipObject : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The AntiMalware param.
        /// </summary>
        [Output("antiMalware")]
        public Output<Outputs.HipObjectAntiMalware?> AntiMalware { get; private set; } = null!;

        /// <summary>
        /// The Certificate param.
        /// </summary>
        [Output("certificate")]
        public Output<Outputs.HipObjectCertificate?> Certificate { get; private set; } = null!;

        /// <summary>
        /// The CustomChecks param.
        /// </summary>
        [Output("customChecks")]
        public Output<Outputs.HipObjectCustomChecks?> CustomChecks { get; private set; } = null!;

        /// <summary>
        /// The DataLossPrevention param.
        /// </summary>
        [Output("dataLossPrevention")]
        public Output<Outputs.HipObjectDataLossPrevention?> DataLossPrevention { get; private set; } = null!;

        /// <summary>
        /// The Description param. String length must not exceed 255 characters.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The Device param.
        /// </summary>
        [Output("device")]
        public Output<string?> Device { get; private set; } = null!;

        /// <summary>
        /// The DiskBackup param.
        /// </summary>
        [Output("diskBackup")]
        public Output<Outputs.HipObjectDiskBackup?> DiskBackup { get; private set; } = null!;

        /// <summary>
        /// The DiskEncryption param.
        /// </summary>
        [Output("diskEncryption")]
        public Output<Outputs.HipObjectDiskEncryption?> DiskEncryption { get; private set; } = null!;

        /// <summary>
        /// The Firewall param.
        /// </summary>
        [Output("firewall")]
        public Output<Outputs.HipObjectFirewall?> Firewall { get; private set; } = null!;

        /// <summary>
        /// The Folder param.
        /// </summary>
        [Output("folder")]
        public Output<string?> Folder { get; private set; } = null!;

        /// <summary>
        /// The HostInfo param.
        /// </summary>
        [Output("hostInfo")]
        public Output<Outputs.HipObjectHostInfo?> HostInfo { get; private set; } = null!;

        /// <summary>
        /// The MobileDevice param.
        /// </summary>
        [Output("mobileDevice")]
        public Output<Outputs.HipObjectMobileDevice?> MobileDevice { get; private set; } = null!;

        /// <summary>
        /// Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The NetworkInfo param.
        /// </summary>
        [Output("networkInfo")]
        public Output<Outputs.HipObjectNetworkInfo?> NetworkInfo { get; private set; } = null!;

        /// <summary>
        /// The PatchManagement param.
        /// </summary>
        [Output("patchManagement")]
        public Output<Outputs.HipObjectPatchManagement?> PatchManagement { get; private set; } = null!;

        /// <summary>
        /// The Snippet param.
        /// </summary>
        [Output("snippet")]
        public Output<string?> Snippet { get; private set; } = null!;

        [Output("tfid")]
        public Output<string> Tfid { get; private set; } = null!;


        /// <summary>
        /// Create a HipObject resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public HipObject(string name, HipObjectArgs? args = null, CustomResourceOptions? options = null)
            : base("scm:index/hipObject:HipObject", name, args ?? new HipObjectArgs(), MakeResourceOptions(options, ""))
        {
        }

        private HipObject(string name, Input<string> id, HipObjectState? state = null, CustomResourceOptions? options = null)
            : base("scm:index/hipObject:HipObject", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing HipObject resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static HipObject Get(string name, Input<string> id, HipObjectState? state = null, CustomResourceOptions? options = null)
        {
            return new HipObject(name, id, state, options);
        }
    }

    public sealed class HipObjectArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The AntiMalware param.
        /// </summary>
        [Input("antiMalware")]
        public Input<Inputs.HipObjectAntiMalwareArgs>? AntiMalware { get; set; }

        /// <summary>
        /// The Certificate param.
        /// </summary>
        [Input("certificate")]
        public Input<Inputs.HipObjectCertificateArgs>? Certificate { get; set; }

        /// <summary>
        /// The CustomChecks param.
        /// </summary>
        [Input("customChecks")]
        public Input<Inputs.HipObjectCustomChecksArgs>? CustomChecks { get; set; }

        /// <summary>
        /// The DataLossPrevention param.
        /// </summary>
        [Input("dataLossPrevention")]
        public Input<Inputs.HipObjectDataLossPreventionArgs>? DataLossPrevention { get; set; }

        /// <summary>
        /// The Description param. String length must not exceed 255 characters.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The Device param.
        /// </summary>
        [Input("device")]
        public Input<string>? Device { get; set; }

        /// <summary>
        /// The DiskBackup param.
        /// </summary>
        [Input("diskBackup")]
        public Input<Inputs.HipObjectDiskBackupArgs>? DiskBackup { get; set; }

        /// <summary>
        /// The DiskEncryption param.
        /// </summary>
        [Input("diskEncryption")]
        public Input<Inputs.HipObjectDiskEncryptionArgs>? DiskEncryption { get; set; }

        /// <summary>
        /// The Firewall param.
        /// </summary>
        [Input("firewall")]
        public Input<Inputs.HipObjectFirewallArgs>? Firewall { get; set; }

        /// <summary>
        /// The Folder param.
        /// </summary>
        [Input("folder")]
        public Input<string>? Folder { get; set; }

        /// <summary>
        /// The HostInfo param.
        /// </summary>
        [Input("hostInfo")]
        public Input<Inputs.HipObjectHostInfoArgs>? HostInfo { get; set; }

        /// <summary>
        /// The MobileDevice param.
        /// </summary>
        [Input("mobileDevice")]
        public Input<Inputs.HipObjectMobileDeviceArgs>? MobileDevice { get; set; }

        /// <summary>
        /// Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The NetworkInfo param.
        /// </summary>
        [Input("networkInfo")]
        public Input<Inputs.HipObjectNetworkInfoArgs>? NetworkInfo { get; set; }

        /// <summary>
        /// The PatchManagement param.
        /// </summary>
        [Input("patchManagement")]
        public Input<Inputs.HipObjectPatchManagementArgs>? PatchManagement { get; set; }

        /// <summary>
        /// The Snippet param.
        /// </summary>
        [Input("snippet")]
        public Input<string>? Snippet { get; set; }

        public HipObjectArgs()
        {
        }
        public static new HipObjectArgs Empty => new HipObjectArgs();
    }

    public sealed class HipObjectState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The AntiMalware param.
        /// </summary>
        [Input("antiMalware")]
        public Input<Inputs.HipObjectAntiMalwareGetArgs>? AntiMalware { get; set; }

        /// <summary>
        /// The Certificate param.
        /// </summary>
        [Input("certificate")]
        public Input<Inputs.HipObjectCertificateGetArgs>? Certificate { get; set; }

        /// <summary>
        /// The CustomChecks param.
        /// </summary>
        [Input("customChecks")]
        public Input<Inputs.HipObjectCustomChecksGetArgs>? CustomChecks { get; set; }

        /// <summary>
        /// The DataLossPrevention param.
        /// </summary>
        [Input("dataLossPrevention")]
        public Input<Inputs.HipObjectDataLossPreventionGetArgs>? DataLossPrevention { get; set; }

        /// <summary>
        /// The Description param. String length must not exceed 255 characters.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The Device param.
        /// </summary>
        [Input("device")]
        public Input<string>? Device { get; set; }

        /// <summary>
        /// The DiskBackup param.
        /// </summary>
        [Input("diskBackup")]
        public Input<Inputs.HipObjectDiskBackupGetArgs>? DiskBackup { get; set; }

        /// <summary>
        /// The DiskEncryption param.
        /// </summary>
        [Input("diskEncryption")]
        public Input<Inputs.HipObjectDiskEncryptionGetArgs>? DiskEncryption { get; set; }

        /// <summary>
        /// The Firewall param.
        /// </summary>
        [Input("firewall")]
        public Input<Inputs.HipObjectFirewallGetArgs>? Firewall { get; set; }

        /// <summary>
        /// The Folder param.
        /// </summary>
        [Input("folder")]
        public Input<string>? Folder { get; set; }

        /// <summary>
        /// The HostInfo param.
        /// </summary>
        [Input("hostInfo")]
        public Input<Inputs.HipObjectHostInfoGetArgs>? HostInfo { get; set; }

        /// <summary>
        /// The MobileDevice param.
        /// </summary>
        [Input("mobileDevice")]
        public Input<Inputs.HipObjectMobileDeviceGetArgs>? MobileDevice { get; set; }

        /// <summary>
        /// Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The NetworkInfo param.
        /// </summary>
        [Input("networkInfo")]
        public Input<Inputs.HipObjectNetworkInfoGetArgs>? NetworkInfo { get; set; }

        /// <summary>
        /// The PatchManagement param.
        /// </summary>
        [Input("patchManagement")]
        public Input<Inputs.HipObjectPatchManagementGetArgs>? PatchManagement { get; set; }

        /// <summary>
        /// The Snippet param.
        /// </summary>
        [Input("snippet")]
        public Input<string>? Snippet { get; set; }

        [Input("tfid")]
        public Input<string>? Tfid { get; set; }

        public HipObjectState()
        {
        }
        public static new HipObjectState Empty => new HipObjectState();
    }
}
