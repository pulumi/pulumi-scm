// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class IkeGatewayPeerIdGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Peer ID string. String length must be between 1 and 1024 characters. String validation regex: `^(.+\@[\*a-zA-Z0-9.-]+)$|^([\*$a-zA-Z0-9_:.-]+)$|^(([[:xdigit:]][[:xdigit:]])+)$|^([a-zA-Z0-9.]+=(\\,|[^,])+[, ]+)*([a-zA-Z0-9.]+=(\\,|[^,])+)$`.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// The Type param. String must be one of these: `"ipaddr"`, `"keyid"`, `"fqdn"`, `"ufqdn"`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public IkeGatewayPeerIdGetArgs()
        {
        }
        public static new IkeGatewayPeerIdGetArgs Empty => new IkeGatewayPeerIdGetArgs();
    }
}
