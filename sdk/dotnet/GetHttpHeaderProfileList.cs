// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm
{
    public static class GetHttpHeaderProfileList
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
        ///     var example = Scm.GetHttpHeaderProfileList.Invoke(new()
        ///     {
        ///         Folder = "Shared",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetHttpHeaderProfileListResult> InvokeAsync(GetHttpHeaderProfileListArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetHttpHeaderProfileListResult>("scm:index/getHttpHeaderProfileList:getHttpHeaderProfileList", args ?? new GetHttpHeaderProfileListArgs(), options.WithDefaults());

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
        ///     var example = Scm.GetHttpHeaderProfileList.Invoke(new()
        ///     {
        ///         Folder = "Shared",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetHttpHeaderProfileListResult> Invoke(GetHttpHeaderProfileListInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetHttpHeaderProfileListResult>("scm:index/getHttpHeaderProfileList:getHttpHeaderProfileList", args ?? new GetHttpHeaderProfileListInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetHttpHeaderProfileListArgs : global::Pulumi.InvokeArgs
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

        public GetHttpHeaderProfileListArgs()
        {
        }
        public static new GetHttpHeaderProfileListArgs Empty => new GetHttpHeaderProfileListArgs();
    }

    public sealed class GetHttpHeaderProfileListInvokeArgs : global::Pulumi.InvokeArgs
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

        public GetHttpHeaderProfileListInvokeArgs()
        {
        }
        public static new GetHttpHeaderProfileListInvokeArgs Empty => new GetHttpHeaderProfileListInvokeArgs();
    }


    [OutputType]
    public sealed class GetHttpHeaderProfileListResult
    {
        /// <summary>
        /// The Data param.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetHttpHeaderProfileListDataResult> Datas;
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
        private GetHttpHeaderProfileListResult(
            ImmutableArray<Outputs.GetHttpHeaderProfileListDataResult> datas,

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
