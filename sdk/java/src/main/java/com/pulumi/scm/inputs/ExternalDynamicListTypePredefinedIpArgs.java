// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ExternalDynamicListTypePredefinedIpArgs extends com.pulumi.resources.ResourceArgs {

    public static final ExternalDynamicListTypePredefinedIpArgs Empty = new ExternalDynamicListTypePredefinedIpArgs();

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
     * The Url param.
     * 
     */
    @Import(name="url", required=true)
    private Output<String> url;

    /**
     * @return The Url param.
     * 
     */
    public Output<String> url() {
        return this.url;
    }

    private ExternalDynamicListTypePredefinedIpArgs() {}

    private ExternalDynamicListTypePredefinedIpArgs(ExternalDynamicListTypePredefinedIpArgs $) {
        this.description = $.description;
        this.exceptionLists = $.exceptionLists;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExternalDynamicListTypePredefinedIpArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExternalDynamicListTypePredefinedIpArgs $;

        public Builder() {
            $ = new ExternalDynamicListTypePredefinedIpArgs();
        }

        public Builder(ExternalDynamicListTypePredefinedIpArgs defaults) {
            $ = new ExternalDynamicListTypePredefinedIpArgs(Objects.requireNonNull(defaults));
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
         * @param url The Url param.
         * 
         * @return builder
         * 
         */
        public Builder url(Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url The Url param.
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        public ExternalDynamicListTypePredefinedIpArgs build() {
            if ($.url == null) {
                throw new MissingRequiredPropertyException("ExternalDynamicListTypePredefinedIpArgs", "url");
            }
            return $;
        }
    }

}
