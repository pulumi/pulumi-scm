// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UrlAccessProfileCredentialEnforcementModeArgs extends com.pulumi.resources.ResourceArgs {

    public static final UrlAccessProfileCredentialEnforcementModeArgs Empty = new UrlAccessProfileCredentialEnforcementModeArgs();

    /**
     * The Disabled param. Ensure that only one of the following is specified: `disabled`, `domain_credentials`, `group_mapping`, `ip_user`
     * 
     */
    @Import(name="disabled")
    private @Nullable Output<Boolean> disabled;

    /**
     * @return The Disabled param. Ensure that only one of the following is specified: `disabled`, `domain_credentials`, `group_mapping`, `ip_user`
     * 
     */
    public Optional<Output<Boolean>> disabled() {
        return Optional.ofNullable(this.disabled);
    }

    /**
     * The DomainCredentials param. Ensure that only one of the following is specified: `disabled`, `domain_credentials`, `group_mapping`, `ip_user`
     * 
     */
    @Import(name="domainCredentials")
    private @Nullable Output<Boolean> domainCredentials;

    /**
     * @return The DomainCredentials param. Ensure that only one of the following is specified: `disabled`, `domain_credentials`, `group_mapping`, `ip_user`
     * 
     */
    public Optional<Output<Boolean>> domainCredentials() {
        return Optional.ofNullable(this.domainCredentials);
    }

    /**
     * The GroupMapping param. Ensure that only one of the following is specified: `disabled`, `domain_credentials`, `group_mapping`, `ip_user`
     * 
     */
    @Import(name="groupMapping")
    private @Nullable Output<String> groupMapping;

    /**
     * @return The GroupMapping param. Ensure that only one of the following is specified: `disabled`, `domain_credentials`, `group_mapping`, `ip_user`
     * 
     */
    public Optional<Output<String>> groupMapping() {
        return Optional.ofNullable(this.groupMapping);
    }

    /**
     * The IpUser param. Ensure that only one of the following is specified: `disabled`, `domain_credentials`, `group_mapping`, `ip_user`
     * 
     */
    @Import(name="ipUser")
    private @Nullable Output<Boolean> ipUser;

    /**
     * @return The IpUser param. Ensure that only one of the following is specified: `disabled`, `domain_credentials`, `group_mapping`, `ip_user`
     * 
     */
    public Optional<Output<Boolean>> ipUser() {
        return Optional.ofNullable(this.ipUser);
    }

    private UrlAccessProfileCredentialEnforcementModeArgs() {}

    private UrlAccessProfileCredentialEnforcementModeArgs(UrlAccessProfileCredentialEnforcementModeArgs $) {
        this.disabled = $.disabled;
        this.domainCredentials = $.domainCredentials;
        this.groupMapping = $.groupMapping;
        this.ipUser = $.ipUser;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UrlAccessProfileCredentialEnforcementModeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UrlAccessProfileCredentialEnforcementModeArgs $;

        public Builder() {
            $ = new UrlAccessProfileCredentialEnforcementModeArgs();
        }

        public Builder(UrlAccessProfileCredentialEnforcementModeArgs defaults) {
            $ = new UrlAccessProfileCredentialEnforcementModeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param disabled The Disabled param. Ensure that only one of the following is specified: `disabled`, `domain_credentials`, `group_mapping`, `ip_user`
         * 
         * @return builder
         * 
         */
        public Builder disabled(@Nullable Output<Boolean> disabled) {
            $.disabled = disabled;
            return this;
        }

        /**
         * @param disabled The Disabled param. Ensure that only one of the following is specified: `disabled`, `domain_credentials`, `group_mapping`, `ip_user`
         * 
         * @return builder
         * 
         */
        public Builder disabled(Boolean disabled) {
            return disabled(Output.of(disabled));
        }

        /**
         * @param domainCredentials The DomainCredentials param. Ensure that only one of the following is specified: `disabled`, `domain_credentials`, `group_mapping`, `ip_user`
         * 
         * @return builder
         * 
         */
        public Builder domainCredentials(@Nullable Output<Boolean> domainCredentials) {
            $.domainCredentials = domainCredentials;
            return this;
        }

        /**
         * @param domainCredentials The DomainCredentials param. Ensure that only one of the following is specified: `disabled`, `domain_credentials`, `group_mapping`, `ip_user`
         * 
         * @return builder
         * 
         */
        public Builder domainCredentials(Boolean domainCredentials) {
            return domainCredentials(Output.of(domainCredentials));
        }

        /**
         * @param groupMapping The GroupMapping param. Ensure that only one of the following is specified: `disabled`, `domain_credentials`, `group_mapping`, `ip_user`
         * 
         * @return builder
         * 
         */
        public Builder groupMapping(@Nullable Output<String> groupMapping) {
            $.groupMapping = groupMapping;
            return this;
        }

        /**
         * @param groupMapping The GroupMapping param. Ensure that only one of the following is specified: `disabled`, `domain_credentials`, `group_mapping`, `ip_user`
         * 
         * @return builder
         * 
         */
        public Builder groupMapping(String groupMapping) {
            return groupMapping(Output.of(groupMapping));
        }

        /**
         * @param ipUser The IpUser param. Ensure that only one of the following is specified: `disabled`, `domain_credentials`, `group_mapping`, `ip_user`
         * 
         * @return builder
         * 
         */
        public Builder ipUser(@Nullable Output<Boolean> ipUser) {
            $.ipUser = ipUser;
            return this;
        }

        /**
         * @param ipUser The IpUser param. Ensure that only one of the following is specified: `disabled`, `domain_credentials`, `group_mapping`, `ip_user`
         * 
         * @return builder
         * 
         */
        public Builder ipUser(Boolean ipUser) {
            return ipUser(Output.of(ipUser));
        }

        public UrlAccessProfileCredentialEnforcementModeArgs build() {
            return $;
        }
    }

}
