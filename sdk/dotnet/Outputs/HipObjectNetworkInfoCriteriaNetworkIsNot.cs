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
    public sealed class HipObjectNetworkInfoCriteriaNetworkIsNot
    {
        /// <summary>
        /// The Ethernet param. Ensure that only one of the following is specified: `ethernet`, `mobile`, `unknown`, `wifi`
        /// </summary>
        public readonly bool? Ethernet;
        /// <summary>
        /// The Mobile param. Ensure that only one of the following is specified: `ethernet`, `mobile`, `unknown`, `wifi`
        /// </summary>
        public readonly Outputs.HipObjectNetworkInfoCriteriaNetworkIsNotMobile? Mobile;
        /// <summary>
        /// The Unknown param. Ensure that only one of the following is specified: `ethernet`, `mobile`, `unknown`, `wifi`
        /// </summary>
        public readonly bool? Unknown;
        /// <summary>
        /// The Wifi param. Ensure that only one of the following is specified: `ethernet`, `mobile`, `unknown`, `wifi`
        /// </summary>
        public readonly Outputs.HipObjectNetworkInfoCriteriaNetworkIsNotWifi? Wifi;

        [OutputConstructor]
        private HipObjectNetworkInfoCriteriaNetworkIsNot(
            bool? ethernet,

            Outputs.HipObjectNetworkInfoCriteriaNetworkIsNotMobile? mobile,

            bool? unknown,

            Outputs.HipObjectNetworkInfoCriteriaNetworkIsNotWifi? wifi)
        {
            Ethernet = ethernet;
            Mobile = mobile;
            Unknown = unknown;
            Wifi = wifi;
        }
    }
}
