// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HipObjectDiskEncryptionCriteriaEncryptedLocationEncryptionState {
    /**
     * @return The Is param. String must be one of these: `&#34;encrypted&#34;`, `&#34;unencrypted&#34;`, `&#34;partial&#34;`, `&#34;unknown&#34;`. Ensure that only one of the following is specified: `is`, `is_not`
     * 
     */
    private @Nullable String is;
    /**
     * @return The IsNot param. String must be one of these: `&#34;encrypted&#34;`, `&#34;unencrypted&#34;`, `&#34;partial&#34;`, `&#34;unknown&#34;`. Ensure that only one of the following is specified: `is`, `is_not`
     * 
     */
    private @Nullable String isNot;

    private HipObjectDiskEncryptionCriteriaEncryptedLocationEncryptionState() {}
    /**
     * @return The Is param. String must be one of these: `&#34;encrypted&#34;`, `&#34;unencrypted&#34;`, `&#34;partial&#34;`, `&#34;unknown&#34;`. Ensure that only one of the following is specified: `is`, `is_not`
     * 
     */
    public Optional<String> is() {
        return Optional.ofNullable(this.is);
    }
    /**
     * @return The IsNot param. String must be one of these: `&#34;encrypted&#34;`, `&#34;unencrypted&#34;`, `&#34;partial&#34;`, `&#34;unknown&#34;`. Ensure that only one of the following is specified: `is`, `is_not`
     * 
     */
    public Optional<String> isNot() {
        return Optional.ofNullable(this.isNot);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HipObjectDiskEncryptionCriteriaEncryptedLocationEncryptionState defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String is;
        private @Nullable String isNot;
        public Builder() {}
        public Builder(HipObjectDiskEncryptionCriteriaEncryptedLocationEncryptionState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.is = defaults.is;
    	      this.isNot = defaults.isNot;
        }

        @CustomType.Setter
        public Builder is(@Nullable String is) {

            this.is = is;
            return this;
        }
        @CustomType.Setter
        public Builder isNot(@Nullable String isNot) {

            this.isNot = isNot;
            return this;
        }
        public HipObjectDiskEncryptionCriteriaEncryptedLocationEncryptionState build() {
            final var _resultValue = new HipObjectDiskEncryptionCriteriaEncryptedLocationEncryptionState();
            _resultValue.is = is;
            _resultValue.isNot = isNot;
            return _resultValue;
        }
    }
}
