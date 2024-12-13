// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm
{
    public static class GetDecryptionProfile
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
        ///     var example = Scm.GetDecryptionProfile.Invoke(new()
        ///     {
        ///         Id = "1234-56-789",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetDecryptionProfileResult> InvokeAsync(GetDecryptionProfileArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDecryptionProfileResult>("scm:index/getDecryptionProfile:getDecryptionProfile", args ?? new GetDecryptionProfileArgs(), options.WithDefaults());

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
        ///     var example = Scm.GetDecryptionProfile.Invoke(new()
        ///     {
        ///         Id = "1234-56-789",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetDecryptionProfileResult> Invoke(GetDecryptionProfileInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDecryptionProfileResult>("scm:index/getDecryptionProfile:getDecryptionProfile", args ?? new GetDecryptionProfileInvokeArgs(), options.WithDefaults());

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
        ///     var example = Scm.GetDecryptionProfile.Invoke(new()
        ///     {
        ///         Id = "1234-56-789",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetDecryptionProfileResult> Invoke(GetDecryptionProfileInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetDecryptionProfileResult>("scm:index/getDecryptionProfile:getDecryptionProfile", args ?? new GetDecryptionProfileInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDecryptionProfileArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Id param.
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        public GetDecryptionProfileArgs()
        {
        }
        public static new GetDecryptionProfileArgs Empty => new GetDecryptionProfileArgs();
    }

    public sealed class GetDecryptionProfileInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Id param.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public GetDecryptionProfileInvokeArgs()
        {
        }
        public static new GetDecryptionProfileInvokeArgs Empty => new GetDecryptionProfileInvokeArgs();
    }


    [OutputType]
    public sealed class GetDecryptionProfileResult
    {
        /// <summary>
        /// The Id param.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Must start with alphanumeric char and should contain only alphanemeric, underscore, hyphen, dot or space. String validation regex: `^[A-Za-z0-9]{1}[A-Za-z0-9_\-\.\s]{0,}$`.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The SslForwardProxy param.
        /// </summary>
        public readonly Outputs.GetDecryptionProfileSslForwardProxyResult SslForwardProxy;
        /// <summary>
        /// The SslInboundProxy param.
        /// </summary>
        public readonly Outputs.GetDecryptionProfileSslInboundProxyResult SslInboundProxy;
        /// <summary>
        /// The SslNoProxy param.
        /// </summary>
        public readonly Outputs.GetDecryptionProfileSslNoProxyResult SslNoProxy;
        /// <summary>
        /// The SslProtocolSettings param.
        /// </summary>
        public readonly Outputs.GetDecryptionProfileSslProtocolSettingsResult SslProtocolSettings;
        public readonly string Tfid;

        [OutputConstructor]
        private GetDecryptionProfileResult(
            string id,

            string name,

            Outputs.GetDecryptionProfileSslForwardProxyResult sslForwardProxy,

            Outputs.GetDecryptionProfileSslInboundProxyResult sslInboundProxy,

            Outputs.GetDecryptionProfileSslNoProxyResult sslNoProxy,

            Outputs.GetDecryptionProfileSslProtocolSettingsResult sslProtocolSettings,

            string tfid)
        {
            Id = id;
            Name = name;
            SslForwardProxy = sslForwardProxy;
            SslInboundProxy = sslInboundProxy;
            SslNoProxy = sslNoProxy;
            SslProtocolSettings = sslProtocolSettings;
            Tfid = tfid;
        }
    }
}
