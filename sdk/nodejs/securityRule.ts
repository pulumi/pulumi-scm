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
 * const example = new scm.SecurityRule("example", {});
 * ```
 */
export class SecurityRule extends pulumi.CustomResource {
    /**
     * Get an existing SecurityRule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SecurityRuleState, opts?: pulumi.CustomResourceOptions): SecurityRule {
        return new SecurityRule(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'scm:index/securityRule:SecurityRule';

    /**
     * Returns true if the given object is an instance of SecurityRule.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SecurityRule {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SecurityRule.__pulumiType;
    }

    /**
     * The action to be taken when the rule is matched. String must be one of these: `"allow"`, `"deny"`, `"drop"`, `"reset-client"`, `"reset-server"`, `"reset-both"`.
     */
    public readonly action!: pulumi.Output<string>;
    /**
     * The application(s) being accessed.
     */
    public readonly applications!: pulumi.Output<string[]>;
    /**
     * The URL categories being accessed.
     */
    public readonly categories!: pulumi.Output<string[]>;
    /**
     * The description of the security rule.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The destination Host Integrity Profile(s).
     */
    public readonly destinationHips!: pulumi.Output<string[] | undefined>;
    /**
     * The destination address(es).
     */
    public readonly destinations!: pulumi.Output<string[]>;
    /**
     * The Device param.
     */
    public readonly device!: pulumi.Output<string | undefined>;
    /**
     * The state of the security rule. Default: `false`.
     */
    public readonly disabled!: pulumi.Output<boolean>;
    /**
     * The Folder param.
     */
    public readonly folder!: pulumi.Output<string | undefined>;
    /**
     * The source security zone(s).
     */
    public readonly froms!: pulumi.Output<string[]>;
    /**
     * The external log forwarding profile.
     */
    public readonly logSetting!: pulumi.Output<string | undefined>;
    /**
     * The name of the security rule.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Negate the destination addresses(es). Default: `false`.
     */
    public readonly negateDestination!: pulumi.Output<boolean>;
    /**
     * Negate the source address(es). Default: `false`.
     */
    public readonly negateSource!: pulumi.Output<boolean>;
    /**
     * The Position param. String must be one of these: `"pre"`, `"post"`. Default: `"pre"`.
     */
    public readonly position!: pulumi.Output<string>;
    /**
     * The security profile object.
     */
    public readonly profileSetting!: pulumi.Output<outputs.SecurityRuleProfileSetting | undefined>;
    /**
     * The service(s) being accessed.
     */
    public readonly services!: pulumi.Output<string[]>;
    /**
     * The Snippet param.
     */
    public readonly snippet!: pulumi.Output<string | undefined>;
    /**
     * The source Host Integrity Profile(s).
     */
    public readonly sourceHips!: pulumi.Output<string[] | undefined>;
    /**
     * The source user(s) or group(s).
     */
    public readonly sourceUsers!: pulumi.Output<string[]>;
    /**
     * The source address(es).
     */
    public readonly sources!: pulumi.Output<string[]>;
    /**
     * The tags associated with the security rule.
     */
    public readonly tags!: pulumi.Output<string[] | undefined>;
    public /*out*/ readonly tfid!: pulumi.Output<string>;
    /**
     * The destination security zone(s).
     */
    public readonly tos!: pulumi.Output<string[]>;

    /**
     * Create a SecurityRule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SecurityRuleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SecurityRuleArgs | SecurityRuleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SecurityRuleState | undefined;
            resourceInputs["action"] = state ? state.action : undefined;
            resourceInputs["applications"] = state ? state.applications : undefined;
            resourceInputs["categories"] = state ? state.categories : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["destinationHips"] = state ? state.destinationHips : undefined;
            resourceInputs["destinations"] = state ? state.destinations : undefined;
            resourceInputs["device"] = state ? state.device : undefined;
            resourceInputs["disabled"] = state ? state.disabled : undefined;
            resourceInputs["folder"] = state ? state.folder : undefined;
            resourceInputs["froms"] = state ? state.froms : undefined;
            resourceInputs["logSetting"] = state ? state.logSetting : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["negateDestination"] = state ? state.negateDestination : undefined;
            resourceInputs["negateSource"] = state ? state.negateSource : undefined;
            resourceInputs["position"] = state ? state.position : undefined;
            resourceInputs["profileSetting"] = state ? state.profileSetting : undefined;
            resourceInputs["services"] = state ? state.services : undefined;
            resourceInputs["snippet"] = state ? state.snippet : undefined;
            resourceInputs["sourceHips"] = state ? state.sourceHips : undefined;
            resourceInputs["sourceUsers"] = state ? state.sourceUsers : undefined;
            resourceInputs["sources"] = state ? state.sources : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tfid"] = state ? state.tfid : undefined;
            resourceInputs["tos"] = state ? state.tos : undefined;
        } else {
            const args = argsOrState as SecurityRuleArgs | undefined;
            if ((!args || args.action === undefined) && !opts.urn) {
                throw new Error("Missing required property 'action'");
            }
            if ((!args || args.applications === undefined) && !opts.urn) {
                throw new Error("Missing required property 'applications'");
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
            resourceInputs["applications"] = args ? args.applications : undefined;
            resourceInputs["categories"] = args ? args.categories : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["destinationHips"] = args ? args.destinationHips : undefined;
            resourceInputs["destinations"] = args ? args.destinations : undefined;
            resourceInputs["device"] = args ? args.device : undefined;
            resourceInputs["disabled"] = args ? args.disabled : undefined;
            resourceInputs["folder"] = args ? args.folder : undefined;
            resourceInputs["froms"] = args ? args.froms : undefined;
            resourceInputs["logSetting"] = args ? args.logSetting : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["negateDestination"] = args ? args.negateDestination : undefined;
            resourceInputs["negateSource"] = args ? args.negateSource : undefined;
            resourceInputs["position"] = args ? args.position : undefined;
            resourceInputs["profileSetting"] = args ? args.profileSetting : undefined;
            resourceInputs["services"] = args ? args.services : undefined;
            resourceInputs["snippet"] = args ? args.snippet : undefined;
            resourceInputs["sourceHips"] = args ? args.sourceHips : undefined;
            resourceInputs["sourceUsers"] = args ? args.sourceUsers : undefined;
            resourceInputs["sources"] = args ? args.sources : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["tos"] = args ? args.tos : undefined;
            resourceInputs["tfid"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SecurityRule.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SecurityRule resources.
 */
export interface SecurityRuleState {
    /**
     * The action to be taken when the rule is matched. String must be one of these: `"allow"`, `"deny"`, `"drop"`, `"reset-client"`, `"reset-server"`, `"reset-both"`.
     */
    action?: pulumi.Input<string>;
    /**
     * The application(s) being accessed.
     */
    applications?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The URL categories being accessed.
     */
    categories?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The description of the security rule.
     */
    description?: pulumi.Input<string>;
    /**
     * The destination Host Integrity Profile(s).
     */
    destinationHips?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The destination address(es).
     */
    destinations?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The Device param.
     */
    device?: pulumi.Input<string>;
    /**
     * The state of the security rule. Default: `false`.
     */
    disabled?: pulumi.Input<boolean>;
    /**
     * The Folder param.
     */
    folder?: pulumi.Input<string>;
    /**
     * The source security zone(s).
     */
    froms?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The external log forwarding profile.
     */
    logSetting?: pulumi.Input<string>;
    /**
     * The name of the security rule.
     */
    name?: pulumi.Input<string>;
    /**
     * Negate the destination addresses(es). Default: `false`.
     */
    negateDestination?: pulumi.Input<boolean>;
    /**
     * Negate the source address(es). Default: `false`.
     */
    negateSource?: pulumi.Input<boolean>;
    /**
     * The Position param. String must be one of these: `"pre"`, `"post"`. Default: `"pre"`.
     */
    position?: pulumi.Input<string>;
    /**
     * The security profile object.
     */
    profileSetting?: pulumi.Input<inputs.SecurityRuleProfileSetting>;
    /**
     * The service(s) being accessed.
     */
    services?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The Snippet param.
     */
    snippet?: pulumi.Input<string>;
    /**
     * The source Host Integrity Profile(s).
     */
    sourceHips?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The source user(s) or group(s).
     */
    sourceUsers?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The source address(es).
     */
    sources?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The tags associated with the security rule.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    tfid?: pulumi.Input<string>;
    /**
     * The destination security zone(s).
     */
    tos?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a SecurityRule resource.
 */
export interface SecurityRuleArgs {
    /**
     * The action to be taken when the rule is matched. String must be one of these: `"allow"`, `"deny"`, `"drop"`, `"reset-client"`, `"reset-server"`, `"reset-both"`.
     */
    action: pulumi.Input<string>;
    /**
     * The application(s) being accessed.
     */
    applications: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The URL categories being accessed.
     */
    categories: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The description of the security rule.
     */
    description?: pulumi.Input<string>;
    /**
     * The destination Host Integrity Profile(s).
     */
    destinationHips?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The destination address(es).
     */
    destinations: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The Device param.
     */
    device?: pulumi.Input<string>;
    /**
     * The state of the security rule. Default: `false`.
     */
    disabled?: pulumi.Input<boolean>;
    /**
     * The Folder param.
     */
    folder?: pulumi.Input<string>;
    /**
     * The source security zone(s).
     */
    froms: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The external log forwarding profile.
     */
    logSetting?: pulumi.Input<string>;
    /**
     * The name of the security rule.
     */
    name?: pulumi.Input<string>;
    /**
     * Negate the destination addresses(es). Default: `false`.
     */
    negateDestination?: pulumi.Input<boolean>;
    /**
     * Negate the source address(es). Default: `false`.
     */
    negateSource?: pulumi.Input<boolean>;
    /**
     * The Position param. String must be one of these: `"pre"`, `"post"`. Default: `"pre"`.
     */
    position?: pulumi.Input<string>;
    /**
     * The security profile object.
     */
    profileSetting?: pulumi.Input<inputs.SecurityRuleProfileSetting>;
    /**
     * The service(s) being accessed.
     */
    services: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The Snippet param.
     */
    snippet?: pulumi.Input<string>;
    /**
     * The source Host Integrity Profile(s).
     */
    sourceHips?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The source user(s) or group(s).
     */
    sourceUsers: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The source address(es).
     */
    sources: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The tags associated with the security rule.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The destination security zone(s).
     */
    tos: pulumi.Input<pulumi.Input<string>[]>;
}