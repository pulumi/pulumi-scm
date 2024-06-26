// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.scm.inputs.AntiSpywareSignatureSignatureStandardAndConditionOrConditionOperatorArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AntiSpywareSignatureSignatureStandardAndConditionOrConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final AntiSpywareSignatureSignatureStandardAndConditionOrConditionArgs Empty = new AntiSpywareSignatureSignatureStandardAndConditionOrConditionArgs();

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
     * The Operator param.
     * 
     */
    @Import(name="operator")
    private @Nullable Output<AntiSpywareSignatureSignatureStandardAndConditionOrConditionOperatorArgs> operator;

    /**
     * @return The Operator param.
     * 
     */
    public Optional<Output<AntiSpywareSignatureSignatureStandardAndConditionOrConditionOperatorArgs>> operator() {
        return Optional.ofNullable(this.operator);
    }

    private AntiSpywareSignatureSignatureStandardAndConditionOrConditionArgs() {}

    private AntiSpywareSignatureSignatureStandardAndConditionOrConditionArgs(AntiSpywareSignatureSignatureStandardAndConditionOrConditionArgs $) {
        this.name = $.name;
        this.operator = $.operator;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AntiSpywareSignatureSignatureStandardAndConditionOrConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AntiSpywareSignatureSignatureStandardAndConditionOrConditionArgs $;

        public Builder() {
            $ = new AntiSpywareSignatureSignatureStandardAndConditionOrConditionArgs();
        }

        public Builder(AntiSpywareSignatureSignatureStandardAndConditionOrConditionArgs defaults) {
            $ = new AntiSpywareSignatureSignatureStandardAndConditionOrConditionArgs(Objects.requireNonNull(defaults));
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
         * @param operator The Operator param.
         * 
         * @return builder
         * 
         */
        public Builder operator(@Nullable Output<AntiSpywareSignatureSignatureStandardAndConditionOrConditionOperatorArgs> operator) {
            $.operator = operator;
            return this;
        }

        /**
         * @param operator The Operator param.
         * 
         * @return builder
         * 
         */
        public Builder operator(AntiSpywareSignatureSignatureStandardAndConditionOrConditionOperatorArgs operator) {
            return operator(Output.of(operator));
        }

        public AntiSpywareSignatureSignatureStandardAndConditionOrConditionArgs build() {
            return $;
        }
    }

}
