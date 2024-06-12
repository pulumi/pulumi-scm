// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class TrafficSteeringRuleActionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Forward param. Ensure that only one of the following is specified: `forward`, `no-pbf`
        /// </summary>
        [Input("forward")]
        public Input<Inputs.TrafficSteeringRuleActionForwardArgs>? Forward { get; set; }

        /// <summary>
        /// The NoPbf param. Ensure that only one of the following is specified: `forward`, `no-pbf`
        /// </summary>
        [Input("noPbf")]
        public Input<bool>? NoPbf { get; set; }

        public TrafficSteeringRuleActionArgs()
        {
        }
        public static new TrafficSteeringRuleActionArgs Empty => new TrafficSteeringRuleActionArgs();
    }
}