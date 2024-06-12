// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Immutable;

namespace Pulumi.Scm
{
    public static class Config
    {
        [global::System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Design", "IDE1006", Justification = 
        "Double underscore prefix used to avoid conflicts with variable names.")]
        private sealed class __Value<T>
        {
            private readonly Func<T> _getter;
            private T _value = default!;
            private bool _set;

            public __Value(Func<T> getter)
            {
                _getter = getter;
            }

            public T Get() => _set ? _value : _getter();

            public void Set(T value)
            {
                _value = value;
                _set = true;
            }
        }

        private static readonly global::Pulumi.Config __config = new global::Pulumi.Config("scm");

        private static readonly __Value<string?> _authFile = new __Value<string?>(() => __config.Get("authFile"));
        /// <summary>
        /// The file path to the JSON file with auth creds for SCM.
        /// </summary>
        public static string? AuthFile
        {
            get => _authFile.Get();
            set => _authFile.Set(value);
        }

        private static readonly __Value<string?> _authUrl = new __Value<string?>(() => __config.Get("authUrl"));
        /// <summary>
        /// The URL to send auth credentials to which will return a JWT. Default:
        /// `https://auth.apps.paloaltonetworks.com/auth/v1/oauth2/access_token`. Environment variable: `SCM_AUTH_URL`. JSON config
        /// file variable: `auth_url`.
        /// </summary>
        public static string? AuthUrl
        {
            get => _authUrl.Get();
            set => _authUrl.Set(value);
        }

        private static readonly __Value<string?> _clientId = new __Value<string?>(() => __config.Get("clientId"));
        /// <summary>
        /// The client ID for the connection. Environment variable: `SCM_CLIENT_ID`. JSON config file variable: `client_id`.
        /// </summary>
        public static string? ClientId
        {
            get => _clientId.Get();
            set => _clientId.Set(value);
        }

        private static readonly __Value<string?> _clientSecret = new __Value<string?>(() => __config.Get("clientSecret"));
        /// <summary>
        /// The client secret for the connection. Environment variable: `SCM_CLIENT_SECRET`. JSON config file variable:
        /// `client_secret`.
        /// </summary>
        public static string? ClientSecret
        {
            get => _clientSecret.Get();
            set => _clientSecret.Set(value);
        }

        private static readonly __Value<ImmutableDictionary<string, string>?> _headers = new __Value<ImmutableDictionary<string, string>?>(() => __config.GetObject<ImmutableDictionary<string, string>>("headers"));
        /// <summary>
        /// Custom HTTP headers to be sent with all API commands. Environment variable: `SCM_HEADERS`. JSON config file variable:
        /// `headers`.
        /// </summary>
        public static ImmutableDictionary<string, string>? Headers
        {
            get => _headers.Get();
            set => _headers.Set(value);
        }

        private static readonly __Value<string?> _host = new __Value<string?>(() => __config.Get("host"));
        /// <summary>
        /// The hostname of Strata Cloud Manager API. Default: `api.sase.paloaltonetworks.com`. Environment variable: `SCM_HOST`.
        /// JSON config file variable: `host`.
        /// </summary>
        public static string? Host
        {
            get => _host.Get();
            set => _host.Set(value);
        }

        private static readonly __Value<string?> _logging = new __Value<string?>(() => __config.Get("logging"));
        /// <summary>
        /// The logging level of the provider and the underlying communication. Default: `quiet`. Environment variable:
        /// `SCM_LOGGING`. JSON config file variable: `logging`.
        /// </summary>
        public static string? Logging
        {
            get => _logging.Get();
            set => _logging.Set(value);
        }

        private static readonly __Value<int?> _port = new __Value<int?>(() => __config.GetInt32("port"));
        /// <summary>
        /// The port number to use for API commands, if non-standard for the given protocol. Environment variable: `SCM_PORT`. JSON
        /// config file variable: `port`.
        /// </summary>
        public static int? Port
        {
            get => _port.Get();
            set => _port.Set(value);
        }

        private static readonly __Value<string?> _protocol = new __Value<string?>(() => __config.Get("protocol"));
        /// <summary>
        /// The protocol to use for SCM. This should be 'http' or 'https'. Default: `https`. Environment variable: `SCM_PROTOCOL`.
        /// JSON config file variable: `protocol`.
        /// </summary>
        public static string? Protocol
        {
            get => _protocol.Get();
            set => _protocol.Set(value);
        }

        private static readonly __Value<string?> _scope = new __Value<string?>(() => __config.Get("scope"));
        /// <summary>
        /// The client scope. Environment variable: `SCM_SCOPE`. JSON config file variable: `scope`.
        /// </summary>
        public static string? Scope
        {
            get => _scope.Get();
            set => _scope.Set(value);
        }

    }
}