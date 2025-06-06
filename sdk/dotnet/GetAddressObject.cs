// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm
{
    public static class GetAddressObject
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
        ///     var example = Scm.GetAddressObject.Invoke(new()
        ///     {
        ///         Id = "1234-56-789",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetAddressObjectResult> InvokeAsync(GetAddressObjectArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAddressObjectResult>("scm:index/getAddressObject:getAddressObject", args ?? new GetAddressObjectArgs(), options.WithDefaults());

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
        ///     var example = Scm.GetAddressObject.Invoke(new()
        ///     {
        ///         Id = "1234-56-789",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetAddressObjectResult> Invoke(GetAddressObjectInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAddressObjectResult>("scm:index/getAddressObject:getAddressObject", args ?? new GetAddressObjectInvokeArgs(), options.WithDefaults());

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
        ///     var example = Scm.GetAddressObject.Invoke(new()
        ///     {
        ///         Id = "1234-56-789",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetAddressObjectResult> Invoke(GetAddressObjectInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetAddressObjectResult>("scm:index/getAddressObject:getAddressObject", args ?? new GetAddressObjectInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAddressObjectArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Id param.
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        public GetAddressObjectArgs()
        {
        }
        public static new GetAddressObjectArgs Empty => new GetAddressObjectArgs();
    }

    public sealed class GetAddressObjectInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Id param.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public GetAddressObjectInvokeArgs()
        {
        }
        public static new GetAddressObjectInvokeArgs Empty => new GetAddressObjectInvokeArgs();
    }


    [OutputType]
    public sealed class GetAddressObjectResult
    {
        /// <summary>
        /// The Description param. String length must not exceed 1023 characters.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The Fqdn param. String length must be between 1 and 255 characters. String validation regex: `^a-zA-Z0-9_+[a-zA-Z0-9]$`.
        /// </summary>
        public readonly string Fqdn;
        /// <summary>
        /// The Id param.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The IpNetmask param.
        /// </summary>
        public readonly string IpNetmask;
        /// <summary>
        /// The IpRange param.
        /// </summary>
        public readonly string IpRange;
        /// <summary>
        /// The IpWildcard param.
        /// </summary>
        public readonly string IpWildcard;
        /// <summary>
        /// Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 63 characters.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Tags for address object. List must contain at most 64 elements. Individual elements in this list are subject to additional validation. String length must not exceed 127 characters.
        /// </summary>
        public readonly ImmutableArray<string> Tags;
        public readonly string Tfid;
        /// <summary>
        /// The Type param.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetAddressObjectResult(
            string description,

            string fqdn,

            string id,

            string ipNetmask,

            string ipRange,

            string ipWildcard,

            string name,

            ImmutableArray<string> tags,

            string tfid,

            string type)
        {
            Description = description;
            Fqdn = fqdn;
            Id = id;
            IpNetmask = ipNetmask;
            IpRange = ipRange;
            IpWildcard = ipWildcard;
            Name = name;
            Tags = tags;
            Tfid = tfid;
            Type = type;
        }
    }
}
