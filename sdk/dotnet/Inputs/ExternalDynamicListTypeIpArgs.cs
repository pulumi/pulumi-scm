// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class ExternalDynamicListTypeIpArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Profile for authenticating client certificates. Default: `"None"`.
        /// </summary>
        [Input("certificateProfile")]
        public Input<string>? CertificateProfile { get; set; }

        /// <summary>
        /// The Description param. String length must not exceed 255 characters.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("exceptionLists")]
        private InputList<string>? _exceptionLists;

        /// <summary>
        /// The ExceptionList param. Individual elements in this list are subject to additional validation. String length must not exceed 255 characters.
        /// </summary>
        public InputList<string> ExceptionLists
        {
            get => _exceptionLists ?? (_exceptionLists = new InputList<string>());
            set => _exceptionLists = value;
        }

        /// <summary>
        /// The IpAuth param.
        /// </summary>
        [Input("ipAuth")]
        public Input<Inputs.ExternalDynamicListTypeIpIpAuthArgs>? IpAuth { get; set; }

        /// <summary>
        /// The Recurring param.
        /// </summary>
        [Input("recurring", required: true)]
        public Input<Inputs.ExternalDynamicListTypeIpRecurringArgs> Recurring { get; set; } = null!;

        /// <summary>
        /// The Url param. String length must not exceed 255 characters. Default: `"http://"`.
        /// </summary>
        [Input("url")]
        public Input<string>? Url { get; set; }

        public ExternalDynamicListTypeIpArgs()
        {
        }
        public static new ExternalDynamicListTypeIpArgs Empty => new ExternalDynamicListTypeIpArgs();
    }
}
