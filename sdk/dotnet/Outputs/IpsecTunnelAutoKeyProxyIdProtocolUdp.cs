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
    public sealed class IpsecTunnelAutoKeyProxyIdProtocolUdp
    {
        /// <summary>
        /// The LocalPort param. Value must be between 0 and 65535. Default: `0`.
        /// </summary>
        public readonly int? LocalPort;
        /// <summary>
        /// The RemotePort param. Value must be between 0 and 65535. Default: `0`.
        /// </summary>
        public readonly int? RemotePort;

        [OutputConstructor]
        private IpsecTunnelAutoKeyProxyIdProtocolUdp(
            int? localPort,

            int? remotePort)
        {
            LocalPort = localPort;
            RemotePort = remotePort;
        }
    }
}
