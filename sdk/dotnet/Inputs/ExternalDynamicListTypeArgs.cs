// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class ExternalDynamicListTypeArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Domain param. Ensure that only one of the following is specified: `domain`, `imei`, `imsi`, `ip`, `predefined_ip`, `predefined_url`, `url`
        /// </summary>
        [Input("domain")]
        public Input<Inputs.ExternalDynamicListTypeDomainArgs>? Domain { get; set; }

        /// <summary>
        /// The Imei param. Ensure that only one of the following is specified: `domain`, `imei`, `imsi`, `ip`, `predefined_ip`, `predefined_url`, `url`
        /// </summary>
        [Input("imei")]
        public Input<Inputs.ExternalDynamicListTypeImeiArgs>? Imei { get; set; }

        /// <summary>
        /// The Imsi param. Ensure that only one of the following is specified: `domain`, `imei`, `imsi`, `ip`, `predefined_ip`, `predefined_url`, `url`
        /// </summary>
        [Input("imsi")]
        public Input<Inputs.ExternalDynamicListTypeImsiArgs>? Imsi { get; set; }

        /// <summary>
        /// The Ip param. Ensure that only one of the following is specified: `domain`, `imei`, `imsi`, `ip`, `predefined_ip`, `predefined_url`, `url`
        /// </summary>
        [Input("ip")]
        public Input<Inputs.ExternalDynamicListTypeIpArgs>? Ip { get; set; }

        /// <summary>
        /// The PredefinedIp param. Ensure that only one of the following is specified: `domain`, `imei`, `imsi`, `ip`, `predefined_ip`, `predefined_url`, `url`
        /// </summary>
        [Input("predefinedIp")]
        public Input<Inputs.ExternalDynamicListTypePredefinedIpArgs>? PredefinedIp { get; set; }

        /// <summary>
        /// The PredefinedUrl param. Ensure that only one of the following is specified: `domain`, `imei`, `imsi`, `ip`, `predefined_ip`, `predefined_url`, `url`
        /// </summary>
        [Input("predefinedUrl")]
        public Input<Inputs.ExternalDynamicListTypePredefinedUrlArgs>? PredefinedUrl { get; set; }

        /// <summary>
        /// The Url param. Ensure that only one of the following is specified: `domain`, `imei`, `imsi`, `ip`, `predefined_ip`, `predefined_url`, `url`
        /// </summary>
        [Input("url")]
        public Input<Inputs.ExternalDynamicListTypeUrlArgs>? Url { get; set; }

        public ExternalDynamicListTypeArgs()
        {
        }
        public static new ExternalDynamicListTypeArgs Empty => new ExternalDynamicListTypeArgs();
    }
}
