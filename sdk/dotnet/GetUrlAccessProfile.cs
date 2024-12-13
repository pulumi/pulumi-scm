// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm
{
    public static class GetUrlAccessProfile
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
        ///     var example = Scm.GetUrlAccessProfile.Invoke(new()
        ///     {
        ///         Id = "1234-56-789",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetUrlAccessProfileResult> InvokeAsync(GetUrlAccessProfileArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetUrlAccessProfileResult>("scm:index/getUrlAccessProfile:getUrlAccessProfile", args ?? new GetUrlAccessProfileArgs(), options.WithDefaults());

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
        ///     var example = Scm.GetUrlAccessProfile.Invoke(new()
        ///     {
        ///         Id = "1234-56-789",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetUrlAccessProfileResult> Invoke(GetUrlAccessProfileInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetUrlAccessProfileResult>("scm:index/getUrlAccessProfile:getUrlAccessProfile", args ?? new GetUrlAccessProfileInvokeArgs(), options.WithDefaults());

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
        ///     var example = Scm.GetUrlAccessProfile.Invoke(new()
        ///     {
        ///         Id = "1234-56-789",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetUrlAccessProfileResult> Invoke(GetUrlAccessProfileInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetUrlAccessProfileResult>("scm:index/getUrlAccessProfile:getUrlAccessProfile", args ?? new GetUrlAccessProfileInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetUrlAccessProfileArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Id param.
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        public GetUrlAccessProfileArgs()
        {
        }
        public static new GetUrlAccessProfileArgs Empty => new GetUrlAccessProfileArgs();
    }

    public sealed class GetUrlAccessProfileInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Id param.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public GetUrlAccessProfileInvokeArgs()
        {
        }
        public static new GetUrlAccessProfileInvokeArgs Empty => new GetUrlAccessProfileInvokeArgs();
    }


    [OutputType]
    public sealed class GetUrlAccessProfileResult
    {
        /// <summary>
        /// The Alerts param.
        /// </summary>
        public readonly ImmutableArray<string> Alerts;
        /// <summary>
        /// The Allows param.
        /// </summary>
        public readonly ImmutableArray<string> Allows;
        /// <summary>
        /// The Blocks param.
        /// </summary>
        public readonly ImmutableArray<string> Blocks;
        /// <summary>
        /// The CloudInlineCat param.
        /// </summary>
        public readonly bool CloudInlineCat;
        /// <summary>
        /// The Continues param.
        /// </summary>
        public readonly ImmutableArray<string> Continues;
        /// <summary>
        /// The CredentialEnforcement param.
        /// </summary>
        public readonly Outputs.GetUrlAccessProfileCredentialEnforcementResult CredentialEnforcement;
        /// <summary>
        /// The Description param. String length must not exceed 255 characters.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The Id param.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The LocalInlineCat param.
        /// </summary>
        public readonly bool LocalInlineCat;
        /// <summary>
        /// The LogContainerPageOnly param. Default: `true`.
        /// </summary>
        public readonly bool LogContainerPageOnly;
        /// <summary>
        /// The LogHttpHdrReferer param. Default: `false`.
        /// </summary>
        public readonly bool LogHttpHdrReferer;
        /// <summary>
        /// The LogHttpHdrUserAgent param. Default: `false`.
        /// </summary>
        public readonly bool LogHttpHdrUserAgent;
        /// <summary>
        /// The LogHttpHdrXff param. Default: `false`.
        /// </summary>
        public readonly bool LogHttpHdrXff;
        /// <summary>
        /// The MlavCategoryExceptions param.
        /// </summary>
        public readonly ImmutableArray<string> MlavCategoryExceptions;
        /// <summary>
        /// The Name param.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The SafeSearchEnforcement param. Default: `false`.
        /// </summary>
        public readonly bool SafeSearchEnforcement;
        public readonly string Tfid;

        [OutputConstructor]
        private GetUrlAccessProfileResult(
            ImmutableArray<string> alerts,

            ImmutableArray<string> allows,

            ImmutableArray<string> blocks,

            bool cloudInlineCat,

            ImmutableArray<string> continues,

            Outputs.GetUrlAccessProfileCredentialEnforcementResult credentialEnforcement,

            string description,

            string id,

            bool localInlineCat,

            bool logContainerPageOnly,

            bool logHttpHdrReferer,

            bool logHttpHdrUserAgent,

            bool logHttpHdrXff,

            ImmutableArray<string> mlavCategoryExceptions,

            string name,

            bool safeSearchEnforcement,

            string tfid)
        {
            Alerts = alerts;
            Allows = allows;
            Blocks = blocks;
            CloudInlineCat = cloudInlineCat;
            Continues = continues;
            CredentialEnforcement = credentialEnforcement;
            Description = description;
            Id = id;
            LocalInlineCat = localInlineCat;
            LogContainerPageOnly = logContainerPageOnly;
            LogHttpHdrReferer = logHttpHdrReferer;
            LogHttpHdrUserAgent = logHttpHdrUserAgent;
            LogHttpHdrXff = logHttpHdrXff;
            MlavCategoryExceptions = mlavCategoryExceptions;
            Name = name;
            SafeSearchEnforcement = safeSearchEnforcement;
            Tfid = tfid;
        }
    }
}
