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
    public sealed class HipObjectFirewall
    {
        /// <summary>
        /// The Criteria param.
        /// </summary>
        public readonly Outputs.HipObjectFirewallCriteria? Criteria;
        /// <summary>
        /// The ExcludeVendor param. Default: `false`.
        /// </summary>
        public readonly bool? ExcludeVendor;
        /// <summary>
        /// Vendor name.
        /// </summary>
        public readonly ImmutableArray<Outputs.HipObjectFirewallVendor> Vendors;

        [OutputConstructor]
        private HipObjectFirewall(
            Outputs.HipObjectFirewallCriteria? criteria,

            bool? excludeVendor,

            ImmutableArray<Outputs.HipObjectFirewallVendor> vendors)
        {
            Criteria = criteria;
            ExcludeVendor = excludeVendor;
            Vendors = vendors;
        }
    }
}
