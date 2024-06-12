// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.scm.outputs.HipObjectMobileDeviceCriteriaApplicationsHasMalware;
import com.pulumi.scm.outputs.HipObjectMobileDeviceCriteriaApplicationsInclude;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HipObjectMobileDeviceCriteriaApplications {
    /**
     * @return The HasMalware param.
     * 
     */
    private @Nullable HipObjectMobileDeviceCriteriaApplicationsHasMalware hasMalware;
    /**
     * @return Has apps that are not managed.
     * 
     */
    private @Nullable Boolean hasUnmanagedApp;
    /**
     * @return The Includes param.
     * 
     */
    private @Nullable List<HipObjectMobileDeviceCriteriaApplicationsInclude> includes;

    private HipObjectMobileDeviceCriteriaApplications() {}
    /**
     * @return The HasMalware param.
     * 
     */
    public Optional<HipObjectMobileDeviceCriteriaApplicationsHasMalware> hasMalware() {
        return Optional.ofNullable(this.hasMalware);
    }
    /**
     * @return Has apps that are not managed.
     * 
     */
    public Optional<Boolean> hasUnmanagedApp() {
        return Optional.ofNullable(this.hasUnmanagedApp);
    }
    /**
     * @return The Includes param.
     * 
     */
    public List<HipObjectMobileDeviceCriteriaApplicationsInclude> includes() {
        return this.includes == null ? List.of() : this.includes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HipObjectMobileDeviceCriteriaApplications defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable HipObjectMobileDeviceCriteriaApplicationsHasMalware hasMalware;
        private @Nullable Boolean hasUnmanagedApp;
        private @Nullable List<HipObjectMobileDeviceCriteriaApplicationsInclude> includes;
        public Builder() {}
        public Builder(HipObjectMobileDeviceCriteriaApplications defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hasMalware = defaults.hasMalware;
    	      this.hasUnmanagedApp = defaults.hasUnmanagedApp;
    	      this.includes = defaults.includes;
        }

        @CustomType.Setter
        public Builder hasMalware(@Nullable HipObjectMobileDeviceCriteriaApplicationsHasMalware hasMalware) {

            this.hasMalware = hasMalware;
            return this;
        }
        @CustomType.Setter
        public Builder hasUnmanagedApp(@Nullable Boolean hasUnmanagedApp) {

            this.hasUnmanagedApp = hasUnmanagedApp;
            return this;
        }
        @CustomType.Setter
        public Builder includes(@Nullable List<HipObjectMobileDeviceCriteriaApplicationsInclude> includes) {

            this.includes = includes;
            return this;
        }
        public Builder includes(HipObjectMobileDeviceCriteriaApplicationsInclude... includes) {
            return includes(List.of(includes));
        }
        public HipObjectMobileDeviceCriteriaApplications build() {
            final var _resultValue = new HipObjectMobileDeviceCriteriaApplications();
            _resultValue.hasMalware = hasMalware;
            _resultValue.hasUnmanagedApp = hasUnmanagedApp;
            _resultValue.includes = includes;
            return _resultValue;
        }
    }
}