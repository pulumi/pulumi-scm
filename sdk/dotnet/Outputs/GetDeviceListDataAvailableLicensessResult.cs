// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Outputs
{

    [OutputType]
    public sealed class GetDeviceListDataAvailableLicensessResult
    {
        /// <summary>
        /// The Authcode param.
        /// </summary>
        public readonly string Authcode;
        /// <summary>
        /// The Expires param.
        /// </summary>
        public readonly string Expires;
        /// <summary>
        /// The Feature param.
        /// </summary>
        public readonly string Feature;
        /// <summary>
        /// The Issued param.
        /// </summary>
        public readonly string Issued;

        [OutputConstructor]
        private GetDeviceListDataAvailableLicensessResult(
            string authcode,

            string expires,

            string feature,

            string issued)
        {
            Authcode = authcode;
            Expires = expires;
            Feature = feature;
            Issued = issued;
        }
    }
}
