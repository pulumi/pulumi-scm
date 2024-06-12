// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class HipObjectHostInfoCriteriaOsContainsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Apple vendor. String length must not exceed 255 characters. Ensure that only one of the following is specified: `Apple`, `Google`, `Linux`, `Microsoft`, `Other`
        /// </summary>
        [Input("apple")]
        public Input<string>? Apple { get; set; }

        /// <summary>
        /// Google vendor. String length must not exceed 255 characters. Ensure that only one of the following is specified: `Apple`, `Google`, `Linux`, `Microsoft`, `Other`
        /// </summary>
        [Input("google")]
        public Input<string>? Google { get; set; }

        /// <summary>
        /// Linux vendor. String length must not exceed 255 characters. Ensure that only one of the following is specified: `Apple`, `Google`, `Linux`, `Microsoft`, `Other`
        /// </summary>
        [Input("linux")]
        public Input<string>? Linux { get; set; }

        /// <summary>
        /// Microsoft vendor. String length must not exceed 255 characters. Ensure that only one of the following is specified: `Apple`, `Google`, `Linux`, `Microsoft`, `Other`
        /// </summary>
        [Input("microsoft")]
        public Input<string>? Microsoft { get; set; }

        /// <summary>
        /// Other vendor. String length must not exceed 255 characters. Ensure that only one of the following is specified: `Apple`, `Google`, `Linux`, `Microsoft`, `Other`
        /// </summary>
        [Input("other")]
        public Input<string>? Other { get; set; }

        public HipObjectHostInfoCriteriaOsContainsGetArgs()
        {
        }
        public static new HipObjectHostInfoCriteriaOsContainsGetArgs Empty => new HipObjectHostInfoCriteriaOsContainsGetArgs();
    }
}