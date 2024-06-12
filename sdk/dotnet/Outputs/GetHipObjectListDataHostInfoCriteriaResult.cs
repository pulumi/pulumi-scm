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
    public sealed class GetHipObjectListDataHostInfoCriteriaResult
    {
        /// <summary>
        /// The ClientVersion param.
        /// </summary>
        public readonly Outputs.GetHipObjectListDataHostInfoCriteriaClientVersionResult ClientVersion;
        /// <summary>
        /// The Domain param.
        /// </summary>
        public readonly Outputs.GetHipObjectListDataHostInfoCriteriaDomainResult Domain;
        /// <summary>
        /// The HostId param.
        /// </summary>
        public readonly Outputs.GetHipObjectListDataHostInfoCriteriaHostIdResult HostId;
        /// <summary>
        /// The HostName param.
        /// </summary>
        public readonly Outputs.GetHipObjectListDataHostInfoCriteriaHostNameResult HostName;
        /// <summary>
        /// If device is managed.
        /// </summary>
        public readonly bool Managed;
        /// <summary>
        /// The Os param.
        /// </summary>
        public readonly Outputs.GetHipObjectListDataHostInfoCriteriaOsResult Os;
        /// <summary>
        /// The SerialNumber param.
        /// </summary>
        public readonly Outputs.GetHipObjectListDataHostInfoCriteriaSerialNumberResult SerialNumber;

        [OutputConstructor]
        private GetHipObjectListDataHostInfoCriteriaResult(
            Outputs.GetHipObjectListDataHostInfoCriteriaClientVersionResult clientVersion,

            Outputs.GetHipObjectListDataHostInfoCriteriaDomainResult domain,

            Outputs.GetHipObjectListDataHostInfoCriteriaHostIdResult hostId,

            Outputs.GetHipObjectListDataHostInfoCriteriaHostNameResult hostName,

            bool managed,

            Outputs.GetHipObjectListDataHostInfoCriteriaOsResult os,

            Outputs.GetHipObjectListDataHostInfoCriteriaSerialNumberResult serialNumber)
        {
            ClientVersion = clientVersion;
            Domain = domain;
            HostId = hostId;
            HostName = hostName;
            Managed = managed;
            Os = os;
            SerialNumber = serialNumber;
        }
    }
}