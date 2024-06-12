// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class RadiusServerProfileProtocolGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Chap param. Ensure that only one of the following is specified: `CHAP`, `EAP_TTLS_with_PAP`, `PAP`, `PEAP_MSCHAPv2`, `PEAP_with_GTC`
        /// </summary>
        [Input("chap")]
        public Input<bool>? Chap { get; set; }

        /// <summary>
        /// The EapTtlsWithPap param. Ensure that only one of the following is specified: `CHAP`, `EAP_TTLS_with_PAP`, `PAP`, `PEAP_MSCHAPv2`, `PEAP_with_GTC`
        /// </summary>
        [Input("eapTtlsWithPap")]
        public Input<Inputs.RadiusServerProfileProtocolEapTtlsWithPapGetArgs>? EapTtlsWithPap { get; set; }

        /// <summary>
        /// The Pap param. Ensure that only one of the following is specified: `CHAP`, `EAP_TTLS_with_PAP`, `PAP`, `PEAP_MSCHAPv2`, `PEAP_with_GTC`
        /// </summary>
        [Input("pap")]
        public Input<bool>? Pap { get; set; }

        /// <summary>
        /// The PeapMschapV2 param. Ensure that only one of the following is specified: `CHAP`, `EAP_TTLS_with_PAP`, `PAP`, `PEAP_MSCHAPv2`, `PEAP_with_GTC`
        /// </summary>
        [Input("peapMschapV2")]
        public Input<Inputs.RadiusServerProfileProtocolPeapMschapV2GetArgs>? PeapMschapV2 { get; set; }

        /// <summary>
        /// The PeapWithGtc param. Ensure that only one of the following is specified: `CHAP`, `EAP_TTLS_with_PAP`, `PAP`, `PEAP_MSCHAPv2`, `PEAP_with_GTC`
        /// </summary>
        [Input("peapWithGtc")]
        public Input<Inputs.RadiusServerProfileProtocolPeapWithGtcGetArgs>? PeapWithGtc { get; set; }

        public RadiusServerProfileProtocolGetArgs()
        {
        }
        public static new RadiusServerProfileProtocolGetArgs Empty => new RadiusServerProfileProtocolGetArgs();
    }
}