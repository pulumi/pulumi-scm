// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class HipObjectCertificateArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Criteria param.
        /// </summary>
        [Input("criteria")]
        public Input<Inputs.HipObjectCertificateCriteriaArgs>? Criteria { get; set; }

        public HipObjectCertificateArgs()
        {
        }
        public static new HipObjectCertificateArgs Empty => new HipObjectCertificateArgs();
    }
}