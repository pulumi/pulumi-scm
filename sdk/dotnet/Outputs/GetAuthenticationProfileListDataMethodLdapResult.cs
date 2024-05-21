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
    public sealed class GetAuthenticationProfileListDataMethodLdapResult
    {
        /// <summary>
        /// The LoginAttribute param.
        /// </summary>
        public readonly string LoginAttribute;
        /// <summary>
        /// The PasswdExpDays param.
        /// </summary>
        public readonly int PasswdExpDays;
        /// <summary>
        /// The ServerProfile param.
        /// </summary>
        public readonly string ServerProfile;

        [OutputConstructor]
        private GetAuthenticationProfileListDataMethodLdapResult(
            string loginAttribute,

            int passwdExpDays,

            string serverProfile)
        {
            LoginAttribute = loginAttribute;
            PasswdExpDays = passwdExpDays;
            ServerProfile = serverProfile;
        }
    }
}
