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
    public sealed class MfaServerMfaVendorTypeDuoSecurityV2
    {
        /// <summary>
        /// The DuoApiHost param.
        /// </summary>
        public readonly string? DuoApiHost;
        /// <summary>
        /// The DuoBaseuri param.
        /// </summary>
        public readonly string? DuoBaseuri;
        /// <summary>
        /// The DuoIntegrationKey param.
        /// </summary>
        public readonly string? DuoIntegrationKey;
        /// <summary>
        /// The DuoSecretKey param.
        /// </summary>
        public readonly string? DuoSecretKey;
        /// <summary>
        /// The DuoTimeout param.
        /// </summary>
        public readonly string? DuoTimeout;

        [OutputConstructor]
        private MfaServerMfaVendorTypeDuoSecurityV2(
            string? duoApiHost,

            string? duoBaseuri,

            string? duoIntegrationKey,

            string? duoSecretKey,

            string? duoTimeout)
        {
            DuoApiHost = duoApiHost;
            DuoBaseuri = duoBaseuri;
            DuoIntegrationKey = duoIntegrationKey;
            DuoSecretKey = duoSecretKey;
            DuoTimeout = duoTimeout;
        }
    }
}