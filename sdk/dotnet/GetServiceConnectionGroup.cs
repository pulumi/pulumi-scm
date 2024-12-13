// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm
{
    public static class GetServiceConnectionGroup
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
        ///     var example = Scm.GetServiceConnectionGroup.Invoke(new()
        ///     {
        ///         Id = "1234-56-789",
        ///         Folder = "Service Connections",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetServiceConnectionGroupResult> InvokeAsync(GetServiceConnectionGroupArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetServiceConnectionGroupResult>("scm:index/getServiceConnectionGroup:getServiceConnectionGroup", args ?? new GetServiceConnectionGroupArgs(), options.WithDefaults());

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
        ///     var example = Scm.GetServiceConnectionGroup.Invoke(new()
        ///     {
        ///         Id = "1234-56-789",
        ///         Folder = "Service Connections",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetServiceConnectionGroupResult> Invoke(GetServiceConnectionGroupInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetServiceConnectionGroupResult>("scm:index/getServiceConnectionGroup:getServiceConnectionGroup", args ?? new GetServiceConnectionGroupInvokeArgs(), options.WithDefaults());

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
        ///     var example = Scm.GetServiceConnectionGroup.Invoke(new()
        ///     {
        ///         Id = "1234-56-789",
        ///         Folder = "Service Connections",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetServiceConnectionGroupResult> Invoke(GetServiceConnectionGroupInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetServiceConnectionGroupResult>("scm:index/getServiceConnectionGroup:getServiceConnectionGroup", args ?? new GetServiceConnectionGroupInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetServiceConnectionGroupArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Folder param. String can either be a specific string(`"Service Connections"`) or match this regex: `^[0-9a-zA-Z._\s-]{1,}$`. Default: `"Service Connections"`.
        /// </summary>
        [Input("folder")]
        public string? Folder { get; set; }

        /// <summary>
        /// The Id param.
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        public GetServiceConnectionGroupArgs()
        {
        }
        public static new GetServiceConnectionGroupArgs Empty => new GetServiceConnectionGroupArgs();
    }

    public sealed class GetServiceConnectionGroupInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Folder param. String can either be a specific string(`"Service Connections"`) or match this regex: `^[0-9a-zA-Z._\s-]{1,}$`. Default: `"Service Connections"`.
        /// </summary>
        [Input("folder")]
        public Input<string>? Folder { get; set; }

        /// <summary>
        /// The Id param.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public GetServiceConnectionGroupInvokeArgs()
        {
        }
        public static new GetServiceConnectionGroupInvokeArgs Empty => new GetServiceConnectionGroupInvokeArgs();
    }


    [OutputType]
    public sealed class GetServiceConnectionGroupResult
    {
        /// <summary>
        /// The DisableSnat param.
        /// </summary>
        public readonly bool DisableSnat;
        /// <summary>
        /// The Folder param. String can either be a specific string(`"Service Connections"`) or match this regex: `^[0-9a-zA-Z._\s-]{1,}$`. Default: `"Service Connections"`.
        /// </summary>
        public readonly string Folder;
        /// <summary>
        /// The Id param.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The Name param.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The PbfOnly param.
        /// </summary>
        public readonly bool PbfOnly;
        /// <summary>
        /// The Targets param.
        /// </summary>
        public readonly ImmutableArray<string> Targets;
        public readonly string Tfid;

        [OutputConstructor]
        private GetServiceConnectionGroupResult(
            bool disableSnat,

            string folder,

            string id,

            string name,

            bool pbfOnly,

            ImmutableArray<string> targets,

            string tfid)
        {
            DisableSnat = disableSnat;
            Folder = folder;
            Id = id;
            Name = name;
            PbfOnly = pbfOnly;
            Targets = targets;
            Tfid = tfid;
        }
    }
}
