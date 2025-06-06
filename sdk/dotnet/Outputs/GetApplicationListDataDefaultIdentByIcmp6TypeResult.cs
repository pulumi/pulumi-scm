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
    public sealed class GetApplicationListDataDefaultIdentByIcmp6TypeResult
    {
        /// <summary>
        /// The Code param.
        /// </summary>
        public readonly string Code;
        /// <summary>
        /// The Type param.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetApplicationListDataDefaultIdentByIcmp6TypeResult(
            string code,

            string type)
        {
            Code = code;
            Type = type;
        }
    }
}
