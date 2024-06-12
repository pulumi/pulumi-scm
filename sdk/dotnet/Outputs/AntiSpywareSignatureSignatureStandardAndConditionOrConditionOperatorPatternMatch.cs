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
    public sealed class AntiSpywareSignatureSignatureStandardAndConditionOrConditionOperatorPatternMatch
    {
        /// <summary>
        /// The Context param.
        /// </summary>
        public readonly string? Context;
        /// <summary>
        /// The Negate param. Default: `false`.
        /// </summary>
        public readonly bool? Negate;
        /// <summary>
        /// The Pattern param.
        /// </summary>
        public readonly string? Pattern;
        /// <summary>
        /// The Qualifiers param.
        /// </summary>
        public readonly ImmutableArray<Outputs.AntiSpywareSignatureSignatureStandardAndConditionOrConditionOperatorPatternMatchQualifier> Qualifiers;

        [OutputConstructor]
        private AntiSpywareSignatureSignatureStandardAndConditionOrConditionOperatorPatternMatch(
            string? context,

            bool? negate,

            string? pattern,

            ImmutableArray<Outputs.AntiSpywareSignatureSignatureStandardAndConditionOrConditionOperatorPatternMatchQualifier> qualifiers)
        {
            Context = context;
            Negate = negate;
            Pattern = pattern;
            Qualifiers = qualifiers;
        }
    }
}