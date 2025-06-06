// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Outputs
{

    [OutputType]
    public sealed class GetIkeGatewayProtocolIkev1Result
    {
        /// <summary>
        /// The Dpd param.
        /// </summary>
        public readonly Outputs.GetIkeGatewayProtocolIkev1DpdResult Dpd;
        /// <summary>
        /// The IkeCryptoProfile param.
        /// </summary>
        public readonly string IkeCryptoProfile;

        [OutputConstructor]
        private GetIkeGatewayProtocolIkev1Result(
            Outputs.GetIkeGatewayProtocolIkev1DpdResult dpd,

            string ikeCryptoProfile)
        {
            Dpd = dpd;
            IkeCryptoProfile = ikeCryptoProfile;
        }
    }
}
