// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class HipObjectFirewallArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Criteria param.
        /// </summary>
        [Input("criteria")]
        public Input<Inputs.HipObjectFirewallCriteriaArgs>? Criteria { get; set; }

        /// <summary>
        /// The ExcludeVendor param. Default: `false`.
        /// </summary>
        [Input("excludeVendor")]
        public Input<bool>? ExcludeVendor { get; set; }

        [Input("vendors")]
        private InputList<Inputs.HipObjectFirewallVendorArgs>? _vendors;

        /// <summary>
        /// Vendor name.
        /// </summary>
        public InputList<Inputs.HipObjectFirewallVendorArgs> Vendors
        {
            get => _vendors ?? (_vendors = new InputList<Inputs.HipObjectFirewallVendorArgs>());
            set => _vendors = value;
        }

        public HipObjectFirewallArgs()
        {
        }
        public static new HipObjectFirewallArgs Empty => new HipObjectFirewallArgs();
    }
}