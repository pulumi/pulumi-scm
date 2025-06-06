// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm
{
    public static class GetAutoTagActionsList
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
        ///     var example = Scm.GetAutoTagActionsList.Invoke();
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetAutoTagActionsListResult> InvokeAsync(GetAutoTagActionsListArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAutoTagActionsListResult>("scm:index/getAutoTagActionsList:getAutoTagActionsList", args ?? new GetAutoTagActionsListArgs(), options.WithDefaults());

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
        ///     var example = Scm.GetAutoTagActionsList.Invoke();
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetAutoTagActionsListResult> Invoke(GetAutoTagActionsListInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAutoTagActionsListResult>("scm:index/getAutoTagActionsList:getAutoTagActionsList", args ?? new GetAutoTagActionsListInvokeArgs(), options.WithDefaults());

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
        ///     var example = Scm.GetAutoTagActionsList.Invoke();
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetAutoTagActionsListResult> Invoke(GetAutoTagActionsListInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetAutoTagActionsListResult>("scm:index/getAutoTagActionsList:getAutoTagActionsList", args ?? new GetAutoTagActionsListInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAutoTagActionsListArgs : global::Pulumi.InvokeArgs
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

        public GetAutoTagActionsListArgs()
        {
        }
        public static new GetAutoTagActionsListArgs Empty => new GetAutoTagActionsListArgs();
    }

    public sealed class GetAutoTagActionsListInvokeArgs : global::Pulumi.InvokeArgs
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

        public GetAutoTagActionsListInvokeArgs()
        {
        }
        public static new GetAutoTagActionsListInvokeArgs Empty => new GetAutoTagActionsListInvokeArgs();
    }


    [OutputType]
    public sealed class GetAutoTagActionsListResult
    {
        /// <summary>
        /// The Data param.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAutoTagActionsListDataResult> Datas;
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
        private GetAutoTagActionsListResult(
            ImmutableArray<Outputs.GetAutoTagActionsListDataResult> datas,

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
