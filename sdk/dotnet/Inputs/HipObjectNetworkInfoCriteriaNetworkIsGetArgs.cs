// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class HipObjectNetworkInfoCriteriaNetworkIsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Mobile param. Ensure that only one of the following is specified: `mobile`, `unknown`, `wifi`
        /// </summary>
        [Input("mobile")]
        public Input<Inputs.HipObjectNetworkInfoCriteriaNetworkIsMobileGetArgs>? Mobile { get; set; }

        /// <summary>
        /// The Unknown param. Ensure that only one of the following is specified: `mobile`, `unknown`, `wifi`
        /// </summary>
        [Input("unknown")]
        public Input<bool>? Unknown { get; set; }

        /// <summary>
        /// The Wifi param. Ensure that only one of the following is specified: `mobile`, `unknown`, `wifi`
        /// </summary>
        [Input("wifi")]
        public Input<Inputs.HipObjectNetworkInfoCriteriaNetworkIsWifiGetArgs>? Wifi { get; set; }

        public HipObjectNetworkInfoCriteriaNetworkIsGetArgs()
        {
        }
        public static new HipObjectNetworkInfoCriteriaNetworkIsGetArgs Empty => new HipObjectNetworkInfoCriteriaNetworkIsGetArgs();
    }
}