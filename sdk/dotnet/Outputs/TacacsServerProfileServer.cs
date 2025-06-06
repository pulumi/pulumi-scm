// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Outputs
{

    [OutputType]
    public sealed class TacacsServerProfileServer
    {
        /// <summary>
        /// The Address param.
        /// </summary>
        public readonly string? Address;
        /// <summary>
        /// The Name param.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// The Port param. Value must be between 1 and 65535.
        /// </summary>
        public readonly int? Port;
        /// <summary>
        /// The Secret param. String length must not exceed 64 characters.
        /// </summary>
        public readonly string? Secret;

        [OutputConstructor]
        private TacacsServerProfileServer(
            string? address,

            string? name,

            int? port,

            string? secret)
        {
            Address = address;
            Name = name;
            Port = port;
            Secret = secret;
        }
    }
}
