// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm
{
    public static class GetAuthenticationRule
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
        ///     var example = Scm.GetAuthenticationRule.Invoke(new()
        ///     {
        ///         Id = "1234-56-789",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetAuthenticationRuleResult> InvokeAsync(GetAuthenticationRuleArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAuthenticationRuleResult>("scm:index/getAuthenticationRule:getAuthenticationRule", args ?? new GetAuthenticationRuleArgs(), options.WithDefaults());

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
        ///     var example = Scm.GetAuthenticationRule.Invoke(new()
        ///     {
        ///         Id = "1234-56-789",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetAuthenticationRuleResult> Invoke(GetAuthenticationRuleInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAuthenticationRuleResult>("scm:index/getAuthenticationRule:getAuthenticationRule", args ?? new GetAuthenticationRuleInvokeArgs(), options.WithDefaults());

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
        ///     var example = Scm.GetAuthenticationRule.Invoke(new()
        ///     {
        ///         Id = "1234-56-789",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetAuthenticationRuleResult> Invoke(GetAuthenticationRuleInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetAuthenticationRuleResult>("scm:index/getAuthenticationRule:getAuthenticationRule", args ?? new GetAuthenticationRuleInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAuthenticationRuleArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Id param.
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        public GetAuthenticationRuleArgs()
        {
        }
        public static new GetAuthenticationRuleArgs Empty => new GetAuthenticationRuleArgs();
    }

    public sealed class GetAuthenticationRuleInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Id param.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public GetAuthenticationRuleInvokeArgs()
        {
        }
        public static new GetAuthenticationRuleInvokeArgs Empty => new GetAuthenticationRuleInvokeArgs();
    }


    [OutputType]
    public sealed class GetAuthenticationRuleResult
    {
        /// <summary>
        /// the authentication profile name to apply to authentication rule.
        /// </summary>
        public readonly string AuthenticationEnforcement;
        /// <summary>
        /// The Categories param.
        /// </summary>
        public readonly ImmutableArray<string> Categories;
        /// <summary>
        /// The Description param.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The DestinationHips param.
        /// </summary>
        public readonly ImmutableArray<string> DestinationHips;
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
        /// The HipProfiles param.
        /// </summary>
        public readonly ImmutableArray<string> HipProfiles;
        /// <summary>
        /// The Id param.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The LogAuthenticationTimeout param. Default: `false`.
        /// </summary>
        public readonly bool LogAuthenticationTimeout;
        /// <summary>
        /// The LogSetting param.
        /// </summary>
        public readonly string LogSetting;
        /// <summary>
        /// The Name param.
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
        /// The Services param.
        /// </summary>
        public readonly ImmutableArray<string> Services;
        /// <summary>
        /// The SourceHips param.
        /// </summary>
        public readonly ImmutableArray<string> SourceHips;
        /// <summary>
        /// The SourceUsers param.
        /// </summary>
        public readonly ImmutableArray<string> SourceUsers;
        /// <summary>
        /// The Sources param.
        /// </summary>
        public readonly ImmutableArray<string> Sources;
        /// <summary>
        /// The Tags param.
        /// </summary>
        public readonly ImmutableArray<string> Tags;
        public readonly string Tfid;
        /// <summary>
        /// The Timeout param. Value must be between 1 and 1440.
        /// </summary>
        public readonly int Timeout;
        /// <summary>
        /// The Tos param.
        /// </summary>
        public readonly ImmutableArray<string> Tos;

        [OutputConstructor]
        private GetAuthenticationRuleResult(
            string authenticationEnforcement,

            ImmutableArray<string> categories,

            string description,

            ImmutableArray<string> destinationHips,

            ImmutableArray<string> destinations,

            bool disabled,

            ImmutableArray<string> froms,

            string groupTag,

            ImmutableArray<string> hipProfiles,

            string id,

            bool logAuthenticationTimeout,

            string logSetting,

            string name,

            bool negateDestination,

            bool negateSource,

            ImmutableArray<string> services,

            ImmutableArray<string> sourceHips,

            ImmutableArray<string> sourceUsers,

            ImmutableArray<string> sources,

            ImmutableArray<string> tags,

            string tfid,

            int timeout,

            ImmutableArray<string> tos)
        {
            AuthenticationEnforcement = authenticationEnforcement;
            Categories = categories;
            Description = description;
            DestinationHips = destinationHips;
            Destinations = destinations;
            Disabled = disabled;
            Froms = froms;
            GroupTag = groupTag;
            HipProfiles = hipProfiles;
            Id = id;
            LogAuthenticationTimeout = logAuthenticationTimeout;
            LogSetting = logSetting;
            Name = name;
            NegateDestination = negateDestination;
            NegateSource = negateSource;
            Services = services;
            SourceHips = sourceHips;
            SourceUsers = sourceUsers;
            Sources = sources;
            Tags = tags;
            Tfid = tfid;
            Timeout = timeout;
            Tos = tos;
        }
    }
}
