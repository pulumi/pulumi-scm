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
    public sealed class GetIkeGatewayLocalIdResult
    {
        /// <summary>
        /// Local ID string. String length must be between 1 and 1024 characters. String validation regex: `^(.+\@[a-zA-Z0-9.-]+)$|^([$a-zA-Z0-9_:.-]+)$|^(([[:xdigit:]][[:xdigit:]])+)$|^([a-zA-Z0-9.]+=(\\,|[^,])+[, ]+)*([a-zA-Z0-9.]+=(\\,|[^,])+)$`.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The Type param.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetIkeGatewayLocalIdResult(
            string id,

            string type)
        {
            Id = id;
            Type = type;
        }
    }
}