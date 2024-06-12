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
    public sealed class ServiceConnectionBgpPeer
    {
        /// <summary>
        /// The LocalIpAddress param.
        /// </summary>
        public readonly string? LocalIpAddress;
        /// <summary>
        /// The LocalIpv6Address param.
        /// </summary>
        public readonly string? LocalIpv6Address;
        /// <summary>
        /// The PeerIpAddress param.
        /// </summary>
        public readonly string? PeerIpAddress;
        /// <summary>
        /// The PeerIpv6Address param.
        /// </summary>
        public readonly string? PeerIpv6Address;
        /// <summary>
        /// The SameAsPrimary param.
        /// </summary>
        public readonly bool? SameAsPrimary;
        /// <summary>
        /// The Secret param.
        /// </summary>
        public readonly string? Secret;

        [OutputConstructor]
        private ServiceConnectionBgpPeer(
            string? localIpAddress,

            string? localIpv6Address,

            string? peerIpAddress,

            string? peerIpv6Address,

            bool? sameAsPrimary,

            string? secret)
        {
            LocalIpAddress = localIpAddress;
            LocalIpv6Address = localIpv6Address;
            PeerIpAddress = peerIpAddress;
            PeerIpv6Address = peerIpv6Address;
            SameAsPrimary = sameAsPrimary;
            Secret = secret;
        }
    }
}