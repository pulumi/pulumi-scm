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
    public sealed class GetIkeGatewayProtocolResult
    {
        /// <summary>
        /// The Ikev1 param.
        /// </summary>
        public readonly Outputs.GetIkeGatewayProtocolIkev1Result Ikev1;
        /// <summary>
        /// The Ikev2 param.
        /// </summary>
        public readonly Outputs.GetIkeGatewayProtocolIkev2Result Ikev2;
        /// <summary>
        /// The Version param. String must be one of these: `"ikev2-preferred"`, `"ikev1"`, `"ikev2"`. Default: `"ikev2-preferred"`.
        /// </summary>
        public readonly string Version;

        [OutputConstructor]
        private GetIkeGatewayProtocolResult(
            Outputs.GetIkeGatewayProtocolIkev1Result ikev1,

            Outputs.GetIkeGatewayProtocolIkev2Result ikev2,

            string version)
        {
            Ikev1 = ikev1;
            Ikev2 = ikev2;
            Version = version;
        }
    }
}
