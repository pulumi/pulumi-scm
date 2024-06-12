// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class IkeGatewayAuthenticationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Certificate param. Ensure that only one of the following is specified: `certificate`, `pre_shared_key`
        /// </summary>
        [Input("certificate")]
        public Input<Inputs.IkeGatewayAuthenticationCertificateArgs>? Certificate { get; set; }

        /// <summary>
        /// The PreSharedKey param. Ensure that only one of the following is specified: `certificate`, `pre_shared_key`
        /// </summary>
        [Input("preSharedKey")]
        public Input<Inputs.IkeGatewayAuthenticationPreSharedKeyArgs>? PreSharedKey { get; set; }

        public IkeGatewayAuthenticationArgs()
        {
        }
        public static new IkeGatewayAuthenticationArgs Empty => new IkeGatewayAuthenticationArgs();
    }
}