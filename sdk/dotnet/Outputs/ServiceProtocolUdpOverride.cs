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
    public sealed class ServiceProtocolUdpOverride
    {
        /// <summary>
        /// udp session timeout value (in second). Value must be between 1 and 604800. Default: `30`.
        /// </summary>
        public readonly int? Timeout;

        [OutputConstructor]
        private ServiceProtocolUdpOverride(int? timeout)
        {
            Timeout = timeout;
        }
    }
}
