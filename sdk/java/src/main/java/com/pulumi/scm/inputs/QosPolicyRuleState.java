// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.scm.inputs.QosPolicyRuleActionArgs;
import com.pulumi.scm.inputs.QosPolicyRuleDscpTosArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class QosPolicyRuleState extends com.pulumi.resources.ResourceArgs {

    public static final QosPolicyRuleState Empty = new QosPolicyRuleState();

    /**
     * The Action param.
     * 
     */
    @Import(name="action")
    private @Nullable Output<QosPolicyRuleActionArgs> action;

    /**
     * @return The Action param.
     * 
     */
    public Optional<Output<QosPolicyRuleActionArgs>> action() {
        return Optional.ofNullable(this.action);
    }

    /**
     * The Description param.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The Description param.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The Device param.
     * 
     */
    @Import(name="device")
    private @Nullable Output<String> device;

    /**
     * @return The Device param.
     * 
     */
    public Optional<Output<String>> device() {
        return Optional.ofNullable(this.device);
    }

    /**
     * The DscpTos param.
     * 
     */
    @Import(name="dscpTos")
    private @Nullable Output<QosPolicyRuleDscpTosArgs> dscpTos;

    /**
     * @return The DscpTos param.
     * 
     */
    public Optional<Output<QosPolicyRuleDscpTosArgs>> dscpTos() {
        return Optional.ofNullable(this.dscpTos);
    }

    /**
     * The Folder param.
     * 
     */
    @Import(name="folder")
    private @Nullable Output<String> folder;

    /**
     * @return The Folder param.
     * 
     */
    public Optional<Output<String>> folder() {
        return Optional.ofNullable(this.folder);
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

    /**
     * The Position param. String must be one of these: `&#34;pre&#34;`, `&#34;post&#34;`. Default: `&#34;pre&#34;`.
     * 
     */
    @Import(name="position")
    private @Nullable Output<String> position;

    /**
     * @return The Position param. String must be one of these: `&#34;pre&#34;`, `&#34;post&#34;`. Default: `&#34;pre&#34;`.
     * 
     */
    public Optional<Output<String>> position() {
        return Optional.ofNullable(this.position);
    }

    /**
     * The Schedule param.
     * 
     */
    @Import(name="schedule")
    private @Nullable Output<String> schedule;

    /**
     * @return The Schedule param.
     * 
     */
    public Optional<Output<String>> schedule() {
        return Optional.ofNullable(this.schedule);
    }

    /**
     * The Snippet param.
     * 
     */
    @Import(name="snippet")
    private @Nullable Output<String> snippet;

    /**
     * @return The Snippet param.
     * 
     */
    public Optional<Output<String>> snippet() {
        return Optional.ofNullable(this.snippet);
    }

    @Import(name="tfid")
    private @Nullable Output<String> tfid;

    public Optional<Output<String>> tfid() {
        return Optional.ofNullable(this.tfid);
    }

    private QosPolicyRuleState() {}

    private QosPolicyRuleState(QosPolicyRuleState $) {
        this.action = $.action;
        this.description = $.description;
        this.device = $.device;
        this.dscpTos = $.dscpTos;
        this.folder = $.folder;
        this.name = $.name;
        this.position = $.position;
        this.schedule = $.schedule;
        this.snippet = $.snippet;
        this.tfid = $.tfid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(QosPolicyRuleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private QosPolicyRuleState $;

        public Builder() {
            $ = new QosPolicyRuleState();
        }

        public Builder(QosPolicyRuleState defaults) {
            $ = new QosPolicyRuleState(Objects.requireNonNull(defaults));
        }

        /**
         * @param action The Action param.
         * 
         * @return builder
         * 
         */
        public Builder action(@Nullable Output<QosPolicyRuleActionArgs> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action The Action param.
         * 
         * @return builder
         * 
         */
        public Builder action(QosPolicyRuleActionArgs action) {
            return action(Output.of(action));
        }

        /**
         * @param description The Description param.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The Description param.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param device The Device param.
         * 
         * @return builder
         * 
         */
        public Builder device(@Nullable Output<String> device) {
            $.device = device;
            return this;
        }

        /**
         * @param device The Device param.
         * 
         * @return builder
         * 
         */
        public Builder device(String device) {
            return device(Output.of(device));
        }

        /**
         * @param dscpTos The DscpTos param.
         * 
         * @return builder
         * 
         */
        public Builder dscpTos(@Nullable Output<QosPolicyRuleDscpTosArgs> dscpTos) {
            $.dscpTos = dscpTos;
            return this;
        }

        /**
         * @param dscpTos The DscpTos param.
         * 
         * @return builder
         * 
         */
        public Builder dscpTos(QosPolicyRuleDscpTosArgs dscpTos) {
            return dscpTos(Output.of(dscpTos));
        }

        /**
         * @param folder The Folder param.
         * 
         * @return builder
         * 
         */
        public Builder folder(@Nullable Output<String> folder) {
            $.folder = folder;
            return this;
        }

        /**
         * @param folder The Folder param.
         * 
         * @return builder
         * 
         */
        public Builder folder(String folder) {
            return folder(Output.of(folder));
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
         * @param position The Position param. String must be one of these: `&#34;pre&#34;`, `&#34;post&#34;`. Default: `&#34;pre&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder position(@Nullable Output<String> position) {
            $.position = position;
            return this;
        }

        /**
         * @param position The Position param. String must be one of these: `&#34;pre&#34;`, `&#34;post&#34;`. Default: `&#34;pre&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder position(String position) {
            return position(Output.of(position));
        }

        /**
         * @param schedule The Schedule param.
         * 
         * @return builder
         * 
         */
        public Builder schedule(@Nullable Output<String> schedule) {
            $.schedule = schedule;
            return this;
        }

        /**
         * @param schedule The Schedule param.
         * 
         * @return builder
         * 
         */
        public Builder schedule(String schedule) {
            return schedule(Output.of(schedule));
        }

        /**
         * @param snippet The Snippet param.
         * 
         * @return builder
         * 
         */
        public Builder snippet(@Nullable Output<String> snippet) {
            $.snippet = snippet;
            return this;
        }

        /**
         * @param snippet The Snippet param.
         * 
         * @return builder
         * 
         */
        public Builder snippet(String snippet) {
            return snippet(Output.of(snippet));
        }

        public Builder tfid(@Nullable Output<String> tfid) {
            $.tfid = tfid;
            return this;
        }

        public Builder tfid(String tfid) {
            return tfid(Output.of(tfid));
        }

        public QosPolicyRuleState build() {
            return $;
        }
    }

}