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
    public sealed class GetHipObjectListDataCertificateCriteriaCertificateAttributeResult
    {
        /// <summary>
        /// The Name param.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Key value. String length must not exceed 1024 characters. String validation regex: `.*`.
        /// </summary>
        public readonly string Value;

        [OutputConstructor]
        private GetHipObjectListDataCertificateCriteriaCertificateAttributeResult(
            string name,

            string value)
        {
            Name = name;
            Value = value;
        }
    }
}
