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
    public sealed class IpsecTunnelAutoKeyProxyId
    {
        /// <summary>
        /// The Local param.
        /// </summary>
        public readonly string? Local;
        /// <summary>
        /// The Name param.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The Protocol param.
        /// </summary>
        public readonly Outputs.IpsecTunnelAutoKeyProxyIdProtocol? Protocol;
        /// <summary>
        /// The Remote param.
        /// </summary>
        public readonly string? Remote;

        [OutputConstructor]
        private IpsecTunnelAutoKeyProxyId(
            string? local,

            string name,

            Outputs.IpsecTunnelAutoKeyProxyIdProtocol? protocol,

            string? remote)
        {
            Local = local;
            Name = name;
            Protocol = protocol;
            Remote = remote;
        }
    }
}
