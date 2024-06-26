// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.scm.outputs.HipObjectCustomChecksCriteriaPlist;
import com.pulumi.scm.outputs.HipObjectCustomChecksCriteriaProcessList;
import com.pulumi.scm.outputs.HipObjectCustomChecksCriteriaRegistryKey;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class HipObjectCustomChecksCriteria {
    /**
     * @return The Plist param.
     * 
     */
    private @Nullable List<HipObjectCustomChecksCriteriaPlist> plists;
    /**
     * @return The ProcessList param.
     * 
     */
    private @Nullable List<HipObjectCustomChecksCriteriaProcessList> processLists;
    /**
     * @return The RegistryKeys param.
     * 
     */
    private @Nullable List<HipObjectCustomChecksCriteriaRegistryKey> registryKeys;

    private HipObjectCustomChecksCriteria() {}
    /**
     * @return The Plist param.
     * 
     */
    public List<HipObjectCustomChecksCriteriaPlist> plists() {
        return this.plists == null ? List.of() : this.plists;
    }
    /**
     * @return The ProcessList param.
     * 
     */
    public List<HipObjectCustomChecksCriteriaProcessList> processLists() {
        return this.processLists == null ? List.of() : this.processLists;
    }
    /**
     * @return The RegistryKeys param.
     * 
     */
    public List<HipObjectCustomChecksCriteriaRegistryKey> registryKeys() {
        return this.registryKeys == null ? List.of() : this.registryKeys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HipObjectCustomChecksCriteria defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<HipObjectCustomChecksCriteriaPlist> plists;
        private @Nullable List<HipObjectCustomChecksCriteriaProcessList> processLists;
        private @Nullable List<HipObjectCustomChecksCriteriaRegistryKey> registryKeys;
        public Builder() {}
        public Builder(HipObjectCustomChecksCriteria defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.plists = defaults.plists;
    	      this.processLists = defaults.processLists;
    	      this.registryKeys = defaults.registryKeys;
        }

        @CustomType.Setter
        public Builder plists(@Nullable List<HipObjectCustomChecksCriteriaPlist> plists) {

            this.plists = plists;
            return this;
        }
        public Builder plists(HipObjectCustomChecksCriteriaPlist... plists) {
            return plists(List.of(plists));
        }
        @CustomType.Setter
        public Builder processLists(@Nullable List<HipObjectCustomChecksCriteriaProcessList> processLists) {

            this.processLists = processLists;
            return this;
        }
        public Builder processLists(HipObjectCustomChecksCriteriaProcessList... processLists) {
            return processLists(List.of(processLists));
        }
        @CustomType.Setter
        public Builder registryKeys(@Nullable List<HipObjectCustomChecksCriteriaRegistryKey> registryKeys) {

            this.registryKeys = registryKeys;
            return this;
        }
        public Builder registryKeys(HipObjectCustomChecksCriteriaRegistryKey... registryKeys) {
            return registryKeys(List.of(registryKeys));
        }
        public HipObjectCustomChecksCriteria build() {
            final var _resultValue = new HipObjectCustomChecksCriteria();
            _resultValue.plists = plists;
            _resultValue.processLists = processLists;
            _resultValue.registryKeys = registryKeys;
            return _resultValue;
        }
    }
}
