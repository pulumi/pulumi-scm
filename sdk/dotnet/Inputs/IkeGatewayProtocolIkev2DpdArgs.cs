// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class IkeGatewayProtocolIkev2DpdArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Enable param.
        /// </summary>
        [Input("enable")]
        public Input<bool>? Enable { get; set; }

        public IkeGatewayProtocolIkev2DpdArgs()
        {
        }
        public static new IkeGatewayProtocolIkev2DpdArgs Empty => new IkeGatewayProtocolIkev2DpdArgs();
    }
}
