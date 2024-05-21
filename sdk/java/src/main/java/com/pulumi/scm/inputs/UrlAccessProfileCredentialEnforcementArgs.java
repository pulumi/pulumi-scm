// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.scm.inputs.UrlAccessProfileCredentialEnforcementModeArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UrlAccessProfileCredentialEnforcementArgs extends com.pulumi.resources.ResourceArgs {

    public static final UrlAccessProfileCredentialEnforcementArgs Empty = new UrlAccessProfileCredentialEnforcementArgs();

    /**
     * The Alerts param.
     * 
     */
    @Import(name="alerts")
    private @Nullable Output<List<String>> alerts;

    /**
     * @return The Alerts param.
     * 
     */
    public Optional<Output<List<String>>> alerts() {
        return Optional.ofNullable(this.alerts);
    }

    /**
     * The Allows param.
     * 
     */
    @Import(name="allows")
    private @Nullable Output<List<String>> allows;

    /**
     * @return The Allows param.
     * 
     */
    public Optional<Output<List<String>>> allows() {
        return Optional.ofNullable(this.allows);
    }

    /**
     * The Blocks param.
     * 
     */
    @Import(name="blocks")
    private @Nullable Output<List<String>> blocks;

    /**
     * @return The Blocks param.
     * 
     */
    public Optional<Output<List<String>>> blocks() {
        return Optional.ofNullable(this.blocks);
    }

    /**
     * The Continues param.
     * 
     */
    @Import(name="continues")
    private @Nullable Output<List<String>> continues;

    /**
     * @return The Continues param.
     * 
     */
    public Optional<Output<List<String>>> continues() {
        return Optional.ofNullable(this.continues);
    }

    /**
     * The LogSeverity param. Default: `&#34;medium&#34;`.
     * 
     */
    @Import(name="logSeverity")
    private @Nullable Output<String> logSeverity;

    /**
     * @return The LogSeverity param. Default: `&#34;medium&#34;`.
     * 
     */
    public Optional<Output<String>> logSeverity() {
        return Optional.ofNullable(this.logSeverity);
    }

    /**
     * The Mode param.
     * 
     */
    @Import(name="mode")
    private @Nullable Output<UrlAccessProfileCredentialEnforcementModeArgs> mode;

    /**
     * @return The Mode param.
     * 
     */
    public Optional<Output<UrlAccessProfileCredentialEnforcementModeArgs>> mode() {
        return Optional.ofNullable(this.mode);
    }

    private UrlAccessProfileCredentialEnforcementArgs() {}

    private UrlAccessProfileCredentialEnforcementArgs(UrlAccessProfileCredentialEnforcementArgs $) {
        this.alerts = $.alerts;
        this.allows = $.allows;
        this.blocks = $.blocks;
        this.continues = $.continues;
        this.logSeverity = $.logSeverity;
        this.mode = $.mode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UrlAccessProfileCredentialEnforcementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UrlAccessProfileCredentialEnforcementArgs $;

        public Builder() {
            $ = new UrlAccessProfileCredentialEnforcementArgs();
        }

        public Builder(UrlAccessProfileCredentialEnforcementArgs defaults) {
            $ = new UrlAccessProfileCredentialEnforcementArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alerts The Alerts param.
         * 
         * @return builder
         * 
         */
        public Builder alerts(@Nullable Output<List<String>> alerts) {
            $.alerts = alerts;
            return this;
        }

        /**
         * @param alerts The Alerts param.
         * 
         * @return builder
         * 
         */
        public Builder alerts(List<String> alerts) {
            return alerts(Output.of(alerts));
        }

        /**
         * @param alerts The Alerts param.
         * 
         * @return builder
         * 
         */
        public Builder alerts(String... alerts) {
            return alerts(List.of(alerts));
        }

        /**
         * @param allows The Allows param.
         * 
         * @return builder
         * 
         */
        public Builder allows(@Nullable Output<List<String>> allows) {
            $.allows = allows;
            return this;
        }

        /**
         * @param allows The Allows param.
         * 
         * @return builder
         * 
         */
        public Builder allows(List<String> allows) {
            return allows(Output.of(allows));
        }

        /**
         * @param allows The Allows param.
         * 
         * @return builder
         * 
         */
        public Builder allows(String... allows) {
            return allows(List.of(allows));
        }

        /**
         * @param blocks The Blocks param.
         * 
         * @return builder
         * 
         */
        public Builder blocks(@Nullable Output<List<String>> blocks) {
            $.blocks = blocks;
            return this;
        }

        /**
         * @param blocks The Blocks param.
         * 
         * @return builder
         * 
         */
        public Builder blocks(List<String> blocks) {
            return blocks(Output.of(blocks));
        }

        /**
         * @param blocks The Blocks param.
         * 
         * @return builder
         * 
         */
        public Builder blocks(String... blocks) {
            return blocks(List.of(blocks));
        }

        /**
         * @param continues The Continues param.
         * 
         * @return builder
         * 
         */
        public Builder continues(@Nullable Output<List<String>> continues) {
            $.continues = continues;
            return this;
        }

        /**
         * @param continues The Continues param.
         * 
         * @return builder
         * 
         */
        public Builder continues(List<String> continues) {
            return continues(Output.of(continues));
        }

        /**
         * @param continues The Continues param.
         * 
         * @return builder
         * 
         */
        public Builder continues(String... continues) {
            return continues(List.of(continues));
        }

        /**
         * @param logSeverity The LogSeverity param. Default: `&#34;medium&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder logSeverity(@Nullable Output<String> logSeverity) {
            $.logSeverity = logSeverity;
            return this;
        }

        /**
         * @param logSeverity The LogSeverity param. Default: `&#34;medium&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder logSeverity(String logSeverity) {
            return logSeverity(Output.of(logSeverity));
        }

        /**
         * @param mode The Mode param.
         * 
         * @return builder
         * 
         */
        public Builder mode(@Nullable Output<UrlAccessProfileCredentialEnforcementModeArgs> mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param mode The Mode param.
         * 
         * @return builder
         * 
         */
        public Builder mode(UrlAccessProfileCredentialEnforcementModeArgs mode) {
            return mode(Output.of(mode));
        }

        public UrlAccessProfileCredentialEnforcementArgs build() {
            return $;
        }
    }

}
