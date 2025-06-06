// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class IkeCryptoProfileLifetimeGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// specify lifetime in days. Value must be between 1 and 365. Ensure that only one of the following is specified: `days`, `hours`, `minutes`, `seconds`
        /// </summary>
        [Input("days")]
        public Input<int>? Days { get; set; }

        /// <summary>
        /// specify lifetime in hours. Value must be between 1 and 65535. Ensure that only one of the following is specified: `days`, `hours`, `minutes`, `seconds`
        /// </summary>
        [Input("hours")]
        public Input<int>? Hours { get; set; }

        /// <summary>
        /// specify lifetime in minutes. Value must be between 3 and 65535. Ensure that only one of the following is specified: `days`, `hours`, `minutes`, `seconds`
        /// </summary>
        [Input("minutes")]
        public Input<int>? Minutes { get; set; }

        /// <summary>
        /// specify lifetime in seconds. Value must be between 180 and 65535. Ensure that only one of the following is specified: `days`, `hours`, `minutes`, `seconds`
        /// </summary>
        [Input("seconds")]
        public Input<int>? Seconds { get; set; }

        public IkeCryptoProfileLifetimeGetArgs()
        {
        }
        public static new IkeCryptoProfileLifetimeGetArgs Empty => new IkeCryptoProfileLifetimeGetArgs();
    }
}
