// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm
{
    public static class GetDecryptionExclusion
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
        ///     var example = Scm.GetDecryptionExclusion.Invoke(new()
        ///     {
        ///         Id = "1234-56-789",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetDecryptionExclusionResult> InvokeAsync(GetDecryptionExclusionArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDecryptionExclusionResult>("scm:index/getDecryptionExclusion:getDecryptionExclusion", args ?? new GetDecryptionExclusionArgs(), options.WithDefaults());

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
        ///     var example = Scm.GetDecryptionExclusion.Invoke(new()
        ///     {
        ///         Id = "1234-56-789",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetDecryptionExclusionResult> Invoke(GetDecryptionExclusionInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDecryptionExclusionResult>("scm:index/getDecryptionExclusion:getDecryptionExclusion", args ?? new GetDecryptionExclusionInvokeArgs(), options.WithDefaults());

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
        ///     var example = Scm.GetDecryptionExclusion.Invoke(new()
        ///     {
        ///         Id = "1234-56-789",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetDecryptionExclusionResult> Invoke(GetDecryptionExclusionInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetDecryptionExclusionResult>("scm:index/getDecryptionExclusion:getDecryptionExclusion", args ?? new GetDecryptionExclusionInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDecryptionExclusionArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Id param.
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        public GetDecryptionExclusionArgs()
        {
        }
        public static new GetDecryptionExclusionArgs Empty => new GetDecryptionExclusionArgs();
    }

    public sealed class GetDecryptionExclusionInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Id param.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public GetDecryptionExclusionInvokeArgs()
        {
        }
        public static new GetDecryptionExclusionInvokeArgs Empty => new GetDecryptionExclusionInvokeArgs();
    }


    [OutputType]
    public sealed class GetDecryptionExclusionResult
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
        /// The Name param.
        /// </summary>
        public readonly string Name;
        public readonly string Tfid;

        [OutputConstructor]
        private GetDecryptionExclusionResult(
            string description,

            string id,

            string name,

            string tfid)
        {
            Description = description;
            Id = id;
            Name = name;
            Tfid = tfid;
        }
    }
}
