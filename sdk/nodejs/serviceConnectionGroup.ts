// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Retrieves a config item.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as scm from "@pulumi/scm";
 *
 * const example = new scm.ServiceConnectionGroup("example", {});
 * ```
 */
export class ServiceConnectionGroup extends pulumi.CustomResource {
    /**
     * Get an existing ServiceConnectionGroup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ServiceConnectionGroupState, opts?: pulumi.CustomResourceOptions): ServiceConnectionGroup {
        return new ServiceConnectionGroup(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'scm:index/serviceConnectionGroup:ServiceConnectionGroup';

    /**
     * Returns true if the given object is an instance of ServiceConnectionGroup.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ServiceConnectionGroup {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ServiceConnectionGroup.__pulumiType;
    }

    /**
     * The DisableSnat param.
     */
    public readonly disableSnat!: pulumi.Output<boolean | undefined>;
    /**
     * The Folder param. String can either be a specific string(`"Service Connections"`) or match this regex: `^[0-9a-zA-Z._\s-]{1,}$`. Default: `"Service Connections"`.
     */
    public readonly folder!: pulumi.Output<string>;
    /**
     * The Name param.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The PbfOnly param.
     */
    public readonly pbfOnly!: pulumi.Output<boolean | undefined>;
    /**
     * The Targets param.
     */
    public readonly targets!: pulumi.Output<string[]>;
    public /*out*/ readonly tfid!: pulumi.Output<string>;

    /**
     * Create a ServiceConnectionGroup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ServiceConnectionGroupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ServiceConnectionGroupArgs | ServiceConnectionGroupState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ServiceConnectionGroupState | undefined;
            resourceInputs["disableSnat"] = state ? state.disableSnat : undefined;
            resourceInputs["folder"] = state ? state.folder : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["pbfOnly"] = state ? state.pbfOnly : undefined;
            resourceInputs["targets"] = state ? state.targets : undefined;
            resourceInputs["tfid"] = state ? state.tfid : undefined;
        } else {
            const args = argsOrState as ServiceConnectionGroupArgs | undefined;
            if ((!args || args.targets === undefined) && !opts.urn) {
                throw new Error("Missing required property 'targets'");
            }
            resourceInputs["disableSnat"] = args ? args.disableSnat : undefined;
            resourceInputs["folder"] = args ? args.folder : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["pbfOnly"] = args ? args.pbfOnly : undefined;
            resourceInputs["targets"] = args ? args.targets : undefined;
            resourceInputs["tfid"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ServiceConnectionGroup.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ServiceConnectionGroup resources.
 */
export interface ServiceConnectionGroupState {
    /**
     * The DisableSnat param.
     */
    disableSnat?: pulumi.Input<boolean>;
    /**
     * The Folder param. String can either be a specific string(`"Service Connections"`) or match this regex: `^[0-9a-zA-Z._\s-]{1,}$`. Default: `"Service Connections"`.
     */
    folder?: pulumi.Input<string>;
    /**
     * The Name param.
     */
    name?: pulumi.Input<string>;
    /**
     * The PbfOnly param.
     */
    pbfOnly?: pulumi.Input<boolean>;
    /**
     * The Targets param.
     */
    targets?: pulumi.Input<pulumi.Input<string>[]>;
    tfid?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ServiceConnectionGroup resource.
 */
export interface ServiceConnectionGroupArgs {
    /**
     * The DisableSnat param.
     */
    disableSnat?: pulumi.Input<boolean>;
    /**
     * The Folder param. String can either be a specific string(`"Service Connections"`) or match this regex: `^[0-9a-zA-Z._\s-]{1,}$`. Default: `"Service Connections"`.
     */
    folder?: pulumi.Input<string>;
    /**
     * The Name param.
     */
    name?: pulumi.Input<string>;
    /**
     * The PbfOnly param.
     */
    pbfOnly?: pulumi.Input<boolean>;
    /**
     * The Targets param.
     */
    targets: pulumi.Input<pulumi.Input<string>[]>;
}