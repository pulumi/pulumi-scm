// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class HipObjectCustomChecksCriteriaPlistKeyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Value does not exist or match specified value data. Default: `false`.
        /// </summary>
        [Input("negate")]
        public Input<bool>? Negate { get; set; }

        /// <summary>
        /// Key value. String length must not exceed 1024 characters. String validation regex: `.*`.
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        public HipObjectCustomChecksCriteriaPlistKeyArgs()
        {
        }
        public static new HipObjectCustomChecksCriteriaPlistKeyArgs Empty => new HipObjectCustomChecksCriteriaPlistKeyArgs();
    }
}
