// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetHipObjectListDataDataLossPreventionCriteria {
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

    private GetHipObjectListDataDataLossPreventionCriteria() {}
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

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHipObjectListDataDataLossPreventionCriteria defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String isEnabled;
        private Boolean isInstalled;
        public Builder() {}
        public Builder(GetHipObjectListDataDataLossPreventionCriteria defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isEnabled = defaults.isEnabled;
    	      this.isInstalled = defaults.isInstalled;
        }

        @CustomType.Setter
        public Builder isEnabled(String isEnabled) {
            if (isEnabled == null) {
              throw new MissingRequiredPropertyException("GetHipObjectListDataDataLossPreventionCriteria", "isEnabled");
            }
            this.isEnabled = isEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder isInstalled(Boolean isInstalled) {
            if (isInstalled == null) {
              throw new MissingRequiredPropertyException("GetHipObjectListDataDataLossPreventionCriteria", "isInstalled");
            }
            this.isInstalled = isInstalled;
            return this;
        }
        public GetHipObjectListDataDataLossPreventionCriteria build() {
            final var _resultValue = new GetHipObjectListDataDataLossPreventionCriteria();
            _resultValue.isEnabled = isEnabled;
            _resultValue.isInstalled = isInstalled;
            return _resultValue;
        }
    }
}
