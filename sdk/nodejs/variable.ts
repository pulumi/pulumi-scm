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
 * const example = new scm.Variable("example", {folder: "Shared"});
 * ```
 */
export class Variable extends pulumi.CustomResource {
    /**
     * Get an existing Variable resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: VariableState, opts?: pulumi.CustomResourceOptions): Variable {
        return new Variable(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'scm:index/variable:Variable';

    /**
     * Returns true if the given object is an instance of Variable.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Variable {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Variable.__pulumiType;
    }

    /**
     * The Description param.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The Device param.
     */
    public readonly device!: pulumi.Output<string | undefined>;
    /**
     * The Folder param.
     */
    public readonly folder!: pulumi.Output<string | undefined>;
    /**
     * Alphanumeric string begin with letter: [0-9a-zA-Z._-]. String length must not exceed 63 characters.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The Overridden param.
     */
    public /*out*/ readonly overridden!: pulumi.Output<boolean>;
    /**
     * The Snippet param.
     */
    public readonly snippet!: pulumi.Output<string | undefined>;
    public /*out*/ readonly tfid!: pulumi.Output<string>;
    /**
     * The Type param. String must be one of these: `"percent"`, `"count"`, `"ip-netmask"`, `"zone"`, `"ip-range"`, `"ip-wildcard"`, `"device-priority"`, `"device-id"`, `"egress-max"`, `"as-number"`, `"fqdn"`, `"port"`, `"link-tag"`, `"group-id"`, `"rate"`, `"router-id"`, `"qos-profile"`, `"timer"`.
     */
    public readonly type!: pulumi.Output<string | undefined>;
    /**
     * value can accept either string or integer.
     */
    public readonly value!: pulumi.Output<string | undefined>;

    /**
     * Create a Variable resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: VariableArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: VariableArgs | VariableState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as VariableState | undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["device"] = state ? state.device : undefined;
            resourceInputs["folder"] = state ? state.folder : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["overridden"] = state ? state.overridden : undefined;
            resourceInputs["snippet"] = state ? state.snippet : undefined;
            resourceInputs["tfid"] = state ? state.tfid : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["value"] = state ? state.value : undefined;
        } else {
            const args = argsOrState as VariableArgs | undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["device"] = args ? args.device : undefined;
            resourceInputs["folder"] = args ? args.folder : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["snippet"] = args ? args.snippet : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["value"] = args ? args.value : undefined;
            resourceInputs["overridden"] = undefined /*out*/;
            resourceInputs["tfid"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Variable.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Variable resources.
 */
export interface VariableState {
    /**
     * The Description param.
     */
    description?: pulumi.Input<string>;
    /**
     * The Device param.
     */
    device?: pulumi.Input<string>;
    /**
     * The Folder param.
     */
    folder?: pulumi.Input<string>;
    /**
     * Alphanumeric string begin with letter: [0-9a-zA-Z._-]. String length must not exceed 63 characters.
     */
    name?: pulumi.Input<string>;
    /**
     * The Overridden param.
     */
    overridden?: pulumi.Input<boolean>;
    /**
     * The Snippet param.
     */
    snippet?: pulumi.Input<string>;
    tfid?: pulumi.Input<string>;
    /**
     * The Type param. String must be one of these: `"percent"`, `"count"`, `"ip-netmask"`, `"zone"`, `"ip-range"`, `"ip-wildcard"`, `"device-priority"`, `"device-id"`, `"egress-max"`, `"as-number"`, `"fqdn"`, `"port"`, `"link-tag"`, `"group-id"`, `"rate"`, `"router-id"`, `"qos-profile"`, `"timer"`.
     */
    type?: pulumi.Input<string>;
    /**
     * value can accept either string or integer.
     */
    value?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Variable resource.
 */
export interface VariableArgs {
    /**
     * The Description param.
     */
    description?: pulumi.Input<string>;
    /**
     * The Device param.
     */
    device?: pulumi.Input<string>;
    /**
     * The Folder param.
     */
    folder?: pulumi.Input<string>;
    /**
     * Alphanumeric string begin with letter: [0-9a-zA-Z._-]. String length must not exceed 63 characters.
     */
    name?: pulumi.Input<string>;
    /**
     * The Snippet param.
     */
    snippet?: pulumi.Input<string>;
    /**
     * The Type param. String must be one of these: `"percent"`, `"count"`, `"ip-netmask"`, `"zone"`, `"ip-range"`, `"ip-wildcard"`, `"device-priority"`, `"device-id"`, `"egress-max"`, `"as-number"`, `"fqdn"`, `"port"`, `"link-tag"`, `"group-id"`, `"rate"`, `"router-id"`, `"qos-profile"`, `"timer"`.
     */
    type?: pulumi.Input<string>;
    /**
     * value can accept either string or integer.
     */
    value?: pulumi.Input<string>;
}
