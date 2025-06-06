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
    public sealed class GetHipObjectListDataCustomChecksCriteriaPlistKeyResult
    {
        /// <summary>
        /// The Name param.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Value does not exist or match specified value data. Default: `false`.
        /// </summary>
        public readonly bool Negate;
        /// <summary>
        /// Key value. String length must not exceed 1024 characters. String validation regex: `.*`.
        /// </summary>
        public readonly string Value;

        [OutputConstructor]
        private GetHipObjectListDataCustomChecksCriteriaPlistKeyResult(
            string name,

            bool negate,

            string value)
        {
            Name = name;
            Negate = negate;
            Value = value;
        }
    }
}
