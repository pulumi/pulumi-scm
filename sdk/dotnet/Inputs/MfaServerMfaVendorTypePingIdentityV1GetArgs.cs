// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class MfaServerMfaVendorTypePingIdentityV1GetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The PingApiHost param.
        /// </summary>
        [Input("pingApiHost")]
        public Input<string>? PingApiHost { get; set; }

        /// <summary>
        /// The PingBaseuri param.
        /// </summary>
        [Input("pingBaseuri")]
        public Input<string>? PingBaseuri { get; set; }

        /// <summary>
        /// The PingOrg param.
        /// </summary>
        [Input("pingOrg")]
        public Input<string>? PingOrg { get; set; }

        /// <summary>
        /// The PingOrgAlias param.
        /// </summary>
        [Input("pingOrgAlias")]
        public Input<string>? PingOrgAlias { get; set; }

        /// <summary>
        /// The PingTimeout param.
        /// </summary>
        [Input("pingTimeout")]
        public Input<string>? PingTimeout { get; set; }

        /// <summary>
        /// The PingToken param.
        /// </summary>
        [Input("pingToken")]
        public Input<string>? PingToken { get; set; }

        public MfaServerMfaVendorTypePingIdentityV1GetArgs()
        {
        }
        public static new MfaServerMfaVendorTypePingIdentityV1GetArgs Empty => new MfaServerMfaVendorTypePingIdentityV1GetArgs();
    }
}
