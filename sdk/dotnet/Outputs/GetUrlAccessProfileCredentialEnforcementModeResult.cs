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
    public sealed class GetUrlAccessProfileCredentialEnforcementModeResult
    {
        /// <summary>
        /// The Disabled param.
        /// </summary>
        public readonly bool Disabled;
        /// <summary>
        /// The DomainCredentials param.
        /// </summary>
        public readonly bool DomainCredentials;
        /// <summary>
        /// The GroupMapping param.
        /// </summary>
        public readonly string GroupMapping;
        /// <summary>
        /// The IpUser param.
        /// </summary>
        public readonly bool IpUser;

        [OutputConstructor]
        private GetUrlAccessProfileCredentialEnforcementModeResult(
            bool disabled,

            bool domainCredentials,

            string groupMapping,

            bool ipUser)
        {
            Disabled = disabled;
            DomainCredentials = domainCredentials;
            GroupMapping = groupMapping;
            IpUser = ipUser;
        }
    }
}
