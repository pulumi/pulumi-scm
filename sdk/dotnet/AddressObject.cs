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
    ///     var example = new Scm.AddressObject("example", new()
    ///     {
    ///         Folder = "Shared",
    ///         Name = "example",
    ///         Description = "Made by Pulumi",
    ///         IpNetmask = "10.2.3.4",
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [ScmResourceType("scm:index/addressObject:AddressObject")]
    public partial class AddressObject : global::Pulumi.CustomResource
    {
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
        /// The Folder param.
        /// </summary>
        [Output("folder")]
        public Output<string?> Folder { get; private set; } = null!;

        /// <summary>
        /// The Fqdn param. String length must be between 1 and 255 characters. String validation regex: `^a-zA-Z0-9_+[a-zA-Z0-9]$`. Ensure that only one of the following is specified: `fqdn`, `ip_netmask`, `ip_range`, `ip_wildcard`
        /// </summary>
        [Output("fqdn")]
        public Output<string?> Fqdn { get; private set; } = null!;

        /// <summary>
        /// The IpNetmask param. Ensure that only one of the following is specified: `fqdn`, `ip_netmask`, `ip_range`, `ip_wildcard`
        /// </summary>
        [Output("ipNetmask")]
        public Output<string?> IpNetmask { get; private set; } = null!;

        /// <summary>
        /// The IpRange param. Ensure that only one of the following is specified: `fqdn`, `ip_netmask`, `ip_range`, `ip_wildcard`
        /// </summary>
        [Output("ipRange")]
        public Output<string?> IpRange { get; private set; } = null!;

        /// <summary>
        /// The IpWildcard param. Ensure that only one of the following is specified: `fqdn`, `ip_netmask`, `ip_range`, `ip_wildcard`
        /// </summary>
        [Output("ipWildcard")]
        public Output<string?> IpWildcard { get; private set; } = null!;

        /// <summary>
        /// Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 63 characters.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The Snippet param.
        /// </summary>
        [Output("snippet")]
        public Output<string?> Snippet { get; private set; } = null!;

        /// <summary>
        /// Tags for address object. List must contain at most 64 elements. Individual elements in this list are subject to additional validation. String length must not exceed 127 characters.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<string>> Tags { get; private set; } = null!;

        [Output("tfid")]
        public Output<string> Tfid { get; private set; } = null!;

        /// <summary>
        /// The Type param.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;


        /// <summary>
        /// Create a AddressObject resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AddressObject(string name, AddressObjectArgs? args = null, CustomResourceOptions? options = null)
            : base("scm:index/addressObject:AddressObject", name, args ?? new AddressObjectArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AddressObject(string name, Input<string> id, AddressObjectState? state = null, CustomResourceOptions? options = null)
            : base("scm:index/addressObject:AddressObject", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AddressObject resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AddressObject Get(string name, Input<string> id, AddressObjectState? state = null, CustomResourceOptions? options = null)
        {
            return new AddressObject(name, id, state, options);
        }
    }

    public sealed class AddressObjectArgs : global::Pulumi.ResourceArgs
    {
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
        /// The Folder param.
        /// </summary>
        [Input("folder")]
        public Input<string>? Folder { get; set; }

        /// <summary>
        /// The Fqdn param. String length must be between 1 and 255 characters. String validation regex: `^a-zA-Z0-9_+[a-zA-Z0-9]$`. Ensure that only one of the following is specified: `fqdn`, `ip_netmask`, `ip_range`, `ip_wildcard`
        /// </summary>
        [Input("fqdn")]
        public Input<string>? Fqdn { get; set; }

        /// <summary>
        /// The IpNetmask param. Ensure that only one of the following is specified: `fqdn`, `ip_netmask`, `ip_range`, `ip_wildcard`
        /// </summary>
        [Input("ipNetmask")]
        public Input<string>? IpNetmask { get; set; }

        /// <summary>
        /// The IpRange param. Ensure that only one of the following is specified: `fqdn`, `ip_netmask`, `ip_range`, `ip_wildcard`
        /// </summary>
        [Input("ipRange")]
        public Input<string>? IpRange { get; set; }

        /// <summary>
        /// The IpWildcard param. Ensure that only one of the following is specified: `fqdn`, `ip_netmask`, `ip_range`, `ip_wildcard`
        /// </summary>
        [Input("ipWildcard")]
        public Input<string>? IpWildcard { get; set; }

        /// <summary>
        /// Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 63 characters.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The Snippet param.
        /// </summary>
        [Input("snippet")]
        public Input<string>? Snippet { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// Tags for address object. List must contain at most 64 elements. Individual elements in this list are subject to additional validation. String length must not exceed 127 characters.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        public AddressObjectArgs()
        {
        }
        public static new AddressObjectArgs Empty => new AddressObjectArgs();
    }

    public sealed class AddressObjectState : global::Pulumi.ResourceArgs
    {
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
        /// The Folder param.
        /// </summary>
        [Input("folder")]
        public Input<string>? Folder { get; set; }

        /// <summary>
        /// The Fqdn param. String length must be between 1 and 255 characters. String validation regex: `^a-zA-Z0-9_+[a-zA-Z0-9]$`. Ensure that only one of the following is specified: `fqdn`, `ip_netmask`, `ip_range`, `ip_wildcard`
        /// </summary>
        [Input("fqdn")]
        public Input<string>? Fqdn { get; set; }

        /// <summary>
        /// The IpNetmask param. Ensure that only one of the following is specified: `fqdn`, `ip_netmask`, `ip_range`, `ip_wildcard`
        /// </summary>
        [Input("ipNetmask")]
        public Input<string>? IpNetmask { get; set; }

        /// <summary>
        /// The IpRange param. Ensure that only one of the following is specified: `fqdn`, `ip_netmask`, `ip_range`, `ip_wildcard`
        /// </summary>
        [Input("ipRange")]
        public Input<string>? IpRange { get; set; }

        /// <summary>
        /// The IpWildcard param. Ensure that only one of the following is specified: `fqdn`, `ip_netmask`, `ip_range`, `ip_wildcard`
        /// </summary>
        [Input("ipWildcard")]
        public Input<string>? IpWildcard { get; set; }

        /// <summary>
        /// Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 63 characters.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The Snippet param.
        /// </summary>
        [Input("snippet")]
        public Input<string>? Snippet { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// Tags for address object. List must contain at most 64 elements. Individual elements in this list are subject to additional validation. String length must not exceed 127 characters.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        [Input("tfid")]
        public Input<string>? Tfid { get; set; }

        /// <summary>
        /// The Type param.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public AddressObjectState()
        {
        }
        public static new AddressObjectState Empty => new AddressObjectState();
    }
}
