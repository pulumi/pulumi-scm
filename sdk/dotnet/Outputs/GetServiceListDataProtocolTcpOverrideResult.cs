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
    public sealed class GetServiceListDataProtocolTcpOverrideResult
    {
        /// <summary>
        /// tcp session half-close timeout value (in second). Value must be between 1 and 604800. Default: `120`.
        /// </summary>
        public readonly int HalfcloseTimeout;
        /// <summary>
        /// tcp session timeout value (in second). Value must be between 1 and 604800. Default: `3600`.
        /// </summary>
        public readonly int Timeout;
        /// <summary>
        /// tcp session time-wait timeout value (in second). Value must be between 1 and 600. Default: `15`.
        /// </summary>
        public readonly int TimewaitTimeout;

        [OutputConstructor]
        private GetServiceListDataProtocolTcpOverrideResult(
            int halfcloseTimeout,

            int timeout,

            int timewaitTimeout)
        {
            HalfcloseTimeout = halfcloseTimeout;
            Timeout = timeout;
            TimewaitTimeout = timewaitTimeout;
        }
    }
}
