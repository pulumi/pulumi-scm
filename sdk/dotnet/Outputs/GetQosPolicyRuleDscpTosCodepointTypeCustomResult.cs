// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Outputs
{

    [OutputType]
    public sealed class GetQosPolicyRuleDscpTosCodepointTypeCustomResult
    {
        /// <summary>
        /// The Codepoint param.
        /// </summary>
        public readonly Outputs.GetQosPolicyRuleDscpTosCodepointTypeCustomCodepointResult Codepoint;

        [OutputConstructor]
        private GetQosPolicyRuleDscpTosCodepointTypeCustomResult(Outputs.GetQosPolicyRuleDscpTosCodepointTypeCustomCodepointResult codepoint)
        {
            Codepoint = codepoint;
        }
    }
}