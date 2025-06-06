// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm
{
    public static class GetSharedInfrastructureSettingsList
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
        ///     var example = Scm.GetSharedInfrastructureSettingsList.Invoke();
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetSharedInfrastructureSettingsListResult> InvokeAsync(GetSharedInfrastructureSettingsListArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSharedInfrastructureSettingsListResult>("scm:index/getSharedInfrastructureSettingsList:getSharedInfrastructureSettingsList", args ?? new GetSharedInfrastructureSettingsListArgs(), options.WithDefaults());

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
        ///     var example = Scm.GetSharedInfrastructureSettingsList.Invoke();
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetSharedInfrastructureSettingsListResult> Invoke(GetSharedInfrastructureSettingsListInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSharedInfrastructureSettingsListResult>("scm:index/getSharedInfrastructureSettingsList:getSharedInfrastructureSettingsList", args ?? new GetSharedInfrastructureSettingsListInvokeArgs(), options.WithDefaults());

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
        ///     var example = Scm.GetSharedInfrastructureSettingsList.Invoke();
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetSharedInfrastructureSettingsListResult> Invoke(GetSharedInfrastructureSettingsListInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetSharedInfrastructureSettingsListResult>("scm:index/getSharedInfrastructureSettingsList:getSharedInfrastructureSettingsList", args ?? new GetSharedInfrastructureSettingsListInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSharedInfrastructureSettingsListArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Limit param. A limit of -1 will return all configured items. Default: `200`.
        /// </summary>
        [Input("limit")]
        public int? Limit { get; set; }

        /// <summary>
        /// The Offset param. Default: `0`.
        /// </summary>
        [Input("offset")]
        public int? Offset { get; set; }

        public GetSharedInfrastructureSettingsListArgs()
        {
        }
        public static new GetSharedInfrastructureSettingsListArgs Empty => new GetSharedInfrastructureSettingsListArgs();
    }

    public sealed class GetSharedInfrastructureSettingsListInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Limit param. A limit of -1 will return all configured items. Default: `200`.
        /// </summary>
        [Input("limit")]
        public Input<int>? Limit { get; set; }

        /// <summary>
        /// The Offset param. Default: `0`.
        /// </summary>
        [Input("offset")]
        public Input<int>? Offset { get; set; }

        public GetSharedInfrastructureSettingsListInvokeArgs()
        {
        }
        public static new GetSharedInfrastructureSettingsListInvokeArgs Empty => new GetSharedInfrastructureSettingsListInvokeArgs();
    }


    [OutputType]
    public sealed class GetSharedInfrastructureSettingsListResult
    {
        /// <summary>
        /// The Data param.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSharedInfrastructureSettingsListDataResult> Datas;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The Limit param. A limit of -1 will return all configured items. Default: `200`.
        /// </summary>
        public readonly int Limit;
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
        private GetSharedInfrastructureSettingsListResult(
            ImmutableArray<Outputs.GetSharedInfrastructureSettingsListDataResult> datas,

            string id,

            int limit,

            int offset,

            string tfid,

            int total)
        {
            Datas = datas;
            Id = id;
            Limit = limit;
            Offset = offset;
            Tfid = tfid;
            Total = total;
        }
    }
}
