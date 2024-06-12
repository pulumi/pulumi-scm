// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class ServiceProtocolTcpOverrideArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// tcp session half-close timeout value (in second). Value must be between 1 and 604800. Default: `120`.
        /// </summary>
        [Input("halfcloseTimeout")]
        public Input<int>? HalfcloseTimeout { get; set; }

        /// <summary>
        /// tcp session timeout value (in second). Value must be between 1 and 604800. Default: `3600`.
        /// </summary>
        [Input("timeout")]
        public Input<int>? Timeout { get; set; }

        /// <summary>
        /// tcp session time-wait timeout value (in second). Value must be between 1 and 600. Default: `15`.
        /// </summary>
        [Input("timewaitTimeout")]
        public Input<int>? TimewaitTimeout { get; set; }

        public ServiceProtocolTcpOverrideArgs()
        {
        }
        public static new ServiceProtocolTcpOverrideArgs Empty => new ServiceProtocolTcpOverrideArgs();
    }
}