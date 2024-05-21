// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class HipObjectPatchManagementVendorGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Name param. String length must not exceed 103 characters.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("products")]
        private InputList<string>? _products;

        /// <summary>
        /// Product name. Individual elements in this list are subject to additional validation. String length must not exceed 1023 characters. String validation regex: `.*`.
        /// </summary>
        public InputList<string> Products
        {
            get => _products ?? (_products = new InputList<string>());
            set => _products = value;
        }

        public HipObjectPatchManagementVendorGetArgs()
        {
        }
        public static new HipObjectPatchManagementVendorGetArgs Empty => new HipObjectPatchManagementVendorGetArgs();
    }
}
