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
    public sealed class GetScepProfileAlgorithmRsaResult
    {
        /// <summary>
        /// The RsaNbits param.
        /// </summary>
        public readonly string RsaNbits;

        [OutputConstructor]
        private GetScepProfileAlgorithmRsaResult(string rsaNbits)
        {
            RsaNbits = rsaNbits;
        }
    }
}
