// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class IpsecTunnelAutoKeyGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("ikeGateways", required: true)]
        private InputList<Inputs.IpsecTunnelAutoKeyIkeGatewayGetArgs>? _ikeGateways;

        /// <summary>
        /// The IkeGateways param.
        /// </summary>
        public InputList<Inputs.IpsecTunnelAutoKeyIkeGatewayGetArgs> IkeGateways
        {
            get => _ikeGateways ?? (_ikeGateways = new InputList<Inputs.IpsecTunnelAutoKeyIkeGatewayGetArgs>());
            set => _ikeGateways = value;
        }

        /// <summary>
        /// The IpsecCryptoProfile param.
        /// </summary>
        [Input("ipsecCryptoProfile", required: true)]
        public Input<string> IpsecCryptoProfile { get; set; } = null!;

        [Input("proxyIdV6s")]
        private InputList<Inputs.IpsecTunnelAutoKeyProxyIdV6GetArgs>? _proxyIdV6s;

        /// <summary>
        /// IPv6 type of proxy*id values.
        /// </summary>
        public InputList<Inputs.IpsecTunnelAutoKeyProxyIdV6GetArgs> ProxyIdV6s
        {
            get => _proxyIdV6s ?? (_proxyIdV6s = new InputList<Inputs.IpsecTunnelAutoKeyProxyIdV6GetArgs>());
            set => _proxyIdV6s = value;
        }

        [Input("proxyIds")]
        private InputList<Inputs.IpsecTunnelAutoKeyProxyIdGetArgs>? _proxyIds;

        /// <summary>
        /// IPv4 type of proxy*id values.
        /// </summary>
        public InputList<Inputs.IpsecTunnelAutoKeyProxyIdGetArgs> ProxyIds
        {
            get => _proxyIds ?? (_proxyIds = new InputList<Inputs.IpsecTunnelAutoKeyProxyIdGetArgs>());
            set => _proxyIds = value;
        }

        public IpsecTunnelAutoKeyGetArgs()
        {
        }
        public static new IpsecTunnelAutoKeyGetArgs Empty => new IpsecTunnelAutoKeyGetArgs();
    }
}