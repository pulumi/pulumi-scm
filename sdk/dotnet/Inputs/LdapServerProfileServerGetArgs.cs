// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class LdapServerProfileServerGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Address param.
        /// </summary>
        [Input("address")]
        public Input<string>? Address { get; set; }

        /// <summary>
        /// The Name param.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The Port param. Value must be between 1 and 65535.
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        public LdapServerProfileServerGetArgs()
        {
        }
        public static new LdapServerProfileServerGetArgs Empty => new LdapServerProfileServerGetArgs();
    }
}
