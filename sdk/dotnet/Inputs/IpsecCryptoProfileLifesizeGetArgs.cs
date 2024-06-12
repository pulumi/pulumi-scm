// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class IpsecCryptoProfileLifesizeGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// specify lifesize in gigabytes(GB). Value must be between 1 and 65535. Ensure that only one of the following is specified: `gb`, `kb`, `mb`, `tb`
        /// </summary>
        [Input("gb")]
        public Input<int>? Gb { get; set; }

        /// <summary>
        /// specify lifesize in kilobytes(KB). Value must be between 1 and 65535. Ensure that only one of the following is specified: `gb`, `kb`, `mb`, `tb`
        /// </summary>
        [Input("kb")]
        public Input<int>? Kb { get; set; }

        /// <summary>
        /// specify lifesize in megabytes(MB). Value must be between 1 and 65535. Ensure that only one of the following is specified: `gb`, `kb`, `mb`, `tb`
        /// </summary>
        [Input("mb")]
        public Input<int>? Mb { get; set; }

        /// <summary>
        /// specify lifesize in terabytes(TB). Value must be between 1 and 65535. Ensure that only one of the following is specified: `gb`, `kb`, `mb`, `tb`
        /// </summary>
        [Input("tb")]
        public Input<int>? Tb { get; set; }

        public IpsecCryptoProfileLifesizeGetArgs()
        {
        }
        public static new IpsecCryptoProfileLifesizeGetArgs Empty => new IpsecCryptoProfileLifesizeGetArgs();
    }
}