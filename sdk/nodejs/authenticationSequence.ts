// *** WARNING: this file was generated by pulumi-language-nodejs. ***
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
 * const example = new scm.AuthenticationSequence("example", {});
 * ```
 */
export class AuthenticationSequence extends pulumi.CustomResource {
    /**
     * Get an existing AuthenticationSequence resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AuthenticationSequenceState, opts?: pulumi.CustomResourceOptions): AuthenticationSequence {
        return new AuthenticationSequence(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'scm:index/authenticationSequence:AuthenticationSequence';

    /**
     * Returns true if the given object is an instance of AuthenticationSequence.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AuthenticationSequence {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AuthenticationSequence.__pulumiType;
    }

    /**
     * The AuthenticationProfiles param.
     */
    public readonly authenticationProfiles!: pulumi.Output<string[] | undefined>;
    /**
     * The Device param.
     */
    public readonly device!: pulumi.Output<string | undefined>;
    /**
     * The Folder param.
     */
    public readonly folder!: pulumi.Output<string | undefined>;
    /**
     * The Name param.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The Snippet param.
     */
    public readonly snippet!: pulumi.Output<string | undefined>;
    public /*out*/ readonly tfid!: pulumi.Output<string>;
    /**
     * The UseDomainFindProfile param. Default: `true`.
     */
    public readonly useDomainFindProfile!: pulumi.Output<boolean>;

    /**
     * Create a AuthenticationSequence resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: AuthenticationSequenceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AuthenticationSequenceArgs | AuthenticationSequenceState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AuthenticationSequenceState | undefined;
            resourceInputs["authenticationProfiles"] = state ? state.authenticationProfiles : undefined;
            resourceInputs["device"] = state ? state.device : undefined;
            resourceInputs["folder"] = state ? state.folder : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["snippet"] = state ? state.snippet : undefined;
            resourceInputs["tfid"] = state ? state.tfid : undefined;
            resourceInputs["useDomainFindProfile"] = state ? state.useDomainFindProfile : undefined;
        } else {
            const args = argsOrState as AuthenticationSequenceArgs | undefined;
            resourceInputs["authenticationProfiles"] = args ? args.authenticationProfiles : undefined;
            resourceInputs["device"] = args ? args.device : undefined;
            resourceInputs["folder"] = args ? args.folder : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["snippet"] = args ? args.snippet : undefined;
            resourceInputs["useDomainFindProfile"] = args ? args.useDomainFindProfile : undefined;
            resourceInputs["tfid"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AuthenticationSequence.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AuthenticationSequence resources.
 */
export interface AuthenticationSequenceState {
    /**
     * The AuthenticationProfiles param.
     */
    authenticationProfiles?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The Device param.
     */
    device?: pulumi.Input<string>;
    /**
     * The Folder param.
     */
    folder?: pulumi.Input<string>;
    /**
     * The Name param.
     */
    name?: pulumi.Input<string>;
    /**
     * The Snippet param.
     */
    snippet?: pulumi.Input<string>;
    tfid?: pulumi.Input<string>;
    /**
     * The UseDomainFindProfile param. Default: `true`.
     */
    useDomainFindProfile?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a AuthenticationSequence resource.
 */
export interface AuthenticationSequenceArgs {
    /**
     * The AuthenticationProfiles param.
     */
    authenticationProfiles?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The Device param.
     */
    device?: pulumi.Input<string>;
    /**
     * The Folder param.
     */
    folder?: pulumi.Input<string>;
    /**
     * The Name param.
     */
    name?: pulumi.Input<string>;
    /**
     * The Snippet param.
     */
    snippet?: pulumi.Input<string>;
    /**
     * The UseDomainFindProfile param. Default: `true`.
     */
    useDomainFindProfile?: pulumi.Input<boolean>;
}
