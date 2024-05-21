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
    public sealed class GetQosPolicyRuleListDataDscpTosCodepointTypeResult
    {
        /// <summary>
        /// The Af param.
        /// </summary>
        public readonly Outputs.GetQosPolicyRuleListDataDscpTosCodepointTypeAfResult Af;
        /// <summary>
        /// The Cs param.
        /// </summary>
        public readonly Outputs.GetQosPolicyRuleListDataDscpTosCodepointTypeCsResult Cs;
        /// <summary>
        /// The Custom param.
        /// </summary>
        public readonly Outputs.GetQosPolicyRuleListDataDscpTosCodepointTypeCustomResult Custom;
        /// <summary>
        /// The Ef param.
        /// </summary>
        public readonly bool Ef;
        /// <summary>
        /// The Tos param.
        /// </summary>
        public readonly Outputs.GetQosPolicyRuleListDataDscpTosCodepointTypeTosResult Tos;

        [OutputConstructor]
        private GetQosPolicyRuleListDataDscpTosCodepointTypeResult(
            Outputs.GetQosPolicyRuleListDataDscpTosCodepointTypeAfResult af,

            Outputs.GetQosPolicyRuleListDataDscpTosCodepointTypeCsResult cs,

            Outputs.GetQosPolicyRuleListDataDscpTosCodepointTypeCustomResult custom,

            bool ef,

            Outputs.GetQosPolicyRuleListDataDscpTosCodepointTypeTosResult tos)
        {
            Af = af;
            Cs = cs;
            Custom = custom;
            Ef = ef;
            Tos = tos;
        }
    }
}
