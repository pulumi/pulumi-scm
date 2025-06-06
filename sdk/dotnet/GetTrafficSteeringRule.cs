// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm
{
    public static class GetTrafficSteeringRule
    {
        /// <summary>
        /// Retrieves a config item.
        /// </summary>
        public static Task<GetTrafficSteeringRuleResult> InvokeAsync(GetTrafficSteeringRuleArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetTrafficSteeringRuleResult>("scm:index/getTrafficSteeringRule:getTrafficSteeringRule", args ?? new GetTrafficSteeringRuleArgs(), options.WithDefaults());

        /// <summary>
        /// Retrieves a config item.
        /// </summary>
        public static Output<GetTrafficSteeringRuleResult> Invoke(GetTrafficSteeringRuleInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetTrafficSteeringRuleResult>("scm:index/getTrafficSteeringRule:getTrafficSteeringRule", args ?? new GetTrafficSteeringRuleInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Retrieves a config item.
        /// </summary>
        public static Output<GetTrafficSteeringRuleResult> Invoke(GetTrafficSteeringRuleInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetTrafficSteeringRuleResult>("scm:index/getTrafficSteeringRule:getTrafficSteeringRule", args ?? new GetTrafficSteeringRuleInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetTrafficSteeringRuleArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Id param.
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        public GetTrafficSteeringRuleArgs()
        {
        }
        public static new GetTrafficSteeringRuleArgs Empty => new GetTrafficSteeringRuleArgs();
    }

    public sealed class GetTrafficSteeringRuleInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Id param.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public GetTrafficSteeringRuleInvokeArgs()
        {
        }
        public static new GetTrafficSteeringRuleInvokeArgs Empty => new GetTrafficSteeringRuleInvokeArgs();
    }


    [OutputType]
    public sealed class GetTrafficSteeringRuleResult
    {
        /// <summary>
        /// The Action param.
        /// </summary>
        public readonly Outputs.GetTrafficSteeringRuleActionResult Action;
        /// <summary>
        /// The Category param.
        /// </summary>
        public readonly ImmutableArray<string> Categories;
        /// <summary>
        /// The Destination param.
        /// </summary>
        public readonly ImmutableArray<string> Destinations;
        /// <summary>
        /// The Id param.
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
        public readonly string Tfid;

        [OutputConstructor]
        private GetTrafficSteeringRuleResult(
            Outputs.GetTrafficSteeringRuleActionResult action,

            ImmutableArray<string> categories,

            ImmutableArray<string> destinations,

            string id,

            string name,

            ImmutableArray<string> services,

            ImmutableArray<string> sourceUsers,

            ImmutableArray<string> sources,

            string tfid)
        {
            Action = action;
            Categories = categories;
            Destinations = destinations;
            Id = id;
            Name = name;
            Services = services;
            SourceUsers = sourceUsers;
            Sources = sources;
            Tfid = tfid;
        }
    }
}
