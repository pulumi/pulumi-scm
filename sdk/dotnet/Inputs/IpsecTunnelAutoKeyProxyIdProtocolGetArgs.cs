// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class IpsecTunnelAutoKeyProxyIdProtocolGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// IP protocol number. Value must be between 1 and 254. Ensure that only one of the following is specified: `number`, `tcp`, `udp`
        /// </summary>
        [Input("number")]
        public Input<int>? Number { get; set; }

        /// <summary>
        /// The Tcp param. Ensure that only one of the following is specified: `number`, `tcp`, `udp`
        /// </summary>
        [Input("tcp")]
        public Input<Inputs.IpsecTunnelAutoKeyProxyIdProtocolTcpGetArgs>? Tcp { get; set; }

        /// <summary>
        /// The Udp param. Ensure that only one of the following is specified: `number`, `tcp`, `udp`
        /// </summary>
        [Input("udp")]
        public Input<Inputs.IpsecTunnelAutoKeyProxyIdProtocolUdpGetArgs>? Udp { get; set; }

        public IpsecTunnelAutoKeyProxyIdProtocolGetArgs()
        {
        }
        public static new IpsecTunnelAutoKeyProxyIdProtocolGetArgs Empty => new IpsecTunnelAutoKeyProxyIdProtocolGetArgs();
    }
}