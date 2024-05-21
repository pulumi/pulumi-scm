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
    public sealed class GetExternalDynamicListListDataTypeUrlResult
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
        /// The Recurring param.
        /// </summary>
        public readonly Outputs.GetExternalDynamicListListDataTypeUrlRecurringResult Recurring;
        /// <summary>
        /// The Url param. String length must not exceed 255 characters. Default: `"http://"`.
        /// </summary>
        public readonly string Url;
        /// <summary>
        /// The UrlAuth param.
        /// </summary>
        public readonly Outputs.GetExternalDynamicListListDataTypeUrlUrlAuthResult UrlAuth;

        [OutputConstructor]
        private GetExternalDynamicListListDataTypeUrlResult(
            string certificateProfile,

            string description,

            ImmutableArray<string> exceptionLists,

            Outputs.GetExternalDynamicListListDataTypeUrlRecurringResult recurring,

            string url,

            Outputs.GetExternalDynamicListListDataTypeUrlUrlAuthResult urlAuth)
        {
            CertificateProfile = certificateProfile;
            Description = description;
            ExceptionLists = exceptionLists;
            Recurring = recurring;
            Url = url;
            UrlAuth = urlAuth;
        }
    }
}
