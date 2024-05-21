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
    public sealed class GetExternalDynamicListListDataTypeUrlUrlAuthResult
    {
        /// <summary>
        /// The Password param. String length must not exceed 255 characters.
        /// </summary>
        public readonly string Password;
        /// <summary>
        /// The Username param. String length must be between 1 and 255 characters.
        /// </summary>
        public readonly string Username;

        [OutputConstructor]
        private GetExternalDynamicListListDataTypeUrlUrlAuthResult(
            string password,

            string username)
        {
            Password = password;
            Username = username;
        }
    }
}
