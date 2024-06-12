// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
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
    ///     var example = new Scm.ProfileGroup("example");
    /// 
    /// });
    /// ```
    /// </summary>
    [ScmResourceType("scm:index/profileGroup:ProfileGroup")]
    public partial class ProfileGroup : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The Device param.
        /// </summary>
        [Output("device")]
        public Output<string?> Device { get; private set; } = null!;

        /// <summary>
        /// The DnsSecurities param.
        /// </summary>
        [Output("dnsSecurities")]
        public Output<ImmutableArray<string>> DnsSecurities { get; private set; } = null!;

        /// <summary>
        /// The FileBlockings param.
        /// </summary>
        [Output("fileBlockings")]
        public Output<ImmutableArray<string>> FileBlockings { get; private set; } = null!;

        /// <summary>
        /// The Folder param.
        /// </summary>
        [Output("folder")]
        public Output<string?> Folder { get; private set; } = null!;

        /// <summary>
        /// The Name param.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The SaasSecurities param.
        /// </summary>
        [Output("saasSecurities")]
        public Output<ImmutableArray<string>> SaasSecurities { get; private set; } = null!;

        /// <summary>
        /// The Snippet param.
        /// </summary>
        [Output("snippet")]
        public Output<string?> Snippet { get; private set; } = null!;

        /// <summary>
        /// The Spywares param.
        /// </summary>
        [Output("spywares")]
        public Output<ImmutableArray<string>> Spywares { get; private set; } = null!;

        [Output("tfid")]
        public Output<string> Tfid { get; private set; } = null!;

        /// <summary>
        /// The UrlFilterings param.
        /// </summary>
        [Output("urlFilterings")]
        public Output<ImmutableArray<string>> UrlFilterings { get; private set; } = null!;

        /// <summary>
        /// The VirusAndWildfireAnalyses param.
        /// </summary>
        [Output("virusAndWildfireAnalyses")]
        public Output<ImmutableArray<string>> VirusAndWildfireAnalyses { get; private set; } = null!;

        /// <summary>
        /// The Vulnerabilities param.
        /// </summary>
        [Output("vulnerabilities")]
        public Output<ImmutableArray<string>> Vulnerabilities { get; private set; } = null!;


        /// <summary>
        /// Create a ProfileGroup resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ProfileGroup(string name, ProfileGroupArgs? args = null, CustomResourceOptions? options = null)
            : base("scm:index/profileGroup:ProfileGroup", name, args ?? new ProfileGroupArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ProfileGroup(string name, Input<string> id, ProfileGroupState? state = null, CustomResourceOptions? options = null)
            : base("scm:index/profileGroup:ProfileGroup", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ProfileGroup resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ProfileGroup Get(string name, Input<string> id, ProfileGroupState? state = null, CustomResourceOptions? options = null)
        {
            return new ProfileGroup(name, id, state, options);
        }
    }

    public sealed class ProfileGroupArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Device param.
        /// </summary>
        [Input("device")]
        public Input<string>? Device { get; set; }

        [Input("dnsSecurities")]
        private InputList<string>? _dnsSecurities;

        /// <summary>
        /// The DnsSecurities param.
        /// </summary>
        public InputList<string> DnsSecurities
        {
            get => _dnsSecurities ?? (_dnsSecurities = new InputList<string>());
            set => _dnsSecurities = value;
        }

        [Input("fileBlockings")]
        private InputList<string>? _fileBlockings;

        /// <summary>
        /// The FileBlockings param.
        /// </summary>
        public InputList<string> FileBlockings
        {
            get => _fileBlockings ?? (_fileBlockings = new InputList<string>());
            set => _fileBlockings = value;
        }

        /// <summary>
        /// The Folder param.
        /// </summary>
        [Input("folder")]
        public Input<string>? Folder { get; set; }

        /// <summary>
        /// The Name param.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("saasSecurities")]
        private InputList<string>? _saasSecurities;

        /// <summary>
        /// The SaasSecurities param.
        /// </summary>
        public InputList<string> SaasSecurities
        {
            get => _saasSecurities ?? (_saasSecurities = new InputList<string>());
            set => _saasSecurities = value;
        }

        /// <summary>
        /// The Snippet param.
        /// </summary>
        [Input("snippet")]
        public Input<string>? Snippet { get; set; }

        [Input("spywares")]
        private InputList<string>? _spywares;

        /// <summary>
        /// The Spywares param.
        /// </summary>
        public InputList<string> Spywares
        {
            get => _spywares ?? (_spywares = new InputList<string>());
            set => _spywares = value;
        }

        [Input("urlFilterings")]
        private InputList<string>? _urlFilterings;

        /// <summary>
        /// The UrlFilterings param.
        /// </summary>
        public InputList<string> UrlFilterings
        {
            get => _urlFilterings ?? (_urlFilterings = new InputList<string>());
            set => _urlFilterings = value;
        }

        [Input("virusAndWildfireAnalyses")]
        private InputList<string>? _virusAndWildfireAnalyses;

        /// <summary>
        /// The VirusAndWildfireAnalyses param.
        /// </summary>
        public InputList<string> VirusAndWildfireAnalyses
        {
            get => _virusAndWildfireAnalyses ?? (_virusAndWildfireAnalyses = new InputList<string>());
            set => _virusAndWildfireAnalyses = value;
        }

        [Input("vulnerabilities")]
        private InputList<string>? _vulnerabilities;

        /// <summary>
        /// The Vulnerabilities param.
        /// </summary>
        public InputList<string> Vulnerabilities
        {
            get => _vulnerabilities ?? (_vulnerabilities = new InputList<string>());
            set => _vulnerabilities = value;
        }

        public ProfileGroupArgs()
        {
        }
        public static new ProfileGroupArgs Empty => new ProfileGroupArgs();
    }

    public sealed class ProfileGroupState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Device param.
        /// </summary>
        [Input("device")]
        public Input<string>? Device { get; set; }

        [Input("dnsSecurities")]
        private InputList<string>? _dnsSecurities;

        /// <summary>
        /// The DnsSecurities param.
        /// </summary>
        public InputList<string> DnsSecurities
        {
            get => _dnsSecurities ?? (_dnsSecurities = new InputList<string>());
            set => _dnsSecurities = value;
        }

        [Input("fileBlockings")]
        private InputList<string>? _fileBlockings;

        /// <summary>
        /// The FileBlockings param.
        /// </summary>
        public InputList<string> FileBlockings
        {
            get => _fileBlockings ?? (_fileBlockings = new InputList<string>());
            set => _fileBlockings = value;
        }

        /// <summary>
        /// The Folder param.
        /// </summary>
        [Input("folder")]
        public Input<string>? Folder { get; set; }

        /// <summary>
        /// The Name param.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("saasSecurities")]
        private InputList<string>? _saasSecurities;

        /// <summary>
        /// The SaasSecurities param.
        /// </summary>
        public InputList<string> SaasSecurities
        {
            get => _saasSecurities ?? (_saasSecurities = new InputList<string>());
            set => _saasSecurities = value;
        }

        /// <summary>
        /// The Snippet param.
        /// </summary>
        [Input("snippet")]
        public Input<string>? Snippet { get; set; }

        [Input("spywares")]
        private InputList<string>? _spywares;

        /// <summary>
        /// The Spywares param.
        /// </summary>
        public InputList<string> Spywares
        {
            get => _spywares ?? (_spywares = new InputList<string>());
            set => _spywares = value;
        }

        [Input("tfid")]
        public Input<string>? Tfid { get; set; }

        [Input("urlFilterings")]
        private InputList<string>? _urlFilterings;

        /// <summary>
        /// The UrlFilterings param.
        /// </summary>
        public InputList<string> UrlFilterings
        {
            get => _urlFilterings ?? (_urlFilterings = new InputList<string>());
            set => _urlFilterings = value;
        }

        [Input("virusAndWildfireAnalyses")]
        private InputList<string>? _virusAndWildfireAnalyses;

        /// <summary>
        /// The VirusAndWildfireAnalyses param.
        /// </summary>
        public InputList<string> VirusAndWildfireAnalyses
        {
            get => _virusAndWildfireAnalyses ?? (_virusAndWildfireAnalyses = new InputList<string>());
            set => _virusAndWildfireAnalyses = value;
        }

        [Input("vulnerabilities")]
        private InputList<string>? _vulnerabilities;

        /// <summary>
        /// The Vulnerabilities param.
        /// </summary>
        public InputList<string> Vulnerabilities
        {
            get => _vulnerabilities ?? (_vulnerabilities = new InputList<string>());
            set => _vulnerabilities = value;
        }

        public ProfileGroupState()
        {
        }
        public static new ProfileGroupState Empty => new ProfileGroupState();
    }
}