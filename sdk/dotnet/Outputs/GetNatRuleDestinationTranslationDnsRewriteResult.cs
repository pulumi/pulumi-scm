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
    public sealed class GetNatRuleDestinationTranslationDnsRewriteResult
    {
        /// <summary>
        /// The Direction param. String must be one of these: `"reverse"`, `"forward"`. Default: `"reverse"`.
        /// </summary>
        public readonly string Direction;

        [OutputConstructor]
        private GetNatRuleDestinationTranslationDnsRewriteResult(string direction)
        {
            Direction = direction;
        }
    }
}
