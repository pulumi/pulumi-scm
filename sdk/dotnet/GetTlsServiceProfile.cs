// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm
{
    public static class GetTlsServiceProfile
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
        ///     var example = Scm.GetTlsServiceProfile.Invoke(new()
        ///     {
        ///         Id = "1234-56-789",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetTlsServiceProfileResult> InvokeAsync(GetTlsServiceProfileArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetTlsServiceProfileResult>("scm:index/getTlsServiceProfile:getTlsServiceProfile", args ?? new GetTlsServiceProfileArgs(), options.WithDefaults());

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
        ///     var example = Scm.GetTlsServiceProfile.Invoke(new()
        ///     {
        ///         Id = "1234-56-789",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetTlsServiceProfileResult> Invoke(GetTlsServiceProfileInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetTlsServiceProfileResult>("scm:index/getTlsServiceProfile:getTlsServiceProfile", args ?? new GetTlsServiceProfileInvokeArgs(), options.WithDefaults());

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
        ///     var example = Scm.GetTlsServiceProfile.Invoke(new()
        ///     {
        ///         Id = "1234-56-789",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetTlsServiceProfileResult> Invoke(GetTlsServiceProfileInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetTlsServiceProfileResult>("scm:index/getTlsServiceProfile:getTlsServiceProfile", args ?? new GetTlsServiceProfileInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetTlsServiceProfileArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Id param.
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        public GetTlsServiceProfileArgs()
        {
        }
        public static new GetTlsServiceProfileArgs Empty => new GetTlsServiceProfileArgs();
    }

    public sealed class GetTlsServiceProfileInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Id param.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public GetTlsServiceProfileInvokeArgs()
        {
        }
        public static new GetTlsServiceProfileInvokeArgs Empty => new GetTlsServiceProfileInvokeArgs();
    }


    [OutputType]
    public sealed class GetTlsServiceProfileResult
    {
        /// <summary>
        /// SSL certificate file name. String length must not exceed 255 characters.
        /// </summary>
        public readonly string Certificate;
        /// <summary>
        /// The Id param.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// SSL TLS Service Profile name, value is muCustomDomainSSLProfile when it is used on mobile-agent infra settings. String length must not exceed 127 characters. String validation regex: `^[a-zA-Z0-9._-]+$`.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The ProtocolSettings param.
        /// </summary>
        public readonly Outputs.GetTlsServiceProfileProtocolSettingsResult ProtocolSettings;
        public readonly string Tfid;

        [OutputConstructor]
        private GetTlsServiceProfileResult(
            string certificate,

            string id,

            string name,

            Outputs.GetTlsServiceProfileProtocolSettingsResult protocolSettings,

            string tfid)
        {
            Certificate = certificate;
            Id = id;
            Name = name;
            ProtocolSettings = protocolSettings;
            Tfid = tfid;
        }
    }
}
