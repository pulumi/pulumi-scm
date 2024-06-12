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
    ///     var example = new Scm.DnsSecurityProfile("example");
    /// 
    /// });
    /// ```
    /// </summary>
    [ScmResourceType("scm:index/dnsSecurityProfile:DnsSecurityProfile")]
    public partial class DnsSecurityProfile : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The BotnetDomains param.
        /// </summary>
        [Output("botnetDomains")]
        public Output<Outputs.DnsSecurityProfileBotnetDomains?> BotnetDomains { get; private set; } = null!;

        /// <summary>
        /// The Description param.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

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
        /// The Name param.
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
        /// Create a DnsSecurityProfile resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DnsSecurityProfile(string name, DnsSecurityProfileArgs? args = null, CustomResourceOptions? options = null)
            : base("scm:index/dnsSecurityProfile:DnsSecurityProfile", name, args ?? new DnsSecurityProfileArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DnsSecurityProfile(string name, Input<string> id, DnsSecurityProfileState? state = null, CustomResourceOptions? options = null)
            : base("scm:index/dnsSecurityProfile:DnsSecurityProfile", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing DnsSecurityProfile resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DnsSecurityProfile Get(string name, Input<string> id, DnsSecurityProfileState? state = null, CustomResourceOptions? options = null)
        {
            return new DnsSecurityProfile(name, id, state, options);
        }
    }

    public sealed class DnsSecurityProfileArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The BotnetDomains param.
        /// </summary>
        [Input("botnetDomains")]
        public Input<Inputs.DnsSecurityProfileBotnetDomainsArgs>? BotnetDomains { get; set; }

        /// <summary>
        /// The Description param.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

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
        /// The Name param.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The Snippet param.
        /// </summary>
        [Input("snippet")]
        public Input<string>? Snippet { get; set; }

        public DnsSecurityProfileArgs()
        {
        }
        public static new DnsSecurityProfileArgs Empty => new DnsSecurityProfileArgs();
    }

    public sealed class DnsSecurityProfileState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The BotnetDomains param.
        /// </summary>
        [Input("botnetDomains")]
        public Input<Inputs.DnsSecurityProfileBotnetDomainsGetArgs>? BotnetDomains { get; set; }

        /// <summary>
        /// The Description param.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

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
        /// The Name param.
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

        public DnsSecurityProfileState()
        {
        }
        public static new DnsSecurityProfileState Empty => new DnsSecurityProfileState();
    }
}