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
    public sealed class ExternalDynamicListTypeDomain
    {
        /// <summary>
        /// Profile for authenticating client certificates. Default: `"None"`.
        /// </summary>
        public readonly string? CertificateProfile;
        /// <summary>
        /// The Description param. String length must not exceed 255 characters.
        /// </summary>
        public readonly string? Description;
        /// <summary>
        /// The DomainAuth param.
        /// </summary>
        public readonly Outputs.ExternalDynamicListTypeDomainDomainAuth? DomainAuth;
        /// <summary>
        /// The ExceptionList param. Individual elements in this list are subject to additional validation. String length must not exceed 255 characters.
        /// </summary>
        public readonly ImmutableArray<string> ExceptionLists;
        /// <summary>
        /// Enable/Disable expand domain. Default: `false`.
        /// </summary>
        public readonly bool? ExpandDomain;
        /// <summary>
        /// The Recurring param.
        /// </summary>
        public readonly Outputs.ExternalDynamicListTypeDomainRecurring Recurring;
        /// <summary>
        /// The Url param. String length must not exceed 255 characters. Default: `"http://"`.
        /// </summary>
        public readonly string? Url;

        [OutputConstructor]
        private ExternalDynamicListTypeDomain(
            string? certificateProfile,

            string? description,

            Outputs.ExternalDynamicListTypeDomainDomainAuth? domainAuth,

            ImmutableArray<string> exceptionLists,

            bool? expandDomain,

            Outputs.ExternalDynamicListTypeDomainRecurring recurring,

            string? url)
        {
            CertificateProfile = certificateProfile;
            Description = description;
            DomainAuth = domainAuth;
            ExceptionLists = exceptionLists;
            ExpandDomain = expandDomain;
            Recurring = recurring;
            Url = url;
        }
    }
}