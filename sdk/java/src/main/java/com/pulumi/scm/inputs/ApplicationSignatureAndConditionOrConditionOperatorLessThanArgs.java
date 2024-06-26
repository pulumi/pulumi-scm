// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.inputs.ApplicationSignatureAndConditionOrConditionOperatorLessThanQualifierArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationSignatureAndConditionOrConditionOperatorLessThanArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationSignatureAndConditionOrConditionOperatorLessThanArgs Empty = new ApplicationSignatureAndConditionOrConditionOperatorLessThanArgs();

    /**
     * The Context param. String length must not exceed 127 characters.
     * 
     */
    @Import(name="context", required=true)
    private Output<String> context;

    /**
     * @return The Context param. String length must not exceed 127 characters.
     * 
     */
    public Output<String> context() {
        return this.context;
    }

    /**
     * The Qualifiers param.
     * 
     */
    @Import(name="qualifiers")
    private @Nullable Output<List<ApplicationSignatureAndConditionOrConditionOperatorLessThanQualifierArgs>> qualifiers;

    /**
     * @return The Qualifiers param.
     * 
     */
    public Optional<Output<List<ApplicationSignatureAndConditionOrConditionOperatorLessThanQualifierArgs>>> qualifiers() {
        return Optional.ofNullable(this.qualifiers);
    }

    /**
     * The Value param. Value must be between 0 and 4294967295.
     * 
     */
    @Import(name="value", required=true)
    private Output<Integer> value;

    /**
     * @return The Value param. Value must be between 0 and 4294967295.
     * 
     */
    public Output<Integer> value() {
        return this.value;
    }

    private ApplicationSignatureAndConditionOrConditionOperatorLessThanArgs() {}

    private ApplicationSignatureAndConditionOrConditionOperatorLessThanArgs(ApplicationSignatureAndConditionOrConditionOperatorLessThanArgs $) {
        this.context = $.context;
        this.qualifiers = $.qualifiers;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationSignatureAndConditionOrConditionOperatorLessThanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationSignatureAndConditionOrConditionOperatorLessThanArgs $;

        public Builder() {
            $ = new ApplicationSignatureAndConditionOrConditionOperatorLessThanArgs();
        }

        public Builder(ApplicationSignatureAndConditionOrConditionOperatorLessThanArgs defaults) {
            $ = new ApplicationSignatureAndConditionOrConditionOperatorLessThanArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param context The Context param. String length must not exceed 127 characters.
         * 
         * @return builder
         * 
         */
        public Builder context(Output<String> context) {
            $.context = context;
            return this;
        }

        /**
         * @param context The Context param. String length must not exceed 127 characters.
         * 
         * @return builder
         * 
         */
        public Builder context(String context) {
            return context(Output.of(context));
        }

        /**
         * @param qualifiers The Qualifiers param.
         * 
         * @return builder
         * 
         */
        public Builder qualifiers(@Nullable Output<List<ApplicationSignatureAndConditionOrConditionOperatorLessThanQualifierArgs>> qualifiers) {
            $.qualifiers = qualifiers;
            return this;
        }

        /**
         * @param qualifiers The Qualifiers param.
         * 
         * @return builder
         * 
         */
        public Builder qualifiers(List<ApplicationSignatureAndConditionOrConditionOperatorLessThanQualifierArgs> qualifiers) {
            return qualifiers(Output.of(qualifiers));
        }

        /**
         * @param qualifiers The Qualifiers param.
         * 
         * @return builder
         * 
         */
        public Builder qualifiers(ApplicationSignatureAndConditionOrConditionOperatorLessThanQualifierArgs... qualifiers) {
            return qualifiers(List.of(qualifiers));
        }

        /**
         * @param value The Value param. Value must be between 0 and 4294967295.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<Integer> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The Value param. Value must be between 0 and 4294967295.
         * 
         * @return builder
         * 
         */
        public Builder value(Integer value) {
            return value(Output.of(value));
        }

        public ApplicationSignatureAndConditionOrConditionOperatorLessThanArgs build() {
            if ($.context == null) {
                throw new MissingRequiredPropertyException("ApplicationSignatureAndConditionOrConditionOperatorLessThanArgs", "context");
            }
            if ($.value == null) {
                throw new MissingRequiredPropertyException("ApplicationSignatureAndConditionOrConditionOperatorLessThanArgs", "value");
            }
            return $;
        }
    }

}
