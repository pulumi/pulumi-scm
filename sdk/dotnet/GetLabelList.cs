// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm
{
    public static class GetLabelList
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
        ///     var example = Scm.GetLabelList.Invoke();
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetLabelListResult> InvokeAsync(GetLabelListArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetLabelListResult>("scm:index/getLabelList:getLabelList", args ?? new GetLabelListArgs(), options.WithDefaults());

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
        ///     var example = Scm.GetLabelList.Invoke();
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetLabelListResult> Invoke(GetLabelListInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetLabelListResult>("scm:index/getLabelList:getLabelList", args ?? new GetLabelListInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetLabelListArgs : global::Pulumi.InvokeArgs
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

        public GetLabelListArgs()
        {
        }
        public static new GetLabelListArgs Empty => new GetLabelListArgs();
    }

    public sealed class GetLabelListInvokeArgs : global::Pulumi.InvokeArgs
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

        public GetLabelListInvokeArgs()
        {
        }
        public static new GetLabelListInvokeArgs Empty => new GetLabelListInvokeArgs();
    }


    [OutputType]
    public sealed class GetLabelListResult
    {
        /// <summary>
        /// The Data param.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLabelListDataResult> Datas;
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
        private GetLabelListResult(
            ImmutableArray<Outputs.GetLabelListDataResult> datas,

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
