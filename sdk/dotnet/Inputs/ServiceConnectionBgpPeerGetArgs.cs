// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class ServiceConnectionBgpPeerGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The LocalIpAddress param.
        /// </summary>
        [Input("localIpAddress")]
        public Input<string>? LocalIpAddress { get; set; }

        /// <summary>
        /// The LocalIpv6Address param.
        /// </summary>
        [Input("localIpv6Address")]
        public Input<string>? LocalIpv6Address { get; set; }

        /// <summary>
        /// The PeerIpAddress param.
        /// </summary>
        [Input("peerIpAddress")]
        public Input<string>? PeerIpAddress { get; set; }

        /// <summary>
        /// The PeerIpv6Address param.
        /// </summary>
        [Input("peerIpv6Address")]
        public Input<string>? PeerIpv6Address { get; set; }

        /// <summary>
        /// The SameAsPrimary param.
        /// </summary>
        [Input("sameAsPrimary")]
        public Input<bool>? SameAsPrimary { get; set; }

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

        public ServiceConnectionBgpPeerGetArgs()
        {
        }
        public static new ServiceConnectionBgpPeerGetArgs Empty => new ServiceConnectionBgpPeerGetArgs();
    }
}
