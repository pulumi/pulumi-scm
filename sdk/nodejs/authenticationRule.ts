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
 * const example = new scm.AuthenticationRule("example", {});
 * ```
 */
export class AuthenticationRule extends pulumi.CustomResource {
    /**
     * Get an existing AuthenticationRule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AuthenticationRuleState, opts?: pulumi.CustomResourceOptions): AuthenticationRule {
        return new AuthenticationRule(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'scm:index/authenticationRule:AuthenticationRule';

    /**
     * Returns true if the given object is an instance of AuthenticationRule.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AuthenticationRule {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AuthenticationRule.__pulumiType;
    }

    /**
     * the authentication profile name to apply to authentication rule.
     */
    public readonly authenticationEnforcement!: pulumi.Output<string | undefined>;
    /**
     * The Categories param.
     */
    public readonly categories!: pulumi.Output<string[] | undefined>;
    /**
     * The Description param.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The DestinationHips param.
     */
    public readonly destinationHips!: pulumi.Output<string[] | undefined>;
    /**
     * The Destinations param.
     */
    public readonly destinations!: pulumi.Output<string[] | undefined>;
    /**
     * The Device param.
     */
    public readonly device!: pulumi.Output<string | undefined>;
    /**
     * The Disabled param. Default: `false`.
     */
    public readonly disabled!: pulumi.Output<boolean>;
    /**
     * The Folder param.
     */
    public readonly folder!: pulumi.Output<string | undefined>;
    /**
     * The Froms param.
     */
    public readonly froms!: pulumi.Output<string[] | undefined>;
    /**
     * The GroupTag param.
     */
    public readonly groupTag!: pulumi.Output<string | undefined>;
    /**
     * The HipProfiles param.
     */
    public readonly hipProfiles!: pulumi.Output<string[] | undefined>;
    /**
     * The LogAuthenticationTimeout param. Default: `false`.
     */
    public readonly logAuthenticationTimeout!: pulumi.Output<boolean>;
    /**
     * The LogSetting param.
     */
    public readonly logSetting!: pulumi.Output<string | undefined>;
    /**
     * The Name param.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The NegateDestination param. Default: `false`.
     */
    public readonly negateDestination!: pulumi.Output<boolean>;
    /**
     * The NegateSource param. Default: `false`.
     */
    public readonly negateSource!: pulumi.Output<boolean>;
    /**
     * The Position param. String must be one of these: `"pre"`, `"post"`. Default: `"pre"`.
     */
    public readonly position!: pulumi.Output<string>;
    /**
     * The Services param.
     */
    public readonly services!: pulumi.Output<string[] | undefined>;
    /**
     * The Snippet param.
     */
    public readonly snippet!: pulumi.Output<string | undefined>;
    /**
     * The SourceHips param.
     */
    public readonly sourceHips!: pulumi.Output<string[] | undefined>;
    /**
     * The SourceUsers param.
     */
    public readonly sourceUsers!: pulumi.Output<string[] | undefined>;
    /**
     * The Sources param.
     */
    public readonly sources!: pulumi.Output<string[] | undefined>;
    /**
     * The Tags param.
     */
    public readonly tags!: pulumi.Output<string[] | undefined>;
    public /*out*/ readonly tfid!: pulumi.Output<string>;
    /**
     * The Timeout param. Value must be between 1 and 1440.
     */
    public readonly timeout!: pulumi.Output<number | undefined>;
    /**
     * The Tos param.
     */
    public readonly tos!: pulumi.Output<string[] | undefined>;

    /**
     * Create a AuthenticationRule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: AuthenticationRuleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AuthenticationRuleArgs | AuthenticationRuleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AuthenticationRuleState | undefined;
            resourceInputs["authenticationEnforcement"] = state ? state.authenticationEnforcement : undefined;
            resourceInputs["categories"] = state ? state.categories : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["destinationHips"] = state ? state.destinationHips : undefined;
            resourceInputs["destinations"] = state ? state.destinations : undefined;
            resourceInputs["device"] = state ? state.device : undefined;
            resourceInputs["disabled"] = state ? state.disabled : undefined;
            resourceInputs["folder"] = state ? state.folder : undefined;
            resourceInputs["froms"] = state ? state.froms : undefined;
            resourceInputs["groupTag"] = state ? state.groupTag : undefined;
            resourceInputs["hipProfiles"] = state ? state.hipProfiles : undefined;
            resourceInputs["logAuthenticationTimeout"] = state ? state.logAuthenticationTimeout : undefined;
            resourceInputs["logSetting"] = state ? state.logSetting : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["negateDestination"] = state ? state.negateDestination : undefined;
            resourceInputs["negateSource"] = state ? state.negateSource : undefined;
            resourceInputs["position"] = state ? state.position : undefined;
            resourceInputs["services"] = state ? state.services : undefined;
            resourceInputs["snippet"] = state ? state.snippet : undefined;
            resourceInputs["sourceHips"] = state ? state.sourceHips : undefined;
            resourceInputs["sourceUsers"] = state ? state.sourceUsers : undefined;
            resourceInputs["sources"] = state ? state.sources : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tfid"] = state ? state.tfid : undefined;
            resourceInputs["timeout"] = state ? state.timeout : undefined;
            resourceInputs["tos"] = state ? state.tos : undefined;
        } else {
            const args = argsOrState as AuthenticationRuleArgs | undefined;
            resourceInputs["authenticationEnforcement"] = args ? args.authenticationEnforcement : undefined;
            resourceInputs["categories"] = args ? args.categories : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["destinationHips"] = args ? args.destinationHips : undefined;
            resourceInputs["destinations"] = args ? args.destinations : undefined;
            resourceInputs["device"] = args ? args.device : undefined;
            resourceInputs["disabled"] = args ? args.disabled : undefined;
            resourceInputs["folder"] = args ? args.folder : undefined;
            resourceInputs["froms"] = args ? args.froms : undefined;
            resourceInputs["groupTag"] = args ? args.groupTag : undefined;
            resourceInputs["hipProfiles"] = args ? args.hipProfiles : undefined;
            resourceInputs["logAuthenticationTimeout"] = args ? args.logAuthenticationTimeout : undefined;
            resourceInputs["logSetting"] = args ? args.logSetting : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["negateDestination"] = args ? args.negateDestination : undefined;
            resourceInputs["negateSource"] = args ? args.negateSource : undefined;
            resourceInputs["position"] = args ? args.position : undefined;
            resourceInputs["services"] = args ? args.services : undefined;
            resourceInputs["snippet"] = args ? args.snippet : undefined;
            resourceInputs["sourceHips"] = args ? args.sourceHips : undefined;
            resourceInputs["sourceUsers"] = args ? args.sourceUsers : undefined;
            resourceInputs["sources"] = args ? args.sources : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["timeout"] = args ? args.timeout : undefined;
            resourceInputs["tos"] = args ? args.tos : undefined;
            resourceInputs["tfid"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AuthenticationRule.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AuthenticationRule resources.
 */
export interface AuthenticationRuleState {
    /**
     * the authentication profile name to apply to authentication rule.
     */
    authenticationEnforcement?: pulumi.Input<string>;
    /**
     * The Categories param.
     */
    categories?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The Description param.
     */
    description?: pulumi.Input<string>;
    /**
     * The DestinationHips param.
     */
    destinationHips?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The Destinations param.
     */
    destinations?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The Device param.
     */
    device?: pulumi.Input<string>;
    /**
     * The Disabled param. Default: `false`.
     */
    disabled?: pulumi.Input<boolean>;
    /**
     * The Folder param.
     */
    folder?: pulumi.Input<string>;
    /**
     * The Froms param.
     */
    froms?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The GroupTag param.
     */
    groupTag?: pulumi.Input<string>;
    /**
     * The HipProfiles param.
     */
    hipProfiles?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The LogAuthenticationTimeout param. Default: `false`.
     */
    logAuthenticationTimeout?: pulumi.Input<boolean>;
    /**
     * The LogSetting param.
     */
    logSetting?: pulumi.Input<string>;
    /**
     * The Name param.
     */
    name?: pulumi.Input<string>;
    /**
     * The NegateDestination param. Default: `false`.
     */
    negateDestination?: pulumi.Input<boolean>;
    /**
     * The NegateSource param. Default: `false`.
     */
    negateSource?: pulumi.Input<boolean>;
    /**
     * The Position param. String must be one of these: `"pre"`, `"post"`. Default: `"pre"`.
     */
    position?: pulumi.Input<string>;
    /**
     * The Services param.
     */
    services?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The Snippet param.
     */
    snippet?: pulumi.Input<string>;
    /**
     * The SourceHips param.
     */
    sourceHips?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The SourceUsers param.
     */
    sourceUsers?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The Sources param.
     */
    sources?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The Tags param.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    tfid?: pulumi.Input<string>;
    /**
     * The Timeout param. Value must be between 1 and 1440.
     */
    timeout?: pulumi.Input<number>;
    /**
     * The Tos param.
     */
    tos?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a AuthenticationRule resource.
 */
export interface AuthenticationRuleArgs {
    /**
     * the authentication profile name to apply to authentication rule.
     */
    authenticationEnforcement?: pulumi.Input<string>;
    /**
     * The Categories param.
     */
    categories?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The Description param.
     */
    description?: pulumi.Input<string>;
    /**
     * The DestinationHips param.
     */
    destinationHips?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The Destinations param.
     */
    destinations?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The Device param.
     */
    device?: pulumi.Input<string>;
    /**
     * The Disabled param. Default: `false`.
     */
    disabled?: pulumi.Input<boolean>;
    /**
     * The Folder param.
     */
    folder?: pulumi.Input<string>;
    /**
     * The Froms param.
     */
    froms?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The GroupTag param.
     */
    groupTag?: pulumi.Input<string>;
    /**
     * The HipProfiles param.
     */
    hipProfiles?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The LogAuthenticationTimeout param. Default: `false`.
     */
    logAuthenticationTimeout?: pulumi.Input<boolean>;
    /**
     * The LogSetting param.
     */
    logSetting?: pulumi.Input<string>;
    /**
     * The Name param.
     */
    name?: pulumi.Input<string>;
    /**
     * The NegateDestination param. Default: `false`.
     */
    negateDestination?: pulumi.Input<boolean>;
    /**
     * The NegateSource param. Default: `false`.
     */
    negateSource?: pulumi.Input<boolean>;
    /**
     * The Position param. String must be one of these: `"pre"`, `"post"`. Default: `"pre"`.
     */
    position?: pulumi.Input<string>;
    /**
     * The Services param.
     */
    services?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The Snippet param.
     */
    snippet?: pulumi.Input<string>;
    /**
     * The SourceHips param.
     */
    sourceHips?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The SourceUsers param.
     */
    sourceUsers?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The Sources param.
     */
    sources?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The Tags param.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The Timeout param. Value must be between 1 and 1440.
     */
    timeout?: pulumi.Input<number>;
    /**
     * The Tos param.
     */
    tos?: pulumi.Input<pulumi.Input<string>[]>;
}
