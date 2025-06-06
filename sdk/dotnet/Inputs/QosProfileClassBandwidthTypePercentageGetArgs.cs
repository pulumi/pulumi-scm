// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class QosProfileClassBandwidthTypePercentageGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("classes")]
        private InputList<Inputs.QosProfileClassBandwidthTypePercentageClassGetArgs>? _classes;

        /// <summary>
        /// QoS setting for traffic classes.
        /// </summary>
        public InputList<Inputs.QosProfileClassBandwidthTypePercentageClassGetArgs> Classes
        {
            get => _classes ?? (_classes = new InputList<Inputs.QosProfileClassBandwidthTypePercentageClassGetArgs>());
            set => _classes = value;
        }

        public QosProfileClassBandwidthTypePercentageGetArgs()
        {
        }
        public static new QosProfileClassBandwidthTypePercentageGetArgs Empty => new QosProfileClassBandwidthTypePercentageGetArgs();
    }
}
