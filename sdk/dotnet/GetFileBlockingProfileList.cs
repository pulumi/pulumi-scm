// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm
{
    public static class GetFileBlockingProfileList
    {
        /// <summary>
        /// Retrieves a listing of config items.
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
        ///     var example = Scm.GetFileBlockingProfileList.Invoke(new()
        ///     {
        ///         Folder = "Shared",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetFileBlockingProfileListResult> InvokeAsync(GetFileBlockingProfileListArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetFileBlockingProfileListResult>("scm:index/getFileBlockingProfileList:getFileBlockingProfileList", args ?? new GetFileBlockingProfileListArgs(), options.WithDefaults());

        /// <summary>
        /// Retrieves a listing of config items.
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
        ///     var example = Scm.GetFileBlockingProfileList.Invoke(new()
        ///     {
        ///         Folder = "Shared",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetFileBlockingProfileListResult> Invoke(GetFileBlockingProfileListInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetFileBlockingProfileListResult>("scm:index/getFileBlockingProfileList:getFileBlockingProfileList", args ?? new GetFileBlockingProfileListInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Retrieves a listing of config items.
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
        ///     var example = Scm.GetFileBlockingProfileList.Invoke(new()
        ///     {
        ///         Folder = "Shared",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetFileBlockingProfileListResult> Invoke(GetFileBlockingProfileListInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetFileBlockingProfileListResult>("scm:index/getFileBlockingProfileList:getFileBlockingProfileList", args ?? new GetFileBlockingProfileListInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetFileBlockingProfileListArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Device param.
        /// </summary>
        [Input("device")]
        public string? Device { get; set; }

        /// <summary>
        /// The Folder param.
        /// </summary>
        [Input("folder")]
        public string? Folder { get; set; }

        /// <summary>
        /// The Limit param. A limit of -1 will return all configured items. Default: `200`.
        /// </summary>
        [Input("limit")]
        public int? Limit { get; set; }

        /// <summary>
        /// The Name param.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        /// <summary>
        /// The Offset param. Default: `0`.
        /// </summary>
        [Input("offset")]
        public int? Offset { get; set; }

        /// <summary>
        /// The Snippet param.
        /// </summary>
        [Input("snippet")]
        public string? Snippet { get; set; }

        public GetFileBlockingProfileListArgs()
        {
        }
        public static new GetFileBlockingProfileListArgs Empty => new GetFileBlockingProfileListArgs();
    }

    public sealed class GetFileBlockingProfileListInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Device param.
        /// </summary>
        [Input("device")]
        public Input<string>? Device { get; set; }

        /// <summary>
        /// The Folder param.
        /// </summary>
        [Input("folder")]
        public Input<string>? Folder { get; set; }

        /// <summary>
        /// The Limit param. A limit of -1 will return all configured items. Default: `200`.
        /// </summary>
        [Input("limit")]
        public Input<int>? Limit { get; set; }

        /// <summary>
        /// The Name param.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The Offset param. Default: `0`.
        /// </summary>
        [Input("offset")]
        public Input<int>? Offset { get; set; }

        /// <summary>
        /// The Snippet param.
        /// </summary>
        [Input("snippet")]
        public Input<string>? Snippet { get; set; }

        public GetFileBlockingProfileListInvokeArgs()
        {
        }
        public static new GetFileBlockingProfileListInvokeArgs Empty => new GetFileBlockingProfileListInvokeArgs();
    }


    [OutputType]
    public sealed class GetFileBlockingProfileListResult
    {
        /// <summary>
        /// The Data param.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetFileBlockingProfileListDataResult> Datas;
        /// <summary>
        /// The Device param.
        /// </summary>
        public readonly string? Device;
        /// <summary>
        /// The Folder param.
        /// </summary>
        public readonly string? Folder;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The Limit param. A limit of -1 will return all configured items. Default: `200`.
        /// </summary>
        public readonly int Limit;
        /// <summary>
        /// The Name param.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// The Offset param. Default: `0`.
        /// </summary>
        public readonly int Offset;
        /// <summary>
        /// The Snippet param.
        /// </summary>
        public readonly string? Snippet;
        public readonly string Tfid;
        /// <summary>
        /// The Total param.
        /// </summary>
        public readonly int Total;

        [OutputConstructor]
        private GetFileBlockingProfileListResult(
            ImmutableArray<Outputs.GetFileBlockingProfileListDataResult> datas,

            string? device,

            string? folder,

            string id,

            int limit,

            string? name,

            int offset,

            string? snippet,

            string tfid,

            int total)
        {
            Datas = datas;
            Device = device;
            Folder = folder;
            Id = id;
            Limit = limit;
            Name = name;
            Offset = offset;
            Snippet = snippet;
            Tfid = tfid;
            Total = total;
        }
    }
}
