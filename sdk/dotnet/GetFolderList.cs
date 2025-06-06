// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm
{
    public static class GetFolderList
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
        ///     var example = Scm.GetFolderList.Invoke();
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetFolderListResult> InvokeAsync(GetFolderListArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetFolderListResult>("scm:index/getFolderList:getFolderList", args ?? new GetFolderListArgs(), options.WithDefaults());

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
        ///     var example = Scm.GetFolderList.Invoke();
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetFolderListResult> Invoke(GetFolderListInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetFolderListResult>("scm:index/getFolderList:getFolderList", args ?? new GetFolderListInvokeArgs(), options.WithDefaults());

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
        ///     var example = Scm.GetFolderList.Invoke();
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetFolderListResult> Invoke(GetFolderListInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetFolderListResult>("scm:index/getFolderList:getFolderList", args ?? new GetFolderListInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetFolderListArgs : global::Pulumi.InvokeArgs
    {
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

        public GetFolderListArgs()
        {
        }
        public static new GetFolderListArgs Empty => new GetFolderListArgs();
    }

    public sealed class GetFolderListInvokeArgs : global::Pulumi.InvokeArgs
    {
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

        public GetFolderListInvokeArgs()
        {
        }
        public static new GetFolderListInvokeArgs Empty => new GetFolderListInvokeArgs();
    }


    [OutputType]
    public sealed class GetFolderListResult
    {
        /// <summary>
        /// The Data param.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetFolderListDataResult> Datas;
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
        public readonly string Tfid;
        /// <summary>
        /// The Total param.
        /// </summary>
        public readonly int Total;

        [OutputConstructor]
        private GetFolderListResult(
            ImmutableArray<Outputs.GetFolderListDataResult> datas,

            string id,

            int limit,

            string? name,

            int offset,

            string tfid,

            int total)
        {
            Datas = datas;
            Id = id;
            Limit = limit;
            Name = name;
            Offset = offset;
            Tfid = tfid;
            Total = total;
        }
    }
}
