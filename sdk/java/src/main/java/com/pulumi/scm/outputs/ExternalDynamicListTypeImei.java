// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.outputs.ExternalDynamicListTypeImeiImeiAuth;
import com.pulumi.scm.outputs.ExternalDynamicListTypeImeiRecurring;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ExternalDynamicListTypeImei {
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
     * @return The ExceptionList param. Individual elements in this list are subject to additional validation. String length must not exceed 32 characters.
     * 
     */
    private @Nullable List<String> exceptionLists;
    /**
     * @return The ImeiAuth param.
     * 
     */
    private @Nullable ExternalDynamicListTypeImeiImeiAuth imeiAuth;
    /**
     * @return The Recurring param.
     * 
     */
    private ExternalDynamicListTypeImeiRecurring recurring;
    /**
     * @return The Url param. String length must not exceed 255 characters. Default: `&#34;http://&#34;`.
     * 
     */
    private @Nullable String url;

    private ExternalDynamicListTypeImei() {}
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
     * @return The ExceptionList param. Individual elements in this list are subject to additional validation. String length must not exceed 32 characters.
     * 
     */
    public List<String> exceptionLists() {
        return this.exceptionLists == null ? List.of() : this.exceptionLists;
    }
    /**
     * @return The ImeiAuth param.
     * 
     */
    public Optional<ExternalDynamicListTypeImeiImeiAuth> imeiAuth() {
        return Optional.ofNullable(this.imeiAuth);
    }
    /**
     * @return The Recurring param.
     * 
     */
    public ExternalDynamicListTypeImeiRecurring recurring() {
        return this.recurring;
    }
    /**
     * @return The Url param. String length must not exceed 255 characters. Default: `&#34;http://&#34;`.
     * 
     */
    public Optional<String> url() {
        return Optional.ofNullable(this.url);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExternalDynamicListTypeImei defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String certificateProfile;
        private @Nullable String description;
        private @Nullable List<String> exceptionLists;
        private @Nullable ExternalDynamicListTypeImeiImeiAuth imeiAuth;
        private ExternalDynamicListTypeImeiRecurring recurring;
        private @Nullable String url;
        public Builder() {}
        public Builder(ExternalDynamicListTypeImei defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateProfile = defaults.certificateProfile;
    	      this.description = defaults.description;
    	      this.exceptionLists = defaults.exceptionLists;
    	      this.imeiAuth = defaults.imeiAuth;
    	      this.recurring = defaults.recurring;
    	      this.url = defaults.url;
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
        public Builder imeiAuth(@Nullable ExternalDynamicListTypeImeiImeiAuth imeiAuth) {

            this.imeiAuth = imeiAuth;
            return this;
        }
        @CustomType.Setter
        public Builder recurring(ExternalDynamicListTypeImeiRecurring recurring) {
            if (recurring == null) {
              throw new MissingRequiredPropertyException("ExternalDynamicListTypeImei", "recurring");
            }
            this.recurring = recurring;
            return this;
        }
        @CustomType.Setter
        public Builder url(@Nullable String url) {

            this.url = url;
            return this;
        }
        public ExternalDynamicListTypeImei build() {
            final var _resultValue = new ExternalDynamicListTypeImei();
            _resultValue.certificateProfile = certificateProfile;
            _resultValue.description = description;
            _resultValue.exceptionLists = exceptionLists;
            _resultValue.imeiAuth = imeiAuth;
            _resultValue.recurring = recurring;
            _resultValue.url = url;
            return _resultValue;
        }
    }
}
