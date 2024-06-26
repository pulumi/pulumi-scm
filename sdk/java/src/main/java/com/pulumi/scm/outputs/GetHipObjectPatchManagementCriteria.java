// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.outputs.GetHipObjectPatchManagementCriteriaMissingPatches;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetHipObjectPatchManagementCriteria {
    /**
     * @return is enabled. String must be one of these: `&#34;no&#34;`, `&#34;yes&#34;`, `&#34;not-available&#34;`.
     * 
     */
    private String isEnabled;
    /**
     * @return Is Installed. Default: `true`.
     * 
     */
    private Boolean isInstalled;
    /**
     * @return The MissingPatches param.
     * 
     */
    private GetHipObjectPatchManagementCriteriaMissingPatches missingPatches;

    private GetHipObjectPatchManagementCriteria() {}
    /**
     * @return is enabled. String must be one of these: `&#34;no&#34;`, `&#34;yes&#34;`, `&#34;not-available&#34;`.
     * 
     */
    public String isEnabled() {
        return this.isEnabled;
    }
    /**
     * @return Is Installed. Default: `true`.
     * 
     */
    public Boolean isInstalled() {
        return this.isInstalled;
    }
    /**
     * @return The MissingPatches param.
     * 
     */
    public GetHipObjectPatchManagementCriteriaMissingPatches missingPatches() {
        return this.missingPatches;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHipObjectPatchManagementCriteria defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String isEnabled;
        private Boolean isInstalled;
        private GetHipObjectPatchManagementCriteriaMissingPatches missingPatches;
        public Builder() {}
        public Builder(GetHipObjectPatchManagementCriteria defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isEnabled = defaults.isEnabled;
    	      this.isInstalled = defaults.isInstalled;
    	      this.missingPatches = defaults.missingPatches;
        }

        @CustomType.Setter
        public Builder isEnabled(String isEnabled) {
            if (isEnabled == null) {
              throw new MissingRequiredPropertyException("GetHipObjectPatchManagementCriteria", "isEnabled");
            }
            this.isEnabled = isEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder isInstalled(Boolean isInstalled) {
            if (isInstalled == null) {
              throw new MissingRequiredPropertyException("GetHipObjectPatchManagementCriteria", "isInstalled");
            }
            this.isInstalled = isInstalled;
            return this;
        }
        @CustomType.Setter
        public Builder missingPatches(GetHipObjectPatchManagementCriteriaMissingPatches missingPatches) {
            if (missingPatches == null) {
              throw new MissingRequiredPropertyException("GetHipObjectPatchManagementCriteria", "missingPatches");
            }
            this.missingPatches = missingPatches;
            return this;
        }
        public GetHipObjectPatchManagementCriteria build() {
            final var _resultValue = new GetHipObjectPatchManagementCriteria();
            _resultValue.isEnabled = isEnabled;
            _resultValue.isInstalled = isInstalled;
            _resultValue.missingPatches = missingPatches;
            return _resultValue;
        }
    }
}
