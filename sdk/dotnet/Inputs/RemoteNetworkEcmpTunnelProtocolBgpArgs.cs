// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class RemoteNetworkEcmpTunnelProtocolBgpArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The DoNotExportRoutes param.
        /// </summary>
        [Input("doNotExportRoutes")]
        public Input<bool>? DoNotExportRoutes { get; set; }

        /// <summary>
        /// to setup bgp protocol, enable need to set as true.
        /// </summary>
        [Input("enable")]
        public Input<bool>? Enable { get; set; }

        /// <summary>
        /// The LocalIpAddress param.
        /// </summary>
        [Input("localIpAddress")]
        public Input<string>? LocalIpAddress { get; set; }

        /// <summary>
        /// The OriginateDefaultRoute param.
        /// </summary>
        [Input("originateDefaultRoute")]
        public Input<bool>? OriginateDefaultRoute { get; set; }

        /// <summary>
        /// The PeerAs param.
        /// </summary>
        [Input("peerAs")]
        public Input<string>? PeerAs { get; set; }

        /// <summary>
        /// The PeerIpAddress param.
        /// </summary>
        [Input("peerIpAddress")]
        public Input<string>? PeerIpAddress { get; set; }

        /// <summary>
        /// Exchange Routes: exchange-v4-over-v4 stands for Exchange IPv4 routes over IPv4 peering. exchange-v4-v6-over-v4 stands for Exchange both IPv4 and IPv6 routes over IPv4 peering. exchange-v4-over-v4-v6-over-v6 stands for Exchange IPv4 routes over IPv4 peer and IPv6 route over IPv6 peer. exchange-v6-over-v6 stands for Exchange IPv6 routes over IPv6 peering. String must be one of these: `"exchange-v4-over-v4"`, `"exchange-v4-v6-over-v4"`, `"exchange-v4-over-v4-v6-over-v6"`, `"exchange-v6-over-v6"`.
        /// </summary>
        [Input("peeringType")]
        public Input<string>? PeeringType { get; set; }

        [Input("secret")]
        private Input<string>? _secret;

        /// <summary>
        /// The Secret param.
        /// </summary>
        public Input<string>? Secret
        {
            get => _secret;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _secret = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The SummarizeMobileUserRoutes param.
        /// </summary>
        [Input("summarizeMobileUserRoutes")]
        public Input<bool>? SummarizeMobileUserRoutes { get; set; }

        public RemoteNetworkEcmpTunnelProtocolBgpArgs()
        {
        }
        public static new RemoteNetworkEcmpTunnelProtocolBgpArgs Empty => new RemoteNetworkEcmpTunnelProtocolBgpArgs();
    }
}
