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
 * const example = new scm.ProfileGroup("example", {});
 * ```
 */
export class ProfileGroup extends pulumi.CustomResource {
    /**
     * Get an existing ProfileGroup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ProfileGroupState, opts?: pulumi.CustomResourceOptions): ProfileGroup {
        return new ProfileGroup(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'scm:index/profileGroup:ProfileGroup';

    /**
     * Returns true if the given object is an instance of ProfileGroup.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ProfileGroup {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ProfileGroup.__pulumiType;
    }

    /**
     * List of AI security profiles.
     */
    public readonly aiSecurities!: pulumi.Output<string[] | undefined>;
    /**
     * The Device param.
     */
    public readonly device!: pulumi.Output<string | undefined>;
    /**
     * List of DNS security profiles.
     */
    public readonly dnsSecurities!: pulumi.Output<string[] | undefined>;
    /**
     * List of file blocking profiles.
     */
    public readonly fileBlockings!: pulumi.Output<string[] | undefined>;
    /**
     * The Folder param.
     */
    public readonly folder!: pulumi.Output<string | undefined>;
    /**
     * The name of the profile group.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * List of HTTP header insertion profiles.
     */
    public readonly saasSecurities!: pulumi.Output<string[] | undefined>;
    /**
     * The Snippet param.
     */
    public readonly snippet!: pulumi.Output<string | undefined>;
    /**
     * List of anti-spyware profiles.
     */
    public readonly spywares!: pulumi.Output<string[] | undefined>;
    public /*out*/ readonly tfid!: pulumi.Output<string>;
    /**
     * List of URL filtering profiles.
     */
    public readonly urlFilterings!: pulumi.Output<string[] | undefined>;
    /**
     * List of anti-virus and Wildfire analysis profiles.
     */
    public readonly virusAndWildfireAnalyses!: pulumi.Output<string[] | undefined>;
    /**
     * List of vulnerability protection profiles.
     */
    public readonly vulnerabilities!: pulumi.Output<string[] | undefined>;

    /**
     * Create a ProfileGroup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: ProfileGroupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ProfileGroupArgs | ProfileGroupState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ProfileGroupState | undefined;
            resourceInputs["aiSecurities"] = state ? state.aiSecurities : undefined;
            resourceInputs["device"] = state ? state.device : undefined;
            resourceInputs["dnsSecurities"] = state ? state.dnsSecurities : undefined;
            resourceInputs["fileBlockings"] = state ? state.fileBlockings : undefined;
            resourceInputs["folder"] = state ? state.folder : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["saasSecurities"] = state ? state.saasSecurities : undefined;
            resourceInputs["snippet"] = state ? state.snippet : undefined;
            resourceInputs["spywares"] = state ? state.spywares : undefined;
            resourceInputs["tfid"] = state ? state.tfid : undefined;
            resourceInputs["urlFilterings"] = state ? state.urlFilterings : undefined;
            resourceInputs["virusAndWildfireAnalyses"] = state ? state.virusAndWildfireAnalyses : undefined;
            resourceInputs["vulnerabilities"] = state ? state.vulnerabilities : undefined;
        } else {
            const args = argsOrState as ProfileGroupArgs | undefined;
            resourceInputs["aiSecurities"] = args ? args.aiSecurities : undefined;
            resourceInputs["device"] = args ? args.device : undefined;
            resourceInputs["dnsSecurities"] = args ? args.dnsSecurities : undefined;
            resourceInputs["fileBlockings"] = args ? args.fileBlockings : undefined;
            resourceInputs["folder"] = args ? args.folder : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["saasSecurities"] = args ? args.saasSecurities : undefined;
            resourceInputs["snippet"] = args ? args.snippet : undefined;
            resourceInputs["spywares"] = args ? args.spywares : undefined;
            resourceInputs["urlFilterings"] = args ? args.urlFilterings : undefined;
            resourceInputs["virusAndWildfireAnalyses"] = args ? args.virusAndWildfireAnalyses : undefined;
            resourceInputs["vulnerabilities"] = args ? args.vulnerabilities : undefined;
            resourceInputs["tfid"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ProfileGroup.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ProfileGroup resources.
 */
export interface ProfileGroupState {
    /**
     * List of AI security profiles.
     */
    aiSecurities?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The Device param.
     */
    device?: pulumi.Input<string>;
    /**
     * List of DNS security profiles.
     */
    dnsSecurities?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * List of file blocking profiles.
     */
    fileBlockings?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The Folder param.
     */
    folder?: pulumi.Input<string>;
    /**
     * The name of the profile group.
     */
    name?: pulumi.Input<string>;
    /**
     * List of HTTP header insertion profiles.
     */
    saasSecurities?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The Snippet param.
     */
    snippet?: pulumi.Input<string>;
    /**
     * List of anti-spyware profiles.
     */
    spywares?: pulumi.Input<pulumi.Input<string>[]>;
    tfid?: pulumi.Input<string>;
    /**
     * List of URL filtering profiles.
     */
    urlFilterings?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * List of anti-virus and Wildfire analysis profiles.
     */
    virusAndWildfireAnalyses?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * List of vulnerability protection profiles.
     */
    vulnerabilities?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a ProfileGroup resource.
 */
export interface ProfileGroupArgs {
    /**
     * List of AI security profiles.
     */
    aiSecurities?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The Device param.
     */
    device?: pulumi.Input<string>;
    /**
     * List of DNS security profiles.
     */
    dnsSecurities?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * List of file blocking profiles.
     */
    fileBlockings?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The Folder param.
     */
    folder?: pulumi.Input<string>;
    /**
     * The name of the profile group.
     */
    name?: pulumi.Input<string>;
    /**
     * List of HTTP header insertion profiles.
     */
    saasSecurities?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The Snippet param.
     */
    snippet?: pulumi.Input<string>;
    /**
     * List of anti-spyware profiles.
     */
    spywares?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * List of URL filtering profiles.
     */
    urlFilterings?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * List of anti-virus and Wildfire analysis profiles.
     */
    virusAndWildfireAnalyses?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * List of vulnerability protection profiles.
     */
    vulnerabilities?: pulumi.Input<pulumi.Input<string>[]>;
}
