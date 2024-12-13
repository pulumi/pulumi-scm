// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm
{
    public static class GetRadiusServerProfile
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
        ///     var example = Scm.GetRadiusServerProfile.Invoke(new()
        ///     {
        ///         Id = "1234-56-789",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetRadiusServerProfileResult> InvokeAsync(GetRadiusServerProfileArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetRadiusServerProfileResult>("scm:index/getRadiusServerProfile:getRadiusServerProfile", args ?? new GetRadiusServerProfileArgs(), options.WithDefaults());

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
        ///     var example = Scm.GetRadiusServerProfile.Invoke(new()
        ///     {
        ///         Id = "1234-56-789",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetRadiusServerProfileResult> Invoke(GetRadiusServerProfileInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetRadiusServerProfileResult>("scm:index/getRadiusServerProfile:getRadiusServerProfile", args ?? new GetRadiusServerProfileInvokeArgs(), options.WithDefaults());

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
        ///     var example = Scm.GetRadiusServerProfile.Invoke(new()
        ///     {
        ///         Id = "1234-56-789",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetRadiusServerProfileResult> Invoke(GetRadiusServerProfileInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetRadiusServerProfileResult>("scm:index/getRadiusServerProfile:getRadiusServerProfile", args ?? new GetRadiusServerProfileInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetRadiusServerProfileArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Id param.
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        public GetRadiusServerProfileArgs()
        {
        }
        public static new GetRadiusServerProfileArgs Empty => new GetRadiusServerProfileArgs();
    }

    public sealed class GetRadiusServerProfileInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Id param.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public GetRadiusServerProfileInvokeArgs()
        {
        }
        public static new GetRadiusServerProfileInvokeArgs Empty => new GetRadiusServerProfileInvokeArgs();
    }


    [OutputType]
    public sealed class GetRadiusServerProfileResult
    {
        /// <summary>
        /// The Id param.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The Protocol param.
        /// </summary>
        public readonly Outputs.GetRadiusServerProfileProtocolResult Protocol;
        /// <summary>
        /// The Retries param. Value must be between 1 and 5.
        /// </summary>
        public readonly int Retries;
        /// <summary>
        /// The Servers param.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetRadiusServerProfileServerResult> Servers;
        public readonly string Tfid;
        /// <summary>
        /// The Timeout param. Value must be between 1 and 120.
        /// </summary>
        public readonly int Timeout;

        [OutputConstructor]
        private GetRadiusServerProfileResult(
            string id,

            Outputs.GetRadiusServerProfileProtocolResult protocol,

            int retries,

            ImmutableArray<Outputs.GetRadiusServerProfileServerResult> servers,

            string tfid,

            int timeout)
        {
            Id = id;
            Protocol = protocol;
            Retries = retries;
            Servers = servers;
            Tfid = tfid;
            Timeout = timeout;
        }
    }
}
