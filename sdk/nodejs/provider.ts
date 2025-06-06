// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * The provider type for the scm package. By default, resources use package-wide configuration
 * settings, however an explicit `Provider` instance may be created and passed during resource
 * construction to achieve fine-grained programmatic control over provider settings. See the
 * [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
 */
export class Provider extends pulumi.ProviderResource {
    /** @internal */
    public static readonly __pulumiType = 'scm';

    /**
     * Returns true if the given object is an instance of Provider.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Provider {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === "pulumi:providers:" + Provider.__pulumiType;
    }

    /**
     * The file path to the JSON file with auth creds for SCM.
     */
    public readonly authFile!: pulumi.Output<string | undefined>;
    /**
     * The URL to send auth credentials to which will return a JWT. Default:
     * `https://auth.apps.paloaltonetworks.com/auth/v1/oauth2/access_token`. Environment variable: `SCM_AUTH_URL`. JSON config
     * file variable: `authUrl`.
     */
    public readonly authUrl!: pulumi.Output<string | undefined>;
    /**
     * The client ID for the connection. Environment variable: `SCM_CLIENT_ID`. JSON config file variable: `clientId`.
     */
    public readonly clientId!: pulumi.Output<string | undefined>;
    /**
     * The client secret for the connection. Environment variable: `SCM_CLIENT_SECRET`. JSON config file variable:
     * `clientSecret`.
     */
    public readonly clientSecret!: pulumi.Output<string | undefined>;
    /**
     * The hostname of Strata Cloud Manager API. Default: `api.sase.paloaltonetworks.com`. Environment variable: `SCM_HOST`.
     * JSON config file variable: `host`.
     */
    public readonly host!: pulumi.Output<string | undefined>;
    /**
     * The logging level of the provider and the underlying communication. Default: `quiet`. Environment variable:
     * `SCM_LOGGING`. JSON config file variable: `logging`.
     */
    public readonly logging!: pulumi.Output<string | undefined>;
    /**
     * The protocol to use for SCM. This should be 'http' or 'https'. Default: `https`. Environment variable: `SCM_PROTOCOL`.
     * JSON config file variable: `protocol`.
     */
    public readonly protocol!: pulumi.Output<string | undefined>;
    /**
     * The client scope. Environment variable: `SCM_SCOPE`. JSON config file variable: `scope`.
     */
    public readonly scope!: pulumi.Output<string | undefined>;

    /**
     * Create a Provider resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: ProviderArgs, opts?: pulumi.ResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        {
            resourceInputs["authFile"] = args ? args.authFile : undefined;
            resourceInputs["authUrl"] = args ? args.authUrl : undefined;
            resourceInputs["clientId"] = args ? args.clientId : undefined;
            resourceInputs["clientSecret"] = args?.clientSecret ? pulumi.secret(args.clientSecret) : undefined;
            resourceInputs["headers"] = pulumi.output(args ? args.headers : undefined).apply(JSON.stringify);
            resourceInputs["host"] = args ? args.host : undefined;
            resourceInputs["logging"] = args ? args.logging : undefined;
            resourceInputs["port"] = pulumi.output(args ? args.port : undefined).apply(JSON.stringify);
            resourceInputs["protocol"] = args ? args.protocol : undefined;
            resourceInputs["scope"] = args ? args.scope : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["clientSecret"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(Provider.__pulumiType, name, resourceInputs, opts);
    }

    /**
     * This function returns a Terraform config object with terraform-namecased keys,to be used with the Terraform Module Provider.
     */
    terraformConfig(): pulumi.Output<Provider.TerraformConfigResult> {
        return pulumi.runtime.call("pulumi:providers:scm/terraformConfig", {
            "__self__": this,
        }, this);
    }
}

/**
 * The set of arguments for constructing a Provider resource.
 */
export interface ProviderArgs {
    /**
     * The file path to the JSON file with auth creds for SCM.
     */
    authFile?: pulumi.Input<string>;
    /**
     * The URL to send auth credentials to which will return a JWT. Default:
     * `https://auth.apps.paloaltonetworks.com/auth/v1/oauth2/access_token`. Environment variable: `SCM_AUTH_URL`. JSON config
     * file variable: `authUrl`.
     */
    authUrl?: pulumi.Input<string>;
    /**
     * The client ID for the connection. Environment variable: `SCM_CLIENT_ID`. JSON config file variable: `clientId`.
     */
    clientId?: pulumi.Input<string>;
    /**
     * The client secret for the connection. Environment variable: `SCM_CLIENT_SECRET`. JSON config file variable:
     * `clientSecret`.
     */
    clientSecret?: pulumi.Input<string>;
    /**
     * Custom HTTP headers to be sent with all API commands. Environment variable: `SCM_HEADERS`. JSON config file variable:
     * `headers`.
     */
    headers?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The hostname of Strata Cloud Manager API. Default: `api.sase.paloaltonetworks.com`. Environment variable: `SCM_HOST`.
     * JSON config file variable: `host`.
     */
    host?: pulumi.Input<string>;
    /**
     * The logging level of the provider and the underlying communication. Default: `quiet`. Environment variable:
     * `SCM_LOGGING`. JSON config file variable: `logging`.
     */
    logging?: pulumi.Input<string>;
    /**
     * The port number to use for API commands, if non-standard for the given protocol. Environment variable: `SCM_PORT`. JSON
     * config file variable: `port`.
     */
    port?: pulumi.Input<number>;
    /**
     * The protocol to use for SCM. This should be 'http' or 'https'. Default: `https`. Environment variable: `SCM_PROTOCOL`.
     * JSON config file variable: `protocol`.
     */
    protocol?: pulumi.Input<string>;
    /**
     * The client scope. Environment variable: `SCM_SCOPE`. JSON config file variable: `scope`.
     */
    scope?: pulumi.Input<string>;
}

export namespace Provider {
    /**
     * The results of the Provider.terraformConfig method.
     */
    export interface TerraformConfigResult {
        readonly result: {[key: string]: any};
    }

}
