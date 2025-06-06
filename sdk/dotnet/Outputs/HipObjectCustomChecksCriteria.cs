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
    public sealed class HipObjectCustomChecksCriteria
    {
        /// <summary>
        /// The Plist param.
        /// </summary>
        public readonly ImmutableArray<Outputs.HipObjectCustomChecksCriteriaPlist> Plists;
        /// <summary>
        /// The ProcessList param.
        /// </summary>
        public readonly ImmutableArray<Outputs.HipObjectCustomChecksCriteriaProcessList> ProcessLists;
        /// <summary>
        /// The RegistryKeys param.
        /// </summary>
        public readonly ImmutableArray<Outputs.HipObjectCustomChecksCriteriaRegistryKey> RegistryKeys;

        [OutputConstructor]
        private HipObjectCustomChecksCriteria(
            ImmutableArray<Outputs.HipObjectCustomChecksCriteriaPlist> plists,

            ImmutableArray<Outputs.HipObjectCustomChecksCriteriaProcessList> processLists,

            ImmutableArray<Outputs.HipObjectCustomChecksCriteriaRegistryKey> registryKeys)
        {
            Plists = plists;
            ProcessLists = processLists;
            RegistryKeys = registryKeys;
        }
    }
}
