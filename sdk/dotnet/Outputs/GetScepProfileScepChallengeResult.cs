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
    public sealed class GetScepProfileScepChallengeResult
    {
        /// <summary>
        /// The DynamicChallenge param.
        /// </summary>
        public readonly Outputs.GetScepProfileScepChallengeDynamicChallengeResult DynamicChallenge;
        /// <summary>
        /// Challenge to use for SCEP server on mobile clients. String length must not exceed 1024 characters.
        /// </summary>
        public readonly string Fixed;
        /// <summary>
        /// The None param. String must be one of these: `""`.
        /// </summary>
        public readonly string None;

        [OutputConstructor]
        private GetScepProfileScepChallengeResult(
            Outputs.GetScepProfileScepChallengeDynamicChallengeResult dynamicChallenge,

            string @fixed,

            string none)
        {
            DynamicChallenge = dynamicChallenge;
            Fixed = @fixed;
            None = none;
        }
    }
}
