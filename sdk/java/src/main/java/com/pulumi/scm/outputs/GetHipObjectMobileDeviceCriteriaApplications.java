// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.outputs.GetHipObjectMobileDeviceCriteriaApplicationsHasMalware;
import com.pulumi.scm.outputs.GetHipObjectMobileDeviceCriteriaApplicationsInclude;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetHipObjectMobileDeviceCriteriaApplications {
    /**
     * @return The HasMalware param.
     * 
     */
    private GetHipObjectMobileDeviceCriteriaApplicationsHasMalware hasMalware;
    /**
     * @return Has apps that are not managed.
     * 
     */
    private Boolean hasUnmanagedApp;
    /**
     * @return The Includes param.
     * 
     */
    private List<GetHipObjectMobileDeviceCriteriaApplicationsInclude> includes;

    private GetHipObjectMobileDeviceCriteriaApplications() {}
    /**
     * @return The HasMalware param.
     * 
     */
    public GetHipObjectMobileDeviceCriteriaApplicationsHasMalware hasMalware() {
        return this.hasMalware;
    }
    /**
     * @return Has apps that are not managed.
     * 
     */
    public Boolean hasUnmanagedApp() {
        return this.hasUnmanagedApp;
    }
    /**
     * @return The Includes param.
     * 
     */
    public List<GetHipObjectMobileDeviceCriteriaApplicationsInclude> includes() {
        return this.includes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHipObjectMobileDeviceCriteriaApplications defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetHipObjectMobileDeviceCriteriaApplicationsHasMalware hasMalware;
        private Boolean hasUnmanagedApp;
        private List<GetHipObjectMobileDeviceCriteriaApplicationsInclude> includes;
        public Builder() {}
        public Builder(GetHipObjectMobileDeviceCriteriaApplications defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hasMalware = defaults.hasMalware;
    	      this.hasUnmanagedApp = defaults.hasUnmanagedApp;
    	      this.includes = defaults.includes;
        }

        @CustomType.Setter
        public Builder hasMalware(GetHipObjectMobileDeviceCriteriaApplicationsHasMalware hasMalware) {
            if (hasMalware == null) {
              throw new MissingRequiredPropertyException("GetHipObjectMobileDeviceCriteriaApplications", "hasMalware");
            }
            this.hasMalware = hasMalware;
            return this;
        }
        @CustomType.Setter
        public Builder hasUnmanagedApp(Boolean hasUnmanagedApp) {
            if (hasUnmanagedApp == null) {
              throw new MissingRequiredPropertyException("GetHipObjectMobileDeviceCriteriaApplications", "hasUnmanagedApp");
            }
            this.hasUnmanagedApp = hasUnmanagedApp;
            return this;
        }
        @CustomType.Setter
        public Builder includes(List<GetHipObjectMobileDeviceCriteriaApplicationsInclude> includes) {
            if (includes == null) {
              throw new MissingRequiredPropertyException("GetHipObjectMobileDeviceCriteriaApplications", "includes");
            }
            this.includes = includes;
            return this;
        }
        public Builder includes(GetHipObjectMobileDeviceCriteriaApplicationsInclude... includes) {
            return includes(List.of(includes));
        }
        public GetHipObjectMobileDeviceCriteriaApplications build() {
            final var _resultValue = new GetHipObjectMobileDeviceCriteriaApplications();
            _resultValue.hasMalware = hasMalware;
            _resultValue.hasUnmanagedApp = hasUnmanagedApp;
            _resultValue.includes = includes;
            return _resultValue;
        }
    }
}
