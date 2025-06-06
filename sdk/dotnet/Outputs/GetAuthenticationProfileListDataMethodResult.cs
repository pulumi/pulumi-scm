// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Outputs
{

    [OutputType]
    public sealed class GetAuthenticationProfileListDataMethodResult
    {
        /// <summary>
        /// The Cloud param.
        /// </summary>
        public readonly Outputs.GetAuthenticationProfileListDataMethodCloudResult Cloud;
        /// <summary>
        /// The Kerberos param.
        /// </summary>
        public readonly Outputs.GetAuthenticationProfileListDataMethodKerberosResult Kerberos;
        /// <summary>
        /// The Ldap param.
        /// </summary>
        public readonly Outputs.GetAuthenticationProfileListDataMethodLdapResult Ldap;
        /// <summary>
        /// The LocalDatabase param.
        /// </summary>
        public readonly bool LocalDatabase;
        /// <summary>
        /// The Radius param.
        /// </summary>
        public readonly Outputs.GetAuthenticationProfileListDataMethodRadiusResult Radius;
        /// <summary>
        /// The SamlIdp param.
        /// </summary>
        public readonly Outputs.GetAuthenticationProfileListDataMethodSamlIdpResult SamlIdp;
        /// <summary>
        /// The Tacplus param.
        /// </summary>
        public readonly Outputs.GetAuthenticationProfileListDataMethodTacplusResult Tacplus;

        [OutputConstructor]
        private GetAuthenticationProfileListDataMethodResult(
            Outputs.GetAuthenticationProfileListDataMethodCloudResult cloud,

            Outputs.GetAuthenticationProfileListDataMethodKerberosResult kerberos,

            Outputs.GetAuthenticationProfileListDataMethodLdapResult ldap,

            bool localDatabase,

            Outputs.GetAuthenticationProfileListDataMethodRadiusResult radius,

            Outputs.GetAuthenticationProfileListDataMethodSamlIdpResult samlIdp,

            Outputs.GetAuthenticationProfileListDataMethodTacplusResult tacplus)
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
