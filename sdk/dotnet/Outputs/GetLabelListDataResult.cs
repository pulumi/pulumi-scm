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
    public sealed class GetLabelListDataResult
    {
        /// <summary>
        /// The Description param.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The Id param.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The Name param.
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private GetLabelListDataResult(
            string description,

            string id,

            string name)
        {
            Description = description;
            Id = id;
            Name = name;
        }
    }
}
