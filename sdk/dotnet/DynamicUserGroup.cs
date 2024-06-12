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
    ///     var example = new Scm.DynamicUserGroup("example");
    /// 
    /// });
    /// ```
    /// </summary>
    [ScmResourceType("scm:index/dynamicUserGroup:DynamicUserGroup")]
    public partial class DynamicUserGroup : global::Pulumi.CustomResource
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
        /// tag-based filter. String length must not exceed 2047 characters.
        /// </summary>
        [Output("filter")]
        public Output<string> Filter { get; private set; } = null!;

        /// <summary>
        /// The Folder param.
        /// </summary>
        [Output("folder")]
        public Output<string?> Folder { get; private set; } = null!;

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
        /// Tags for dynamic user group object. List must contain at most 64 elements. Individual elements in this list are subject to additional validation. String length must not exceed 127 characters.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<string>> Tags { get; private set; } = null!;

        [Output("tfid")]
        public Output<string> Tfid { get; private set; } = null!;


        /// <summary>
        /// Create a DynamicUserGroup resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DynamicUserGroup(string name, DynamicUserGroupArgs args, CustomResourceOptions? options = null)
            : base("scm:index/dynamicUserGroup:DynamicUserGroup", name, args ?? new DynamicUserGroupArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DynamicUserGroup(string name, Input<string> id, DynamicUserGroupState? state = null, CustomResourceOptions? options = null)
            : base("scm:index/dynamicUserGroup:DynamicUserGroup", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing DynamicUserGroup resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DynamicUserGroup Get(string name, Input<string> id, DynamicUserGroupState? state = null, CustomResourceOptions? options = null)
        {
            return new DynamicUserGroup(name, id, state, options);
        }
    }

    public sealed class DynamicUserGroupArgs : global::Pulumi.ResourceArgs
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
        /// tag-based filter. String length must not exceed 2047 characters.
        /// </summary>
        [Input("filter", required: true)]
        public Input<string> Filter { get; set; } = null!;

        /// <summary>
        /// The Folder param.
        /// </summary>
        [Input("folder")]
        public Input<string>? Folder { get; set; }

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
        /// Tags for dynamic user group object. List must contain at most 64 elements. Individual elements in this list are subject to additional validation. String length must not exceed 127 characters.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        public DynamicUserGroupArgs()
        {
        }
        public static new DynamicUserGroupArgs Empty => new DynamicUserGroupArgs();
    }

    public sealed class DynamicUserGroupState : global::Pulumi.ResourceArgs
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
        /// tag-based filter. String length must not exceed 2047 characters.
        /// </summary>
        [Input("filter")]
        public Input<string>? Filter { get; set; }

        /// <summary>
        /// The Folder param.
        /// </summary>
        [Input("folder")]
        public Input<string>? Folder { get; set; }

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
        /// Tags for dynamic user group object. List must contain at most 64 elements. Individual elements in this list are subject to additional validation. String length must not exceed 127 characters.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        [Input("tfid")]
        public Input<string>? Tfid { get; set; }

        public DynamicUserGroupState()
        {
        }
        public static new DynamicUserGroupState Empty => new DynamicUserGroupState();
    }
}