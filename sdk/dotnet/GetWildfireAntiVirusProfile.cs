// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm
{
    public static class GetWildfireAntiVirusProfile
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
        ///     var example = Scm.GetWildfireAntiVirusProfile.Invoke(new()
        ///     {
        ///         Id = "1234-56-789",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetWildfireAntiVirusProfileResult> InvokeAsync(GetWildfireAntiVirusProfileArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetWildfireAntiVirusProfileResult>("scm:index/getWildfireAntiVirusProfile:getWildfireAntiVirusProfile", args ?? new GetWildfireAntiVirusProfileArgs(), options.WithDefaults());

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
        ///     var example = Scm.GetWildfireAntiVirusProfile.Invoke(new()
        ///     {
        ///         Id = "1234-56-789",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetWildfireAntiVirusProfileResult> Invoke(GetWildfireAntiVirusProfileInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetWildfireAntiVirusProfileResult>("scm:index/getWildfireAntiVirusProfile:getWildfireAntiVirusProfile", args ?? new GetWildfireAntiVirusProfileInvokeArgs(), options.WithDefaults());

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
        ///     var example = Scm.GetWildfireAntiVirusProfile.Invoke(new()
        ///     {
        ///         Id = "1234-56-789",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetWildfireAntiVirusProfileResult> Invoke(GetWildfireAntiVirusProfileInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetWildfireAntiVirusProfileResult>("scm:index/getWildfireAntiVirusProfile:getWildfireAntiVirusProfile", args ?? new GetWildfireAntiVirusProfileInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetWildfireAntiVirusProfileArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Id param.
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        public GetWildfireAntiVirusProfileArgs()
        {
        }
        public static new GetWildfireAntiVirusProfileArgs Empty => new GetWildfireAntiVirusProfileArgs();
    }

    public sealed class GetWildfireAntiVirusProfileInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Id param.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public GetWildfireAntiVirusProfileInvokeArgs()
        {
        }
        public static new GetWildfireAntiVirusProfileInvokeArgs Empty => new GetWildfireAntiVirusProfileInvokeArgs();
    }


    [OutputType]
    public sealed class GetWildfireAntiVirusProfileResult
    {
        /// <summary>
        /// The Description param.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The Id param.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The MlavExceptions param.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetWildfireAntiVirusProfileMlavExceptionResult> MlavExceptions;
        /// <summary>
        /// The Name param. String validation regex: `^[a-zA-Z0-9._-]+$`.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The PacketCapture param.
        /// </summary>
        public readonly bool PacketCapture;
        /// <summary>
        /// The Rules param.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetWildfireAntiVirusProfileRuleResult> Rules;
        public readonly string Tfid;
        /// <summary>
        /// The ThreatExceptions param.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetWildfireAntiVirusProfileThreatExceptionResult> ThreatExceptions;

        [OutputConstructor]
        private GetWildfireAntiVirusProfileResult(
            string description,

            string id,

            ImmutableArray<Outputs.GetWildfireAntiVirusProfileMlavExceptionResult> mlavExceptions,

            string name,

            bool packetCapture,

            ImmutableArray<Outputs.GetWildfireAntiVirusProfileRuleResult> rules,

            string tfid,

            ImmutableArray<Outputs.GetWildfireAntiVirusProfileThreatExceptionResult> threatExceptions)
        {
            Description = description;
            Id = id;
            MlavExceptions = mlavExceptions;
            Name = name;
            PacketCapture = packetCapture;
            Rules = rules;
            Tfid = tfid;
            ThreatExceptions = threatExceptions;
        }
    }
}
