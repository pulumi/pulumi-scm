// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm
{
    public static class GetIkeCryptoProfile
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
        ///     var example = Scm.GetIkeCryptoProfile.Invoke(new()
        ///     {
        ///         Id = "1234-56-789",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetIkeCryptoProfileResult> InvokeAsync(GetIkeCryptoProfileArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetIkeCryptoProfileResult>("scm:index/getIkeCryptoProfile:getIkeCryptoProfile", args ?? new GetIkeCryptoProfileArgs(), options.WithDefaults());

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
        ///     var example = Scm.GetIkeCryptoProfile.Invoke(new()
        ///     {
        ///         Id = "1234-56-789",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetIkeCryptoProfileResult> Invoke(GetIkeCryptoProfileInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetIkeCryptoProfileResult>("scm:index/getIkeCryptoProfile:getIkeCryptoProfile", args ?? new GetIkeCryptoProfileInvokeArgs(), options.WithDefaults());

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
        ///     var example = Scm.GetIkeCryptoProfile.Invoke(new()
        ///     {
        ///         Id = "1234-56-789",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetIkeCryptoProfileResult> Invoke(GetIkeCryptoProfileInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetIkeCryptoProfileResult>("scm:index/getIkeCryptoProfile:getIkeCryptoProfile", args ?? new GetIkeCryptoProfileInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetIkeCryptoProfileArgs : global::Pulumi.InvokeArgs
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
        /// The Id param.
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        /// <summary>
        /// The Snippet param.
        /// </summary>
        [Input("snippet")]
        public string? Snippet { get; set; }

        public GetIkeCryptoProfileArgs()
        {
        }
        public static new GetIkeCryptoProfileArgs Empty => new GetIkeCryptoProfileArgs();
    }

    public sealed class GetIkeCryptoProfileInvokeArgs : global::Pulumi.InvokeArgs
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
        /// The Id param.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        /// <summary>
        /// The Snippet param.
        /// </summary>
        [Input("snippet")]
        public Input<string>? Snippet { get; set; }

        public GetIkeCryptoProfileInvokeArgs()
        {
        }
        public static new GetIkeCryptoProfileInvokeArgs Empty => new GetIkeCryptoProfileInvokeArgs();
    }


    [OutputType]
    public sealed class GetIkeCryptoProfileResult
    {
        /// <summary>
        /// IKEv2 SA reauthentication interval equals authetication-multiple * rekey-lifetime; 0 means reauthentication disabled. Value must be less than or equal to 50. Default: `0`.
        /// </summary>
        public readonly int AuthenticationMultiple;
        /// <summary>
        /// The Device param.
        /// </summary>
        public readonly string? Device;
        /// <summary>
        /// The DhGroups param. Individual elements in this list are subject to additional validation. String must be one of these: `"group1"`, `"group2"`, `"group5"`, `"group14"`, `"group19"`, `"group20"`.
        /// </summary>
        public readonly ImmutableArray<string> DhGroups;
        /// <summary>
        /// Encryption algorithm. Individual elements in this list are subject to additional validation. String must be one of these: `"des"`, `"3des"`, `"aes-128-cbc"`, `"aes-192-cbc"`, `"aes-256-cbc"`, `"aes-128-gcm"`, `"aes-256-gcm"`.
        /// </summary>
        public readonly ImmutableArray<string> Encryptions;
        /// <summary>
        /// The Folder param.
        /// </summary>
        public readonly string? Folder;
        /// <summary>
        /// The Hashes param. Individual elements in this list are subject to additional validation. String must be one of these: `"md5"`, `"sha1"`, `"sha256"`, `"sha384"`, `"sha512"`.
        /// </summary>
        public readonly ImmutableArray<string> Hashes;
        /// <summary>
        /// The Id param.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The Lifetime param.
        /// </summary>
        public readonly Outputs.GetIkeCryptoProfileLifetimeResult Lifetime;
        /// <summary>
        /// Alphanumeric string begin with letter: [0-9a-zA-Z._-]. String length must not exceed 31 characters.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The Snippet param.
        /// </summary>
        public readonly string? Snippet;
        public readonly string Tfid;

        [OutputConstructor]
        private GetIkeCryptoProfileResult(
            int authenticationMultiple,

            string? device,

            ImmutableArray<string> dhGroups,

            ImmutableArray<string> encryptions,

            string? folder,

            ImmutableArray<string> hashes,

            string id,

            Outputs.GetIkeCryptoProfileLifetimeResult lifetime,

            string name,

            string? snippet,

            string tfid)
        {
            AuthenticationMultiple = authenticationMultiple;
            Device = device;
            DhGroups = dhGroups;
            Encryptions = encryptions;
            Folder = folder;
            Hashes = hashes;
            Id = id;
            Lifetime = lifetime;
            Name = name;
            Snippet = snippet;
            Tfid = tfid;
        }
    }
}
