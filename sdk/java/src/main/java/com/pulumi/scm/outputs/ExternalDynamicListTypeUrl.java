// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.outputs.ExternalDynamicListTypeUrlRecurring;
import com.pulumi.scm.outputs.ExternalDynamicListTypeUrlUrlAuth;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ExternalDynamicListTypeUrl {
    /**
     * @return Profile for authenticating client certificates. Default: `&#34;None&#34;`.
     * 
     */
    private @Nullable String certificateProfile;
    /**
     * @return The Description param. String length must not exceed 255 characters.
     * 
     */
    private @Nullable String description;
    /**
     * @return The ExceptionList param. Individual elements in this list are subject to additional validation. String length must not exceed 255 characters.
     * 
     */
    private @Nullable List<String> exceptionLists;
    /**
     * @return The Recurring param.
     * 
     */
    private ExternalDynamicListTypeUrlRecurring recurring;
    /**
     * @return The Url param. String length must not exceed 255 characters. Default: `&#34;http://&#34;`.
     * 
     */
    private @Nullable String url;
    /**
     * @return The UrlAuth param.
     * 
     */
    private @Nullable ExternalDynamicListTypeUrlUrlAuth urlAuth;

    private ExternalDynamicListTypeUrl() {}
    /**
     * @return Profile for authenticating client certificates. Default: `&#34;None&#34;`.
     * 
     */
    public Optional<String> certificateProfile() {
        return Optional.ofNullable(this.certificateProfile);
    }
    /**
     * @return The Description param. String length must not exceed 255 characters.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return The ExceptionList param. Individual elements in this list are subject to additional validation. String length must not exceed 255 characters.
     * 
     */
    public List<String> exceptionLists() {
        return this.exceptionLists == null ? List.of() : this.exceptionLists;
    }
    /**
     * @return The Recurring param.
     * 
     */
    public ExternalDynamicListTypeUrlRecurring recurring() {
        return this.recurring;
    }
    /**
     * @return The Url param. String length must not exceed 255 characters. Default: `&#34;http://&#34;`.
     * 
     */
    public Optional<String> url() {
        return Optional.ofNullable(this.url);
    }
    /**
     * @return The UrlAuth param.
     * 
     */
    public Optional<ExternalDynamicListTypeUrlUrlAuth> urlAuth() {
        return Optional.ofNullable(this.urlAuth);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExternalDynamicListTypeUrl defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String certificateProfile;
        private @Nullable String description;
        private @Nullable List<String> exceptionLists;
        private ExternalDynamicListTypeUrlRecurring recurring;
        private @Nullable String url;
        private @Nullable ExternalDynamicListTypeUrlUrlAuth urlAuth;
        public Builder() {}
        public Builder(ExternalDynamicListTypeUrl defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateProfile = defaults.certificateProfile;
    	      this.description = defaults.description;
    	      this.exceptionLists = defaults.exceptionLists;
    	      this.recurring = defaults.recurring;
    	      this.url = defaults.url;
    	      this.urlAuth = defaults.urlAuth;
        }

        @CustomType.Setter
        public Builder certificateProfile(@Nullable String certificateProfile) {

            this.certificateProfile = certificateProfile;
            return this;
        }
        @CustomType.Setter
        public Builder description(@Nullable String description) {

            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder exceptionLists(@Nullable List<String> exceptionLists) {

            this.exceptionLists = exceptionLists;
            return this;
        }
        public Builder exceptionLists(String... exceptionLists) {
            return exceptionLists(List.of(exceptionLists));
        }
        @CustomType.Setter
        public Builder recurring(ExternalDynamicListTypeUrlRecurring recurring) {
            if (recurring == null) {
              throw new MissingRequiredPropertyException("ExternalDynamicListTypeUrl", "recurring");
            }
            this.recurring = recurring;
            return this;
        }
        @CustomType.Setter
        public Builder url(@Nullable String url) {

            this.url = url;
            return this;
        }
        @CustomType.Setter
        public Builder urlAuth(@Nullable ExternalDynamicListTypeUrlUrlAuth urlAuth) {

            this.urlAuth = urlAuth;
            return this;
        }
        public ExternalDynamicListTypeUrl build() {
            final var _resultValue = new ExternalDynamicListTypeUrl();
            _resultValue.certificateProfile = certificateProfile;
            _resultValue.description = description;
            _resultValue.exceptionLists = exceptionLists;
            _resultValue.recurring = recurring;
            _resultValue.url = url;
            _resultValue.urlAuth = urlAuth;
            return _resultValue;
        }
    }
}
