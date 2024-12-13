// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm
{
    public static class GetLocalUser
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
        ///     var example = Scm.GetLocalUser.Invoke(new()
        ///     {
        ///         Id = "1234-56-789",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetLocalUserResult> InvokeAsync(GetLocalUserArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetLocalUserResult>("scm:index/getLocalUser:getLocalUser", args ?? new GetLocalUserArgs(), options.WithDefaults());

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
        ///     var example = Scm.GetLocalUser.Invoke(new()
        ///     {
        ///         Id = "1234-56-789",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetLocalUserResult> Invoke(GetLocalUserInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetLocalUserResult>("scm:index/getLocalUser:getLocalUser", args ?? new GetLocalUserInvokeArgs(), options.WithDefaults());

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
        ///     var example = Scm.GetLocalUser.Invoke(new()
        ///     {
        ///         Id = "1234-56-789",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetLocalUserResult> Invoke(GetLocalUserInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetLocalUserResult>("scm:index/getLocalUser:getLocalUser", args ?? new GetLocalUserInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetLocalUserArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Id param.
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        public GetLocalUserArgs()
        {
        }
        public static new GetLocalUserArgs Empty => new GetLocalUserArgs();
    }

    public sealed class GetLocalUserInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Id param.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public GetLocalUserInvokeArgs()
        {
        }
        public static new GetLocalUserInvokeArgs Empty => new GetLocalUserInvokeArgs();
    }


    [OutputType]
    public sealed class GetLocalUserResult
    {
        /// <summary>
        /// The Disabled param.
        /// </summary>
        public readonly bool Disabled;
        /// <summary>
        /// The Id param.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The Name param. String length must not exceed 31 characters.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The Password param. String length must not exceed 63 characters.
        /// </summary>
        public readonly string Password;
        public readonly string Tfid;

        [OutputConstructor]
        private GetLocalUserResult(
            bool disabled,

            string id,

            string name,

            string password,

            string tfid)
        {
            Disabled = disabled;
            Id = id;
            Name = name;
            Password = password;
            Tfid = tfid;
        }
    }
}
