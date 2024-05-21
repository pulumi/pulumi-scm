// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class HttpHeaderProfileHttpHeaderInsertionTypeHeaderArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Header param.
        /// </summary>
        [Input("header", required: true)]
        public Input<string> Header { get; set; } = null!;

        /// <summary>
        /// The Log param. Default: `false`.
        /// </summary>
        [Input("log")]
        public Input<bool>? Log { get; set; }

        /// <summary>
        /// The Name param.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The Value param.
        /// </summary>
        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public HttpHeaderProfileHttpHeaderInsertionTypeHeaderArgs()
        {
        }
        public static new HttpHeaderProfileHttpHeaderInsertionTypeHeaderArgs Empty => new HttpHeaderProfileHttpHeaderInsertionTypeHeaderArgs();
    }
}
