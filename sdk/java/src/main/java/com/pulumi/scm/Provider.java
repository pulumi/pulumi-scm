// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.scm.ProviderArgs;
import com.pulumi.scm.Utilities;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The provider type for the scm package. By default, resources use package-wide configuration
 * settings, however an explicit `Provider` instance may be created and passed during resource
 * construction to achieve fine-grained programmatic control over provider settings. See the
 * [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
 * 
 */
@ResourceType(type="pulumi:providers:scm")
public class Provider extends com.pulumi.resources.ProviderResource {
    /**
     * The file path to the JSON file with auth creds for SCM.
     * 
     */
    @Export(name="authFile", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> authFile;

    /**
     * @return The file path to the JSON file with auth creds for SCM.
     * 
     */
    public Output<Optional<String>> authFile() {
        return Codegen.optional(this.authFile);
    }
    /**
     * The URL to send auth credentials to which will return a JWT. Default:
     * `https://auth.apps.paloaltonetworks.com/auth/v1/oauth2/access_token`. Environment variable: `SCM_AUTH_URL`. JSON config
     * file variable: `auth_url`.
     * 
     */
    @Export(name="authUrl", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> authUrl;

    /**
     * @return The URL to send auth credentials to which will return a JWT. Default:
     * `https://auth.apps.paloaltonetworks.com/auth/v1/oauth2/access_token`. Environment variable: `SCM_AUTH_URL`. JSON config
     * file variable: `auth_url`.
     * 
     */
    public Output<Optional<String>> authUrl() {
        return Codegen.optional(this.authUrl);
    }
    /**
     * The client ID for the connection. Environment variable: `SCM_CLIENT_ID`. JSON config file variable: `client_id`.
     * 
     */
    @Export(name="clientId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> clientId;

    /**
     * @return The client ID for the connection. Environment variable: `SCM_CLIENT_ID`. JSON config file variable: `client_id`.
     * 
     */
    public Output<Optional<String>> clientId() {
        return Codegen.optional(this.clientId);
    }
    /**
     * The client secret for the connection. Environment variable: `SCM_CLIENT_SECRET`. JSON config file variable:
     * `client_secret`.
     * 
     */
    @Export(name="clientSecret", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> clientSecret;

    /**
     * @return The client secret for the connection. Environment variable: `SCM_CLIENT_SECRET`. JSON config file variable:
     * `client_secret`.
     * 
     */
    public Output<Optional<String>> clientSecret() {
        return Codegen.optional(this.clientSecret);
    }
    /**
     * The hostname of Strata Cloud Manager API. Default: `api.sase.paloaltonetworks.com`. Environment variable: `SCM_HOST`.
     * JSON config file variable: `host`.
     * 
     */
    @Export(name="host", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> host;

    /**
     * @return The hostname of Strata Cloud Manager API. Default: `api.sase.paloaltonetworks.com`. Environment variable: `SCM_HOST`.
     * JSON config file variable: `host`.
     * 
     */
    public Output<Optional<String>> host() {
        return Codegen.optional(this.host);
    }
    /**
     * The logging level of the provider and the underlying communication. Default: `quiet`. Environment variable:
     * `SCM_LOGGING`. JSON config file variable: `logging`.
     * 
     */
    @Export(name="logging", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> logging;

    /**
     * @return The logging level of the provider and the underlying communication. Default: `quiet`. Environment variable:
     * `SCM_LOGGING`. JSON config file variable: `logging`.
     * 
     */
    public Output<Optional<String>> logging() {
        return Codegen.optional(this.logging);
    }
    /**
     * The protocol to use for SCM. This should be &#39;http&#39; or &#39;https&#39;. Default: `https`. Environment variable: `SCM_PROTOCOL`.
     * JSON config file variable: `protocol`.
     * 
     */
    @Export(name="protocol", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> protocol;

    /**
     * @return The protocol to use for SCM. This should be &#39;http&#39; or &#39;https&#39;. Default: `https`. Environment variable: `SCM_PROTOCOL`.
     * JSON config file variable: `protocol`.
     * 
     */
    public Output<Optional<String>> protocol() {
        return Codegen.optional(this.protocol);
    }
    /**
     * The client scope. Environment variable: `SCM_SCOPE`. JSON config file variable: `scope`.
     * 
     */
    @Export(name="scope", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> scope;

    /**
     * @return The client scope. Environment variable: `SCM_SCOPE`. JSON config file variable: `scope`.
     * 
     */
    public Output<Optional<String>> scope() {
        return Codegen.optional(this.scope);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Provider(java.lang.String name) {
        this(name, ProviderArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Provider(java.lang.String name, @Nullable ProviderArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Provider(java.lang.String name, @Nullable ProviderArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("scm", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private static ProviderArgs makeArgs(@Nullable ProviderArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ProviderArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "clientSecret"
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

}
