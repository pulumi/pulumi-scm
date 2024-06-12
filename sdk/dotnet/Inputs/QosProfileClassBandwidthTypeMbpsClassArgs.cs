// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class QosProfileClassBandwidthTypeMbpsClassArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ClassBandwidth param.
        /// </summary>
        [Input("classBandwidth")]
        public Input<Inputs.QosProfileClassBandwidthTypeMbpsClassClassBandwidthArgs>? ClassBandwidth { get; set; }

        /// <summary>
        /// Traffic class. String length must not exceed 31 characters.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// traffic class priority. String must be one of these: `"real-time"`, `"high"`, `"medium"`, `"low"`. Default: `"medium"`.
        /// </summary>
        [Input("priority")]
        public Input<string>? Priority { get; set; }

        public QosProfileClassBandwidthTypeMbpsClassArgs()
        {
        }
        public static new QosProfileClassBandwidthTypeMbpsClassArgs Empty => new QosProfileClassBandwidthTypeMbpsClassArgs();
    }
}