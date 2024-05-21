// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.inputs.ApplicationSignatureAndConditionOrConditionOperatorArgs;
import java.lang.String;
import java.util.Objects;


public final class ApplicationSignatureAndConditionOrConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationSignatureAndConditionOrConditionArgs Empty = new ApplicationSignatureAndConditionOrConditionArgs();

    /**
     * Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The Operator param.
     * 
     */
    @Import(name="operator", required=true)
    private Output<ApplicationSignatureAndConditionOrConditionOperatorArgs> operator;

    /**
     * @return The Operator param.
     * 
     */
    public Output<ApplicationSignatureAndConditionOrConditionOperatorArgs> operator() {
        return this.operator;
    }

    private ApplicationSignatureAndConditionOrConditionArgs() {}

    private ApplicationSignatureAndConditionOrConditionArgs(ApplicationSignatureAndConditionOrConditionArgs $) {
        this.name = $.name;
        this.operator = $.operator;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationSignatureAndConditionOrConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationSignatureAndConditionOrConditionArgs $;

        public Builder() {
            $ = new ApplicationSignatureAndConditionOrConditionArgs();
        }

        public Builder(ApplicationSignatureAndConditionOrConditionArgs defaults) {
            $ = new ApplicationSignatureAndConditionOrConditionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
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
        public Builder operator(Output<ApplicationSignatureAndConditionOrConditionOperatorArgs> operator) {
            $.operator = operator;
            return this;
        }

        /**
         * @param operator The Operator param.
         * 
         * @return builder
         * 
         */
        public Builder operator(ApplicationSignatureAndConditionOrConditionOperatorArgs operator) {
            return operator(Output.of(operator));
        }

        public ApplicationSignatureAndConditionOrConditionArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("ApplicationSignatureAndConditionOrConditionArgs", "name");
            }
            if ($.operator == null) {
                throw new MissingRequiredPropertyException("ApplicationSignatureAndConditionOrConditionArgs", "operator");
            }
            return $;
        }
    }

}
