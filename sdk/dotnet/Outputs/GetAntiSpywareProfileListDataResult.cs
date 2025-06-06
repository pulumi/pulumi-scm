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
    public sealed class GetAntiSpywareProfileListDataResult
    {
        /// <summary>
        /// The CloudInlineAnalysis param. Default: `false`.
        /// </summary>
        public readonly bool CloudInlineAnalysis;
        /// <summary>
        /// The Description param.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// UUID of the resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The InlineExceptionEdlUrls param.
        /// </summary>
        public readonly ImmutableArray<string> InlineExceptionEdlUrls;
        /// <summary>
        /// The InlineExceptionIpAddresses param.
        /// </summary>
        public readonly ImmutableArray<string> InlineExceptionIpAddresses;
        /// <summary>
        /// The MicaEngineSpywareEnabledList param.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAntiSpywareProfileListDataMicaEngineSpywareEnabledListResult> MicaEngineSpywareEnabledLists;
        /// <summary>
        /// The Name param.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The Rules param.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAntiSpywareProfileListDataRuleResult> Rules;
        /// <summary>
        /// The ThreatExceptions param.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAntiSpywareProfileListDataThreatExceptionResult> ThreatExceptions;

        [OutputConstructor]
        private GetAntiSpywareProfileListDataResult(
            bool cloudInlineAnalysis,

            string description,

            string id,

            ImmutableArray<string> inlineExceptionEdlUrls,

            ImmutableArray<string> inlineExceptionIpAddresses,

            ImmutableArray<Outputs.GetAntiSpywareProfileListDataMicaEngineSpywareEnabledListResult> micaEngineSpywareEnabledLists,

            string name,

            ImmutableArray<Outputs.GetAntiSpywareProfileListDataRuleResult> rules,

            ImmutableArray<Outputs.GetAntiSpywareProfileListDataThreatExceptionResult> threatExceptions)
        {
            CloudInlineAnalysis = cloudInlineAnalysis;
            Description = description;
            Id = id;
            InlineExceptionEdlUrls = inlineExceptionEdlUrls;
            InlineExceptionIpAddresses = inlineExceptionIpAddresses;
            MicaEngineSpywareEnabledLists = micaEngineSpywareEnabledLists;
            Name = name;
            Rules = rules;
            ThreatExceptions = threatExceptions;
        }
    }
}
