// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class ServiceConnectionProtocolBgpGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The DoNotExportRoutes param.
        /// </summary>
        [Input("doNotExportRoutes")]
        public Input<bool>? DoNotExportRoutes { get; set; }

        /// <summary>
        /// The Enable param.
        /// </summary>
        [Input("enable")]
        public Input<bool>? Enable { get; set; }

        /// <summary>
        /// The FastFailover param.
        /// </summary>
        [Input("fastFailover")]
        public Input<bool>? FastFailover { get; set; }

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

        public ServiceConnectionProtocolBgpGetArgs()
        {
        }
        public static new ServiceConnectionProtocolBgpGetArgs Empty => new ServiceConnectionProtocolBgpGetArgs();
    }
}
