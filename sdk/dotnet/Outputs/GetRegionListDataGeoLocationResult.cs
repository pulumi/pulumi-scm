// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Outputs
{

    [OutputType]
    public sealed class GetRegionListDataGeoLocationResult
    {
        /// <summary>
        /// latitude coordinate. Value must be between -90 and 90.
        /// </summary>
        public readonly double Latitude;
        /// <summary>
        /// longitude coordinate. Value must be between -180 and 180.
        /// </summary>
        public readonly double Longitude;

        [OutputConstructor]
        private GetRegionListDataGeoLocationResult(
            double latitude,

            double longitude)
        {
            Latitude = latitude;
            Longitude = longitude;
        }
    }
}
