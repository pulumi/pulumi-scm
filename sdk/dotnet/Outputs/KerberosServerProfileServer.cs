// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Outputs
{

    [OutputType]
    public sealed class KerberosServerProfileServer
    {
        /// <summary>
        /// The Host param.
        /// </summary>
        public readonly string? Host;
        /// <summary>
        /// The Name param.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// The Port param. Value must be between 1 and 65535.
        /// </summary>
        public readonly int? Port;

        [OutputConstructor]
        private KerberosServerProfileServer(
            string? host,

            string? name,

            int? port)
        {
            Host = host;
            Name = name;
            Port = port;
        }
    }
}
