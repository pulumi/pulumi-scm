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
    public sealed class GetHipObjectHostInfoCriteriaHostNameResult
    {
        /// <summary>
        /// The Contains param. String length must not exceed 255 characters.
        /// </summary>
        public readonly string Contains;
        /// <summary>
        /// The Is param. String length must not exceed 255 characters.
        /// </summary>
        public readonly string Is;
        /// <summary>
        /// The IsNot param. String length must not exceed 255 characters.
        /// </summary>
        public readonly string IsNot;

        [OutputConstructor]
        private GetHipObjectHostInfoCriteriaHostNameResult(
            string contains,

            string @is,

            string isNot)
        {
            Contains = contains;
            Is = @is;
            IsNot = isNot;
        }
    }
}
