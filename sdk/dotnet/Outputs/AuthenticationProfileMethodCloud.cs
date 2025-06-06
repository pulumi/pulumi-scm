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
    public sealed class AuthenticationProfileMethodCloud
    {
        /// <summary>
        /// The tenant profile name.
        /// </summary>
        public readonly string? ProfileName;

        [OutputConstructor]
        private AuthenticationProfileMethodCloud(string? profileName)
        {
            ProfileName = profileName;
        }
    }
}
