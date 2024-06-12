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
    public sealed class GetRadiusServerProfileListDataProtocolResult
    {
        /// <summary>
        /// The Chap param.
        /// </summary>
        public readonly bool Chap;
        /// <summary>
        /// The EapTtlsWithPap param.
        /// </summary>
        public readonly Outputs.GetRadiusServerProfileListDataProtocolEapTtlsWithPapResult EapTtlsWithPap;
        /// <summary>
        /// The Pap param.
        /// </summary>
        public readonly bool Pap;
        /// <summary>
        /// The PeapMschapV2 param.
        /// </summary>
        public readonly Outputs.GetRadiusServerProfileListDataProtocolPeapMschapV2Result PeapMschapV2;
        /// <summary>
        /// The PeapWithGtc param.
        /// </summary>
        public readonly Outputs.GetRadiusServerProfileListDataProtocolPeapWithGtcResult PeapWithGtc;

        [OutputConstructor]
        private GetRadiusServerProfileListDataProtocolResult(
            bool chap,

            Outputs.GetRadiusServerProfileListDataProtocolEapTtlsWithPapResult eapTtlsWithPap,

            bool pap,

            Outputs.GetRadiusServerProfileListDataProtocolPeapMschapV2Result peapMschapV2,

            Outputs.GetRadiusServerProfileListDataProtocolPeapWithGtcResult peapWithGtc)
        {
            Chap = chap;
            EapTtlsWithPap = eapTtlsWithPap;
            Pap = pap;
            PeapMschapV2 = peapMschapV2;
            PeapWithGtc = peapWithGtc;
        }
    }
}