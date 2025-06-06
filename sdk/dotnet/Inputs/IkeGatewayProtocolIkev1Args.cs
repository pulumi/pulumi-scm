// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class IkeGatewayProtocolIkev1Args : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Dpd param.
        /// </summary>
        [Input("dpd")]
        public Input<Inputs.IkeGatewayProtocolIkev1DpdArgs>? Dpd { get; set; }

        /// <summary>
        /// The IkeCryptoProfile param.
        /// </summary>
        [Input("ikeCryptoProfile")]
        public Input<string>? IkeCryptoProfile { get; set; }

        public IkeGatewayProtocolIkev1Args()
        {
        }
        public static new IkeGatewayProtocolIkev1Args Empty => new IkeGatewayProtocolIkev1Args();
    }
}
