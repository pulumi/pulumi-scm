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
    public sealed class GetServiceConnectionGroupListDataResult
    {
        /// <summary>
        /// The DisableSnat param.
        /// </summary>
        public readonly bool DisableSnat;
        /// <summary>
        /// UUID of the resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The Name param.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The PbfOnly param.
        /// </summary>
        public readonly bool PbfOnly;
        /// <summary>
        /// The Targets param.
        /// </summary>
        public readonly ImmutableArray<string> Targets;

        [OutputConstructor]
        private GetServiceConnectionGroupListDataResult(
            bool disableSnat,

            string id,

            string name,

            bool pbfOnly,

            ImmutableArray<string> targets)
        {
            DisableSnat = disableSnat;
            Id = id;
            Name = name;
            PbfOnly = pbfOnly;
            Targets = targets;
        }
    }
}