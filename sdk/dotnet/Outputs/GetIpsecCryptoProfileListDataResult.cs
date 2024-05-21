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
    public sealed class GetIpsecCryptoProfileListDataResult
    {
        /// <summary>
        /// The Ah param.
        /// </summary>
        public readonly Outputs.GetIpsecCryptoProfileListDataAhResult Ah;
        /// <summary>
        /// phase-2 DH group (PFS DH group). String must be one of these: `"no-pfs"`, `"group1"`, `"group2"`, `"group5"`, `"group14"`, `"group19"`, `"group20"`. Default: `"group2"`.
        /// </summary>
        public readonly string DhGroup;
        /// <summary>
        /// The Esp param.
        /// </summary>
        public readonly Outputs.GetIpsecCryptoProfileListDataEspResult Esp;
        /// <summary>
        /// UUID of the resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The Lifesize param.
        /// </summary>
        public readonly Outputs.GetIpsecCryptoProfileListDataLifesizeResult Lifesize;
        /// <summary>
        /// The Lifetime param.
        /// </summary>
        public readonly Outputs.GetIpsecCryptoProfileListDataLifetimeResult Lifetime;
        /// <summary>
        /// Alphanumeric string begin with letter: [0-9a-zA-Z._-]. String length must not exceed 31 characters.
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private GetIpsecCryptoProfileListDataResult(
            Outputs.GetIpsecCryptoProfileListDataAhResult ah,

            string dhGroup,

            Outputs.GetIpsecCryptoProfileListDataEspResult esp,

            string id,

            Outputs.GetIpsecCryptoProfileListDataLifesizeResult lifesize,

            Outputs.GetIpsecCryptoProfileListDataLifetimeResult lifetime,

            string name)
        {
            Ah = ah;
            DhGroup = dhGroup;
            Esp = esp;
            Id = id;
            Lifesize = lifesize;
            Lifetime = lifetime;
            Name = name;
        }
    }
}
