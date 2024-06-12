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
    public sealed class GetAuthenticationProfileMethodResult
    {
        /// <summary>
        /// The Cloud param.
        /// </summary>
        public readonly Outputs.GetAuthenticationProfileMethodCloudResult Cloud;
        /// <summary>
        /// The Kerberos param.
        /// </summary>
        public readonly Outputs.GetAuthenticationProfileMethodKerberosResult Kerberos;
        /// <summary>
        /// The Ldap param.
        /// </summary>
        public readonly Outputs.GetAuthenticationProfileMethodLdapResult Ldap;
        /// <summary>
        /// The LocalDatabase param.
        /// </summary>
        public readonly bool LocalDatabase;
        /// <summary>
        /// The Radius param.
        /// </summary>
        public readonly Outputs.GetAuthenticationProfileMethodRadiusResult Radius;
        /// <summary>
        /// The SamlIdp param.
        /// </summary>
        public readonly Outputs.GetAuthenticationProfileMethodSamlIdpResult SamlIdp;
        /// <summary>
        /// The Tacplus param.
        /// </summary>
        public readonly Outputs.GetAuthenticationProfileMethodTacplusResult Tacplus;

        [OutputConstructor]
        private GetAuthenticationProfileMethodResult(
            Outputs.GetAuthenticationProfileMethodCloudResult cloud,

            Outputs.GetAuthenticationProfileMethodKerberosResult kerberos,

            Outputs.GetAuthenticationProfileMethodLdapResult ldap,

            bool localDatabase,

            Outputs.GetAuthenticationProfileMethodRadiusResult radius,

            Outputs.GetAuthenticationProfileMethodSamlIdpResult samlIdp,

            Outputs.GetAuthenticationProfileMethodTacplusResult tacplus)
        {
            Cloud = cloud;
            Kerberos = kerberos;
            Ldap = ldap;
            LocalDatabase = localDatabase;
            Radius = radius;
            SamlIdp = samlIdp;
            Tacplus = tacplus;
        }
    }
}