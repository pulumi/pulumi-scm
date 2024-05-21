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
    public sealed class GetCertificateProfileListDataUsernameFieldResult
    {
        /// <summary>
        /// The Subject param. String must be one of these: `"common-name"`.
        /// </summary>
        public readonly string Subject;
        /// <summary>
        /// The SubjectAlt param. String must be one of these: `"email"`.
        /// </summary>
        public readonly string SubjectAlt;

        [OutputConstructor]
        private GetCertificateProfileListDataUsernameFieldResult(
            string subject,

            string subjectAlt)
        {
            Subject = subject;
            SubjectAlt = subjectAlt;
        }
    }
}
