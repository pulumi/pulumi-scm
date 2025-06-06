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
    public sealed class DnsSecurityProfileBotnetDomainsListAction
    {
        /// <summary>
        /// The Alert param. Ensure that only one of the following is specified: `alert`, `allow`, `block`, `sinkhole`
        /// </summary>
        public readonly bool? Alert;
        /// <summary>
        /// The Allow param. Ensure that only one of the following is specified: `alert`, `allow`, `block`, `sinkhole`
        /// </summary>
        public readonly bool? Allow;
        /// <summary>
        /// The Block param. Ensure that only one of the following is specified: `alert`, `allow`, `block`, `sinkhole`
        /// </summary>
        public readonly bool? Block;
        /// <summary>
        /// The Sinkhole param. Ensure that only one of the following is specified: `alert`, `allow`, `block`, `sinkhole`
        /// </summary>
        public readonly bool? Sinkhole;

        [OutputConstructor]
        private DnsSecurityProfileBotnetDomainsListAction(
            bool? alert,

            bool? allow,

            bool? block,

            bool? sinkhole)
        {
            Alert = alert;
            Allow = allow;
            Block = block;
            Sinkhole = sinkhole;
        }
    }
}
