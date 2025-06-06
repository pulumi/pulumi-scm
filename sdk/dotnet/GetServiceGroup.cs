// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm
{
    public static class GetServiceGroup
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
        ///     var example = Scm.GetServiceGroup.Invoke(new()
        ///     {
        ///         Id = "1234-56-789",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetServiceGroupResult> InvokeAsync(GetServiceGroupArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetServiceGroupResult>("scm:index/getServiceGroup:getServiceGroup", args ?? new GetServiceGroupArgs(), options.WithDefaults());

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
        ///     var example = Scm.GetServiceGroup.Invoke(new()
        ///     {
        ///         Id = "1234-56-789",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetServiceGroupResult> Invoke(GetServiceGroupInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetServiceGroupResult>("scm:index/getServiceGroup:getServiceGroup", args ?? new GetServiceGroupInvokeArgs(), options.WithDefaults());

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
        ///     var example = Scm.GetServiceGroup.Invoke(new()
        ///     {
        ///         Id = "1234-56-789",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetServiceGroupResult> Invoke(GetServiceGroupInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetServiceGroupResult>("scm:index/getServiceGroup:getServiceGroup", args ?? new GetServiceGroupInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetServiceGroupArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Id param.
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        public GetServiceGroupArgs()
        {
        }
        public static new GetServiceGroupArgs Empty => new GetServiceGroupArgs();
    }

    public sealed class GetServiceGroupInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Id param.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public GetServiceGroupInvokeArgs()
        {
        }
        public static new GetServiceGroupInvokeArgs Empty => new GetServiceGroupInvokeArgs();
    }


    [OutputType]
    public sealed class GetServiceGroupResult
    {
        /// <summary>
        /// The Id param.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The Members param. Individual elements in this list are subject to additional validation. String length must not exceed 63 characters.
        /// </summary>
        public readonly ImmutableArray<string> Members;
        /// <summary>
        /// Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 63 characters.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Tags for service group object. List must contain at most 64 elements. Individual elements in this list are subject to additional validation. String length must not exceed 127 characters.
        /// </summary>
        public readonly ImmutableArray<string> Tags;
        public readonly string Tfid;

        [OutputConstructor]
        private GetServiceGroupResult(
            string id,

            ImmutableArray<string> members,

            string name,

            ImmutableArray<string> tags,

            string tfid)
        {
            Id = id;
            Members = members;
            Name = name;
            Tags = tags;
            Tfid = tfid;
        }
    }
}
