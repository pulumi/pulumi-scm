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
    public sealed class GetMfaServerMfaVendorTypePingIdentityV1Result
    {
        /// <summary>
        /// The PingApiHost param.
        /// </summary>
        public readonly string PingApiHost;
        /// <summary>
        /// The PingBaseuri param.
        /// </summary>
        public readonly string PingBaseuri;
        /// <summary>
        /// The PingOrg param.
        /// </summary>
        public readonly string PingOrg;
        /// <summary>
        /// The PingOrgAlias param.
        /// </summary>
        public readonly string PingOrgAlias;
        /// <summary>
        /// The PingTimeout param.
        /// </summary>
        public readonly string PingTimeout;
        /// <summary>
        /// The PingToken param.
        /// </summary>
        public readonly string PingToken;

        [OutputConstructor]
        private GetMfaServerMfaVendorTypePingIdentityV1Result(
            string pingApiHost,

            string pingBaseuri,

            string pingOrg,

            string pingOrgAlias,

            string pingTimeout,

            string pingToken)
        {
            PingApiHost = pingApiHost;
            PingBaseuri = pingBaseuri;
            PingOrg = pingOrg;
            PingOrgAlias = pingOrgAlias;
            PingTimeout = pingTimeout;
            PingToken = pingToken;
        }
    }
}
