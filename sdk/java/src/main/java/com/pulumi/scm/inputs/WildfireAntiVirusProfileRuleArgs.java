// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WildfireAntiVirusProfileRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final WildfireAntiVirusProfileRuleArgs Empty = new WildfireAntiVirusProfileRuleArgs();

    /**
     * The Analysis param. String must be one of these: `&#34;public-cloud&#34;`, `&#34;private-cloud&#34;`.
     * 
     */
    @Import(name="analysis")
    private @Nullable Output<String> analysis;

    /**
     * @return The Analysis param. String must be one of these: `&#34;public-cloud&#34;`, `&#34;private-cloud&#34;`.
     * 
     */
    public Optional<Output<String>> analysis() {
        return Optional.ofNullable(this.analysis);
    }

    /**
     * The Applications param.
     * 
     */
    @Import(name="applications")
    private @Nullable Output<List<String>> applications;

    /**
     * @return The Applications param.
     * 
     */
    public Optional<Output<List<String>>> applications() {
        return Optional.ofNullable(this.applications);
    }

    /**
     * The Direction param. String must be one of these: `&#34;download&#34;`, `&#34;upload&#34;`, `&#34;both&#34;`.
     * 
     */
    @Import(name="direction")
    private @Nullable Output<String> direction;

    /**
     * @return The Direction param. String must be one of these: `&#34;download&#34;`, `&#34;upload&#34;`, `&#34;both&#34;`.
     * 
     */
    public Optional<Output<String>> direction() {
        return Optional.ofNullable(this.direction);
    }

    /**
     * The FileTypes param.
     * 
     */
    @Import(name="fileTypes")
    private @Nullable Output<List<String>> fileTypes;

    /**
     * @return The FileTypes param.
     * 
     */
    public Optional<Output<List<String>>> fileTypes() {
        return Optional.ofNullable(this.fileTypes);
    }

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

    private WildfireAntiVirusProfileRuleArgs() {}

    private WildfireAntiVirusProfileRuleArgs(WildfireAntiVirusProfileRuleArgs $) {
        this.analysis = $.analysis;
        this.applications = $.applications;
        this.direction = $.direction;
        this.fileTypes = $.fileTypes;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WildfireAntiVirusProfileRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WildfireAntiVirusProfileRuleArgs $;

        public Builder() {
            $ = new WildfireAntiVirusProfileRuleArgs();
        }

        public Builder(WildfireAntiVirusProfileRuleArgs defaults) {
            $ = new WildfireAntiVirusProfileRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param analysis The Analysis param. String must be one of these: `&#34;public-cloud&#34;`, `&#34;private-cloud&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder analysis(@Nullable Output<String> analysis) {
            $.analysis = analysis;
            return this;
        }

        /**
         * @param analysis The Analysis param. String must be one of these: `&#34;public-cloud&#34;`, `&#34;private-cloud&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder analysis(String analysis) {
            return analysis(Output.of(analysis));
        }

        /**
         * @param applications The Applications param.
         * 
         * @return builder
         * 
         */
        public Builder applications(@Nullable Output<List<String>> applications) {
            $.applications = applications;
            return this;
        }

        /**
         * @param applications The Applications param.
         * 
         * @return builder
         * 
         */
        public Builder applications(List<String> applications) {
            return applications(Output.of(applications));
        }

        /**
         * @param applications The Applications param.
         * 
         * @return builder
         * 
         */
        public Builder applications(String... applications) {
            return applications(List.of(applications));
        }

        /**
         * @param direction The Direction param. String must be one of these: `&#34;download&#34;`, `&#34;upload&#34;`, `&#34;both&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder direction(@Nullable Output<String> direction) {
            $.direction = direction;
            return this;
        }

        /**
         * @param direction The Direction param. String must be one of these: `&#34;download&#34;`, `&#34;upload&#34;`, `&#34;both&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder direction(String direction) {
            return direction(Output.of(direction));
        }

        /**
         * @param fileTypes The FileTypes param.
         * 
         * @return builder
         * 
         */
        public Builder fileTypes(@Nullable Output<List<String>> fileTypes) {
            $.fileTypes = fileTypes;
            return this;
        }

        /**
         * @param fileTypes The FileTypes param.
         * 
         * @return builder
         * 
         */
        public Builder fileTypes(List<String> fileTypes) {
            return fileTypes(Output.of(fileTypes));
        }

        /**
         * @param fileTypes The FileTypes param.
         * 
         * @return builder
         * 
         */
        public Builder fileTypes(String... fileTypes) {
            return fileTypes(List.of(fileTypes));
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

        public WildfireAntiVirusProfileRuleArgs build() {
            return $;
        }
    }

}
