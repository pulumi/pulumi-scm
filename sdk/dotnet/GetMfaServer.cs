// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm
{
    public static class GetMfaServer
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
        ///     var example = Scm.GetMfaServer.Invoke(new()
        ///     {
        ///         Id = "1234-56-789",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetMfaServerResult> InvokeAsync(GetMfaServerArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetMfaServerResult>("scm:index/getMfaServer:getMfaServer", args ?? new GetMfaServerArgs(), options.WithDefaults());

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
        ///     var example = Scm.GetMfaServer.Invoke(new()
        ///     {
        ///         Id = "1234-56-789",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetMfaServerResult> Invoke(GetMfaServerInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetMfaServerResult>("scm:index/getMfaServer:getMfaServer", args ?? new GetMfaServerInvokeArgs(), options.WithDefaults());

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
        ///     var example = Scm.GetMfaServer.Invoke(new()
        ///     {
        ///         Id = "1234-56-789",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetMfaServerResult> Invoke(GetMfaServerInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetMfaServerResult>("scm:index/getMfaServer:getMfaServer", args ?? new GetMfaServerInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetMfaServerArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Id param.
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        public GetMfaServerArgs()
        {
        }
        public static new GetMfaServerArgs Empty => new GetMfaServerArgs();
    }

    public sealed class GetMfaServerInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Id param.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public GetMfaServerInvokeArgs()
        {
        }
        public static new GetMfaServerInvokeArgs Empty => new GetMfaServerInvokeArgs();
    }


    [OutputType]
    public sealed class GetMfaServerResult
    {
        /// <summary>
        /// The Id param.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The MfaCertProfile param.
        /// </summary>
        public readonly string MfaCertProfile;
        /// <summary>
        /// The MfaVendorType param.
        /// </summary>
        public readonly Outputs.GetMfaServerMfaVendorTypeResult MfaVendorType;
        /// <summary>
        /// The Name param.
        /// </summary>
        public readonly string Name;
        public readonly string Tfid;

        [OutputConstructor]
        private GetMfaServerResult(
            string id,

            string mfaCertProfile,

            Outputs.GetMfaServerMfaVendorTypeResult mfaVendorType,

            string name,

            string tfid)
        {
            Id = id;
            MfaCertProfile = mfaCertProfile;
            MfaVendorType = mfaVendorType;
            Name = name;
            Tfid = tfid;
        }
    }
}
