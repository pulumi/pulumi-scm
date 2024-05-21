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
    public sealed class GetAuthenticationSequenceListDataResult
    {
        /// <summary>
        /// The AuthenticationProfiles param.
        /// </summary>
        public readonly ImmutableArray<string> AuthenticationProfiles;
        /// <summary>
        /// UUID of the resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The Name param.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The UseDomainFindProfile param. Default: `true`.
        /// </summary>
        public readonly bool UseDomainFindProfile;

        [OutputConstructor]
        private GetAuthenticationSequenceListDataResult(
            ImmutableArray<string> authenticationProfiles,

            string id,

            string name,

            bool useDomainFindProfile)
        {
            AuthenticationProfiles = authenticationProfiles;
            Id = id;
            Name = name;
            UseDomainFindProfile = useDomainFindProfile;
        }
    }
}
