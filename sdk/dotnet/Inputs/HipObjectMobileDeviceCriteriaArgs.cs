// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class HipObjectMobileDeviceCriteriaArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Applications param.
        /// </summary>
        [Input("applications")]
        public Input<Inputs.HipObjectMobileDeviceCriteriaApplicationsArgs>? Applications { get; set; }

        /// <summary>
        /// If device's disk is encrypted.
        /// </summary>
        [Input("diskEncrypted")]
        public Input<bool>? DiskEncrypted { get; set; }

        /// <summary>
        /// The Imei param.
        /// </summary>
        [Input("imei")]
        public Input<Inputs.HipObjectMobileDeviceCriteriaImeiArgs>? Imei { get; set; }

        /// <summary>
        /// If device is by rooted/jailbroken.
        /// </summary>
        [Input("jailbroken")]
        public Input<bool>? Jailbroken { get; set; }

        /// <summary>
        /// The LastCheckinTime param.
        /// </summary>
        [Input("lastCheckinTime")]
        public Input<Inputs.HipObjectMobileDeviceCriteriaLastCheckinTimeArgs>? LastCheckinTime { get; set; }

        /// <summary>
        /// The Model param.
        /// </summary>
        [Input("model")]
        public Input<Inputs.HipObjectMobileDeviceCriteriaModelArgs>? Model { get; set; }

        /// <summary>
        /// If device's passcode is present.
        /// </summary>
        [Input("passcodeSet")]
        public Input<bool>? PasscodeSet { get; set; }

        /// <summary>
        /// The PhoneNumber param.
        /// </summary>
        [Input("phoneNumber")]
        public Input<Inputs.HipObjectMobileDeviceCriteriaPhoneNumberArgs>? PhoneNumber { get; set; }

        /// <summary>
        /// The Tag param.
        /// </summary>
        [Input("tag")]
        public Input<Inputs.HipObjectMobileDeviceCriteriaTagArgs>? Tag { get; set; }

        public HipObjectMobileDeviceCriteriaArgs()
        {
        }
        public static new HipObjectMobileDeviceCriteriaArgs Empty => new HipObjectMobileDeviceCriteriaArgs();
    }
}
