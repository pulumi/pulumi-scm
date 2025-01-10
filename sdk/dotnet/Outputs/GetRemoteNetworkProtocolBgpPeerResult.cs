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
    public sealed class GetRemoteNetworkProtocolBgpPeerResult
    {
        /// <summary>
        /// The LocalIpAddress param.
        /// </summary>
        public readonly string LocalIpAddress;
        /// <summary>
        /// The PeerIpAddress param.
        /// </summary>
        public readonly string PeerIpAddress;
        /// <summary>
        /// If true, the secondary BGP peer configuration will be the same as the primary BGP peer. Default: `true`.
        /// </summary>
        public readonly bool SameAsPrimary;
        /// <summary>
        /// The Secret param.
        /// </summary>
        public readonly string Secret;

        [OutputConstructor]
        private GetRemoteNetworkProtocolBgpPeerResult(
            string localIpAddress,

            string peerIpAddress,

            bool sameAsPrimary,

            string secret)
        {
            LocalIpAddress = localIpAddress;
            PeerIpAddress = peerIpAddress;
            SameAsPrimary = sameAsPrimary;
            Secret = secret;
        }
    }
}
