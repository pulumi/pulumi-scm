// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AntiSpywareSignatureSignatureStandardAndConditionOrConditionOperatorEqualToQualifierArgs extends com.pulumi.resources.ResourceArgs {

    public static final AntiSpywareSignatureSignatureStandardAndConditionOrConditionOperatorEqualToQualifierArgs Empty = new AntiSpywareSignatureSignatureStandardAndConditionOrConditionOperatorEqualToQualifierArgs();

    /**
     * The Name param.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The Name param.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The Value param.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return The Value param.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private AntiSpywareSignatureSignatureStandardAndConditionOrConditionOperatorEqualToQualifierArgs() {}

    private AntiSpywareSignatureSignatureStandardAndConditionOrConditionOperatorEqualToQualifierArgs(AntiSpywareSignatureSignatureStandardAndConditionOrConditionOperatorEqualToQualifierArgs $) {
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AntiSpywareSignatureSignatureStandardAndConditionOrConditionOperatorEqualToQualifierArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AntiSpywareSignatureSignatureStandardAndConditionOrConditionOperatorEqualToQualifierArgs $;

        public Builder() {
            $ = new AntiSpywareSignatureSignatureStandardAndConditionOrConditionOperatorEqualToQualifierArgs();
        }

        public Builder(AntiSpywareSignatureSignatureStandardAndConditionOrConditionOperatorEqualToQualifierArgs defaults) {
            $ = new AntiSpywareSignatureSignatureStandardAndConditionOrConditionOperatorEqualToQualifierArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The Name param.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The Name param.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param value The Value param.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The Value param.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public AntiSpywareSignatureSignatureStandardAndConditionOrConditionOperatorEqualToQualifierArgs build() {
            return $;
        }
    }

}
