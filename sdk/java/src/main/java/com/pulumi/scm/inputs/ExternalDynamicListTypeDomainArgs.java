// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.inputs.ExternalDynamicListTypeDomainDomainAuthArgs;
import com.pulumi.scm.inputs.ExternalDynamicListTypeDomainRecurringArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ExternalDynamicListTypeDomainArgs extends com.pulumi.resources.ResourceArgs {

    public static final ExternalDynamicListTypeDomainArgs Empty = new ExternalDynamicListTypeDomainArgs();

    /**
     * Profile for authenticating client certificates. Default: `&#34;None&#34;`.
     * 
     */
    @Import(name="certificateProfile")
    private @Nullable Output<String> certificateProfile;

    /**
     * @return Profile for authenticating client certificates. Default: `&#34;None&#34;`.
     * 
     */
    public Optional<Output<String>> certificateProfile() {
        return Optional.ofNullable(this.certificateProfile);
    }

    /**
     * The Description param. String length must not exceed 255 characters.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The Description param. String length must not exceed 255 characters.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The DomainAuth param.
     * 
     */
    @Import(name="domainAuth")
    private @Nullable Output<ExternalDynamicListTypeDomainDomainAuthArgs> domainAuth;

    /**
     * @return The DomainAuth param.
     * 
     */
    public Optional<Output<ExternalDynamicListTypeDomainDomainAuthArgs>> domainAuth() {
        return Optional.ofNullable(this.domainAuth);
    }

    /**
     * The ExceptionList param. Individual elements in this list are subject to additional validation. String length must not exceed 255 characters.
     * 
     */
    @Import(name="exceptionLists")
    private @Nullable Output<List<String>> exceptionLists;

    /**
     * @return The ExceptionList param. Individual elements in this list are subject to additional validation. String length must not exceed 255 characters.
     * 
     */
    public Optional<Output<List<String>>> exceptionLists() {
        return Optional.ofNullable(this.exceptionLists);
    }

    /**
     * Enable/Disable expand domain. Default: `false`.
     * 
     */
    @Import(name="expandDomain")
    private @Nullable Output<Boolean> expandDomain;

    /**
     * @return Enable/Disable expand domain. Default: `false`.
     * 
     */
    public Optional<Output<Boolean>> expandDomain() {
        return Optional.ofNullable(this.expandDomain);
    }

    /**
     * The Recurring param.
     * 
     */
    @Import(name="recurring", required=true)
    private Output<ExternalDynamicListTypeDomainRecurringArgs> recurring;

    /**
     * @return The Recurring param.
     * 
     */
    public Output<ExternalDynamicListTypeDomainRecurringArgs> recurring() {
        return this.recurring;
    }

    /**
     * The Url param. String length must not exceed 255 characters. Default: `&#34;http://&#34;`.
     * 
     */
    @Import(name="url")
    private @Nullable Output<String> url;

    /**
     * @return The Url param. String length must not exceed 255 characters. Default: `&#34;http://&#34;`.
     * 
     */
    public Optional<Output<String>> url() {
        return Optional.ofNullable(this.url);
    }

    private ExternalDynamicListTypeDomainArgs() {}

    private ExternalDynamicListTypeDomainArgs(ExternalDynamicListTypeDomainArgs $) {
        this.certificateProfile = $.certificateProfile;
        this.description = $.description;
        this.domainAuth = $.domainAuth;
        this.exceptionLists = $.exceptionLists;
        this.expandDomain = $.expandDomain;
        this.recurring = $.recurring;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExternalDynamicListTypeDomainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExternalDynamicListTypeDomainArgs $;

        public Builder() {
            $ = new ExternalDynamicListTypeDomainArgs();
        }

        public Builder(ExternalDynamicListTypeDomainArgs defaults) {
            $ = new ExternalDynamicListTypeDomainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param certificateProfile Profile for authenticating client certificates. Default: `&#34;None&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder certificateProfile(@Nullable Output<String> certificateProfile) {
            $.certificateProfile = certificateProfile;
            return this;
        }

        /**
         * @param certificateProfile Profile for authenticating client certificates. Default: `&#34;None&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder certificateProfile(String certificateProfile) {
            return certificateProfile(Output.of(certificateProfile));
        }

        /**
         * @param description The Description param. String length must not exceed 255 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The Description param. String length must not exceed 255 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param domainAuth The DomainAuth param.
         * 
         * @return builder
         * 
         */
        public Builder domainAuth(@Nullable Output<ExternalDynamicListTypeDomainDomainAuthArgs> domainAuth) {
            $.domainAuth = domainAuth;
            return this;
        }

        /**
         * @param domainAuth The DomainAuth param.
         * 
         * @return builder
         * 
         */
        public Builder domainAuth(ExternalDynamicListTypeDomainDomainAuthArgs domainAuth) {
            return domainAuth(Output.of(domainAuth));
        }

        /**
         * @param exceptionLists The ExceptionList param. Individual elements in this list are subject to additional validation. String length must not exceed 255 characters.
         * 
         * @return builder
         * 
         */
        public Builder exceptionLists(@Nullable Output<List<String>> exceptionLists) {
            $.exceptionLists = exceptionLists;
            return this;
        }

        /**
         * @param exceptionLists The ExceptionList param. Individual elements in this list are subject to additional validation. String length must not exceed 255 characters.
         * 
         * @return builder
         * 
         */
        public Builder exceptionLists(List<String> exceptionLists) {
            return exceptionLists(Output.of(exceptionLists));
        }

        /**
         * @param exceptionLists The ExceptionList param. Individual elements in this list are subject to additional validation. String length must not exceed 255 characters.
         * 
         * @return builder
         * 
         */
        public Builder exceptionLists(String... exceptionLists) {
            return exceptionLists(List.of(exceptionLists));
        }

        /**
         * @param expandDomain Enable/Disable expand domain. Default: `false`.
         * 
         * @return builder
         * 
         */
        public Builder expandDomain(@Nullable Output<Boolean> expandDomain) {
            $.expandDomain = expandDomain;
            return this;
        }

        /**
         * @param expandDomain Enable/Disable expand domain. Default: `false`.
         * 
         * @return builder
         * 
         */
        public Builder expandDomain(Boolean expandDomain) {
            return expandDomain(Output.of(expandDomain));
        }

        /**
         * @param recurring The Recurring param.
         * 
         * @return builder
         * 
         */
        public Builder recurring(Output<ExternalDynamicListTypeDomainRecurringArgs> recurring) {
            $.recurring = recurring;
            return this;
        }

        /**
         * @param recurring The Recurring param.
         * 
         * @return builder
         * 
         */
        public Builder recurring(ExternalDynamicListTypeDomainRecurringArgs recurring) {
            return recurring(Output.of(recurring));
        }

        /**
         * @param url The Url param. String length must not exceed 255 characters. Default: `&#34;http://&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder url(@Nullable Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url The Url param. String length must not exceed 255 characters. Default: `&#34;http://&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        public ExternalDynamicListTypeDomainArgs build() {
            if ($.recurring == null) {
                throw new MissingRequiredPropertyException("ExternalDynamicListTypeDomainArgs", "recurring");
            }
            return $;
        }
    }

}