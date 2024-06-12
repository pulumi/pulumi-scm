// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class IpsecTunnelAutoKeyProxyIdV6ProtocolUdpGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The LocalPort param. Value must be between 0 and 65535. Default: `0`.
        /// </summary>
        [Input("localPort")]
        public Input<int>? LocalPort { get; set; }

        /// <summary>
        /// The RemotePort param. Value must be between 0 and 65535. Default: `0`.
        /// </summary>
        [Input("remotePort")]
        public Input<int>? RemotePort { get; set; }

        public IpsecTunnelAutoKeyProxyIdV6ProtocolUdpGetArgs()
        {
        }
        public static new IpsecTunnelAutoKeyProxyIdV6ProtocolUdpGetArgs Empty => new IpsecTunnelAutoKeyProxyIdV6ProtocolUdpGetArgs();
    }
}