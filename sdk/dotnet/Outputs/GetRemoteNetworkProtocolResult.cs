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
    public sealed class GetRemoteNetworkProtocolResult
    {
        /// <summary>
        /// The Bgp param.
        /// </summary>
        public readonly Outputs.GetRemoteNetworkProtocolBgpResult Bgp;
        /// <summary>
        /// secondary bgp routing as bgp*peer.
        /// </summary>
        public readonly Outputs.GetRemoteNetworkProtocolBgpPeerResult BgpPeer;

        [OutputConstructor]
        private GetRemoteNetworkProtocolResult(
            Outputs.GetRemoteNetworkProtocolBgpResult bgp,

            Outputs.GetRemoteNetworkProtocolBgpPeerResult bgpPeer)
        {
            Bgp = bgp;
            BgpPeer = bgpPeer;
        }
    }
}
