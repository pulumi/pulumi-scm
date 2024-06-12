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
    public sealed class GetRemoteNetworkListDataProtocolBgpResult
    {
        /// <summary>
        /// The DoNotExportRoutes param.
        /// </summary>
        public readonly bool DoNotExportRoutes;
        /// <summary>
        /// to setup bgp protocol, enable need to set as true.
        /// </summary>
        public readonly bool Enable;
        /// <summary>
        /// The LocalIpAddress param.
        /// </summary>
        public readonly string LocalIpAddress;
        /// <summary>
        /// The OriginateDefaultRoute param.
        /// </summary>
        public readonly bool OriginateDefaultRoute;
        /// <summary>
        /// The PeerAs param.
        /// </summary>
        public readonly string PeerAs;
        /// <summary>
        /// The PeerIpAddress param.
        /// </summary>
        public readonly string PeerIpAddress;
        /// <summary>
        /// Exchange Routes: exchange-v4-over-v4 stands for Exchange IPv4 routes over IPv4 peering. exchange-v4-v6-over-v4 stands for Exchange both IPv4 and IPv6 routes over IPv4 peering. exchange-v4-over-v4-v6-over-v6 stands for Exchange IPv4 routes over IPv4 peer and IPv6 route over IPv6 peer. exchange-v6-over-v6 stands for Exchange IPv6 routes over IPv6 peering. String must be one of these: `"exchange-v4-over-v4"`, `"exchange-v4-v6-over-v4"`, `"exchange-v4-over-v4-v6-over-v6"`, `"exchange-v6-over-v6"`.
        /// </summary>
        public readonly string PeeringType;
        /// <summary>
        /// The Secret param.
        /// </summary>
        public readonly string Secret;
        /// <summary>
        /// The SummarizeMobileUserRoutes param.
        /// </summary>
        public readonly bool SummarizeMobileUserRoutes;

        [OutputConstructor]
        private GetRemoteNetworkListDataProtocolBgpResult(
            bool doNotExportRoutes,

            bool enable,

            string localIpAddress,

            bool originateDefaultRoute,

            string peerAs,

            string peerIpAddress,

            string peeringType,

            string secret,

            bool summarizeMobileUserRoutes)
        {
            DoNotExportRoutes = doNotExportRoutes;
            Enable = enable;
            LocalIpAddress = localIpAddress;
            OriginateDefaultRoute = originateDefaultRoute;
            PeerAs = peerAs;
            PeerIpAddress = peerIpAddress;
            PeeringType = peeringType;
            Secret = secret;
            SummarizeMobileUserRoutes = summarizeMobileUserRoutes;
        }
    }
}