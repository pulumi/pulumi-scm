// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
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
 * const example = new scm.DecryptionRule("example", {});
 * ```
 */
export class DecryptionRule extends pulumi.CustomResource {
    /**
     * Get an existing DecryptionRule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DecryptionRuleState, opts?: pulumi.CustomResourceOptions): DecryptionRule {
        return new DecryptionRule(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'scm:index/decryptionRule:DecryptionRule';

    /**
     * Returns true if the given object is an instance of DecryptionRule.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DecryptionRule {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DecryptionRule.__pulumiType;
    }

    /**
     * The Action param. String must be one of these: `"decrypt"`, `"no-decrypt"`.
     */
    public readonly action!: pulumi.Output<string>;
    /**
     * The Categories param.
     */
    public readonly categories!: pulumi.Output<string[]>;
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
    public readonly destinations!: pulumi.Output<string[]>;
    /**
     * The Device param.
     */
    public readonly device!: pulumi.Output<string | undefined>;
    /**
     * The Disabled param.
     */
    public readonly disabled!: pulumi.Output<boolean | undefined>;
    /**
     * The Folder param.
     */
    public readonly folder!: pulumi.Output<string | undefined>;
    /**
     * The Froms param.
     */
    public readonly froms!: pulumi.Output<string[]>;
    /**
     * The LogFail param.
     */
    public readonly logFail!: pulumi.Output<boolean | undefined>;
    /**
     * The LogSetting param.
     */
    public readonly logSetting!: pulumi.Output<string | undefined>;
    /**
     * The LogSuccess param.
     */
    public readonly logSuccess!: pulumi.Output<boolean | undefined>;
    /**
     * The Name param.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The NegateDestination param.
     */
    public readonly negateDestination!: pulumi.Output<boolean | undefined>;
    /**
     * The NegateSource param.
     */
    public readonly negateSource!: pulumi.Output<boolean | undefined>;
    /**
     * The Position param. String must be one of these: `"pre"`, `"post"`. Default: `"pre"`.
     */
    public readonly position!: pulumi.Output<string>;
    /**
     * The Profile param.
     */
    public readonly profile!: pulumi.Output<string | undefined>;
    /**
     * The Services param.
     */
    public readonly services!: pulumi.Output<string[]>;
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
    public readonly sourceUsers!: pulumi.Output<string[]>;
    /**
     * The Sources param.
     */
    public readonly sources!: pulumi.Output<string[]>;
    /**
     * The Tags param.
     */
    public readonly tags!: pulumi.Output<string[] | undefined>;
    public /*out*/ readonly tfid!: pulumi.Output<string>;
    /**
     * The Tos param.
     */
    public readonly tos!: pulumi.Output<string[]>;
    /**
     * The Type param.
     */
    public readonly type!: pulumi.Output<outputs.DecryptionRuleType | undefined>;

    /**
     * Create a DecryptionRule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DecryptionRuleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DecryptionRuleArgs | DecryptionRuleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DecryptionRuleState | undefined;
            resourceInputs["action"] = state ? state.action : undefined;
            resourceInputs["categories"] = state ? state.categories : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["destinationHips"] = state ? state.destinationHips : undefined;
            resourceInputs["destinations"] = state ? state.destinations : undefined;
            resourceInputs["device"] = state ? state.device : undefined;
            resourceInputs["disabled"] = state ? state.disabled : undefined;
            resourceInputs["folder"] = state ? state.folder : undefined;
            resourceInputs["froms"] = state ? state.froms : undefined;
            resourceInputs["logFail"] = state ? state.logFail : undefined;
            resourceInputs["logSetting"] = state ? state.logSetting : undefined;
            resourceInputs["logSuccess"] = state ? state.logSuccess : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["negateDestination"] = state ? state.negateDestination : undefined;
            resourceInputs["negateSource"] = state ? state.negateSource : undefined;
            resourceInputs["position"] = state ? state.position : undefined;
            resourceInputs["profile"] = state ? state.profile : undefined;
            resourceInputs["services"] = state ? state.services : undefined;
            resourceInputs["snippet"] = state ? state.snippet : undefined;
            resourceInputs["sourceHips"] = state ? state.sourceHips : undefined;
            resourceInputs["sourceUsers"] = state ? state.sourceUsers : undefined;
            resourceInputs["sources"] = state ? state.sources : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tfid"] = state ? state.tfid : undefined;
            resourceInputs["tos"] = state ? state.tos : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as DecryptionRuleArgs | undefined;
            if ((!args || args.action === undefined) && !opts.urn) {
                throw new Error("Missing required property 'action'");
            }
            if ((!args || args.categories === undefined) && !opts.urn) {
                throw new Error("Missing required property 'categories'");
            }
            if ((!args || args.destinations === undefined) && !opts.urn) {
                throw new Error("Missing required property 'destinations'");
            }
            if ((!args || args.froms === undefined) && !opts.urn) {
                throw new Error("Missing required property 'froms'");
            }
            if ((!args || args.services === undefined) && !opts.urn) {
                throw new Error("Missing required property 'services'");
            }
            if ((!args || args.sourceUsers === undefined) && !opts.urn) {
                throw new Error("Missing required property 'sourceUsers'");
            }
            if ((!args || args.sources === undefined) && !opts.urn) {
                throw new Error("Missing required property 'sources'");
            }
            if ((!args || args.tos === undefined) && !opts.urn) {
                throw new Error("Missing required property 'tos'");
            }
            resourceInputs["action"] = args ? args.action : undefined;
            resourceInputs["categories"] = args ? args.categories : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["destinationHips"] = args ? args.destinationHips : undefined;
            resourceInputs["destinations"] = args ? args.destinations : undefined;
            resourceInputs["device"] = args ? args.device : undefined;
            resourceInputs["disabled"] = args ? args.disabled : undefined;
            resourceInputs["folder"] = args ? args.folder : undefined;
            resourceInputs["froms"] = args ? args.froms : undefined;
            resourceInputs["logFail"] = args ? args.logFail : undefined;
            resourceInputs["logSetting"] = args ? args.logSetting : undefined;
            resourceInputs["logSuccess"] = args ? args.logSuccess : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["negateDestination"] = args ? args.negateDestination : undefined;
            resourceInputs["negateSource"] = args ? args.negateSource : undefined;
            resourceInputs["position"] = args ? args.position : undefined;
            resourceInputs["profile"] = args ? args.profile : undefined;
            resourceInputs["services"] = args ? args.services : undefined;
            resourceInputs["snippet"] = args ? args.snippet : undefined;
            resourceInputs["sourceHips"] = args ? args.sourceHips : undefined;
            resourceInputs["sourceUsers"] = args ? args.sourceUsers : undefined;
            resourceInputs["sources"] = args ? args.sources : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["tos"] = args ? args.tos : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["tfid"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(DecryptionRule.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DecryptionRule resources.
 */
export interface DecryptionRuleState {
    /**
     * The Action param. String must be one of these: `"decrypt"`, `"no-decrypt"`.
     */
    action?: pulumi.Input<string>;
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
     * The Disabled param.
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
     * The LogFail param.
     */
    logFail?: pulumi.Input<boolean>;
    /**
     * The LogSetting param.
     */
    logSetting?: pulumi.Input<string>;
    /**
     * The LogSuccess param.
     */
    logSuccess?: pulumi.Input<boolean>;
    /**
     * The Name param.
     */
    name?: pulumi.Input<string>;
    /**
     * The NegateDestination param.
     */
    negateDestination?: pulumi.Input<boolean>;
    /**
     * The NegateSource param.
     */
    negateSource?: pulumi.Input<boolean>;
    /**
     * The Position param. String must be one of these: `"pre"`, `"post"`. Default: `"pre"`.
     */
    position?: pulumi.Input<string>;
    /**
     * The Profile param.
     */
    profile?: pulumi.Input<string>;
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
     * The Tos param.
     */
    tos?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The Type param.
     */
    type?: pulumi.Input<inputs.DecryptionRuleType>;
}

/**
 * The set of arguments for constructing a DecryptionRule resource.
 */
export interface DecryptionRuleArgs {
    /**
     * The Action param. String must be one of these: `"decrypt"`, `"no-decrypt"`.
     */
    action: pulumi.Input<string>;
    /**
     * The Categories param.
     */
    categories: pulumi.Input<pulumi.Input<string>[]>;
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
    destinations: pulumi.Input<pulumi.Input<string>[]>;
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
     * The Froms param.
     */
    froms: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The LogFail param.
     */
    logFail?: pulumi.Input<boolean>;
    /**
     * The LogSetting param.
     */
    logSetting?: pulumi.Input<string>;
    /**
     * The LogSuccess param.
     */
    logSuccess?: pulumi.Input<boolean>;
    /**
     * The Name param.
     */
    name?: pulumi.Input<string>;
    /**
     * The NegateDestination param.
     */
    negateDestination?: pulumi.Input<boolean>;
    /**
     * The NegateSource param.
     */
    negateSource?: pulumi.Input<boolean>;
    /**
     * The Position param. String must be one of these: `"pre"`, `"post"`. Default: `"pre"`.
     */
    position?: pulumi.Input<string>;
    /**
     * The Profile param.
     */
    profile?: pulumi.Input<string>;
    /**
     * The Services param.
     */
    services: pulumi.Input<pulumi.Input<string>[]>;
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
    sourceUsers: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The Sources param.
     */
    sources: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The Tags param.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The Tos param.
     */
    tos: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The Type param.
     */
    type?: pulumi.Input<inputs.DecryptionRuleType>;
}