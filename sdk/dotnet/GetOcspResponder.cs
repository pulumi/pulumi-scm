// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm
{
    public static class GetOcspResponder
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
        ///     var example = Scm.GetOcspResponder.Invoke(new()
        ///     {
        ///         Id = "1234-56-789",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetOcspResponderResult> InvokeAsync(GetOcspResponderArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetOcspResponderResult>("scm:index/getOcspResponder:getOcspResponder", args ?? new GetOcspResponderArgs(), options.WithDefaults());

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
        ///     var example = Scm.GetOcspResponder.Invoke(new()
        ///     {
        ///         Id = "1234-56-789",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetOcspResponderResult> Invoke(GetOcspResponderInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetOcspResponderResult>("scm:index/getOcspResponder:getOcspResponder", args ?? new GetOcspResponderInvokeArgs(), options.WithDefaults());

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
        ///     var example = Scm.GetOcspResponder.Invoke(new()
        ///     {
        ///         Id = "1234-56-789",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetOcspResponderResult> Invoke(GetOcspResponderInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetOcspResponderResult>("scm:index/getOcspResponder:getOcspResponder", args ?? new GetOcspResponderInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetOcspResponderArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Id param.
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        public GetOcspResponderArgs()
        {
        }
        public static new GetOcspResponderArgs Empty => new GetOcspResponderArgs();
    }

    public sealed class GetOcspResponderInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Id param.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public GetOcspResponderInvokeArgs()
        {
        }
        public static new GetOcspResponderInvokeArgs Empty => new GetOcspResponderInvokeArgs();
    }


    [OutputType]
    public sealed class GetOcspResponderResult
    {
        /// <summary>
        /// The HostName param. String length must be between 1 and 255 characters.
        /// </summary>
        public readonly string HostName;
        /// <summary>
        /// The Id param.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// alphanumeric string [:0-9a-zA-Z._-]. String length must not exceed 63 characters. String validation regex: `^[a-zA-Z0-9._-]+$`.
        /// </summary>
        public readonly string Name;
        public readonly string Tfid;

        [OutputConstructor]
        private GetOcspResponderResult(
            string hostName,

            string id,

            string name,

            string tfid)
        {
            HostName = hostName;
            Id = id;
            Name = name;
            Tfid = tfid;
        }
    }
}
