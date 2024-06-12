// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppOverrideRuleState extends com.pulumi.resources.ResourceArgs {

    public static final AppOverrideRuleState Empty = new AppOverrideRuleState();

    /**
     * The Application param.
     * 
     */
    @Import(name="application")
    private @Nullable Output<String> application;

    /**
     * @return The Application param.
     * 
     */
    public Optional<Output<String>> application() {
        return Optional.ofNullable(this.application);
    }

    /**
     * The Description param. String length must not exceed 1024 characters.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The Description param. String length must not exceed 1024 characters.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The Destinations param.
     * 
     */
    @Import(name="destinations")
    private @Nullable Output<List<String>> destinations;

    /**
     * @return The Destinations param.
     * 
     */
    public Optional<Output<List<String>>> destinations() {
        return Optional.ofNullable(this.destinations);
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
     * The Disabled param. Default: `false`.
     * 
     */
    @Import(name="disabled")
    private @Nullable Output<Boolean> disabled;

    /**
     * @return The Disabled param. Default: `false`.
     * 
     */
    public Optional<Output<Boolean>> disabled() {
        return Optional.ofNullable(this.disabled);
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
     * The Froms param.
     * 
     */
    @Import(name="froms")
    private @Nullable Output<List<String>> froms;

    /**
     * @return The Froms param.
     * 
     */
    public Optional<Output<List<String>>> froms() {
        return Optional.ofNullable(this.froms);
    }

    /**
     * The GroupTag param.
     * 
     */
    @Import(name="groupTag")
    private @Nullable Output<String> groupTag;

    /**
     * @return The GroupTag param.
     * 
     */
    public Optional<Output<String>> groupTag() {
        return Optional.ofNullable(this.groupTag);
    }

    /**
     * The Name param. String length must not exceed 63 characters. String validation regex: `^[a-zA-Z0-9._-]+$`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The Name param. String length must not exceed 63 characters. String validation regex: `^[a-zA-Z0-9._-]+$`.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The NegateDestination param. Default: `false`.
     * 
     */
    @Import(name="negateDestination")
    private @Nullable Output<Boolean> negateDestination;

    /**
     * @return The NegateDestination param. Default: `false`.
     * 
     */
    public Optional<Output<Boolean>> negateDestination() {
        return Optional.ofNullable(this.negateDestination);
    }

    /**
     * The NegateSource param. Default: `false`.
     * 
     */
    @Import(name="negateSource")
    private @Nullable Output<Boolean> negateSource;

    /**
     * @return The NegateSource param. Default: `false`.
     * 
     */
    public Optional<Output<Boolean>> negateSource() {
        return Optional.ofNullable(this.negateSource);
    }

    /**
     * The Port param. Value must be between 0 and 65535.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return The Port param. Value must be between 0 and 65535.
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
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
     * The Protocol param. String must be one of these: `&#34;tcp&#34;`, `&#34;udp&#34;`.
     * 
     */
    @Import(name="protocol")
    private @Nullable Output<String> protocol;

    /**
     * @return The Protocol param. String must be one of these: `&#34;tcp&#34;`, `&#34;udp&#34;`.
     * 
     */
    public Optional<Output<String>> protocol() {
        return Optional.ofNullable(this.protocol);
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

    /**
     * The Sources param.
     * 
     */
    @Import(name="sources")
    private @Nullable Output<List<String>> sources;

    /**
     * @return The Sources param.
     * 
     */
    public Optional<Output<List<String>>> sources() {
        return Optional.ofNullable(this.sources);
    }

    /**
     * The Tags param.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return The Tags param.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    @Import(name="tfid")
    private @Nullable Output<String> tfid;

    public Optional<Output<String>> tfid() {
        return Optional.ofNullable(this.tfid);
    }

    /**
     * The Tos param.
     * 
     */
    @Import(name="tos")
    private @Nullable Output<List<String>> tos;

    /**
     * @return The Tos param.
     * 
     */
    public Optional<Output<List<String>>> tos() {
        return Optional.ofNullable(this.tos);
    }

    private AppOverrideRuleState() {}

    private AppOverrideRuleState(AppOverrideRuleState $) {
        this.application = $.application;
        this.description = $.description;
        this.destinations = $.destinations;
        this.device = $.device;
        this.disabled = $.disabled;
        this.folder = $.folder;
        this.froms = $.froms;
        this.groupTag = $.groupTag;
        this.name = $.name;
        this.negateDestination = $.negateDestination;
        this.negateSource = $.negateSource;
        this.port = $.port;
        this.position = $.position;
        this.protocol = $.protocol;
        this.snippet = $.snippet;
        this.sources = $.sources;
        this.tags = $.tags;
        this.tfid = $.tfid;
        this.tos = $.tos;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppOverrideRuleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppOverrideRuleState $;

        public Builder() {
            $ = new AppOverrideRuleState();
        }

        public Builder(AppOverrideRuleState defaults) {
            $ = new AppOverrideRuleState(Objects.requireNonNull(defaults));
        }

        /**
         * @param application The Application param.
         * 
         * @return builder
         * 
         */
        public Builder application(@Nullable Output<String> application) {
            $.application = application;
            return this;
        }

        /**
         * @param application The Application param.
         * 
         * @return builder
         * 
         */
        public Builder application(String application) {
            return application(Output.of(application));
        }

        /**
         * @param description The Description param. String length must not exceed 1024 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The Description param. String length must not exceed 1024 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param destinations The Destinations param.
         * 
         * @return builder
         * 
         */
        public Builder destinations(@Nullable Output<List<String>> destinations) {
            $.destinations = destinations;
            return this;
        }

        /**
         * @param destinations The Destinations param.
         * 
         * @return builder
         * 
         */
        public Builder destinations(List<String> destinations) {
            return destinations(Output.of(destinations));
        }

        /**
         * @param destinations The Destinations param.
         * 
         * @return builder
         * 
         */
        public Builder destinations(String... destinations) {
            return destinations(List.of(destinations));
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
         * @param disabled The Disabled param. Default: `false`.
         * 
         * @return builder
         * 
         */
        public Builder disabled(@Nullable Output<Boolean> disabled) {
            $.disabled = disabled;
            return this;
        }

        /**
         * @param disabled The Disabled param. Default: `false`.
         * 
         * @return builder
         * 
         */
        public Builder disabled(Boolean disabled) {
            return disabled(Output.of(disabled));
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
         * @param froms The Froms param.
         * 
         * @return builder
         * 
         */
        public Builder froms(@Nullable Output<List<String>> froms) {
            $.froms = froms;
            return this;
        }

        /**
         * @param froms The Froms param.
         * 
         * @return builder
         * 
         */
        public Builder froms(List<String> froms) {
            return froms(Output.of(froms));
        }

        /**
         * @param froms The Froms param.
         * 
         * @return builder
         * 
         */
        public Builder froms(String... froms) {
            return froms(List.of(froms));
        }

        /**
         * @param groupTag The GroupTag param.
         * 
         * @return builder
         * 
         */
        public Builder groupTag(@Nullable Output<String> groupTag) {
            $.groupTag = groupTag;
            return this;
        }

        /**
         * @param groupTag The GroupTag param.
         * 
         * @return builder
         * 
         */
        public Builder groupTag(String groupTag) {
            return groupTag(Output.of(groupTag));
        }

        /**
         * @param name The Name param. String length must not exceed 63 characters. String validation regex: `^[a-zA-Z0-9._-]+$`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The Name param. String length must not exceed 63 characters. String validation regex: `^[a-zA-Z0-9._-]+$`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param negateDestination The NegateDestination param. Default: `false`.
         * 
         * @return builder
         * 
         */
        public Builder negateDestination(@Nullable Output<Boolean> negateDestination) {
            $.negateDestination = negateDestination;
            return this;
        }

        /**
         * @param negateDestination The NegateDestination param. Default: `false`.
         * 
         * @return builder
         * 
         */
        public Builder negateDestination(Boolean negateDestination) {
            return negateDestination(Output.of(negateDestination));
        }

        /**
         * @param negateSource The NegateSource param. Default: `false`.
         * 
         * @return builder
         * 
         */
        public Builder negateSource(@Nullable Output<Boolean> negateSource) {
            $.negateSource = negateSource;
            return this;
        }

        /**
         * @param negateSource The NegateSource param. Default: `false`.
         * 
         * @return builder
         * 
         */
        public Builder negateSource(Boolean negateSource) {
            return negateSource(Output.of(negateSource));
        }

        /**
         * @param port The Port param. Value must be between 0 and 65535.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The Port param. Value must be between 0 and 65535.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
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
         * @param protocol The Protocol param. String must be one of these: `&#34;tcp&#34;`, `&#34;udp&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder protocol(@Nullable Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol The Protocol param. String must be one of these: `&#34;tcp&#34;`, `&#34;udp&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
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

        /**
         * @param sources The Sources param.
         * 
         * @return builder
         * 
         */
        public Builder sources(@Nullable Output<List<String>> sources) {
            $.sources = sources;
            return this;
        }

        /**
         * @param sources The Sources param.
         * 
         * @return builder
         * 
         */
        public Builder sources(List<String> sources) {
            return sources(Output.of(sources));
        }

        /**
         * @param sources The Sources param.
         * 
         * @return builder
         * 
         */
        public Builder sources(String... sources) {
            return sources(List.of(sources));
        }

        /**
         * @param tags The Tags param.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The Tags param.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags The Tags param.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        public Builder tfid(@Nullable Output<String> tfid) {
            $.tfid = tfid;
            return this;
        }

        public Builder tfid(String tfid) {
            return tfid(Output.of(tfid));
        }

        /**
         * @param tos The Tos param.
         * 
         * @return builder
         * 
         */
        public Builder tos(@Nullable Output<List<String>> tos) {
            $.tos = tos;
            return this;
        }

        /**
         * @param tos The Tos param.
         * 
         * @return builder
         * 
         */
        public Builder tos(List<String> tos) {
            return tos(Output.of(tos));
        }

        /**
         * @param tos The Tos param.
         * 
         * @return builder
         * 
         */
        public Builder tos(String... tos) {
            return tos(List.of(tos));
        }

        public AppOverrideRuleState build() {
            return $;
        }
    }

}