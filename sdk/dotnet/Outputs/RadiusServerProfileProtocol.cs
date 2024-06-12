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
    public sealed class RadiusServerProfileProtocol
    {
        /// <summary>
        /// The Chap param. Ensure that only one of the following is specified: `CHAP`, `EAP_TTLS_with_PAP`, `PAP`, `PEAP_MSCHAPv2`, `PEAP_with_GTC`
        /// </summary>
        public readonly bool? Chap;
        /// <summary>
        /// The EapTtlsWithPap param. Ensure that only one of the following is specified: `CHAP`, `EAP_TTLS_with_PAP`, `PAP`, `PEAP_MSCHAPv2`, `PEAP_with_GTC`
        /// </summary>
        public readonly Outputs.RadiusServerProfileProtocolEapTtlsWithPap? EapTtlsWithPap;
        /// <summary>
        /// The Pap param. Ensure that only one of the following is specified: `CHAP`, `EAP_TTLS_with_PAP`, `PAP`, `PEAP_MSCHAPv2`, `PEAP_with_GTC`
        /// </summary>
        public readonly bool? Pap;
        /// <summary>
        /// The PeapMschapV2 param. Ensure that only one of the following is specified: `CHAP`, `EAP_TTLS_with_PAP`, `PAP`, `PEAP_MSCHAPv2`, `PEAP_with_GTC`
        /// </summary>
        public readonly Outputs.RadiusServerProfileProtocolPeapMschapV2? PeapMschapV2;
        /// <summary>
        /// The PeapWithGtc param. Ensure that only one of the following is specified: `CHAP`, `EAP_TTLS_with_PAP`, `PAP`, `PEAP_MSCHAPv2`, `PEAP_with_GTC`
        /// </summary>
        public readonly Outputs.RadiusServerProfileProtocolPeapWithGtc? PeapWithGtc;

        [OutputConstructor]
        private RadiusServerProfileProtocol(
            bool? chap,

            Outputs.RadiusServerProfileProtocolEapTtlsWithPap? eapTtlsWithPap,

            bool? pap,

            Outputs.RadiusServerProfileProtocolPeapMschapV2? peapMschapV2,

            Outputs.RadiusServerProfileProtocolPeapWithGtc? peapWithGtc)
        {
            Chap = chap;
            EapTtlsWithPap = eapTtlsWithPap;
            Pap = pap;
            PeapMschapV2 = peapMschapV2;
            PeapWithGtc = peapWithGtc;
        }
    }
}