// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm
{
    public static class GetServiceConnectionGroupList
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
        ///     var example = Scm.GetServiceConnectionGroupList.Invoke(new()
        ///     {
        ///         Folder = "Service Connections",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetServiceConnectionGroupListResult> InvokeAsync(GetServiceConnectionGroupListArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetServiceConnectionGroupListResult>("scm:index/getServiceConnectionGroupList:getServiceConnectionGroupList", args ?? new GetServiceConnectionGroupListArgs(), options.WithDefaults());

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
        ///     var example = Scm.GetServiceConnectionGroupList.Invoke(new()
        ///     {
        ///         Folder = "Service Connections",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetServiceConnectionGroupListResult> Invoke(GetServiceConnectionGroupListInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetServiceConnectionGroupListResult>("scm:index/getServiceConnectionGroupList:getServiceConnectionGroupList", args ?? new GetServiceConnectionGroupListInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetServiceConnectionGroupListArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Folder param. String can either be a specific string(`"Service Connections"`) or match this regex: `^[0-9a-zA-Z._\s-]{1,}$`. Default: `"Service Connections"`.
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

        public GetServiceConnectionGroupListArgs()
        {
        }
        public static new GetServiceConnectionGroupListArgs Empty => new GetServiceConnectionGroupListArgs();
    }

    public sealed class GetServiceConnectionGroupListInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Folder param. String can either be a specific string(`"Service Connections"`) or match this regex: `^[0-9a-zA-Z._\s-]{1,}$`. Default: `"Service Connections"`.
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

        public GetServiceConnectionGroupListInvokeArgs()
        {
        }
        public static new GetServiceConnectionGroupListInvokeArgs Empty => new GetServiceConnectionGroupListInvokeArgs();
    }


    [OutputType]
    public sealed class GetServiceConnectionGroupListResult
    {
        /// <summary>
        /// The Data param.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetServiceConnectionGroupListDataResult> Datas;
        /// <summary>
        /// The Folder param. String can either be a specific string(`"Service Connections"`) or match this regex: `^[0-9a-zA-Z._\s-]{1,}$`. Default: `"Service Connections"`.
        /// </summary>
        public readonly string Folder;
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
        private GetServiceConnectionGroupListResult(
            ImmutableArray<Outputs.GetServiceConnectionGroupListDataResult> datas,

            string folder,

            string id,

            int limit,

            string? name,

            int offset,

            string tfid,

            int total)
        {
            Datas = datas;
            Folder = folder;
            Id = id;
            Limit = limit;
            Name = name;
            Offset = offset;
            Tfid = tfid;
            Total = total;
        }
    }
}
