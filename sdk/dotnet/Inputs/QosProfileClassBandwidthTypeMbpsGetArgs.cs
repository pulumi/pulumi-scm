// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class QosProfileClassBandwidthTypeMbpsGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("classes")]
        private InputList<Inputs.QosProfileClassBandwidthTypeMbpsClassGetArgs>? _classes;

        /// <summary>
        /// QoS setting for traffic classes.
        /// </summary>
        public InputList<Inputs.QosProfileClassBandwidthTypeMbpsClassGetArgs> Classes
        {
            get => _classes ?? (_classes = new InputList<Inputs.QosProfileClassBandwidthTypeMbpsClassGetArgs>());
            set => _classes = value;
        }

        public QosProfileClassBandwidthTypeMbpsGetArgs()
        {
        }
        public static new QosProfileClassBandwidthTypeMbpsGetArgs Empty => new QosProfileClassBandwidthTypeMbpsGetArgs();
    }
}
