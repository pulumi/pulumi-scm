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
    public sealed class GetAuthenticationProfileMultiFactorAuthResult
    {
        /// <summary>
        /// The Factors param.
        /// </summary>
        public readonly ImmutableArray<string> Factors;
        /// <summary>
        /// The MfaEnable param.
        /// </summary>
        public readonly bool MfaEnable;

        [OutputConstructor]
        private GetAuthenticationProfileMultiFactorAuthResult(
            ImmutableArray<string> factors,

            bool mfaEnable)
        {
            Factors = factors;
            MfaEnable = mfaEnable;
        }
    }
}
