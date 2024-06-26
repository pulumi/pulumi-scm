// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.inputs.HipObjectCustomChecksCriteriaRegistryKeyRegistryValueArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HipObjectCustomChecksCriteriaRegistryKeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final HipObjectCustomChecksCriteriaRegistryKeyArgs Empty = new HipObjectCustomChecksCriteriaRegistryKeyArgs();

    /**
     * Registry key default value data. String length must not exceed 1024 characters. String validation regex: `.*`.
     * 
     */
    @Import(name="defaultValueData")
    private @Nullable Output<String> defaultValueData;

    /**
     * @return Registry key default value data. String length must not exceed 1024 characters. String validation regex: `.*`.
     * 
     */
    public Optional<Output<String>> defaultValueData() {
        return Optional.ofNullable(this.defaultValueData);
    }

    /**
     * Registry key. String length must not exceed 1023 characters.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Registry key. String length must not exceed 1023 characters.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Key does not exist or match specified value data. Default: `false`.
     * 
     */
    @Import(name="negate")
    private @Nullable Output<Boolean> negate;

    /**
     * @return Key does not exist or match specified value data. Default: `false`.
     * 
     */
    public Optional<Output<Boolean>> negate() {
        return Optional.ofNullable(this.negate);
    }

    /**
     * The RegistryValues param.
     * 
     */
    @Import(name="registryValues")
    private @Nullable Output<List<HipObjectCustomChecksCriteriaRegistryKeyRegistryValueArgs>> registryValues;

    /**
     * @return The RegistryValues param.
     * 
     */
    public Optional<Output<List<HipObjectCustomChecksCriteriaRegistryKeyRegistryValueArgs>>> registryValues() {
        return Optional.ofNullable(this.registryValues);
    }

    private HipObjectCustomChecksCriteriaRegistryKeyArgs() {}

    private HipObjectCustomChecksCriteriaRegistryKeyArgs(HipObjectCustomChecksCriteriaRegistryKeyArgs $) {
        this.defaultValueData = $.defaultValueData;
        this.name = $.name;
        this.negate = $.negate;
        this.registryValues = $.registryValues;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HipObjectCustomChecksCriteriaRegistryKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HipObjectCustomChecksCriteriaRegistryKeyArgs $;

        public Builder() {
            $ = new HipObjectCustomChecksCriteriaRegistryKeyArgs();
        }

        public Builder(HipObjectCustomChecksCriteriaRegistryKeyArgs defaults) {
            $ = new HipObjectCustomChecksCriteriaRegistryKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param defaultValueData Registry key default value data. String length must not exceed 1024 characters. String validation regex: `.*`.
         * 
         * @return builder
         * 
         */
        public Builder defaultValueData(@Nullable Output<String> defaultValueData) {
            $.defaultValueData = defaultValueData;
            return this;
        }

        /**
         * @param defaultValueData Registry key default value data. String length must not exceed 1024 characters. String validation regex: `.*`.
         * 
         * @return builder
         * 
         */
        public Builder defaultValueData(String defaultValueData) {
            return defaultValueData(Output.of(defaultValueData));
        }

        /**
         * @param name Registry key. String length must not exceed 1023 characters.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Registry key. String length must not exceed 1023 characters.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param negate Key does not exist or match specified value data. Default: `false`.
         * 
         * @return builder
         * 
         */
        public Builder negate(@Nullable Output<Boolean> negate) {
            $.negate = negate;
            return this;
        }

        /**
         * @param negate Key does not exist or match specified value data. Default: `false`.
         * 
         * @return builder
         * 
         */
        public Builder negate(Boolean negate) {
            return negate(Output.of(negate));
        }

        /**
         * @param registryValues The RegistryValues param.
         * 
         * @return builder
         * 
         */
        public Builder registryValues(@Nullable Output<List<HipObjectCustomChecksCriteriaRegistryKeyRegistryValueArgs>> registryValues) {
            $.registryValues = registryValues;
            return this;
        }

        /**
         * @param registryValues The RegistryValues param.
         * 
         * @return builder
         * 
         */
        public Builder registryValues(List<HipObjectCustomChecksCriteriaRegistryKeyRegistryValueArgs> registryValues) {
            return registryValues(Output.of(registryValues));
        }

        /**
         * @param registryValues The RegistryValues param.
         * 
         * @return builder
         * 
         */
        public Builder registryValues(HipObjectCustomChecksCriteriaRegistryKeyRegistryValueArgs... registryValues) {
            return registryValues(List.of(registryValues));
        }

        public HipObjectCustomChecksCriteriaRegistryKeyArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("HipObjectCustomChecksCriteriaRegistryKeyArgs", "name");
            }
            return $;
        }
    }

}
