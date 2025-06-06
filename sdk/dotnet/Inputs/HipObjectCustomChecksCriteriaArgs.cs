// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Inputs
{

    public sealed class HipObjectCustomChecksCriteriaArgs : global::Pulumi.ResourceArgs
    {
        [Input("plists")]
        private InputList<Inputs.HipObjectCustomChecksCriteriaPlistArgs>? _plists;

        /// <summary>
        /// The Plist param.
        /// </summary>
        public InputList<Inputs.HipObjectCustomChecksCriteriaPlistArgs> Plists
        {
            get => _plists ?? (_plists = new InputList<Inputs.HipObjectCustomChecksCriteriaPlistArgs>());
            set => _plists = value;
        }

        [Input("processLists")]
        private InputList<Inputs.HipObjectCustomChecksCriteriaProcessListArgs>? _processLists;

        /// <summary>
        /// The ProcessList param.
        /// </summary>
        public InputList<Inputs.HipObjectCustomChecksCriteriaProcessListArgs> ProcessLists
        {
            get => _processLists ?? (_processLists = new InputList<Inputs.HipObjectCustomChecksCriteriaProcessListArgs>());
            set => _processLists = value;
        }

        [Input("registryKeys")]
        private InputList<Inputs.HipObjectCustomChecksCriteriaRegistryKeyArgs>? _registryKeys;

        /// <summary>
        /// The RegistryKeys param.
        /// </summary>
        public InputList<Inputs.HipObjectCustomChecksCriteriaRegistryKeyArgs> RegistryKeys
        {
            get => _registryKeys ?? (_registryKeys = new InputList<Inputs.HipObjectCustomChecksCriteriaRegistryKeyArgs>());
            set => _registryKeys = value;
        }

        public HipObjectCustomChecksCriteriaArgs()
        {
        }
        public static new HipObjectCustomChecksCriteriaArgs Empty => new HipObjectCustomChecksCriteriaArgs();
    }
}
