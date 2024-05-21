// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm
{
    public static class GetAuthenticationSequence
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
        ///     var example = Scm.GetAuthenticationSequence.Invoke(new()
        ///     {
        ///         Id = "1234-56-789",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetAuthenticationSequenceResult> InvokeAsync(GetAuthenticationSequenceArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAuthenticationSequenceResult>("scm:index/getAuthenticationSequence:getAuthenticationSequence", args ?? new GetAuthenticationSequenceArgs(), options.WithDefaults());

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
        ///     var example = Scm.GetAuthenticationSequence.Invoke(new()
        ///     {
        ///         Id = "1234-56-789",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetAuthenticationSequenceResult> Invoke(GetAuthenticationSequenceInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAuthenticationSequenceResult>("scm:index/getAuthenticationSequence:getAuthenticationSequence", args ?? new GetAuthenticationSequenceInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAuthenticationSequenceArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Id param.
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        public GetAuthenticationSequenceArgs()
        {
        }
        public static new GetAuthenticationSequenceArgs Empty => new GetAuthenticationSequenceArgs();
    }

    public sealed class GetAuthenticationSequenceInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Id param.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public GetAuthenticationSequenceInvokeArgs()
        {
        }
        public static new GetAuthenticationSequenceInvokeArgs Empty => new GetAuthenticationSequenceInvokeArgs();
    }


    [OutputType]
    public sealed class GetAuthenticationSequenceResult
    {
        /// <summary>
        /// The AuthenticationProfiles param.
        /// </summary>
        public readonly ImmutableArray<string> AuthenticationProfiles;
        /// <summary>
        /// The Id param.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The Name param.
        /// </summary>
        public readonly string Name;
        public readonly string Tfid;
        /// <summary>
        /// The UseDomainFindProfile param. Default: `true`.
        /// </summary>
        public readonly bool UseDomainFindProfile;

        [OutputConstructor]
        private GetAuthenticationSequenceResult(
            ImmutableArray<string> authenticationProfiles,

            string id,

            string name,

            string tfid,

            bool useDomainFindProfile)
        {
            AuthenticationProfiles = authenticationProfiles;
            Id = id;
            Name = name;
            Tfid = tfid;
            UseDomainFindProfile = useDomainFindProfile;
        }
    }
}
