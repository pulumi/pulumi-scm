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
    ///     var example = new Scm.IkeCryptoProfile("example");
    /// 
    /// });
    /// ```
    /// </summary>
    [ScmResourceType("scm:index/ikeCryptoProfile:IkeCryptoProfile")]
    public partial class IkeCryptoProfile : global::Pulumi.CustomResource
    {
        /// <summary>
        /// IKEv2 SA reauthentication interval equals authetication-multiple * rekey-lifetime; 0 means reauthentication disabled. Value must be less than or equal to 50. Default: `0`.
        /// </summary>
        [Output("authenticationMultiple")]
        public Output<int> AuthenticationMultiple { get; private set; } = null!;

        /// <summary>
        /// The Device param.
        /// </summary>
        [Output("device")]
        public Output<string?> Device { get; private set; } = null!;

        /// <summary>
        /// The DhGroups param. Individual elements in this list are subject to additional validation. String must be one of these: `"group1"`, `"group2"`, `"group5"`, `"group14"`, `"group19"`, `"group20"`.
        /// </summary>
        [Output("dhGroups")]
        public Output<ImmutableArray<string>> DhGroups { get; private set; } = null!;

        /// <summary>
        /// Encryption algorithm. Individual elements in this list are subject to additional validation. String must be one of these: `"des"`, `"3des"`, `"aes-128-cbc"`, `"aes-192-cbc"`, `"aes-256-cbc"`, `"aes-128-gcm"`, `"aes-256-gcm"`.
        /// </summary>
        [Output("encryptions")]
        public Output<ImmutableArray<string>> Encryptions { get; private set; } = null!;

        /// <summary>
        /// The Folder param.
        /// </summary>
        [Output("folder")]
        public Output<string?> Folder { get; private set; } = null!;

        /// <summary>
        /// The Hashes param. Individual elements in this list are subject to additional validation. String must be one of these: `"md5"`, `"sha1"`, `"sha256"`, `"sha384"`, `"sha512"`.
        /// </summary>
        [Output("hashes")]
        public Output<ImmutableArray<string>> Hashes { get; private set; } = null!;

        /// <summary>
        /// The Lifetime param.
        /// </summary>
        [Output("lifetime")]
        public Output<Outputs.IkeCryptoProfileLifetime?> Lifetime { get; private set; } = null!;

        /// <summary>
        /// Alphanumeric string begin with letter: [0-9a-zA-Z._-]. String length must not exceed 31 characters.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The Snippet param.
        /// </summary>
        [Output("snippet")]
        public Output<string?> Snippet { get; private set; } = null!;

        [Output("tfid")]
        public Output<string> Tfid { get; private set; } = null!;


        /// <summary>
        /// Create a IkeCryptoProfile resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public IkeCryptoProfile(string name, IkeCryptoProfileArgs args, CustomResourceOptions? options = null)
            : base("scm:index/ikeCryptoProfile:IkeCryptoProfile", name, args ?? new IkeCryptoProfileArgs(), MakeResourceOptions(options, ""))
        {
        }

        private IkeCryptoProfile(string name, Input<string> id, IkeCryptoProfileState? state = null, CustomResourceOptions? options = null)
            : base("scm:index/ikeCryptoProfile:IkeCryptoProfile", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing IkeCryptoProfile resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static IkeCryptoProfile Get(string name, Input<string> id, IkeCryptoProfileState? state = null, CustomResourceOptions? options = null)
        {
            return new IkeCryptoProfile(name, id, state, options);
        }
    }

    public sealed class IkeCryptoProfileArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// IKEv2 SA reauthentication interval equals authetication-multiple * rekey-lifetime; 0 means reauthentication disabled. Value must be less than or equal to 50. Default: `0`.
        /// </summary>
        [Input("authenticationMultiple")]
        public Input<int>? AuthenticationMultiple { get; set; }

        /// <summary>
        /// The Device param.
        /// </summary>
        [Input("device")]
        public Input<string>? Device { get; set; }

        [Input("dhGroups", required: true)]
        private InputList<string>? _dhGroups;

        /// <summary>
        /// The DhGroups param. Individual elements in this list are subject to additional validation. String must be one of these: `"group1"`, `"group2"`, `"group5"`, `"group14"`, `"group19"`, `"group20"`.
        /// </summary>
        public InputList<string> DhGroups
        {
            get => _dhGroups ?? (_dhGroups = new InputList<string>());
            set => _dhGroups = value;
        }

        [Input("encryptions", required: true)]
        private InputList<string>? _encryptions;

        /// <summary>
        /// Encryption algorithm. Individual elements in this list are subject to additional validation. String must be one of these: `"des"`, `"3des"`, `"aes-128-cbc"`, `"aes-192-cbc"`, `"aes-256-cbc"`, `"aes-128-gcm"`, `"aes-256-gcm"`.
        /// </summary>
        public InputList<string> Encryptions
        {
            get => _encryptions ?? (_encryptions = new InputList<string>());
            set => _encryptions = value;
        }

        /// <summary>
        /// The Folder param.
        /// </summary>
        [Input("folder")]
        public Input<string>? Folder { get; set; }

        [Input("hashes", required: true)]
        private InputList<string>? _hashes;

        /// <summary>
        /// The Hashes param. Individual elements in this list are subject to additional validation. String must be one of these: `"md5"`, `"sha1"`, `"sha256"`, `"sha384"`, `"sha512"`.
        /// </summary>
        public InputList<string> Hashes
        {
            get => _hashes ?? (_hashes = new InputList<string>());
            set => _hashes = value;
        }

        /// <summary>
        /// The Lifetime param.
        /// </summary>
        [Input("lifetime")]
        public Input<Inputs.IkeCryptoProfileLifetimeArgs>? Lifetime { get; set; }

        /// <summary>
        /// Alphanumeric string begin with letter: [0-9a-zA-Z._-]. String length must not exceed 31 characters.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The Snippet param.
        /// </summary>
        [Input("snippet")]
        public Input<string>? Snippet { get; set; }

        public IkeCryptoProfileArgs()
        {
        }
        public static new IkeCryptoProfileArgs Empty => new IkeCryptoProfileArgs();
    }

    public sealed class IkeCryptoProfileState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// IKEv2 SA reauthentication interval equals authetication-multiple * rekey-lifetime; 0 means reauthentication disabled. Value must be less than or equal to 50. Default: `0`.
        /// </summary>
        [Input("authenticationMultiple")]
        public Input<int>? AuthenticationMultiple { get; set; }

        /// <summary>
        /// The Device param.
        /// </summary>
        [Input("device")]
        public Input<string>? Device { get; set; }

        [Input("dhGroups")]
        private InputList<string>? _dhGroups;

        /// <summary>
        /// The DhGroups param. Individual elements in this list are subject to additional validation. String must be one of these: `"group1"`, `"group2"`, `"group5"`, `"group14"`, `"group19"`, `"group20"`.
        /// </summary>
        public InputList<string> DhGroups
        {
            get => _dhGroups ?? (_dhGroups = new InputList<string>());
            set => _dhGroups = value;
        }

        [Input("encryptions")]
        private InputList<string>? _encryptions;

        /// <summary>
        /// Encryption algorithm. Individual elements in this list are subject to additional validation. String must be one of these: `"des"`, `"3des"`, `"aes-128-cbc"`, `"aes-192-cbc"`, `"aes-256-cbc"`, `"aes-128-gcm"`, `"aes-256-gcm"`.
        /// </summary>
        public InputList<string> Encryptions
        {
            get => _encryptions ?? (_encryptions = new InputList<string>());
            set => _encryptions = value;
        }

        /// <summary>
        /// The Folder param.
        /// </summary>
        [Input("folder")]
        public Input<string>? Folder { get; set; }

        [Input("hashes")]
        private InputList<string>? _hashes;

        /// <summary>
        /// The Hashes param. Individual elements in this list are subject to additional validation. String must be one of these: `"md5"`, `"sha1"`, `"sha256"`, `"sha384"`, `"sha512"`.
        /// </summary>
        public InputList<string> Hashes
        {
            get => _hashes ?? (_hashes = new InputList<string>());
            set => _hashes = value;
        }

        /// <summary>
        /// The Lifetime param.
        /// </summary>
        [Input("lifetime")]
        public Input<Inputs.IkeCryptoProfileLifetimeGetArgs>? Lifetime { get; set; }

        /// <summary>
        /// Alphanumeric string begin with letter: [0-9a-zA-Z._-]. String length must not exceed 31 characters.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The Snippet param.
        /// </summary>
        [Input("snippet")]
        public Input<string>? Snippet { get; set; }

        [Input("tfid")]
        public Input<string>? Tfid { get; set; }

        public IkeCryptoProfileState()
        {
        }
        public static new IkeCryptoProfileState Empty => new IkeCryptoProfileState();
    }
}