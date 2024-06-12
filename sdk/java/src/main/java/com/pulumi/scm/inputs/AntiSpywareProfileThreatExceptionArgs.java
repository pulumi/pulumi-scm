// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.scm.inputs.AntiSpywareProfileThreatExceptionActionArgs;
import com.pulumi.scm.inputs.AntiSpywareProfileThreatExceptionExemptIpArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AntiSpywareProfileThreatExceptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final AntiSpywareProfileThreatExceptionArgs Empty = new AntiSpywareProfileThreatExceptionArgs();

    /**
     * The Action param.
     * 
     */
    @Import(name="action")
    private @Nullable Output<AntiSpywareProfileThreatExceptionActionArgs> action;

    /**
     * @return The Action param.
     * 
     */
    public Optional<Output<AntiSpywareProfileThreatExceptionActionArgs>> action() {
        return Optional.ofNullable(this.action);
    }

    /**
     * The ExemptIps param.
     * 
     */
    @Import(name="exemptIps")
    private @Nullable Output<List<AntiSpywareProfileThreatExceptionExemptIpArgs>> exemptIps;

    /**
     * @return The ExemptIps param.
     * 
     */
    public Optional<Output<List<AntiSpywareProfileThreatExceptionExemptIpArgs>>> exemptIps() {
        return Optional.ofNullable(this.exemptIps);
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
     * The Notes param.
     * 
     */
    @Import(name="notes")
    private @Nullable Output<String> notes;

    /**
     * @return The Notes param.
     * 
     */
    public Optional<Output<String>> notes() {
        return Optional.ofNullable(this.notes);
    }

    /**
     * The PacketCapture param. String must be one of these: `&#34;disable&#34;`, `&#34;single-packet&#34;`, `&#34;extended-capture&#34;`.
     * 
     */
    @Import(name="packetCapture")
    private @Nullable Output<String> packetCapture;

    /**
     * @return The PacketCapture param. String must be one of these: `&#34;disable&#34;`, `&#34;single-packet&#34;`, `&#34;extended-capture&#34;`.
     * 
     */
    public Optional<Output<String>> packetCapture() {
        return Optional.ofNullable(this.packetCapture);
    }

    private AntiSpywareProfileThreatExceptionArgs() {}

    private AntiSpywareProfileThreatExceptionArgs(AntiSpywareProfileThreatExceptionArgs $) {
        this.action = $.action;
        this.exemptIps = $.exemptIps;
        this.name = $.name;
        this.notes = $.notes;
        this.packetCapture = $.packetCapture;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AntiSpywareProfileThreatExceptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AntiSpywareProfileThreatExceptionArgs $;

        public Builder() {
            $ = new AntiSpywareProfileThreatExceptionArgs();
        }

        public Builder(AntiSpywareProfileThreatExceptionArgs defaults) {
            $ = new AntiSpywareProfileThreatExceptionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action The Action param.
         * 
         * @return builder
         * 
         */
        public Builder action(@Nullable Output<AntiSpywareProfileThreatExceptionActionArgs> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action The Action param.
         * 
         * @return builder
         * 
         */
        public Builder action(AntiSpywareProfileThreatExceptionActionArgs action) {
            return action(Output.of(action));
        }

        /**
         * @param exemptIps The ExemptIps param.
         * 
         * @return builder
         * 
         */
        public Builder exemptIps(@Nullable Output<List<AntiSpywareProfileThreatExceptionExemptIpArgs>> exemptIps) {
            $.exemptIps = exemptIps;
            return this;
        }

        /**
         * @param exemptIps The ExemptIps param.
         * 
         * @return builder
         * 
         */
        public Builder exemptIps(List<AntiSpywareProfileThreatExceptionExemptIpArgs> exemptIps) {
            return exemptIps(Output.of(exemptIps));
        }

        /**
         * @param exemptIps The ExemptIps param.
         * 
         * @return builder
         * 
         */
        public Builder exemptIps(AntiSpywareProfileThreatExceptionExemptIpArgs... exemptIps) {
            return exemptIps(List.of(exemptIps));
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
         * @param notes The Notes param.
         * 
         * @return builder
         * 
         */
        public Builder notes(@Nullable Output<String> notes) {
            $.notes = notes;
            return this;
        }

        /**
         * @param notes The Notes param.
         * 
         * @return builder
         * 
         */
        public Builder notes(String notes) {
            return notes(Output.of(notes));
        }

        /**
         * @param packetCapture The PacketCapture param. String must be one of these: `&#34;disable&#34;`, `&#34;single-packet&#34;`, `&#34;extended-capture&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder packetCapture(@Nullable Output<String> packetCapture) {
            $.packetCapture = packetCapture;
            return this;
        }

        /**
         * @param packetCapture The PacketCapture param. String must be one of these: `&#34;disable&#34;`, `&#34;single-packet&#34;`, `&#34;extended-capture&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder packetCapture(String packetCapture) {
            return packetCapture(Output.of(packetCapture));
        }

        public AntiSpywareProfileThreatExceptionArgs build() {
            return $;
        }
    }

}