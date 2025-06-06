// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class HipObjectNetworkInfoCriteriaNetworkArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Is param. Ensure that only one of the following is specified: `is`, `is_not`
        /// </summary>
        [Input("is")]
        public Input<Inputs.HipObjectNetworkInfoCriteriaNetworkIsArgs>? Is { get; set; }

        /// <summary>
        /// The IsNot param. Ensure that only one of the following is specified: `is`, `is_not`
        /// </summary>
        [Input("isNot")]
        public Input<Inputs.HipObjectNetworkInfoCriteriaNetworkIsNotArgs>? IsNot { get; set; }

        public HipObjectNetworkInfoCriteriaNetworkArgs()
        {
        }
        public static new HipObjectNetworkInfoCriteriaNetworkArgs Empty => new HipObjectNetworkInfoCriteriaNetworkArgs();
    }
}
