// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class ScepProfileAlgorithmGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Rsa param.
        /// </summary>
        [Input("rsa")]
        public Input<Inputs.ScepProfileAlgorithmRsaGetArgs>? Rsa { get; set; }

        public ScepProfileAlgorithmGetArgs()
        {
        }
        public static new ScepProfileAlgorithmGetArgs Empty => new ScepProfileAlgorithmGetArgs();
    }
}
