// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm
{
    public static class GetIkeGatewayList
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
        ///     var example = Scm.GetIkeGatewayList.Invoke(new()
        ///     {
        ///         Folder = "Remote Networks",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetIkeGatewayListResult> InvokeAsync(GetIkeGatewayListArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetIkeGatewayListResult>("scm:index/getIkeGatewayList:getIkeGatewayList", args ?? new GetIkeGatewayListArgs(), options.WithDefaults());

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
        ///     var example = Scm.GetIkeGatewayList.Invoke(new()
        ///     {
        ///         Folder = "Remote Networks",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetIkeGatewayListResult> Invoke(GetIkeGatewayListInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetIkeGatewayListResult>("scm:index/getIkeGatewayList:getIkeGatewayList", args ?? new GetIkeGatewayListInvokeArgs(), options.WithDefaults());

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
        ///     var example = Scm.GetIkeGatewayList.Invoke(new()
        ///     {
        ///         Folder = "Remote Networks",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetIkeGatewayListResult> Invoke(GetIkeGatewayListInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetIkeGatewayListResult>("scm:index/getIkeGatewayList:getIkeGatewayList", args ?? new GetIkeGatewayListInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetIkeGatewayListArgs : global::Pulumi.InvokeArgs
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

        public GetIkeGatewayListArgs()
        {
        }
        public static new GetIkeGatewayListArgs Empty => new GetIkeGatewayListArgs();
    }

    public sealed class GetIkeGatewayListInvokeArgs : global::Pulumi.InvokeArgs
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

        public GetIkeGatewayListInvokeArgs()
        {
        }
        public static new GetIkeGatewayListInvokeArgs Empty => new GetIkeGatewayListInvokeArgs();
    }


    [OutputType]
    public sealed class GetIkeGatewayListResult
    {
        /// <summary>
        /// The Data param.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetIkeGatewayListDataResult> Datas;
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
        private GetIkeGatewayListResult(
            ImmutableArray<Outputs.GetIkeGatewayListDataResult> datas,

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
