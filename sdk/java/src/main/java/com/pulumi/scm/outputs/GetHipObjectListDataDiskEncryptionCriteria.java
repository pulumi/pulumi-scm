// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.outputs.GetHipObjectListDataDiskEncryptionCriteriaEncryptedLocation;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetHipObjectListDataDiskEncryptionCriteria {
    /**
     * @return The EncryptedLocations param.
     * 
     */
    private List<GetHipObjectListDataDiskEncryptionCriteriaEncryptedLocation> encryptedLocations;
    /**
     * @return Is Installed. Default: `true`.
     * 
     */
    private Boolean isInstalled;

    private GetHipObjectListDataDiskEncryptionCriteria() {}
    /**
     * @return The EncryptedLocations param.
     * 
     */
    public List<GetHipObjectListDataDiskEncryptionCriteriaEncryptedLocation> encryptedLocations() {
        return this.encryptedLocations;
    }
    /**
     * @return Is Installed. Default: `true`.
     * 
     */
    public Boolean isInstalled() {
        return this.isInstalled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHipObjectListDataDiskEncryptionCriteria defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetHipObjectListDataDiskEncryptionCriteriaEncryptedLocation> encryptedLocations;
        private Boolean isInstalled;
        public Builder() {}
        public Builder(GetHipObjectListDataDiskEncryptionCriteria defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptedLocations = defaults.encryptedLocations;
    	      this.isInstalled = defaults.isInstalled;
        }

        @CustomType.Setter
        public Builder encryptedLocations(List<GetHipObjectListDataDiskEncryptionCriteriaEncryptedLocation> encryptedLocations) {
            if (encryptedLocations == null) {
              throw new MissingRequiredPropertyException("GetHipObjectListDataDiskEncryptionCriteria", "encryptedLocations");
            }
            this.encryptedLocations = encryptedLocations;
            return this;
        }
        public Builder encryptedLocations(GetHipObjectListDataDiskEncryptionCriteriaEncryptedLocation... encryptedLocations) {
            return encryptedLocations(List.of(encryptedLocations));
        }
        @CustomType.Setter
        public Builder isInstalled(Boolean isInstalled) {
            if (isInstalled == null) {
              throw new MissingRequiredPropertyException("GetHipObjectListDataDiskEncryptionCriteria", "isInstalled");
            }
            this.isInstalled = isInstalled;
            return this;
        }
        public GetHipObjectListDataDiskEncryptionCriteria build() {
            final var _resultValue = new GetHipObjectListDataDiskEncryptionCriteria();
            _resultValue.encryptedLocations = encryptedLocations;
            _resultValue.isInstalled = isInstalled;
            return _resultValue;
        }
    }
}
