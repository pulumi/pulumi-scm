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
    ///     var example = new Scm.DecryptionProfile("example");
    /// 
    /// });
    /// ```
    /// </summary>
    [ScmResourceType("scm:index/decryptionProfile:DecryptionProfile")]
    public partial class DecryptionProfile : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The Device param.
        /// </summary>
        [Output("device")]
        public Output<string?> Device { get; private set; } = null!;

        /// <summary>
        /// The Folder param.
        /// </summary>
        [Output("folder")]
        public Output<string?> Folder { get; private set; } = null!;

        /// <summary>
        /// Must start with alphanumeric char and should contain only alphanemeric, underscore, hyphen, dot or space. String validation regex: `^[A-Za-z0-9]{1}[A-Za-z0-9_\-\.\s]{0,}$`.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The Snippet param.
        /// </summary>
        [Output("snippet")]
        public Output<string?> Snippet { get; private set; } = null!;

        /// <summary>
        /// The SslForwardProxy param.
        /// </summary>
        [Output("sslForwardProxy")]
        public Output<Outputs.DecryptionProfileSslForwardProxy?> SslForwardProxy { get; private set; } = null!;

        /// <summary>
        /// The SslInboundProxy param.
        /// </summary>
        [Output("sslInboundProxy")]
        public Output<Outputs.DecryptionProfileSslInboundProxy?> SslInboundProxy { get; private set; } = null!;

        /// <summary>
        /// The SslNoProxy param.
        /// </summary>
        [Output("sslNoProxy")]
        public Output<Outputs.DecryptionProfileSslNoProxy?> SslNoProxy { get; private set; } = null!;

        /// <summary>
        /// The SslProtocolSettings param.
        /// </summary>
        [Output("sslProtocolSettings")]
        public Output<Outputs.DecryptionProfileSslProtocolSettings?> SslProtocolSettings { get; private set; } = null!;

        [Output("tfid")]
        public Output<string> Tfid { get; private set; } = null!;


        /// <summary>
        /// Create a DecryptionProfile resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DecryptionProfile(string name, DecryptionProfileArgs? args = null, CustomResourceOptions? options = null)
            : base("scm:index/decryptionProfile:DecryptionProfile", name, args ?? new DecryptionProfileArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DecryptionProfile(string name, Input<string> id, DecryptionProfileState? state = null, CustomResourceOptions? options = null)
            : base("scm:index/decryptionProfile:DecryptionProfile", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing DecryptionProfile resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DecryptionProfile Get(string name, Input<string> id, DecryptionProfileState? state = null, CustomResourceOptions? options = null)
        {
            return new DecryptionProfile(name, id, state, options);
        }
    }

    public sealed class DecryptionProfileArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Device param.
        /// </summary>
        [Input("device")]
        public Input<string>? Device { get; set; }

        /// <summary>
        /// The Folder param.
        /// </summary>
        [Input("folder")]
        public Input<string>? Folder { get; set; }

        /// <summary>
        /// Must start with alphanumeric char and should contain only alphanemeric, underscore, hyphen, dot or space. String validation regex: `^[A-Za-z0-9]{1}[A-Za-z0-9_\-\.\s]{0,}$`.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The Snippet param.
        /// </summary>
        [Input("snippet")]
        public Input<string>? Snippet { get; set; }

        /// <summary>
        /// The SslForwardProxy param.
        /// </summary>
        [Input("sslForwardProxy")]
        public Input<Inputs.DecryptionProfileSslForwardProxyArgs>? SslForwardProxy { get; set; }

        /// <summary>
        /// The SslInboundProxy param.
        /// </summary>
        [Input("sslInboundProxy")]
        public Input<Inputs.DecryptionProfileSslInboundProxyArgs>? SslInboundProxy { get; set; }

        /// <summary>
        /// The SslNoProxy param.
        /// </summary>
        [Input("sslNoProxy")]
        public Input<Inputs.DecryptionProfileSslNoProxyArgs>? SslNoProxy { get; set; }

        /// <summary>
        /// The SslProtocolSettings param.
        /// </summary>
        [Input("sslProtocolSettings")]
        public Input<Inputs.DecryptionProfileSslProtocolSettingsArgs>? SslProtocolSettings { get; set; }

        public DecryptionProfileArgs()
        {
        }
        public static new DecryptionProfileArgs Empty => new DecryptionProfileArgs();
    }

    public sealed class DecryptionProfileState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Device param.
        /// </summary>
        [Input("device")]
        public Input<string>? Device { get; set; }

        /// <summary>
        /// The Folder param.
        /// </summary>
        [Input("folder")]
        public Input<string>? Folder { get; set; }

        /// <summary>
        /// Must start with alphanumeric char and should contain only alphanemeric, underscore, hyphen, dot or space. String validation regex: `^[A-Za-z0-9]{1}[A-Za-z0-9_\-\.\s]{0,}$`.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The Snippet param.
        /// </summary>
        [Input("snippet")]
        public Input<string>? Snippet { get; set; }

        /// <summary>
        /// The SslForwardProxy param.
        /// </summary>
        [Input("sslForwardProxy")]
        public Input<Inputs.DecryptionProfileSslForwardProxyGetArgs>? SslForwardProxy { get; set; }

        /// <summary>
        /// The SslInboundProxy param.
        /// </summary>
        [Input("sslInboundProxy")]
        public Input<Inputs.DecryptionProfileSslInboundProxyGetArgs>? SslInboundProxy { get; set; }

        /// <summary>
        /// The SslNoProxy param.
        /// </summary>
        [Input("sslNoProxy")]
        public Input<Inputs.DecryptionProfileSslNoProxyGetArgs>? SslNoProxy { get; set; }

        /// <summary>
        /// The SslProtocolSettings param.
        /// </summary>
        [Input("sslProtocolSettings")]
        public Input<Inputs.DecryptionProfileSslProtocolSettingsGetArgs>? SslProtocolSettings { get; set; }

        [Input("tfid")]
        public Input<string>? Tfid { get; set; }

        public DecryptionProfileState()
        {
        }
        public static new DecryptionProfileState Empty => new DecryptionProfileState();
    }
}