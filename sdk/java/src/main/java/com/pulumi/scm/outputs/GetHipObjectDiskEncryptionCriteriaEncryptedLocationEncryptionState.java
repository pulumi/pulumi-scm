// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetHipObjectDiskEncryptionCriteriaEncryptedLocationEncryptionState {
    /**
     * @return The Is param. String must be one of these: `&#34;encrypted&#34;`, `&#34;unencrypted&#34;`, `&#34;partial&#34;`, `&#34;unknown&#34;`.
     * 
     */
    private String is;
    /**
     * @return The IsNot param. String must be one of these: `&#34;encrypted&#34;`, `&#34;unencrypted&#34;`, `&#34;partial&#34;`, `&#34;unknown&#34;`.
     * 
     */
    private String isNot;

    private GetHipObjectDiskEncryptionCriteriaEncryptedLocationEncryptionState() {}
    /**
     * @return The Is param. String must be one of these: `&#34;encrypted&#34;`, `&#34;unencrypted&#34;`, `&#34;partial&#34;`, `&#34;unknown&#34;`.
     * 
     */
    public String is() {
        return this.is;
    }
    /**
     * @return The IsNot param. String must be one of these: `&#34;encrypted&#34;`, `&#34;unencrypted&#34;`, `&#34;partial&#34;`, `&#34;unknown&#34;`.
     * 
     */
    public String isNot() {
        return this.isNot;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHipObjectDiskEncryptionCriteriaEncryptedLocationEncryptionState defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String is;
        private String isNot;
        public Builder() {}
        public Builder(GetHipObjectDiskEncryptionCriteriaEncryptedLocationEncryptionState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.is = defaults.is;
    	      this.isNot = defaults.isNot;
        }

        @CustomType.Setter
        public Builder is(String is) {
            if (is == null) {
              throw new MissingRequiredPropertyException("GetHipObjectDiskEncryptionCriteriaEncryptedLocationEncryptionState", "is");
            }
            this.is = is;
            return this;
        }
        @CustomType.Setter
        public Builder isNot(String isNot) {
            if (isNot == null) {
              throw new MissingRequiredPropertyException("GetHipObjectDiskEncryptionCriteriaEncryptedLocationEncryptionState", "isNot");
            }
            this.isNot = isNot;
            return this;
        }
        public GetHipObjectDiskEncryptionCriteriaEncryptedLocationEncryptionState build() {
            final var _resultValue = new GetHipObjectDiskEncryptionCriteriaEncryptedLocationEncryptionState();
            _resultValue.is = is;
            _resultValue.isNot = isNot;
            return _resultValue;
        }
    }
}
