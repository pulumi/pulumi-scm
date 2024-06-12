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
 * const example = new scm.TlsServiceProfile("example", {folder: "Shared"});
 * ```
 */
export class TlsServiceProfile extends pulumi.CustomResource {
    /**
     * Get an existing TlsServiceProfile resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TlsServiceProfileState, opts?: pulumi.CustomResourceOptions): TlsServiceProfile {
        return new TlsServiceProfile(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'scm:index/tlsServiceProfile:TlsServiceProfile';

    /**
     * Returns true if the given object is an instance of TlsServiceProfile.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is TlsServiceProfile {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === TlsServiceProfile.__pulumiType;
    }

    /**
     * SSL certificate file name. String length must not exceed 255 characters.
     */
    public readonly certificate!: pulumi.Output<string>;
    /**
     * The Device param.
     */
    public readonly device!: pulumi.Output<string | undefined>;
    /**
     * The Folder param.
     */
    public readonly folder!: pulumi.Output<string | undefined>;
    /**
     * SSL TLS Service Profile name, value is muCustomDomainSSLProfile when it is used on mobile-agent infra settings. String length must not exceed 127 characters. String validation regex: `^[a-zA-Z0-9._-]+$`.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The ProtocolSettings param.
     */
    public readonly protocolSettings!: pulumi.Output<outputs.TlsServiceProfileProtocolSettings>;
    /**
     * The Snippet param.
     */
    public readonly snippet!: pulumi.Output<string | undefined>;
    public /*out*/ readonly tfid!: pulumi.Output<string>;

    /**
     * Create a TlsServiceProfile resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TlsServiceProfileArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TlsServiceProfileArgs | TlsServiceProfileState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TlsServiceProfileState | undefined;
            resourceInputs["certificate"] = state ? state.certificate : undefined;
            resourceInputs["device"] = state ? state.device : undefined;
            resourceInputs["folder"] = state ? state.folder : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["protocolSettings"] = state ? state.protocolSettings : undefined;
            resourceInputs["snippet"] = state ? state.snippet : undefined;
            resourceInputs["tfid"] = state ? state.tfid : undefined;
        } else {
            const args = argsOrState as TlsServiceProfileArgs | undefined;
            if ((!args || args.certificate === undefined) && !opts.urn) {
                throw new Error("Missing required property 'certificate'");
            }
            if ((!args || args.protocolSettings === undefined) && !opts.urn) {
                throw new Error("Missing required property 'protocolSettings'");
            }
            resourceInputs["certificate"] = args ? args.certificate : undefined;
            resourceInputs["device"] = args ? args.device : undefined;
            resourceInputs["folder"] = args ? args.folder : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["protocolSettings"] = args ? args.protocolSettings : undefined;
            resourceInputs["snippet"] = args ? args.snippet : undefined;
            resourceInputs["tfid"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(TlsServiceProfile.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering TlsServiceProfile resources.
 */
export interface TlsServiceProfileState {
    /**
     * SSL certificate file name. String length must not exceed 255 characters.
     */
    certificate?: pulumi.Input<string>;
    /**
     * The Device param.
     */
    device?: pulumi.Input<string>;
    /**
     * The Folder param.
     */
    folder?: pulumi.Input<string>;
    /**
     * SSL TLS Service Profile name, value is muCustomDomainSSLProfile when it is used on mobile-agent infra settings. String length must not exceed 127 characters. String validation regex: `^[a-zA-Z0-9._-]+$`.
     */
    name?: pulumi.Input<string>;
    /**
     * The ProtocolSettings param.
     */
    protocolSettings?: pulumi.Input<inputs.TlsServiceProfileProtocolSettings>;
    /**
     * The Snippet param.
     */
    snippet?: pulumi.Input<string>;
    tfid?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a TlsServiceProfile resource.
 */
export interface TlsServiceProfileArgs {
    /**
     * SSL certificate file name. String length must not exceed 255 characters.
     */
    certificate: pulumi.Input<string>;
    /**
     * The Device param.
     */
    device?: pulumi.Input<string>;
    /**
     * The Folder param.
     */
    folder?: pulumi.Input<string>;
    /**
     * SSL TLS Service Profile name, value is muCustomDomainSSLProfile when it is used on mobile-agent infra settings. String length must not exceed 127 characters. String validation regex: `^[a-zA-Z0-9._-]+$`.
     */
    name?: pulumi.Input<string>;
    /**
     * The ProtocolSettings param.
     */
    protocolSettings: pulumi.Input<inputs.TlsServiceProfileProtocolSettings>;
    /**
     * The Snippet param.
     */
    snippet?: pulumi.Input<string>;
}