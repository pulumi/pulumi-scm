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
    public sealed class GetWildfireAntiVirusProfileListDataResult
    {
        /// <summary>
        /// The Description param.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// UUID of the resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The MlavExceptions param.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetWildfireAntiVirusProfileListDataMlavExceptionResult> MlavExceptions;
        /// <summary>
        /// The Name param. String validation regex: `^[a-zA-Z0-9._-]+$`.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The PacketCapture param.
        /// </summary>
        public readonly bool PacketCapture;
        /// <summary>
        /// The Rules param.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetWildfireAntiVirusProfileListDataRuleResult> Rules;
        /// <summary>
        /// The ThreatExceptions param.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetWildfireAntiVirusProfileListDataThreatExceptionResult> ThreatExceptions;

        [OutputConstructor]
        private GetWildfireAntiVirusProfileListDataResult(
            string description,

            string id,

            ImmutableArray<Outputs.GetWildfireAntiVirusProfileListDataMlavExceptionResult> mlavExceptions,

            string name,

            bool packetCapture,

            ImmutableArray<Outputs.GetWildfireAntiVirusProfileListDataRuleResult> rules,

            ImmutableArray<Outputs.GetWildfireAntiVirusProfileListDataThreatExceptionResult> threatExceptions)
        {
            Description = description;
            Id = id;
            MlavExceptions = mlavExceptions;
            Name = name;
            PacketCapture = packetCapture;
            Rules = rules;
            ThreatExceptions = threatExceptions;
        }
    }
}