// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm
{
    public static class GetTacacsServerProfile
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
        ///     var example = Scm.GetTacacsServerProfile.Invoke(new()
        ///     {
        ///         Id = "1234-56-789",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetTacacsServerProfileResult> InvokeAsync(GetTacacsServerProfileArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetTacacsServerProfileResult>("scm:index/getTacacsServerProfile:getTacacsServerProfile", args ?? new GetTacacsServerProfileArgs(), options.WithDefaults());

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
        ///     var example = Scm.GetTacacsServerProfile.Invoke(new()
        ///     {
        ///         Id = "1234-56-789",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetTacacsServerProfileResult> Invoke(GetTacacsServerProfileInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetTacacsServerProfileResult>("scm:index/getTacacsServerProfile:getTacacsServerProfile", args ?? new GetTacacsServerProfileInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetTacacsServerProfileArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Id param.
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        public GetTacacsServerProfileArgs()
        {
        }
        public static new GetTacacsServerProfileArgs Empty => new GetTacacsServerProfileArgs();
    }

    public sealed class GetTacacsServerProfileInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Id param.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public GetTacacsServerProfileInvokeArgs()
        {
        }
        public static new GetTacacsServerProfileInvokeArgs Empty => new GetTacacsServerProfileInvokeArgs();
    }


    [OutputType]
    public sealed class GetTacacsServerProfileResult
    {
        /// <summary>
        /// The Id param.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The Protocol param. String must be one of these: `"CHAP"`, `"PAP"`.
        /// </summary>
        public readonly string Protocol;
        /// <summary>
        /// The Servers param.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetTacacsServerProfileServerResult> Servers;
        public readonly string Tfid;
        /// <summary>
        /// The Timeout param. Value must be between 1 and 30.
        /// </summary>
        public readonly int Timeout;
        /// <summary>
        /// The UseSingleConnection param.
        /// </summary>
        public readonly bool UseSingleConnection;

        [OutputConstructor]
        private GetTacacsServerProfileResult(
            string id,

            string protocol,

            ImmutableArray<Outputs.GetTacacsServerProfileServerResult> servers,

            string tfid,

            int timeout,

            bool useSingleConnection)
        {
            Id = id;
            Protocol = protocol;
            Servers = servers;
            Tfid = tfid;
            Timeout = timeout;
            UseSingleConnection = useSingleConnection;
        }
    }
}