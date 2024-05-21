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
    public sealed class IpsecCryptoProfileLifetime
    {
        /// <summary>
        /// specify lifetime in days. Value must be between 1 and 365. Ensure that only one of the following is specified: `days`, `hours`, `minutes`, `seconds`
        /// </summary>
        public readonly int? Days;
        /// <summary>
        /// specify lifetime in hours. Value must be between 1 and 65535. Ensure that only one of the following is specified: `days`, `hours`, `minutes`, `seconds`
        /// </summary>
        public readonly int? Hours;
        /// <summary>
        /// specify lifetime in minutes. Value must be between 3 and 65535. Ensure that only one of the following is specified: `days`, `hours`, `minutes`, `seconds`
        /// </summary>
        public readonly int? Minutes;
        /// <summary>
        /// specify lifetime in seconds. Value must be between 180 and 65535. Ensure that only one of the following is specified: `days`, `hours`, `minutes`, `seconds`
        /// </summary>
        public readonly int? Seconds;

        [OutputConstructor]
        private IpsecCryptoProfileLifetime(
            int? days,

            int? hours,

            int? minutes,

            int? seconds)
        {
            Days = days;
            Hours = hours;
            Minutes = minutes;
            Seconds = seconds;
        }
    }
}
