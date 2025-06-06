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
 * const example = new scm.LocalUser("example", {
 *     folder: "Shared",
 *     name: "user1",
 *     password: "secret",
 * });
 * ```
 */
export class LocalUser extends pulumi.CustomResource {
    /**
     * Get an existing LocalUser resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: LocalUserState, opts?: pulumi.CustomResourceOptions): LocalUser {
        return new LocalUser(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'scm:index/localUser:LocalUser';

    /**
     * Returns true if the given object is an instance of LocalUser.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is LocalUser {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === LocalUser.__pulumiType;
    }

    /**
     * The Device param.
     */
    public readonly device!: pulumi.Output<string | undefined>;
    /**
     * The Disabled param.
     */
    public readonly disabled!: pulumi.Output<boolean | undefined>;
    /**
     * (Internal use) Encrypted values returned from the API.
     */
    public /*out*/ readonly encryptedValues!: pulumi.Output<{[key: string]: string}>;
    /**
     * The Folder param.
     */
    public readonly folder!: pulumi.Output<string | undefined>;
    /**
     * The Name param. String length must not exceed 31 characters.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The Password param. String length must not exceed 63 characters.
     */
    public readonly password!: pulumi.Output<string | undefined>;
    /**
     * The Snippet param.
     */
    public readonly snippet!: pulumi.Output<string | undefined>;
    public /*out*/ readonly tfid!: pulumi.Output<string>;

    /**
     * Create a LocalUser resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: LocalUserArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: LocalUserArgs | LocalUserState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as LocalUserState | undefined;
            resourceInputs["device"] = state ? state.device : undefined;
            resourceInputs["disabled"] = state ? state.disabled : undefined;
            resourceInputs["encryptedValues"] = state ? state.encryptedValues : undefined;
            resourceInputs["folder"] = state ? state.folder : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["password"] = state ? state.password : undefined;
            resourceInputs["snippet"] = state ? state.snippet : undefined;
            resourceInputs["tfid"] = state ? state.tfid : undefined;
        } else {
            const args = argsOrState as LocalUserArgs | undefined;
            resourceInputs["device"] = args ? args.device : undefined;
            resourceInputs["disabled"] = args ? args.disabled : undefined;
            resourceInputs["folder"] = args ? args.folder : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["password"] = args?.password ? pulumi.secret(args.password) : undefined;
            resourceInputs["snippet"] = args ? args.snippet : undefined;
            resourceInputs["encryptedValues"] = undefined /*out*/;
            resourceInputs["tfid"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["encryptedValues", "password"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(LocalUser.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering LocalUser resources.
 */
export interface LocalUserState {
    /**
     * The Device param.
     */
    device?: pulumi.Input<string>;
    /**
     * The Disabled param.
     */
    disabled?: pulumi.Input<boolean>;
    /**
     * (Internal use) Encrypted values returned from the API.
     */
    encryptedValues?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The Folder param.
     */
    folder?: pulumi.Input<string>;
    /**
     * The Name param. String length must not exceed 31 characters.
     */
    name?: pulumi.Input<string>;
    /**
     * The Password param. String length must not exceed 63 characters.
     */
    password?: pulumi.Input<string>;
    /**
     * The Snippet param.
     */
    snippet?: pulumi.Input<string>;
    tfid?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a LocalUser resource.
 */
export interface LocalUserArgs {
    /**
     * The Device param.
     */
    device?: pulumi.Input<string>;
    /**
     * The Disabled param.
     */
    disabled?: pulumi.Input<boolean>;
    /**
     * The Folder param.
     */
    folder?: pulumi.Input<string>;
    /**
     * The Name param. String length must not exceed 31 characters.
     */
    name?: pulumi.Input<string>;
    /**
     * The Password param. String length must not exceed 63 characters.
     */
    password?: pulumi.Input<string>;
    /**
     * The Snippet param.
     */
    snippet?: pulumi.Input<string>;
}
