// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class QosPolicyRuleDscpTosGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("codepoints")]
        private InputList<Inputs.QosPolicyRuleDscpTosCodepointGetArgs>? _codepoints;

        /// <summary>
        /// The Codepoints param.
        /// </summary>
        public InputList<Inputs.QosPolicyRuleDscpTosCodepointGetArgs> Codepoints
        {
            get => _codepoints ?? (_codepoints = new InputList<Inputs.QosPolicyRuleDscpTosCodepointGetArgs>());
            set => _codepoints = value;
        }

        public QosPolicyRuleDscpTosGetArgs()
        {
        }
        public static new QosPolicyRuleDscpTosGetArgs Empty => new QosPolicyRuleDscpTosGetArgs();
    }
}
