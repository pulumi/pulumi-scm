// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class RadiusServerProfileProtocolPeapWithGtcArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The AnonOuterId param.
        /// </summary>
        [Input("anonOuterId")]
        public Input<bool>? AnonOuterId { get; set; }

        /// <summary>
        /// The RadiusCertProfile param.
        /// </summary>
        [Input("radiusCertProfile")]
        public Input<string>? RadiusCertProfile { get; set; }

        public RadiusServerProfileProtocolPeapWithGtcArgs()
        {
        }
        public static new RadiusServerProfileProtocolPeapWithGtcArgs Empty => new RadiusServerProfileProtocolPeapWithGtcArgs();
    }
}
