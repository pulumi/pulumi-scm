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
    public sealed class GetExternalDynamicListTypeIpResult
    {
        /// <summary>
        /// Profile for authenticating client certificates. Default: `"None"`.
        /// </summary>
        public readonly string CertificateProfile;
        /// <summary>
        /// The Description param. String length must not exceed 255 characters.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The ExceptionList param. Individual elements in this list are subject to additional validation. String length must not exceed 255 characters.
        /// </summary>
        public readonly ImmutableArray<string> ExceptionLists;
        /// <summary>
        /// The IpAuth param.
        /// </summary>
        public readonly Outputs.GetExternalDynamicListTypeIpIpAuthResult IpAuth;
        /// <summary>
        /// The Recurring param.
        /// </summary>
        public readonly Outputs.GetExternalDynamicListTypeIpRecurringResult Recurring;
        /// <summary>
        /// The Url param. String length must not exceed 255 characters. Default: `"http://"`.
        /// </summary>
        public readonly string Url;

        [OutputConstructor]
        private GetExternalDynamicListTypeIpResult(
            string certificateProfile,

            string description,

            ImmutableArray<string> exceptionLists,

            Outputs.GetExternalDynamicListTypeIpIpAuthResult ipAuth,

            Outputs.GetExternalDynamicListTypeIpRecurringResult recurring,

            string url)
        {
            CertificateProfile = certificateProfile;
            Description = description;
            ExceptionLists = exceptionLists;
            IpAuth = ipAuth;
            Recurring = recurring;
            Url = url;
        }
    }
}