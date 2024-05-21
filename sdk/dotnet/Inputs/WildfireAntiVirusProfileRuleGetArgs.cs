// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class WildfireAntiVirusProfileRuleGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Analysis param. String must be one of these: `"public-cloud"`, `"private-cloud"`.
        /// </summary>
        [Input("analysis")]
        public Input<string>? Analysis { get; set; }

        [Input("applications")]
        private InputList<string>? _applications;

        /// <summary>
        /// The Applications param.
        /// </summary>
        public InputList<string> Applications
        {
            get => _applications ?? (_applications = new InputList<string>());
            set => _applications = value;
        }

        /// <summary>
        /// The Direction param. String must be one of these: `"download"`, `"upload"`, `"both"`.
        /// </summary>
        [Input("direction")]
        public Input<string>? Direction { get; set; }

        [Input("fileTypes")]
        private InputList<string>? _fileTypes;

        /// <summary>
        /// The FileTypes param.
        /// </summary>
        public InputList<string> FileTypes
        {
            get => _fileTypes ?? (_fileTypes = new InputList<string>());
            set => _fileTypes = value;
        }

        /// <summary>
        /// The Name param.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public WildfireAntiVirusProfileRuleGetArgs()
        {
        }
        public static new WildfireAntiVirusProfileRuleGetArgs Empty => new WildfireAntiVirusProfileRuleGetArgs();
    }
}
