// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.inputs.HipObjectCustomChecksCriteriaPlistKeyArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HipObjectCustomChecksCriteriaPlistArgs extends com.pulumi.resources.ResourceArgs {

    public static final HipObjectCustomChecksCriteriaPlistArgs Empty = new HipObjectCustomChecksCriteriaPlistArgs();

    /**
     * The Keys param.
     * 
     */
    @Import(name="keys")
    private @Nullable Output<List<HipObjectCustomChecksCriteriaPlistKeyArgs>> keys;

    /**
     * @return The Keys param.
     * 
     */
    public Optional<Output<List<HipObjectCustomChecksCriteriaPlistKeyArgs>>> keys() {
        return Optional.ofNullable(this.keys);
    }

    /**
     * Preference list. String length must not exceed 1023 characters.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Preference list. String length must not exceed 1023 characters.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Plist does not exist. Default: `false`.
     * 
     */
    @Import(name="negate")
    private @Nullable Output<Boolean> negate;

    /**
     * @return Plist does not exist. Default: `false`.
     * 
     */
    public Optional<Output<Boolean>> negate() {
        return Optional.ofNullable(this.negate);
    }

    private HipObjectCustomChecksCriteriaPlistArgs() {}

    private HipObjectCustomChecksCriteriaPlistArgs(HipObjectCustomChecksCriteriaPlistArgs $) {
        this.keys = $.keys;
        this.name = $.name;
        this.negate = $.negate;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HipObjectCustomChecksCriteriaPlistArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HipObjectCustomChecksCriteriaPlistArgs $;

        public Builder() {
            $ = new HipObjectCustomChecksCriteriaPlistArgs();
        }

        public Builder(HipObjectCustomChecksCriteriaPlistArgs defaults) {
            $ = new HipObjectCustomChecksCriteriaPlistArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param keys The Keys param.
         * 
         * @return builder
         * 
         */
        public Builder keys(@Nullable Output<List<HipObjectCustomChecksCriteriaPlistKeyArgs>> keys) {
            $.keys = keys;
            return this;
        }

        /**
         * @param keys The Keys param.
         * 
         * @return builder
         * 
         */
        public Builder keys(List<HipObjectCustomChecksCriteriaPlistKeyArgs> keys) {
            return keys(Output.of(keys));
        }

        /**
         * @param keys The Keys param.
         * 
         * @return builder
         * 
         */
        public Builder keys(HipObjectCustomChecksCriteriaPlistKeyArgs... keys) {
            return keys(List.of(keys));
        }

        /**
         * @param name Preference list. String length must not exceed 1023 characters.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Preference list. String length must not exceed 1023 characters.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param negate Plist does not exist. Default: `false`.
         * 
         * @return builder
         * 
         */
        public Builder negate(@Nullable Output<Boolean> negate) {
            $.negate = negate;
            return this;
        }

        /**
         * @param negate Plist does not exist. Default: `false`.
         * 
         * @return builder
         * 
         */
        public Builder negate(Boolean negate) {
            return negate(Output.of(negate));
        }

        public HipObjectCustomChecksCriteriaPlistArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("HipObjectCustomChecksCriteriaPlistArgs", "name");
            }
            return $;
        }
    }

}