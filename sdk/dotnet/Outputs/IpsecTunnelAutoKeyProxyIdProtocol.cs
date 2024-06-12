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
    public sealed class IpsecTunnelAutoKeyProxyIdProtocol
    {
        /// <summary>
        /// IP protocol number. Value must be between 1 and 254. Ensure that only one of the following is specified: `number`, `tcp`, `udp`
        /// </summary>
        public readonly int? Number;
        /// <summary>
        /// The Tcp param. Ensure that only one of the following is specified: `number`, `tcp`, `udp`
        /// </summary>
        public readonly Outputs.IpsecTunnelAutoKeyProxyIdProtocolTcp? Tcp;
        /// <summary>
        /// The Udp param. Ensure that only one of the following is specified: `number`, `tcp`, `udp`
        /// </summary>
        public readonly Outputs.IpsecTunnelAutoKeyProxyIdProtocolUdp? Udp;

        [OutputConstructor]
        private IpsecTunnelAutoKeyProxyIdProtocol(
            int? number,

            Outputs.IpsecTunnelAutoKeyProxyIdProtocolTcp? tcp,

            Outputs.IpsecTunnelAutoKeyProxyIdProtocolUdp? udp)
        {
            Number = number;
            Tcp = tcp;
            Udp = udp;
        }
    }
}