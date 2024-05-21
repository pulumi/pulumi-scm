// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.outputs.HipObjectCustomChecksCriteriaRegistryKeyRegistryValue;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HipObjectCustomChecksCriteriaRegistryKey {
    /**
     * @return Registry key default value data. String length must not exceed 1024 characters. String validation regex: `.*`.
     * 
     */
    private @Nullable String defaultValueData;
    /**
     * @return Registry key. String length must not exceed 1023 characters.
     * 
     */
    private String name;
    /**
     * @return Key does not exist or match specified value data. Default: `false`.
     * 
     */
    private @Nullable Boolean negate;
    /**
     * @return The RegistryValues param.
     * 
     */
    private @Nullable List<HipObjectCustomChecksCriteriaRegistryKeyRegistryValue> registryValues;

    private HipObjectCustomChecksCriteriaRegistryKey() {}
    /**
     * @return Registry key default value data. String length must not exceed 1024 characters. String validation regex: `.*`.
     * 
     */
    public Optional<String> defaultValueData() {
        return Optional.ofNullable(this.defaultValueData);
    }
    /**
     * @return Registry key. String length must not exceed 1023 characters.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Key does not exist or match specified value data. Default: `false`.
     * 
     */
    public Optional<Boolean> negate() {
        return Optional.ofNullable(this.negate);
    }
    /**
     * @return The RegistryValues param.
     * 
     */
    public List<HipObjectCustomChecksCriteriaRegistryKeyRegistryValue> registryValues() {
        return this.registryValues == null ? List.of() : this.registryValues;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HipObjectCustomChecksCriteriaRegistryKey defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String defaultValueData;
        private String name;
        private @Nullable Boolean negate;
        private @Nullable List<HipObjectCustomChecksCriteriaRegistryKeyRegistryValue> registryValues;
        public Builder() {}
        public Builder(HipObjectCustomChecksCriteriaRegistryKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultValueData = defaults.defaultValueData;
    	      this.name = defaults.name;
    	      this.negate = defaults.negate;
    	      this.registryValues = defaults.registryValues;
        }

        @CustomType.Setter
        public Builder defaultValueData(@Nullable String defaultValueData) {

            this.defaultValueData = defaultValueData;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("HipObjectCustomChecksCriteriaRegistryKey", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder negate(@Nullable Boolean negate) {

            this.negate = negate;
            return this;
        }
        @CustomType.Setter
        public Builder registryValues(@Nullable List<HipObjectCustomChecksCriteriaRegistryKeyRegistryValue> registryValues) {

            this.registryValues = registryValues;
            return this;
        }
        public Builder registryValues(HipObjectCustomChecksCriteriaRegistryKeyRegistryValue... registryValues) {
            return registryValues(List.of(registryValues));
        }
        public HipObjectCustomChecksCriteriaRegistryKey build() {
            final var _resultValue = new HipObjectCustomChecksCriteriaRegistryKey();
            _resultValue.defaultValueData = defaultValueData;
            _resultValue.name = name;
            _resultValue.negate = negate;
            _resultValue.registryValues = registryValues;
            return _resultValue;
        }
    }
}
