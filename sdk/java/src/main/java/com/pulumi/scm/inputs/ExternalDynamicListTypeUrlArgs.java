// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.inputs.ExternalDynamicListTypeUrlRecurringArgs;
import com.pulumi.scm.inputs.ExternalDynamicListTypeUrlUrlAuthArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ExternalDynamicListTypeUrlArgs extends com.pulumi.resources.ResourceArgs {

    public static final ExternalDynamicListTypeUrlArgs Empty = new ExternalDynamicListTypeUrlArgs();

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
     * The Recurring param.
     * 
     */
    @Import(name="recurring", required=true)
    private Output<ExternalDynamicListTypeUrlRecurringArgs> recurring;

    /**
     * @return The Recurring param.
     * 
     */
    public Output<ExternalDynamicListTypeUrlRecurringArgs> recurring() {
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

    /**
     * The UrlAuth param.
     * 
     */
    @Import(name="urlAuth")
    private @Nullable Output<ExternalDynamicListTypeUrlUrlAuthArgs> urlAuth;

    /**
     * @return The UrlAuth param.
     * 
     */
    public Optional<Output<ExternalDynamicListTypeUrlUrlAuthArgs>> urlAuth() {
        return Optional.ofNullable(this.urlAuth);
    }

    private ExternalDynamicListTypeUrlArgs() {}

    private ExternalDynamicListTypeUrlArgs(ExternalDynamicListTypeUrlArgs $) {
        this.certificateProfile = $.certificateProfile;
        this.description = $.description;
        this.exceptionLists = $.exceptionLists;
        this.recurring = $.recurring;
        this.url = $.url;
        this.urlAuth = $.urlAuth;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExternalDynamicListTypeUrlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExternalDynamicListTypeUrlArgs $;

        public Builder() {
            $ = new ExternalDynamicListTypeUrlArgs();
        }

        public Builder(ExternalDynamicListTypeUrlArgs defaults) {
            $ = new ExternalDynamicListTypeUrlArgs(Objects.requireNonNull(defaults));
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
         * @param recurring The Recurring param.
         * 
         * @return builder
         * 
         */
        public Builder recurring(Output<ExternalDynamicListTypeUrlRecurringArgs> recurring) {
            $.recurring = recurring;
            return this;
        }

        /**
         * @param recurring The Recurring param.
         * 
         * @return builder
         * 
         */
        public Builder recurring(ExternalDynamicListTypeUrlRecurringArgs recurring) {
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

        /**
         * @param urlAuth The UrlAuth param.
         * 
         * @return builder
         * 
         */
        public Builder urlAuth(@Nullable Output<ExternalDynamicListTypeUrlUrlAuthArgs> urlAuth) {
            $.urlAuth = urlAuth;
            return this;
        }

        /**
         * @param urlAuth The UrlAuth param.
         * 
         * @return builder
         * 
         */
        public Builder urlAuth(ExternalDynamicListTypeUrlUrlAuthArgs urlAuth) {
            return urlAuth(Output.of(urlAuth));
        }

        public ExternalDynamicListTypeUrlArgs build() {
            if ($.recurring == null) {
                throw new MissingRequiredPropertyException("ExternalDynamicListTypeUrlArgs", "recurring");
            }
            return $;
        }
    }

}