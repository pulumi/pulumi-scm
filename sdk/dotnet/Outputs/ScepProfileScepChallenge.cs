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
    public sealed class ScepProfileScepChallenge
    {
        /// <summary>
        /// The DynamicChallenge param. Ensure that only one of the following is specified: `dynamic`, `fixed`, `none`
        /// </summary>
        public readonly Outputs.ScepProfileScepChallengeDynamicChallenge? DynamicChallenge;
        /// <summary>
        /// Challenge to use for SCEP server on mobile clients. String length must not exceed 1024 characters. Ensure that only one of the following is specified: `dynamic`, `fixed`, `none`
        /// </summary>
        public readonly string? Fixed;
        /// <summary>
        /// The None param. String must be one of these: `""`. Ensure that only one of the following is specified: `dynamic`, `fixed`, `none`
        /// </summary>
        public readonly string? None;

        [OutputConstructor]
        private ScepProfileScepChallenge(
            Outputs.ScepProfileScepChallengeDynamicChallenge? dynamicChallenge,

            string? @fixed,

            string? none)
        {
            DynamicChallenge = dynamicChallenge;
            Fixed = @fixed;
            None = none;
        }
    }
}