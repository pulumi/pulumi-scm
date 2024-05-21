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
    public sealed class AntiSpywareSignatureSignatureCombinationTimeAttribute
    {
        /// <summary>
        /// The Interval param. Value must be between 1 and 3600.
        /// </summary>
        public readonly int? Interval;
        /// <summary>
        /// The Threshold param. Value must be between 1 and 255.
        /// </summary>
        public readonly int? Threshold;
        /// <summary>
        /// The TrackBy param. String must be one of these: `"source-and-destination"`, `"source"`, `"destination"`.
        /// </summary>
        public readonly string? TrackBy;

        [OutputConstructor]
        private AntiSpywareSignatureSignatureCombinationTimeAttribute(
            int? interval,

            int? threshold,

            string? trackBy)
        {
            Interval = interval;
            Threshold = threshold;
            TrackBy = trackBy;
        }
    }
}
