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
    public sealed class GetAntiSpywareProfileListDataThreatExceptionActionResult
    {
        /// <summary>
        /// The Alert param.
        /// </summary>
        public readonly bool Alert;
        /// <summary>
        /// The Allow param.
        /// </summary>
        public readonly bool Allow;
        /// <summary>
        /// The BlockIp param.
        /// </summary>
        public readonly Outputs.GetAntiSpywareProfileListDataThreatExceptionActionBlockIpResult BlockIp;
        /// <summary>
        /// The Default param.
        /// </summary>
        public readonly bool Default;
        /// <summary>
        /// The Drop param.
        /// </summary>
        public readonly bool Drop;
        /// <summary>
        /// The ResetBoth param.
        /// </summary>
        public readonly bool ResetBoth;
        /// <summary>
        /// The ResetClient param.
        /// </summary>
        public readonly bool ResetClient;
        /// <summary>
        /// The ResetServer param.
        /// </summary>
        public readonly bool ResetServer;

        [OutputConstructor]
        private GetAntiSpywareProfileListDataThreatExceptionActionResult(
            bool alert,

            bool allow,

            Outputs.GetAntiSpywareProfileListDataThreatExceptionActionBlockIpResult blockIp,

            bool @default,

            bool drop,

            bool resetBoth,

            bool resetClient,

            bool resetServer)
        {
            Alert = alert;
            Allow = allow;
            BlockIp = blockIp;
            Default = @default;
            Drop = drop;
            ResetBoth = resetBoth;
            ResetClient = resetClient;
            ResetServer = resetServer;
        }
    }
}
