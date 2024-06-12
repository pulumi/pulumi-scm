// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Outputs
{

    [OutputType]
    public sealed class GetHipObjectListDataCustomChecksCriteriaPlistResult
    {
        /// <summary>
        /// The Keys param.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetHipObjectListDataCustomChecksCriteriaPlistKeyResult> Keys;
        /// <summary>
        /// The Name param.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Plist does not exist. Default: `false`.
        /// </summary>
        public readonly bool Negate;

        [OutputConstructor]
        private GetHipObjectListDataCustomChecksCriteriaPlistResult(
            ImmutableArray<Outputs.GetHipObjectListDataCustomChecksCriteriaPlistKeyResult> keys,

            string name,

            bool negate)
        {
            Keys = keys;
            Name = name;
            Negate = negate;
        }
    }
}