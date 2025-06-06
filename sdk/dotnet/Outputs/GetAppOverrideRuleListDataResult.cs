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
    public sealed class GetAppOverrideRuleListDataResult
    {
        /// <summary>
        /// The Application param.
        /// </summary>
        public readonly string Application;
        /// <summary>
        /// The Description param. String length must not exceed 1024 characters.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The Destinations param.
        /// </summary>
        public readonly ImmutableArray<string> Destinations;
        /// <summary>
        /// The Disabled param. Default: `false`.
        /// </summary>
        public readonly bool Disabled;
        /// <summary>
        /// The Froms param.
        /// </summary>
        public readonly ImmutableArray<string> Froms;
        /// <summary>
        /// The GroupTag param.
        /// </summary>
        public readonly string GroupTag;
        /// <summary>
        /// UUID of the resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The Name param. String length must not exceed 63 characters. String validation regex: `^[a-zA-Z0-9._-]+$`.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The NegateDestination param. Default: `false`.
        /// </summary>
        public readonly bool NegateDestination;
        /// <summary>
        /// The NegateSource param. Default: `false`.
        /// </summary>
        public readonly bool NegateSource;
        /// <summary>
        /// The Port param. Value must be between 0 and 65535.
        /// </summary>
        public readonly int Port;
        /// <summary>
        /// The Protocol param. String must be one of these: `"tcp"`, `"udp"`.
        /// </summary>
        public readonly string Protocol;
        /// <summary>
        /// The Sources param.
        /// </summary>
        public readonly ImmutableArray<string> Sources;
        /// <summary>
        /// The Tags param.
        /// </summary>
        public readonly ImmutableArray<string> Tags;
        /// <summary>
        /// The Tos param.
        /// </summary>
        public readonly ImmutableArray<string> Tos;

        [OutputConstructor]
        private GetAppOverrideRuleListDataResult(
            string application,

            string description,

            ImmutableArray<string> destinations,

            bool disabled,

            ImmutableArray<string> froms,

            string groupTag,

            string id,

            string name,

            bool negateDestination,

            bool negateSource,

            int port,

            string protocol,

            ImmutableArray<string> sources,

            ImmutableArray<string> tags,

            ImmutableArray<string> tos)
        {
            Application = application;
            Description = description;
            Destinations = destinations;
            Disabled = disabled;
            Froms = froms;
            GroupTag = groupTag;
            Id = id;
            Name = name;
            NegateDestination = negateDestination;
            NegateSource = negateSource;
            Port = port;
            Protocol = protocol;
            Sources = sources;
            Tags = tags;
            Tos = tos;
        }
    }
}
