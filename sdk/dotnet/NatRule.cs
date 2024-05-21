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
    /// </summary>
    [ScmResourceType("scm:index/natRule:NatRule")]
    public partial class NatRule : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ActiveActiveDeviceBinding param. String must be one of these: `"primary"`, `"both"`, `"0"`, `"1"`.
        /// </summary>
        [Output("activeActiveDeviceBinding")]
        public Output<string?> ActiveActiveDeviceBinding { get; private set; } = null!;

        /// <summary>
        /// The Description param.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Static destination translation parameter.
        /// </summary>
        [Output("destinationTranslation")]
        public Output<Outputs.NatRuleDestinationTranslation?> DestinationTranslation { get; private set; } = null!;

        /// <summary>
        /// The destination address(es). Individual elements in this list are subject to additional validation. String must be one of these: `"any"`.
        /// </summary>
        [Output("destinations")]
        public Output<ImmutableArray<string>> Destinations { get; private set; } = null!;

        /// <summary>
        /// The device in which the resource is defined. String length must not exceed 64 characters. String validation regex: `^[a-zA-Z\d-_\. ]+$`.
        /// </summary>
        [Output("device")]
        public Output<string?> Device { get; private set; } = null!;

        /// <summary>
        /// The Disabled param.
        /// </summary>
        [Output("disabled")]
        public Output<bool?> Disabled { get; private set; } = null!;

        /// <summary>
        /// Dynamic destination translation parameter.
        /// </summary>
        [Output("dynamicDestinationTranslation")]
        public Output<Outputs.NatRuleDynamicDestinationTranslation?> DynamicDestinationTranslation { get; private set; } = null!;

        /// <summary>
        /// The folder in which the resource is defined. String length must not exceed 64 characters. String validation regex: `^[a-zA-Z\d-_\. ]+$`.
        /// </summary>
        [Output("folder")]
        public Output<string?> Folder { get; private set; } = null!;

        /// <summary>
        /// The source security zone(s). Individual elements in this list are subject to additional validation. String must be one of these: `"any"`.
        /// </summary>
        [Output("froms")]
        public Output<ImmutableArray<string>> Froms { get; private set; } = null!;

        /// <summary>
        /// The GroupTag param.
        /// </summary>
        [Output("groupTag")]
        public Output<string?> GroupTag { get; private set; } = null!;

        /// <summary>
        /// The Name param.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The NatType param. String must be one of these: `"ipv4"`, `"nat64"`, `"nptv6"`.
        /// </summary>
        [Output("natType")]
        public Output<string?> NatType { get; private set; } = null!;

        /// <summary>
        /// The Position param. String must be one of these: `"pre"`, `"post"`. Default: `"pre"`.
        /// </summary>
        [Output("position")]
        public Output<string> Position { get; private set; } = null!;

        /// <summary>
        /// The Service param.
        /// </summary>
        [Output("service")]
        public Output<string> Service { get; private set; } = null!;

        /// <summary>
        /// The snippet in which the resource is defined. String length must not exceed 64 characters. String validation regex: `^[a-zA-Z\d-_\. ]+$`.
        /// </summary>
        [Output("snippet")]
        public Output<string?> Snippet { get; private set; } = null!;

        /// <summary>
        /// The SourceTranslation param.
        /// </summary>
        [Output("sourceTranslation")]
        public Output<Outputs.NatRuleSourceTranslation?> SourceTranslation { get; private set; } = null!;

        /// <summary>
        /// The source address(es). Individual elements in this list are subject to additional validation. String must be one of these: `"any"`.
        /// </summary>
        [Output("sources")]
        public Output<ImmutableArray<string>> Sources { get; private set; } = null!;

        /// <summary>
        /// The Tags param.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<string>> Tags { get; private set; } = null!;

        /// <summary>
        /// The Target param.
        /// </summary>
        [Output("target")]
        public Output<Outputs.NatRuleTarget?> Target { get; private set; } = null!;

        [Output("tfid")]
        public Output<string> Tfid { get; private set; } = null!;

        /// <summary>
        /// The ToInterface param. String must be one of these: `"any"`.
        /// </summary>
        [Output("toInterface")]
        public Output<string?> ToInterface { get; private set; } = null!;

        /// <summary>
        /// The destination security zone(s).
        /// </summary>
        [Output("tos")]
        public Output<ImmutableArray<string>> Tos { get; private set; } = null!;


        /// <summary>
        /// Create a NatRule resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public NatRule(string name, NatRuleArgs args, CustomResourceOptions? options = null)
            : base("scm:index/natRule:NatRule", name, args ?? new NatRuleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private NatRule(string name, Input<string> id, NatRuleState? state = null, CustomResourceOptions? options = null)
            : base("scm:index/natRule:NatRule", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing NatRule resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static NatRule Get(string name, Input<string> id, NatRuleState? state = null, CustomResourceOptions? options = null)
        {
            return new NatRule(name, id, state, options);
        }
    }

    public sealed class NatRuleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ActiveActiveDeviceBinding param. String must be one of these: `"primary"`, `"both"`, `"0"`, `"1"`.
        /// </summary>
        [Input("activeActiveDeviceBinding")]
        public Input<string>? ActiveActiveDeviceBinding { get; set; }

        /// <summary>
        /// The Description param.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Static destination translation parameter.
        /// </summary>
        [Input("destinationTranslation")]
        public Input<Inputs.NatRuleDestinationTranslationArgs>? DestinationTranslation { get; set; }

        [Input("destinations", required: true)]
        private InputList<string>? _destinations;

        /// <summary>
        /// The destination address(es). Individual elements in this list are subject to additional validation. String must be one of these: `"any"`.
        /// </summary>
        public InputList<string> Destinations
        {
            get => _destinations ?? (_destinations = new InputList<string>());
            set => _destinations = value;
        }

        /// <summary>
        /// The device in which the resource is defined. String length must not exceed 64 characters. String validation regex: `^[a-zA-Z\d-_\. ]+$`.
        /// </summary>
        [Input("device")]
        public Input<string>? Device { get; set; }

        /// <summary>
        /// The Disabled param.
        /// </summary>
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        /// <summary>
        /// Dynamic destination translation parameter.
        /// </summary>
        [Input("dynamicDestinationTranslation")]
        public Input<Inputs.NatRuleDynamicDestinationTranslationArgs>? DynamicDestinationTranslation { get; set; }

        /// <summary>
        /// The folder in which the resource is defined. String length must not exceed 64 characters. String validation regex: `^[a-zA-Z\d-_\. ]+$`.
        /// </summary>
        [Input("folder")]
        public Input<string>? Folder { get; set; }

        [Input("froms", required: true)]
        private InputList<string>? _froms;

        /// <summary>
        /// The source security zone(s). Individual elements in this list are subject to additional validation. String must be one of these: `"any"`.
        /// </summary>
        public InputList<string> Froms
        {
            get => _froms ?? (_froms = new InputList<string>());
            set => _froms = value;
        }

        /// <summary>
        /// The GroupTag param.
        /// </summary>
        [Input("groupTag")]
        public Input<string>? GroupTag { get; set; }

        /// <summary>
        /// The Name param.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The NatType param. String must be one of these: `"ipv4"`, `"nat64"`, `"nptv6"`.
        /// </summary>
        [Input("natType")]
        public Input<string>? NatType { get; set; }

        /// <summary>
        /// The Position param. String must be one of these: `"pre"`, `"post"`. Default: `"pre"`.
        /// </summary>
        [Input("position")]
        public Input<string>? Position { get; set; }

        /// <summary>
        /// The Service param.
        /// </summary>
        [Input("service", required: true)]
        public Input<string> Service { get; set; } = null!;

        /// <summary>
        /// The snippet in which the resource is defined. String length must not exceed 64 characters. String validation regex: `^[a-zA-Z\d-_\. ]+$`.
        /// </summary>
        [Input("snippet")]
        public Input<string>? Snippet { get; set; }

        /// <summary>
        /// The SourceTranslation param.
        /// </summary>
        [Input("sourceTranslation")]
        public Input<Inputs.NatRuleSourceTranslationArgs>? SourceTranslation { get; set; }

        [Input("sources", required: true)]
        private InputList<string>? _sources;

        /// <summary>
        /// The source address(es). Individual elements in this list are subject to additional validation. String must be one of these: `"any"`.
        /// </summary>
        public InputList<string> Sources
        {
            get => _sources ?? (_sources = new InputList<string>());
            set => _sources = value;
        }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// The Tags param.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The Target param.
        /// </summary>
        [Input("target")]
        public Input<Inputs.NatRuleTargetArgs>? Target { get; set; }

        /// <summary>
        /// The ToInterface param. String must be one of these: `"any"`.
        /// </summary>
        [Input("toInterface")]
        public Input<string>? ToInterface { get; set; }

        [Input("tos", required: true)]
        private InputList<string>? _tos;

        /// <summary>
        /// The destination security zone(s).
        /// </summary>
        public InputList<string> Tos
        {
            get => _tos ?? (_tos = new InputList<string>());
            set => _tos = value;
        }

        public NatRuleArgs()
        {
        }
        public static new NatRuleArgs Empty => new NatRuleArgs();
    }

    public sealed class NatRuleState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ActiveActiveDeviceBinding param. String must be one of these: `"primary"`, `"both"`, `"0"`, `"1"`.
        /// </summary>
        [Input("activeActiveDeviceBinding")]
        public Input<string>? ActiveActiveDeviceBinding { get; set; }

        /// <summary>
        /// The Description param.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Static destination translation parameter.
        /// </summary>
        [Input("destinationTranslation")]
        public Input<Inputs.NatRuleDestinationTranslationGetArgs>? DestinationTranslation { get; set; }

        [Input("destinations")]
        private InputList<string>? _destinations;

        /// <summary>
        /// The destination address(es). Individual elements in this list are subject to additional validation. String must be one of these: `"any"`.
        /// </summary>
        public InputList<string> Destinations
        {
            get => _destinations ?? (_destinations = new InputList<string>());
            set => _destinations = value;
        }

        /// <summary>
        /// The device in which the resource is defined. String length must not exceed 64 characters. String validation regex: `^[a-zA-Z\d-_\. ]+$`.
        /// </summary>
        [Input("device")]
        public Input<string>? Device { get; set; }

        /// <summary>
        /// The Disabled param.
        /// </summary>
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        /// <summary>
        /// Dynamic destination translation parameter.
        /// </summary>
        [Input("dynamicDestinationTranslation")]
        public Input<Inputs.NatRuleDynamicDestinationTranslationGetArgs>? DynamicDestinationTranslation { get; set; }

        /// <summary>
        /// The folder in which the resource is defined. String length must not exceed 64 characters. String validation regex: `^[a-zA-Z\d-_\. ]+$`.
        /// </summary>
        [Input("folder")]
        public Input<string>? Folder { get; set; }

        [Input("froms")]
        private InputList<string>? _froms;

        /// <summary>
        /// The source security zone(s). Individual elements in this list are subject to additional validation. String must be one of these: `"any"`.
        /// </summary>
        public InputList<string> Froms
        {
            get => _froms ?? (_froms = new InputList<string>());
            set => _froms = value;
        }

        /// <summary>
        /// The GroupTag param.
        /// </summary>
        [Input("groupTag")]
        public Input<string>? GroupTag { get; set; }

        /// <summary>
        /// The Name param.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The NatType param. String must be one of these: `"ipv4"`, `"nat64"`, `"nptv6"`.
        /// </summary>
        [Input("natType")]
        public Input<string>? NatType { get; set; }

        /// <summary>
        /// The Position param. String must be one of these: `"pre"`, `"post"`. Default: `"pre"`.
        /// </summary>
        [Input("position")]
        public Input<string>? Position { get; set; }

        /// <summary>
        /// The Service param.
        /// </summary>
        [Input("service")]
        public Input<string>? Service { get; set; }

        /// <summary>
        /// The snippet in which the resource is defined. String length must not exceed 64 characters. String validation regex: `^[a-zA-Z\d-_\. ]+$`.
        /// </summary>
        [Input("snippet")]
        public Input<string>? Snippet { get; set; }

        /// <summary>
        /// The SourceTranslation param.
        /// </summary>
        [Input("sourceTranslation")]
        public Input<Inputs.NatRuleSourceTranslationGetArgs>? SourceTranslation { get; set; }

        [Input("sources")]
        private InputList<string>? _sources;

        /// <summary>
        /// The source address(es). Individual elements in this list are subject to additional validation. String must be one of these: `"any"`.
        /// </summary>
        public InputList<string> Sources
        {
            get => _sources ?? (_sources = new InputList<string>());
            set => _sources = value;
        }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// The Tags param.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The Target param.
        /// </summary>
        [Input("target")]
        public Input<Inputs.NatRuleTargetGetArgs>? Target { get; set; }

        [Input("tfid")]
        public Input<string>? Tfid { get; set; }

        /// <summary>
        /// The ToInterface param. String must be one of these: `"any"`.
        /// </summary>
        [Input("toInterface")]
        public Input<string>? ToInterface { get; set; }

        [Input("tos")]
        private InputList<string>? _tos;

        /// <summary>
        /// The destination security zone(s).
        /// </summary>
        public InputList<string> Tos
        {
            get => _tos ?? (_tos = new InputList<string>());
            set => _tos = value;
        }

        public NatRuleState()
        {
        }
        public static new NatRuleState Empty => new NatRuleState();
    }
}
