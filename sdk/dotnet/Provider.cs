// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm
{
    /// <summary>
    /// The provider type for the scm package. By default, resources use package-wide configuration
    /// settings, however an explicit `Provider` instance may be created and passed during resource
    /// construction to achieve fine-grained programmatic control over provider settings. See the
    /// [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
    /// </summary>
    [ScmResourceType("pulumi:providers:scm")]
    public partial class Provider : global::Pulumi.ProviderResource
    {
        /// <summary>
        /// The file path to the JSON file with auth creds for SCM.
        /// </summary>
        [Output("authFile")]
        public Output<string?> AuthFile { get; private set; } = null!;

        /// <summary>
        /// The client ID for the connection. Environment variable: `SCM_CLIENT_ID`. JSON config file variable: `client_id`.
        /// </summary>
        [Output("clientId")]
        public Output<string?> ClientId { get; private set; } = null!;

        /// <summary>
        /// The client secret for the connection. Environment variable: `SCM_CLIENT_SECRET`. JSON config file variable:
        /// `client_secret`.
        /// </summary>
        [Output("clientSecret")]
        public Output<string?> ClientSecret { get; private set; } = null!;

        /// <summary>
        /// The hostname of Strata Cloud Manager API. Default: `api.sase.paloaltonetworks.com`. Environment variable: `SCM_HOST`.
        /// JSON config file variable: `host`.
        /// </summary>
        [Output("host")]
        public Output<string?> Host { get; private set; } = null!;

        /// <summary>
        /// The logging level of the provider and the underlying communication. Default: `quiet`. Environment variable:
        /// `SCM_LOGGING`. JSON config file variable: `logging`.
        /// </summary>
        [Output("logging")]
        public Output<string?> Logging { get; private set; } = null!;

        /// <summary>
        /// The client scope. Environment variable: `SCM_SCOPE`. JSON config file variable: `scope`.
        /// </summary>
        [Output("scope")]
        public Output<string?> Scope { get; private set; } = null!;


        /// <summary>
        /// Create a Provider resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Provider(string name, ProviderArgs? args = null, CustomResourceOptions? options = null)
            : base("scm", name, args ?? new ProviderArgs(), MakeResourceOptions(options, ""))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "clientSecret",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
    }

    public sealed class ProviderArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The file path to the JSON file with auth creds for SCM.
        /// </summary>
        [Input("authFile")]
        public Input<string>? AuthFile { get; set; }

        /// <summary>
        /// The client ID for the connection. Environment variable: `SCM_CLIENT_ID`. JSON config file variable: `client_id`.
        /// </summary>
        [Input("clientId")]
        public Input<string>? ClientId { get; set; }

        [Input("clientSecret")]
        private Input<string>? _clientSecret;

        /// <summary>
        /// The client secret for the connection. Environment variable: `SCM_CLIENT_SECRET`. JSON config file variable:
        /// `client_secret`.
        /// </summary>
        public Input<string>? ClientSecret
        {
            get => _clientSecret;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _clientSecret = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The hostname of Strata Cloud Manager API. Default: `api.sase.paloaltonetworks.com`. Environment variable: `SCM_HOST`.
        /// JSON config file variable: `host`.
        /// </summary>
        [Input("host")]
        public Input<string>? Host { get; set; }

        /// <summary>
        /// The logging level of the provider and the underlying communication. Default: `quiet`. Environment variable:
        /// `SCM_LOGGING`. JSON config file variable: `logging`.
        /// </summary>
        [Input("logging")]
        public Input<string>? Logging { get; set; }

        /// <summary>
        /// The client scope. Environment variable: `SCM_SCOPE`. JSON config file variable: `scope`.
        /// </summary>
        [Input("scope")]
        public Input<string>? Scope { get; set; }

        public ProviderArgs()
        {
        }
        public static new ProviderArgs Empty => new ProviderArgs();
    }
}
