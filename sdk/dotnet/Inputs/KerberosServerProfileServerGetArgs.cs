// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class KerberosServerProfileServerGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Host param.
        /// </summary>
        [Input("host")]
        public Input<string>? Host { get; set; }

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

        public KerberosServerProfileServerGetArgs()
        {
        }
        public static new KerberosServerProfileServerGetArgs Empty => new KerberosServerProfileServerGetArgs();
    }
}
