// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class QosPolicyRuleDscpTosCodepointTypeCsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Codepoint param.
        /// </summary>
        [Input("codepoint")]
        public Input<string>? Codepoint { get; set; }

        public QosPolicyRuleDscpTosCodepointTypeCsArgs()
        {
        }
        public static new QosPolicyRuleDscpTosCodepointTypeCsArgs Empty => new QosPolicyRuleDscpTosCodepointTypeCsArgs();
    }
}
