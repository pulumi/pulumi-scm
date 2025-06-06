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
    public sealed class GetUrlCategoryListDataResult
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
        /// The List param.
        /// </summary>
        public readonly ImmutableArray<string> Lists;
        /// <summary>
        /// The Name param.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The Type param. String must be one of these: `"URL List"`, `"Category Match"`. Default: `"URL List"`.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetUrlCategoryListDataResult(
            string description,

            string id,

            ImmutableArray<string> lists,

            string name,

            string type)
        {
            Description = description;
            Id = id;
            Lists = lists;
            Name = name;
            Type = type;
        }
    }
}
