// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class IpsecTunnelAutoKeyProxyIdGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Local param.
        /// </summary>
        [Input("local")]
        public Input<string>? Local { get; set; }

        /// <summary>
        /// The Name param.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The Protocol param.
        /// </summary>
        [Input("protocol")]
        public Input<Inputs.IpsecTunnelAutoKeyProxyIdProtocolGetArgs>? Protocol { get; set; }

        /// <summary>
        /// The Remote param.
        /// </summary>
        [Input("remote")]
        public Input<string>? Remote { get; set; }

        public IpsecTunnelAutoKeyProxyIdGetArgs()
        {
        }
        public static new IpsecTunnelAutoKeyProxyIdGetArgs Empty => new IpsecTunnelAutoKeyProxyIdGetArgs();
    }
}
