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
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Scm = Pulumi.Scm;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Scm.Application("example");
    /// 
    /// });
    /// ```
    /// </summary>
    [ScmResourceType("scm:index/application:Application")]
    public partial class Application : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The AbleToTransferFile param.
        /// </summary>
        [Output("ableToTransferFile")]
        public Output<bool?> AbleToTransferFile { get; private set; } = null!;

        /// <summary>
        /// The AlgDisableCapability param. String length must not exceed 127 characters.
        /// </summary>
        [Output("algDisableCapability")]
        public Output<string?> AlgDisableCapability { get; private set; } = null!;

        /// <summary>
        /// The Category param.
        /// </summary>
        [Output("category")]
        public Output<string> Category { get; private set; } = null!;

        /// <summary>
        /// The ConsumeBigBandwidth param.
        /// </summary>
        [Output("consumeBigBandwidth")]
        public Output<bool?> ConsumeBigBandwidth { get; private set; } = null!;

        /// <summary>
        /// The DataIdent param.
        /// </summary>
        [Output("dataIdent")]
        public Output<bool?> DataIdent { get; private set; } = null!;

        /// <summary>
        /// The Default param.
        /// </summary>
        [Output("default")]
        public Output<Outputs.ApplicationDefault?> Default { get; private set; } = null!;

        /// <summary>
        /// The Description param. String length must not exceed 1023 characters.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The Device param.
        /// </summary>
        [Output("device")]
        public Output<string?> Device { get; private set; } = null!;

        /// <summary>
        /// The EvasiveBehavior param.
        /// </summary>
        [Output("evasiveBehavior")]
        public Output<bool?> EvasiveBehavior { get; private set; } = null!;

        /// <summary>
        /// The FileTypeIdent param.
        /// </summary>
        [Output("fileTypeIdent")]
        public Output<bool?> FileTypeIdent { get; private set; } = null!;

        /// <summary>
        /// The Folder param.
        /// </summary>
        [Output("folder")]
        public Output<string?> Folder { get; private set; } = null!;

        /// <summary>
        /// The HasKnownVulnerability param.
        /// </summary>
        [Output("hasKnownVulnerability")]
        public Output<bool?> HasKnownVulnerability { get; private set; } = null!;

        /// <summary>
        /// Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The NoAppidCaching param.
        /// </summary>
        [Output("noAppidCaching")]
        public Output<bool?> NoAppidCaching { get; private set; } = null!;

        /// <summary>
        /// The ParentApp param. String length must not exceed 127 characters.
        /// </summary>
        [Output("parentApp")]
        public Output<string?> ParentApp { get; private set; } = null!;

        /// <summary>
        /// The PervasiveUse param.
        /// </summary>
        [Output("pervasiveUse")]
        public Output<bool?> PervasiveUse { get; private set; } = null!;

        /// <summary>
        /// The ProneToMisuse param.
        /// </summary>
        [Output("proneToMisuse")]
        public Output<bool?> ProneToMisuse { get; private set; } = null!;

        /// <summary>
        /// The Risk param. Value must be between 1 and 5.
        /// </summary>
        [Output("risk")]
        public Output<int> Risk { get; private set; } = null!;

        /// <summary>
        /// The Signatures param.
        /// </summary>
        [Output("signatures")]
        public Output<ImmutableArray<Outputs.ApplicationSignature>> Signatures { get; private set; } = null!;

        /// <summary>
        /// The Snippet param.
        /// </summary>
        [Output("snippet")]
        public Output<string?> Snippet { get; private set; } = null!;

        /// <summary>
        /// The Subcategory param. String length must not exceed 63 characters.
        /// </summary>
        [Output("subcategory")]
        public Output<string> Subcategory { get; private set; } = null!;

        /// <summary>
        /// timeout for half-close session in seconds. Value must be between 1 and 604800.
        /// </summary>
        [Output("tcpHalfClosedTimeout")]
        public Output<int?> TcpHalfClosedTimeout { get; private set; } = null!;

        /// <summary>
        /// timeout for session in time_wait state in seconds. Value must be between 1 and 600.
        /// </summary>
        [Output("tcpTimeWaitTimeout")]
        public Output<int?> TcpTimeWaitTimeout { get; private set; } = null!;

        /// <summary>
        /// timeout in seconds. Value must be between 0 and 604800.
        /// </summary>
        [Output("tcpTimeout")]
        public Output<int?> TcpTimeout { get; private set; } = null!;

        /// <summary>
        /// The Technology param. String length must not exceed 63 characters.
        /// </summary>
        [Output("technology")]
        public Output<string> Technology { get; private set; } = null!;

        [Output("tfid")]
        public Output<string> Tfid { get; private set; } = null!;

        /// <summary>
        /// timeout in seconds. Value must be between 0 and 604800.
        /// </summary>
        [Output("timeout")]
        public Output<int?> Timeout { get; private set; } = null!;

        /// <summary>
        /// The TunnelApplications param.
        /// </summary>
        [Output("tunnelApplications")]
        public Output<bool?> TunnelApplications { get; private set; } = null!;

        /// <summary>
        /// The TunnelOtherApplication param.
        /// </summary>
        [Output("tunnelOtherApplication")]
        public Output<bool?> TunnelOtherApplication { get; private set; } = null!;

        /// <summary>
        /// timeout in seconds. Value must be between 0 and 604800.
        /// </summary>
        [Output("udpTimeout")]
        public Output<int?> UdpTimeout { get; private set; } = null!;

        /// <summary>
        /// The UsedByMalware param.
        /// </summary>
        [Output("usedByMalware")]
        public Output<bool?> UsedByMalware { get; private set; } = null!;

        /// <summary>
        /// The VirusIdent param.
        /// </summary>
        [Output("virusIdent")]
        public Output<bool?> VirusIdent { get; private set; } = null!;


        /// <summary>
        /// Create a Application resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Application(string name, ApplicationArgs args, CustomResourceOptions? options = null)
            : base("scm:index/application:Application", name, args ?? new ApplicationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Application(string name, Input<string> id, ApplicationState? state = null, CustomResourceOptions? options = null)
            : base("scm:index/application:Application", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Application resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Application Get(string name, Input<string> id, ApplicationState? state = null, CustomResourceOptions? options = null)
        {
            return new Application(name, id, state, options);
        }
    }

    public sealed class ApplicationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The AbleToTransferFile param.
        /// </summary>
        [Input("ableToTransferFile")]
        public Input<bool>? AbleToTransferFile { get; set; }

        /// <summary>
        /// The AlgDisableCapability param. String length must not exceed 127 characters.
        /// </summary>
        [Input("algDisableCapability")]
        public Input<string>? AlgDisableCapability { get; set; }

        /// <summary>
        /// The Category param.
        /// </summary>
        [Input("category", required: true)]
        public Input<string> Category { get; set; } = null!;

        /// <summary>
        /// The ConsumeBigBandwidth param.
        /// </summary>
        [Input("consumeBigBandwidth")]
        public Input<bool>? ConsumeBigBandwidth { get; set; }

        /// <summary>
        /// The DataIdent param.
        /// </summary>
        [Input("dataIdent")]
        public Input<bool>? DataIdent { get; set; }

        /// <summary>
        /// The Default param.
        /// </summary>
        [Input("default")]
        public Input<Inputs.ApplicationDefaultArgs>? Default { get; set; }

        /// <summary>
        /// The Description param. String length must not exceed 1023 characters.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The Device param.
        /// </summary>
        [Input("device")]
        public Input<string>? Device { get; set; }

        /// <summary>
        /// The EvasiveBehavior param.
        /// </summary>
        [Input("evasiveBehavior")]
        public Input<bool>? EvasiveBehavior { get; set; }

        /// <summary>
        /// The FileTypeIdent param.
        /// </summary>
        [Input("fileTypeIdent")]
        public Input<bool>? FileTypeIdent { get; set; }

        /// <summary>
        /// The Folder param.
        /// </summary>
        [Input("folder")]
        public Input<string>? Folder { get; set; }

        /// <summary>
        /// The HasKnownVulnerability param.
        /// </summary>
        [Input("hasKnownVulnerability")]
        public Input<bool>? HasKnownVulnerability { get; set; }

        /// <summary>
        /// Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The NoAppidCaching param.
        /// </summary>
        [Input("noAppidCaching")]
        public Input<bool>? NoAppidCaching { get; set; }

        /// <summary>
        /// The ParentApp param. String length must not exceed 127 characters.
        /// </summary>
        [Input("parentApp")]
        public Input<string>? ParentApp { get; set; }

        /// <summary>
        /// The PervasiveUse param.
        /// </summary>
        [Input("pervasiveUse")]
        public Input<bool>? PervasiveUse { get; set; }

        /// <summary>
        /// The ProneToMisuse param.
        /// </summary>
        [Input("proneToMisuse")]
        public Input<bool>? ProneToMisuse { get; set; }

        /// <summary>
        /// The Risk param. Value must be between 1 and 5.
        /// </summary>
        [Input("risk", required: true)]
        public Input<int> Risk { get; set; } = null!;

        [Input("signatures")]
        private InputList<Inputs.ApplicationSignatureArgs>? _signatures;

        /// <summary>
        /// The Signatures param.
        /// </summary>
        public InputList<Inputs.ApplicationSignatureArgs> Signatures
        {
            get => _signatures ?? (_signatures = new InputList<Inputs.ApplicationSignatureArgs>());
            set => _signatures = value;
        }

        /// <summary>
        /// The Snippet param.
        /// </summary>
        [Input("snippet")]
        public Input<string>? Snippet { get; set; }

        /// <summary>
        /// The Subcategory param. String length must not exceed 63 characters.
        /// </summary>
        [Input("subcategory", required: true)]
        public Input<string> Subcategory { get; set; } = null!;

        /// <summary>
        /// timeout for half-close session in seconds. Value must be between 1 and 604800.
        /// </summary>
        [Input("tcpHalfClosedTimeout")]
        public Input<int>? TcpHalfClosedTimeout { get; set; }

        /// <summary>
        /// timeout for session in time_wait state in seconds. Value must be between 1 and 600.
        /// </summary>
        [Input("tcpTimeWaitTimeout")]
        public Input<int>? TcpTimeWaitTimeout { get; set; }

        /// <summary>
        /// timeout in seconds. Value must be between 0 and 604800.
        /// </summary>
        [Input("tcpTimeout")]
        public Input<int>? TcpTimeout { get; set; }

        /// <summary>
        /// The Technology param. String length must not exceed 63 characters.
        /// </summary>
        [Input("technology", required: true)]
        public Input<string> Technology { get; set; } = null!;

        /// <summary>
        /// timeout in seconds. Value must be between 0 and 604800.
        /// </summary>
        [Input("timeout")]
        public Input<int>? Timeout { get; set; }

        /// <summary>
        /// The TunnelApplications param.
        /// </summary>
        [Input("tunnelApplications")]
        public Input<bool>? TunnelApplications { get; set; }

        /// <summary>
        /// The TunnelOtherApplication param.
        /// </summary>
        [Input("tunnelOtherApplication")]
        public Input<bool>? TunnelOtherApplication { get; set; }

        /// <summary>
        /// timeout in seconds. Value must be between 0 and 604800.
        /// </summary>
        [Input("udpTimeout")]
        public Input<int>? UdpTimeout { get; set; }

        /// <summary>
        /// The UsedByMalware param.
        /// </summary>
        [Input("usedByMalware")]
        public Input<bool>? UsedByMalware { get; set; }

        /// <summary>
        /// The VirusIdent param.
        /// </summary>
        [Input("virusIdent")]
        public Input<bool>? VirusIdent { get; set; }

        public ApplicationArgs()
        {
        }
        public static new ApplicationArgs Empty => new ApplicationArgs();
    }

    public sealed class ApplicationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The AbleToTransferFile param.
        /// </summary>
        [Input("ableToTransferFile")]
        public Input<bool>? AbleToTransferFile { get; set; }

        /// <summary>
        /// The AlgDisableCapability param. String length must not exceed 127 characters.
        /// </summary>
        [Input("algDisableCapability")]
        public Input<string>? AlgDisableCapability { get; set; }

        /// <summary>
        /// The Category param.
        /// </summary>
        [Input("category")]
        public Input<string>? Category { get; set; }

        /// <summary>
        /// The ConsumeBigBandwidth param.
        /// </summary>
        [Input("consumeBigBandwidth")]
        public Input<bool>? ConsumeBigBandwidth { get; set; }

        /// <summary>
        /// The DataIdent param.
        /// </summary>
        [Input("dataIdent")]
        public Input<bool>? DataIdent { get; set; }

        /// <summary>
        /// The Default param.
        /// </summary>
        [Input("default")]
        public Input<Inputs.ApplicationDefaultGetArgs>? Default { get; set; }

        /// <summary>
        /// The Description param. String length must not exceed 1023 characters.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The Device param.
        /// </summary>
        [Input("device")]
        public Input<string>? Device { get; set; }

        /// <summary>
        /// The EvasiveBehavior param.
        /// </summary>
        [Input("evasiveBehavior")]
        public Input<bool>? EvasiveBehavior { get; set; }

        /// <summary>
        /// The FileTypeIdent param.
        /// </summary>
        [Input("fileTypeIdent")]
        public Input<bool>? FileTypeIdent { get; set; }

        /// <summary>
        /// The Folder param.
        /// </summary>
        [Input("folder")]
        public Input<string>? Folder { get; set; }

        /// <summary>
        /// The HasKnownVulnerability param.
        /// </summary>
        [Input("hasKnownVulnerability")]
        public Input<bool>? HasKnownVulnerability { get; set; }

        /// <summary>
        /// Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The NoAppidCaching param.
        /// </summary>
        [Input("noAppidCaching")]
        public Input<bool>? NoAppidCaching { get; set; }

        /// <summary>
        /// The ParentApp param. String length must not exceed 127 characters.
        /// </summary>
        [Input("parentApp")]
        public Input<string>? ParentApp { get; set; }

        /// <summary>
        /// The PervasiveUse param.
        /// </summary>
        [Input("pervasiveUse")]
        public Input<bool>? PervasiveUse { get; set; }

        /// <summary>
        /// The ProneToMisuse param.
        /// </summary>
        [Input("proneToMisuse")]
        public Input<bool>? ProneToMisuse { get; set; }

        /// <summary>
        /// The Risk param. Value must be between 1 and 5.
        /// </summary>
        [Input("risk")]
        public Input<int>? Risk { get; set; }

        [Input("signatures")]
        private InputList<Inputs.ApplicationSignatureGetArgs>? _signatures;

        /// <summary>
        /// The Signatures param.
        /// </summary>
        public InputList<Inputs.ApplicationSignatureGetArgs> Signatures
        {
            get => _signatures ?? (_signatures = new InputList<Inputs.ApplicationSignatureGetArgs>());
            set => _signatures = value;
        }

        /// <summary>
        /// The Snippet param.
        /// </summary>
        [Input("snippet")]
        public Input<string>? Snippet { get; set; }

        /// <summary>
        /// The Subcategory param. String length must not exceed 63 characters.
        /// </summary>
        [Input("subcategory")]
        public Input<string>? Subcategory { get; set; }

        /// <summary>
        /// timeout for half-close session in seconds. Value must be between 1 and 604800.
        /// </summary>
        [Input("tcpHalfClosedTimeout")]
        public Input<int>? TcpHalfClosedTimeout { get; set; }

        /// <summary>
        /// timeout for session in time_wait state in seconds. Value must be between 1 and 600.
        /// </summary>
        [Input("tcpTimeWaitTimeout")]
        public Input<int>? TcpTimeWaitTimeout { get; set; }

        /// <summary>
        /// timeout in seconds. Value must be between 0 and 604800.
        /// </summary>
        [Input("tcpTimeout")]
        public Input<int>? TcpTimeout { get; set; }

        /// <summary>
        /// The Technology param. String length must not exceed 63 characters.
        /// </summary>
        [Input("technology")]
        public Input<string>? Technology { get; set; }

        [Input("tfid")]
        public Input<string>? Tfid { get; set; }

        /// <summary>
        /// timeout in seconds. Value must be between 0 and 604800.
        /// </summary>
        [Input("timeout")]
        public Input<int>? Timeout { get; set; }

        /// <summary>
        /// The TunnelApplications param.
        /// </summary>
        [Input("tunnelApplications")]
        public Input<bool>? TunnelApplications { get; set; }

        /// <summary>
        /// The TunnelOtherApplication param.
        /// </summary>
        [Input("tunnelOtherApplication")]
        public Input<bool>? TunnelOtherApplication { get; set; }

        /// <summary>
        /// timeout in seconds. Value must be between 0 and 604800.
        /// </summary>
        [Input("udpTimeout")]
        public Input<int>? UdpTimeout { get; set; }

        /// <summary>
        /// The UsedByMalware param.
        /// </summary>
        [Input("usedByMalware")]
        public Input<bool>? UsedByMalware { get; set; }

        /// <summary>
        /// The VirusIdent param.
        /// </summary>
        [Input("virusIdent")]
        public Input<bool>? VirusIdent { get; set; }

        public ApplicationState()
        {
        }
        public static new ApplicationState Empty => new ApplicationState();
    }
}
