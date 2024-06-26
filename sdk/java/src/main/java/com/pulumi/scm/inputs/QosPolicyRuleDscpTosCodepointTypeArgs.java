// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.scm.inputs.QosPolicyRuleDscpTosCodepointTypeAfArgs;
import com.pulumi.scm.inputs.QosPolicyRuleDscpTosCodepointTypeCsArgs;
import com.pulumi.scm.inputs.QosPolicyRuleDscpTosCodepointTypeCustomArgs;
import com.pulumi.scm.inputs.QosPolicyRuleDscpTosCodepointTypeTosArgs;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class QosPolicyRuleDscpTosCodepointTypeArgs extends com.pulumi.resources.ResourceArgs {

    public static final QosPolicyRuleDscpTosCodepointTypeArgs Empty = new QosPolicyRuleDscpTosCodepointTypeArgs();

    /**
     * The Af param. Ensure that only one of the following is specified: `af`, `cs`, `custom`, `ef`, `tos`
     * 
     */
    @Import(name="af")
    private @Nullable Output<QosPolicyRuleDscpTosCodepointTypeAfArgs> af;

    /**
     * @return The Af param. Ensure that only one of the following is specified: `af`, `cs`, `custom`, `ef`, `tos`
     * 
     */
    public Optional<Output<QosPolicyRuleDscpTosCodepointTypeAfArgs>> af() {
        return Optional.ofNullable(this.af);
    }

    /**
     * The Cs param. Ensure that only one of the following is specified: `af`, `cs`, `custom`, `ef`, `tos`
     * 
     */
    @Import(name="cs")
    private @Nullable Output<QosPolicyRuleDscpTosCodepointTypeCsArgs> cs;

    /**
     * @return The Cs param. Ensure that only one of the following is specified: `af`, `cs`, `custom`, `ef`, `tos`
     * 
     */
    public Optional<Output<QosPolicyRuleDscpTosCodepointTypeCsArgs>> cs() {
        return Optional.ofNullable(this.cs);
    }

    /**
     * The Custom param. Ensure that only one of the following is specified: `af`, `cs`, `custom`, `ef`, `tos`
     * 
     */
    @Import(name="custom")
    private @Nullable Output<QosPolicyRuleDscpTosCodepointTypeCustomArgs> custom;

    /**
     * @return The Custom param. Ensure that only one of the following is specified: `af`, `cs`, `custom`, `ef`, `tos`
     * 
     */
    public Optional<Output<QosPolicyRuleDscpTosCodepointTypeCustomArgs>> custom() {
        return Optional.ofNullable(this.custom);
    }

    /**
     * The Ef param. Ensure that only one of the following is specified: `af`, `cs`, `custom`, `ef`, `tos`
     * 
     */
    @Import(name="ef")
    private @Nullable Output<Boolean> ef;

    /**
     * @return The Ef param. Ensure that only one of the following is specified: `af`, `cs`, `custom`, `ef`, `tos`
     * 
     */
    public Optional<Output<Boolean>> ef() {
        return Optional.ofNullable(this.ef);
    }

    /**
     * The Tos param. Ensure that only one of the following is specified: `af`, `cs`, `custom`, `ef`, `tos`
     * 
     */
    @Import(name="tos")
    private @Nullable Output<QosPolicyRuleDscpTosCodepointTypeTosArgs> tos;

    /**
     * @return The Tos param. Ensure that only one of the following is specified: `af`, `cs`, `custom`, `ef`, `tos`
     * 
     */
    public Optional<Output<QosPolicyRuleDscpTosCodepointTypeTosArgs>> tos() {
        return Optional.ofNullable(this.tos);
    }

    private QosPolicyRuleDscpTosCodepointTypeArgs() {}

    private QosPolicyRuleDscpTosCodepointTypeArgs(QosPolicyRuleDscpTosCodepointTypeArgs $) {
        this.af = $.af;
        this.cs = $.cs;
        this.custom = $.custom;
        this.ef = $.ef;
        this.tos = $.tos;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(QosPolicyRuleDscpTosCodepointTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private QosPolicyRuleDscpTosCodepointTypeArgs $;

        public Builder() {
            $ = new QosPolicyRuleDscpTosCodepointTypeArgs();
        }

        public Builder(QosPolicyRuleDscpTosCodepointTypeArgs defaults) {
            $ = new QosPolicyRuleDscpTosCodepointTypeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param af The Af param. Ensure that only one of the following is specified: `af`, `cs`, `custom`, `ef`, `tos`
         * 
         * @return builder
         * 
         */
        public Builder af(@Nullable Output<QosPolicyRuleDscpTosCodepointTypeAfArgs> af) {
            $.af = af;
            return this;
        }

        /**
         * @param af The Af param. Ensure that only one of the following is specified: `af`, `cs`, `custom`, `ef`, `tos`
         * 
         * @return builder
         * 
         */
        public Builder af(QosPolicyRuleDscpTosCodepointTypeAfArgs af) {
            return af(Output.of(af));
        }

        /**
         * @param cs The Cs param. Ensure that only one of the following is specified: `af`, `cs`, `custom`, `ef`, `tos`
         * 
         * @return builder
         * 
         */
        public Builder cs(@Nullable Output<QosPolicyRuleDscpTosCodepointTypeCsArgs> cs) {
            $.cs = cs;
            return this;
        }

        /**
         * @param cs The Cs param. Ensure that only one of the following is specified: `af`, `cs`, `custom`, `ef`, `tos`
         * 
         * @return builder
         * 
         */
        public Builder cs(QosPolicyRuleDscpTosCodepointTypeCsArgs cs) {
            return cs(Output.of(cs));
        }

        /**
         * @param custom The Custom param. Ensure that only one of the following is specified: `af`, `cs`, `custom`, `ef`, `tos`
         * 
         * @return builder
         * 
         */
        public Builder custom(@Nullable Output<QosPolicyRuleDscpTosCodepointTypeCustomArgs> custom) {
            $.custom = custom;
            return this;
        }

        /**
         * @param custom The Custom param. Ensure that only one of the following is specified: `af`, `cs`, `custom`, `ef`, `tos`
         * 
         * @return builder
         * 
         */
        public Builder custom(QosPolicyRuleDscpTosCodepointTypeCustomArgs custom) {
            return custom(Output.of(custom));
        }

        /**
         * @param ef The Ef param. Ensure that only one of the following is specified: `af`, `cs`, `custom`, `ef`, `tos`
         * 
         * @return builder
         * 
         */
        public Builder ef(@Nullable Output<Boolean> ef) {
            $.ef = ef;
            return this;
        }

        /**
         * @param ef The Ef param. Ensure that only one of the following is specified: `af`, `cs`, `custom`, `ef`, `tos`
         * 
         * @return builder
         * 
         */
        public Builder ef(Boolean ef) {
            return ef(Output.of(ef));
        }

        /**
         * @param tos The Tos param. Ensure that only one of the following is specified: `af`, `cs`, `custom`, `ef`, `tos`
         * 
         * @return builder
         * 
         */
        public Builder tos(@Nullable Output<QosPolicyRuleDscpTosCodepointTypeTosArgs> tos) {
            $.tos = tos;
            return this;
        }

        /**
         * @param tos The Tos param. Ensure that only one of the following is specified: `af`, `cs`, `custom`, `ef`, `tos`
         * 
         * @return builder
         * 
         */
        public Builder tos(QosPolicyRuleDscpTosCodepointTypeTosArgs tos) {
            return tos(Output.of(tos));
        }

        public QosPolicyRuleDscpTosCodepointTypeArgs build() {
            return $;
        }
    }

}
