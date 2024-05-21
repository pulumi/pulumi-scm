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
    public sealed class GetHttpHeaderProfileListDataHttpHeaderInsertionResult
    {
        /// <summary>
        /// The Name param.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The Types param.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetHttpHeaderProfileListDataHttpHeaderInsertionTypeResult> Types;

        [OutputConstructor]
        private GetHttpHeaderProfileListDataHttpHeaderInsertionResult(
            string name,

            ImmutableArray<Outputs.GetHttpHeaderProfileListDataHttpHeaderInsertionTypeResult> types)
        {
            Name = name;
            Types = types;
        }
    }
}
