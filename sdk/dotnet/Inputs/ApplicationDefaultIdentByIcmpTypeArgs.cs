// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class ApplicationDefaultIdentByIcmpTypeArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Code param.
        /// </summary>
        [Input("code")]
        public Input<string>? Code { get; set; }

        /// <summary>
        /// The Type param.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public ApplicationDefaultIdentByIcmpTypeArgs()
        {
        }
        public static new ApplicationDefaultIdentByIcmpTypeArgs Empty => new ApplicationDefaultIdentByIcmpTypeArgs();
    }
}