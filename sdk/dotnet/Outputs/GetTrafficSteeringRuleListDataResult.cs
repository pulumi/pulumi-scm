// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Outputs
{

    [OutputType]
    public sealed class GetTrafficSteeringRuleListDataResult
    {
        /// <summary>
        /// The Action param.
        /// </summary>
        public readonly Outputs.GetTrafficSteeringRuleListDataActionResult Action;
        /// <summary>
        /// The Category param.
        /// </summary>
        public readonly ImmutableArray<string> Categories;
        /// <summary>
        /// The Destination param.
        /// </summary>
        public readonly ImmutableArray<string> Destinations;
        /// <summary>
        /// UUID of the resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The Name param.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The Service param.
        /// </summary>
        public readonly ImmutableArray<string> Services;
        /// <summary>
        /// The SourceUser param.
        /// </summary>
        public readonly ImmutableArray<string> SourceUsers;
        /// <summary>
        /// The Source param.
        /// </summary>
        public readonly ImmutableArray<string> Sources;

        [OutputConstructor]
        private GetTrafficSteeringRuleListDataResult(
            Outputs.GetTrafficSteeringRuleListDataActionResult action,

            ImmutableArray<string> categories,

            ImmutableArray<string> destinations,

            string id,

            string name,

            ImmutableArray<string> services,

            ImmutableArray<string> sourceUsers,

            ImmutableArray<string> sources)
        {
            Action = action;
            Categories = categories;
            Destinations = destinations;
            Id = id;
            Name = name;
            Services = services;
            SourceUsers = sourceUsers;
            Sources = sources;
        }
    }
}