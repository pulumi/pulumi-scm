// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class MfaServerMfaVendorTypeOktaAdaptiveV1Args : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The OktaApiHost param.
        /// </summary>
        [Input("oktaApiHost")]
        public Input<string>? OktaApiHost { get; set; }

        /// <summary>
        /// The OktaBaseuri param.
        /// </summary>
        [Input("oktaBaseuri")]
        public Input<string>? OktaBaseuri { get; set; }

        /// <summary>
        /// The OktaOrg param.
        /// </summary>
        [Input("oktaOrg")]
        public Input<string>? OktaOrg { get; set; }

        /// <summary>
        /// The OktaTimeout param.
        /// </summary>
        [Input("oktaTimeout")]
        public Input<string>? OktaTimeout { get; set; }

        /// <summary>
        /// The OktaToken param.
        /// </summary>
        [Input("oktaToken")]
        public Input<string>? OktaToken { get; set; }

        public MfaServerMfaVendorTypeOktaAdaptiveV1Args()
        {
        }
        public static new MfaServerMfaVendorTypeOktaAdaptiveV1Args Empty => new MfaServerMfaVendorTypeOktaAdaptiveV1Args();
    }
}