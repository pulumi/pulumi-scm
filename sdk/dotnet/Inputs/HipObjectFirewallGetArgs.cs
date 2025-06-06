// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class HipObjectFirewallGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Criteria param.
        /// </summary>
        [Input("criteria")]
        public Input<Inputs.HipObjectFirewallCriteriaGetArgs>? Criteria { get; set; }

        /// <summary>
        /// The ExcludeVendor param. Default: `false`.
        /// </summary>
        [Input("excludeVendor")]
        public Input<bool>? ExcludeVendor { get; set; }

        [Input("vendors")]
        private InputList<Inputs.HipObjectFirewallVendorGetArgs>? _vendors;

        /// <summary>
        /// Vendor name.
        /// </summary>
        public InputList<Inputs.HipObjectFirewallVendorGetArgs> Vendors
        {
            get => _vendors ?? (_vendors = new InputList<Inputs.HipObjectFirewallVendorGetArgs>());
            set => _vendors = value;
        }

        public HipObjectFirewallGetArgs()
        {
        }
        public static new HipObjectFirewallGetArgs Empty => new HipObjectFirewallGetArgs();
    }
}
